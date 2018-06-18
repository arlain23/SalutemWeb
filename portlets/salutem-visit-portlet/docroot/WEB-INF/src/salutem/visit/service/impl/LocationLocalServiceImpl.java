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

package salutem.visit.service.impl;

import java.util.ArrayList;
import java.util.List;

import salutem.visit.model.Location;
import salutem.visit.service.base.LocationLocalServiceBaseImpl;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;


/**
 * The implementation of the location local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link salutem.visit.service.LocationLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Aneta Andrzejewska
 * @see salutem.visit.service.base.LocationLocalServiceBaseImpl
 * @see salutem.visit.service.LocationLocalServiceUtil
 */
public class LocationLocalServiceImpl extends LocationLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link salutem.visit.service.LocationLocalServiceUtil} to access the location local service.
	 */
	public Location addLocation(long patientId, int year, int month, int day, double lat, double lon) throws SystemException {
		long locationId = CounterLocalServiceUtil.increment(Location.class.getName());
		Location location = locationPersistence.create(locationId);
		
		location.setPatientId(patientId);
		location.setDay(day);
		location.setMonth(month);
		location.setYear(year);
		location.setLat(lat);
		location.setLon(lon);
		locationPersistence.update(location);
		
		return location;
	}
	public List<Location> findByPatientId(long patientId) {
		try {
			return locationPersistence.findByPatientId(patientId);
		} catch (SystemException e) {
			e.printStackTrace();
			return new ArrayList<Location>();
		}
	}
	
	public List<Location> findByPatientIdAndYear(long patientId, int year) {
		try {
		return locationPersistence.findByPatientIdAndYear(patientId, year);
		} catch (SystemException e) {
			e.printStackTrace();
			return new ArrayList<Location>();
		}
	}
	
	public List<Location> findByPatientIdAndYearAndMonth(long patientId, int year, int month) {
		try {
		return locationPersistence.findByPatientIdAndYearAndMonth(patientId, year, month);
		} catch (SystemException e) {
			e.printStackTrace();
			return new ArrayList<Location>();
		}
	}
	
	public List<Location> findByPatientIdAndYearAndMonth(long patientId, int year, int month, int day) {
		try {
		return locationPersistence.findByPatientIdAndYearAndMonthAndDay(patientId, year, month, day);
		} catch (SystemException e) {
			e.printStackTrace();
			return new ArrayList<Location>();
		}
	}
	
	public List<Location> findByPatientIdAndYearAndMonthAndLatAndLon(long patientId, int year, int month, int day, double lat, double lon) {
		try {
		return locationPersistence.findByPatientIdAndYearAndMonthAndDayAndLatAndLon(patientId, year, month, day, lat, lon);
		} catch (SystemException e) {
			e.printStackTrace();
			return new ArrayList<Location>();
		}
	}
	
}