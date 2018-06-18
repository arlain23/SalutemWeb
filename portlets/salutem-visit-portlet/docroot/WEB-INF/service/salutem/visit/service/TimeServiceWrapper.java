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
 * Provides a wrapper for {@link TimeService}.
 *
 * @author Aneta Andrzejewska
 * @see TimeService
 * @generated
 */
public class TimeServiceWrapper implements TimeService,
	ServiceWrapper<TimeService> {
	public TimeServiceWrapper(TimeService timeService) {
		_timeService = timeService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _timeService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_timeService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _timeService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public java.lang.String registerEntrance(long doctorId, long patientId,
		java.lang.String date, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _timeService.registerEntrance(doctorId, patientId, date, groupId);
	}

	@Override
	public boolean registerExit(java.lang.String date, java.lang.String uuid) {
		return _timeService.registerExit(date, uuid);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TimeService getWrappedTimeService() {
		return _timeService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTimeService(TimeService timeService) {
		_timeService = timeService;
	}

	@Override
	public TimeService getWrappedService() {
		return _timeService;
	}

	@Override
	public void setWrappedService(TimeService timeService) {
		_timeService = timeService;
	}

	private TimeService _timeService;
}