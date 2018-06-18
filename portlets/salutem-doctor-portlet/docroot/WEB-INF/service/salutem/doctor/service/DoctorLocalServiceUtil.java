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

package salutem.doctor.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Doctor. This utility wraps
 * {@link salutem.doctor.service.impl.DoctorLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Aneta Andrzejewska
 * @see DoctorLocalService
 * @see salutem.doctor.service.base.DoctorLocalServiceBaseImpl
 * @see salutem.doctor.service.impl.DoctorLocalServiceImpl
 * @generated
 */
public class DoctorLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link salutem.doctor.service.impl.DoctorLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the doctor to the database. Also notifies the appropriate model listeners.
	*
	* @param doctor the doctor
	* @return the doctor that was added
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.doctor.model.Doctor addDoctor(
		salutem.doctor.model.Doctor doctor)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDoctor(doctor);
	}

	/**
	* Creates a new doctor with the primary key. Does not add the doctor to the database.
	*
	* @param doctorId the primary key for the new doctor
	* @return the new doctor
	*/
	public static salutem.doctor.model.Doctor createDoctor(long doctorId) {
		return getService().createDoctor(doctorId);
	}

	/**
	* Deletes the doctor with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param doctorId the primary key of the doctor
	* @return the doctor that was removed
	* @throws PortalException if a doctor with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.doctor.model.Doctor deleteDoctor(long doctorId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDoctor(doctorId);
	}

	/**
	* Deletes the doctor from the database. Also notifies the appropriate model listeners.
	*
	* @param doctor the doctor
	* @return the doctor that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.doctor.model.Doctor deleteDoctor(
		salutem.doctor.model.Doctor doctor)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDoctor(doctor);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.doctor.model.impl.DoctorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.doctor.model.impl.DoctorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static salutem.doctor.model.Doctor fetchDoctor(long doctorId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDoctor(doctorId);
	}

	/**
	* Returns the doctor with the primary key.
	*
	* @param doctorId the primary key of the doctor
	* @return the doctor
	* @throws PortalException if a doctor with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.doctor.model.Doctor getDoctor(long doctorId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDoctor(doctorId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<salutem.doctor.model.Doctor> getDoctors(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDoctors(start, end);
	}

	/**
	* Returns the number of doctors.
	*
	* @return the number of doctors
	* @throws SystemException if a system exception occurred
	*/
	public static int getDoctorsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDoctorsCount();
	}

	/**
	* Updates the doctor in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param doctor the doctor
	* @return the doctor that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.doctor.model.Doctor updateDoctor(
		salutem.doctor.model.Doctor doctor)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDoctor(doctor);
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

	public static java.util.List<salutem.doctor.model.Doctor> getAllDoctors() {
		return getService().getAllDoctors();
	}

	public static java.util.List<salutem.doctor.model.Doctor> getAllDoctorsByGroupId(
		long groupId) {
		return getService().getAllDoctorsByGroupId(groupId);
	}

	public static java.util.List<com.liferay.portal.model.User> getAllUsersNotSalutemDoctors(
		long groupId, long companyId) {
		return getService().getAllUsersNotSalutemDoctors(groupId, companyId);
	}

	public static salutem.doctor.model.Doctor getDoctorByUserID(long userId,
		long groupId) {
		return getService().getDoctorByUserID(userId, groupId);
	}

	public static boolean existByUserId(long userId, long groupId) {
		return getService().existByUserId(userId, groupId);
	}

	public static salutem.doctor.model.Doctor addDoctor(long groupId,
		long companyId, long userId, java.lang.String userName,
		java.lang.String firstName, java.lang.String middleName,
		java.lang.String surname, long imageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addDoctor(groupId, companyId, userId, userName, firstName,
			middleName, surname, imageId);
	}

	public static salutem.doctor.model.Doctor updateDoctor(long doctorId,
		long imageId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDoctor(doctorId, imageId);
	}

	public static void clearService() {
		_service = null;
	}

	public static DoctorLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DoctorLocalService.class.getName());

			if (invokableLocalService instanceof DoctorLocalService) {
				_service = (DoctorLocalService)invokableLocalService;
			}
			else {
				_service = new DoctorLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(DoctorLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(DoctorLocalService service) {
	}

	private static DoctorLocalService _service;
}