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
 * This class is a wrapper for {@link Time}.
 * </p>
 *
 * @author Aneta Andrzejewska
 * @see Time
 * @generated
 */
public class TimeWrapper implements Time, ModelWrapper<Time> {
	public TimeWrapper(Time time) {
		_time = time;
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

	/**
	* Returns the primary key of this time.
	*
	* @return the primary key of this time
	*/
	@Override
	public long getPrimaryKey() {
		return _time.getPrimaryKey();
	}

	/**
	* Sets the primary key of this time.
	*
	* @param primaryKey the primary key of this time
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_time.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the time ID of this time.
	*
	* @return the time ID of this time
	*/
	@Override
	public long getTimeId() {
		return _time.getTimeId();
	}

	/**
	* Sets the time ID of this time.
	*
	* @param timeId the time ID of this time
	*/
	@Override
	public void setTimeId(long timeId) {
		_time.setTimeId(timeId);
	}

	/**
	* Returns the entry uuid of this time.
	*
	* @return the entry uuid of this time
	*/
	@Override
	public java.lang.String getEntryUuid() {
		return _time.getEntryUuid();
	}

	/**
	* Sets the entry uuid of this time.
	*
	* @param entryUuid the entry uuid of this time
	*/
	@Override
	public void setEntryUuid(java.lang.String entryUuid) {
		_time.setEntryUuid(entryUuid);
	}

	/**
	* Returns the group ID of this time.
	*
	* @return the group ID of this time
	*/
	@Override
	public long getGroupId() {
		return _time.getGroupId();
	}

	/**
	* Sets the group ID of this time.
	*
	* @param groupId the group ID of this time
	*/
	@Override
	public void setGroupId(long groupId) {
		_time.setGroupId(groupId);
	}

	/**
	* Returns the doctor ID of this time.
	*
	* @return the doctor ID of this time
	*/
	@Override
	public long getDoctorId() {
		return _time.getDoctorId();
	}

	/**
	* Sets the doctor ID of this time.
	*
	* @param doctorId the doctor ID of this time
	*/
	@Override
	public void setDoctorId(long doctorId) {
		_time.setDoctorId(doctorId);
	}

	/**
	* Returns the patient ID of this time.
	*
	* @return the patient ID of this time
	*/
	@Override
	public long getPatientId() {
		return _time.getPatientId();
	}

	/**
	* Sets the patient ID of this time.
	*
	* @param patientId the patient ID of this time
	*/
	@Override
	public void setPatientId(long patientId) {
		_time.setPatientId(patientId);
	}

	/**
	* Returns the visit day of this time.
	*
	* @return the visit day of this time
	*/
	@Override
	public int getVisitDay() {
		return _time.getVisitDay();
	}

	/**
	* Sets the visit day of this time.
	*
	* @param visitDay the visit day of this time
	*/
	@Override
	public void setVisitDay(int visitDay) {
		_time.setVisitDay(visitDay);
	}

	/**
	* Returns the visit month of this time.
	*
	* @return the visit month of this time
	*/
	@Override
	public int getVisitMonth() {
		return _time.getVisitMonth();
	}

	/**
	* Sets the visit month of this time.
	*
	* @param visitMonth the visit month of this time
	*/
	@Override
	public void setVisitMonth(int visitMonth) {
		_time.setVisitMonth(visitMonth);
	}

	/**
	* Returns the visit year of this time.
	*
	* @return the visit year of this time
	*/
	@Override
	public int getVisitYear() {
		return _time.getVisitYear();
	}

	/**
	* Sets the visit year of this time.
	*
	* @param visitYear the visit year of this time
	*/
	@Override
	public void setVisitYear(int visitYear) {
		_time.setVisitYear(visitYear);
	}

	/**
	* Returns the visit time of this time.
	*
	* @return the visit time of this time
	*/
	@Override
	public int getVisitTime() {
		return _time.getVisitTime();
	}

	/**
	* Sets the visit time of this time.
	*
	* @param visitTime the visit time of this time
	*/
	@Override
	public void setVisitTime(int visitTime) {
		_time.setVisitTime(visitTime);
	}

	/**
	* Returns the visit duration of this time.
	*
	* @return the visit duration of this time
	*/
	@Override
	public int getVisitDuration() {
		return _time.getVisitDuration();
	}

	/**
	* Sets the visit duration of this time.
	*
	* @param visitDuration the visit duration of this time
	*/
	@Override
	public void setVisitDuration(int visitDuration) {
		_time.setVisitDuration(visitDuration);
	}

	/**
	* Returns the was finished of this time.
	*
	* @return the was finished of this time
	*/
	@Override
	public boolean getWasFinished() {
		return _time.getWasFinished();
	}

	/**
	* Returns <code>true</code> if this time is was finished.
	*
	* @return <code>true</code> if this time is was finished; <code>false</code> otherwise
	*/
	@Override
	public boolean isWasFinished() {
		return _time.isWasFinished();
	}

	/**
	* Sets whether this time is was finished.
	*
	* @param wasFinished the was finished of this time
	*/
	@Override
	public void setWasFinished(boolean wasFinished) {
		_time.setWasFinished(wasFinished);
	}

	/**
	* Returns the was planned of this time.
	*
	* @return the was planned of this time
	*/
	@Override
	public boolean getWasPlanned() {
		return _time.getWasPlanned();
	}

	/**
	* Returns <code>true</code> if this time is was planned.
	*
	* @return <code>true</code> if this time is was planned; <code>false</code> otherwise
	*/
	@Override
	public boolean isWasPlanned() {
		return _time.isWasPlanned();
	}

	/**
	* Sets whether this time is was planned.
	*
	* @param wasPlanned the was planned of this time
	*/
	@Override
	public void setWasPlanned(boolean wasPlanned) {
		_time.setWasPlanned(wasPlanned);
	}

	/**
	* Returns the visit ID of this time.
	*
	* @return the visit ID of this time
	*/
	@Override
	public long getVisitId() {
		return _time.getVisitId();
	}

	/**
	* Sets the visit ID of this time.
	*
	* @param visitId the visit ID of this time
	*/
	@Override
	public void setVisitId(long visitId) {
		_time.setVisitId(visitId);
	}

	@Override
	public boolean isNew() {
		return _time.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_time.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _time.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_time.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _time.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _time.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_time.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _time.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_time.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_time.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_time.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TimeWrapper((Time)_time.clone());
	}

	@Override
	public int compareTo(salutem.visit.model.Time time) {
		return _time.compareTo(time);
	}

	@Override
	public int hashCode() {
		return _time.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<salutem.visit.model.Time> toCacheModel() {
		return _time.toCacheModel();
	}

	@Override
	public salutem.visit.model.Time toEscapedModel() {
		return new TimeWrapper(_time.toEscapedModel());
	}

	@Override
	public salutem.visit.model.Time toUnescapedModel() {
		return new TimeWrapper(_time.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _time.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _time.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_time.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TimeWrapper)) {
			return false;
		}

		TimeWrapper timeWrapper = (TimeWrapper)obj;

		if (Validator.equals(_time, timeWrapper._time)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Time getWrappedTime() {
		return _time;
	}

	@Override
	public Time getWrappedModel() {
		return _time;
	}

	@Override
	public void resetOriginalValues() {
		_time.resetOriginalValues();
	}

	private Time _time;
}