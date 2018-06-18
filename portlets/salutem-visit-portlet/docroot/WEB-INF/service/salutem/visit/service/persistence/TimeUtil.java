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

import salutem.visit.model.Time;

import java.util.List;

/**
 * The persistence utility for the time service. This utility wraps {@link TimePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Aneta Andrzejewska
 * @see TimePersistence
 * @see TimePersistenceImpl
 * @generated
 */
public class TimeUtil {
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
	public static void clearCache(Time time) {
		getPersistence().clearCache(time);
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
	public static List<Time> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Time> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Time> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Time update(Time time) throws SystemException {
		return getPersistence().update(time);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Time update(Time time, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(time, serviceContext);
	}

	/**
	* Returns all the times where entryUuid = &#63;.
	*
	* @param entryUuid the entry uuid
	* @return the matching times
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.visit.model.Time> findByUUID(
		java.lang.String entryUuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUUID(entryUuid);
	}

	/**
	* Returns a range of all the times where entryUuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.TimeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param entryUuid the entry uuid
	* @param start the lower bound of the range of times
	* @param end the upper bound of the range of times (not inclusive)
	* @return the range of matching times
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.visit.model.Time> findByUUID(
		java.lang.String entryUuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUUID(entryUuid, start, end);
	}

	/**
	* Returns an ordered range of all the times where entryUuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.TimeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param entryUuid the entry uuid
	* @param start the lower bound of the range of times
	* @param end the upper bound of the range of times (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching times
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.visit.model.Time> findByUUID(
		java.lang.String entryUuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUUID(entryUuid, start, end, orderByComparator);
	}

	/**
	* Returns the first time in the ordered set where entryUuid = &#63;.
	*
	* @param entryUuid the entry uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching time
	* @throws salutem.visit.NoSuchTimeException if a matching time could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Time findByUUID_First(
		java.lang.String entryUuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchTimeException {
		return getPersistence().findByUUID_First(entryUuid, orderByComparator);
	}

	/**
	* Returns the first time in the ordered set where entryUuid = &#63;.
	*
	* @param entryUuid the entry uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching time, or <code>null</code> if a matching time could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Time fetchByUUID_First(
		java.lang.String entryUuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_First(entryUuid, orderByComparator);
	}

	/**
	* Returns the last time in the ordered set where entryUuid = &#63;.
	*
	* @param entryUuid the entry uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching time
	* @throws salutem.visit.NoSuchTimeException if a matching time could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Time findByUUID_Last(
		java.lang.String entryUuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchTimeException {
		return getPersistence().findByUUID_Last(entryUuid, orderByComparator);
	}

	/**
	* Returns the last time in the ordered set where entryUuid = &#63;.
	*
	* @param entryUuid the entry uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching time, or <code>null</code> if a matching time could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Time fetchByUUID_Last(
		java.lang.String entryUuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_Last(entryUuid, orderByComparator);
	}

	/**
	* Returns the times before and after the current time in the ordered set where entryUuid = &#63;.
	*
	* @param timeId the primary key of the current time
	* @param entryUuid the entry uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next time
	* @throws salutem.visit.NoSuchTimeException if a time with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Time[] findByUUID_PrevAndNext(
		long timeId, java.lang.String entryUuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchTimeException {
		return getPersistence()
				   .findByUUID_PrevAndNext(timeId, entryUuid, orderByComparator);
	}

	/**
	* Removes all the times where entryUuid = &#63; from the database.
	*
	* @param entryUuid the entry uuid
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUUID(java.lang.String entryUuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUUID(entryUuid);
	}

	/**
	* Returns the number of times where entryUuid = &#63;.
	*
	* @param entryUuid the entry uuid
	* @return the number of matching times
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUUID(java.lang.String entryUuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUUID(entryUuid);
	}

	/**
	* Returns all the times where visitId = &#63;.
	*
	* @param visitId the visit ID
	* @return the matching times
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.visit.model.Time> findByVisitId(
		long visitId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByVisitId(visitId);
	}

	/**
	* Returns a range of all the times where visitId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.TimeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param visitId the visit ID
	* @param start the lower bound of the range of times
	* @param end the upper bound of the range of times (not inclusive)
	* @return the range of matching times
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.visit.model.Time> findByVisitId(
		long visitId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByVisitId(visitId, start, end);
	}

	/**
	* Returns an ordered range of all the times where visitId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.TimeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param visitId the visit ID
	* @param start the lower bound of the range of times
	* @param end the upper bound of the range of times (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching times
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.visit.model.Time> findByVisitId(
		long visitId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByVisitId(visitId, start, end, orderByComparator);
	}

	/**
	* Returns the first time in the ordered set where visitId = &#63;.
	*
	* @param visitId the visit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching time
	* @throws salutem.visit.NoSuchTimeException if a matching time could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Time findByVisitId_First(long visitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchTimeException {
		return getPersistence().findByVisitId_First(visitId, orderByComparator);
	}

	/**
	* Returns the first time in the ordered set where visitId = &#63;.
	*
	* @param visitId the visit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching time, or <code>null</code> if a matching time could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Time fetchByVisitId_First(long visitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByVisitId_First(visitId, orderByComparator);
	}

	/**
	* Returns the last time in the ordered set where visitId = &#63;.
	*
	* @param visitId the visit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching time
	* @throws salutem.visit.NoSuchTimeException if a matching time could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Time findByVisitId_Last(long visitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchTimeException {
		return getPersistence().findByVisitId_Last(visitId, orderByComparator);
	}

	/**
	* Returns the last time in the ordered set where visitId = &#63;.
	*
	* @param visitId the visit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching time, or <code>null</code> if a matching time could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Time fetchByVisitId_Last(long visitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByVisitId_Last(visitId, orderByComparator);
	}

	/**
	* Returns the times before and after the current time in the ordered set where visitId = &#63;.
	*
	* @param timeId the primary key of the current time
	* @param visitId the visit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next time
	* @throws salutem.visit.NoSuchTimeException if a time with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Time[] findByVisitId_PrevAndNext(
		long timeId, long visitId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchTimeException {
		return getPersistence()
				   .findByVisitId_PrevAndNext(timeId, visitId, orderByComparator);
	}

	/**
	* Removes all the times where visitId = &#63; from the database.
	*
	* @param visitId the visit ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByVisitId(long visitId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByVisitId(visitId);
	}

	/**
	* Returns the number of times where visitId = &#63;.
	*
	* @param visitId the visit ID
	* @return the number of matching times
	* @throws SystemException if a system exception occurred
	*/
	public static int countByVisitId(long visitId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByVisitId(visitId);
	}

	/**
	* Returns all the times where patientId = &#63;.
	*
	* @param patientId the patient ID
	* @return the matching times
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.visit.model.Time> findByPatientId(
		long patientId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPatientId(patientId);
	}

	/**
	* Returns a range of all the times where patientId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.TimeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param patientId the patient ID
	* @param start the lower bound of the range of times
	* @param end the upper bound of the range of times (not inclusive)
	* @return the range of matching times
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.visit.model.Time> findByPatientId(
		long patientId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPatientId(patientId, start, end);
	}

	/**
	* Returns an ordered range of all the times where patientId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.TimeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param patientId the patient ID
	* @param start the lower bound of the range of times
	* @param end the upper bound of the range of times (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching times
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.visit.model.Time> findByPatientId(
		long patientId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPatientId(patientId, start, end, orderByComparator);
	}

	/**
	* Returns the first time in the ordered set where patientId = &#63;.
	*
	* @param patientId the patient ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching time
	* @throws salutem.visit.NoSuchTimeException if a matching time could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Time findByPatientId_First(
		long patientId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchTimeException {
		return getPersistence()
				   .findByPatientId_First(patientId, orderByComparator);
	}

	/**
	* Returns the first time in the ordered set where patientId = &#63;.
	*
	* @param patientId the patient ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching time, or <code>null</code> if a matching time could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Time fetchByPatientId_First(
		long patientId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPatientId_First(patientId, orderByComparator);
	}

	/**
	* Returns the last time in the ordered set where patientId = &#63;.
	*
	* @param patientId the patient ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching time
	* @throws salutem.visit.NoSuchTimeException if a matching time could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Time findByPatientId_Last(
		long patientId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchTimeException {
		return getPersistence()
				   .findByPatientId_Last(patientId, orderByComparator);
	}

	/**
	* Returns the last time in the ordered set where patientId = &#63;.
	*
	* @param patientId the patient ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching time, or <code>null</code> if a matching time could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Time fetchByPatientId_Last(
		long patientId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPatientId_Last(patientId, orderByComparator);
	}

	/**
	* Returns the times before and after the current time in the ordered set where patientId = &#63;.
	*
	* @param timeId the primary key of the current time
	* @param patientId the patient ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next time
	* @throws salutem.visit.NoSuchTimeException if a time with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Time[] findByPatientId_PrevAndNext(
		long timeId, long patientId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchTimeException {
		return getPersistence()
				   .findByPatientId_PrevAndNext(timeId, patientId,
			orderByComparator);
	}

	/**
	* Removes all the times where patientId = &#63; from the database.
	*
	* @param patientId the patient ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPatientId(long patientId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPatientId(patientId);
	}

	/**
	* Returns the number of times where patientId = &#63;.
	*
	* @param patientId the patient ID
	* @return the number of matching times
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPatientId(long patientId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPatientId(patientId);
	}

	/**
	* Returns all the times where doctorId = &#63; and patientId = &#63;.
	*
	* @param doctorId the doctor ID
	* @param patientId the patient ID
	* @return the matching times
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.visit.model.Time> findByDoctorIdAndPatientId(
		long doctorId, long patientId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDoctorIdAndPatientId(doctorId, patientId);
	}

	/**
	* Returns a range of all the times where doctorId = &#63; and patientId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.TimeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param doctorId the doctor ID
	* @param patientId the patient ID
	* @param start the lower bound of the range of times
	* @param end the upper bound of the range of times (not inclusive)
	* @return the range of matching times
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.visit.model.Time> findByDoctorIdAndPatientId(
		long doctorId, long patientId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDoctorIdAndPatientId(doctorId, patientId, start, end);
	}

	/**
	* Returns an ordered range of all the times where doctorId = &#63; and patientId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.TimeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param doctorId the doctor ID
	* @param patientId the patient ID
	* @param start the lower bound of the range of times
	* @param end the upper bound of the range of times (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching times
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.visit.model.Time> findByDoctorIdAndPatientId(
		long doctorId, long patientId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDoctorIdAndPatientId(doctorId, patientId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first time in the ordered set where doctorId = &#63; and patientId = &#63;.
	*
	* @param doctorId the doctor ID
	* @param patientId the patient ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching time
	* @throws salutem.visit.NoSuchTimeException if a matching time could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Time findByDoctorIdAndPatientId_First(
		long doctorId, long patientId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchTimeException {
		return getPersistence()
				   .findByDoctorIdAndPatientId_First(doctorId, patientId,
			orderByComparator);
	}

	/**
	* Returns the first time in the ordered set where doctorId = &#63; and patientId = &#63;.
	*
	* @param doctorId the doctor ID
	* @param patientId the patient ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching time, or <code>null</code> if a matching time could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Time fetchByDoctorIdAndPatientId_First(
		long doctorId, long patientId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDoctorIdAndPatientId_First(doctorId, patientId,
			orderByComparator);
	}

	/**
	* Returns the last time in the ordered set where doctorId = &#63; and patientId = &#63;.
	*
	* @param doctorId the doctor ID
	* @param patientId the patient ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching time
	* @throws salutem.visit.NoSuchTimeException if a matching time could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Time findByDoctorIdAndPatientId_Last(
		long doctorId, long patientId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchTimeException {
		return getPersistence()
				   .findByDoctorIdAndPatientId_Last(doctorId, patientId,
			orderByComparator);
	}

	/**
	* Returns the last time in the ordered set where doctorId = &#63; and patientId = &#63;.
	*
	* @param doctorId the doctor ID
	* @param patientId the patient ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching time, or <code>null</code> if a matching time could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Time fetchByDoctorIdAndPatientId_Last(
		long doctorId, long patientId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDoctorIdAndPatientId_Last(doctorId, patientId,
			orderByComparator);
	}

	/**
	* Returns the times before and after the current time in the ordered set where doctorId = &#63; and patientId = &#63;.
	*
	* @param timeId the primary key of the current time
	* @param doctorId the doctor ID
	* @param patientId the patient ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next time
	* @throws salutem.visit.NoSuchTimeException if a time with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Time[] findByDoctorIdAndPatientId_PrevAndNext(
		long timeId, long doctorId, long patientId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchTimeException {
		return getPersistence()
				   .findByDoctorIdAndPatientId_PrevAndNext(timeId, doctorId,
			patientId, orderByComparator);
	}

	/**
	* Removes all the times where doctorId = &#63; and patientId = &#63; from the database.
	*
	* @param doctorId the doctor ID
	* @param patientId the patient ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDoctorIdAndPatientId(long doctorId,
		long patientId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDoctorIdAndPatientId(doctorId, patientId);
	}

	/**
	* Returns the number of times where doctorId = &#63; and patientId = &#63;.
	*
	* @param doctorId the doctor ID
	* @param patientId the patient ID
	* @return the number of matching times
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDoctorIdAndPatientId(long doctorId, long patientId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDoctorIdAndPatientId(doctorId, patientId);
	}

	/**
	* Returns all the times where doctorId = &#63; and wasFinished = &#63;.
	*
	* @param doctorId the doctor ID
	* @param wasFinished the was finished
	* @return the matching times
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.visit.model.Time> findByDoctorIdAndWasFinished(
		long doctorId, boolean wasFinished)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDoctorIdAndWasFinished(doctorId, wasFinished);
	}

	/**
	* Returns a range of all the times where doctorId = &#63; and wasFinished = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.TimeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param doctorId the doctor ID
	* @param wasFinished the was finished
	* @param start the lower bound of the range of times
	* @param end the upper bound of the range of times (not inclusive)
	* @return the range of matching times
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.visit.model.Time> findByDoctorIdAndWasFinished(
		long doctorId, boolean wasFinished, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDoctorIdAndWasFinished(doctorId, wasFinished, start,
			end);
	}

	/**
	* Returns an ordered range of all the times where doctorId = &#63; and wasFinished = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.TimeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param doctorId the doctor ID
	* @param wasFinished the was finished
	* @param start the lower bound of the range of times
	* @param end the upper bound of the range of times (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching times
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.visit.model.Time> findByDoctorIdAndWasFinished(
		long doctorId, boolean wasFinished, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDoctorIdAndWasFinished(doctorId, wasFinished, start,
			end, orderByComparator);
	}

	/**
	* Returns the first time in the ordered set where doctorId = &#63; and wasFinished = &#63;.
	*
	* @param doctorId the doctor ID
	* @param wasFinished the was finished
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching time
	* @throws salutem.visit.NoSuchTimeException if a matching time could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Time findByDoctorIdAndWasFinished_First(
		long doctorId, boolean wasFinished,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchTimeException {
		return getPersistence()
				   .findByDoctorIdAndWasFinished_First(doctorId, wasFinished,
			orderByComparator);
	}

	/**
	* Returns the first time in the ordered set where doctorId = &#63; and wasFinished = &#63;.
	*
	* @param doctorId the doctor ID
	* @param wasFinished the was finished
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching time, or <code>null</code> if a matching time could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Time fetchByDoctorIdAndWasFinished_First(
		long doctorId, boolean wasFinished,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDoctorIdAndWasFinished_First(doctorId, wasFinished,
			orderByComparator);
	}

	/**
	* Returns the last time in the ordered set where doctorId = &#63; and wasFinished = &#63;.
	*
	* @param doctorId the doctor ID
	* @param wasFinished the was finished
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching time
	* @throws salutem.visit.NoSuchTimeException if a matching time could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Time findByDoctorIdAndWasFinished_Last(
		long doctorId, boolean wasFinished,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchTimeException {
		return getPersistence()
				   .findByDoctorIdAndWasFinished_Last(doctorId, wasFinished,
			orderByComparator);
	}

	/**
	* Returns the last time in the ordered set where doctorId = &#63; and wasFinished = &#63;.
	*
	* @param doctorId the doctor ID
	* @param wasFinished the was finished
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching time, or <code>null</code> if a matching time could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Time fetchByDoctorIdAndWasFinished_Last(
		long doctorId, boolean wasFinished,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDoctorIdAndWasFinished_Last(doctorId, wasFinished,
			orderByComparator);
	}

	/**
	* Returns the times before and after the current time in the ordered set where doctorId = &#63; and wasFinished = &#63;.
	*
	* @param timeId the primary key of the current time
	* @param doctorId the doctor ID
	* @param wasFinished the was finished
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next time
	* @throws salutem.visit.NoSuchTimeException if a time with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Time[] findByDoctorIdAndWasFinished_PrevAndNext(
		long timeId, long doctorId, boolean wasFinished,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchTimeException {
		return getPersistence()
				   .findByDoctorIdAndWasFinished_PrevAndNext(timeId, doctorId,
			wasFinished, orderByComparator);
	}

	/**
	* Removes all the times where doctorId = &#63; and wasFinished = &#63; from the database.
	*
	* @param doctorId the doctor ID
	* @param wasFinished the was finished
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDoctorIdAndWasFinished(long doctorId,
		boolean wasFinished)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDoctorIdAndWasFinished(doctorId, wasFinished);
	}

	/**
	* Returns the number of times where doctorId = &#63; and wasFinished = &#63;.
	*
	* @param doctorId the doctor ID
	* @param wasFinished the was finished
	* @return the number of matching times
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDoctorIdAndWasFinished(long doctorId,
		boolean wasFinished)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByDoctorIdAndWasFinished(doctorId, wasFinished);
	}

	/**
	* Returns all the times where doctorId = &#63; and visitDay = &#63; and visitMonth = &#63; and visitYear = &#63;.
	*
	* @param doctorId the doctor ID
	* @param visitDay the visit day
	* @param visitMonth the visit month
	* @param visitYear the visit year
	* @return the matching times
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.visit.model.Time> findByDoctorIdAndDayMonthAndYear(
		long doctorId, int visitDay, int visitMonth, int visitYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDoctorIdAndDayMonthAndYear(doctorId, visitDay,
			visitMonth, visitYear);
	}

	/**
	* Returns a range of all the times where doctorId = &#63; and visitDay = &#63; and visitMonth = &#63; and visitYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.TimeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param doctorId the doctor ID
	* @param visitDay the visit day
	* @param visitMonth the visit month
	* @param visitYear the visit year
	* @param start the lower bound of the range of times
	* @param end the upper bound of the range of times (not inclusive)
	* @return the range of matching times
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.visit.model.Time> findByDoctorIdAndDayMonthAndYear(
		long doctorId, int visitDay, int visitMonth, int visitYear, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDoctorIdAndDayMonthAndYear(doctorId, visitDay,
			visitMonth, visitYear, start, end);
	}

	/**
	* Returns an ordered range of all the times where doctorId = &#63; and visitDay = &#63; and visitMonth = &#63; and visitYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.TimeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param doctorId the doctor ID
	* @param visitDay the visit day
	* @param visitMonth the visit month
	* @param visitYear the visit year
	* @param start the lower bound of the range of times
	* @param end the upper bound of the range of times (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching times
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.visit.model.Time> findByDoctorIdAndDayMonthAndYear(
		long doctorId, int visitDay, int visitMonth, int visitYear, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDoctorIdAndDayMonthAndYear(doctorId, visitDay,
			visitMonth, visitYear, start, end, orderByComparator);
	}

	/**
	* Returns the first time in the ordered set where doctorId = &#63; and visitDay = &#63; and visitMonth = &#63; and visitYear = &#63;.
	*
	* @param doctorId the doctor ID
	* @param visitDay the visit day
	* @param visitMonth the visit month
	* @param visitYear the visit year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching time
	* @throws salutem.visit.NoSuchTimeException if a matching time could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Time findByDoctorIdAndDayMonthAndYear_First(
		long doctorId, int visitDay, int visitMonth, int visitYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchTimeException {
		return getPersistence()
				   .findByDoctorIdAndDayMonthAndYear_First(doctorId, visitDay,
			visitMonth, visitYear, orderByComparator);
	}

	/**
	* Returns the first time in the ordered set where doctorId = &#63; and visitDay = &#63; and visitMonth = &#63; and visitYear = &#63;.
	*
	* @param doctorId the doctor ID
	* @param visitDay the visit day
	* @param visitMonth the visit month
	* @param visitYear the visit year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching time, or <code>null</code> if a matching time could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Time fetchByDoctorIdAndDayMonthAndYear_First(
		long doctorId, int visitDay, int visitMonth, int visitYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDoctorIdAndDayMonthAndYear_First(doctorId, visitDay,
			visitMonth, visitYear, orderByComparator);
	}

	/**
	* Returns the last time in the ordered set where doctorId = &#63; and visitDay = &#63; and visitMonth = &#63; and visitYear = &#63;.
	*
	* @param doctorId the doctor ID
	* @param visitDay the visit day
	* @param visitMonth the visit month
	* @param visitYear the visit year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching time
	* @throws salutem.visit.NoSuchTimeException if a matching time could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Time findByDoctorIdAndDayMonthAndYear_Last(
		long doctorId, int visitDay, int visitMonth, int visitYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchTimeException {
		return getPersistence()
				   .findByDoctorIdAndDayMonthAndYear_Last(doctorId, visitDay,
			visitMonth, visitYear, orderByComparator);
	}

	/**
	* Returns the last time in the ordered set where doctorId = &#63; and visitDay = &#63; and visitMonth = &#63; and visitYear = &#63;.
	*
	* @param doctorId the doctor ID
	* @param visitDay the visit day
	* @param visitMonth the visit month
	* @param visitYear the visit year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching time, or <code>null</code> if a matching time could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Time fetchByDoctorIdAndDayMonthAndYear_Last(
		long doctorId, int visitDay, int visitMonth, int visitYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDoctorIdAndDayMonthAndYear_Last(doctorId, visitDay,
			visitMonth, visitYear, orderByComparator);
	}

	/**
	* Returns the times before and after the current time in the ordered set where doctorId = &#63; and visitDay = &#63; and visitMonth = &#63; and visitYear = &#63;.
	*
	* @param timeId the primary key of the current time
	* @param doctorId the doctor ID
	* @param visitDay the visit day
	* @param visitMonth the visit month
	* @param visitYear the visit year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next time
	* @throws salutem.visit.NoSuchTimeException if a time with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Time[] findByDoctorIdAndDayMonthAndYear_PrevAndNext(
		long timeId, long doctorId, int visitDay, int visitMonth,
		int visitYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchTimeException {
		return getPersistence()
				   .findByDoctorIdAndDayMonthAndYear_PrevAndNext(timeId,
			doctorId, visitDay, visitMonth, visitYear, orderByComparator);
	}

	/**
	* Removes all the times where doctorId = &#63; and visitDay = &#63; and visitMonth = &#63; and visitYear = &#63; from the database.
	*
	* @param doctorId the doctor ID
	* @param visitDay the visit day
	* @param visitMonth the visit month
	* @param visitYear the visit year
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDoctorIdAndDayMonthAndYear(long doctorId,
		int visitDay, int visitMonth, int visitYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByDoctorIdAndDayMonthAndYear(doctorId, visitDay, visitMonth,
			visitYear);
	}

	/**
	* Returns the number of times where doctorId = &#63; and visitDay = &#63; and visitMonth = &#63; and visitYear = &#63;.
	*
	* @param doctorId the doctor ID
	* @param visitDay the visit day
	* @param visitMonth the visit month
	* @param visitYear the visit year
	* @return the number of matching times
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDoctorIdAndDayMonthAndYear(long doctorId,
		int visitDay, int visitMonth, int visitYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByDoctorIdAndDayMonthAndYear(doctorId, visitDay,
			visitMonth, visitYear);
	}

	/**
	* Returns all the times where doctorId = &#63; and patientId = &#63; and visitDay = &#63; and visitMonth = &#63; and visitYear = &#63;.
	*
	* @param doctorId the doctor ID
	* @param patientId the patient ID
	* @param visitDay the visit day
	* @param visitMonth the visit month
	* @param visitYear the visit year
	* @return the matching times
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.visit.model.Time> findByDoctorIdAndPatientIdAndDayMonthAndYear(
		long doctorId, long patientId, int visitDay, int visitMonth,
		int visitYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDoctorIdAndPatientIdAndDayMonthAndYear(doctorId,
			patientId, visitDay, visitMonth, visitYear);
	}

	/**
	* Returns a range of all the times where doctorId = &#63; and patientId = &#63; and visitDay = &#63; and visitMonth = &#63; and visitYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.TimeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param doctorId the doctor ID
	* @param patientId the patient ID
	* @param visitDay the visit day
	* @param visitMonth the visit month
	* @param visitYear the visit year
	* @param start the lower bound of the range of times
	* @param end the upper bound of the range of times (not inclusive)
	* @return the range of matching times
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.visit.model.Time> findByDoctorIdAndPatientIdAndDayMonthAndYear(
		long doctorId, long patientId, int visitDay, int visitMonth,
		int visitYear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDoctorIdAndPatientIdAndDayMonthAndYear(doctorId,
			patientId, visitDay, visitMonth, visitYear, start, end);
	}

	/**
	* Returns an ordered range of all the times where doctorId = &#63; and patientId = &#63; and visitDay = &#63; and visitMonth = &#63; and visitYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.TimeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param doctorId the doctor ID
	* @param patientId the patient ID
	* @param visitDay the visit day
	* @param visitMonth the visit month
	* @param visitYear the visit year
	* @param start the lower bound of the range of times
	* @param end the upper bound of the range of times (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching times
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.visit.model.Time> findByDoctorIdAndPatientIdAndDayMonthAndYear(
		long doctorId, long patientId, int visitDay, int visitMonth,
		int visitYear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDoctorIdAndPatientIdAndDayMonthAndYear(doctorId,
			patientId, visitDay, visitMonth, visitYear, start, end,
			orderByComparator);
	}

	/**
	* Returns the first time in the ordered set where doctorId = &#63; and patientId = &#63; and visitDay = &#63; and visitMonth = &#63; and visitYear = &#63;.
	*
	* @param doctorId the doctor ID
	* @param patientId the patient ID
	* @param visitDay the visit day
	* @param visitMonth the visit month
	* @param visitYear the visit year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching time
	* @throws salutem.visit.NoSuchTimeException if a matching time could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Time findByDoctorIdAndPatientIdAndDayMonthAndYear_First(
		long doctorId, long patientId, int visitDay, int visitMonth,
		int visitYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchTimeException {
		return getPersistence()
				   .findByDoctorIdAndPatientIdAndDayMonthAndYear_First(doctorId,
			patientId, visitDay, visitMonth, visitYear, orderByComparator);
	}

	/**
	* Returns the first time in the ordered set where doctorId = &#63; and patientId = &#63; and visitDay = &#63; and visitMonth = &#63; and visitYear = &#63;.
	*
	* @param doctorId the doctor ID
	* @param patientId the patient ID
	* @param visitDay the visit day
	* @param visitMonth the visit month
	* @param visitYear the visit year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching time, or <code>null</code> if a matching time could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Time fetchByDoctorIdAndPatientIdAndDayMonthAndYear_First(
		long doctorId, long patientId, int visitDay, int visitMonth,
		int visitYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDoctorIdAndPatientIdAndDayMonthAndYear_First(doctorId,
			patientId, visitDay, visitMonth, visitYear, orderByComparator);
	}

	/**
	* Returns the last time in the ordered set where doctorId = &#63; and patientId = &#63; and visitDay = &#63; and visitMonth = &#63; and visitYear = &#63;.
	*
	* @param doctorId the doctor ID
	* @param patientId the patient ID
	* @param visitDay the visit day
	* @param visitMonth the visit month
	* @param visitYear the visit year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching time
	* @throws salutem.visit.NoSuchTimeException if a matching time could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Time findByDoctorIdAndPatientIdAndDayMonthAndYear_Last(
		long doctorId, long patientId, int visitDay, int visitMonth,
		int visitYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchTimeException {
		return getPersistence()
				   .findByDoctorIdAndPatientIdAndDayMonthAndYear_Last(doctorId,
			patientId, visitDay, visitMonth, visitYear, orderByComparator);
	}

	/**
	* Returns the last time in the ordered set where doctorId = &#63; and patientId = &#63; and visitDay = &#63; and visitMonth = &#63; and visitYear = &#63;.
	*
	* @param doctorId the doctor ID
	* @param patientId the patient ID
	* @param visitDay the visit day
	* @param visitMonth the visit month
	* @param visitYear the visit year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching time, or <code>null</code> if a matching time could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Time fetchByDoctorIdAndPatientIdAndDayMonthAndYear_Last(
		long doctorId, long patientId, int visitDay, int visitMonth,
		int visitYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDoctorIdAndPatientIdAndDayMonthAndYear_Last(doctorId,
			patientId, visitDay, visitMonth, visitYear, orderByComparator);
	}

	/**
	* Returns the times before and after the current time in the ordered set where doctorId = &#63; and patientId = &#63; and visitDay = &#63; and visitMonth = &#63; and visitYear = &#63;.
	*
	* @param timeId the primary key of the current time
	* @param doctorId the doctor ID
	* @param patientId the patient ID
	* @param visitDay the visit day
	* @param visitMonth the visit month
	* @param visitYear the visit year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next time
	* @throws salutem.visit.NoSuchTimeException if a time with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Time[] findByDoctorIdAndPatientIdAndDayMonthAndYear_PrevAndNext(
		long timeId, long doctorId, long patientId, int visitDay,
		int visitMonth, int visitYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchTimeException {
		return getPersistence()
				   .findByDoctorIdAndPatientIdAndDayMonthAndYear_PrevAndNext(timeId,
			doctorId, patientId, visitDay, visitMonth, visitYear,
			orderByComparator);
	}

	/**
	* Removes all the times where doctorId = &#63; and patientId = &#63; and visitDay = &#63; and visitMonth = &#63; and visitYear = &#63; from the database.
	*
	* @param doctorId the doctor ID
	* @param patientId the patient ID
	* @param visitDay the visit day
	* @param visitMonth the visit month
	* @param visitYear the visit year
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDoctorIdAndPatientIdAndDayMonthAndYear(
		long doctorId, long patientId, int visitDay, int visitMonth,
		int visitYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByDoctorIdAndPatientIdAndDayMonthAndYear(doctorId,
			patientId, visitDay, visitMonth, visitYear);
	}

	/**
	* Returns the number of times where doctorId = &#63; and patientId = &#63; and visitDay = &#63; and visitMonth = &#63; and visitYear = &#63;.
	*
	* @param doctorId the doctor ID
	* @param patientId the patient ID
	* @param visitDay the visit day
	* @param visitMonth the visit month
	* @param visitYear the visit year
	* @return the number of matching times
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDoctorIdAndPatientIdAndDayMonthAndYear(
		long doctorId, long patientId, int visitDay, int visitMonth,
		int visitYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByDoctorIdAndPatientIdAndDayMonthAndYear(doctorId,
			patientId, visitDay, visitMonth, visitYear);
	}

	/**
	* Caches the time in the entity cache if it is enabled.
	*
	* @param time the time
	*/
	public static void cacheResult(salutem.visit.model.Time time) {
		getPersistence().cacheResult(time);
	}

	/**
	* Caches the times in the entity cache if it is enabled.
	*
	* @param times the times
	*/
	public static void cacheResult(
		java.util.List<salutem.visit.model.Time> times) {
		getPersistence().cacheResult(times);
	}

	/**
	* Creates a new time with the primary key. Does not add the time to the database.
	*
	* @param timeId the primary key for the new time
	* @return the new time
	*/
	public static salutem.visit.model.Time create(long timeId) {
		return getPersistence().create(timeId);
	}

	/**
	* Removes the time with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param timeId the primary key of the time
	* @return the time that was removed
	* @throws salutem.visit.NoSuchTimeException if a time with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Time remove(long timeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchTimeException {
		return getPersistence().remove(timeId);
	}

	public static salutem.visit.model.Time updateImpl(
		salutem.visit.model.Time time)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(time);
	}

	/**
	* Returns the time with the primary key or throws a {@link salutem.visit.NoSuchTimeException} if it could not be found.
	*
	* @param timeId the primary key of the time
	* @return the time
	* @throws salutem.visit.NoSuchTimeException if a time with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Time findByPrimaryKey(long timeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchTimeException {
		return getPersistence().findByPrimaryKey(timeId);
	}

	/**
	* Returns the time with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param timeId the primary key of the time
	* @return the time, or <code>null</code> if a time with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Time fetchByPrimaryKey(long timeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(timeId);
	}

	/**
	* Returns all the times.
	*
	* @return the times
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.visit.model.Time> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<salutem.visit.model.Time> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the times.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.TimeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of times
	* @param end the upper bound of the range of times (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of times
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.visit.model.Time> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the times from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of times.
	*
	* @return the number of times
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TimePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TimePersistence)PortletBeanLocatorUtil.locate(salutem.visit.service.ClpSerializer.getServletContextName(),
					TimePersistence.class.getName());

			ReferenceRegistry.registerReference(TimeUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(TimePersistence persistence) {
	}

	private static TimePersistence _persistence;
}