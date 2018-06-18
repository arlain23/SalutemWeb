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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link salutem.doctor.service.http.DoctorScheduleServiceSoap}.
 *
 * @author Aneta Andrzejewska
 * @see salutem.doctor.service.http.DoctorScheduleServiceSoap
 * @generated
 */
public class DoctorScheduleSoap implements Serializable {
	public static DoctorScheduleSoap toSoapModel(DoctorSchedule model) {
		DoctorScheduleSoap soapModel = new DoctorScheduleSoap();

		soapModel.setScheduleId(model.getScheduleId());
		soapModel.setDoctorId(model.getDoctorId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setDayOfWeek(model.getDayOfWeek());
		soapModel.setStartTime(model.getStartTime());
		soapModel.setEndTime(model.getEndTime());

		return soapModel;
	}

	public static DoctorScheduleSoap[] toSoapModels(DoctorSchedule[] models) {
		DoctorScheduleSoap[] soapModels = new DoctorScheduleSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DoctorScheduleSoap[][] toSoapModels(DoctorSchedule[][] models) {
		DoctorScheduleSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DoctorScheduleSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DoctorScheduleSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DoctorScheduleSoap[] toSoapModels(List<DoctorSchedule> models) {
		List<DoctorScheduleSoap> soapModels = new ArrayList<DoctorScheduleSoap>(models.size());

		for (DoctorSchedule model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DoctorScheduleSoap[soapModels.size()]);
	}

	public DoctorScheduleSoap() {
	}

	public long getPrimaryKey() {
		return _scheduleId;
	}

	public void setPrimaryKey(long pk) {
		setScheduleId(pk);
	}

	public long getScheduleId() {
		return _scheduleId;
	}

	public void setScheduleId(long scheduleId) {
		_scheduleId = scheduleId;
	}

	public long getDoctorId() {
		return _doctorId;
	}

	public void setDoctorId(long doctorId) {
		_doctorId = doctorId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public int getDayOfWeek() {
		return _dayOfWeek;
	}

	public void setDayOfWeek(int dayOfWeek) {
		_dayOfWeek = dayOfWeek;
	}

	public double getStartTime() {
		return _startTime;
	}

	public void setStartTime(double startTime) {
		_startTime = startTime;
	}

	public double getEndTime() {
		return _endTime;
	}

	public void setEndTime(double endTime) {
		_endTime = endTime;
	}

	private long _scheduleId;
	private long _doctorId;
	private Date _createDate;
	private Date _modifiedDate;
	private int _dayOfWeek;
	private double _startTime;
	private double _endTime;
}