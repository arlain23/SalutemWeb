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

import salutem.doctor.model.Doctor;

import java.util.List;

/**
 * The persistence utility for the doctor service. This utility wraps {@link DoctorPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Aneta Andrzejewska
 * @see DoctorPersistence
 * @see DoctorPersistenceImpl
 * @generated
 */
public class DoctorUtil {
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
	public static void clearCache(Doctor doctor) {
		getPersistence().clearCache(doctor);
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
	public static List<Doctor> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Doctor> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Doctor> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Doctor update(Doctor doctor) throws SystemException {
		return getPersistence().update(doctor);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Doctor update(Doctor doctor, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(doctor, serviceContext);
	}

	/**
	* Returns all the doctors where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @return the matching doctors
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.doctor.model.Doctor> findByUserIdAndGroupId(
		long userId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserIdAndGroupId(userId, groupId);
	}

	/**
	* Returns a range of all the doctors where userId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.doctor.model.impl.DoctorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @param start the lower bound of the range of doctors
	* @param end the upper bound of the range of doctors (not inclusive)
	* @return the range of matching doctors
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.doctor.model.Doctor> findByUserIdAndGroupId(
		long userId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUserIdAndGroupId(userId, groupId, start, end);
	}

	/**
	* Returns an ordered range of all the doctors where userId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.doctor.model.impl.DoctorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @param start the lower bound of the range of doctors
	* @param end the upper bound of the range of doctors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching doctors
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.doctor.model.Doctor> findByUserIdAndGroupId(
		long userId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUserIdAndGroupId(userId, groupId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first doctor in the ordered set where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching doctor
	* @throws salutem.doctor.NoSuchDoctorException if a matching doctor could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.doctor.model.Doctor findByUserIdAndGroupId_First(
		long userId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.doctor.NoSuchDoctorException {
		return getPersistence()
				   .findByUserIdAndGroupId_First(userId, groupId,
			orderByComparator);
	}

	/**
	* Returns the first doctor in the ordered set where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching doctor, or <code>null</code> if a matching doctor could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.doctor.model.Doctor fetchByUserIdAndGroupId_First(
		long userId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUserIdAndGroupId_First(userId, groupId,
			orderByComparator);
	}

	/**
	* Returns the last doctor in the ordered set where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching doctor
	* @throws salutem.doctor.NoSuchDoctorException if a matching doctor could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.doctor.model.Doctor findByUserIdAndGroupId_Last(
		long userId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.doctor.NoSuchDoctorException {
		return getPersistence()
				   .findByUserIdAndGroupId_Last(userId, groupId,
			orderByComparator);
	}

	/**
	* Returns the last doctor in the ordered set where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching doctor, or <code>null</code> if a matching doctor could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.doctor.model.Doctor fetchByUserIdAndGroupId_Last(
		long userId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUserIdAndGroupId_Last(userId, groupId,
			orderByComparator);
	}

	/**
	* Returns the doctors before and after the current doctor in the ordered set where userId = &#63; and groupId = &#63;.
	*
	* @param doctorId the primary key of the current doctor
	* @param userId the user ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next doctor
	* @throws salutem.doctor.NoSuchDoctorException if a doctor with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.doctor.model.Doctor[] findByUserIdAndGroupId_PrevAndNext(
		long doctorId, long userId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.doctor.NoSuchDoctorException {
		return getPersistence()
				   .findByUserIdAndGroupId_PrevAndNext(doctorId, userId,
			groupId, orderByComparator);
	}

	/**
	* Removes all the doctors where userId = &#63; and groupId = &#63; from the database.
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUserIdAndGroupId(long userId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUserIdAndGroupId(userId, groupId);
	}

	/**
	* Returns the number of doctors where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @return the number of matching doctors
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUserIdAndGroupId(long userId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUserIdAndGroupId(userId, groupId);
	}

	/**
	* Returns all the doctors where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching doctors
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.doctor.model.Doctor> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the doctors where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.doctor.model.impl.DoctorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of doctors
	* @param end the upper bound of the range of doctors (not inclusive)
	* @return the range of matching doctors
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.doctor.model.Doctor> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the doctors where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.doctor.model.impl.DoctorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of doctors
	* @param end the upper bound of the range of doctors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching doctors
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.doctor.model.Doctor> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first doctor in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching doctor
	* @throws salutem.doctor.NoSuchDoctorException if a matching doctor could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.doctor.model.Doctor findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.doctor.NoSuchDoctorException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first doctor in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching doctor, or <code>null</code> if a matching doctor could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.doctor.model.Doctor fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last doctor in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching doctor
	* @throws salutem.doctor.NoSuchDoctorException if a matching doctor could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.doctor.model.Doctor findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.doctor.NoSuchDoctorException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last doctor in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching doctor, or <code>null</code> if a matching doctor could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.doctor.model.Doctor fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the doctors before and after the current doctor in the ordered set where groupId = &#63;.
	*
	* @param doctorId the primary key of the current doctor
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next doctor
	* @throws salutem.doctor.NoSuchDoctorException if a doctor with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.doctor.model.Doctor[] findByGroupId_PrevAndNext(
		long doctorId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.doctor.NoSuchDoctorException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(doctorId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the doctors where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of doctors where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching doctors
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Caches the doctor in the entity cache if it is enabled.
	*
	* @param doctor the doctor
	*/
	public static void cacheResult(salutem.doctor.model.Doctor doctor) {
		getPersistence().cacheResult(doctor);
	}

	/**
	* Caches the doctors in the entity cache if it is enabled.
	*
	* @param doctors the doctors
	*/
	public static void cacheResult(
		java.util.List<salutem.doctor.model.Doctor> doctors) {
		getPersistence().cacheResult(doctors);
	}

	/**
	* Creates a new doctor with the primary key. Does not add the doctor to the database.
	*
	* @param doctorId the primary key for the new doctor
	* @return the new doctor
	*/
	public static salutem.doctor.model.Doctor create(long doctorId) {
		return getPersistence().create(doctorId);
	}

	/**
	* Removes the doctor with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param doctorId the primary key of the doctor
	* @return the doctor that was removed
	* @throws salutem.doctor.NoSuchDoctorException if a doctor with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.doctor.model.Doctor remove(long doctorId)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.doctor.NoSuchDoctorException {
		return getPersistence().remove(doctorId);
	}

	public static salutem.doctor.model.Doctor updateImpl(
		salutem.doctor.model.Doctor doctor)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(doctor);
	}

	/**
	* Returns the doctor with the primary key or throws a {@link salutem.doctor.NoSuchDoctorException} if it could not be found.
	*
	* @param doctorId the primary key of the doctor
	* @return the doctor
	* @throws salutem.doctor.NoSuchDoctorException if a doctor with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.doctor.model.Doctor findByPrimaryKey(long doctorId)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.doctor.NoSuchDoctorException {
		return getPersistence().findByPrimaryKey(doctorId);
	}

	/**
	* Returns the doctor with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param doctorId the primary key of the doctor
	* @return the doctor, or <code>null</code> if a doctor with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.doctor.model.Doctor fetchByPrimaryKey(long doctorId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(doctorId);
	}

	/**
	* Returns all the doctors.
	*
	* @return the doctors
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.doctor.model.Doctor> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the doctors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.doctor.model.impl.DoctorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of doctors
	* @param end the upper bound of the range of doctors (not inclusive)
	* @return the range of doctors
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.doctor.model.Doctor> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the doctors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.doctor.model.impl.DoctorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of doctors
	* @param end the upper bound of the range of doctors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of doctors
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.doctor.model.Doctor> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the doctors from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of doctors.
	*
	* @return the number of doctors
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DoctorPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DoctorPersistence)PortletBeanLocatorUtil.locate(salutem.doctor.service.ClpSerializer.getServletContextName(),
					DoctorPersistence.class.getName());

			ReferenceRegistry.registerReference(DoctorUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DoctorPersistence persistence) {
	}

	private static DoctorPersistence _persistence;
}