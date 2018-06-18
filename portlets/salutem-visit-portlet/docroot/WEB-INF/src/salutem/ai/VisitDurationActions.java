package salutem.ai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import salutem.doctor.model.Doctor;
import salutem.doctor.service.DoctorLocalServiceUtil;
import salutem.patient.model.Patient;
import salutem.patient.service.PatientLocalServiceUtil;
import salutem.visit.model.Time;
import salutem.visit.service.RegressionLocalServiceUtil;
import salutem.visit.service.TimeLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class VisitDurationActions extends MVCPortlet {

	public void updateRegressions(ActionRequest request, ActionResponse response) {
		
		System.out.println("Scheduler in action");
		List<Patient> patients = PatientLocalServiceUtil.getAllPatients();
		List<Doctor> doctors = DoctorLocalServiceUtil.getAllDoctors();
		
		for (Patient patient : patients) {
			for (Doctor doctor : doctors) {
				long doctorId = doctor.getDoctorId();
				long patientId = patient.getPatientId();
				List<Time> times = TimeLocalServiceUtil.getTimeByDoctorIdAndPatientId(doctorId, patientId);
				if (times.size() > 5) {
					// perform regression
					RegressionScheduler rs = new RegressionScheduler();
					rs.performRegression(times, patientId, doctorId);
					
				}
			}
		}
		Regressor regressor = new Regressor();
		List<List<Double>> trainingData;
		List<Double> training;
		List<List<Double>> inputData;
		List<Double> input;
		List<Double> finalWeights;
		
		
		/*// patient 1 old lady - always long 
		trainingData = new ArrayList<List<Double>>();
		training = Arrays.asList(new Double []{17.0, 1.0, 0.0, 18.0, 960.0, 30.0} );trainingData.add(training);
		training = Arrays.asList(new Double []{12.0, 5.0, 0.0, 17.0, 460.0, 25.0} );trainingData.add(training);
		training = Arrays.asList(new Double []{5.0, 4.0, 2.0, 17.0, 980.0, 27.0} );trainingData.add(training);
		training = Arrays.asList(new Double []{6.0, 1.0, 6.0, 18.0, 940.0, 28.0} );trainingData.add(training);
		training = Arrays.asList(new Double []{25.0, 6.0, 12.0, 15.0, 955.0, 30.0} );trainingData.add(training);
		training = Arrays.asList(new Double []{10.0, 1.0, 8.0, 16.0, 940.0, 32.0} );trainingData.add(training);

		inputData = new ArrayList<List<Double>>();
		input = Arrays.asList(new Double []{17.0, 1.0, 0.0, 18.0, 960.0} );inputData.add(input);
		input = Arrays.asList(new Double []{12.0, 5.0, 3.0, 18.0, 430.0} );inputData.add(input);
		input = Arrays.asList(new Double []{28.0, 2.0, 12.0, 18.0, 980.0} );inputData.add(input);
		
		finalWeights = regressor.conductRegression(trainingData, inputData);
		System.out.println("PATIENT 1: always long");
		for (Double d : finalWeights) {
			System.out.print(d + " ");
		}
		System.out.println();
		
		// patient 2 always busy in the morning, talkative in the afternoon
		trainingData = new ArrayList<List<Double>>();
		training = Arrays.asList(new Double []{12.0, 2.0, 2.0, 18.0, 960.0, 20.0} );trainingData.add(training);
		training = Arrays.asList(new Double []{14.0, 1.0, 5.0, 18.0, 460.0, 8.0} );trainingData.add(training);
		training = Arrays.asList(new Double []{23.0, 5.0, 0.0, 16.0, 980.0, 18.0} );trainingData.add(training);
		training = Arrays.asList(new Double []{25.0, 2.0, 5.0, 14.0, 420.0, 7.0} );trainingData.add(training);
		training = Arrays.asList(new Double []{26.0, 5.0, 11.0, 18.0, 955.0, 18.0} );trainingData.add(training);
		training = Arrays.asList(new Double []{27.0, 6.0, 12.0, 17.0, 940.0, 19.0} );trainingData.add(training);
		training = Arrays.asList(new Double []{28.0, 0.0, 8.0, 16.0, 440.0, 6.0} );trainingData.add(training);
		training = Arrays.asList(new Double []{29.0, 5.0, 7.0, 15.0, 450.0, 8.0} );trainingData.add(training);
		training = Arrays.asList(new Double []{1.0, 1.0, 5.0, 17.0, 420.0, 9.0} );trainingData.add(training);
		
		
		inputData = new ArrayList<List<Double>>();
		input = Arrays.asList(new Double []{17.0, 1.0, 0.0, 18.0, 500.0} );inputData.add(input);
		input = Arrays.asList(new Double []{12.0, 5.0, 3.0, 18.0, 430.0} );inputData.add(input);
		input = Arrays.asList(new Double []{28.0, 2.0, 12.0, 18.0, 980.0} );inputData.add(input);
		
		finalWeights = regressor.conductRegression(trainingData, inputData);
		System.out.println("PATIENT 1: long in the morning");
		for (Double d : finalWeights) {
			System.out.print(d + " ");
		}
		System.out.println();
		*/
		// patient 3 alergic to citruses
		/*trainingData = new ArrayList<List<Double>>();
		training = Arrays.asList(new Double []{25.0, 2.0, 12.0, 17.0, 860.0, 30.0} );trainingData.add(training);
		training = Arrays.asList(new Double []{22.0, 3.0, 11.0, 18.0, 840.0, 28.0} );trainingData.add(training);
		training = Arrays.asList(new Double []{22.0, 5.0, 12.0, 19.0, 800.0, 32.0} );trainingData.add(training);
		training = Arrays.asList(new Double []{28.0, 7.0, 11.0, 18.0, 800.0, 28.0} );trainingData.add(training);
		training = Arrays.asList(new Double []{28.0, 6.0, 8.0, 16.0, 885.0, 10.0} );trainingData.add(training);
		training = Arrays.asList(new Double []{15.0, 2.0, 7.0, 18.0, 920.0, 8.0} );trainingData.add(training);
		training = Arrays.asList(new Double []{23.0, 5.0, 6.0, 14.0, 860.0, 7.0} );trainingData.add(training);
		training = Arrays.asList(new Double []{28.0, 10.0, 4.0, 15.0, 860.0, 10.0} );trainingData.add(training);
		training = Arrays.asList(new Double []{30.0, 8.0, 2.0, 18.0, 880.0, 13.0} );trainingData.add(training);
		training = Arrays.asList(new Double []{15.0, 12.0, 0.0, 16.0, 850.0, 12.0} );trainingData.add(training);
		
		inputData = new ArrayList<List<Double>>();
		input = Arrays.asList(new Double []{7.0, 1.0, 12.0, 18.0, 560.0} );inputData.add(input);
		input = Arrays.asList(new Double []{22.0, 2.0, 10.0, 18.0, 830.0} );inputData.add(input);
		input = Arrays.asList(new Double []{8.0, 3.0, 2.0, 18.0, 680.0} );inputData.add(input);
		
		finalWeights = regressor.conductRegression(trainingData, inputData);
		System.out.println("PATIENT 3: long at the end of the year");
		for (Double d : finalWeights) {
			System.out.print(d + " ");
		}
		System.out.println();
		/*
		// patient 4 young student with hyperpressure 
		trainingData = new ArrayList<List<Double>>();
		training = Arrays.asList(new Double []{13.0, 2.0, 12.0, 18.0, 460.0, 8.0} );trainingData.add(training);
		training = Arrays.asList(new Double []{22.0, 5.0, 5.0, 18.0, 560.0, 7.0} );trainingData.add(training);
		training = Arrays.asList(new Double []{31.0, 6.0, 3.0, 16.0, 860.0, 5.0} );trainingData.add(training);
		training = Arrays.asList(new Double []{3.0, 7.0, 8.0, 16.0, 950.0, 8.0} );trainingData.add(training);
		training = Arrays.asList(new Double []{5.0, 5.0, 2.0, 15.0, 955.0, 7.0} );trainingData.add(training);
		training = Arrays.asList(new Double []{25.0, 5.0, 11.0, 18.0, 860.0, 6.0} );trainingData.add(training);
		training = Arrays.asList(new Double []{2.0, 1.0, 9.0, 15.0, 520.0, 8.0} );trainingData.add(training);
		
		inputData = new ArrayList<List<Double>>();
		input = Arrays.asList(new Double []{15.0, 3.0, 8.0, 18.0, 560.0} );inputData.add(input);
		input = Arrays.asList(new Double []{1.0, 2.0, 5.0, 18.0, 830.0} );inputData.add(input);
		input = Arrays.asList(new Double []{22.0, 5.0, 1.0, 18.0, 780.0} );inputData.add(input);
	
		finalWeights = regressor.conductRegression(trainingData, inputData);
		System.out.println("PATIENT 4: always short");
		for (Double d : finalWeights) {
			System.out.print(d + " ");
		}
		System.out.println();
		
		
		try {
			//RegressionLocalServiceUtil.addRegressionWeights(201, 102, finalWeights);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		*/
	}
	
public void updatekNN(ActionRequest request, ActionResponse response) {
		
		System.out.println("Scheduler in action");
		List<Patient> patients = PatientLocalServiceUtil.getAllPatients();
		
		for (Patient patient : patients) {
			ClassificationScheduler.performClassification(patient.getPatientId(), patients);
		}
		
	}
}
