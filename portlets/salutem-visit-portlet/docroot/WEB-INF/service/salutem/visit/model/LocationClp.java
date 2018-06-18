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
import salutem.visit.service.LocationLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Aneta Andrzejewska
 */
public class LocationClp extends BaseModelImpl<Location> implements Location {
	public LocationClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Location.class;
	}

	@Override
	public String getModelClassName() {
		return Location.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _locationId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setLocationId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _locationId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("locationId", getLocationId());
		attributes.put("patientId", getPatientId());
		attributes.put("day", getDay());
		attributes.put("month", getMonth());
		attributes.put("year", getYear());
		attributes.put("lat", getLat());
		attributes.put("lon", getLon());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long locationId = (Long)attributes.get("locationId");

		if (locationId != null) {
			setLocationId(locationId);
		}

		Long patientId = (Long)attributes.get("patientId");

		if (patientId != null) {
			setPatientId(patientId);
		}

		Integer day = (Integer)attributes.get("day");

		if (day != null) {
			setDay(day);
		}

		Integer month = (Integer)attributes.get("month");

		if (month != null) {
			setMonth(month);
		}

		Integer year = (Integer)attributes.get("year");

		if (year != null) {
			setYear(year);
		}

		Double lat = (Double)attributes.get("lat");

		if (lat != null) {
			setLat(lat);
		}

		Double lon = (Double)attributes.get("lon");

		if (lon != null) {
			setLon(lon);
		}
	}

	@Override
	public long getLocationId() {
		return _locationId;
	}

	@Override
	public void setLocationId(long locationId) {
		_locationId = locationId;

		if (_locationRemoteModel != null) {
			try {
				Class<?> clazz = _locationRemoteModel.getClass();

				Method method = clazz.getMethod("setLocationId", long.class);

				method.invoke(_locationRemoteModel, locationId);
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

		if (_locationRemoteModel != null) {
			try {
				Class<?> clazz = _locationRemoteModel.getClass();

				Method method = clazz.getMethod("setPatientId", long.class);

				method.invoke(_locationRemoteModel, patientId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getDay() {
		return _day;
	}

	@Override
	public void setDay(int day) {
		_day = day;

		if (_locationRemoteModel != null) {
			try {
				Class<?> clazz = _locationRemoteModel.getClass();

				Method method = clazz.getMethod("setDay", int.class);

				method.invoke(_locationRemoteModel, day);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getMonth() {
		return _month;
	}

	@Override
	public void setMonth(int month) {
		_month = month;

		if (_locationRemoteModel != null) {
			try {
				Class<?> clazz = _locationRemoteModel.getClass();

				Method method = clazz.getMethod("setMonth", int.class);

				method.invoke(_locationRemoteModel, month);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getYear() {
		return _year;
	}

	@Override
	public void setYear(int year) {
		_year = year;

		if (_locationRemoteModel != null) {
			try {
				Class<?> clazz = _locationRemoteModel.getClass();

				Method method = clazz.getMethod("setYear", int.class);

				method.invoke(_locationRemoteModel, year);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getLat() {
		return _lat;
	}

	@Override
	public void setLat(double lat) {
		_lat = lat;

		if (_locationRemoteModel != null) {
			try {
				Class<?> clazz = _locationRemoteModel.getClass();

				Method method = clazz.getMethod("setLat", double.class);

				method.invoke(_locationRemoteModel, lat);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getLon() {
		return _lon;
	}

	@Override
	public void setLon(double lon) {
		_lon = lon;

		if (_locationRemoteModel != null) {
			try {
				Class<?> clazz = _locationRemoteModel.getClass();

				Method method = clazz.getMethod("setLon", double.class);

				method.invoke(_locationRemoteModel, lon);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getLocationRemoteModel() {
		return _locationRemoteModel;
	}

	public void setLocationRemoteModel(BaseModel<?> locationRemoteModel) {
		_locationRemoteModel = locationRemoteModel;
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

		Class<?> remoteModelClass = _locationRemoteModel.getClass();

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

		Object returnValue = method.invoke(_locationRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			LocationLocalServiceUtil.addLocation(this);
		}
		else {
			LocationLocalServiceUtil.updateLocation(this);
		}
	}

	@Override
	public Location toEscapedModel() {
		return (Location)ProxyUtil.newProxyInstance(Location.class.getClassLoader(),
			new Class[] { Location.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		LocationClp clone = new LocationClp();

		clone.setLocationId(getLocationId());
		clone.setPatientId(getPatientId());
		clone.setDay(getDay());
		clone.setMonth(getMonth());
		clone.setYear(getYear());
		clone.setLat(getLat());
		clone.setLon(getLon());

		return clone;
	}

	@Override
	public int compareTo(Location location) {
		long primaryKey = location.getPrimaryKey();

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

		if (!(obj instanceof LocationClp)) {
			return false;
		}

		LocationClp location = (LocationClp)obj;

		long primaryKey = location.getPrimaryKey();

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

		sb.append("{locationId=");
		sb.append(getLocationId());
		sb.append(", patientId=");
		sb.append(getPatientId());
		sb.append(", day=");
		sb.append(getDay());
		sb.append(", month=");
		sb.append(getMonth());
		sb.append(", year=");
		sb.append(getYear());
		sb.append(", lat=");
		sb.append(getLat());
		sb.append(", lon=");
		sb.append(getLon());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("salutem.visit.model.Location");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>locationId</column-name><column-value><![CDATA[");
		sb.append(getLocationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>patientId</column-name><column-value><![CDATA[");
		sb.append(getPatientId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>day</column-name><column-value><![CDATA[");
		sb.append(getDay());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>month</column-name><column-value><![CDATA[");
		sb.append(getMonth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>year</column-name><column-value><![CDATA[");
		sb.append(getYear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lat</column-name><column-value><![CDATA[");
		sb.append(getLat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lon</column-name><column-value><![CDATA[");
		sb.append(getLon());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _locationId;
	private long _patientId;
	private int _day;
	private int _month;
	private int _year;
	private double _lat;
	private double _lon;
	private BaseModel<?> _locationRemoteModel;
	private Class<?> _clpSerializerClass = salutem.visit.service.ClpSerializer.class;
}