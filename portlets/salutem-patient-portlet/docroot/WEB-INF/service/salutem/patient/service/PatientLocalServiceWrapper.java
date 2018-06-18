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
 * Provides a wrapper for {@link PatientLocalService}.
 *
 * @author Aneta Andrzejewska
 * @see PatientLocalService
 * @generated
 */
public class PatientLocalServiceWrapper implements PatientLocalService,
	ServiceWrapper<PatientLocalService> {
	public PatientLocalServiceWrapper(PatientLocalService patientLocalService) {
		_patientLocalService = patientLocalService;
	}

	/**
	* Adds the patient to the database. Also notifies the appropriate model listeners.
	*
	* @param patient the patient
	* @return the patient that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public salutem.patient.model.Patient addPatient(
		salutem.patient.model.Patient patient)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _patientLocalService.addPatient(patient);
	}

	/**
	* Creates a new patient with the primary key. Does not add the patient to the database.
	*
	* @param patientId the primary key for the new patient
	* @return the new patient
	*/
	@Override
	public salutem.patient.model.Patient createPatient(long patientId) {
		return _patientLocalService.createPatient(patientId);
	}

	/**
	* Deletes the patient with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param patientId the primary key of the patient
	* @return the patient that was removed
	* @throws PortalException if a patient with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public salutem.patient.model.Patient deletePatient(long patientId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _patientLocalService.deletePatient(patientId);
	}

	/**
	* Deletes the patient from the database. Also notifies the appropriate model listeners.
	*
	* @param patient the patient
	* @return the patient that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public salutem.patient.model.Patient deletePatient(
		salutem.patient.model.Patient patient)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _patientLocalService.deletePatient(patient);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _patientLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _patientLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.patient.model.impl.PatientModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _patientLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.patient.model.impl.PatientModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _patientLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _patientLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _patientLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public salutem.patient.model.Patient fetchPatient(long patientId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _patientLocalService.fetchPatient(patientId);
	}

	/**
	* Returns the patient with the primary key.
	*
	* @param patientId the primary key of the patient
	* @return the patient
	* @throws PortalException if a patient with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public salutem.patient.model.Patient getPatient(long patientId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _patientLocalService.getPatient(patientId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _patientLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the patients.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.patient.model.impl.PatientModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of patients
	* @param end the upper bound of the range of patients (not inclusive)
	* @return the range of patients
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<salutem.patient.model.Patient> getPatients(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _patientLocalService.getPatients(start, end);
	}

	/**
	* Returns the number of patients.
	*
	* @return the number of patients
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getPatientsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _patientLocalService.getPatientsCount();
	}

	/**
	* Updates the patient in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param patient the patient
	* @return the patient that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public salutem.patient.model.Patient updatePatient(
		salutem.patient.model.Patient patient)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _patientLocalService.updatePatient(patient);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _patientLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_patientLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _patientLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public java.util.List<salutem.patient.model.Patient> getAllPatients() {
		return _patientLocalService.getAllPatients();
	}

	@Override
	public void sendEmail(long patientId, long sendingUserId,
		java.lang.String body, java.lang.String header)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_patientLocalService.sendEmail(patientId, sendingUserId, body, header);
	}

	@Override
	public boolean confirmPatient(long patientId, long confirmingUserId) {
		return _patientLocalService.confirmPatient(patientId, confirmingUserId);
	}

	@Override
	public java.util.List<salutem.patient.model.Patient> getPatientsByGroupId(
		long groupId) {
		return _patientLocalService.getPatientsByGroupId(groupId);
	}

	@Override
	public java.util.List<salutem.patient.model.Patient> getPatientsByGroupIdAndConfirmed(
		long groupId, boolean confirmed) {
		return _patientLocalService.getPatientsByGroupIdAndConfirmed(groupId,
			confirmed);
	}

	@Override
	public java.util.List<salutem.patient.model.Patient> getPatientsByGroupIdAndConfirmed(
		long groupId, boolean confirmed, int start, int end) {
		return _patientLocalService.getPatientsByGroupIdAndConfirmed(groupId,
			confirmed, start, end);
	}

	@Override
	public java.util.List<salutem.patient.model.Patient> getPatientsByGroupId(
		long groupId, int start, int end) {
		return _patientLocalService.getPatientsByGroupId(groupId, start, end);
	}

	@Override
	public int countPatientsByGroupIdAndConfirmed(long groupId,
		boolean isConfirmed) {
		return _patientLocalService.countPatientsByGroupIdAndConfirmed(groupId,
			isConfirmed);
	}

	@Override
	public int countPatientsByGroupId(long groupId) {
		return _patientLocalService.countPatientsByGroupId(groupId);
	}

	@Override
	public salutem.patient.model.Patient getPatientByUserId(long userId) {
		return _patientLocalService.getPatientByUserId(userId);
	}

	@Override
	public java.lang.String getPatientName(long patientId) {
		return _patientLocalService.getPatientName(patientId);
	}

	@Override
	public salutem.patient.model.Patient createNewPatient(long groupId,
		long companyId, long userId, java.lang.String userName,
		java.lang.String name, java.lang.String middleName,
		java.lang.String surname, java.lang.String pesel,
		java.lang.String idNumber, long idImageFileEntryId,
		java.lang.String address, java.util.Date birthDate,
		java.lang.String cityName, java.lang.String sex)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _patientLocalService.createNewPatient(groupId, companyId,
			userId, userName, name, middleName, surname, pesel, idNumber,
			idImageFileEntryId, address, birthDate, cityName, sex);
	}

	@Override
	public salutem.patient.model.Patient updatePatient(long patientId,
		java.lang.String name, java.lang.String middleName,
		java.lang.String surname, java.lang.String pesel,
		java.lang.String idNumber, long idImageFileEntryId,
		java.lang.String address, java.util.Date birthDate,
		java.lang.String cityName, java.lang.String sex)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _patientLocalService.updatePatient(patientId, name, middleName,
			surname, pesel, idNumber, idImageFileEntryId, address, birthDate,
			cityName, sex);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public PatientLocalService getWrappedPatientLocalService() {
		return _patientLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedPatientLocalService(
		PatientLocalService patientLocalService) {
		_patientLocalService = patientLocalService;
	}

	@Override
	public PatientLocalService getWrappedService() {
		return _patientLocalService;
	}

	@Override
	public void setWrappedService(PatientLocalService patientLocalService) {
		_patientLocalService = patientLocalService;
	}

	private PatientLocalService _patientLocalService;
}