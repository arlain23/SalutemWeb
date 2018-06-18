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

import salutem.visit.model.Classification;

/**
 * The persistence interface for the classification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Aneta Andrzejewska
 * @see ClassificationPersistenceImpl
 * @see ClassificationUtil
 * @generated
 */
public interface ClassificationPersistence extends BasePersistence<Classification> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ClassificationUtil} to access the classification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the classifications where patientId = &#63;.
	*
	* @param patientId the patient ID
	* @return the matching classifications
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<salutem.visit.model.Classification> findByPatientId(
		long patientId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the classifications where patientId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.ClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param patientId the patient ID
	* @param start the lower bound of the range of classifications
	* @param end the upper bound of the range of classifications (not inclusive)
	* @return the range of matching classifications
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<salutem.visit.model.Classification> findByPatientId(
		long patientId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the classifications where patientId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.ClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param patientId the patient ID
	* @param start the lower bound of the range of classifications
	* @param end the upper bound of the range of classifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching classifications
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<salutem.visit.model.Classification> findByPatientId(
		long patientId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first classification in the ordered set where patientId = &#63;.
	*
	* @param patientId the patient ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching classification
	* @throws salutem.visit.NoSuchClassificationException if a matching classification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.Classification findByPatientId_First(
		long patientId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchClassificationException;

	/**
	* Returns the first classification in the ordered set where patientId = &#63;.
	*
	* @param patientId the patient ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching classification, or <code>null</code> if a matching classification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.Classification fetchByPatientId_First(
		long patientId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last classification in the ordered set where patientId = &#63;.
	*
	* @param patientId the patient ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching classification
	* @throws salutem.visit.NoSuchClassificationException if a matching classification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.Classification findByPatientId_Last(
		long patientId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchClassificationException;

	/**
	* Returns the last classification in the ordered set where patientId = &#63;.
	*
	* @param patientId the patient ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching classification, or <code>null</code> if a matching classification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.Classification fetchByPatientId_Last(
		long patientId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the classifications before and after the current classification in the ordered set where patientId = &#63;.
	*
	* @param classificationId the primary key of the current classification
	* @param patientId the patient ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next classification
	* @throws salutem.visit.NoSuchClassificationException if a classification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.Classification[] findByPatientId_PrevAndNext(
		long classificationId, long patientId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchClassificationException;

	/**
	* Removes all the classifications where patientId = &#63; from the database.
	*
	* @param patientId the patient ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPatientId(long patientId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of classifications where patientId = &#63;.
	*
	* @param patientId the patient ID
	* @return the number of matching classifications
	* @throws SystemException if a system exception occurred
	*/
	public int countByPatientId(long patientId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the classification in the entity cache if it is enabled.
	*
	* @param classification the classification
	*/
	public void cacheResult(salutem.visit.model.Classification classification);

	/**
	* Caches the classifications in the entity cache if it is enabled.
	*
	* @param classifications the classifications
	*/
	public void cacheResult(
		java.util.List<salutem.visit.model.Classification> classifications);

	/**
	* Creates a new classification with the primary key. Does not add the classification to the database.
	*
	* @param classificationId the primary key for the new classification
	* @return the new classification
	*/
	public salutem.visit.model.Classification create(long classificationId);

	/**
	* Removes the classification with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param classificationId the primary key of the classification
	* @return the classification that was removed
	* @throws salutem.visit.NoSuchClassificationException if a classification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.Classification remove(long classificationId)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchClassificationException;

	public salutem.visit.model.Classification updateImpl(
		salutem.visit.model.Classification classification)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the classification with the primary key or throws a {@link salutem.visit.NoSuchClassificationException} if it could not be found.
	*
	* @param classificationId the primary key of the classification
	* @return the classification
	* @throws salutem.visit.NoSuchClassificationException if a classification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.Classification findByPrimaryKey(
		long classificationId)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchClassificationException;

	/**
	* Returns the classification with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param classificationId the primary key of the classification
	* @return the classification, or <code>null</code> if a classification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.Classification fetchByPrimaryKey(
		long classificationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the classifications.
	*
	* @return the classifications
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<salutem.visit.model.Classification> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the classifications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.ClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of classifications
	* @param end the upper bound of the range of classifications (not inclusive)
	* @return the range of classifications
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<salutem.visit.model.Classification> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the classifications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.ClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of classifications
	* @param end the upper bound of the range of classifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of classifications
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<salutem.visit.model.Classification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the classifications from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of classifications.
	*
	* @return the number of classifications
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}