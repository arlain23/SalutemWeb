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
import salutem.visit.service.VisitLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Aneta Andrzejewska
 */
public class VisitClp extends BaseModelImpl<Visit> implements Visit {
	public VisitClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Visit.class;
	}

	@Override
	public String getModelClassName() {
		return Visit.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _visitId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setVisitId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _visitId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("visitId", getVisitId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("doctorId", getDoctorId());
		attributes.put("patientId", getPatientId());
		attributes.put("cancelled", getCancelled());
		attributes.put("hasHappened", getHasHappened());
		attributes.put("visitDate", getVisitDate());
		attributes.put("startTimeMinutes", getStartTimeMinutes());
		attributes.put("duration", getDuration());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long visitId = (Long)attributes.get("visitId");

		if (visitId != null) {
			setVisitId(visitId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long doctorId = (Long)attributes.get("doctorId");

		if (doctorId != null) {
			setDoctorId(doctorId);
		}

		Long patientId = (Long)attributes.get("patientId");

		if (patientId != null) {
			setPatientId(patientId);
		}

		Boolean cancelled = (Boolean)attributes.get("cancelled");

		if (cancelled != null) {
			setCancelled(cancelled);
		}

		Boolean hasHappened = (Boolean)attributes.get("hasHappened");

		if (hasHappened != null) {
			setHasHappened(hasHappened);
		}

		Date visitDate = (Date)attributes.get("visitDate");

		if (visitDate != null) {
			setVisitDate(visitDate);
		}

		Integer startTimeMinutes = (Integer)attributes.get("startTimeMinutes");

		if (startTimeMinutes != null) {
			setStartTimeMinutes(startTimeMinutes);
		}

		Integer duration = (Integer)attributes.get("duration");

		if (duration != null) {
			setDuration(duration);
		}
	}

	@Override
	public long getVisitId() {
		return _visitId;
	}

	@Override
	public void setVisitId(long visitId) {
		_visitId = visitId;

		if (_visitRemoteModel != null) {
			try {
				Class<?> clazz = _visitRemoteModel.getClass();

				Method method = clazz.getMethod("setVisitId", long.class);

				method.invoke(_visitRemoteModel, visitId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_visitRemoteModel != null) {
			try {
				Class<?> clazz = _visitRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_visitRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_visitRemoteModel != null) {
			try {
				Class<?> clazz = _visitRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_visitRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_visitRemoteModel != null) {
			try {
				Class<?> clazz = _visitRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_visitRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_visitRemoteModel != null) {
			try {
				Class<?> clazz = _visitRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_visitRemoteModel, modifiedDate);
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

		if (_visitRemoteModel != null) {
			try {
				Class<?> clazz = _visitRemoteModel.getClass();

				Method method = clazz.getMethod("setDoctorId", long.class);

				method.invoke(_visitRemoteModel, doctorId);
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

		if (_visitRemoteModel != null) {
			try {
				Class<?> clazz = _visitRemoteModel.getClass();

				Method method = clazz.getMethod("setPatientId", long.class);

				method.invoke(_visitRemoteModel, patientId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getCancelled() {
		return _cancelled;
	}

	@Override
	public boolean isCancelled() {
		return _cancelled;
	}

	@Override
	public void setCancelled(boolean cancelled) {
		_cancelled = cancelled;

		if (_visitRemoteModel != null) {
			try {
				Class<?> clazz = _visitRemoteModel.getClass();

				Method method = clazz.getMethod("setCancelled", boolean.class);

				method.invoke(_visitRemoteModel, cancelled);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getHasHappened() {
		return _hasHappened;
	}

	@Override
	public boolean isHasHappened() {
		return _hasHappened;
	}

	@Override
	public void setHasHappened(boolean hasHappened) {
		_hasHappened = hasHappened;

		if (_visitRemoteModel != null) {
			try {
				Class<?> clazz = _visitRemoteModel.getClass();

				Method method = clazz.getMethod("setHasHappened", boolean.class);

				method.invoke(_visitRemoteModel, hasHappened);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getVisitDate() {
		return _visitDate;
	}

	@Override
	public void setVisitDate(Date visitDate) {
		_visitDate = visitDate;

		if (_visitRemoteModel != null) {
			try {
				Class<?> clazz = _visitRemoteModel.getClass();

				Method method = clazz.getMethod("setVisitDate", Date.class);

				method.invoke(_visitRemoteModel, visitDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getStartTimeMinutes() {
		return _startTimeMinutes;
	}

	@Override
	public void setStartTimeMinutes(int startTimeMinutes) {
		_startTimeMinutes = startTimeMinutes;

		if (_visitRemoteModel != null) {
			try {
				Class<?> clazz = _visitRemoteModel.getClass();

				Method method = clazz.getMethod("setStartTimeMinutes", int.class);

				method.invoke(_visitRemoteModel, startTimeMinutes);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getDuration() {
		return _duration;
	}

	@Override
	public void setDuration(int duration) {
		_duration = duration;

		if (_visitRemoteModel != null) {
			try {
				Class<?> clazz = _visitRemoteModel.getClass();

				Method method = clazz.getMethod("setDuration", int.class);

				method.invoke(_visitRemoteModel, duration);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getVisitRemoteModel() {
		return _visitRemoteModel;
	}

	public void setVisitRemoteModel(BaseModel<?> visitRemoteModel) {
		_visitRemoteModel = visitRemoteModel;
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

		Class<?> remoteModelClass = _visitRemoteModel.getClass();

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

		Object returnValue = method.invoke(_visitRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			VisitLocalServiceUtil.addVisit(this);
		}
		else {
			VisitLocalServiceUtil.updateVisit(this);
		}
	}

	@Override
	public Visit toEscapedModel() {
		return (Visit)ProxyUtil.newProxyInstance(Visit.class.getClassLoader(),
			new Class[] { Visit.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		VisitClp clone = new VisitClp();

		clone.setVisitId(getVisitId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setDoctorId(getDoctorId());
		clone.setPatientId(getPatientId());
		clone.setCancelled(getCancelled());
		clone.setHasHappened(getHasHappened());
		clone.setVisitDate(getVisitDate());
		clone.setStartTimeMinutes(getStartTimeMinutes());
		clone.setDuration(getDuration());

		return clone;
	}

	@Override
	public int compareTo(Visit visit) {
		int value = 0;

		if (getStartTimeMinutes() < visit.getStartTimeMinutes()) {
			value = -1;
		}
		else if (getStartTimeMinutes() > visit.getStartTimeMinutes()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VisitClp)) {
			return false;
		}

		VisitClp visit = (VisitClp)obj;

		long primaryKey = visit.getPrimaryKey();

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
		StringBundler sb = new StringBundler(25);

		sb.append("{visitId=");
		sb.append(getVisitId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", doctorId=");
		sb.append(getDoctorId());
		sb.append(", patientId=");
		sb.append(getPatientId());
		sb.append(", cancelled=");
		sb.append(getCancelled());
		sb.append(", hasHappened=");
		sb.append(getHasHappened());
		sb.append(", visitDate=");
		sb.append(getVisitDate());
		sb.append(", startTimeMinutes=");
		sb.append(getStartTimeMinutes());
		sb.append(", duration=");
		sb.append(getDuration());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("salutem.visit.model.Visit");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>visitId</column-name><column-value><![CDATA[");
		sb.append(getVisitId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>doctorId</column-name><column-value><![CDATA[");
		sb.append(getDoctorId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>patientId</column-name><column-value><![CDATA[");
		sb.append(getPatientId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cancelled</column-name><column-value><![CDATA[");
		sb.append(getCancelled());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hasHappened</column-name><column-value><![CDATA[");
		sb.append(getHasHappened());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>visitDate</column-name><column-value><![CDATA[");
		sb.append(getVisitDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>startTimeMinutes</column-name><column-value><![CDATA[");
		sb.append(getStartTimeMinutes());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>duration</column-name><column-value><![CDATA[");
		sb.append(getDuration());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _visitId;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _doctorId;
	private long _patientId;
	private boolean _cancelled;
	private boolean _hasHappened;
	private Date _visitDate;
	private int _startTimeMinutes;
	private int _duration;
	private BaseModel<?> _visitRemoteModel;
	private Class<?> _clpSerializerClass = salutem.visit.service.ClpSerializer.class;
}