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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for Patient. This utility wraps
 * {@link salutem.patient.service.impl.PatientServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Aneta Andrzejewska
 * @see PatientService
 * @see salutem.patient.service.base.PatientServiceBaseImpl
 * @see salutem.patient.service.impl.PatientServiceImpl
 * @generated
 */
public class PatientServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link salutem.patient.service.impl.PatientServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static long getPatientIdentity(java.lang.String pesel) {
		return getService().getPatientIdentity(pesel);
	}

	public static long getPatientIdentity(java.lang.String firstName,
		java.lang.String middleName, java.lang.String surname) {
		return getService().getPatientIdentity(firstName, middleName, surname);
	}

	public static com.liferay.portal.kernel.json.JSONArray getAllPatients(
		long healthCentreId) {
		return getService().getAllPatients(healthCentreId);
	}

	public static void clearService() {
		_service = null;
	}

	public static PatientService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					PatientService.class.getName());

			if (invokableService instanceof PatientService) {
				_service = (PatientService)invokableService;
			}
			else {
				_service = new PatientServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(PatientServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(PatientService service) {
	}

	private static PatientService _service;
}