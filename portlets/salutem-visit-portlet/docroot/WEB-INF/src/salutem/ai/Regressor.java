package salutem.ai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Regressor {
	private  int MAX_K = 10;
	private  int NUMBER_OF_SPLITS = 4;
	public  double TRAINING_STEP = 0.05;
	public  double ACCEPTED_DIFFERENCE = 10e-5;
	public  int NUMBER_OF_ITERATIONS = 100000;
	
	private  List<List<Double>> generatedPolynomialDescription = new ArrayList<List<Double>>();
	
	
	public List<Double> getOutput(HashMap<List<Integer>, Double> descriptionHashMap, List<List<Double>> inputData,  List<Double> minimumListTraining, List<Double> maximumListTraining, int chosenK) {
		List<List<Double>> allData = new ArrayList<List<Double>> ();
		allData.addAll(inputData);
		
		List<List<Double>> scaledInputData = scaleTrainingData(inputData, maximumListTraining, minimumListTraining);
		
		List<List<Double>> descriptionChosenK = generateDescription(inputData.get(0).size(), chosenK);
		HashMap<List<Integer>,Double> descriptionHashMapChosenK = prepareDescriptionHashMap(descriptionChosenK);
		
		//transform input data 
		List<List<Double>> transformedFinalInputs = transformInput(scaledInputData, descriptionHashMapChosenK);
				
		//get scaled output
		List<Double> scaledOutput = new ArrayList<Double>();
		for (List<Double> inputList : transformedFinalInputs) {
			double calculatedOutput = calculatePolynomialOutput(descriptionHashMap, inputList);
			scaledOutput.add(calculatedOutput);
		}
		return scaledOutput;
		
	}
	public RegressionObj conductRegression(List<List<Double>> trainingData ) {
				
		System.out.println("number of traing " + trainingData.get(0).size());
		List<List<Double>> trainingDataWithoutOutput = new ArrayList<List<Double>>();
		trainingDataWithoutOutput = shallowCopyListListDouble(trainingData, trainingDataWithoutOutput);
				
		for (List<Double> trainingRow : trainingDataWithoutOutput) {
			trainingRow.remove(trainingRow.get(trainingRow.size() - 1));
		}
				
		// scale training and input data
		List<List<Double>> allData = new ArrayList<List<Double>> ();
		
		allData.addAll(trainingDataWithoutOutput);
		
		List<List<Double>> foundMinMax = findMinAndMaxForTraining(allData);
		List<Double> minimumListTraining = foundMinMax.get(0);
		List<Double> maximumListTraining = foundMinMax.get(1);
		
		List<List<Double>> scaledTrainingDataWithoutOutput = scaleTrainingData(trainingDataWithoutOutput, maximumListTraining, minimumListTraining);
		
		
		List<List<Double>> scaledTrainingData = new ArrayList<List<Double>>();
		scaledTrainingData = shallowCopyListListDouble(scaledTrainingDataWithoutOutput, scaledTrainingData);
		
		int outputIndex = trainingData.get(0).size() - 1;
		for (int i = 0; i < scaledTrainingData.size(); i++) {
			List<Double> trainingRow = scaledTrainingData.get(i);
			trainingRow.add(trainingData.get(i).get(outputIndex));
		}
		
		// make splits
		List<List<List<List<Double>>>> outputHolder = makeSplitsMFold(scaledTrainingData);
		
		List<List<List<Double>>> trainingSets = outputHolder.get(0);
		List<List<List<Double>>> validationSets = outputHolder.get(1);	
				
		// train loop:
		List<List<Double>> evaluationList = new ArrayList<List<Double>>();
		List<List<Double>> evaluationList2 = new ArrayList<List<Double>>();
		for (int k = 1; k <= MAX_K; k++ ) {
			
			// generate polynomial k = i, n = number of inputs
			List<List<Double>> initialDescription = generateDescription(trainingSets.get(0).get(0).size() - 1, k);
			HashMap<List<Integer>,Double> initialDescriptionHashMap = prepareDescriptionHashMap(initialDescription);
			
			HashMap<List<Integer>,Double> descriptionHashMapToTrain = new HashMap<List<Integer>,Double>(); 
			List<Double> mseList = new ArrayList<Double>();
			mseList.add(Double.valueOf(k));
			List<Double> mseList2 = new ArrayList<Double>();
			mseList2.add(Double.valueOf(k));
			for (int i = 0; i < NUMBER_OF_SPLITS; i++) {
				List<List<Double>> currentTrainingSet = trainingSets.get(i);
				List<List<Double>> currentValidationSet = validationSets.get(i);
				
				// transform inputs to k = 1, n = more than number of inputs
				List<List<Double>> transformedCurrentTrainingSet = transformTrainingInput(currentTrainingSet, initialDescriptionHashMap);
				List<List<Double>> transformedCurrentValidationSet = transformTrainingInput(currentValidationSet, initialDescriptionHashMap);
				
				// add outputs to training and validation set
				List<List<Double>> transformedTrainingSetPlusOutput = new ArrayList<List<Double>>();
				List<List<Double>> transformedValidationSetPlusOutput = new ArrayList<List<Double>>();
				
				transformedTrainingSetPlusOutput = shallowCopyListListDouble(transformedCurrentTrainingSet, transformedTrainingSetPlusOutput);
				transformedValidationSetPlusOutput = shallowCopyListListDouble(transformedCurrentValidationSet, transformedValidationSetPlusOutput);
				
				int lastIndex = currentTrainingSet.get(0).size() - 1;

				for (int j = 0; j < transformedTrainingSetPlusOutput.size(); j++) {
					List<Double> singleTrainingInputs = transformedTrainingSetPlusOutput.get(j);
					singleTrainingInputs.add(currentTrainingSet.get(j).get(lastIndex));
				}
				
				for (int j = 0; j < transformedValidationSetPlusOutput.size(); j++) {
					List<Double> singleTrainingInputs = transformedValidationSetPlusOutput.get(j);
					singleTrainingInputs.add(currentValidationSet.get(j).get(lastIndex));
				}
				
				if (i == 0) {
				// generate polynomial k = 1, n like above
					List<List<Double>> descriptionKOne = generateDescription(transformedCurrentTrainingSet.get(0).size(), 1);
					descriptionHashMapToTrain = prepareDescriptionHashMap(descriptionKOne);
				}
				// train polynomial with training data
				 HashMap<List<Integer>,Double> trainedDescriptionHashMap = trainPolynomialReduced(transformedTrainingSetPlusOutput, descriptionHashMapToTrain);

				
				// validate with validation data
				double mse = evaluateSets(transformedValidationSetPlusOutput, trainedDescriptionHashMap);
				double mse2 = evaluateSets(transformedTrainingSetPlusOutput, trainedDescriptionHashMap);
				mseList.add(mse);
				mseList2.add(mse2);
			}
			// save MSE
			
			evaluationList.add(mseList);
			evaluationList2.add(mseList2);
		}	
				
		// choose K
		Double chosenK = getOptimalHyperParameter(evaluationList);
		System.out.println("chosen K "  + chosenK);
		int chosenKInt = Math.round(chosenK.floatValue());
		//chosenKInt = 2;
		// generate description with chosen K	
		List<List<Double>> descriptionChosenK = generateDescription(scaledTrainingData.get(0).size() - 1, chosenKInt);
		HashMap<List<Integer>,Double> descriptionHashMapChosenK = prepareDescriptionHashMap(descriptionChosenK);
		
		// transform training data to fit k = 1
		List<List<Double>> transformedFinalTrainingSet = transformTrainingInput(scaledTrainingData, descriptionHashMapChosenK);
		
		// add output to transformed training set
		List<List<Double>> transformedFinalTrainingSetPlusOutput = new ArrayList<List<Double>>();
		
		transformedFinalTrainingSetPlusOutput = shallowCopyListListDouble(transformedFinalTrainingSet, transformedFinalTrainingSetPlusOutput);
		
		int lastIndex = scaledTrainingData.get(0).size() - 1;

		for (int j = 0; j < transformedFinalTrainingSetPlusOutput.size(); j++) {
			List<Double> singleTrainingInputs = transformedFinalTrainingSetPlusOutput.get(j);
			singleTrainingInputs.add(scaledTrainingData.get(j).get(lastIndex));
		}
		
		// generate description with k = 1 and given n 	
		List<List<Double>> finalDescription = generateDescription(transformedFinalTrainingSet.get(0).size(), 1);
		
		HashMap<List<Integer>,Double> descriptionHashMapKOne = prepareDescriptionHashMap(finalDescription);

		// train with data for chosen K and all training set
		System.out.println("number of traing " + scaledTrainingData.get(0).size());
		HashMap<List<Integer>,Double> finalDescriptionHashMap = trainPolynomialExhaustive(transformedFinalTrainingSetPlusOutput, descriptionHashMapKOne);	
		
		RegressionObj obj = new RegressionObj(finalDescriptionHashMap, minimumListTraining, maximumListTraining,chosenKInt);
		return obj;
	}
		
	private  double getOptimalHyperParameter(List<List<Double>> evaluationList) {
		List<Double> qualityAverageValues = new ArrayList<Double>();
		for (int i = 0; i < evaluationList.size(); i++) {
			List<Double> qualityValues = evaluationList.get(i);
			double sum = 0.0;
			for (int j = 1; j < qualityValues.size(); j++) {
				sum += qualityValues.get(j);
			}
			qualityAverageValues.add(sum / ((double) qualityValues.size() - 1.0));
			
		}
		int minimumIndex = 0;
		double minValue = qualityAverageValues.get(0);
		for (int i = 0; i < qualityAverageValues.size(); i++) {
			if (qualityAverageValues.get(i) < minValue) {
				minimumIndex = i;
				minValue = qualityAverageValues.get(i);
			}
		}
		return evaluationList.get(minimumIndex).get(0);
	}

	private  double evaluateSets(List<List<Double>> currentValidationSet, HashMap<List<Integer>, Double> descritionHashMap) {
		
		List<Double> expectedOutputs = new ArrayList<Double>() ;
		List<Double> calculatedOutputs = new ArrayList<Double>() ;
		
		for (List<Double> singleTrainingLine : currentValidationSet) {
			calculatedOutputs.add(calculatePolynomialOutput(descritionHashMap, singleTrainingLine));
			expectedOutputs.add(singleTrainingLine.get(singleTrainingLine.size() - 1));
			//System.out.println(singleTrainingLine.get(singleTrainingLine.size() - 1) + "->" + calculatePolynomialOutput(descritionHashMap, singleTrainingLine));
		}
		return MSE(expectedOutputs, calculatedOutputs);
	}
			
	private  double MSE(List<Double> expectedOutputs, List<Double> calculatedOutputs) {
		double sum = 0.0;
		for (int i = 0; i < expectedOutputs.size(); i++) {
			sum += Math.pow((calculatedOutputs.get(i) - expectedOutputs.get(i)), 2);

		}
		return sum / (double)expectedOutputs.size();
	}
			
			
	private  HashMap<List<Integer>, Double> trainPolynomialReduced(List<List<Double>> currentTrainingSet,
			HashMap<List<Integer>, Double> initParameterMap) {
		
		HashMap<List<Integer>, Double> parameterMap = new HashMap<List<Integer>,Double>();
		parameterMap = shallowCopyHashMap(initParameterMap, parameterMap);
		
		List<List<Integer>> keySet = prepareKeySet(parameterMap);
		int iterationIndex = 0;
		boolean isEnd = false;
		int numberOfTrainingSets = currentTrainingSet.size();
		
		//printListList(currentTrainingSet);
		//divide outputs and inputs into two lists
		List<Double> trainingOutput = new ArrayList<Double>();
		List<List<Double>> trainingDataInput = new ArrayList<List<Double>> ();
		trainingDataInput = shallowCopyListListDouble(currentTrainingSet, trainingDataInput);
		for (List<Double> trainingRow : trainingDataInput) {
			trainingOutput.add(trainingRow.get(trainingRow.size() - 1));
			trainingRow.remove(trainingRow.size() - 1);
		}
		
		List<Double> previousGradientValues = new ArrayList<Double>();
		inicialiseWithInfinity(previousGradientValues, keySet.size());
		
		
		while (!isEnd && iterationIndex < NUMBER_OF_ITERATIONS) {
			List<Double> gradientValues = new ArrayList<Double>();
			inicialiseWithZeros(gradientValues, keySet.size());
			
			for (int i = 0; i < numberOfTrainingSets; i++) {
				List<Double> inputs = trainingDataInput.get(i);
				double realOutput = calculatePolynomialOutput(parameterMap, inputs);
				double expectedOutput = trainingOutput.get(i);
				for (int p = 0; p < keySet.size(); p++) {
					List<Integer> key = keySet.get(p);
					double gradientValue = gradientValues.get(p);
					gradientValue += (realOutput - expectedOutput) * getInputValue(key, inputs);
					gradientValues.set(p, gradientValue);
				}
			}
			isEnd = true;
			for (int p = 0; p < keySet.size(); p++) {

				double previousParamValue = parameterMap.get(keySet.get(p));
				double newParamValue = 	previousParamValue - (TRAINING_STEP * gradientValues.get(p)) / numberOfTrainingSets;
				parameterMap.put(keySet.get(p), newParamValue);
				if (Math.abs(gradientValues.get(p) / numberOfTrainingSets) > ACCEPTED_DIFFERENCE) {
					isEnd = false;
				}
			}
			
			previousGradientValues = shallowCopyListDouble(gradientValues, previousGradientValues);
			iterationIndex++;
		}
		return parameterMap;
		
		
	}
			
	private  HashMap<List<Integer>, Double> trainPolynomialExhaustive(List<List<Double>> currentTrainingSet,
			HashMap<List<Integer>, Double> initParameterMap) {
	
		HashMap<List<Integer>, Double> parameterMap = new HashMap<List<Integer>,Double>();
		parameterMap = shallowCopyHashMap(initParameterMap, parameterMap);
		
		List<List<Integer>> keySet = prepareKeySet(parameterMap);
		int iterationIndex = 0;
		boolean isEnd = false;
		int numberOfTrainingSets = currentTrainingSet.size();
		
		//divide outputs and inputs into two lists
		List<Double> trainingOutput = new ArrayList<Double>();
		List<List<Double>> trainingDataInput = new ArrayList<List<Double>> ();
		trainingDataInput = shallowCopyListListDouble(currentTrainingSet, trainingDataInput);
		for (List<Double> trainingRow : trainingDataInput) {
			trainingOutput.add(trainingRow.get(trainingRow.size() - 1));
			trainingRow.remove(trainingRow.size() - 1);
		}
		
		List<Double> previousGradientValues = new ArrayList<Double>();
		inicialiseWithInfinity(previousGradientValues, keySet.size());
		
		List<Double> gradientValues;
		List<Double> inputs;
		int i, p;
		double realOutput;
		double expectedOutput;
		double outputDifference;
		List<Integer> key;
		double gradientValue;
		double newParamValue;
		while (!isEnd && iterationIndex < NUMBER_OF_ITERATIONS) {
			
			gradientValues = new ArrayList<Double> ();
			inicialiseWithZeros(gradientValues, keySet.size());

			for (i = 0; i < numberOfTrainingSets; i++) {
				inputs = trainingDataInput.get(i);
				realOutput = calculatePolynomialOutput(parameterMap, inputs);
				expectedOutput = trainingOutput.get(i);
				outputDifference = (realOutput - expectedOutput);
				for (p = 0; p < keySet.size(); p++) {
					key = keySet.get(p);
					gradientValue = gradientValues.get(p);
					gradientValue += outputDifference * getInputValue(key, inputs);
					gradientValues.set(p, gradientValue);
				}
			}
			isEnd = true;
			for (p = 0; p < keySet.size(); p++) {
				newParamValue = parameterMap.get(keySet.get(p)) - (TRAINING_STEP * gradientValues.get(p)) / numberOfTrainingSets;
				parameterMap.put(keySet.get(p), newParamValue);
				if (Math.abs(gradientValues.get(p) / numberOfTrainingSets) > ACCEPTED_DIFFERENCE) {
					isEnd = false;
				}
			}
			
			previousGradientValues = shallowCopyListDouble(gradientValues, previousGradientValues);
			iterationIndex++;
		}
		return parameterMap;
		
	}
			

	private  List<List<Integer>> prepareKeySet(HashMap<List<Integer>, Double> parameterMap) {
		List<List<Integer>> keySet = new ArrayList<List<Integer>>();
		for (List<Integer> mapKey : parameterMap.keySet()) {
			List<Integer> key = new ArrayList<Integer>();
			key = shallowCopyListInteger(mapKey, key);
			keySet.add(key);
		}
		
		
		// sort the results in a single line
		for (int i = keySet.size() - 1; i >= 0; i--) {
			List <Integer> indeces = keySet.get(i);
			Collections.sort(indeces, Collections.reverseOrder());
			keySet.set(i, indeces);
		}

		// sort the results in rows
		Collections.sort(keySet, new Comparator<List<Integer>>() {
			public int compare(List<Integer> first, List<Integer> second) {
				for (int i = 0; i < first.size(); i++) {
					if (first.get(i) != second.get(i)) {
						return second.get(i).compareTo(first.get(i));
					}
				}
				return second.get(1).compareTo(first.get(1));

			}
		});
				
		return keySet;
	}

	private  void inicialiseWithZeros(List<Double> gradientValues, int size) {
		for (int i = 0; i < size; i++) {
			gradientValues.add(0.0);
		}
		
	}
	private  void inicialiseWithInfinity(List<Double> previousGradientValues, int size) {
		for (int i = 0; i < size; i++) {
			previousGradientValues.add(Double.POSITIVE_INFINITY);
		}
		
	}

	private  double getInputValue(List<Integer> keyValue, List<Double> listOfInputs) {

		double inputValue = 1.0;
		for (int index : keyValue) {
			if (index != 0) {
				inputValue *= listOfInputs.get(index - 1);
			}
		}
		return inputValue;

	}
			
	private  HashMap<List<Integer>, Double> prepareDescriptionHashMap (List<List<Double>> generatedPolynomialDescription) {
		HashMap<List<Integer>, Double> descriptionHashMap = new HashMap<List<Integer>, Double>();
		
		for (List<Double> descriptionLine : generatedPolynomialDescription) {
			List <Integer> oneLineIndexes = new ArrayList<Integer>();
			for (int i = 0; i < descriptionLine.size() - 1; i++) {
				int index = Math.round(descriptionLine.get(i).floatValue());
				oneLineIndexes.add(index);
			}
			descriptionHashMap.put(oneLineIndexes, descriptionLine.get(descriptionLine.size() - 1));
			
		}
		return descriptionHashMap;
	}
			
	private  double calculatePolynomialOutput(HashMap<List<Integer>, Double> parameterMap, List<Double> listOfInputs) {
		Set<List<Integer>> keySet = parameterMap.keySet();
		double totalResult = 0.0;
		for (List<Integer> listOfIndexes : keySet) {
			double multiplicationResult = 1.0;
			for (int index : listOfIndexes) {
				if (index != 0) {
					multiplicationResult *= listOfInputs.get(index - 1);
				}
			}
			multiplicationResult *= parameterMap.get(listOfIndexes);
			totalResult += multiplicationResult;
		}
		return totalResult;
	}
			
	private  List<List<List<List<Double>>>> makeSplitsMFold(List<List<Double>> dataInput) {
		List<List<List<List<Double>>>> outputHolder = new ArrayList<List<List<List<Double>>>> ();
		
		List<List<Double>> trainingDataInput = new ArrayList<List<Double>>();
		trainingDataInput = shallowCopyListListDouble(dataInput, trainingDataInput);
		List<List<List<Double>>> validationSets = new ArrayList<List<List<Double>>>();
		List<List<List<Double>>> trainingSets = new ArrayList<List<List<Double>>>();
		int m = 4;
		
		Collections.shuffle(trainingDataInput);
		int blockSize = (int) (trainingDataInput.size() * 1/m);
		for (int splitIndex = 0; splitIndex < NUMBER_OF_SPLITS; splitIndex++) {
			int fromIndex = splitIndex * blockSize;
			int toIndex = (splitIndex + 1) * blockSize;
			
			if (toIndex > trainingDataInput.size()) toIndex = trainingDataInput.size();
			
			List<List<Double>> dataSet = new ArrayList<List<Double>>();
			dataSet = shallowCopyListListDouble(trainingDataInput, dataSet);
			
			List<List<Double>> trainingSet = new ArrayList<List<Double>>();
			List<List<Double>> validationSet = new ArrayList<List<Double>>();
			
			for (int i = fromIndex; i < toIndex; i++) {
				validationSet.add(dataSet.get(i));
			}
			
			for (int i = 0; i < fromIndex; i++) {
				trainingSet.add(dataSet.get(i));
			}
			for (int i = toIndex; i < dataSet.size(); i++) {
				trainingSet.add(dataSet.get(i));
			}
			
			validationSets.add(validationSet);
			trainingSets.add(trainingSet);
		}
		outputHolder.add(trainingSets);
		outputHolder.add(validationSets);
		return outputHolder;
		
	}
			
	private  List<List<Double>> transformInput(List<List<Double>> inputData, HashMap<List<Integer>, Double> descriptionHashMap) {
		
		List<List<Integer>> keyList = new ArrayList<List<Integer>>();
		
		for (List<Integer> key : descriptionHashMap.keySet()) {
			List<Integer> listKey = new ArrayList<Integer>();
			listKey = shallowCopyListInteger(key, listKey);
			boolean wasAllZeros = true;
			for (Integer i : listKey) {
				if (i != 0) wasAllZeros = false;
			}
			if (!wasAllZeros) {
				keyList.add(listKey);
			}
		}
			
		// sort the results in a single line
		for (int i = keyList.size() - 1; i >= 0; i--) {
			List <Integer> indeces = keyList.get(i);
			Collections.sort(indeces, Collections.reverseOrder());
			keyList.set(i, indeces);
		}

		// sort the results in rows
		Collections.sort(keyList, new Comparator<List<Integer>>() {
			public int compare(List<Integer> first, List<Integer> second) {
				for (int i = 0; i < first.size(); i++) {
					if (first.get(i) != second.get(i)) {
						return second.get(i).compareTo(first.get(i));
					}
				}
				return second.get(1).compareTo(first.get(1));

			}
		});
		List<List<Double>> transformedInput = new ArrayList<List<Double>> ();
		for (List<Double> singleInputRow : inputData) {
			List <Double> singleTransformedInputLine = new ArrayList <Double>();
			for (List<Integer> key : keyList) {
				double value = 1.0;
				for (Integer index : key) {
					if (index != 0) {
						value *= singleInputRow.get(index - 1);
					}
				}
				singleTransformedInputLine.add(value);
			}
			transformedInput.add(singleTransformedInputLine);

		}
		
		return transformedInput;
		
	}
			
	private  List<List<Double>> transformTrainingInput(final List<List<Double>> trainingData, HashMap<List<Integer>, Double> descriptionHashMap) {
		List<List<Double>> inputData = new ArrayList<List<Double>> ();
		inputData = shallowCopyListListDouble(trainingData, inputData);
		for (List<Double> si : inputData) {
			si.remove(si.size() - 1);
		}
		List<List<Double>> foo =  transformInput(inputData, descriptionHashMap);
		
		return foo;
	}
	
	private  List<List<Double>> generateDescription(int n, int k) {
		Integer[] outputLine = new Integer[k]; // array to store indices
												// of polynomial
		
		generatedPolynomialDescription.clear();
		// Call the recursive function
		preparePolynomialDescription(outputLine, 0, k, 0, n);

		// sort the results in a single line
		for (int i = generatedPolynomialDescription.size() - 1; i >= 0; i--) {
			List<Double> indeces = generatedPolynomialDescription.get(i);
			Collections.sort(indeces, Collections.reverseOrder());
			generatedPolynomialDescription.set(i, indeces);
		}

		// sort the results in rows

		Collections.sort(generatedPolynomialDescription, new Comparator<List<Double>>() {
			public int compare(List<Double> first, List<Double> second) {
				for (int i = 0; i < first.size(); i++) {
					if (first.get(i) != second.get(i)) {
						return first.get(i).compareTo(second.get(i));
					}
				}
				return first.get(1).compareTo(second.get(1));

			}
		});
		// set the parameter value
		Collections.reverse(generatedPolynomialDescription);
		for (int i = 0 ; i < generatedPolynomialDescription.size(); i++) {
			generatedPolynomialDescription.get(i).add(generateRandomNumber(-1, 1));
		}
		
		return generatedPolynomialDescription;

	}
	private void preparePolynomialDescription(Integer outputLine[], int currentDegree, int degree, int startDimenstion,
			int endDimenstion) {
		if (currentDegree == degree) {
			List<Double> tmp = new ArrayList<Double>();
			for (int i = 0; i < degree; i++) {
				tmp.add(Double.valueOf(outputLine[i]));
			}
			generatedPolynomialDescription.add(tmp);
		} else {
			// For all possible dimensions (indices of x's) make a recurensive
			// call
			for (int i = startDimenstion; i <= endDimenstion; i++) {
				outputLine[currentDegree] = i;
				preparePolynomialDescription(outputLine, currentDegree + 1, degree, i, endDimenstion);
				// i++ after recurention
			}
		}
	}
	private  double generateRandomNumber(double min, double max) {
		return (Math.random() * (max - min) + min);
	}
	private  List<List<Double>> scaleTrainingData(List<List<Double>> trainingDataInput, List<Double> maximumList, List<Double> minimumList) {
		List<List<Double>> scaledTrainingData = new ArrayList<List<Double>> ();
		for (List<Double> trainingLine : trainingDataInput) {
			List<Double> scaledTrainingLine = new ArrayList<Double>();
			for (int i = 0; i < trainingLine.size(); i++) {
				double scaledValue = trainingLine.get(i);
				scaledValue = (scaledValue - minimumList.get(i)) / (maximumList.get(i) - minimumList.get(i));
				scaledValue = (scaledValue * 2) - 1; 
				scaledTrainingLine.add(scaledValue);
			}
			scaledTrainingData.add(scaledTrainingLine);
		}
		return scaledTrainingData;
	}
			

	private  List<List<Double>> findMinAndMaxForTraining(List<List<Double>> trainingData) {
		
		List<List<Double>> minMaxHolder = new ArrayList<List<Double>>();
		
		List<Double> minimumListTraining = new ArrayList<Double>();
		List<Double> maximumListTraining = new ArrayList<Double>();
			
		// populate min and max lists with initial data
		minimumListTraining = shallowCopyListDouble(trainingData.get(0), minimumListTraining);
		maximumListTraining = shallowCopyListDouble(trainingData.get(0), maximumListTraining);;
		
		for (List<Double> lineArray : trainingData) {
			for (int j = 0; j < lineArray.size(); j++) {
				double val = Double.valueOf(lineArray.get(j));

				// update the minimum
				if (val < minimumListTraining.get(j)) {
					minimumListTraining.set(j, val);
				}

				// update the maximum
				if (val > maximumListTraining.get(j)) {
					maximumListTraining.set(j, val);
				}
			}
		}
		minMaxHolder.add(minimumListTraining);
		minMaxHolder.add(maximumListTraining);
		return minMaxHolder;
	}
	private  List<List<Double>> shallowCopyListListDouble(List<List<Double>> source, List<List<Double>> destination) {
		destination.clear();
		for (List<Double> singleLine : source) {
			List<Double> lineToInsert = new ArrayList<Double>();
			for(double singleValue : singleLine) {
				lineToInsert.add(singleValue);
			}
			destination.add(lineToInsert);
		}
		return destination;
	}
	private  List<Double> shallowCopyListDouble(List<Double> source, List<Double> destination) {
		destination.clear();
		for(double singleValue : source) {
			destination.add(singleValue);
		}
		return destination;
	}
	
	private  List<Integer> shallowCopyListInteger(List<Integer> source, List<Integer> destination) {
		destination.clear();
		for(Integer singleValue : source) {
			destination.add(singleValue);
		}
		return destination;
	}
	private  HashMap<List<Integer>, Double> shallowCopyHashMap(HashMap<List<Integer>, Double> source, HashMap<List<Integer>, Double> destination) {
		destination.clear();
		for (List<Integer> key : source.keySet()){
			List<Integer> newKey = new ArrayList<Integer>();
			newKey = shallowCopyListInteger(key, newKey);
			destination.put(newKey, source.get(key));
		}
		return destination;
	}
}
