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

import com.liferay.portal.service.persistence.BasePersistence;

import salutem.patient.model.Patient;

/**
 * The persistence interface for the patient service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Aneta Andrzejewska
 * @see PatientPersistenceImpl
 * @see PatientUtil
 * @generated
 */
public interface PatientPersistence extends BasePersistence<Patient> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PatientUtil} to access the patient persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the patients where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching patients
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<salutem.patient.model.Patient> findByUserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<salutem.patient.model.Patient> findByUserId(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<salutem.patient.model.Patient> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first patient in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching patient
	* @throws salutem.patient.NoSuchPatientException if a matching patient could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.patient.model.Patient findByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.patient.NoSuchPatientException;

	/**
	* Returns the first patient in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching patient, or <code>null</code> if a matching patient could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.patient.model.Patient fetchByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last patient in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching patient
	* @throws salutem.patient.NoSuchPatientException if a matching patient could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.patient.model.Patient findByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.patient.NoSuchPatientException;

	/**
	* Returns the last patient in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching patient, or <code>null</code> if a matching patient could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.patient.model.Patient fetchByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public salutem.patient.model.Patient[] findByUserId_PrevAndNext(
		long patientId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.patient.NoSuchPatientException;

	/**
	* Removes all the patients where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of patients where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching patients
	* @throws SystemException if a system exception occurred
	*/
	public int countByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the patients where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching patients
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<salutem.patient.model.Patient> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<salutem.patient.model.Patient> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<salutem.patient.model.Patient> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first patient in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching patient
	* @throws salutem.patient.NoSuchPatientException if a matching patient could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.patient.model.Patient findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.patient.NoSuchPatientException;

	/**
	* Returns the first patient in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching patient, or <code>null</code> if a matching patient could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.patient.model.Patient fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last patient in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching patient
	* @throws salutem.patient.NoSuchPatientException if a matching patient could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.patient.model.Patient findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.patient.NoSuchPatientException;

	/**
	* Returns the last patient in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching patient, or <code>null</code> if a matching patient could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.patient.model.Patient fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public salutem.patient.model.Patient[] findByGroupId_PrevAndNext(
		long patientId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.patient.NoSuchPatientException;

	/**
	* Removes all the patients where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of patients where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching patients
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the patients where pesel = &#63;.
	*
	* @param pesel the pesel
	* @return the matching patients
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<salutem.patient.model.Patient> findByPESEL(
		java.lang.String pesel)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<salutem.patient.model.Patient> findByPESEL(
		java.lang.String pesel, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<salutem.patient.model.Patient> findByPESEL(
		java.lang.String pesel, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first patient in the ordered set where pesel = &#63;.
	*
	* @param pesel the pesel
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching patient
	* @throws salutem.patient.NoSuchPatientException if a matching patient could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.patient.model.Patient findByPESEL_First(
		java.lang.String pesel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.patient.NoSuchPatientException;

	/**
	* Returns the first patient in the ordered set where pesel = &#63;.
	*
	* @param pesel the pesel
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching patient, or <code>null</code> if a matching patient could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.patient.model.Patient fetchByPESEL_First(
		java.lang.String pesel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last patient in the ordered set where pesel = &#63;.
	*
	* @param pesel the pesel
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching patient
	* @throws salutem.patient.NoSuchPatientException if a matching patient could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.patient.model.Patient findByPESEL_Last(
		java.lang.String pesel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.patient.NoSuchPatientException;

	/**
	* Returns the last patient in the ordered set where pesel = &#63;.
	*
	* @param pesel the pesel
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching patient, or <code>null</code> if a matching patient could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.patient.model.Patient fetchByPESEL_Last(
		java.lang.String pesel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public salutem.patient.model.Patient[] findByPESEL_PrevAndNext(
		long patientId, java.lang.String pesel,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.patient.NoSuchPatientException;

	/**
	* Removes all the patients where pesel = &#63; from the database.
	*
	* @param pesel the pesel
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPESEL(java.lang.String pesel)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of patients where pesel = &#63;.
	*
	* @param pesel the pesel
	* @return the number of matching patients
	* @throws SystemException if a system exception occurred
	*/
	public int countByPESEL(java.lang.String pesel)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the patients where name = &#63; and middleName = &#63; and surname = &#63;.
	*
	* @param name the name
	* @param middleName the middle name
	* @param surname the surname
	* @return the matching patients
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<salutem.patient.model.Patient> findByFullName(
		java.lang.String name, java.lang.String middleName,
		java.lang.String surname)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<salutem.patient.model.Patient> findByFullName(
		java.lang.String name, java.lang.String middleName,
		java.lang.String surname, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<salutem.patient.model.Patient> findByFullName(
		java.lang.String name, java.lang.String middleName,
		java.lang.String surname, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public salutem.patient.model.Patient findByFullName_First(
		java.lang.String name, java.lang.String middleName,
		java.lang.String surname,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.patient.NoSuchPatientException;

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
	public salutem.patient.model.Patient fetchByFullName_First(
		java.lang.String name, java.lang.String middleName,
		java.lang.String surname,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public salutem.patient.model.Patient findByFullName_Last(
		java.lang.String name, java.lang.String middleName,
		java.lang.String surname,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.patient.NoSuchPatientException;

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
	public salutem.patient.model.Patient fetchByFullName_Last(
		java.lang.String name, java.lang.String middleName,
		java.lang.String surname,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public salutem.patient.model.Patient[] findByFullName_PrevAndNext(
		long patientId, java.lang.String name, java.lang.String middleName,
		java.lang.String surname,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.patient.NoSuchPatientException;

	/**
	* Removes all the patients where name = &#63; and middleName = &#63; and surname = &#63; from the database.
	*
	* @param name the name
	* @param middleName the middle name
	* @param surname the surname
	* @throws SystemException if a system exception occurred
	*/
	public void removeByFullName(java.lang.String name,
		java.lang.String middleName, java.lang.String surname)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of patients where name = &#63; and middleName = &#63; and surname = &#63;.
	*
	* @param name the name
	* @param middleName the middle name
	* @param surname the surname
	* @return the number of matching patients
	* @throws SystemException if a system exception occurred
	*/
	public int countByFullName(java.lang.String name,
		java.lang.String middleName, java.lang.String surname)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the patients where groupId = &#63; and isConfirmed = &#63;.
	*
	* @param groupId the group ID
	* @param isConfirmed the is confirmed
	* @return the matching patients
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<salutem.patient.model.Patient> findByGroupIdAndConfirmed(
		long groupId, boolean isConfirmed)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<salutem.patient.model.Patient> findByGroupIdAndConfirmed(
		long groupId, boolean isConfirmed, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<salutem.patient.model.Patient> findByGroupIdAndConfirmed(
		long groupId, boolean isConfirmed, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public salutem.patient.model.Patient findByGroupIdAndConfirmed_First(
		long groupId, boolean isConfirmed,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.patient.NoSuchPatientException;

	/**
	* Returns the first patient in the ordered set where groupId = &#63; and isConfirmed = &#63;.
	*
	* @param groupId the group ID
	* @param isConfirmed the is confirmed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching patient, or <code>null</code> if a matching patient could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.patient.model.Patient fetchByGroupIdAndConfirmed_First(
		long groupId, boolean isConfirmed,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public salutem.patient.model.Patient findByGroupIdAndConfirmed_Last(
		long groupId, boolean isConfirmed,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.patient.NoSuchPatientException;

	/**
	* Returns the last patient in the ordered set where groupId = &#63; and isConfirmed = &#63;.
	*
	* @param groupId the group ID
	* @param isConfirmed the is confirmed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching patient, or <code>null</code> if a matching patient could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.patient.model.Patient fetchByGroupIdAndConfirmed_Last(
		long groupId, boolean isConfirmed,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public salutem.patient.model.Patient[] findByGroupIdAndConfirmed_PrevAndNext(
		long patientId, long groupId, boolean isConfirmed,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.patient.NoSuchPatientException;

	/**
	* Removes all the patients where groupId = &#63; and isConfirmed = &#63; from the database.
	*
	* @param groupId the group ID
	* @param isConfirmed the is confirmed
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupIdAndConfirmed(long groupId, boolean isConfirmed)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of patients where groupId = &#63; and isConfirmed = &#63;.
	*
	* @param groupId the group ID
	* @param isConfirmed the is confirmed
	* @return the number of matching patients
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupIdAndConfirmed(long groupId, boolean isConfirmed)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the patient in the entity cache if it is enabled.
	*
	* @param patient the patient
	*/
	public void cacheResult(salutem.patient.model.Patient patient);

	/**
	* Caches the patients in the entity cache if it is enabled.
	*
	* @param patients the patients
	*/
	public void cacheResult(
		java.util.List<salutem.patient.model.Patient> patients);

	/**
	* Creates a new patient with the primary key. Does not add the patient to the database.
	*
	* @param patientId the primary key for the new patient
	* @return the new patient
	*/
	public salutem.patient.model.Patient create(long patientId);

	/**
	* Removes the patient with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param patientId the primary key of the patient
	* @return the patient that was removed
	* @throws salutem.patient.NoSuchPatientException if a patient with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.patient.model.Patient remove(long patientId)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.patient.NoSuchPatientException;

	public salutem.patient.model.Patient updateImpl(
		salutem.patient.model.Patient patient)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the patient with the primary key or throws a {@link salutem.patient.NoSuchPatientException} if it could not be found.
	*
	* @param patientId the primary key of the patient
	* @return the patient
	* @throws salutem.patient.NoSuchPatientException if a patient with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.patient.model.Patient findByPrimaryKey(long patientId)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.patient.NoSuchPatientException;

	/**
	* Returns the patient with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param patientId the primary key of the patient
	* @return the patient, or <code>null</code> if a patient with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.patient.model.Patient fetchByPrimaryKey(long patientId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the patients.
	*
	* @return the patients
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<salutem.patient.model.Patient> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<salutem.patient.model.Patient> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<salutem.patient.model.Patient> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the patients from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of patients.
	*
	* @return the number of patients
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}