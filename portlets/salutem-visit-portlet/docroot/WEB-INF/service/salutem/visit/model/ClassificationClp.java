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

import salutem.visit.service.ClassificationLocalServiceUtil;
import salutem.visit.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Aneta Andrzejewska
 */
public class ClassificationClp extends BaseModelImpl<Classification>
	implements Classification {
	public ClassificationClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Classification.class;
	}

	@Override
	public String getModelClassName() {
		return Classification.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _classificationId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setClassificationId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _classificationId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("classificationId", getClassificationId());
		attributes.put("patientId", getPatientId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long classificationId = (Long)attributes.get("classificationId");

		if (classificationId != null) {
			setClassificationId(classificationId);
		}

		Long patientId = (Long)attributes.get("patientId");

		if (patientId != null) {
			setPatientId(patientId);
		}
	}

	@Override
	public long getClassificationId() {
		return _classificationId;
	}

	@Override
	public void setClassificationId(long classificationId) {
		_classificationId = classificationId;

		if (_classificationRemoteModel != null) {
			try {
				Class<?> clazz = _classificationRemoteModel.getClass();

				Method method = clazz.getMethod("setClassificationId",
						long.class);

				method.invoke(_classificationRemoteModel, classificationId);
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

		if (_classificationRemoteModel != null) {
			try {
				Class<?> clazz = _classificationRemoteModel.getClass();

				Method method = clazz.getMethod("setPatientId", long.class);

				method.invoke(_classificationRemoteModel, patientId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getClassificationRemoteModel() {
		return _classificationRemoteModel;
	}

	public void setClassificationRemoteModel(
		BaseModel<?> classificationRemoteModel) {
		_classificationRemoteModel = classificationRemoteModel;
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

		Class<?> remoteModelClass = _classificationRemoteModel.getClass();

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

		Object returnValue = method.invoke(_classificationRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ClassificationLocalServiceUtil.addClassification(this);
		}
		else {
			ClassificationLocalServiceUtil.updateClassification(this);
		}
	}

	@Override
	public Classification toEscapedModel() {
		return (Classification)ProxyUtil.newProxyInstance(Classification.class.getClassLoader(),
			new Class[] { Classification.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ClassificationClp clone = new ClassificationClp();

		clone.setClassificationId(getClassificationId());
		clone.setPatientId(getPatientId());

		return clone;
	}

	@Override
	public int compareTo(Classification classification) {
		long primaryKey = classification.getPrimaryKey();

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

		if (!(obj instanceof ClassificationClp)) {
			return false;
		}

		ClassificationClp classification = (ClassificationClp)obj;

		long primaryKey = classification.getPrimaryKey();

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
		StringBundler sb = new StringBundler(5);

		sb.append("{classificationId=");
		sb.append(getClassificationId());
		sb.append(", patientId=");
		sb.append(getPatientId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("salutem.visit.model.Classification");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>classificationId</column-name><column-value><![CDATA[");
		sb.append(getClassificationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>patientId</column-name><column-value><![CDATA[");
		sb.append(getPatientId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _classificationId;
	private long _patientId;
	private BaseModel<?> _classificationRemoteModel;
	private Class<?> _clpSerializerClass = salutem.visit.service.ClpSerializer.class;
}