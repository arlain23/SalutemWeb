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

package salutem.doctor.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DoctorScheduleLocalService}.
 *
 * @author Aneta Andrzejewska
 * @see DoctorScheduleLocalService
 * @generated
 */
public class DoctorScheduleLocalServiceWrapper
	implements DoctorScheduleLocalService,
		ServiceWrapper<DoctorScheduleLocalService> {
	public DoctorScheduleLocalServiceWrapper(
		DoctorScheduleLocalService doctorScheduleLocalService) {
		_doctorScheduleLocalService = doctorScheduleLocalService;
	}

	/**
	* Adds the doctor schedule to the database. Also notifies the appropriate model listeners.
	*
	* @param doctorSchedule the doctor schedule
	* @return the doctor schedule that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public salutem.doctor.model.DoctorSchedule addDoctorSchedule(
		salutem.doctor.model.DoctorSchedule doctorSchedule)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _doctorScheduleLocalService.addDoctorSchedule(doctorSchedule);
	}

	/**
	* Creates a new doctor schedule with the primary key. Does not add the doctor schedule to the database.
	*
	* @param scheduleId the primary key for the new doctor schedule
	* @return the new doctor schedule
	*/
	@Override
	public salutem.doctor.model.DoctorSchedule createDoctorSchedule(
		long scheduleId) {
		return _doctorScheduleLocalService.createDoctorSchedule(scheduleId);
	}

	/**
	* Deletes the doctor schedule with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param scheduleId the primary key of the doctor schedule
	* @return the doctor schedule that was removed
	* @throws PortalException if a doctor schedule with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public salutem.doctor.model.DoctorSchedule deleteDoctorSchedule(
		long scheduleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _doctorScheduleLocalService.deleteDoctorSchedule(scheduleId);
	}

	/**
	* Deletes the doctor schedule from the database. Also notifies the appropriate model listeners.
	*
	* @param doctorSchedule the doctor schedule
	* @return the doctor schedule that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public salutem.doctor.model.DoctorSchedule deleteDoctorSchedule(
		salutem.doctor.model.DoctorSchedule doctorSchedule)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _doctorScheduleLocalService.deleteDoctorSchedule(doctorSchedule);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _doctorScheduleLocalService.dynamicQuery();
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
		return _doctorScheduleLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.doctor.model.impl.DoctorScheduleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _doctorScheduleLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.doctor.model.impl.DoctorScheduleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _doctorScheduleLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _doctorScheduleLocalService.dynamicQueryCount(dynamicQuery);
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
		return _doctorScheduleLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public salutem.doctor.model.DoctorSchedule fetchDoctorSchedule(
		long scheduleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _doctorScheduleLocalService.fetchDoctorSchedule(scheduleId);
	}

	/**
	* Returns the doctor schedule with the primary key.
	*
	* @param scheduleId the primary key of the doctor schedule
	* @return the doctor schedule
	* @throws PortalException if a doctor schedule with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public salutem.doctor.model.DoctorSchedule getDoctorSchedule(
		long scheduleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _doctorScheduleLocalService.getDoctorSchedule(scheduleId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _doctorScheduleLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the doctor schedules.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.doctor.model.impl.DoctorScheduleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of doctor schedules
	* @param end the upper bound of the range of doctor schedules (not inclusive)
	* @return the range of doctor schedules
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<salutem.doctor.model.DoctorSchedule> getDoctorSchedules(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _doctorScheduleLocalService.getDoctorSchedules(start, end);
	}

	/**
	* Returns the number of doctor schedules.
	*
	* @return the number of doctor schedules
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDoctorSchedulesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _doctorScheduleLocalService.getDoctorSchedulesCount();
	}

	/**
	* Updates the doctor schedule in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param doctorSchedule the doctor schedule
	* @return the doctor schedule that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public salutem.doctor.model.DoctorSchedule updateDoctorSchedule(
		salutem.doctor.model.DoctorSchedule doctorSchedule)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _doctorScheduleLocalService.updateDoctorSchedule(doctorSchedule);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _doctorScheduleLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_doctorScheduleLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _doctorScheduleLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray getSchedulesArrayByDoctorId(
		long doctorId) {
		return _doctorScheduleLocalService.getSchedulesArrayByDoctorId(doctorId);
	}

	@Override
	public java.util.List<salutem.doctor.model.DoctorSchedule> getSchedulesByDoctorId(
		long doctorId) {
		return _doctorScheduleLocalService.getSchedulesByDoctorId(doctorId);
	}

	@Override
	public java.util.List<salutem.doctor.model.DoctorSchedule> getSchedulesByDoctorIdAndDayIndex(
		long doctorId, int dayIndex) {
		return _doctorScheduleLocalService.getSchedulesByDoctorIdAndDayIndex(doctorId,
			dayIndex);
	}

	@Override
	public void deleteAllByDoctorId(long doctorId) {
		_doctorScheduleLocalService.deleteAllByDoctorId(doctorId);
	}

	@Override
	public java.util.List<salutem.doctor.model.DoctorSchedule> getSchedulesByDayIndex(
		int dayIndex) {
		return _doctorScheduleLocalService.getSchedulesByDayIndex(dayIndex);
	}

	@Override
	public java.lang.String[] getScheduleTime(long scheduleId) {
		return _doctorScheduleLocalService.getScheduleTime(scheduleId);
	}

	@Override
	public salutem.doctor.model.DoctorSchedule addDoctorSchedule(
		long doctorId, int dayOfWeek, java.lang.String startTimeString,
		java.lang.String endTimeString)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _doctorScheduleLocalService.addDoctorSchedule(doctorId,
			dayOfWeek, startTimeString, endTimeString);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DoctorScheduleLocalService getWrappedDoctorScheduleLocalService() {
		return _doctorScheduleLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDoctorScheduleLocalService(
		DoctorScheduleLocalService doctorScheduleLocalService) {
		_doctorScheduleLocalService = doctorScheduleLocalService;
	}

	@Override
	public DoctorScheduleLocalService getWrappedService() {
		return _doctorScheduleLocalService;
	}

	@Override
	public void setWrappedService(
		DoctorScheduleLocalService doctorScheduleLocalService) {
		_doctorScheduleLocalService = doctorScheduleLocalService;
	}

	private DoctorScheduleLocalService _doctorScheduleLocalService;
}