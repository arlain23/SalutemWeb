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
 * This class is used by SOAP remote services, specifically {@link salutem.visit.service.http.TimeServiceSoap}.
 *
 * @author Aneta Andrzejewska
 * @see salutem.visit.service.http.TimeServiceSoap
 * @generated
 */
public class TimeSoap implements Serializable {
	public static TimeSoap toSoapModel(Time model) {
		TimeSoap soapModel = new TimeSoap();

		soapModel.setTimeId(model.getTimeId());
		soapModel.setEntryUuid(model.getEntryUuid());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setDoctorId(model.getDoctorId());
		soapModel.setPatientId(model.getPatientId());
		soapModel.setVisitDay(model.getVisitDay());
		soapModel.setVisitMonth(model.getVisitMonth());
		soapModel.setVisitYear(model.getVisitYear());
		soapModel.setVisitTime(model.getVisitTime());
		soapModel.setVisitDuration(model.getVisitDuration());
		soapModel.setWasFinished(model.getWasFinished());
		soapModel.setWasPlanned(model.getWasPlanned());
		soapModel.setVisitId(model.getVisitId());

		return soapModel;
	}

	public static TimeSoap[] toSoapModels(Time[] models) {
		TimeSoap[] soapModels = new TimeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TimeSoap[][] toSoapModels(Time[][] models) {
		TimeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TimeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TimeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TimeSoap[] toSoapModels(List<Time> models) {
		List<TimeSoap> soapModels = new ArrayList<TimeSoap>(models.size());

		for (Time model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TimeSoap[soapModels.size()]);
	}

	public TimeSoap() {
	}

	public long getPrimaryKey() {
		return _timeId;
	}

	public void setPrimaryKey(long pk) {
		setTimeId(pk);
	}

	public long getTimeId() {
		return _timeId;
	}

	public void setTimeId(long timeId) {
		_timeId = timeId;
	}

	public String getEntryUuid() {
		return _entryUuid;
	}

	public void setEntryUuid(String entryUuid) {
		_entryUuid = entryUuid;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getDoctorId() {
		return _doctorId;
	}

	public void setDoctorId(long doctorId) {
		_doctorId = doctorId;
	}

	public long getPatientId() {
		return _patientId;
	}

	public void setPatientId(long patientId) {
		_patientId = patientId;
	}

	public int getVisitDay() {
		return _visitDay;
	}

	public void setVisitDay(int visitDay) {
		_visitDay = visitDay;
	}

	public int getVisitMonth() {
		return _visitMonth;
	}

	public void setVisitMonth(int visitMonth) {
		_visitMonth = visitMonth;
	}

	public int getVisitYear() {
		return _visitYear;
	}

	public void setVisitYear(int visitYear) {
		_visitYear = visitYear;
	}

	public int getVisitTime() {
		return _visitTime;
	}

	public void setVisitTime(int visitTime) {
		_visitTime = visitTime;
	}

	public int getVisitDuration() {
		return _visitDuration;
	}

	public void setVisitDuration(int visitDuration) {
		_visitDuration = visitDuration;
	}

	public boolean getWasFinished() {
		return _wasFinished;
	}

	public boolean isWasFinished() {
		return _wasFinished;
	}

	public void setWasFinished(boolean wasFinished) {
		_wasFinished = wasFinished;
	}

	public boolean getWasPlanned() {
		return _wasPlanned;
	}

	public boolean isWasPlanned() {
		return _wasPlanned;
	}

	public void setWasPlanned(boolean wasPlanned) {
		_wasPlanned = wasPlanned;
	}

	public long getVisitId() {
		return _visitId;
	}

	public void setVisitId(long visitId) {
		_visitId = visitId;
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
}