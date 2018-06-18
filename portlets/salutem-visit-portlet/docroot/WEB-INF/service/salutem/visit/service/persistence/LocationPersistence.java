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

package salutem.visit.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import salutem.visit.model.Location;

/**
 * The persistence interface for the location service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Aneta Andrzejewska
 * @see LocationPersistenceImpl
 * @see LocationUtil
 * @generated
 */
public interface LocationPersistence extends BasePersistence<Location> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LocationUtil} to access the location persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the locations where patientId = &#63;.
	*
	* @param patientId the patient ID
	* @return the matching locations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<salutem.visit.model.Location> findByPatientId(
		long patientId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the locations where patientId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.LocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param patientId the patient ID
	* @param start the lower bound of the range of locations
	* @param end the upper bound of the range of locations (not inclusive)
	* @return the range of matching locations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<salutem.visit.model.Location> findByPatientId(
		long patientId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the locations where patientId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.LocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param patientId the patient ID
	* @param start the lower bound of the range of locations
	* @param end the upper bound of the range of locations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching locations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<salutem.visit.model.Location> findByPatientId(
		long patientId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first location in the ordered set where patientId = &#63;.
	*
	* @param patientId the patient ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching location
	* @throws salutem.visit.NoSuchLocationException if a matching location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.Location findByPatientId_First(long patientId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchLocationException;

	/**
	* Returns the first location in the ordered set where patientId = &#63;.
	*
	* @param patientId the patient ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching location, or <code>null</code> if a matching location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.Location fetchByPatientId_First(long patientId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last location in the ordered set where patientId = &#63;.
	*
	* @param patientId the patient ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching location
	* @throws salutem.visit.NoSuchLocationException if a matching location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.Location findByPatientId_Last(long patientId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchLocationException;

	/**
	* Returns the last location in the ordered set where patientId = &#63;.
	*
	* @param patientId the patient ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching location, or <code>null</code> if a matching location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.Location fetchByPatientId_Last(long patientId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the locations before and after the current location in the ordered set where patientId = &#63;.
	*
	* @param locationId the primary key of the current location
	* @param patientId the patient ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next location
	* @throws salutem.visit.NoSuchLocationException if a location with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.Location[] findByPatientId_PrevAndNext(
		long locationId, long patientId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchLocationException;

	/**
	* Removes all the locations where patientId = &#63; from the database.
	*
	* @param patientId the patient ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPatientId(long patientId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of locations where patientId = &#63;.
	*
	* @param patientId the patient ID
	* @return the number of matching locations
	* @throws SystemException if a system exception occurred
	*/
	public int countByPatientId(long patientId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the locations where patientId = &#63; and year = &#63;.
	*
	* @param patientId the patient ID
	* @param year the year
	* @return the matching locations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<salutem.visit.model.Location> findByPatientIdAndYear(
		long patientId, int year)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the locations where patientId = &#63; and year = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.LocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param patientId the patient ID
	* @param year the year
	* @param start the lower bound of the range of locations
	* @param end the upper bound of the range of locations (not inclusive)
	* @return the range of matching locations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<salutem.visit.model.Location> findByPatientIdAndYear(
		long patientId, int year, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the locations where patientId = &#63; and year = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.LocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param patientId the patient ID
	* @param year the year
	* @param start the lower bound of the range of locations
	* @param end the upper bound of the range of locations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching locations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<salutem.visit.model.Location> findByPatientIdAndYear(
		long patientId, int year, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first location in the ordered set where patientId = &#63; and year = &#63;.
	*
	* @param patientId the patient ID
	* @param year the year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching location
	* @throws salutem.visit.NoSuchLocationException if a matching location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.Location findByPatientIdAndYear_First(
		long patientId, int year,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchLocationException;

	/**
	* Returns the first location in the ordered set where patientId = &#63; and year = &#63;.
	*
	* @param patientId the patient ID
	* @param year the year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching location, or <code>null</code> if a matching location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.Location fetchByPatientIdAndYear_First(
		long patientId, int year,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last location in the ordered set where patientId = &#63; and year = &#63;.
	*
	* @param patientId the patient ID
	* @param year the year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching location
	* @throws salutem.visit.NoSuchLocationException if a matching location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.Location findByPatientIdAndYear_Last(
		long patientId, int year,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchLocationException;

	/**
	* Returns the last location in the ordered set where patientId = &#63; and year = &#63;.
	*
	* @param patientId the patient ID
	* @param year the year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching location, or <code>null</code> if a matching location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.Location fetchByPatientIdAndYear_Last(
		long patientId, int year,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the locations before and after the current location in the ordered set where patientId = &#63; and year = &#63;.
	*
	* @param locationId the primary key of the current location
	* @param patientId the patient ID
	* @param year the year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next location
	* @throws salutem.visit.NoSuchLocationException if a location with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.Location[] findByPatientIdAndYear_PrevAndNext(
		long locationId, long patientId, int year,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchLocationException;

	/**
	* Removes all the locations where patientId = &#63; and year = &#63; from the database.
	*
	* @param patientId the patient ID
	* @param year the year
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPatientIdAndYear(long patientId, int year)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of locations where patientId = &#63; and year = &#63;.
	*
	* @param patientId the patient ID
	* @param year the year
	* @return the number of matching locations
	* @throws SystemException if a system exception occurred
	*/
	public int countByPatientIdAndYear(long patientId, int year)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the locations where patientId = &#63; and year = &#63; and month = &#63;.
	*
	* @param patientId the patient ID
	* @param year the year
	* @param month the month
	* @return the matching locations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<salutem.visit.model.Location> findByPatientIdAndYearAndMonth(
		long patientId, int year, int month)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the locations where patientId = &#63; and year = &#63; and month = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.LocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param patientId the patient ID
	* @param year the year
	* @param month the month
	* @param start the lower bound of the range of locations
	* @param end the upper bound of the range of locations (not inclusive)
	* @return the range of matching locations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<salutem.visit.model.Location> findByPatientIdAndYearAndMonth(
		long patientId, int year, int month, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the locations where patientId = &#63; and year = &#63; and month = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.LocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param patientId the patient ID
	* @param year the year
	* @param month the month
	* @param start the lower bound of the range of locations
	* @param end the upper bound of the range of locations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching locations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<salutem.visit.model.Location> findByPatientIdAndYearAndMonth(
		long patientId, int year, int month, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first location in the ordered set where patientId = &#63; and year = &#63; and month = &#63;.
	*
	* @param patientId the patient ID
	* @param year the year
	* @param month the month
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching location
	* @throws salutem.visit.NoSuchLocationException if a matching location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.Location findByPatientIdAndYearAndMonth_First(
		long patientId, int year, int month,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchLocationException;

	/**
	* Returns the first location in the ordered set where patientId = &#63; and year = &#63; and month = &#63;.
	*
	* @param patientId the patient ID
	* @param year the year
	* @param month the month
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching location, or <code>null</code> if a matching location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.Location fetchByPatientIdAndYearAndMonth_First(
		long patientId, int year, int month,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last location in the ordered set where patientId = &#63; and year = &#63; and month = &#63;.
	*
	* @param patientId the patient ID
	* @param year the year
	* @param month the month
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching location
	* @throws salutem.visit.NoSuchLocationException if a matching location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.Location findByPatientIdAndYearAndMonth_Last(
		long patientId, int year, int month,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchLocationException;

	/**
	* Returns the last location in the ordered set where patientId = &#63; and year = &#63; and month = &#63;.
	*
	* @param patientId the patient ID
	* @param year the year
	* @param month the month
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching location, or <code>null</code> if a matching location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.Location fetchByPatientIdAndYearAndMonth_Last(
		long patientId, int year, int month,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the locations before and after the current location in the ordered set where patientId = &#63; and year = &#63; and month = &#63;.
	*
	* @param locationId the primary key of the current location
	* @param patientId the patient ID
	* @param year the year
	* @param month the month
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next location
	* @throws salutem.visit.NoSuchLocationException if a location with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.Location[] findByPatientIdAndYearAndMonth_PrevAndNext(
		long locationId, long patientId, int year, int month,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchLocationException;

	/**
	* Removes all the locations where patientId = &#63; and year = &#63; and month = &#63; from the database.
	*
	* @param patientId the patient ID
	* @param year the year
	* @param month the month
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPatientIdAndYearAndMonth(long patientId, int year,
		int month) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of locations where patientId = &#63; and year = &#63; and month = &#63;.
	*
	* @param patientId the patient ID
	* @param year the year
	* @param month the month
	* @return the number of matching locations
	* @throws SystemException if a system exception occurred
	*/
	public int countByPatientIdAndYearAndMonth(long patientId, int year,
		int month) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the locations where patientId = &#63; and year = &#63; and month = &#63; and day = &#63;.
	*
	* @param patientId the patient ID
	* @param year the year
	* @param month the month
	* @param day the day
	* @return the matching locations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<salutem.visit.model.Location> findByPatientIdAndYearAndMonthAndDay(
		long patientId, int year, int month, int day)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the locations where patientId = &#63; and year = &#63; and month = &#63; and day = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.LocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param patientId the patient ID
	* @param year the year
	* @param month the month
	* @param day the day
	* @param start the lower bound of the range of locations
	* @param end the upper bound of the range of locations (not inclusive)
	* @return the range of matching locations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<salutem.visit.model.Location> findByPatientIdAndYearAndMonthAndDay(
		long patientId, int year, int month, int day, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the locations where patientId = &#63; and year = &#63; and month = &#63; and day = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.LocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param patientId the patient ID
	* @param year the year
	* @param month the month
	* @param day the day
	* @param start the lower bound of the range of locations
	* @param end the upper bound of the range of locations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching locations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<salutem.visit.model.Location> findByPatientIdAndYearAndMonthAndDay(
		long patientId, int year, int month, int day, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first location in the ordered set where patientId = &#63; and year = &#63; and month = &#63; and day = &#63;.
	*
	* @param patientId the patient ID
	* @param year the year
	* @param month the month
	* @param day the day
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching location
	* @throws salutem.visit.NoSuchLocationException if a matching location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.Location findByPatientIdAndYearAndMonthAndDay_First(
		long patientId, int year, int month, int day,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchLocationException;

	/**
	* Returns the first location in the ordered set where patientId = &#63; and year = &#63; and month = &#63; and day = &#63;.
	*
	* @param patientId the patient ID
	* @param year the year
	* @param month the month
	* @param day the day
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching location, or <code>null</code> if a matching location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.Location fetchByPatientIdAndYearAndMonthAndDay_First(
		long patientId, int year, int month, int day,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last location in the ordered set where patientId = &#63; and year = &#63; and month = &#63; and day = &#63;.
	*
	* @param patientId the patient ID
	* @param year the year
	* @param month the month
	* @param day the day
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching location
	* @throws salutem.visit.NoSuchLocationException if a matching location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.Location findByPatientIdAndYearAndMonthAndDay_Last(
		long patientId, int year, int month, int day,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchLocationException;

	/**
	* Returns the last location in the ordered set where patientId = &#63; and year = &#63; and month = &#63; and day = &#63;.
	*
	* @param patientId the patient ID
	* @param year the year
	* @param month the month
	* @param day the day
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching location, or <code>null</code> if a matching location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.Location fetchByPatientIdAndYearAndMonthAndDay_Last(
		long patientId, int year, int month, int day,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the locations before and after the current location in the ordered set where patientId = &#63; and year = &#63; and month = &#63; and day = &#63;.
	*
	* @param locationId the primary key of the current location
	* @param patientId the patient ID
	* @param year the year
	* @param month the month
	* @param day the day
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next location
	* @throws salutem.visit.NoSuchLocationException if a location with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.Location[] findByPatientIdAndYearAndMonthAndDay_PrevAndNext(
		long locationId, long patientId, int year, int month, int day,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchLocationException;

	/**
	* Removes all the locations where patientId = &#63; and year = &#63; and month = &#63; and day = &#63; from the database.
	*
	* @param patientId the patient ID
	* @param year the year
	* @param month the month
	* @param day the day
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPatientIdAndYearAndMonthAndDay(long patientId,
		int year, int month, int day)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of locations where patientId = &#63; and year = &#63; and month = &#63; and day = &#63;.
	*
	* @param patientId the patient ID
	* @param year the year
	* @param month the month
	* @param day the day
	* @return the number of matching locations
	* @throws SystemException if a system exception occurred
	*/
	public int countByPatientIdAndYearAndMonthAndDay(long patientId, int year,
		int month, int day)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the locations where patientId = &#63; and year = &#63; and month = &#63; and day = &#63; and lat = &#63; and lon = &#63;.
	*
	* @param patientId the patient ID
	* @param year the year
	* @param month the month
	* @param day the day
	* @param lat the lat
	* @param lon the lon
	* @return the matching locations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<salutem.visit.model.Location> findByPatientIdAndYearAndMonthAndDayAndLatAndLon(
		long patientId, int year, int month, int day, double lat, double lon)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the locations where patientId = &#63; and year = &#63; and month = &#63; and day = &#63; and lat = &#63; and lon = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.LocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param patientId the patient ID
	* @param year the year
	* @param month the month
	* @param day the day
	* @param lat the lat
	* @param lon the lon
	* @param start the lower bound of the range of locations
	* @param end the upper bound of the range of locations (not inclusive)
	* @return the range of matching locations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<salutem.visit.model.Location> findByPatientIdAndYearAndMonthAndDayAndLatAndLon(
		long patientId, int year, int month, int day, double lat, double lon,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the locations where patientId = &#63; and year = &#63; and month = &#63; and day = &#63; and lat = &#63; and lon = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.LocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param patientId the patient ID
	* @param year the year
	* @param month the month
	* @param day the day
	* @param lat the lat
	* @param lon the lon
	* @param start the lower bound of the range of locations
	* @param end the upper bound of the range of locations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching locations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<salutem.visit.model.Location> findByPatientIdAndYearAndMonthAndDayAndLatAndLon(
		long patientId, int year, int month, int day, double lat, double lon,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first location in the ordered set where patientId = &#63; and year = &#63; and month = &#63; and day = &#63; and lat = &#63; and lon = &#63;.
	*
	* @param patientId the patient ID
	* @param year the year
	* @param month the month
	* @param day the day
	* @param lat the lat
	* @param lon the lon
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching location
	* @throws salutem.visit.NoSuchLocationException if a matching location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.Location findByPatientIdAndYearAndMonthAndDayAndLatAndLon_First(
		long patientId, int year, int month, int day, double lat, double lon,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchLocationException;

	/**
	* Returns the first location in the ordered set where patientId = &#63; and year = &#63; and month = &#63; and day = &#63; and lat = &#63; and lon = &#63;.
	*
	* @param patientId the patient ID
	* @param year the year
	* @param month the month
	* @param day the day
	* @param lat the lat
	* @param lon the lon
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching location, or <code>null</code> if a matching location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.Location fetchByPatientIdAndYearAndMonthAndDayAndLatAndLon_First(
		long patientId, int year, int month, int day, double lat, double lon,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last location in the ordered set where patientId = &#63; and year = &#63; and month = &#63; and day = &#63; and lat = &#63; and lon = &#63;.
	*
	* @param patientId the patient ID
	* @param year the year
	* @param month the month
	* @param day the day
	* @param lat the lat
	* @param lon the lon
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching location
	* @throws salutem.visit.NoSuchLocationException if a matching location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.Location findByPatientIdAndYearAndMonthAndDayAndLatAndLon_Last(
		long patientId, int year, int month, int day, double lat, double lon,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchLocationException;

	/**
	* Returns the last location in the ordered set where patientId = &#63; and year = &#63; and month = &#63; and day = &#63; and lat = &#63; and lon = &#63;.
	*
	* @param patientId the patient ID
	* @param year the year
	* @param month the month
	* @param day the day
	* @param lat the lat
	* @param lon the lon
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching location, or <code>null</code> if a matching location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.Location fetchByPatientIdAndYearAndMonthAndDayAndLatAndLon_Last(
		long patientId, int year, int month, int day, double lat, double lon,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the locations before and after the current location in the ordered set where patientId = &#63; and year = &#63; and month = &#63; and day = &#63; and lat = &#63; and lon = &#63;.
	*
	* @param locationId the primary key of the current location
	* @param patientId the patient ID
	* @param year the year
	* @param month the month
	* @param day the day
	* @param lat the lat
	* @param lon the lon
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next location
	* @throws salutem.visit.NoSuchLocationException if a location with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.Location[] findByPatientIdAndYearAndMonthAndDayAndLatAndLon_PrevAndNext(
		long locationId, long patientId, int year, int month, int day,
		double lat, double lon,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchLocationException;

	/**
	* Removes all the locations where patientId = &#63; and year = &#63; and month = &#63; and day = &#63; and lat = &#63; and lon = &#63; from the database.
	*
	* @param patientId the patient ID
	* @param year the year
	* @param month the month
	* @param day the day
	* @param lat the lat
	* @param lon the lon
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPatientIdAndYearAndMonthAndDayAndLatAndLon(
		long patientId, int year, int month, int day, double lat, double lon)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of locations where patientId = &#63; and year = &#63; and month = &#63; and day = &#63; and lat = &#63; and lon = &#63;.
	*
	* @param patientId the patient ID
	* @param year the year
	* @param month the month
	* @param day the day
	* @param lat the lat
	* @param lon the lon
	* @return the number of matching locations
	* @throws SystemException if a system exception occurred
	*/
	public int countByPatientIdAndYearAndMonthAndDayAndLatAndLon(
		long patientId, int year, int month, int day, double lat, double lon)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the location in the entity cache if it is enabled.
	*
	* @param location the location
	*/
	public void cacheResult(salutem.visit.model.Location location);

	/**
	* Caches the locations in the entity cache if it is enabled.
	*
	* @param locations the locations
	*/
	public void cacheResult(
		java.util.List<salutem.visit.model.Location> locations);

	/**
	* Creates a new location with the primary key. Does not add the location to the database.
	*
	* @param locationId the primary key for the new location
	* @return the new location
	*/
	public salutem.visit.model.Location create(long locationId);

	/**
	* Removes the location with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param locationId the primary key of the location
	* @return the location that was removed
	* @throws salutem.visit.NoSuchLocationException if a location with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.Location remove(long locationId)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchLocationException;

	public salutem.visit.model.Location updateImpl(
		salutem.visit.model.Location location)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the location with the primary key or throws a {@link salutem.visit.NoSuchLocationException} if it could not be found.
	*
	* @param locationId the primary key of the location
	* @return the location
	* @throws salutem.visit.NoSuchLocationException if a location with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.Location findByPrimaryKey(long locationId)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchLocationException;

	/**
	* Returns the location with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param locationId the primary key of the location
	* @return the location, or <code>null</code> if a location with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.Location fetchByPrimaryKey(long locationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the locations.
	*
	* @return the locations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<salutem.visit.model.Location> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the locations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.LocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of locations
	* @param end the upper bound of the range of locations (not inclusive)
	* @return the range of locations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<salutem.visit.model.Location> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the locations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.LocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of locations
	* @param end the upper bound of the range of locations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of locations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<salutem.visit.model.Location> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the locations from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of locations.
	*
	* @return the number of locations
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}