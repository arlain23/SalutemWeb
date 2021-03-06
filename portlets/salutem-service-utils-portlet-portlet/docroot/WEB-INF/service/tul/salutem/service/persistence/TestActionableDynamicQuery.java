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

package tul.salutem.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import tul.salutem.model.Test;

import tul.salutem.service.TestLocalServiceUtil;

/**
 * @author Aneta Andrzejewska
 * @generated
 */
public abstract class TestActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public TestActionableDynamicQuery() throws SystemException {
		setBaseLocalService(TestLocalServiceUtil.getService());
		setClass(Test.class);

		setClassLoader(tul.salutem.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("testId");
	}
}