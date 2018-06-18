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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Regression. This utility wraps
 * {@link salutem.visit.service.impl.RegressionLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Aneta Andrzejewska
 * @see RegressionLocalService
 * @see salutem.visit.service.base.RegressionLocalServiceBaseImpl
 * @see salutem.visit.service.impl.RegressionLocalServiceImpl
 * @generated
 */
public class RegressionLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link salutem.visit.service.impl.RegressionLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the regression to the database. Also notifies the appropriate model listeners.
	*
	* @param regression the regression
	* @return the regression that was added
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Regression addRegression(
		salutem.visit.model.Regression regression)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addRegression(regression);
	}

	/**
	* Creates a new regression with the primary key. Does not add the regression to the database.
	*
	* @param regressionId the primary key for the new regression
	* @return the new regression
	*/
	public static salutem.visit.model.Regression createRegression(
		long regressionId) {
		return getService().createRegression(regressionId);
	}

	/**
	* Deletes the regression with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param regressionId the primary key of the regression
	* @return the regression that was removed
	* @throws PortalException if a regression with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Regression deleteRegression(
		long regressionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteRegression(regressionId);
	}

	/**
	* Deletes the regression from the database. Also notifies the appropriate model listeners.
	*
	* @param regression the regression
	* @return the regression that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Regression deleteRegression(
		salutem.visit.model.Regression regression)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteRegression(regression);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.RegressionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.RegressionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static salutem.visit.model.Regression fetchRegression(
		long regressionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchRegression(regressionId);
	}

	/**
	* Returns the regression with the primary key.
	*
	* @param regressionId the primary key of the regression
	* @return the regression
	* @throws PortalException if a regression with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Regression getRegression(
		long regressionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getRegression(regressionId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

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
	public static java.util.List<salutem.visit.model.Regression> getRegressions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getRegressions(start, end);
	}

	/**
	* Returns the number of regressions.
	*
	* @return the number of regressions
	* @throws SystemException if a system exception occurred
	*/
	public static int getRegressionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getRegressionsCount();
	}

	/**
	* Updates the regression in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param regression the regression
	* @return the regression that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.Regression updateRegression(
		salutem.visit.model.Regression regression)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateRegression(regression);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static salutem.visit.model.Regression getRegression(long patientId,
		long doctorId) {
		return getService().getRegression(patientId, doctorId);
	}

	public static java.util.List<salutem.visit.model.WeightMap> getWeightMaps(
		long regressionId) {
		return getService().getWeightMaps(regressionId);
	}

	public static salutem.visit.model.Regression addRegressionWeights(
		long patientId, long doctorId,
		java.util.List<java.lang.Double> minList,
		java.util.List<java.lang.Double> maxList,
		java.util.HashMap<java.util.List<java.lang.Integer>, java.lang.Double> finalPolynomial,
		int chosenK) throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addRegressionWeights(patientId, doctorId, minList, maxList,
			finalPolynomial, chosenK);
	}

	public static java.util.List<salutem.visit.model.WeightMap> addWeightMap(
		long regressionId,
		java.util.HashMap<java.util.List<java.lang.Integer>, java.lang.Double> finalPolynomial)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addWeightMap(regressionId, finalPolynomial);
	}

	public static void clearService() {
		_service = null;
	}

	public static RegressionLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					RegressionLocalService.class.getName());

			if (invokableLocalService instanceof RegressionLocalService) {
				_service = (RegressionLocalService)invokableLocalService;
			}
			else {
				_service = new RegressionLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(RegressionLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(RegressionLocalService service) {
	}

	private static RegressionLocalService _service;
}