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

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

import salutem.patient.model.Patient;
import salutem.patient.service.base.PatientLocalServiceBaseImpl;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.mail.MailMessage;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.util.mail.MailEngine;
import com.liferay.util.mail.MailEngineException;

/**
 * The implementation of the patient local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link salutem.patient.service.PatientLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Aneta Andrzejewska
 * @see salutem.patient.service.base.PatientLocalServiceBaseImpl
 * @see salutem.patient.service.PatientLocalServiceUtil
 */
public class PatientLocalServiceImpl extends PatientLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link salutem.patient.service.PatientLocalServiceUtil} to access the patient local service.
	 */
	public List<Patient> getAllPatients() {
		try {
			return patientPersistence.findAll();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
		}
		return new ArrayList<Patient>();
	}
	public void sendEmail(long patientId, long sendingUserId, String body, String header) throws PortalException, SystemException {
		Patient patient = super.getPatient(patientId);
		User sendingUser = UserLocalServiceUtil.getUser(sendingUserId);
		User user = UserLocalServiceUtil.getUser(patient.getUserId());
		
		MailMessage mailMessage = new MailMessage();
		mailMessage.setHTMLFormat(true);
		mailMessage.setSubject(header);
		mailMessage.setBody(body);
		try {
			//mailMessage.setFrom(new InternetAddress(sendingUser.getEmailAddress(),"Salutem"));
			mailMessage.setFrom(new InternetAddress("joyav@loketa.com","Salutem"));
			mailMessage.setTo(new InternetAddress(user.getEmailAddress()));
			MailEngine.send(mailMessage);
		} catch (AddressException | MailEngineException | UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}		
	}
	public boolean confirmPatient(long patientId, long confirmingUserId) {
		User user;
		Patient patient;
		try {
			patient = super.getPatient(patientId);
			patient.setIsConfirmed(true);
			user = UserLocalServiceUtil.getUser(confirmingUserId);
			patient.setConfirmingUserName(user.getScreenName());
			patient.setConfirmingUserId(user.getUserId());
			super.updatePatient(patient);
			return true;
		} catch (PortalException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return false;
	}
	public List<Patient> getPatientsByGroupId(long groupId) {
		try {
			return patientPersistence.findByGroupId(groupId);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return new ArrayList<Patient>();
	}
	public List<Patient> getPatientsByGroupIdAndConfirmed(long groupId, boolean confirmed) {
		try {
			return patientPersistence.findByGroupIdAndConfirmed(groupId,confirmed);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return new ArrayList<Patient>();
	}
	public List<Patient> getPatientsByGroupIdAndConfirmed(long groupId, boolean confirmed, int start, int end) {
		try {
			return patientPersistence.findByGroupIdAndConfirmed(groupId,confirmed, start, end);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return new ArrayList<Patient>();
	}
	public List<Patient> getPatientsByGroupId(long groupId, int start, int end) {
		try {
			return patientPersistence.findByGroupId(groupId, start, end);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return new ArrayList<Patient>();
	}
	public int countPatientsByGroupIdAndConfirmed(long groupId, boolean isConfirmed) {
		try {
			return patientPersistence.countByGroupIdAndConfirmed(groupId, isConfirmed);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return 0;
	}
	public int countPatientsByGroupId(long groupId) {
		try {
			return patientPersistence.countByGroupId(groupId);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return 0;
	}
	public Patient getPatientByUserId(long userId) {
		try {
			List<Patient> patients = patientPersistence.findByUserId(userId);
			if (patients.size() > 0) return patients.get(0);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public String getPatientName(long patientId) {
		Patient patient;
		try {
			patient = super.getPatient(patientId);
			return patient.getName() + " " + patient.getMiddleName() + " " + patient.getSurname();
		} catch (PortalException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return "";
	}
	public Patient createNewPatient(long groupId, long companyId, long userId, String userName,
			String name,String middleName, String surname, String pesel, String idNumber, long idImageFileEntryId,
			String address, Date birthDate, String cityName, String sex) 
					throws PortalException, SystemException {
		long id = CounterLocalServiceUtil.increment(Patient.class.getName());
		Patient patient = patientPersistence.create(id);
		Date now = new Date();
		patient.setAddress(address);
		patient.setBirthDate(birthDate);
		patient.setCityName(cityName);
		patient.setCompanyId(companyId);
		patient.setGroupId(groupId);
		patient.setCreateDate(now);
		patient.setModifiedDate(now);
		patient.setIdImageFileEntryId(idImageFileEntryId);
		patient.setIdNumber(idNumber);
		patient.setIsConfirmed(false);
		patient.setMiddleName(middleName);
		patient.setName(name);
		patient.setPesel(pesel);
		patient.setPatientId(id);
		patient.setSex(sex);
		patient.setSurname(surname);
		patient.setUserId(userId);
		patient.setUserName(userName);
		patientPersistence.update(patient);
		return patient;
	}
	public Patient updatePatient(long patientId, String name,String middleName, String surname,
			String pesel, String idNumber, long idImageFileEntryId,
			String address, Date birthDate, String cityName, String sex) 
					throws PortalException, SystemException {
		Patient patient = patientPersistence.fetchByPrimaryKey(patientId);
		Date now = new Date();
		patient.setAddress(address);
		patient.setBirthDate(birthDate);
		patient.setCityName(cityName);
		patient.setModifiedDate(now);
		patient.setIdImageFileEntryId(idImageFileEntryId);
		patient.setIdNumber(idNumber);
		patient.setIsConfirmed(false);
		patient.setMiddleName(middleName);
		patient.setName(name);
		patient.setPesel(pesel);
		patient.setSex(sex);
		patient.setSurname(surname);
		patientPersistence.update(patient);
		return patient;
	}
}