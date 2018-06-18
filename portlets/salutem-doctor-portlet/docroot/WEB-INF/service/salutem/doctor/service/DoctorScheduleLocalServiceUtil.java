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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for DoctorSchedule. This utility wraps
 * {@link salutem.doctor.service.impl.DoctorScheduleLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Aneta Andrzejewska
 * @see DoctorScheduleLocalService
 * @see salutem.doctor.service.base.DoctorScheduleLocalServiceBaseImpl
 * @see salutem.doctor.service.impl.DoctorScheduleLocalServiceImpl
 * @generated
 */
public class DoctorScheduleLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link salutem.doctor.service.impl.DoctorScheduleLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the doctor schedule to the database. Also notifies the appropriate model listeners.
	*
	* @param doctorSchedule the doctor schedule
	* @return the doctor schedule that was added
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.doctor.model.DoctorSchedule addDoctorSchedule(
		salutem.doctor.model.DoctorSchedule doctorSchedule)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDoctorSchedule(doctorSchedule);
	}

	/**
	* Creates a new doctor schedule with the primary key. Does not add the doctor schedule to the database.
	*
	* @param scheduleId the primary key for the new doctor schedule
	* @return the new doctor schedule
	*/
	public static salutem.doctor.model.DoctorSchedule createDoctorSchedule(
		long scheduleId) {
		return getService().createDoctorSchedule(scheduleId);
	}

	/**
	* Deletes the doctor schedule with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param scheduleId the primary key of the doctor schedule
	* @return the doctor schedule that was removed
	* @throws PortalException if a doctor schedule with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.doctor.model.DoctorSchedule deleteDoctorSchedule(
		long scheduleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDoctorSchedule(scheduleId);
	}

	/**
	* Deletes the doctor schedule from the database. Also notifies the appropriate model listeners.
	*
	* @param doctorSchedule the doctor schedule
	* @return the doctor schedule that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.doctor.model.DoctorSchedule deleteDoctorSchedule(
		salutem.doctor.model.DoctorSchedule doctorSchedule)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDoctorSchedule(doctorSchedule);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static salutem.doctor.model.DoctorSchedule fetchDoctorSchedule(
		long scheduleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDoctorSchedule(scheduleId);
	}

	/**
	* Returns the doctor schedule with the primary key.
	*
	* @param scheduleId the primary key of the doctor schedule
	* @return the doctor schedule
	* @throws PortalException if a doctor schedule with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.doctor.model.DoctorSchedule getDoctorSchedule(
		long scheduleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDoctorSchedule(scheduleId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<salutem.doctor.model.DoctorSchedule> getDoctorSchedules(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDoctorSchedules(start, end);
	}

	/**
	* Returns the number of doctor schedules.
	*
	* @return the number of doctor schedules
	* @throws SystemException if a system exception occurred
	*/
	public static int getDoctorSchedulesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDoctorSchedulesCount();
	}

	/**
	* Updates the doctor schedule in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param doctorSchedule the doctor schedule
	* @return the doctor schedule that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.doctor.model.DoctorSchedule updateDoctorSchedule(
		salutem.doctor.model.DoctorSchedule doctorSchedule)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDoctorSchedule(doctorSchedule);
	}

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

	public static com.liferay.portal.kernel.json.JSONArray getSchedulesArrayByDoctorId(
		long doctorId) {
		return getService().getSchedulesArrayByDoctorId(doctorId);
	}

	public static java.util.List<salutem.doctor.model.DoctorSchedule> getSchedulesByDoctorId(
		long doctorId) {
		return getService().getSchedulesByDoctorId(doctorId);
	}

	public static java.util.List<salutem.doctor.model.DoctorSchedule> getSchedulesByDoctorIdAndDayIndex(
		long doctorId, int dayIndex) {
		return getService().getSchedulesByDoctorIdAndDayIndex(doctorId, dayIndex);
	}

	public static void deleteAllByDoctorId(long doctorId) {
		getService().deleteAllByDoctorId(doctorId);
	}

	public static java.util.List<salutem.doctor.model.DoctorSchedule> getSchedulesByDayIndex(
		int dayIndex) {
		return getService().getSchedulesByDayIndex(dayIndex);
	}

	public static java.lang.String[] getScheduleTime(long scheduleId) {
		return getService().getScheduleTime(scheduleId);
	}

	public static salutem.doctor.model.DoctorSchedule addDoctorSchedule(
		long doctorId, int dayOfWeek, java.lang.String startTimeString,
		java.lang.String endTimeString)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addDoctorSchedule(doctorId, dayOfWeek, startTimeString,
			endTimeString);
	}

	public static void clearService() {
		_service = null;
	}

	public static DoctorScheduleLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DoctorScheduleLocalService.class.getName());

			if (invokableLocalService instanceof DoctorScheduleLocalService) {
				_service = (DoctorScheduleLocalService)invokableLocalService;
			}
			else {
				_service = new DoctorScheduleLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(DoctorScheduleLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(DoctorScheduleLocalService service) {
	}

	private static DoctorScheduleLocalService _service;
}