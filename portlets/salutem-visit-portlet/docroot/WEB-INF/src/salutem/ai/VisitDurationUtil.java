package salutem.ai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import salutem.visit.model.Classification;
import salutem.visit.model.ClassificationSimilarity;
import salutem.visit.model.Regression;
import salutem.visit.model.Time;
import salutem.visit.model.WeightMap;
import salutem.visit.service.ClassificationLocalServiceUtil;
import salutem.visit.service.RegressionLocalServiceUtil;
import salutem.visit.service.TimeLocalServiceUtil;
import salutem.visit.service.VisitLocalServiceUtil;
import salutem.visit.service.impl.ClassificationLocalServiceImpl;
import salutem.visit.service.impl.VisitLocalServiceImpl;

public class VisitDurationUtil {
	public static int getVisitDuration(long doctorId, long patientId, Date visitDate, int minutes) {
		Regression regression = RegressionLocalServiceUtil.getRegression(patientId, doctorId);
		int numberOfRegisteredVisits = TimeLocalServiceUtil.getTimeByDoctorIdAndPatientId(doctorId, patientId).size();
		Classification classification = ClassificationLocalServiceUtil.getClassificationByPatientId(patientId);
		if (regression == null) {
			return 15;
		} else {
			List<WeightMap> weightMaps = RegressionLocalServiceUtil.getWeightMaps(regression.getRegressionId());
			Regressor regressor = new Regressor();
			
			// get description HashMap
			HashMap<List<Integer>, Double> descriptionHashMap = new HashMap<List<Integer>, Double>();
			for (WeightMap map : weightMaps) {
				String keyString = map.getKey();
				Double value = map.getValue();
				List<String> keyS = Arrays.asList(keyString.split(","));
				List<Integer> key = new ArrayList<Integer>();
				for (String k : keyS) {
					if (!k.equals("")) {
						key.add(Integer.valueOf(k));
					}
				}
				descriptionHashMap.put(key, value);
			}
			// get min and max list
			String[] maxListString = regression.getMaximumList().split(",");
			List<Double> maximumListTraining = new ArrayList<Double>();
			for (String max : maxListString) {
				if (!max.equals("")) {
					maximumListTraining.add(Double.valueOf(max));
				}
			}
			String[] minListString = regression.getMinimumList().split(",");
			List<Double> minimumListTraining = new ArrayList<Double>();
			for (String min : minListString) {
				if (!min.equals("")) {
					minimumListTraining.add(Double.valueOf(min));
				}
			}
			// get input data
			List<Double> input = new ArrayList<Double>();
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(visitDate);
			
			input.add(Double.valueOf(calendar.get(Calendar.DAY_OF_MONTH)));
			input.add(Double.valueOf(calendar.get(Calendar.MONTH)));
			input.add(Double.valueOf(minutes));
			
			List<List<Double>> inputData = new ArrayList<List<Double>>();
			inputData.add(input);
			
			// get chosen K
			int chosenK = regression.getChosenK();
			List<Double> output = regressor.getOutput(descriptionHashMap, inputData, minimumListTraining, maximumListTraining, chosenK);
			int regressionResult = (int)Math.abs(output.get(0));
			regressionResult = (regressionResult < 5)? 5 : regressionResult;
			if (classification == null) return regressionResult;
			else {
				List<ClassificationSimilarity> similarities = ClassificationLocalServiceUtil.getSimilaritiesByClassificationId(classification.getClassificationId());
				double classificationResult = 0;
				double divisor = 0;
				for (ClassificationSimilarity similarity : similarities) {
					long classPatientId = similarity.getPatientId();
					double simiarityVal = similarity.getSimilarity();
					int meanTime = getMeanVisitDuration(doctorId, classPatientId);
					
					classificationResult += simiarityVal * meanTime;
					System.out.println(meanTime + " " + simiarityVal);
					divisor += simiarityVal;
				}
				classificationResult /=  divisor;
				
				double mean = getMeanVisitDuration(doctorId, patientId);
				double mse = (Math.pow(((double)mean - (double)regressionResult), 2.0));
				if (mse > 100) regressionResult = (int)Math.round(classificationResult);
				double finalResult = classificationResult + regressionResult;
				System.out.println("REGRESS " + regressionResult + " CLASSS " + classificationResult);
				if (numberOfRegisteredVisits < 10) {
					return (int)Math.round(finalResult / 2);
				} else if (numberOfRegisteredVisits >= 11 && numberOfRegisteredVisits < 20) {
					finalResult = 0.4 * classificationResult + 0.6 * regressionResult;
					return (int)Math.round(finalResult);
				} else {
					finalResult = 0.2 * classificationResult + 0.8 * regressionResult;
					return (int)Math.round(finalResult);
				}
			}
		}
	}
	public static int getMeanVisitDuration(long doctorId, long patientId) {
		List<Time> times = TimeLocalServiceUtil.getTimeByDoctorIdAndPatientId(doctorId, patientId);
		if (times.size() < 2) {
			return 15;
		} else {
			int sum = 0;
			int i = 0;
			for (Time time : times) {
				if (time.isWasFinished()) {
					i++;
					sum += time.getVisitDuration();
				}
			}
			return (sum / i);
		}
	}
}
