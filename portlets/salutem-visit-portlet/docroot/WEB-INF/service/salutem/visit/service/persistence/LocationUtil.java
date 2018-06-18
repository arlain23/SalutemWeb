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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import salutem.visit.model.Location;

import java.util.List;

/**
 * The persistence utility for the location service. This utility wraps {@link LocationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Aneta Andrzejewska
 * @see LocationPersistence
 * @see LocationPersistenceImpl
 * @generated
 */
public class LocationUtil {
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
	public static void clearCache(Location location) {
		getPersistence().clearCache(location);
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
	public static List<Location> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Location> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Location> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Location update(Location location) throws SystemException {
		return getPersistence().update(location);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Location update(Location location,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(location, serviceContext);
	}

	/**
	* Returns all the locations where patientId = &#63;.
	*
	* @param patientId the patient ID
	* @return the matching locations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.visit.model.Location> findByPatientId(
		long patientId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPatientId(patientId);
	}

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
	public static java.util.List<salutem.visit.model.Location> findByPatientId(
		long patientId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPatientId(patientId, start, end);
	}

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
	public static java.util.List<salutem.visit.model.Location> findByPatientId(
		long patientId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPatientId(patientId, start, end, orderByComparator);
	}

	/**
	* Returns the first location in the ordered set where patientId = &#63;.
	*
	* @param patientId the patient ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching location
	* @throws salutem.visit.NoSuchLocationException if a matching location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Location findByPatientId_First(
		long patientId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchLocationException {
		return getPersistence()
				   .findByPatientId_First(patientId, orderByComparator);
	}

	/**
	* Returns the first location in the ordered set where patientId = &#63;.
	*
	* @param patientId the patient ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching location, or <code>null</code> if a matching location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Location fetchByPatientId_First(
		long patientId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPatientId_First(patientId, orderByComparator);
	}

	/**
	* Returns the last location in the ordered set where patientId = &#63;.
	*
	* @param patientId the patient ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching location
	* @throws salutem.visit.NoSuchLocationException if a matching location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Location findByPatientId_Last(
		long patientId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchLocationException {
		return getPersistence()
				   .findByPatientId_Last(patientId, orderByComparator);
	}

	/**
	* Returns the last location in the ordered set where patientId = &#63;.
	*
	* @param patientId the patient ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching location, or <code>null</code> if a matching location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Location fetchByPatientId_Last(
		long patientId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPatientId_Last(patientId, orderByComparator);
	}

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
	public static salutem.visit.model.Location[] findByPatientId_PrevAndNext(
		long locationId, long patientId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchLocationException {
		return getPersistence()
				   .findByPatientId_PrevAndNext(locationId, patientId,
			orderByComparator);
	}

	/**
	* Removes all the locations where patientId = &#63; from the database.
	*
	* @param patientId the patient ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPatientId(long patientId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPatientId(patientId);
	}

	/**
	* Returns the number of locations where patientId = &#63;.
	*
	* @param patientId the patient ID
	* @return the number of matching locations
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPatientId(long patientId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPatientId(patientId);
	}

	/**
	* Returns all the locations where patientId = &#63; and year = &#63;.
	*
	* @param patientId the patient ID
	* @param year the year
	* @return the matching locations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.visit.model.Location> findByPatientIdAndYear(
		long patientId, int year)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPatientIdAndYear(patientId, year);
	}

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
	public static java.util.List<salutem.visit.model.Location> findByPatientIdAndYear(
		long patientId, int year, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPatientIdAndYear(patientId, year, start, end);
	}

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
	public static java.util.List<salutem.visit.model.Location> findByPatientIdAndYear(
		long patientId, int year, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPatientIdAndYear(patientId, year, start, end,
			orderByComparator);
	}

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
	public static salutem.visit.model.Location findByPatientIdAndYear_First(
		long patientId, int year,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchLocationException {
		return getPersistence()
				   .findByPatientIdAndYear_First(patientId, year,
			orderByComparator);
	}

	/**
	* Returns the first location in the ordered set where patientId = &#63; and year = &#63;.
	*
	* @param patientId the patient ID
	* @param year the year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching location, or <code>null</code> if a matching location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Location fetchByPatientIdAndYear_First(
		long patientId, int year,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPatientIdAndYear_First(patientId, year,
			orderByComparator);
	}

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
	public static salutem.visit.model.Location findByPatientIdAndYear_Last(
		long patientId, int year,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchLocationException {
		return getPersistence()
				   .findByPatientIdAndYear_Last(patientId, year,
			orderByComparator);
	}

	/**
	* Returns the last location in the ordered set where patientId = &#63; and year = &#63;.
	*
	* @param patientId the patient ID
	* @param year the year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching location, or <code>null</code> if a matching location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Location fetchByPatientIdAndYear_Last(
		long patientId, int year,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPatientIdAndYear_Last(patientId, year,
			orderByComparator);
	}

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
	public static salutem.visit.model.Location[] findByPatientIdAndYear_PrevAndNext(
		long locationId, long patientId, int year,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchLocationException {
		return getPersistence()
				   .findByPatientIdAndYear_PrevAndNext(locationId, patientId,
			year, orderByComparator);
	}

	/**
	* Removes all the locations where patientId = &#63; and year = &#63; from the database.
	*
	* @param patientId the patient ID
	* @param year the year
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPatientIdAndYear(long patientId, int year)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPatientIdAndYear(patientId, year);
	}

	/**
	* Returns the number of locations where patientId = &#63; and year = &#63;.
	*
	* @param patientId the patient ID
	* @param year the year
	* @return the number of matching locations
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPatientIdAndYear(long patientId, int year)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPatientIdAndYear(patientId, year);
	}

	/**
	* Returns all the locations where patientId = &#63; and year = &#63; and month = &#63;.
	*
	* @param patientId the patient ID
	* @param year the year
	* @param month the month
	* @return the matching locations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.visit.model.Location> findByPatientIdAndYearAndMonth(
		long patientId, int year, int month)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPatientIdAndYearAndMonth(patientId, year, month);
	}

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
	public static java.util.List<salutem.visit.model.Location> findByPatientIdAndYearAndMonth(
		long patientId, int year, int month, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPatientIdAndYearAndMonth(patientId, year, month,
			start, end);
	}

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
	public static java.util.List<salutem.visit.model.Location> findByPatientIdAndYearAndMonth(
		long patientId, int year, int month, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPatientIdAndYearAndMonth(patientId, year, month,
			start, end, orderByComparator);
	}

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
	public static salutem.visit.model.Location findByPatientIdAndYearAndMonth_First(
		long patientId, int year, int month,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchLocationException {
		return getPersistence()
				   .findByPatientIdAndYearAndMonth_First(patientId, year,
			month, orderByComparator);
	}

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
	public static salutem.visit.model.Location fetchByPatientIdAndYearAndMonth_First(
		long patientId, int year, int month,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPatientIdAndYearAndMonth_First(patientId, year,
			month, orderByComparator);
	}

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
	public static salutem.visit.model.Location findByPatientIdAndYearAndMonth_Last(
		long patientId, int year, int month,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchLocationException {
		return getPersistence()
				   .findByPatientIdAndYearAndMonth_Last(patientId, year, month,
			orderByComparator);
	}

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
	public static salutem.visit.model.Location fetchByPatientIdAndYearAndMonth_Last(
		long patientId, int year, int month,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPatientIdAndYearAndMonth_Last(patientId, year,
			month, orderByComparator);
	}

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
	public static salutem.visit.model.Location[] findByPatientIdAndYearAndMonth_PrevAndNext(
		long locationId, long patientId, int year, int month,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchLocationException {
		return getPersistence()
				   .findByPatientIdAndYearAndMonth_PrevAndNext(locationId,
			patientId, year, month, orderByComparator);
	}

	/**
	* Removes all the locations where patientId = &#63; and year = &#63; and month = &#63; from the database.
	*
	* @param patientId the patient ID
	* @param year the year
	* @param month the month
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPatientIdAndYearAndMonth(long patientId,
		int year, int month)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPatientIdAndYearAndMonth(patientId, year, month);
	}

	/**
	* Returns the number of locations where patientId = &#63; and year = &#63; and month = &#63;.
	*
	* @param patientId the patient ID
	* @param year the year
	* @param month the month
	* @return the number of matching locations
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPatientIdAndYearAndMonth(long patientId, int year,
		int month) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByPatientIdAndYearAndMonth(patientId, year, month);
	}

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
	public static java.util.List<salutem.visit.model.Location> findByPatientIdAndYearAndMonthAndDay(
		long patientId, int year, int month, int day)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPatientIdAndYearAndMonthAndDay(patientId, year,
			month, day);
	}

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
	public static java.util.List<salutem.visit.model.Location> findByPatientIdAndYearAndMonthAndDay(
		long patientId, int year, int month, int day, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPatientIdAndYearAndMonthAndDay(patientId, year,
			month, day, start, end);
	}

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
	public static java.util.List<salutem.visit.model.Location> findByPatientIdAndYearAndMonthAndDay(
		long patientId, int year, int month, int day, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPatientIdAndYearAndMonthAndDay(patientId, year,
			month, day, start, end, orderByComparator);
	}

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
	public static salutem.visit.model.Location findByPatientIdAndYearAndMonthAndDay_First(
		long patientId, int year, int month, int day,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchLocationException {
		return getPersistence()
				   .findByPatientIdAndYearAndMonthAndDay_First(patientId, year,
			month, day, orderByComparator);
	}

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
	public static salutem.visit.model.Location fetchByPatientIdAndYearAndMonthAndDay_First(
		long patientId, int year, int month, int day,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPatientIdAndYearAndMonthAndDay_First(patientId,
			year, month, day, orderByComparator);
	}

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
	public static salutem.visit.model.Location findByPatientIdAndYearAndMonthAndDay_Last(
		long patientId, int year, int month, int day,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchLocationException {
		return getPersistence()
				   .findByPatientIdAndYearAndMonthAndDay_Last(patientId, year,
			month, day, orderByComparator);
	}

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
	public static salutem.visit.model.Location fetchByPatientIdAndYearAndMonthAndDay_Last(
		long patientId, int year, int month, int day,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPatientIdAndYearAndMonthAndDay_Last(patientId, year,
			month, day, orderByComparator);
	}

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
	public static salutem.visit.model.Location[] findByPatientIdAndYearAndMonthAndDay_PrevAndNext(
		long locationId, long patientId, int year, int month, int day,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchLocationException {
		return getPersistence()
				   .findByPatientIdAndYearAndMonthAndDay_PrevAndNext(locationId,
			patientId, year, month, day, orderByComparator);
	}

	/**
	* Removes all the locations where patientId = &#63; and year = &#63; and month = &#63; and day = &#63; from the database.
	*
	* @param patientId the patient ID
	* @param year the year
	* @param month the month
	* @param day the day
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPatientIdAndYearAndMonthAndDay(long patientId,
		int year, int month, int day)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByPatientIdAndYearAndMonthAndDay(patientId, year, month, day);
	}

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
	public static int countByPatientIdAndYearAndMonthAndDay(long patientId,
		int year, int month, int day)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByPatientIdAndYearAndMonthAndDay(patientId, year,
			month, day);
	}

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
	public static java.util.List<salutem.visit.model.Location> findByPatientIdAndYearAndMonthAndDayAndLatAndLon(
		long patientId, int year, int month, int day, double lat, double lon)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPatientIdAndYearAndMonthAndDayAndLatAndLon(patientId,
			year, month, day, lat, lon);
	}

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
	public static java.util.List<salutem.visit.model.Location> findByPatientIdAndYearAndMonthAndDayAndLatAndLon(
		long patientId, int year, int month, int day, double lat, double lon,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPatientIdAndYearAndMonthAndDayAndLatAndLon(patientId,
			year, month, day, lat, lon, start, end);
	}

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
	public static java.util.List<salutem.visit.model.Location> findByPatientIdAndYearAndMonthAndDayAndLatAndLon(
		long patientId, int year, int month, int day, double lat, double lon,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPatientIdAndYearAndMonthAndDayAndLatAndLon(patientId,
			year, month, day, lat, lon, start, end, orderByComparator);
	}

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
	public static salutem.visit.model.Location findByPatientIdAndYearAndMonthAndDayAndLatAndLon_First(
		long patientId, int year, int month, int day, double lat, double lon,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchLocationException {
		return getPersistence()
				   .findByPatientIdAndYearAndMonthAndDayAndLatAndLon_First(patientId,
			year, month, day, lat, lon, orderByComparator);
	}

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
	public static salutem.visit.model.Location fetchByPatientIdAndYearAndMonthAndDayAndLatAndLon_First(
		long patientId, int year, int month, int day, double lat, double lon,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPatientIdAndYearAndMonthAndDayAndLatAndLon_First(patientId,
			year, month, day, lat, lon, orderByComparator);
	}

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
	public static salutem.visit.model.Location findByPatientIdAndYearAndMonthAndDayAndLatAndLon_Last(
		long patientId, int year, int month, int day, double lat, double lon,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchLocationException {
		return getPersistence()
				   .findByPatientIdAndYearAndMonthAndDayAndLatAndLon_Last(patientId,
			year, month, day, lat, lon, orderByComparator);
	}

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
	public static salutem.visit.model.Location fetchByPatientIdAndYearAndMonthAndDayAndLatAndLon_Last(
		long patientId, int year, int month, int day, double lat, double lon,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPatientIdAndYearAndMonthAndDayAndLatAndLon_Last(patientId,
			year, month, day, lat, lon, orderByComparator);
	}

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
	public static salutem.visit.model.Location[] findByPatientIdAndYearAndMonthAndDayAndLatAndLon_PrevAndNext(
		long locationId, long patientId, int year, int month, int day,
		double lat, double lon,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchLocationException {
		return getPersistence()
				   .findByPatientIdAndYearAndMonthAndDayAndLatAndLon_PrevAndNext(locationId,
			patientId, year, month, day, lat, lon, orderByComparator);
	}

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
	public static void removeByPatientIdAndYearAndMonthAndDayAndLatAndLon(
		long patientId, int year, int month, int day, double lat, double lon)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByPatientIdAndYearAndMonthAndDayAndLatAndLon(patientId,
			year, month, day, lat, lon);
	}

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
	public static int countByPatientIdAndYearAndMonthAndDayAndLatAndLon(
		long patientId, int year, int month, int day, double lat, double lon)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByPatientIdAndYearAndMonthAndDayAndLatAndLon(patientId,
			year, month, day, lat, lon);
	}

	/**
	* Caches the location in the entity cache if it is enabled.
	*
	* @param location the location
	*/
	public static void cacheResult(salutem.visit.model.Location location) {
		getPersistence().cacheResult(location);
	}

	/**
	* Caches the locations in the entity cache if it is enabled.
	*
	* @param locations the locations
	*/
	public static void cacheResult(
		java.util.List<salutem.visit.model.Location> locations) {
		getPersistence().cacheResult(locations);
	}

	/**
	* Creates a new location with the primary key. Does not add the location to the database.
	*
	* @param locationId the primary key for the new location
	* @return the new location
	*/
	public static salutem.visit.model.Location create(long locationId) {
		return getPersistence().create(locationId);
	}

	/**
	* Removes the location with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param locationId the primary key of the location
	* @return the location that was removed
	* @throws salutem.visit.NoSuchLocationException if a location with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Location remove(long locationId)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchLocationException {
		return getPersistence().remove(locationId);
	}

	public static salutem.visit.model.Location updateImpl(
		salutem.visit.model.Location location)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(location);
	}

	/**
	* Returns the location with the primary key or throws a {@link salutem.visit.NoSuchLocationException} if it could not be found.
	*
	* @param locationId the primary key of the location
	* @return the location
	* @throws salutem.visit.NoSuchLocationException if a location with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Location findByPrimaryKey(long locationId)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchLocationException {
		return getPersistence().findByPrimaryKey(locationId);
	}

	/**
	* Returns the location with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param locationId the primary key of the location
	* @return the location, or <code>null</code> if a location with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Location fetchByPrimaryKey(
		long locationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(locationId);
	}

	/**
	* Returns all the locations.
	*
	* @return the locations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.visit.model.Location> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<salutem.visit.model.Location> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<salutem.visit.model.Location> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the locations from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of locations.
	*
	* @return the number of locations
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static LocationPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (LocationPersistence)PortletBeanLocatorUtil.locate(salutem.visit.service.ClpSerializer.getServletContextName(),
					LocationPersistence.class.getName());

			ReferenceRegistry.registerReference(LocationUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(LocationPersistence persistence) {
	}

	private static LocationPersistence _persistence;
}