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

import salutem.visit.model.Visit;

import java.util.List;

/**
 * The persistence utility for the visit service. This utility wraps {@link VisitPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Aneta Andrzejewska
 * @see VisitPersistence
 * @see VisitPersistenceImpl
 * @generated
 */
public class VisitUtil {
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
	public static void clearCache(Visit visit) {
		getPersistence().clearCache(visit);
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
	public static List<Visit> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Visit> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Visit> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Visit update(Visit visit) throws SystemException {
		return getPersistence().update(visit);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Visit update(Visit visit, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(visit, serviceContext);
	}

	/**
	* Returns all the visits where doctorId = &#63; and visitDate = &#63;.
	*
	* @param doctorId the doctor ID
	* @param visitDate the visit date
	* @return the matching visits
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.visit.model.Visit> findByDoctorIdAndVisitDate(
		long doctorId, java.util.Date visitDate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDoctorIdAndVisitDate(doctorId, visitDate);
	}

	/**
	* Returns a range of all the visits where doctorId = &#63; and visitDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.VisitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param doctorId the doctor ID
	* @param visitDate the visit date
	* @param start the lower bound of the range of visits
	* @param end the upper bound of the range of visits (not inclusive)
	* @return the range of matching visits
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.visit.model.Visit> findByDoctorIdAndVisitDate(
		long doctorId, java.util.Date visitDate, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDoctorIdAndVisitDate(doctorId, visitDate, start, end);
	}

	/**
	* Returns an ordered range of all the visits where doctorId = &#63; and visitDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.VisitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param doctorId the doctor ID
	* @param visitDate the visit date
	* @param start the lower bound of the range of visits
	* @param end the upper bound of the range of visits (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching visits
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.visit.model.Visit> findByDoctorIdAndVisitDate(
		long doctorId, java.util.Date visitDate, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDoctorIdAndVisitDate(doctorId, visitDate, start, end,
			orderByComparator);
	}

	/**
	* Returns the first visit in the ordered set where doctorId = &#63; and visitDate = &#63;.
	*
	* @param doctorId the doctor ID
	* @param visitDate the visit date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching visit
	* @throws salutem.visit.NoSuchVisitException if a matching visit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Visit findByDoctorIdAndVisitDate_First(
		long doctorId, java.util.Date visitDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchVisitException {
		return getPersistence()
				   .findByDoctorIdAndVisitDate_First(doctorId, visitDate,
			orderByComparator);
	}

	/**
	* Returns the first visit in the ordered set where doctorId = &#63; and visitDate = &#63;.
	*
	* @param doctorId the doctor ID
	* @param visitDate the visit date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching visit, or <code>null</code> if a matching visit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Visit fetchByDoctorIdAndVisitDate_First(
		long doctorId, java.util.Date visitDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDoctorIdAndVisitDate_First(doctorId, visitDate,
			orderByComparator);
	}

	/**
	* Returns the last visit in the ordered set where doctorId = &#63; and visitDate = &#63;.
	*
	* @param doctorId the doctor ID
	* @param visitDate the visit date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching visit
	* @throws salutem.visit.NoSuchVisitException if a matching visit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Visit findByDoctorIdAndVisitDate_Last(
		long doctorId, java.util.Date visitDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchVisitException {
		return getPersistence()
				   .findByDoctorIdAndVisitDate_Last(doctorId, visitDate,
			orderByComparator);
	}

	/**
	* Returns the last visit in the ordered set where doctorId = &#63; and visitDate = &#63;.
	*
	* @param doctorId the doctor ID
	* @param visitDate the visit date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching visit, or <code>null</code> if a matching visit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Visit fetchByDoctorIdAndVisitDate_Last(
		long doctorId, java.util.Date visitDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDoctorIdAndVisitDate_Last(doctorId, visitDate,
			orderByComparator);
	}

	/**
	* Returns the visits before and after the current visit in the ordered set where doctorId = &#63; and visitDate = &#63;.
	*
	* @param visitId the primary key of the current visit
	* @param doctorId the doctor ID
	* @param visitDate the visit date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next visit
	* @throws salutem.visit.NoSuchVisitException if a visit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Visit[] findByDoctorIdAndVisitDate_PrevAndNext(
		long visitId, long doctorId, java.util.Date visitDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchVisitException {
		return getPersistence()
				   .findByDoctorIdAndVisitDate_PrevAndNext(visitId, doctorId,
			visitDate, orderByComparator);
	}

	/**
	* Removes all the visits where doctorId = &#63; and visitDate = &#63; from the database.
	*
	* @param doctorId the doctor ID
	* @param visitDate the visit date
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDoctorIdAndVisitDate(long doctorId,
		java.util.Date visitDate)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDoctorIdAndVisitDate(doctorId, visitDate);
	}

	/**
	* Returns the number of visits where doctorId = &#63; and visitDate = &#63;.
	*
	* @param doctorId the doctor ID
	* @param visitDate the visit date
	* @return the number of matching visits
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDoctorIdAndVisitDate(long doctorId,
		java.util.Date visitDate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDoctorIdAndVisitDate(doctorId, visitDate);
	}

	/**
	* Caches the visit in the entity cache if it is enabled.
	*
	* @param visit the visit
	*/
	public static void cacheResult(salutem.visit.model.Visit visit) {
		getPersistence().cacheResult(visit);
	}

	/**
	* Caches the visits in the entity cache if it is enabled.
	*
	* @param visits the visits
	*/
	public static void cacheResult(
		java.util.List<salutem.visit.model.Visit> visits) {
		getPersistence().cacheResult(visits);
	}

	/**
	* Creates a new visit with the primary key. Does not add the visit to the database.
	*
	* @param visitId the primary key for the new visit
	* @return the new visit
	*/
	public static salutem.visit.model.Visit create(long visitId) {
		return getPersistence().create(visitId);
	}

	/**
	* Removes the visit with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param visitId the primary key of the visit
	* @return the visit that was removed
	* @throws salutem.visit.NoSuchVisitException if a visit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Visit remove(long visitId)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchVisitException {
		return getPersistence().remove(visitId);
	}

	public static salutem.visit.model.Visit updateImpl(
		salutem.visit.model.Visit visit)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(visit);
	}

	/**
	* Returns the visit with the primary key or throws a {@link salutem.visit.NoSuchVisitException} if it could not be found.
	*
	* @param visitId the primary key of the visit
	* @return the visit
	* @throws salutem.visit.NoSuchVisitException if a visit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Visit findByPrimaryKey(long visitId)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchVisitException {
		return getPersistence().findByPrimaryKey(visitId);
	}

	/**
	* Returns the visit with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param visitId the primary key of the visit
	* @return the visit, or <code>null</code> if a visit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Visit fetchByPrimaryKey(long visitId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(visitId);
	}

	/**
	* Returns all the visits.
	*
	* @return the visits
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.visit.model.Visit> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the visits.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.VisitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of visits
	* @param end the upper bound of the range of visits (not inclusive)
	* @return the range of visits
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.visit.model.Visit> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the visits.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.VisitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of visits
	* @param end the upper bound of the range of visits (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of visits
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.visit.model.Visit> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the visits from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of visits.
	*
	* @return the number of visits
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static VisitPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (VisitPersistence)PortletBeanLocatorUtil.locate(salutem.visit.service.ClpSerializer.getServletContextName(),
					VisitPersistence.class.getName());

			ReferenceRegistry.registerReference(VisitUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(VisitPersistence persistence) {
	}

	private static VisitPersistence _persistence;
}