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

package tul.salutem.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import tul.salutem.model.Test;
import tul.salutem.model.TestModel;
import tul.salutem.model.TestSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Test service. Represents a row in the &quot;salutem_Test&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link tul.salutem.model.TestModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TestImpl}.
 * </p>
 *
 * @author Aneta Andrzejewska
 * @see TestImpl
 * @see tul.salutem.model.Test
 * @see tul.salutem.model.TestModel
 * @generated
 */
@JSON(strict = true)
public class TestModelImpl extends BaseModelImpl<Test> implements TestModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a test model instance should use the {@link tul.salutem.model.Test} interface instead.
	 */
	public static final String TABLE_NAME = "salutem_Test";
	public static final Object[][] TABLE_COLUMNS = {
			{ "testId", Types.BIGINT },
			{ "username", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table salutem_Test (testId LONG not null primary key,username VARCHAR(75) null,createDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table salutem_Test";
	public static final String ORDER_BY_JPQL = " ORDER BY test.testId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY salutem_Test.testId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.tul.salutem.model.Test"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.tul.salutem.model.Test"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.tul.salutem.model.Test"),
			true);
	public static long USERNAME_COLUMN_BITMASK = 1L;
	public static long TESTID_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Test toModel(TestSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Test model = new TestImpl();

		model.setTestId(soapModel.getTestId());
		model.setUsername(soapModel.getUsername());
		model.setCreateDate(soapModel.getCreateDate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Test> toModels(TestSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Test> models = new ArrayList<Test>(soapModels.length);

		for (TestSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.tul.salutem.model.Test"));

	public TestModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _testId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTestId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _testId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Test.class;
	}

	@Override
	public String getModelClassName() {
		return Test.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("testId", getTestId());
		attributes.put("username", getUsername());
		attributes.put("createDate", getCreateDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long testId = (Long)attributes.get("testId");

		if (testId != null) {
			setTestId(testId);
		}

		String username = (String)attributes.get("username");

		if (username != null) {
			setUsername(username);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}
	}

	@JSON
	@Override
	public long getTestId() {
		return _testId;
	}

	@Override
	public void setTestId(long testId) {
		_testId = testId;
	}

	@JSON
	@Override
	public String getUsername() {
		if (_username == null) {
			return StringPool.BLANK;
		}
		else {
			return _username;
		}
	}

	@Override
	public void setUsername(String username) {
		_columnBitmask |= USERNAME_COLUMN_BITMASK;

		if (_originalUsername == null) {
			_originalUsername = _username;
		}

		_username = username;
	}

	public String getOriginalUsername() {
		return GetterUtil.getString(_originalUsername);
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Test.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Test toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Test)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TestImpl testImpl = new TestImpl();

		testImpl.setTestId(getTestId());
		testImpl.setUsername(getUsername());
		testImpl.setCreateDate(getCreateDate());

		testImpl.resetOriginalValues();

		return testImpl;
	}

	@Override
	public int compareTo(Test test) {
		long primaryKey = test.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Test)) {
			return false;
		}

		Test test = (Test)obj;

		long primaryKey = test.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		TestModelImpl testModelImpl = this;

		testModelImpl._originalUsername = testModelImpl._username;

		testModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Test> toCacheModel() {
		TestCacheModel testCacheModel = new TestCacheModel();

		testCacheModel.testId = getTestId();

		testCacheModel.username = getUsername();

		String username = testCacheModel.username;

		if ((username != null) && (username.length() == 0)) {
			testCacheModel.username = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			testCacheModel.createDate = createDate.getTime();
		}
		else {
			testCacheModel.createDate = Long.MIN_VALUE;
		}

		return testCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{testId=");
		sb.append(getTestId());
		sb.append(", username=");
		sb.append(getUsername());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("tul.salutem.model.Test");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>testId</column-name><column-value><![CDATA[");
		sb.append(getTestId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>username</column-name><column-value><![CDATA[");
		sb.append(getUsername());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Test.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] { Test.class };
	private long _testId;
	private String _username;
	private String _originalUsername;
	private Date _createDate;
	private long _columnBitmask;
	private Test _escapedModel;
}