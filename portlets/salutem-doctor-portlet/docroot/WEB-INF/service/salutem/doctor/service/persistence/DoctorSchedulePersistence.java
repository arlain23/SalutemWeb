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

import com.liferay.portal.service.persistence.BasePersistence;

import salutem.doctor.model.DoctorSchedule;

/**
 * The persistence interface for the doctor schedule service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Aneta Andrzejewska
 * @see DoctorSchedulePersistenceImpl
 * @see DoctorScheduleUtil
 * @generated
 */
public interface DoctorSchedulePersistence extends BasePersistence<DoctorSchedule> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DoctorScheduleUtil} to access the doctor schedule persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the doctor schedules where doctorId = &#63;.
	*
	* @param doctorId the doctor ID
	* @return the matching doctor schedules
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<salutem.doctor.model.DoctorSchedule> findByDoctorId(
		long doctorId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<salutem.doctor.model.DoctorSchedule> findByDoctorId(
		long doctorId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<salutem.doctor.model.DoctorSchedule> findByDoctorId(
		long doctorId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first doctor schedule in the ordered set where doctorId = &#63;.
	*
	* @param doctorId the doctor ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching doctor schedule
	* @throws salutem.doctor.NoSuchDoctorScheduleException if a matching doctor schedule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.doctor.model.DoctorSchedule findByDoctorId_First(
		long doctorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.doctor.NoSuchDoctorScheduleException;

	/**
	* Returns the first doctor schedule in the ordered set where doctorId = &#63;.
	*
	* @param doctorId the doctor ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching doctor schedule, or <code>null</code> if a matching doctor schedule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.doctor.model.DoctorSchedule fetchByDoctorId_First(
		long doctorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last doctor schedule in the ordered set where doctorId = &#63;.
	*
	* @param doctorId the doctor ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching doctor schedule
	* @throws salutem.doctor.NoSuchDoctorScheduleException if a matching doctor schedule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.doctor.model.DoctorSchedule findByDoctorId_Last(
		long doctorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.doctor.NoSuchDoctorScheduleException;

	/**
	* Returns the last doctor schedule in the ordered set where doctorId = &#63;.
	*
	* @param doctorId the doctor ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching doctor schedule, or <code>null</code> if a matching doctor schedule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.doctor.model.DoctorSchedule fetchByDoctorId_Last(
		long doctorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public salutem.doctor.model.DoctorSchedule[] findByDoctorId_PrevAndNext(
		long scheduleId, long doctorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.doctor.NoSuchDoctorScheduleException;

	/**
	* Removes all the doctor schedules where doctorId = &#63; from the database.
	*
	* @param doctorId the doctor ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDoctorId(long doctorId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of doctor schedules where doctorId = &#63;.
	*
	* @param doctorId the doctor ID
	* @return the number of matching doctor schedules
	* @throws SystemException if a system exception occurred
	*/
	public int countByDoctorId(long doctorId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the doctor schedules where dayOfWeek = &#63;.
	*
	* @param dayOfWeek the day of week
	* @return the matching doctor schedules
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<salutem.doctor.model.DoctorSchedule> findByDayOfWeek(
		int dayOfWeek)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<salutem.doctor.model.DoctorSchedule> findByDayOfWeek(
		int dayOfWeek, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<salutem.doctor.model.DoctorSchedule> findByDayOfWeek(
		int dayOfWeek, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first doctor schedule in the ordered set where dayOfWeek = &#63;.
	*
	* @param dayOfWeek the day of week
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching doctor schedule
	* @throws salutem.doctor.NoSuchDoctorScheduleException if a matching doctor schedule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.doctor.model.DoctorSchedule findByDayOfWeek_First(
		int dayOfWeek,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.doctor.NoSuchDoctorScheduleException;

	/**
	* Returns the first doctor schedule in the ordered set where dayOfWeek = &#63;.
	*
	* @param dayOfWeek the day of week
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching doctor schedule, or <code>null</code> if a matching doctor schedule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.doctor.model.DoctorSchedule fetchByDayOfWeek_First(
		int dayOfWeek,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last doctor schedule in the ordered set where dayOfWeek = &#63;.
	*
	* @param dayOfWeek the day of week
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching doctor schedule
	* @throws salutem.doctor.NoSuchDoctorScheduleException if a matching doctor schedule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.doctor.model.DoctorSchedule findByDayOfWeek_Last(
		int dayOfWeek,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.doctor.NoSuchDoctorScheduleException;

	/**
	* Returns the last doctor schedule in the ordered set where dayOfWeek = &#63;.
	*
	* @param dayOfWeek the day of week
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching doctor schedule, or <code>null</code> if a matching doctor schedule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.doctor.model.DoctorSchedule fetchByDayOfWeek_Last(
		int dayOfWeek,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public salutem.doctor.model.DoctorSchedule[] findByDayOfWeek_PrevAndNext(
		long scheduleId, int dayOfWeek,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.doctor.NoSuchDoctorScheduleException;

	/**
	* Removes all the doctor schedules where dayOfWeek = &#63; from the database.
	*
	* @param dayOfWeek the day of week
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDayOfWeek(int dayOfWeek)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of doctor schedules where dayOfWeek = &#63;.
	*
	* @param dayOfWeek the day of week
	* @return the number of matching doctor schedules
	* @throws SystemException if a system exception occurred
	*/
	public int countByDayOfWeek(int dayOfWeek)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the doctor schedules where doctorId = &#63; and dayOfWeek = &#63;.
	*
	* @param doctorId the doctor ID
	* @param dayOfWeek the day of week
	* @return the matching doctor schedules
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<salutem.doctor.model.DoctorSchedule> findByDoctorIdAndDayOfWeek(
		long doctorId, int dayOfWeek)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<salutem.doctor.model.DoctorSchedule> findByDoctorIdAndDayOfWeek(
		long doctorId, int dayOfWeek, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<salutem.doctor.model.DoctorSchedule> findByDoctorIdAndDayOfWeek(
		long doctorId, int dayOfWeek, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public salutem.doctor.model.DoctorSchedule findByDoctorIdAndDayOfWeek_First(
		long doctorId, int dayOfWeek,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.doctor.NoSuchDoctorScheduleException;

	/**
	* Returns the first doctor schedule in the ordered set where doctorId = &#63; and dayOfWeek = &#63;.
	*
	* @param doctorId the doctor ID
	* @param dayOfWeek the day of week
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching doctor schedule, or <code>null</code> if a matching doctor schedule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.doctor.model.DoctorSchedule fetchByDoctorIdAndDayOfWeek_First(
		long doctorId, int dayOfWeek,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public salutem.doctor.model.DoctorSchedule findByDoctorIdAndDayOfWeek_Last(
		long doctorId, int dayOfWeek,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.doctor.NoSuchDoctorScheduleException;

	/**
	* Returns the last doctor schedule in the ordered set where doctorId = &#63; and dayOfWeek = &#63;.
	*
	* @param doctorId the doctor ID
	* @param dayOfWeek the day of week
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching doctor schedule, or <code>null</code> if a matching doctor schedule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.doctor.model.DoctorSchedule fetchByDoctorIdAndDayOfWeek_Last(
		long doctorId, int dayOfWeek,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public salutem.doctor.model.DoctorSchedule[] findByDoctorIdAndDayOfWeek_PrevAndNext(
		long scheduleId, long doctorId, int dayOfWeek,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.doctor.NoSuchDoctorScheduleException;

	/**
	* Removes all the doctor schedules where doctorId = &#63; and dayOfWeek = &#63; from the database.
	*
	* @param doctorId the doctor ID
	* @param dayOfWeek the day of week
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDoctorIdAndDayOfWeek(long doctorId, int dayOfWeek)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of doctor schedules where doctorId = &#63; and dayOfWeek = &#63;.
	*
	* @param doctorId the doctor ID
	* @param dayOfWeek the day of week
	* @return the number of matching doctor schedules
	* @throws SystemException if a system exception occurred
	*/
	public int countByDoctorIdAndDayOfWeek(long doctorId, int dayOfWeek)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the doctor schedule in the entity cache if it is enabled.
	*
	* @param doctorSchedule the doctor schedule
	*/
	public void cacheResult(salutem.doctor.model.DoctorSchedule doctorSchedule);

	/**
	* Caches the doctor schedules in the entity cache if it is enabled.
	*
	* @param doctorSchedules the doctor schedules
	*/
	public void cacheResult(
		java.util.List<salutem.doctor.model.DoctorSchedule> doctorSchedules);

	/**
	* Creates a new doctor schedule with the primary key. Does not add the doctor schedule to the database.
	*
	* @param scheduleId the primary key for the new doctor schedule
	* @return the new doctor schedule
	*/
	public salutem.doctor.model.DoctorSchedule create(long scheduleId);

	/**
	* Removes the doctor schedule with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param scheduleId the primary key of the doctor schedule
	* @return the doctor schedule that was removed
	* @throws salutem.doctor.NoSuchDoctorScheduleException if a doctor schedule with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.doctor.model.DoctorSchedule remove(long scheduleId)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.doctor.NoSuchDoctorScheduleException;

	public salutem.doctor.model.DoctorSchedule updateImpl(
		salutem.doctor.model.DoctorSchedule doctorSchedule)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the doctor schedule with the primary key or throws a {@link salutem.doctor.NoSuchDoctorScheduleException} if it could not be found.
	*
	* @param scheduleId the primary key of the doctor schedule
	* @return the doctor schedule
	* @throws salutem.doctor.NoSuchDoctorScheduleException if a doctor schedule with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.doctor.model.DoctorSchedule findByPrimaryKey(long scheduleId)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.doctor.NoSuchDoctorScheduleException;

	/**
	* Returns the doctor schedule with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param scheduleId the primary key of the doctor schedule
	* @return the doctor schedule, or <code>null</code> if a doctor schedule with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.doctor.model.DoctorSchedule fetchByPrimaryKey(
		long scheduleId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the doctor schedules.
	*
	* @return the doctor schedules
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<salutem.doctor.model.DoctorSchedule> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<salutem.doctor.model.DoctorSchedule> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<salutem.doctor.model.DoctorSchedule> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the doctor schedules from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of doctor schedules.
	*
	* @return the number of doctor schedules
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}