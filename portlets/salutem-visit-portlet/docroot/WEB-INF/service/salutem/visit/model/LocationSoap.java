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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link salutem.visit.service.http.LocationServiceSoap}.
 *
 * @author Aneta Andrzejewska
 * @see salutem.visit.service.http.LocationServiceSoap
 * @generated
 */
public class LocationSoap implements Serializable {
	public static LocationSoap toSoapModel(Location model) {
		LocationSoap soapModel = new LocationSoap();

		soapModel.setLocationId(model.getLocationId());
		soapModel.setPatientId(model.getPatientId());
		soapModel.setDay(model.getDay());
		soapModel.setMonth(model.getMonth());
		soapModel.setYear(model.getYear());
		soapModel.setLat(model.getLat());
		soapModel.setLon(model.getLon());

		return soapModel;
	}

	public static LocationSoap[] toSoapModels(Location[] models) {
		LocationSoap[] soapModels = new LocationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LocationSoap[][] toSoapModels(Location[][] models) {
		LocationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LocationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LocationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LocationSoap[] toSoapModels(List<Location> models) {
		List<LocationSoap> soapModels = new ArrayList<LocationSoap>(models.size());

		for (Location model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LocationSoap[soapModels.size()]);
	}

	public LocationSoap() {
	}

	public long getPrimaryKey() {
		return _locationId;
	}

	public void setPrimaryKey(long pk) {
		setLocationId(pk);
	}

	public long getLocationId() {
		return _locationId;
	}

	public void setLocationId(long locationId) {
		_locationId = locationId;
	}

	public long getPatientId() {
		return _patientId;
	}

	public void setPatientId(long patientId) {
		_patientId = patientId;
	}

	public int getDay() {
		return _day;
	}

	public void setDay(int day) {
		_day = day;
	}

	public int getMonth() {
		return _month;
	}

	public void setMonth(int month) {
		_month = month;
	}

	public int getYear() {
		return _year;
	}

	public void setYear(int year) {
		_year = year;
	}

	public double getLat() {
		return _lat;
	}

	public void setLat(double lat) {
		_lat = lat;
	}

	public double getLon() {
		return _lon;
	}

	public void setLon(double lon) {
		_lon = lon;
	}

	private long _locationId;
	private long _patientId;
	private int _day;
	private int _month;
	private int _year;
	private double _lat;
	private double _lon;
}