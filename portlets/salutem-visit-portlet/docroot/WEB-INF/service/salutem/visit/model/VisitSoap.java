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
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link salutem.visit.service.http.VisitServiceSoap}.
 *
 * @author Aneta Andrzejewska
 * @see salutem.visit.service.http.VisitServiceSoap
 * @generated
 */
public class VisitSoap implements Serializable {
	public static VisitSoap toSoapModel(Visit model) {
		VisitSoap soapModel = new VisitSoap();

		soapModel.setVisitId(model.getVisitId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setDoctorId(model.getDoctorId());
		soapModel.setPatientId(model.getPatientId());
		soapModel.setCancelled(model.getCancelled());
		soapModel.setHasHappened(model.getHasHappened());
		soapModel.setVisitDate(model.getVisitDate());
		soapModel.setStartTimeMinutes(model.getStartTimeMinutes());
		soapModel.setDuration(model.getDuration());

		return soapModel;
	}

	public static VisitSoap[] toSoapModels(Visit[] models) {
		VisitSoap[] soapModels = new VisitSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VisitSoap[][] toSoapModels(Visit[][] models) {
		VisitSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VisitSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VisitSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VisitSoap[] toSoapModels(List<Visit> models) {
		List<VisitSoap> soapModels = new ArrayList<VisitSoap>(models.size());

		for (Visit model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VisitSoap[soapModels.size()]);
	}

	public VisitSoap() {
	}

	public long getPrimaryKey() {
		return _visitId;
	}

	public void setPrimaryKey(long pk) {
		setVisitId(pk);
	}

	public long getVisitId() {
		return _visitId;
	}

	public void setVisitId(long visitId) {
		_visitId = visitId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
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

	public boolean getCancelled() {
		return _cancelled;
	}

	public boolean isCancelled() {
		return _cancelled;
	}

	public void setCancelled(boolean cancelled) {
		_cancelled = cancelled;
	}

	public boolean getHasHappened() {
		return _hasHappened;
	}

	public boolean isHasHappened() {
		return _hasHappened;
	}

	public void setHasHappened(boolean hasHappened) {
		_hasHappened = hasHappened;
	}

	public Date getVisitDate() {
		return _visitDate;
	}

	public void setVisitDate(Date visitDate) {
		_visitDate = visitDate;
	}

	public int getStartTimeMinutes() {
		return _startTimeMinutes;
	}

	public void setStartTimeMinutes(int startTimeMinutes) {
		_startTimeMinutes = startTimeMinutes;
	}

	public int getDuration() {
		return _duration;
	}

	public void setDuration(int duration) {
		_duration = duration;
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
}