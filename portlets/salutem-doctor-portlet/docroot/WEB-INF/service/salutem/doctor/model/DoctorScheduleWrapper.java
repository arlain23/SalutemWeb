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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DoctorSchedule}.
 * </p>
 *
 * @author Aneta Andrzejewska
 * @see DoctorSchedule
 * @generated
 */
public class DoctorScheduleWrapper implements DoctorSchedule,
	ModelWrapper<DoctorSchedule> {
	public DoctorScheduleWrapper(DoctorSchedule doctorSchedule) {
		_doctorSchedule = doctorSchedule;
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

	/**
	* Returns the primary key of this doctor schedule.
	*
	* @return the primary key of this doctor schedule
	*/
	@Override
	public long getPrimaryKey() {
		return _doctorSchedule.getPrimaryKey();
	}

	/**
	* Sets the primary key of this doctor schedule.
	*
	* @param primaryKey the primary key of this doctor schedule
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_doctorSchedule.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the schedule ID of this doctor schedule.
	*
	* @return the schedule ID of this doctor schedule
	*/
	@Override
	public long getScheduleId() {
		return _doctorSchedule.getScheduleId();
	}

	/**
	* Sets the schedule ID of this doctor schedule.
	*
	* @param scheduleId the schedule ID of this doctor schedule
	*/
	@Override
	public void setScheduleId(long scheduleId) {
		_doctorSchedule.setScheduleId(scheduleId);
	}

	/**
	* Returns the doctor ID of this doctor schedule.
	*
	* @return the doctor ID of this doctor schedule
	*/
	@Override
	public long getDoctorId() {
		return _doctorSchedule.getDoctorId();
	}

	/**
	* Sets the doctor ID of this doctor schedule.
	*
	* @param doctorId the doctor ID of this doctor schedule
	*/
	@Override
	public void setDoctorId(long doctorId) {
		_doctorSchedule.setDoctorId(doctorId);
	}

	/**
	* Returns the create date of this doctor schedule.
	*
	* @return the create date of this doctor schedule
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _doctorSchedule.getCreateDate();
	}

	/**
	* Sets the create date of this doctor schedule.
	*
	* @param createDate the create date of this doctor schedule
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_doctorSchedule.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this doctor schedule.
	*
	* @return the modified date of this doctor schedule
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _doctorSchedule.getModifiedDate();
	}

	/**
	* Sets the modified date of this doctor schedule.
	*
	* @param modifiedDate the modified date of this doctor schedule
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_doctorSchedule.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the day of week of this doctor schedule.
	*
	* @return the day of week of this doctor schedule
	*/
	@Override
	public int getDayOfWeek() {
		return _doctorSchedule.getDayOfWeek();
	}

	/**
	* Sets the day of week of this doctor schedule.
	*
	* @param dayOfWeek the day of week of this doctor schedule
	*/
	@Override
	public void setDayOfWeek(int dayOfWeek) {
		_doctorSchedule.setDayOfWeek(dayOfWeek);
	}

	/**
	* Returns the start time of this doctor schedule.
	*
	* @return the start time of this doctor schedule
	*/
	@Override
	public double getStartTime() {
		return _doctorSchedule.getStartTime();
	}

	/**
	* Sets the start time of this doctor schedule.
	*
	* @param startTime the start time of this doctor schedule
	*/
	@Override
	public void setStartTime(double startTime) {
		_doctorSchedule.setStartTime(startTime);
	}

	/**
	* Returns the end time of this doctor schedule.
	*
	* @return the end time of this doctor schedule
	*/
	@Override
	public double getEndTime() {
		return _doctorSchedule.getEndTime();
	}

	/**
	* Sets the end time of this doctor schedule.
	*
	* @param endTime the end time of this doctor schedule
	*/
	@Override
	public void setEndTime(double endTime) {
		_doctorSchedule.setEndTime(endTime);
	}

	@Override
	public boolean isNew() {
		return _doctorSchedule.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_doctorSchedule.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _doctorSchedule.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_doctorSchedule.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _doctorSchedule.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _doctorSchedule.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_doctorSchedule.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _doctorSchedule.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_doctorSchedule.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_doctorSchedule.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_doctorSchedule.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DoctorScheduleWrapper((DoctorSchedule)_doctorSchedule.clone());
	}

	@Override
	public int compareTo(salutem.doctor.model.DoctorSchedule doctorSchedule) {
		return _doctorSchedule.compareTo(doctorSchedule);
	}

	@Override
	public int hashCode() {
		return _doctorSchedule.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<salutem.doctor.model.DoctorSchedule> toCacheModel() {
		return _doctorSchedule.toCacheModel();
	}

	@Override
	public salutem.doctor.model.DoctorSchedule toEscapedModel() {
		return new DoctorScheduleWrapper(_doctorSchedule.toEscapedModel());
	}

	@Override
	public salutem.doctor.model.DoctorSchedule toUnescapedModel() {
		return new DoctorScheduleWrapper(_doctorSchedule.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _doctorSchedule.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _doctorSchedule.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_doctorSchedule.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DoctorScheduleWrapper)) {
			return false;
		}

		DoctorScheduleWrapper doctorScheduleWrapper = (DoctorScheduleWrapper)obj;

		if (Validator.equals(_doctorSchedule,
					doctorScheduleWrapper._doctorSchedule)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DoctorSchedule getWrappedDoctorSchedule() {
		return _doctorSchedule;
	}

	@Override
	public DoctorSchedule getWrappedModel() {
		return _doctorSchedule;
	}

	@Override
	public void resetOriginalValues() {
		_doctorSchedule.resetOriginalValues();
	}

	private DoctorSchedule _doctorSchedule;
}