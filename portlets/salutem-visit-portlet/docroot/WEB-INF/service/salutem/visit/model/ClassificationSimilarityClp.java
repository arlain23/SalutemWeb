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

import salutem.visit.service.ClassificationSimilarityLocalServiceUtil;
import salutem.visit.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Aneta Andrzejewska
 */
public class ClassificationSimilarityClp extends BaseModelImpl<ClassificationSimilarity>
	implements ClassificationSimilarity {
	public ClassificationSimilarityClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ClassificationSimilarity.class;
	}

	@Override
	public String getModelClassName() {
		return ClassificationSimilarity.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _similarityId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSimilarityId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _similarityId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("similarityId", getSimilarityId());
		attributes.put("classificationId", getClassificationId());
		attributes.put("patientId", getPatientId());
		attributes.put("similarity", getSimilarity());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long similarityId = (Long)attributes.get("similarityId");

		if (similarityId != null) {
			setSimilarityId(similarityId);
		}

		Long classificationId = (Long)attributes.get("classificationId");

		if (classificationId != null) {
			setClassificationId(classificationId);
		}

		Long patientId = (Long)attributes.get("patientId");

		if (patientId != null) {
			setPatientId(patientId);
		}

		Double similarity = (Double)attributes.get("similarity");

		if (similarity != null) {
			setSimilarity(similarity);
		}
	}

	@Override
	public long getSimilarityId() {
		return _similarityId;
	}

	@Override
	public void setSimilarityId(long similarityId) {
		_similarityId = similarityId;

		if (_classificationSimilarityRemoteModel != null) {
			try {
				Class<?> clazz = _classificationSimilarityRemoteModel.getClass();

				Method method = clazz.getMethod("setSimilarityId", long.class);

				method.invoke(_classificationSimilarityRemoteModel, similarityId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getClassificationId() {
		return _classificationId;
	}

	@Override
	public void setClassificationId(long classificationId) {
		_classificationId = classificationId;

		if (_classificationSimilarityRemoteModel != null) {
			try {
				Class<?> clazz = _classificationSimilarityRemoteModel.getClass();

				Method method = clazz.getMethod("setClassificationId",
						long.class);

				method.invoke(_classificationSimilarityRemoteModel,
					classificationId);
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

		if (_classificationSimilarityRemoteModel != null) {
			try {
				Class<?> clazz = _classificationSimilarityRemoteModel.getClass();

				Method method = clazz.getMethod("setPatientId", long.class);

				method.invoke(_classificationSimilarityRemoteModel, patientId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getSimilarity() {
		return _similarity;
	}

	@Override
	public void setSimilarity(double similarity) {
		_similarity = similarity;

		if (_classificationSimilarityRemoteModel != null) {
			try {
				Class<?> clazz = _classificationSimilarityRemoteModel.getClass();

				Method method = clazz.getMethod("setSimilarity", double.class);

				method.invoke(_classificationSimilarityRemoteModel, similarity);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getClassificationSimilarityRemoteModel() {
		return _classificationSimilarityRemoteModel;
	}

	public void setClassificationSimilarityRemoteModel(
		BaseModel<?> classificationSimilarityRemoteModel) {
		_classificationSimilarityRemoteModel = classificationSimilarityRemoteModel;
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

		Class<?> remoteModelClass = _classificationSimilarityRemoteModel.getClass();

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

		Object returnValue = method.invoke(_classificationSimilarityRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ClassificationSimilarityLocalServiceUtil.addClassificationSimilarity(this);
		}
		else {
			ClassificationSimilarityLocalServiceUtil.updateClassificationSimilarity(this);
		}
	}

	@Override
	public ClassificationSimilarity toEscapedModel() {
		return (ClassificationSimilarity)ProxyUtil.newProxyInstance(ClassificationSimilarity.class.getClassLoader(),
			new Class[] { ClassificationSimilarity.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ClassificationSimilarityClp clone = new ClassificationSimilarityClp();

		clone.setSimilarityId(getSimilarityId());
		clone.setClassificationId(getClassificationId());
		clone.setPatientId(getPatientId());
		clone.setSimilarity(getSimilarity());

		return clone;
	}

	@Override
	public int compareTo(ClassificationSimilarity classificationSimilarity) {
		long primaryKey = classificationSimilarity.getPrimaryKey();

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

		if (!(obj instanceof ClassificationSimilarityClp)) {
			return false;
		}

		ClassificationSimilarityClp classificationSimilarity = (ClassificationSimilarityClp)obj;

		long primaryKey = classificationSimilarity.getPrimaryKey();

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

		sb.append("{similarityId=");
		sb.append(getSimilarityId());
		sb.append(", classificationId=");
		sb.append(getClassificationId());
		sb.append(", patientId=");
		sb.append(getPatientId());
		sb.append(", similarity=");
		sb.append(getSimilarity());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("salutem.visit.model.ClassificationSimilarity");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>similarityId</column-name><column-value><![CDATA[");
		sb.append(getSimilarityId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>classificationId</column-name><column-value><![CDATA[");
		sb.append(getClassificationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>patientId</column-name><column-value><![CDATA[");
		sb.append(getPatientId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>similarity</column-name><column-value><![CDATA[");
		sb.append(getSimilarity());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _similarityId;
	private long _classificationId;
	private long _patientId;
	private double _similarity;
	private BaseModel<?> _classificationSimilarityRemoteModel;
	private Class<?> _clpSerializerClass = salutem.visit.service.ClpSerializer.class;
}