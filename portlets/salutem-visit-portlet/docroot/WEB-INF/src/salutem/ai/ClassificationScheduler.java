package salutem.ai;

import java.util.List;

import salutem.patient.model.Patient;
import salutem.patient.service.PatientLocalServiceUtil;
import salutem.visit.model.Classification;
import salutem.visit.service.ClassificationLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageListener;
import com.liferay.portal.kernel.messaging.MessageListenerException;

public class ClassificationScheduler  implements MessageListener {
	@Override
	public void receive(Message message) throws MessageListenerException {
		System.out.println("Scheduler in action");
		List<Patient> patients = PatientLocalServiceUtil.getAllPatients();
		
		for (Patient patient : patients) {
			long patientId = patient.getPatientId();
			System.out.println("performing classification for patient" + patientId);
			performClassification(patientId, patients);
		}
	}
	
	public static void performClassification(long patientId, List<Patient> patientsToCompare ) {
		int k = 3;
		try {
			List<kNNObj> mostSimilarPatients = kNNClasifier.findKMostSimilarPatients(patientId, patientsToCompare, k);
			Classification addedClassification = ClassificationLocalServiceUtil.addClassification(patientId);
			long classificationId = addedClassification.getClassificationId();
			ClassificationLocalServiceUtil.removeSimilaritiesByClassificationId(classificationId);
			for (kNNObj similarPatient : mostSimilarPatients) {
				ClassificationLocalServiceUtil.addClassificationSimilarity(classificationId, 
						similarPatient.getPatientId(), similarPatient.getSimilarity());
			}
		} catch (PortalException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}
	}

}
