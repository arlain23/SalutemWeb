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

package tul.salutem.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;

import tul.salutem.model.Test;
import tul.salutem.service.base.TestLocalServiceBaseImpl;

/**
 * The implementation of the test local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link tul.salutem.service.TestLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Aneta Andrzejewska
 * @see tul.salutem.service.base.TestLocalServiceBaseImpl
 * @see tul.salutem.service.TestLocalServiceUtil
 */
public class TestLocalServiceImpl extends TestLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link tul.salutem.service.TestLocalServiceUtil} to access the test local service.
	 */
	
	public List<Test> getAllTests() throws SystemException {
		return testPersistence.findAll();
	}
	
	public int countByUsername(String username) throws SystemException {
		return testPersistence.countByusername(username);
	}
}