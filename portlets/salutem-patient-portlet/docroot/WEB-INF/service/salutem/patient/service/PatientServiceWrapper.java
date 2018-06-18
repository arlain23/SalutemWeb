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

package salutem.patient.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PatientService}.
 *
 * @author Aneta Andrzejewska
 * @see PatientService
 * @generated
 */
public class PatientServiceWrapper implements PatientService,
	ServiceWrapper<PatientService> {
	public PatientServiceWrapper(PatientService patientService) {
		_patientService = patientService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _patientService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_patientService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _patientService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public long getPatientIdentity(java.lang.String pesel) {
		return _patientService.getPatientIdentity(pesel);
	}

	@Override
	public long getPatientIdentity(java.lang.String firstName,
		java.lang.String middleName, java.lang.String surname) {
		return _patientService.getPatientIdentity(firstName, middleName, surname);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray getAllPatients(
		long healthCentreId) {
		return _patientService.getAllPatients(healthCentreId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public PatientService getWrappedPatientService() {
		return _patientService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedPatientService(PatientService patientService) {
		_patientService = patientService;
	}

	@Override
	public PatientService getWrappedService() {
		return _patientService;
	}

	@Override
	public void setWrappedService(PatientService patientService) {
		_patientService = patientService;
	}

	private PatientService _patientService;
}