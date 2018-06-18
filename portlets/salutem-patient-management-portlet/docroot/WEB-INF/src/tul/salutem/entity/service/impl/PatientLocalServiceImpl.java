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

package tul.salutem.entity.service.impl;

import java.util.List;

import tul.salutem.entity.model.Patient;
import tul.salutem.entity.service.base.PatientLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.SystemException;


/**
 * The implementation of the patient local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link tul.salutem.entity.service.PatientLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Aneta Andrzejewska
 * @see tul.salutem.entity.service.base.PatientLocalServiceBaseImpl
 * @see tul.salutem.entity.service.PatientLocalServiceUtil
 */
public class PatientLocalServiceImpl extends PatientLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link tul.salutem.entity.service.PatientLocalServiceUtil} to access the patient local service.
	 */
	
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
}