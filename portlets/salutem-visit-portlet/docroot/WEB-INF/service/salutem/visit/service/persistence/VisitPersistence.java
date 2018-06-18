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

import salutem.visit.model.Visit;

/**
 * The persistence interface for the visit service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Aneta Andrzejewska
 * @see VisitPersistenceImpl
 * @see VisitUtil
 * @generated
 */
public interface VisitPersistence extends BasePersistence<Visit> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VisitUtil} to access the visit persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the visits where doctorId = &#63; and visitDate = &#63;.
	*
	* @param doctorId the doctor ID
	* @param visitDate the visit date
	* @return the matching visits
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<salutem.visit.model.Visit> findByDoctorIdAndVisitDate(
		long doctorId, java.util.Date visitDate)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<salutem.visit.model.Visit> findByDoctorIdAndVisitDate(
		long doctorId, java.util.Date visitDate, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<salutem.visit.model.Visit> findByDoctorIdAndVisitDate(
		long doctorId, java.util.Date visitDate, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public salutem.visit.model.Visit findByDoctorIdAndVisitDate_First(
		long doctorId, java.util.Date visitDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchVisitException;

	/**
	* Returns the first visit in the ordered set where doctorId = &#63; and visitDate = &#63;.
	*
	* @param doctorId the doctor ID
	* @param visitDate the visit date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching visit, or <code>null</code> if a matching visit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.Visit fetchByDoctorIdAndVisitDate_First(
		long doctorId, java.util.Date visitDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public salutem.visit.model.Visit findByDoctorIdAndVisitDate_Last(
		long doctorId, java.util.Date visitDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchVisitException;

	/**
	* Returns the last visit in the ordered set where doctorId = &#63; and visitDate = &#63;.
	*
	* @param doctorId the doctor ID
	* @param visitDate the visit date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching visit, or <code>null</code> if a matching visit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.Visit fetchByDoctorIdAndVisitDate_Last(
		long doctorId, java.util.Date visitDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public salutem.visit.model.Visit[] findByDoctorIdAndVisitDate_PrevAndNext(
		long visitId, long doctorId, java.util.Date visitDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchVisitException;

	/**
	* Removes all the visits where doctorId = &#63; and visitDate = &#63; from the database.
	*
	* @param doctorId the doctor ID
	* @param visitDate the visit date
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDoctorIdAndVisitDate(long doctorId,
		java.util.Date visitDate)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of visits where doctorId = &#63; and visitDate = &#63;.
	*
	* @param doctorId the doctor ID
	* @param visitDate the visit date
	* @return the number of matching visits
	* @throws SystemException if a system exception occurred
	*/
	public int countByDoctorIdAndVisitDate(long doctorId,
		java.util.Date visitDate)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the visit in the entity cache if it is enabled.
	*
	* @param visit the visit
	*/
	public void cacheResult(salutem.visit.model.Visit visit);

	/**
	* Caches the visits in the entity cache if it is enabled.
	*
	* @param visits the visits
	*/
	public void cacheResult(java.util.List<salutem.visit.model.Visit> visits);

	/**
	* Creates a new visit with the primary key. Does not add the visit to the database.
	*
	* @param visitId the primary key for the new visit
	* @return the new visit
	*/
	public salutem.visit.model.Visit create(long visitId);

	/**
	* Removes the visit with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param visitId the primary key of the visit
	* @return the visit that was removed
	* @throws salutem.visit.NoSuchVisitException if a visit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.Visit remove(long visitId)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchVisitException;

	public salutem.visit.model.Visit updateImpl(salutem.visit.model.Visit visit)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the visit with the primary key or throws a {@link salutem.visit.NoSuchVisitException} if it could not be found.
	*
	* @param visitId the primary key of the visit
	* @return the visit
	* @throws salutem.visit.NoSuchVisitException if a visit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.Visit findByPrimaryKey(long visitId)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchVisitException;

	/**
	* Returns the visit with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param visitId the primary key of the visit
	* @return the visit, or <code>null</code> if a visit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.Visit fetchByPrimaryKey(long visitId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the visits.
	*
	* @return the visits
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<salutem.visit.model.Visit> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<salutem.visit.model.Visit> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<salutem.visit.model.Visit> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the visits from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of visits.
	*
	* @return the number of visits
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}