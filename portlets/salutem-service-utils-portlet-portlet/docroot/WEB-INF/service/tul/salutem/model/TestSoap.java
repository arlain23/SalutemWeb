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

package tul.salutem.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link tul.salutem.service.http.TestServiceSoap}.
 *
 * @author Aneta Andrzejewska
 * @see tul.salutem.service.http.TestServiceSoap
 * @generated
 */
public class TestSoap implements Serializable {
	public static TestSoap toSoapModel(Test model) {
		TestSoap soapModel = new TestSoap();

		soapModel.setTestId(model.getTestId());
		soapModel.setUsername(model.getUsername());
		soapModel.setCreateDate(model.getCreateDate());

		return soapModel;
	}

	public static TestSoap[] toSoapModels(Test[] models) {
		TestSoap[] soapModels = new TestSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TestSoap[][] toSoapModels(Test[][] models) {
		TestSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TestSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TestSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TestSoap[] toSoapModels(List<Test> models) {
		List<TestSoap> soapModels = new ArrayList<TestSoap>(models.size());

		for (Test model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TestSoap[soapModels.size()]);
	}

	public TestSoap() {
	}

	public long getPrimaryKey() {
		return _testId;
	}

	public void setPrimaryKey(long pk) {
		setTestId(pk);
	}

	public long getTestId() {
		return _testId;
	}

	public void setTestId(long testId) {
		_testId = testId;
	}

	public String getUsername() {
		return _username;
	}

	public void setUsername(String username) {
		_username = username;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	private long _testId;
	private String _username;
	private Date _createDate;
}