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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Location}.
 * </p>
 *
 * @author Aneta Andrzejewska
 * @see Location
 * @generated
 */
public class LocationWrapper implements Location, ModelWrapper<Location> {
	public LocationWrapper(Location location) {
		_location = location;
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

	/**
	* Returns the primary key of this location.
	*
	* @return the primary key of this location
	*/
	@Override
	public long getPrimaryKey() {
		return _location.getPrimaryKey();
	}

	/**
	* Sets the primary key of this location.
	*
	* @param primaryKey the primary key of this location
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_location.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the location ID of this location.
	*
	* @return the location ID of this location
	*/
	@Override
	public long getLocationId() {
		return _location.getLocationId();
	}

	/**
	* Sets the location ID of this location.
	*
	* @param locationId the location ID of this location
	*/
	@Override
	public void setLocationId(long locationId) {
		_location.setLocationId(locationId);
	}

	/**
	* Returns the patient ID of this location.
	*
	* @return the patient ID of this location
	*/
	@Override
	public long getPatientId() {
		return _location.getPatientId();
	}

	/**
	* Sets the patient ID of this location.
	*
	* @param patientId the patient ID of this location
	*/
	@Override
	public void setPatientId(long patientId) {
		_location.setPatientId(patientId);
	}

	/**
	* Returns the day of this location.
	*
	* @return the day of this location
	*/
	@Override
	public int getDay() {
		return _location.getDay();
	}

	/**
	* Sets the day of this location.
	*
	* @param day the day of this location
	*/
	@Override
	public void setDay(int day) {
		_location.setDay(day);
	}

	/**
	* Returns the month of this location.
	*
	* @return the month of this location
	*/
	@Override
	public int getMonth() {
		return _location.getMonth();
	}

	/**
	* Sets the month of this location.
	*
	* @param month the month of this location
	*/
	@Override
	public void setMonth(int month) {
		_location.setMonth(month);
	}

	/**
	* Returns the year of this location.
	*
	* @return the year of this location
	*/
	@Override
	public int getYear() {
		return _location.getYear();
	}

	/**
	* Sets the year of this location.
	*
	* @param year the year of this location
	*/
	@Override
	public void setYear(int year) {
		_location.setYear(year);
	}

	/**
	* Returns the lat of this location.
	*
	* @return the lat of this location
	*/
	@Override
	public double getLat() {
		return _location.getLat();
	}

	/**
	* Sets the lat of this location.
	*
	* @param lat the lat of this location
	*/
	@Override
	public void setLat(double lat) {
		_location.setLat(lat);
	}

	/**
	* Returns the lon of this location.
	*
	* @return the lon of this location
	*/
	@Override
	public double getLon() {
		return _location.getLon();
	}

	/**
	* Sets the lon of this location.
	*
	* @param lon the lon of this location
	*/
	@Override
	public void setLon(double lon) {
		_location.setLon(lon);
	}

	@Override
	public boolean isNew() {
		return _location.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_location.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _location.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_location.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _location.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _location.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_location.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _location.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_location.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_location.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_location.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new LocationWrapper((Location)_location.clone());
	}

	@Override
	public int compareTo(salutem.visit.model.Location location) {
		return _location.compareTo(location);
	}

	@Override
	public int hashCode() {
		return _location.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<salutem.visit.model.Location> toCacheModel() {
		return _location.toCacheModel();
	}

	@Override
	public salutem.visit.model.Location toEscapedModel() {
		return new LocationWrapper(_location.toEscapedModel());
	}

	@Override
	public salutem.visit.model.Location toUnescapedModel() {
		return new LocationWrapper(_location.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _location.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _location.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_location.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LocationWrapper)) {
			return false;
		}

		LocationWrapper locationWrapper = (LocationWrapper)obj;

		if (Validator.equals(_location, locationWrapper._location)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Location getWrappedLocation() {
		return _location;
	}

	@Override
	public Location getWrappedModel() {
		return _location;
	}

	@Override
	public void resetOriginalValues() {
		_location.resetOriginalValues();
	}

	private Location _location;
}