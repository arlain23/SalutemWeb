package salutem.ai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import salutem.patient.model.Patient;
import salutem.patient.service.PatientLocalServiceUtil;
import salutem.visit.service.TimeLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

public class kNNClasifier {

	public static List<kNNObj> findKMostSimilarPatients(long patientId, List<Patient> patientsToCompare, int k) throws PortalException, SystemException {
		List<kNNObj> kMostSimilarPatients = new ArrayList<kNNObj>();
		//patient data
		Patient mainPatient = PatientLocalServiceUtil.getPatient(patientId);
		int isMale = mainPatient.getSex().equals("M") ? 1 : 0;
		int age = getDiffYears(new Date(), mainPatient.getBirthDate());
		int numberOfVisitsPerYear = TimeLocalServiceUtil.getTimesByPatientId(patientId).size();
		// check similarity of each patient
		
		List<kNNObj> allPatients = new ArrayList<kNNObj>();
		for (Patient patient : patientsToCompare) {
			if (patient.getPatientId() != patientId) {
				int curIsMale = patient.getSex().equals("M") ? 1 : 0;
				int curAge = getDiffYears(new Date(), patient.getBirthDate());
				int curNumberOfVisitsPerYear = TimeLocalServiceUtil.getTimesByPatientId(patient.getPatientId()).size();
				double similarity = calculatePatientSimilarity(isMale, age, numberOfVisitsPerYear, curIsMale, curAge, curNumberOfVisitsPerYear);
				similarity = 1000 - similarity;
				double meanTime = TimeLocalServiceUtil.getMeanTime(patientId);
				
				kNNObj patientObj = new kNNObj(patient.getPatientId(), similarity, meanTime);
				allPatients.add(patientObj);
			}
		}
		
		// get k most similar patients 
		Collections.sort(allPatients, Collections.reverseOrder());
		kMostSimilarPatients = allPatients.subList(0, k);
		return kMostSimilarPatients;
	}
	private static int getDiffYears(Date first, Date last) {
	    Calendar a = getCalendar(first);
	    Calendar b = getCalendar(last);
	    int diff = b.get(Calendar.YEAR) - a.get(Calendar.YEAR);
	    if (a.get(Calendar.MONTH) > b.get(Calendar.MONTH) || 
	        (a.get(Calendar.MONTH) == b.get(Calendar.MONTH) && a.get(Calendar.DATE) > b.get(Calendar.DATE))) {
	        diff--;
	    }
	    return diff;
	}

	private static Calendar getCalendar(Date date) {
	    Calendar cal = Calendar.getInstance();
	    cal.setTime(date);
	    return cal;
	}
	
	private static Double calculatePatientSimilarity(int isMale, int age, int numberOfVisitsPerYear, 
			int curIsMale, int curAge, int curNumberOfVisitsPerYear ) {
		List<Integer> referenceValues = Arrays.asList(new Integer [] {isMale, age, numberOfVisitsPerYear});
		List<Integer> values = Arrays.asList(new Integer [] {curIsMale, curAge, curNumberOfVisitsPerYear});
		
		return MSE(referenceValues, values);
	}
	private static Double MSE(List<Integer> referenceValues, List<Integer> values) {
		Double sum = 0.0;
		for (int i = 0; i < referenceValues.size(); i++) {
			sum += Math.pow(((double)values.get(i) - (double)referenceValues.get(i)), 2.0);

		}
		return sum / (double)referenceValues.size();
	}
}
