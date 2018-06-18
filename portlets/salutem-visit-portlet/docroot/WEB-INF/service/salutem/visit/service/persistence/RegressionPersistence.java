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

import salutem.visit.model.Regression;

/**
 * The persistence interface for the regression service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Aneta Andrzejewska
 * @see RegressionPersistenceImpl
 * @see RegressionUtil
 * @generated
 */
public interface RegressionPersistence extends BasePersistence<Regression> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RegressionUtil} to access the regression persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the regressions where patientId = &#63; and doctorId = &#63;.
	*
	* @param patientId the patient ID
	* @param doctorId the doctor ID
	* @return the matching regressions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<salutem.visit.model.Regression> findByPatientIdAndDoctorId(
		long patientId, long doctorId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the regressions where patientId = &#63; and doctorId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.RegressionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param patientId the patient ID
	* @param doctorId the doctor ID
	* @param start the lower bound of the range of regressions
	* @param end the upper bound of the range of regressions (not inclusive)
	* @return the range of matching regressions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<salutem.visit.model.Regression> findByPatientIdAndDoctorId(
		long patientId, long doctorId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the regressions where patientId = &#63; and doctorId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.RegressionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param patientId the patient ID
	* @param doctorId the doctor ID
	* @param start the lower bound of the range of regressions
	* @param end the upper bound of the range of regressions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching regressions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<salutem.visit.model.Regression> findByPatientIdAndDoctorId(
		long patientId, long doctorId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first regression in the ordered set where patientId = &#63; and doctorId = &#63;.
	*
	* @param patientId the patient ID
	* @param doctorId the doctor ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching regression
	* @throws salutem.visit.NoSuchRegressionException if a matching regression could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.Regression findByPatientIdAndDoctorId_First(
		long patientId, long doctorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchRegressionException;

	/**
	* Returns the first regression in the ordered set where patientId = &#63; and doctorId = &#63;.
	*
	* @param patientId the patient ID
	* @param doctorId the doctor ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching regression, or <code>null</code> if a matching regression could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.Regression fetchByPatientIdAndDoctorId_First(
		long patientId, long doctorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last regression in the ordered set where patientId = &#63; and doctorId = &#63;.
	*
	* @param patientId the patient ID
	* @param doctorId the doctor ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching regression
	* @throws salutem.visit.NoSuchRegressionException if a matching regression could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.Regression findByPatientIdAndDoctorId_Last(
		long patientId, long doctorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchRegressionException;

	/**
	* Returns the last regression in the ordered set where patientId = &#63; and doctorId = &#63;.
	*
	* @param patientId the patient ID
	* @param doctorId the doctor ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching regression, or <code>null</code> if a matching regression could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.Regression fetchByPatientIdAndDoctorId_Last(
		long patientId, long doctorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the regressions before and after the current regression in the ordered set where patientId = &#63; and doctorId = &#63;.
	*
	* @param regressionId the primary key of the current regression
	* @param patientId the patient ID
	* @param doctorId the doctor ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next regression
	* @throws salutem.visit.NoSuchRegressionException if a regression with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.Regression[] findByPatientIdAndDoctorId_PrevAndNext(
		long regressionId, long patientId, long doctorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchRegressionException;

	/**
	* Removes all the regressions where patientId = &#63; and doctorId = &#63; from the database.
	*
	* @param patientId the patient ID
	* @param doctorId the doctor ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPatientIdAndDoctorId(long patientId, long doctorId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of regressions where patientId = &#63; and doctorId = &#63;.
	*
	* @param patientId the patient ID
	* @param doctorId the doctor ID
	* @return the number of matching regressions
	* @throws SystemException if a system exception occurred
	*/
	public int countByPatientIdAndDoctorId(long patientId, long doctorId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the regression in the entity cache if it is enabled.
	*
	* @param regression the regression
	*/
	public void cacheResult(salutem.visit.model.Regression regression);

	/**
	* Caches the regressions in the entity cache if it is enabled.
	*
	* @param regressions the regressions
	*/
	public void cacheResult(
		java.util.List<salutem.visit.model.Regression> regressions);

	/**
	* Creates a new regression with the primary key. Does not add the regression to the database.
	*
	* @param regressionId the primary key for the new regression
	* @return the new regression
	*/
	public salutem.visit.model.Regression create(long regressionId);

	/**
	* Removes the regression with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param regressionId the primary key of the regression
	* @return the regression that was removed
	* @throws salutem.visit.NoSuchRegressionException if a regression with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.Regression remove(long regressionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchRegressionException;

	public salutem.visit.model.Regression updateImpl(
		salutem.visit.model.Regression regression)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the regression with the primary key or throws a {@link salutem.visit.NoSuchRegressionException} if it could not be found.
	*
	* @param regressionId the primary key of the regression
	* @return the regression
	* @throws salutem.visit.NoSuchRegressionException if a regression with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.Regression findByPrimaryKey(long regressionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchRegressionException;

	/**
	* Returns the regression with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param regressionId the primary key of the regression
	* @return the regression, or <code>null</code> if a regression with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.Regression fetchByPrimaryKey(long regressionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the regressions.
	*
	* @return the regressions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<salutem.visit.model.Regression> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the regressions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.RegressionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of regressions
	* @param end the upper bound of the range of regressions (not inclusive)
	* @return the range of regressions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<salutem.visit.model.Regression> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the regressions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.RegressionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of regressions
	* @param end the upper bound of the range of regressions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of regressions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<salutem.visit.model.Regression> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the regressions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of regressions.
	*
	* @return the number of regressions
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}