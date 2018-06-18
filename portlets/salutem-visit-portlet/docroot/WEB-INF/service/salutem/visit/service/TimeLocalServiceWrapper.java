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

package salutem.visit.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TimeLocalService}.
 *
 * @author Aneta Andrzejewska
 * @see TimeLocalService
 * @generated
 */
public class TimeLocalServiceWrapper implements TimeLocalService,
	ServiceWrapper<TimeLocalService> {
	public TimeLocalServiceWrapper(TimeLocalService timeLocalService) {
		_timeLocalService = timeLocalService;
	}

	/**
	* Adds the time to the database. Also notifies the appropriate model listeners.
	*
	* @param time the time
	* @return the time that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public salutem.visit.model.Time addTime(salutem.visit.model.Time time)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _timeLocalService.addTime(time);
	}

	/**
	* Creates a new time with the primary key. Does not add the time to the database.
	*
	* @param timeId the primary key for the new time
	* @return the new time
	*/
	@Override
	public salutem.visit.model.Time createTime(long timeId) {
		return _timeLocalService.createTime(timeId);
	}

	/**
	* Deletes the time with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param timeId the primary key of the time
	* @return the time that was removed
	* @throws PortalException if a time with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public salutem.visit.model.Time deleteTime(long timeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _timeLocalService.deleteTime(timeId);
	}

	/**
	* Deletes the time from the database. Also notifies the appropriate model listeners.
	*
	* @param time the time
	* @return the time that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public salutem.visit.model.Time deleteTime(salutem.visit.model.Time time)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _timeLocalService.deleteTime(time);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _timeLocalService.dynamicQuery();
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
		return _timeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.TimeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _timeLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.TimeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _timeLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _timeLocalService.dynamicQueryCount(dynamicQuery);
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
		return _timeLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public salutem.visit.model.Time fetchTime(long timeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _timeLocalService.fetchTime(timeId);
	}

	/**
	* Returns the time with the primary key.
	*
	* @param timeId the primary key of the time
	* @return the time
	* @throws PortalException if a time with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public salutem.visit.model.Time getTime(long timeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _timeLocalService.getTime(timeId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _timeLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the times.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.TimeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of times
	* @param end the upper bound of the range of times (not inclusive)
	* @return the range of times
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<salutem.visit.model.Time> getTimes(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _timeLocalService.getTimes(start, end);
	}

	/**
	* Returns the number of times.
	*
	* @return the number of times
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getTimesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _timeLocalService.getTimesCount();
	}

	/**
	* Updates the time in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param time the time
	* @return the time that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public salutem.visit.model.Time updateTime(salutem.visit.model.Time time)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _timeLocalService.updateTime(time);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _timeLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_timeLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _timeLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public java.util.List<salutem.visit.model.Time> getTimeByDoctorIdAndPatientId(
		long doctorId, long patientId) {
		return _timeLocalService.getTimeByDoctorIdAndPatientId(doctorId,
			patientId);
	}

	@Override
	public salutem.visit.model.Time getFinishedByDoctorId(long doctorId) {
		return _timeLocalService.getFinishedByDoctorId(doctorId);
	}

	@Override
	public java.util.List<salutem.visit.model.Time> getTimesByDoctorIdDayMonthAndYear(
		long doctorId, int visitDay, int visitMonth, int visitYear) {
		return _timeLocalService.getTimesByDoctorIdDayMonthAndYear(doctorId,
			visitDay, visitMonth, visitYear);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray getPlannedVisits(
		long doctorId, int visitDay, int visitMonth, int visitYear,
		long patientId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _timeLocalService.getPlannedVisits(doctorId, visitDay,
			visitMonth, visitYear, patientId);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray getTimeQueueInfo(
		long doctorId, int visitDay, int visitMonth, int visitYear) {
		return _timeLocalService.getTimeQueueInfo(doctorId, visitDay,
			visitMonth, visitYear);
	}

	@Override
	public java.util.List<salutem.visit.model.Time> getTimesByPatientId(
		long patientId) {
		return _timeLocalService.getTimesByPatientId(patientId);
	}

	@Override
	public double getMeanTime(long patientId) {
		return _timeLocalService.getMeanTime(patientId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TimeLocalService getWrappedTimeLocalService() {
		return _timeLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTimeLocalService(TimeLocalService timeLocalService) {
		_timeLocalService = timeLocalService;
	}

	@Override
	public TimeLocalService getWrappedService() {
		return _timeLocalService;
	}

	@Override
	public void setWrappedService(TimeLocalService timeLocalService) {
		_timeLocalService = timeLocalService;
	}

	private TimeLocalService _timeLocalService;
}