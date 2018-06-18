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

package salutem.visit.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import salutem.visit.service.ClpSerializer;
import salutem.visit.service.RegressionLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Aneta Andrzejewska
 */
public class RegressionClp extends BaseModelImpl<Regression>
	implements Regression {
	public RegressionClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Regression.class;
	}

	@Override
	public String getModelClassName() {
		return Regression.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _regressionId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setRegressionId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _regressionId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("regressionId", getRegressionId());
		attributes.put("patientId", getPatientId());
		attributes.put("doctorId", getDoctorId());
		attributes.put("minimumList", getMinimumList());
		attributes.put("maximumList", getMaximumList());
		attributes.put("chosenK", getChosenK());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long regressionId = (Long)attributes.get("regressionId");

		if (regressionId != null) {
			setRegressionId(regressionId);
		}

		Long patientId = (Long)attributes.get("patientId");

		if (patientId != null) {
			setPatientId(patientId);
		}

		Long doctorId = (Long)attributes.get("doctorId");

		if (doctorId != null) {
			setDoctorId(doctorId);
		}

		String minimumList = (String)attributes.get("minimumList");

		if (minimumList != null) {
			setMinimumList(minimumList);
		}

		String maximumList = (String)attributes.get("maximumList");

		if (maximumList != null) {
			setMaximumList(maximumList);
		}

		Integer chosenK = (Integer)attributes.get("chosenK");

		if (chosenK != null) {
			setChosenK(chosenK);
		}
	}

	@Override
	public long getRegressionId() {
		return _regressionId;
	}

	@Override
	public void setRegressionId(long regressionId) {
		_regressionId = regressionId;

		if (_regressionRemoteModel != null) {
			try {
				Class<?> clazz = _regressionRemoteModel.getClass();

				Method method = clazz.getMethod("setRegressionId", long.class);

				method.invoke(_regressionRemoteModel, regressionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPatientId() {
		return _patientId;
	}

	@Override
	public void setPatientId(long patientId) {
		_patientId = patientId;

		if (_regressionRemoteModel != null) {
			try {
				Class<?> clazz = _regressionRemoteModel.getClass();

				Method method = clazz.getMethod("setPatientId", long.class);

				method.invoke(_regressionRemoteModel, patientId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDoctorId() {
		return _doctorId;
	}

	@Override
	public void setDoctorId(long doctorId) {
		_doctorId = doctorId;

		if (_regressionRemoteModel != null) {
			try {
				Class<?> clazz = _regressionRemoteModel.getClass();

				Method method = clazz.getMethod("setDoctorId", long.class);

				method.invoke(_regressionRemoteModel, doctorId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMinimumList() {
		return _minimumList;
	}

	@Override
	public void setMinimumList(String minimumList) {
		_minimumList = minimumList;

		if (_regressionRemoteModel != null) {
			try {
				Class<?> clazz = _regressionRemoteModel.getClass();

				Method method = clazz.getMethod("setMinimumList", String.class);

				method.invoke(_regressionRemoteModel, minimumList);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaximumList() {
		return _maximumList;
	}

	@Override
	public void setMaximumList(String maximumList) {
		_maximumList = maximumList;

		if (_regressionRemoteModel != null) {
			try {
				Class<?> clazz = _regressionRemoteModel.getClass();

				Method method = clazz.getMethod("setMaximumList", String.class);

				method.invoke(_regressionRemoteModel, maximumList);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getChosenK() {
		return _chosenK;
	}

	@Override
	public void setChosenK(int chosenK) {
		_chosenK = chosenK;

		if (_regressionRemoteModel != null) {
			try {
				Class<?> clazz = _regressionRemoteModel.getClass();

				Method method = clazz.getMethod("setChosenK", int.class);

				method.invoke(_regressionRemoteModel, chosenK);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getRegressionRemoteModel() {
		return _regressionRemoteModel;
	}

	public void setRegressionRemoteModel(BaseModel<?> regressionRemoteModel) {
		_regressionRemoteModel = regressionRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _regressionRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_regressionRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			RegressionLocalServiceUtil.addRegression(this);
		}
		else {
			RegressionLocalServiceUtil.updateRegression(this);
		}
	}

	@Override
	public Regression toEscapedModel() {
		return (Regression)ProxyUtil.newProxyInstance(Regression.class.getClassLoader(),
			new Class[] { Regression.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		RegressionClp clone = new RegressionClp();

		clone.setRegressionId(getRegressionId());
		clone.setPatientId(getPatientId());
		clone.setDoctorId(getDoctorId());
		clone.setMinimumList(getMinimumList());
		clone.setMaximumList(getMaximumList());
		clone.setChosenK(getChosenK());

		return clone;
	}

	@Override
	public int compareTo(Regression regression) {
		long primaryKey = regression.getPrimaryKey();

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

		if (!(obj instanceof RegressionClp)) {
			return false;
		}

		RegressionClp regression = (RegressionClp)obj;

		long primaryKey = regression.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{regressionId=");
		sb.append(getRegressionId());
		sb.append(", patientId=");
		sb.append(getPatientId());
		sb.append(", doctorId=");
		sb.append(getDoctorId());
		sb.append(", minimumList=");
		sb.append(getMinimumList());
		sb.append(", maximumList=");
		sb.append(getMaximumList());
		sb.append(", chosenK=");
		sb.append(getChosenK());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("salutem.visit.model.Regression");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>regressionId</column-name><column-value><![CDATA[");
		sb.append(getRegressionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>patientId</column-name><column-value><![CDATA[");
		sb.append(getPatientId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>doctorId</column-name><column-value><![CDATA[");
		sb.append(getDoctorId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>minimumList</column-name><column-value><![CDATA[");
		sb.append(getMinimumList());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maximumList</column-name><column-value><![CDATA[");
		sb.append(getMaximumList());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>chosenK</column-name><column-value><![CDATA[");
		sb.append(getChosenK());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _regressionId;
	private long _patientId;
	private long _doctorId;
	private String _minimumList;
	private String _maximumList;
	private int _chosenK;
	private BaseModel<?> _regressionRemoteModel;
	private Class<?> _clpSerializerClass = salutem.visit.service.ClpSerializer.class;
}