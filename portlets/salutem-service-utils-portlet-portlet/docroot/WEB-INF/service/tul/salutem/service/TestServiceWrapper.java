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

package tul.salutem.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TestService}.
 *
 * @author Aneta Andrzejewska
 * @see TestService
 * @generated
 */
public class TestServiceWrapper implements TestService,
	ServiceWrapper<TestService> {
	public TestServiceWrapper(TestService testService) {
		_testService = testService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _testService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_testService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _testService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public boolean sayHello(java.lang.String msg) {
		return _testService.sayHello(msg);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray checkUserAuthentication(
		java.lang.String username, java.lang.String password) {
		return _testService.checkUserAuthentication(username, password);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TestService getWrappedTestService() {
		return _testService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTestService(TestService testService) {
		_testService = testService;
	}

	@Override
	public TestService getWrappedService() {
		return _testService;
	}

	@Override
	public void setWrappedService(TestService testService) {
		_testService = testService;
	}

	private TestService _testService;
}