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

package salutem.visit.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ClassificationLocalService}.
 *
 * @author Aneta Andrzejewska
 * @see ClassificationLocalService
 * @generated
 */
public class ClassificationLocalServiceWrapper
	implements ClassificationLocalService,
		ServiceWrapper<ClassificationLocalService> {
	public ClassificationLocalServiceWrapper(
		ClassificationLocalService classificationLocalService) {
		_classificationLocalService = classificationLocalService;
	}

	/**
	* Adds the classification to the database. Also notifies the appropriate model listeners.
	*
	* @param classification the classification
	* @return the classification that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public salutem.visit.model.Classification addClassification(
		salutem.visit.model.Classification classification)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _classificationLocalService.addClassification(classification);
	}

	/**
	* Creates a new classification with the primary key. Does not add the classification to the database.
	*
	* @param classificationId the primary key for the new classification
	* @return the new classification
	*/
	@Override
	public salutem.visit.model.Classification createClassification(
		long classificationId) {
		return _classificationLocalService.createClassification(classificationId);
	}

	/**
	* Deletes the classification with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param classificationId the primary key of the classification
	* @return the classification that was removed
	* @throws PortalException if a classification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public salutem.visit.model.Classification deleteClassification(
		long classificationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _classificationLocalService.deleteClassification(classificationId);
	}

	/**
	* Deletes the classification from the database. Also notifies the appropriate model listeners.
	*
	* @param classification the classification
	* @return the classification that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public salutem.visit.model.Classification deleteClassification(
		salutem.visit.model.Classification classification)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _classificationLocalService.deleteClassification(classification);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _classificationLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _classificationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.ClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _classificationLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.ClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _classificationLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _classificationLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _classificationLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public salutem.visit.model.Classification fetchClassification(
		long classificationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _classificationLocalService.fetchClassification(classificationId);
	}

	/**
	* Returns the classification with the primary key.
	*
	* @param classificationId the primary key of the classification
	* @return the classification
	* @throws PortalException if a classification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public salutem.visit.model.Classification getClassification(
		long classificationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _classificationLocalService.getClassification(classificationId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _classificationLocalService.getPersistedModel(primaryKeyObj);
	}

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
	@Override
	public java.util.List<salutem.visit.model.Classification> getClassifications(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _classificationLocalService.getClassifications(start, end);
	}

	/**
	* Returns the number of classifications.
	*
	* @return the number of classifications
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getClassificationsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _classificationLocalService.getClassificationsCount();
	}

	/**
	* Updates the classification in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param classification the classification
	* @return the classification that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public salutem.visit.model.Classification updateClassification(
		salutem.visit.model.Classification classification)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _classificationLocalService.updateClassification(classification);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _classificationLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_classificationLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _classificationLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public salutem.visit.model.Classification getClassificationByPatientId(
		long patientId) {
		return _classificationLocalService.getClassificationByPatientId(patientId);
	}

	@Override
	public salutem.visit.model.Classification addClassification(long patientId) {
		return _classificationLocalService.addClassification(patientId);
	}

	@Override
	public void removeSimilaritiesByClassificationId(long classificationId) {
		_classificationLocalService.removeSimilaritiesByClassificationId(classificationId);
	}

	@Override
	public salutem.visit.model.ClassificationSimilarity addClassificationSimilarity(
		long classificationId, long patientId, double similarityVal)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _classificationLocalService.addClassificationSimilarity(classificationId,
			patientId, similarityVal);
	}

	@Override
	public java.util.List<salutem.visit.model.ClassificationSimilarity> getSimilaritiesByClassificationId(
		long classificationId) {
		return _classificationLocalService.getSimilaritiesByClassificationId(classificationId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ClassificationLocalService getWrappedClassificationLocalService() {
		return _classificationLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedClassificationLocalService(
		ClassificationLocalService classificationLocalService) {
		_classificationLocalService = classificationLocalService;
	}

	@Override
	public ClassificationLocalService getWrappedService() {
		return _classificationLocalService;
	}

	@Override
	public void setWrappedService(
		ClassificationLocalService classificationLocalService) {
		_classificationLocalService = classificationLocalService;
	}

	private ClassificationLocalService _classificationLocalService;
}