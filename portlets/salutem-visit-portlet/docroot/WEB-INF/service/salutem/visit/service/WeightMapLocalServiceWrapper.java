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
 * Provides a wrapper for {@link WeightMapLocalService}.
 *
 * @author Aneta Andrzejewska
 * @see WeightMapLocalService
 * @generated
 */
public class WeightMapLocalServiceWrapper implements WeightMapLocalService,
	ServiceWrapper<WeightMapLocalService> {
	public WeightMapLocalServiceWrapper(
		WeightMapLocalService weightMapLocalService) {
		_weightMapLocalService = weightMapLocalService;
	}

	/**
	* Adds the weight map to the database. Also notifies the appropriate model listeners.
	*
	* @param weightMap the weight map
	* @return the weight map that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public salutem.visit.model.WeightMap addWeightMap(
		salutem.visit.model.WeightMap weightMap)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _weightMapLocalService.addWeightMap(weightMap);
	}

	/**
	* Creates a new weight map with the primary key. Does not add the weight map to the database.
	*
	* @param weightMapId the primary key for the new weight map
	* @return the new weight map
	*/
	@Override
	public salutem.visit.model.WeightMap createWeightMap(long weightMapId) {
		return _weightMapLocalService.createWeightMap(weightMapId);
	}

	/**
	* Deletes the weight map with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param weightMapId the primary key of the weight map
	* @return the weight map that was removed
	* @throws PortalException if a weight map with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public salutem.visit.model.WeightMap deleteWeightMap(long weightMapId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _weightMapLocalService.deleteWeightMap(weightMapId);
	}

	/**
	* Deletes the weight map from the database. Also notifies the appropriate model listeners.
	*
	* @param weightMap the weight map
	* @return the weight map that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public salutem.visit.model.WeightMap deleteWeightMap(
		salutem.visit.model.WeightMap weightMap)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _weightMapLocalService.deleteWeightMap(weightMap);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _weightMapLocalService.dynamicQuery();
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
		return _weightMapLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.WeightMapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _weightMapLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.WeightMapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _weightMapLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
		return _weightMapLocalService.dynamicQueryCount(dynamicQuery);
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
		return _weightMapLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public salutem.visit.model.WeightMap fetchWeightMap(long weightMapId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _weightMapLocalService.fetchWeightMap(weightMapId);
	}

	/**
	* Returns the weight map with the primary key.
	*
	* @param weightMapId the primary key of the weight map
	* @return the weight map
	* @throws PortalException if a weight map with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public salutem.visit.model.WeightMap getWeightMap(long weightMapId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _weightMapLocalService.getWeightMap(weightMapId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _weightMapLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the weight maps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.WeightMapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of weight maps
	* @param end the upper bound of the range of weight maps (not inclusive)
	* @return the range of weight maps
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<salutem.visit.model.WeightMap> getWeightMaps(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _weightMapLocalService.getWeightMaps(start, end);
	}

	/**
	* Returns the number of weight maps.
	*
	* @return the number of weight maps
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getWeightMapsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _weightMapLocalService.getWeightMapsCount();
	}

	/**
	* Updates the weight map in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param weightMap the weight map
	* @return the weight map that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public salutem.visit.model.WeightMap updateWeightMap(
		salutem.visit.model.WeightMap weightMap)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _weightMapLocalService.updateWeightMap(weightMap);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _weightMapLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_weightMapLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _weightMapLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public WeightMapLocalService getWrappedWeightMapLocalService() {
		return _weightMapLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedWeightMapLocalService(
		WeightMapLocalService weightMapLocalService) {
		_weightMapLocalService = weightMapLocalService;
	}

	@Override
	public WeightMapLocalService getWrappedService() {
		return _weightMapLocalService;
	}

	@Override
	public void setWrappedService(WeightMapLocalService weightMapLocalService) {
		_weightMapLocalService = weightMapLocalService;
	}

	private WeightMapLocalService _weightMapLocalService;
}