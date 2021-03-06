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
 * Provides a wrapper for {@link VisitLocalService}.
 *
 * @author Aneta Andrzejewska
 * @see VisitLocalService
 * @generated
 */
public class VisitLocalServiceWrapper implements VisitLocalService,
	ServiceWrapper<VisitLocalService> {
	public VisitLocalServiceWrapper(VisitLocalService visitLocalService) {
		_visitLocalService = visitLocalService;
	}

	/**
	* Adds the visit to the database. Also notifies the appropriate model listeners.
	*
	* @param visit the visit
	* @return the visit that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public salutem.visit.model.Visit addVisit(salutem.visit.model.Visit visit)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _visitLocalService.addVisit(visit);
	}

	/**
	* Creates a new visit with the primary key. Does not add the visit to the database.
	*
	* @param visitId the primary key for the new visit
	* @return the new visit
	*/
	@Override
	public salutem.visit.model.Visit createVisit(long visitId) {
		return _visitLocalService.createVisit(visitId);
	}

	/**
	* Deletes the visit with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param visitId the primary key of the visit
	* @return the visit that was removed
	* @throws PortalException if a visit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public salutem.visit.model.Visit deleteVisit(long visitId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _visitLocalService.deleteVisit(visitId);
	}

	/**
	* Deletes the visit from the database. Also notifies the appropriate model listeners.
	*
	* @param visit the visit
	* @return the visit that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public salutem.visit.model.Visit deleteVisit(
		salutem.visit.model.Visit visit)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _visitLocalService.deleteVisit(visit);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _visitLocalService.dynamicQuery();
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
		return _visitLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.VisitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _visitLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.VisitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _visitLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _visitLocalService.dynamicQueryCount(dynamicQuery);
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
		return _visitLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public salutem.visit.model.Visit fetchVisit(long visitId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _visitLocalService.fetchVisit(visitId);
	}

	/**
	* Returns the visit with the primary key.
	*
	* @param visitId the primary key of the visit
	* @return the visit
	* @throws PortalException if a visit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public salutem.visit.model.Visit getVisit(long visitId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _visitLocalService.getVisit(visitId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _visitLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<salutem.visit.model.Visit> getVisits(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _visitLocalService.getVisits(start, end);
	}

	/**
	* Returns the number of visits.
	*
	* @return the number of visits
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getVisitsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _visitLocalService.getVisitsCount();
	}

	/**
	* Updates the visit in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param visit the visit
	* @return the visit that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public salutem.visit.model.Visit updateVisit(
		salutem.visit.model.Visit visit)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _visitLocalService.updateVisit(visit);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _visitLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_visitLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _visitLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public salutem.visit.model.Visit addVisit(long groupId, long companyId,
		long doctorId, long patientId, java.util.Date visitDate, int startTime,
		int duration)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _visitLocalService.addVisit(groupId, companyId, doctorId,
			patientId, visitDate, startTime, duration);
	}

	@Override
	public java.util.List<salutem.visit.model.Visit> getVisitsByDoctrIdPatientIdAndDate(
		java.util.Date date, long doctorId, long patientId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _visitLocalService.getVisitsByDoctrIdPatientIdAndDate(date,
			doctorId, patientId);
	}

	@Override
	public java.util.List<salutem.visit.model.Visit> getVisitsByDoctrIdAndDate(
		java.util.Date date, long doctorId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _visitLocalService.getVisitsByDoctrIdAndDate(date, doctorId);
	}

	@Override
	public java.util.List<salutem.visit.model.Visit> getVisitsPatientIdAndDate(
		java.util.Date date, long patientId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _visitLocalService.getVisitsPatientIdAndDate(date, patientId);
	}

	@Override
	public long getPatientId(long userId) {
		return _visitLocalService.getPatientId(userId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public VisitLocalService getWrappedVisitLocalService() {
		return _visitLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedVisitLocalService(VisitLocalService visitLocalService) {
		_visitLocalService = visitLocalService;
	}

	@Override
	public VisitLocalService getWrappedService() {
		return _visitLocalService;
	}

	@Override
	public void setWrappedService(VisitLocalService visitLocalService) {
		_visitLocalService = visitLocalService;
	}

	private VisitLocalService _visitLocalService;
}