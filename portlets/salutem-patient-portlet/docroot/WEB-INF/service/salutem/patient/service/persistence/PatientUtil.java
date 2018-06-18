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

package salutem.patient.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import salutem.patient.model.Patient;

import java.util.List;

/**
 * The persistence utility for the patient service. This utility wraps {@link PatientPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Aneta Andrzejewska
 * @see PatientPersistence
 * @see PatientPersistenceImpl
 * @generated
 */
public class PatientUtil {
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
	public static void clearCache(Patient patient) {
		getPersistence().clearCache(patient);
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
	public static List<Patient> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Patient> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Patient> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Patient update(Patient patient) throws SystemException {
		return getPersistence().update(patient);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Patient update(Patient patient, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(patient, serviceContext);
	}

	/**
	* Returns all the patients where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching patients
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.patient.model.Patient> findByUserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserId(userId);
	}

	/**
	* Returns a range of all the patients where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.patient.model.impl.PatientModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of patients
	* @param end the upper bound of the range of patients (not inclusive)
	* @return the range of matching patients
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.patient.model.Patient> findByUserId(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserId(userId, start, end);
	}

	/**
	* Returns an ordered range of all the patients where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.patient.model.impl.PatientModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of patients
	* @param end the upper bound of the range of patients (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching patients
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.patient.model.Patient> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator);
	}

	/**
	* Returns the first patient in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching patient
	* @throws salutem.patient.NoSuchPatientException if a matching patient could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.patient.model.Patient findByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.patient.NoSuchPatientException {
		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the first patient in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching patient, or <code>null</code> if a matching patient could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.patient.model.Patient fetchByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the last patient in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching patient
	* @throws salutem.patient.NoSuchPatientException if a matching patient could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.patient.model.Patient findByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.patient.NoSuchPatientException {
		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the last patient in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching patient, or <code>null</code> if a matching patient could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.patient.model.Patient fetchByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the patients before and after the current patient in the ordered set where userId = &#63;.
	*
	* @param patientId the primary key of the current patient
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next patient
	* @throws salutem.patient.NoSuchPatientException if a patient with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.patient.model.Patient[] findByUserId_PrevAndNext(
		long patientId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.patient.NoSuchPatientException {
		return getPersistence()
				   .findByUserId_PrevAndNext(patientId, userId,
			orderByComparator);
	}

	/**
	* Removes all the patients where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUserId(userId);
	}

	/**
	* Returns the number of patients where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching patients
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUserId(userId);
	}

	/**
	* Returns all the patients where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching patients
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.patient.model.Patient> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the patients where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.patient.model.impl.PatientModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of patients
	* @param end the upper bound of the range of patients (not inclusive)
	* @return the range of matching patients
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.patient.model.Patient> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the patients where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.patient.model.impl.PatientModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of patients
	* @param end the upper bound of the range of patients (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching patients
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.patient.model.Patient> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first patient in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching patient
	* @throws salutem.patient.NoSuchPatientException if a matching patient could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.patient.model.Patient findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.patient.NoSuchPatientException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first patient in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching patient, or <code>null</code> if a matching patient could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.patient.model.Patient fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last patient in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching patient
	* @throws salutem.patient.NoSuchPatientException if a matching patient could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.patient.model.Patient findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.patient.NoSuchPatientException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last patient in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching patient, or <code>null</code> if a matching patient could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.patient.model.Patient fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the patients before and after the current patient in the ordered set where groupId = &#63;.
	*
	* @param patientId the primary key of the current patient
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next patient
	* @throws salutem.patient.NoSuchPatientException if a patient with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.patient.model.Patient[] findByGroupId_PrevAndNext(
		long patientId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.patient.NoSuchPatientException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(patientId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the patients where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of patients where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching patients
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns all the patients where pesel = &#63;.
	*
	* @param pesel the pesel
	* @return the matching patients
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.patient.model.Patient> findByPESEL(
		java.lang.String pesel)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPESEL(pesel);
	}

	/**
	* Returns a range of all the patients where pesel = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.patient.model.impl.PatientModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pesel the pesel
	* @param start the lower bound of the range of patients
	* @param end the upper bound of the range of patients (not inclusive)
	* @return the range of matching patients
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.patient.model.Patient> findByPESEL(
		java.lang.String pesel, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPESEL(pesel, start, end);
	}

	/**
	* Returns an ordered range of all the patients where pesel = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.patient.model.impl.PatientModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pesel the pesel
	* @param start the lower bound of the range of patients
	* @param end the upper bound of the range of patients (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching patients
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.patient.model.Patient> findByPESEL(
		java.lang.String pesel, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPESEL(pesel, start, end, orderByComparator);
	}

	/**
	* Returns the first patient in the ordered set where pesel = &#63;.
	*
	* @param pesel the pesel
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching patient
	* @throws salutem.patient.NoSuchPatientException if a matching patient could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.patient.model.Patient findByPESEL_First(
		java.lang.String pesel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.patient.NoSuchPatientException {
		return getPersistence().findByPESEL_First(pesel, orderByComparator);
	}

	/**
	* Returns the first patient in the ordered set where pesel = &#63;.
	*
	* @param pesel the pesel
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching patient, or <code>null</code> if a matching patient could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.patient.model.Patient fetchByPESEL_First(
		java.lang.String pesel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPESEL_First(pesel, orderByComparator);
	}

	/**
	* Returns the last patient in the ordered set where pesel = &#63;.
	*
	* @param pesel the pesel
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching patient
	* @throws salutem.patient.NoSuchPatientException if a matching patient could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.patient.model.Patient findByPESEL_Last(
		java.lang.String pesel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.patient.NoSuchPatientException {
		return getPersistence().findByPESEL_Last(pesel, orderByComparator);
	}

	/**
	* Returns the last patient in the ordered set where pesel = &#63;.
	*
	* @param pesel the pesel
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching patient, or <code>null</code> if a matching patient could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.patient.model.Patient fetchByPESEL_Last(
		java.lang.String pesel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPESEL_Last(pesel, orderByComparator);
	}

	/**
	* Returns the patients before and after the current patient in the ordered set where pesel = &#63;.
	*
	* @param patientId the primary key of the current patient
	* @param pesel the pesel
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next patient
	* @throws salutem.patient.NoSuchPatientException if a patient with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.patient.model.Patient[] findByPESEL_PrevAndNext(
		long patientId, java.lang.String pesel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.patient.NoSuchPatientException {
		return getPersistence()
				   .findByPESEL_PrevAndNext(patientId, pesel, orderByComparator);
	}

	/**
	* Removes all the patients where pesel = &#63; from the database.
	*
	* @param pesel the pesel
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPESEL(java.lang.String pesel)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPESEL(pesel);
	}

	/**
	* Returns the number of patients where pesel = &#63;.
	*
	* @param pesel the pesel
	* @return the number of matching patients
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPESEL(java.lang.String pesel)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPESEL(pesel);
	}

	/**
	* Returns all the patients where name = &#63; and middleName = &#63; and surname = &#63;.
	*
	* @param name the name
	* @param middleName the middle name
	* @param surname the surname
	* @return the matching patients
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.patient.model.Patient> findByFullName(
		java.lang.String name, java.lang.String middleName,
		java.lang.String surname)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByFullName(name, middleName, surname);
	}

	/**
	* Returns a range of all the patients where name = &#63; and middleName = &#63; and surname = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.patient.model.impl.PatientModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param middleName the middle name
	* @param surname the surname
	* @param start the lower bound of the range of patients
	* @param end the upper bound of the range of patients (not inclusive)
	* @return the range of matching patients
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.patient.model.Patient> findByFullName(
		java.lang.String name, java.lang.String middleName,
		java.lang.String surname, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFullName(name, middleName, surname, start, end);
	}

	/**
	* Returns an ordered range of all the patients where name = &#63; and middleName = &#63; and surname = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.patient.model.impl.PatientModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param middleName the middle name
	* @param surname the surname
	* @param start the lower bound of the range of patients
	* @param end the upper bound of the range of patients (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching patients
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.patient.model.Patient> findByFullName(
		java.lang.String name, java.lang.String middleName,
		java.lang.String surname, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFullName(name, middleName, surname, start, end,
			orderByComparator);
	}

	/**
	* Returns the first patient in the ordered set where name = &#63; and middleName = &#63; and surname = &#63;.
	*
	* @param name the name
	* @param middleName the middle name
	* @param surname the surname
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching patient
	* @throws salutem.patient.NoSuchPatientException if a matching patient could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.patient.model.Patient findByFullName_First(
		java.lang.String name, java.lang.String middleName,
		java.lang.String surname,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.patient.NoSuchPatientException {
		return getPersistence()
				   .findByFullName_First(name, middleName, surname,
			orderByComparator);
	}

	/**
	* Returns the first patient in the ordered set where name = &#63; and middleName = &#63; and surname = &#63;.
	*
	* @param name the name
	* @param middleName the middle name
	* @param surname the surname
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching patient, or <code>null</code> if a matching patient could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.patient.model.Patient fetchByFullName_First(
		java.lang.String name, java.lang.String middleName,
		java.lang.String surname,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByFullName_First(name, middleName, surname,
			orderByComparator);
	}

	/**
	* Returns the last patient in the ordered set where name = &#63; and middleName = &#63; and surname = &#63;.
	*
	* @param name the name
	* @param middleName the middle name
	* @param surname the surname
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching patient
	* @throws salutem.patient.NoSuchPatientException if a matching patient could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.patient.model.Patient findByFullName_Last(
		java.lang.String name, java.lang.String middleName,
		java.lang.String surname,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.patient.NoSuchPatientException {
		return getPersistence()
				   .findByFullName_Last(name, middleName, surname,
			orderByComparator);
	}

	/**
	* Returns the last patient in the ordered set where name = &#63; and middleName = &#63; and surname = &#63;.
	*
	* @param name the name
	* @param middleName the middle name
	* @param surname the surname
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching patient, or <code>null</code> if a matching patient could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.patient.model.Patient fetchByFullName_Last(
		java.lang.String name, java.lang.String middleName,
		java.lang.String surname,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByFullName_Last(name, middleName, surname,
			orderByComparator);
	}

	/**
	* Returns the patients before and after the current patient in the ordered set where name = &#63; and middleName = &#63; and surname = &#63;.
	*
	* @param patientId the primary key of the current patient
	* @param name the name
	* @param middleName the middle name
	* @param surname the surname
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next patient
	* @throws salutem.patient.NoSuchPatientException if a patient with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.patient.model.Patient[] findByFullName_PrevAndNext(
		long patientId, java.lang.String name, java.lang.String middleName,
		java.lang.String surname,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.patient.NoSuchPatientException {
		return getPersistence()
				   .findByFullName_PrevAndNext(patientId, name, middleName,
			surname, orderByComparator);
	}

	/**
	* Removes all the patients where name = &#63; and middleName = &#63; and surname = &#63; from the database.
	*
	* @param name the name
	* @param middleName the middle name
	* @param surname the surname
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByFullName(java.lang.String name,
		java.lang.String middleName, java.lang.String surname)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByFullName(name, middleName, surname);
	}

	/**
	* Returns the number of patients where name = &#63; and middleName = &#63; and surname = &#63;.
	*
	* @param name the name
	* @param middleName the middle name
	* @param surname the surname
	* @return the number of matching patients
	* @throws SystemException if a system exception occurred
	*/
	public static int countByFullName(java.lang.String name,
		java.lang.String middleName, java.lang.String surname)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByFullName(name, middleName, surname);
	}

	/**
	* Returns all the patients where groupId = &#63; and isConfirmed = &#63;.
	*
	* @param groupId the group ID
	* @param isConfirmed the is confirmed
	* @return the matching patients
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.patient.model.Patient> findByGroupIdAndConfirmed(
		long groupId, boolean isConfirmed)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupIdAndConfirmed(groupId, isConfirmed);
	}

	/**
	* Returns a range of all the patients where groupId = &#63; and isConfirmed = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.patient.model.impl.PatientModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param isConfirmed the is confirmed
	* @param start the lower bound of the range of patients
	* @param end the upper bound of the range of patients (not inclusive)
	* @return the range of matching patients
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.patient.model.Patient> findByGroupIdAndConfirmed(
		long groupId, boolean isConfirmed, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupIdAndConfirmed(groupId, isConfirmed, start, end);
	}

	/**
	* Returns an ordered range of all the patients where groupId = &#63; and isConfirmed = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.patient.model.impl.PatientModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param isConfirmed the is confirmed
	* @param start the lower bound of the range of patients
	* @param end the upper bound of the range of patients (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching patients
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.patient.model.Patient> findByGroupIdAndConfirmed(
		long groupId, boolean isConfirmed, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupIdAndConfirmed(groupId, isConfirmed, start, end,
			orderByComparator);
	}

	/**
	* Returns the first patient in the ordered set where groupId = &#63; and isConfirmed = &#63;.
	*
	* @param groupId the group ID
	* @param isConfirmed the is confirmed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching patient
	* @throws salutem.patient.NoSuchPatientException if a matching patient could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.patient.model.Patient findByGroupIdAndConfirmed_First(
		long groupId, boolean isConfirmed,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.patient.NoSuchPatientException {
		return getPersistence()
				   .findByGroupIdAndConfirmed_First(groupId, isConfirmed,
			orderByComparator);
	}

	/**
	* Returns the first patient in the ordered set where groupId = &#63; and isConfirmed = &#63;.
	*
	* @param groupId the group ID
	* @param isConfirmed the is confirmed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching patient, or <code>null</code> if a matching patient could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.patient.model.Patient fetchByGroupIdAndConfirmed_First(
		long groupId, boolean isConfirmed,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByGroupIdAndConfirmed_First(groupId, isConfirmed,
			orderByComparator);
	}

	/**
	* Returns the last patient in the ordered set where groupId = &#63; and isConfirmed = &#63;.
	*
	* @param groupId the group ID
	* @param isConfirmed the is confirmed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching patient
	* @throws salutem.patient.NoSuchPatientException if a matching patient could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.patient.model.Patient findByGroupIdAndConfirmed_Last(
		long groupId, boolean isConfirmed,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.patient.NoSuchPatientException {
		return getPersistence()
				   .findByGroupIdAndConfirmed_Last(groupId, isConfirmed,
			orderByComparator);
	}

	/**
	* Returns the last patient in the ordered set where groupId = &#63; and isConfirmed = &#63;.
	*
	* @param groupId the group ID
	* @param isConfirmed the is confirmed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching patient, or <code>null</code> if a matching patient could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.patient.model.Patient fetchByGroupIdAndConfirmed_Last(
		long groupId, boolean isConfirmed,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByGroupIdAndConfirmed_Last(groupId, isConfirmed,
			orderByComparator);
	}

	/**
	* Returns the patients before and after the current patient in the ordered set where groupId = &#63; and isConfirmed = &#63;.
	*
	* @param patientId the primary key of the current patient
	* @param groupId the group ID
	* @param isConfirmed the is confirmed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next patient
	* @throws salutem.patient.NoSuchPatientException if a patient with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.patient.model.Patient[] findByGroupIdAndConfirmed_PrevAndNext(
		long patientId, long groupId, boolean isConfirmed,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.patient.NoSuchPatientException {
		return getPersistence()
				   .findByGroupIdAndConfirmed_PrevAndNext(patientId, groupId,
			isConfirmed, orderByComparator);
	}

	/**
	* Removes all the patients where groupId = &#63; and isConfirmed = &#63; from the database.
	*
	* @param groupId the group ID
	* @param isConfirmed the is confirmed
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupIdAndConfirmed(long groupId,
		boolean isConfirmed)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupIdAndConfirmed(groupId, isConfirmed);
	}

	/**
	* Returns the number of patients where groupId = &#63; and isConfirmed = &#63;.
	*
	* @param groupId the group ID
	* @param isConfirmed the is confirmed
	* @return the number of matching patients
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupIdAndConfirmed(long groupId,
		boolean isConfirmed)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupIdAndConfirmed(groupId, isConfirmed);
	}

	/**
	* Caches the patient in the entity cache if it is enabled.
	*
	* @param patient the patient
	*/
	public static void cacheResult(salutem.patient.model.Patient patient) {
		getPersistence().cacheResult(patient);
	}

	/**
	* Caches the patients in the entity cache if it is enabled.
	*
	* @param patients the patients
	*/
	public static void cacheResult(
		java.util.List<salutem.patient.model.Patient> patients) {
		getPersistence().cacheResult(patients);
	}

	/**
	* Creates a new patient with the primary key. Does not add the patient to the database.
	*
	* @param patientId the primary key for the new patient
	* @return the new patient
	*/
	public static salutem.patient.model.Patient create(long patientId) {
		return getPersistence().create(patientId);
	}

	/**
	* Removes the patient with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param patientId the primary key of the patient
	* @return the patient that was removed
	* @throws salutem.patient.NoSuchPatientException if a patient with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.patient.model.Patient remove(long patientId)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.patient.NoSuchPatientException {
		return getPersistence().remove(patientId);
	}

	public static salutem.patient.model.Patient updateImpl(
		salutem.patient.model.Patient patient)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(patient);
	}

	/**
	* Returns the patient with the primary key or throws a {@link salutem.patient.NoSuchPatientException} if it could not be found.
	*
	* @param patientId the primary key of the patient
	* @return the patient
	* @throws salutem.patient.NoSuchPatientException if a patient with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.patient.model.Patient findByPrimaryKey(long patientId)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.patient.NoSuchPatientException {
		return getPersistence().findByPrimaryKey(patientId);
	}

	/**
	* Returns the patient with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param patientId the primary key of the patient
	* @return the patient, or <code>null</code> if a patient with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.patient.model.Patient fetchByPrimaryKey(
		long patientId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(patientId);
	}

	/**
	* Returns all the patients.
	*
	* @return the patients
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.patient.model.Patient> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the patients.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.patient.model.impl.PatientModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of patients
	* @param end the upper bound of the range of patients (not inclusive)
	* @return the range of patients
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.patient.model.Patient> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the patients.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.patient.model.impl.PatientModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of patients
	* @param end the upper bound of the range of patients (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of patients
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.patient.model.Patient> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the patients from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of patients.
	*
	* @return the number of patients
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static PatientPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (PatientPersistence)PortletBeanLocatorUtil.locate(salutem.patient.service.ClpSerializer.getServletContextName(),
					PatientPersistence.class.getName());

			ReferenceRegistry.registerReference(PatientUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(PatientPersistence persistence) {
	}

	private static PatientPersistence _persistence;
}