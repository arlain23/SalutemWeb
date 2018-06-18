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

package salutem.doctor.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import salutem.doctor.model.DoctorSchedule;

import java.util.List;

/**
 * The persistence utility for the doctor schedule service. This utility wraps {@link DoctorSchedulePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Aneta Andrzejewska
 * @see DoctorSchedulePersistence
 * @see DoctorSchedulePersistenceImpl
 * @generated
 */
public class DoctorScheduleUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(DoctorSchedule doctorSchedule) {
		getPersistence().clearCache(doctorSchedule);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<DoctorSchedule> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DoctorSchedule> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DoctorSchedule> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DoctorSchedule update(DoctorSchedule doctorSchedule)
		throws SystemException {
		return getPersistence().update(doctorSchedule);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DoctorSchedule update(DoctorSchedule doctorSchedule,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(doctorSchedule, serviceContext);
	}

	/**
	* Returns all the doctor schedules where doctorId = &#63;.
	*
	* @param doctorId the doctor ID
	* @return the matching doctor schedules
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.doctor.model.DoctorSchedule> findByDoctorId(
		long doctorId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDoctorId(doctorId);
	}

	/**
	* Returns a range of all the doctor schedules where doctorId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.doctor.model.impl.DoctorScheduleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param doctorId the doctor ID
	* @param start the lower bound of the range of doctor schedules
	* @param end the upper bound of the range of doctor schedules (not inclusive)
	* @return the range of matching doctor schedules
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.doctor.model.DoctorSchedule> findByDoctorId(
		long doctorId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDoctorId(doctorId, start, end);
	}

	/**
	* Returns an ordered range of all the doctor schedules where doctorId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.doctor.model.impl.DoctorScheduleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param doctorId the doctor ID
	* @param start the lower bound of the range of doctor schedules
	* @param end the upper bound of the range of doctor schedules (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching doctor schedules
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.doctor.model.DoctorSchedule> findByDoctorId(
		long doctorId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDoctorId(doctorId, start, end, orderByComparator);
	}

	/**
	* Returns the first doctor schedule in the ordered set where doctorId = &#63;.
	*
	* @param doctorId the doctor ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching doctor schedule
	* @throws salutem.doctor.NoSuchDoctorScheduleException if a matching doctor schedule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.doctor.model.DoctorSchedule findByDoctorId_First(
		long doctorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.doctor.NoSuchDoctorScheduleException {
		return getPersistence().findByDoctorId_First(doctorId, orderByComparator);
	}

	/**
	* Returns the first doctor schedule in the ordered set where doctorId = &#63;.
	*
	* @param doctorId the doctor ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching doctor schedule, or <code>null</code> if a matching doctor schedule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.doctor.model.DoctorSchedule fetchByDoctorId_First(
		long doctorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDoctorId_First(doctorId, orderByComparator);
	}

	/**
	* Returns the last doctor schedule in the ordered set where doctorId = &#63;.
	*
	* @param doctorId the doctor ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching doctor schedule
	* @throws salutem.doctor.NoSuchDoctorScheduleException if a matching doctor schedule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.doctor.model.DoctorSchedule findByDoctorId_Last(
		long doctorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.doctor.NoSuchDoctorScheduleException {
		return getPersistence().findByDoctorId_Last(doctorId, orderByComparator);
	}

	/**
	* Returns the last doctor schedule in the ordered set where doctorId = &#63;.
	*
	* @param doctorId the doctor ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching doctor schedule, or <code>null</code> if a matching doctor schedule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.doctor.model.DoctorSchedule fetchByDoctorId_Last(
		long doctorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByDoctorId_Last(doctorId, orderByComparator);
	}

	/**
	* Returns the doctor schedules before and after the current doctor schedule in the ordered set where doctorId = &#63;.
	*
	* @param scheduleId the primary key of the current doctor schedule
	* @param doctorId the doctor ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next doctor schedule
	* @throws salutem.doctor.NoSuchDoctorScheduleException if a doctor schedule with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.doctor.model.DoctorSchedule[] findByDoctorId_PrevAndNext(
		long scheduleId, long doctorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.doctor.NoSuchDoctorScheduleException {
		return getPersistence()
				   .findByDoctorId_PrevAndNext(scheduleId, doctorId,
			orderByComparator);
	}

	/**
	* Removes all the doctor schedules where doctorId = &#63; from the database.
	*
	* @param doctorId the doctor ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDoctorId(long doctorId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDoctorId(doctorId);
	}

	/**
	* Returns the number of doctor schedules where doctorId = &#63;.
	*
	* @param doctorId the doctor ID
	* @return the number of matching doctor schedules
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDoctorId(long doctorId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDoctorId(doctorId);
	}

	/**
	* Returns all the doctor schedules where dayOfWeek = &#63;.
	*
	* @param dayOfWeek the day of week
	* @return the matching doctor schedules
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.doctor.model.DoctorSchedule> findByDayOfWeek(
		int dayOfWeek)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDayOfWeek(dayOfWeek);
	}

	/**
	* Returns a range of all the doctor schedules where dayOfWeek = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.doctor.model.impl.DoctorScheduleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dayOfWeek the day of week
	* @param start the lower bound of the range of doctor schedules
	* @param end the upper bound of the range of doctor schedules (not inclusive)
	* @return the range of matching doctor schedules
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.doctor.model.DoctorSchedule> findByDayOfWeek(
		int dayOfWeek, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDayOfWeek(dayOfWeek, start, end);
	}

	/**
	* Returns an ordered range of all the doctor schedules where dayOfWeek = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.doctor.model.impl.DoctorScheduleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dayOfWeek the day of week
	* @param start the lower bound of the range of doctor schedules
	* @param end the upper bound of the range of doctor schedules (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching doctor schedules
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.doctor.model.DoctorSchedule> findByDayOfWeek(
		int dayOfWeek, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDayOfWeek(dayOfWeek, start, end, orderByComparator);
	}

	/**
	* Returns the first doctor schedule in the ordered set where dayOfWeek = &#63;.
	*
	* @param dayOfWeek the day of week
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching doctor schedule
	* @throws salutem.doctor.NoSuchDoctorScheduleException if a matching doctor schedule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.doctor.model.DoctorSchedule findByDayOfWeek_First(
		int dayOfWeek,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.doctor.NoSuchDoctorScheduleException {
		return getPersistence()
				   .findByDayOfWeek_First(dayOfWeek, orderByComparator);
	}

	/**
	* Returns the first doctor schedule in the ordered set where dayOfWeek = &#63;.
	*
	* @param dayOfWeek the day of week
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching doctor schedule, or <code>null</code> if a matching doctor schedule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.doctor.model.DoctorSchedule fetchByDayOfWeek_First(
		int dayOfWeek,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDayOfWeek_First(dayOfWeek, orderByComparator);
	}

	/**
	* Returns the last doctor schedule in the ordered set where dayOfWeek = &#63;.
	*
	* @param dayOfWeek the day of week
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching doctor schedule
	* @throws salutem.doctor.NoSuchDoctorScheduleException if a matching doctor schedule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.doctor.model.DoctorSchedule findByDayOfWeek_Last(
		int dayOfWeek,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.doctor.NoSuchDoctorScheduleException {
		return getPersistence()
				   .findByDayOfWeek_Last(dayOfWeek, orderByComparator);
	}

	/**
	* Returns the last doctor schedule in the ordered set where dayOfWeek = &#63;.
	*
	* @param dayOfWeek the day of week
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching doctor schedule, or <code>null</code> if a matching doctor schedule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.doctor.model.DoctorSchedule fetchByDayOfWeek_Last(
		int dayOfWeek,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDayOfWeek_Last(dayOfWeek, orderByComparator);
	}

	/**
	* Returns the doctor schedules before and after the current doctor schedule in the ordered set where dayOfWeek = &#63;.
	*
	* @param scheduleId the primary key of the current doctor schedule
	* @param dayOfWeek the day of week
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next doctor schedule
	* @throws salutem.doctor.NoSuchDoctorScheduleException if a doctor schedule with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.doctor.model.DoctorSchedule[] findByDayOfWeek_PrevAndNext(
		long scheduleId, int dayOfWeek,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.doctor.NoSuchDoctorScheduleException {
		return getPersistence()
				   .findByDayOfWeek_PrevAndNext(scheduleId, dayOfWeek,
			orderByComparator);
	}

	/**
	* Removes all the doctor schedules where dayOfWeek = &#63; from the database.
	*
	* @param dayOfWeek the day of week
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDayOfWeek(int dayOfWeek)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDayOfWeek(dayOfWeek);
	}

	/**
	* Returns the number of doctor schedules where dayOfWeek = &#63;.
	*
	* @param dayOfWeek the day of week
	* @return the number of matching doctor schedules
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDayOfWeek(int dayOfWeek)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDayOfWeek(dayOfWeek);
	}

	/**
	* Returns all the doctor schedules where doctorId = &#63; and dayOfWeek = &#63;.
	*
	* @param doctorId the doctor ID
	* @param dayOfWeek the day of week
	* @return the matching doctor schedules
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.doctor.model.DoctorSchedule> findByDoctorIdAndDayOfWeek(
		long doctorId, int dayOfWeek)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDoctorIdAndDayOfWeek(doctorId, dayOfWeek);
	}

	/**
	* Returns a range of all the doctor schedules where doctorId = &#63; and dayOfWeek = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.doctor.model.impl.DoctorScheduleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param doctorId the doctor ID
	* @param dayOfWeek the day of week
	* @param start the lower bound of the range of doctor schedules
	* @param end the upper bound of the range of doctor schedules (not inclusive)
	* @return the range of matching doctor schedules
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.doctor.model.DoctorSchedule> findByDoctorIdAndDayOfWeek(
		long doctorId, int dayOfWeek, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDoctorIdAndDayOfWeek(doctorId, dayOfWeek, start, end);
	}

	/**
	* Returns an ordered range of all the doctor schedules where doctorId = &#63; and dayOfWeek = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.doctor.model.impl.DoctorScheduleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param doctorId the doctor ID
	* @param dayOfWeek the day of week
	* @param start the lower bound of the range of doctor schedules
	* @param end the upper bound of the range of doctor schedules (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching doctor schedules
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.doctor.model.DoctorSchedule> findByDoctorIdAndDayOfWeek(
		long doctorId, int dayOfWeek, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDoctorIdAndDayOfWeek(doctorId, dayOfWeek, start, end,
			orderByComparator);
	}

	/**
	* Returns the first doctor schedule in the ordered set where doctorId = &#63; and dayOfWeek = &#63;.
	*
	* @param doctorId the doctor ID
	* @param dayOfWeek the day of week
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching doctor schedule
	* @throws salutem.doctor.NoSuchDoctorScheduleException if a matching doctor schedule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.doctor.model.DoctorSchedule findByDoctorIdAndDayOfWeek_First(
		long doctorId, int dayOfWeek,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.doctor.NoSuchDoctorScheduleException {
		return getPersistence()
				   .findByDoctorIdAndDayOfWeek_First(doctorId, dayOfWeek,
			orderByComparator);
	}

	/**
	* Returns the first doctor schedule in the ordered set where doctorId = &#63; and dayOfWeek = &#63;.
	*
	* @param doctorId the doctor ID
	* @param dayOfWeek the day of week
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching doctor schedule, or <code>null</code> if a matching doctor schedule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.doctor.model.DoctorSchedule fetchByDoctorIdAndDayOfWeek_First(
		long doctorId, int dayOfWeek,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDoctorIdAndDayOfWeek_First(doctorId, dayOfWeek,
			orderByComparator);
	}

	/**
	* Returns the last doctor schedule in the ordered set where doctorId = &#63; and dayOfWeek = &#63;.
	*
	* @param doctorId the doctor ID
	* @param dayOfWeek the day of week
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching doctor schedule
	* @throws salutem.doctor.NoSuchDoctorScheduleException if a matching doctor schedule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.doctor.model.DoctorSchedule findByDoctorIdAndDayOfWeek_Last(
		long doctorId, int dayOfWeek,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.doctor.NoSuchDoctorScheduleException {
		return getPersistence()
				   .findByDoctorIdAndDayOfWeek_Last(doctorId, dayOfWeek,
			orderByComparator);
	}

	/**
	* Returns the last doctor schedule in the ordered set where doctorId = &#63; and dayOfWeek = &#63;.
	*
	* @param doctorId the doctor ID
	* @param dayOfWeek the day of week
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching doctor schedule, or <code>null</code> if a matching doctor schedule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.doctor.model.DoctorSchedule fetchByDoctorIdAndDayOfWeek_Last(
		long doctorId, int dayOfWeek,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDoctorIdAndDayOfWeek_Last(doctorId, dayOfWeek,
			orderByComparator);
	}

	/**
	* Returns the doctor schedules before and after the current doctor schedule in the ordered set where doctorId = &#63; and dayOfWeek = &#63;.
	*
	* @param scheduleId the primary key of the current doctor schedule
	* @param doctorId the doctor ID
	* @param dayOfWeek the day of week
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next doctor schedule
	* @throws salutem.doctor.NoSuchDoctorScheduleException if a doctor schedule with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.doctor.model.DoctorSchedule[] findByDoctorIdAndDayOfWeek_PrevAndNext(
		long scheduleId, long doctorId, int dayOfWeek,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.doctor.NoSuchDoctorScheduleException {
		return getPersistence()
				   .findByDoctorIdAndDayOfWeek_PrevAndNext(scheduleId,
			doctorId, dayOfWeek, orderByComparator);
	}

	/**
	* Removes all the doctor schedules where doctorId = &#63; and dayOfWeek = &#63; from the database.
	*
	* @param doctorId the doctor ID
	* @param dayOfWeek the day of week
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDoctorIdAndDayOfWeek(long doctorId, int dayOfWeek)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDoctorIdAndDayOfWeek(doctorId, dayOfWeek);
	}

	/**
	* Returns the number of doctor schedules where doctorId = &#63; and dayOfWeek = &#63;.
	*
	* @param doctorId the doctor ID
	* @param dayOfWeek the day of week
	* @return the number of matching doctor schedules
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDoctorIdAndDayOfWeek(long doctorId, int dayOfWeek)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDoctorIdAndDayOfWeek(doctorId, dayOfWeek);
	}

	/**
	* Caches the doctor schedule in the entity cache if it is enabled.
	*
	* @param doctorSchedule the doctor schedule
	*/
	public static void cacheResult(
		salutem.doctor.model.DoctorSchedule doctorSchedule) {
		getPersistence().cacheResult(doctorSchedule);
	}

	/**
	* Caches the doctor schedules in the entity cache if it is enabled.
	*
	* @param doctorSchedules the doctor schedules
	*/
	public static void cacheResult(
		java.util.List<salutem.doctor.model.DoctorSchedule> doctorSchedules) {
		getPersistence().cacheResult(doctorSchedules);
	}

	/**
	* Creates a new doctor schedule with the primary key. Does not add the doctor schedule to the database.
	*
	* @param scheduleId the primary key for the new doctor schedule
	* @return the new doctor schedule
	*/
	public static salutem.doctor.model.DoctorSchedule create(long scheduleId) {
		return getPersistence().create(scheduleId);
	}

	/**
	* Removes the doctor schedule with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param scheduleId the primary key of the doctor schedule
	* @return the doctor schedule that was removed
	* @throws salutem.doctor.NoSuchDoctorScheduleException if a doctor schedule with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.doctor.model.DoctorSchedule remove(long scheduleId)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.doctor.NoSuchDoctorScheduleException {
		return getPersistence().remove(scheduleId);
	}

	public static salutem.doctor.model.DoctorSchedule updateImpl(
		salutem.doctor.model.DoctorSchedule doctorSchedule)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(doctorSchedule);
	}

	/**
	* Returns the doctor schedule with the primary key or throws a {@link salutem.doctor.NoSuchDoctorScheduleException} if it could not be found.
	*
	* @param scheduleId the primary key of the doctor schedule
	* @return the doctor schedule
	* @throws salutem.doctor.NoSuchDoctorScheduleException if a doctor schedule with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.doctor.model.DoctorSchedule findByPrimaryKey(
		long scheduleId)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.doctor.NoSuchDoctorScheduleException {
		return getPersistence().findByPrimaryKey(scheduleId);
	}

	/**
	* Returns the doctor schedule with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param scheduleId the primary key of the doctor schedule
	* @return the doctor schedule, or <code>null</code> if a doctor schedule with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.doctor.model.DoctorSchedule fetchByPrimaryKey(
		long scheduleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(scheduleId);
	}

	/**
	* Returns all the doctor schedules.
	*
	* @return the doctor schedules
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.doctor.model.DoctorSchedule> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<salutem.doctor.model.DoctorSchedule> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the doctor schedules.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.doctor.model.impl.DoctorScheduleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of doctor schedules
	* @param end the upper bound of the range of doctor schedules (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of doctor schedules
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.doctor.model.DoctorSchedule> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the doctor schedules from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of doctor schedules.
	*
	* @return the number of doctor schedules
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DoctorSchedulePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DoctorSchedulePersistence)PortletBeanLocatorUtil.locate(salutem.doctor.service.ClpSerializer.getServletContextName(),
					DoctorSchedulePersistence.class.getName());

			ReferenceRegistry.registerReference(DoctorScheduleUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DoctorSchedulePersistence persistence) {
	}

	private static DoctorSchedulePersistence _persistence;
}