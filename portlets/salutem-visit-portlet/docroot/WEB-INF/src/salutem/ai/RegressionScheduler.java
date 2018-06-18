package salutem.ai;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import salutem.doctor.model.Doctor;
import salutem.doctor.service.DoctorLocalServiceUtil;
import salutem.patient.model.Patient;
import salutem.patient.service.PatientLocalServiceUtil;
import salutem.visit.model.Time;
import salutem.visit.service.RegressionLocalServiceUtil;
import salutem.visit.service.TimeLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageListener;
import com.liferay.portal.kernel.messaging.MessageListenerException;

public class RegressionScheduler  implements MessageListener {
	
	@Override
	public void receive(Message message) throws MessageListenerException {
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
					System.out.println("performing regression for patient" + patientId + " doctor: " + doctorId);
					performRegression(times, patientId, doctorId);
					
				}
			}
		}
	}
	
	public void performRegression(List<Time> times, long patientId, long doctorId) {
		// get training data
		List<List<Double>> trainingData = new ArrayList<List<Double>>();
		for (Time time : times) {
			if (time.getWasFinished()) {
				List<Double> training = new ArrayList<Double>();
				training.add(Double.valueOf(time.getVisitDay()));
				training.add(Double.valueOf(time.getVisitMonth()));
				training.add(Double.valueOf(time.getVisitTime()));
				//output
				training.add(Double.valueOf(time.getVisitDuration()));
				trainingData.add(training);
			}
		}
		
		
		Regressor regressor = new Regressor();
		
		RegressionObj regressionObj = regressor.conductRegression(trainingData);
		
		//save min max
		System.out.println("min max");
		System.out.println(regressionObj.getMinimumListTraining().size());
		System.out.println(regressionObj.getMaximumListTraining().size());
		try {
			RegressionLocalServiceUtil.addRegressionWeights(patientId, doctorId,
					regressionObj.getMinimumListTraining(), regressionObj.getMaximumListTraining(),
					regressionObj.getPolynomial(), regressionObj.getChosenK());
		} catch (SystemException e) {
			e.printStackTrace();
		}
		
	}
}
