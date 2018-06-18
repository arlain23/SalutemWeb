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

package salutem.doctor.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import salutem.doctor.service.ClpSerializer;
import salutem.doctor.service.DoctorScheduleLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Aneta Andrzejewska
 */
public class DoctorScheduleClp extends BaseModelImpl<DoctorSchedule>
	implements DoctorSchedule {
	public DoctorScheduleClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DoctorSchedule.class;
	}

	@Override
	public String getModelClassName() {
		return DoctorSchedule.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _scheduleId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setScheduleId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _scheduleId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("scheduleId", getScheduleId());
		attributes.put("doctorId", getDoctorId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("dayOfWeek", getDayOfWeek());
		attributes.put("startTime", getStartTime());
		attributes.put("endTime", getEndTime());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long scheduleId = (Long)attributes.get("scheduleId");

		if (scheduleId != null) {
			setScheduleId(scheduleId);
		}

		Long doctorId = (Long)attributes.get("doctorId");

		if (doctorId != null) {
			setDoctorId(doctorId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Integer dayOfWeek = (Integer)attributes.get("dayOfWeek");

		if (dayOfWeek != null) {
			setDayOfWeek(dayOfWeek);
		}

		Double startTime = (Double)attributes.get("startTime");

		if (startTime != null) {
			setStartTime(startTime);
		}

		Double endTime = (Double)attributes.get("endTime");

		if (endTime != null) {
			setEndTime(endTime);
		}
	}

	@Override
	public long getScheduleId() {
		return _scheduleId;
	}

	@Override
	public void setScheduleId(long scheduleId) {
		_scheduleId = scheduleId;

		if (_doctorScheduleRemoteModel != null) {
			try {
				Class<?> clazz = _doctorScheduleRemoteModel.getClass();

				Method method = clazz.getMethod("setScheduleId", long.class);

				method.invoke(_doctorScheduleRemoteModel, scheduleId);
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

		if (_doctorScheduleRemoteModel != null) {
			try {
				Class<?> clazz = _doctorScheduleRemoteModel.getClass();

				Method method = clazz.getMethod("setDoctorId", long.class);

				method.invoke(_doctorScheduleRemoteModel, doctorId);
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

		if (_doctorScheduleRemoteModel != null) {
			try {
				Class<?> clazz = _doctorScheduleRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_doctorScheduleRemoteModel, createDate);
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

		if (_doctorScheduleRemoteModel != null) {
			try {
				Class<?> clazz = _doctorScheduleRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_doctorScheduleRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getDayOfWeek() {
		return _dayOfWeek;
	}

	@Override
	public void setDayOfWeek(int dayOfWeek) {
		_dayOfWeek = dayOfWeek;

		if (_doctorScheduleRemoteModel != null) {
			try {
				Class<?> clazz = _doctorScheduleRemoteModel.getClass();

				Method method = clazz.getMethod("setDayOfWeek", int.class);

				method.invoke(_doctorScheduleRemoteModel, dayOfWeek);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getStartTime() {
		return _startTime;
	}

	@Override
	public void setStartTime(double startTime) {
		_startTime = startTime;

		if (_doctorScheduleRemoteModel != null) {
			try {
				Class<?> clazz = _doctorScheduleRemoteModel.getClass();

				Method method = clazz.getMethod("setStartTime", double.class);

				method.invoke(_doctorScheduleRemoteModel, startTime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getEndTime() {
		return _endTime;
	}

	@Override
	public void setEndTime(double endTime) {
		_endTime = endTime;

		if (_doctorScheduleRemoteModel != null) {
			try {
				Class<?> clazz = _doctorScheduleRemoteModel.getClass();

				Method method = clazz.getMethod("setEndTime", double.class);

				method.invoke(_doctorScheduleRemoteModel, endTime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDoctorScheduleRemoteModel() {
		return _doctorScheduleRemoteModel;
	}

	public void setDoctorScheduleRemoteModel(
		BaseModel<?> doctorScheduleRemoteModel) {
		_doctorScheduleRemoteModel = doctorScheduleRemoteModel;
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

		Class<?> remoteModelClass = _doctorScheduleRemoteModel.getClass();

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

		Object returnValue = method.invoke(_doctorScheduleRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DoctorScheduleLocalServiceUtil.addDoctorSchedule(this);
		}
		else {
			DoctorScheduleLocalServiceUtil.updateDoctorSchedule(this);
		}
	}

	@Override
	public DoctorSchedule toEscapedModel() {
		return (DoctorSchedule)ProxyUtil.newProxyInstance(DoctorSchedule.class.getClassLoader(),
			new Class[] { DoctorSchedule.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DoctorScheduleClp clone = new DoctorScheduleClp();

		clone.setScheduleId(getScheduleId());
		clone.setDoctorId(getDoctorId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setDayOfWeek(getDayOfWeek());
		clone.setStartTime(getStartTime());
		clone.setEndTime(getEndTime());

		return clone;
	}

	@Override
	public int compareTo(DoctorSchedule doctorSchedule) {
		long primaryKey = doctorSchedule.getPrimaryKey();

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

		if (!(obj instanceof DoctorScheduleClp)) {
			return false;
		}

		DoctorScheduleClp doctorSchedule = (DoctorScheduleClp)obj;

		long primaryKey = doctorSchedule.getPrimaryKey();

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
		StringBundler sb = new StringBundler(15);

		sb.append("{scheduleId=");
		sb.append(getScheduleId());
		sb.append(", doctorId=");
		sb.append(getDoctorId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", dayOfWeek=");
		sb.append(getDayOfWeek());
		sb.append(", startTime=");
		sb.append(getStartTime());
		sb.append(", endTime=");
		sb.append(getEndTime());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("salutem.doctor.model.DoctorSchedule");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>scheduleId</column-name><column-value><![CDATA[");
		sb.append(getScheduleId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>doctorId</column-name><column-value><![CDATA[");
		sb.append(getDoctorId());
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
			"<column><column-name>dayOfWeek</column-name><column-value><![CDATA[");
		sb.append(getDayOfWeek());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>startTime</column-name><column-value><![CDATA[");
		sb.append(getStartTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>endTime</column-name><column-value><![CDATA[");
		sb.append(getEndTime());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _scheduleId;
	private long _doctorId;
	private Date _createDate;
	private Date _modifiedDate;
	private int _dayOfWeek;
	private double _startTime;
	private double _endTime;
	private BaseModel<?> _doctorScheduleRemoteModel;
	private Class<?> _clpSerializerClass = salutem.doctor.service.ClpSerializer.class;
}