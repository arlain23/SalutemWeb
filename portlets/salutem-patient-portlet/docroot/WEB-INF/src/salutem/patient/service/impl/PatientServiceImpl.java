/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package salutem.patient.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.model.Company;
import com.liferay.portal.model.Role;
import com.liferay.portal.model.User;
import com.liferay.portal.security.ac.AccessControlled;
import com.liferay.portal.service.CompanyLocalServiceUtil;
import com.liferay.portal.service.UserLocalServiceUtil;

import salutem.patient.model.Patient;
import salutem.patient.service.base.PatientServiceBaseImpl;

/**
 * The implementation of the patient remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link salutem.patient.service.PatientService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Aneta Andrzejewska
 * @see salutem.patient.service.base.PatientServiceBaseImpl
 * @see salutem.patient.service.PatientServiceUtil
 */
public class PatientServiceImpl extends PatientServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link salutem.patient.service.PatientServiceUtil} to access the patient remote service.
	 */
	
	@AccessControlled(guestAccessEnabled=true)
	public long getPatientIdentity(String pesel) {
		try {
			List<Patient> patients = patientPersistence.findByPESEL(pesel);
			if (patients.size() > 0) {
				return patients.get(0).getPatientId();
			}
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return -1;
	}
	@AccessControlled(guestAccessEnabled=true)
	public long getPatientIdentity(String firstName, String middleName, String surname) {
		try {
			List<Patient> patients = patientPersistence.findByFullName(firstName, middleName, surname);
			if (patients.size() > 0) {
				return patients.get(0).getPatientId();
			}
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return -1;
	}
	@AccessControlled(guestAccessEnabled=true)
	public JSONArray getAllPatients(long healthCentreId) {
		JSONArray result = JSONFactoryUtil.createJSONArray();
		try {
			List<Patient> allPatients = patientPersistence.findByGroupIdAndConfirmed(healthCentreId, true);
			for (Patient patient : allPatients) {
				try {
					User user = UserLocalServiceUtil.getUser(patient.getUserId());
					JSONObject patientObj = JSONFactoryUtil.createJSONObject();
					
					patientObj.put("ID", patient.getPatientId());
					patientObj.put("firstName", patient.getName());
					patientObj.put("middleName", patient.getMiddleName());
					patientObj.put("lastName", patient.getSurname());
					patientObj.put("email", user.getEmailAddress());
					patientObj.put("PESEL", patient.getPesel());
					patientObj.put("IDNumber", patient.getIdNumber());
					patientObj.put("gender", patient.getSex());
					patientObj.put("birthDate", patient.getBirthDate());
					patientObj.put("address", patient.getAddress());
					patientObj.put("cityName", patient.getCityName());
					
					result.put(patientObj);
				} catch (PortalException e) {
					e.printStackTrace();
				}
			}
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return result;
	}
}