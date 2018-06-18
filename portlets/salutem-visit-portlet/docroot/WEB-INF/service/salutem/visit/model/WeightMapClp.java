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
import salutem.visit.service.WeightMapLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Aneta Andrzejewska
 */
public class WeightMapClp extends BaseModelImpl<WeightMap> implements WeightMap {
	public WeightMapClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return WeightMap.class;
	}

	@Override
	public String getModelClassName() {
		return WeightMap.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _weightMapId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setWeightMapId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _weightMapId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("weightMapId", getWeightMapId());
		attributes.put("regressionId", getRegressionId());
		attributes.put("key", getKey());
		attributes.put("value", getValue());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long weightMapId = (Long)attributes.get("weightMapId");

		if (weightMapId != null) {
			setWeightMapId(weightMapId);
		}

		Long regressionId = (Long)attributes.get("regressionId");

		if (regressionId != null) {
			setRegressionId(regressionId);
		}

		String key = (String)attributes.get("key");

		if (key != null) {
			setKey(key);
		}

		Double value = (Double)attributes.get("value");

		if (value != null) {
			setValue(value);
		}
	}

	@Override
	public long getWeightMapId() {
		return _weightMapId;
	}

	@Override
	public void setWeightMapId(long weightMapId) {
		_weightMapId = weightMapId;

		if (_weightMapRemoteModel != null) {
			try {
				Class<?> clazz = _weightMapRemoteModel.getClass();

				Method method = clazz.getMethod("setWeightMapId", long.class);

				method.invoke(_weightMapRemoteModel, weightMapId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getRegressionId() {
		return _regressionId;
	}

	@Override
	public void setRegressionId(long regressionId) {
		_regressionId = regressionId;

		if (_weightMapRemoteModel != null) {
			try {
				Class<?> clazz = _weightMapRemoteModel.getClass();

				Method method = clazz.getMethod("setRegressionId", long.class);

				method.invoke(_weightMapRemoteModel, regressionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getKey() {
		return _key;
	}

	@Override
	public void setKey(String key) {
		_key = key;

		if (_weightMapRemoteModel != null) {
			try {
				Class<?> clazz = _weightMapRemoteModel.getClass();

				Method method = clazz.getMethod("setKey", String.class);

				method.invoke(_weightMapRemoteModel, key);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getValue() {
		return _value;
	}

	@Override
	public void setValue(double value) {
		_value = value;

		if (_weightMapRemoteModel != null) {
			try {
				Class<?> clazz = _weightMapRemoteModel.getClass();

				Method method = clazz.getMethod("setValue", double.class);

				method.invoke(_weightMapRemoteModel, value);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getWeightMapRemoteModel() {
		return _weightMapRemoteModel;
	}

	public void setWeightMapRemoteModel(BaseModel<?> weightMapRemoteModel) {
		_weightMapRemoteModel = weightMapRemoteModel;
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

		Class<?> remoteModelClass = _weightMapRemoteModel.getClass();

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

		Object returnValue = method.invoke(_weightMapRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			WeightMapLocalServiceUtil.addWeightMap(this);
		}
		else {
			WeightMapLocalServiceUtil.updateWeightMap(this);
		}
	}

	@Override
	public WeightMap toEscapedModel() {
		return (WeightMap)ProxyUtil.newProxyInstance(WeightMap.class.getClassLoader(),
			new Class[] { WeightMap.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		WeightMapClp clone = new WeightMapClp();

		clone.setWeightMapId(getWeightMapId());
		clone.setRegressionId(getRegressionId());
		clone.setKey(getKey());
		clone.setValue(getValue());

		return clone;
	}

	@Override
	public int compareTo(WeightMap weightMap) {
		long primaryKey = weightMap.getPrimaryKey();

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

		if (!(obj instanceof WeightMapClp)) {
			return false;
		}

		WeightMapClp weightMap = (WeightMapClp)obj;

		long primaryKey = weightMap.getPrimaryKey();

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
		StringBundler sb = new StringBundler(9);

		sb.append("{weightMapId=");
		sb.append(getWeightMapId());
		sb.append(", regressionId=");
		sb.append(getRegressionId());
		sb.append(", key=");
		sb.append(getKey());
		sb.append(", value=");
		sb.append(getValue());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("salutem.visit.model.WeightMap");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>weightMapId</column-name><column-value><![CDATA[");
		sb.append(getWeightMapId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>regressionId</column-name><column-value><![CDATA[");
		sb.append(getRegressionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>key</column-name><column-value><![CDATA[");
		sb.append(getKey());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>value</column-name><column-value><![CDATA[");
		sb.append(getValue());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _weightMapId;
	private long _regressionId;
	private String _key;
	private double _value;
	private BaseModel<?> _weightMapRemoteModel;
	private Class<?> _clpSerializerClass = salutem.visit.service.ClpSerializer.class;
}