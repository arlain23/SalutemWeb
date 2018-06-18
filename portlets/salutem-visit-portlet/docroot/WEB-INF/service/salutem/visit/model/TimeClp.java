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
import salutem.visit.service.TimeLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Aneta Andrzejewska
 */
public class TimeClp extends BaseModelImpl<Time> implements Time {
	public TimeClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Time.class;
	}

	@Override
	public String getModelClassName() {
		return Time.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _timeId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTimeId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _timeId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("timeId", getTimeId());
		attributes.put("entryUuid", getEntryUuid());
		attributes.put("groupId", getGroupId());
		attributes.put("doctorId", getDoctorId());
		attributes.put("patientId", getPatientId());
		attributes.put("visitDay", getVisitDay());
		attributes.put("visitMonth", getVisitMonth());
		attributes.put("visitYear", getVisitYear());
		attributes.put("visitTime", getVisitTime());
		attributes.put("visitDuration", getVisitDuration());
		attributes.put("wasFinished", getWasFinished());
		attributes.put("wasPlanned", getWasPlanned());
		attributes.put("visitId", getVisitId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long timeId = (Long)attributes.get("timeId");

		if (timeId != null) {
			setTimeId(timeId);
		}

		String entryUuid = (String)attributes.get("entryUuid");

		if (entryUuid != null) {
			setEntryUuid(entryUuid);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long doctorId = (Long)attributes.get("doctorId");

		if (doctorId != null) {
			setDoctorId(doctorId);
		}

		Long patientId = (Long)attributes.get("patientId");

		if (patientId != null) {
			setPatientId(patientId);
		}

		Integer visitDay = (Integer)attributes.get("visitDay");

		if (visitDay != null) {
			setVisitDay(visitDay);
		}

		Integer visitMonth = (Integer)attributes.get("visitMonth");

		if (visitMonth != null) {
			setVisitMonth(visitMonth);
		}

		Integer visitYear = (Integer)attributes.get("visitYear");

		if (visitYear != null) {
			setVisitYear(visitYear);
		}

		Integer visitTime = (Integer)attributes.get("visitTime");

		if (visitTime != null) {
			setVisitTime(visitTime);
		}

		Integer visitDuration = (Integer)attributes.get("visitDuration");

		if (visitDuration != null) {
			setVisitDuration(visitDuration);
		}

		Boolean wasFinished = (Boolean)attributes.get("wasFinished");

		if (wasFinished != null) {
			setWasFinished(wasFinished);
		}

		Boolean wasPlanned = (Boolean)attributes.get("wasPlanned");

		if (wasPlanned != null) {
			setWasPlanned(wasPlanned);
		}

		Long visitId = (Long)attributes.get("visitId");

		if (visitId != null) {
			setVisitId(visitId);
		}
	}

	@Override
	public long getTimeId() {
		return _timeId;
	}

	@Override
	public void setTimeId(long timeId) {
		_timeId = timeId;

		if (_timeRemoteModel != null) {
			try {
				Class<?> clazz = _timeRemoteModel.getClass();

				Method method = clazz.getMethod("setTimeId", long.class);

				method.invoke(_timeRemoteModel, timeId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEntryUuid() {
		return _entryUuid;
	}

	@Override
	public void setEntryUuid(String entryUuid) {
		_entryUuid = entryUuid;

		if (_timeRemoteModel != null) {
			try {
				Class<?> clazz = _timeRemoteModel.getClass();

				Method method = clazz.getMethod("setEntryUuid", String.class);

				method.invoke(_timeRemoteModel, entryUuid);
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

		if (_timeRemoteModel != null) {
			try {
				Class<?> clazz = _timeRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_timeRemoteModel, groupId);
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

		if (_timeRemoteModel != null) {
			try {
				Class<?> clazz = _timeRemoteModel.getClass();

				Method method = clazz.getMethod("setDoctorId", long.class);

				method.invoke(_timeRemoteModel, doctorId);
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

		if (_timeRemoteModel != null) {
			try {
				Class<?> clazz = _timeRemoteModel.getClass();

				Method method = clazz.getMethod("setPatientId", long.class);

				method.invoke(_timeRemoteModel, patientId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getVisitDay() {
		return _visitDay;
	}

	@Override
	public void setVisitDay(int visitDay) {
		_visitDay = visitDay;

		if (_timeRemoteModel != null) {
			try {
				Class<?> clazz = _timeRemoteModel.getClass();

				Method method = clazz.getMethod("setVisitDay", int.class);

				method.invoke(_timeRemoteModel, visitDay);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getVisitMonth() {
		return _visitMonth;
	}

	@Override
	public void setVisitMonth(int visitMonth) {
		_visitMonth = visitMonth;

		if (_timeRemoteModel != null) {
			try {
				Class<?> clazz = _timeRemoteModel.getClass();

				Method method = clazz.getMethod("setVisitMonth", int.class);

				method.invoke(_timeRemoteModel, visitMonth);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getVisitYear() {
		return _visitYear;
	}

	@Override
	public void setVisitYear(int visitYear) {
		_visitYear = visitYear;

		if (_timeRemoteModel != null) {
			try {
				Class<?> clazz = _timeRemoteModel.getClass();

				Method method = clazz.getMethod("setVisitYear", int.class);

				method.invoke(_timeRemoteModel, visitYear);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getVisitTime() {
		return _visitTime;
	}

	@Override
	public void setVisitTime(int visitTime) {
		_visitTime = visitTime;

		if (_timeRemoteModel != null) {
			try {
				Class<?> clazz = _timeRemoteModel.getClass();

				Method method = clazz.getMethod("setVisitTime", int.class);

				method.invoke(_timeRemoteModel, visitTime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getVisitDuration() {
		return _visitDuration;
	}

	@Override
	public void setVisitDuration(int visitDuration) {
		_visitDuration = visitDuration;

		if (_timeRemoteModel != null) {
			try {
				Class<?> clazz = _timeRemoteModel.getClass();

				Method method = clazz.getMethod("setVisitDuration", int.class);

				method.invoke(_timeRemoteModel, visitDuration);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getWasFinished() {
		return _wasFinished;
	}

	@Override
	public boolean isWasFinished() {
		return _wasFinished;
	}

	@Override
	public void setWasFinished(boolean wasFinished) {
		_wasFinished = wasFinished;

		if (_timeRemoteModel != null) {
			try {
				Class<?> clazz = _timeRemoteModel.getClass();

				Method method = clazz.getMethod("setWasFinished", boolean.class);

				method.invoke(_timeRemoteModel, wasFinished);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getWasPlanned() {
		return _wasPlanned;
	}

	@Override
	public boolean isWasPlanned() {
		return _wasPlanned;
	}

	@Override
	public void setWasPlanned(boolean wasPlanned) {
		_wasPlanned = wasPlanned;

		if (_timeRemoteModel != null) {
			try {
				Class<?> clazz = _timeRemoteModel.getClass();

				Method method = clazz.getMethod("setWasPlanned", boolean.class);

				method.invoke(_timeRemoteModel, wasPlanned);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getVisitId() {
		return _visitId;
	}

	@Override
	public void setVisitId(long visitId) {
		_visitId = visitId;

		if (_timeRemoteModel != null) {
			try {
				Class<?> clazz = _timeRemoteModel.getClass();

				Method method = clazz.getMethod("setVisitId", long.class);

				method.invoke(_timeRemoteModel, visitId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTimeRemoteModel() {
		return _timeRemoteModel;
	}

	public void setTimeRemoteModel(BaseModel<?> timeRemoteModel) {
		_timeRemoteModel = timeRemoteModel;
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

		Class<?> remoteModelClass = _timeRemoteModel.getClass();

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

		Object returnValue = method.invoke(_timeRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TimeLocalServiceUtil.addTime(this);
		}
		else {
			TimeLocalServiceUtil.updateTime(this);
		}
	}

	@Override
	public Time toEscapedModel() {
		return (Time)ProxyUtil.newProxyInstance(Time.class.getClassLoader(),
			new Class[] { Time.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TimeClp clone = new TimeClp();

		clone.setTimeId(getTimeId());
		clone.setEntryUuid(getEntryUuid());
		clone.setGroupId(getGroupId());
		clone.setDoctorId(getDoctorId());
		clone.setPatientId(getPatientId());
		clone.setVisitDay(getVisitDay());
		clone.setVisitMonth(getVisitMonth());
		clone.setVisitYear(getVisitYear());
		clone.setVisitTime(getVisitTime());
		clone.setVisitDuration(getVisitDuration());
		clone.setWasFinished(getWasFinished());
		clone.setWasPlanned(getWasPlanned());
		clone.setVisitId(getVisitId());

		return clone;
	}

	@Override
	public int compareTo(Time time) {
		long primaryKey = time.getPrimaryKey();

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

		if (!(obj instanceof TimeClp)) {
			return false;
		}

		TimeClp time = (TimeClp)obj;

		long primaryKey = time.getPrimaryKey();

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
		StringBundler sb = new StringBundler(27);

		sb.append("{timeId=");
		sb.append(getTimeId());
		sb.append(", entryUuid=");
		sb.append(getEntryUuid());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", doctorId=");
		sb.append(getDoctorId());
		sb.append(", patientId=");
		sb.append(getPatientId());
		sb.append(", visitDay=");
		sb.append(getVisitDay());
		sb.append(", visitMonth=");
		sb.append(getVisitMonth());
		sb.append(", visitYear=");
		sb.append(getVisitYear());
		sb.append(", visitTime=");
		sb.append(getVisitTime());
		sb.append(", visitDuration=");
		sb.append(getVisitDuration());
		sb.append(", wasFinished=");
		sb.append(getWasFinished());
		sb.append(", wasPlanned=");
		sb.append(getWasPlanned());
		sb.append(", visitId=");
		sb.append(getVisitId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("salutem.visit.model.Time");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>timeId</column-name><column-value><![CDATA[");
		sb.append(getTimeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>entryUuid</column-name><column-value><![CDATA[");
		sb.append(getEntryUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
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
			"<column><column-name>visitDay</column-name><column-value><![CDATA[");
		sb.append(getVisitDay());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>visitMonth</column-name><column-value><![CDATA[");
		sb.append(getVisitMonth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>visitYear</column-name><column-value><![CDATA[");
		sb.append(getVisitYear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>visitTime</column-name><column-value><![CDATA[");
		sb.append(getVisitTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>visitDuration</column-name><column-value><![CDATA[");
		sb.append(getVisitDuration());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>wasFinished</column-name><column-value><![CDATA[");
		sb.append(getWasFinished());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>wasPlanned</column-name><column-value><![CDATA[");
		sb.append(getWasPlanned());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>visitId</column-name><column-value><![CDATA[");
		sb.append(getVisitId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _timeId;
	private String _entryUuid;
	private long _groupId;
	private long _doctorId;
	private long _patientId;
	private int _visitDay;
	private int _visitMonth;
	private int _visitYear;
	private int _visitTime;
	private int _visitDuration;
	private boolean _wasFinished;
	private boolean _wasPlanned;
	private long _visitId;
	private BaseModel<?> _timeRemoteModel;
	private Class<?> _clpSerializerClass = salutem.visit.service.ClpSerializer.class;
}