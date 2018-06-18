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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Visit}.
 * </p>
 *
 * @author Aneta Andrzejewska
 * @see Visit
 * @generated
 */
public class VisitWrapper implements Visit, ModelWrapper<Visit> {
	public VisitWrapper(Visit visit) {
		_visit = visit;
	}

	@Override
	public Class<?> getModelClass() {
		return Visit.class;
	}

	@Override
	public String getModelClassName() {
		return Visit.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("visitId", getVisitId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("doctorId", getDoctorId());
		attributes.put("patientId", getPatientId());
		attributes.put("cancelled", getCancelled());
		attributes.put("hasHappened", getHasHappened());
		attributes.put("visitDate", getVisitDate());
		attributes.put("startTimeMinutes", getStartTimeMinutes());
		attributes.put("duration", getDuration());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long visitId = (Long)attributes.get("visitId");

		if (visitId != null) {
			setVisitId(visitId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long doctorId = (Long)attributes.get("doctorId");

		if (doctorId != null) {
			setDoctorId(doctorId);
		}

		Long patientId = (Long)attributes.get("patientId");

		if (patientId != null) {
			setPatientId(patientId);
		}

		Boolean cancelled = (Boolean)attributes.get("cancelled");

		if (cancelled != null) {
			setCancelled(cancelled);
		}

		Boolean hasHappened = (Boolean)attributes.get("hasHappened");

		if (hasHappened != null) {
			setHasHappened(hasHappened);
		}

		Date visitDate = (Date)attributes.get("visitDate");

		if (visitDate != null) {
			setVisitDate(visitDate);
		}

		Integer startTimeMinutes = (Integer)attributes.get("startTimeMinutes");

		if (startTimeMinutes != null) {
			setStartTimeMinutes(startTimeMinutes);
		}

		Integer duration = (Integer)attributes.get("duration");

		if (duration != null) {
			setDuration(duration);
		}
	}

	/**
	* Returns the primary key of this visit.
	*
	* @return the primary key of this visit
	*/
	@Override
	public long getPrimaryKey() {
		return _visit.getPrimaryKey();
	}

	/**
	* Sets the primary key of this visit.
	*
	* @param primaryKey the primary key of this visit
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_visit.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the visit ID of this visit.
	*
	* @return the visit ID of this visit
	*/
	@Override
	public long getVisitId() {
		return _visit.getVisitId();
	}

	/**
	* Sets the visit ID of this visit.
	*
	* @param visitId the visit ID of this visit
	*/
	@Override
	public void setVisitId(long visitId) {
		_visit.setVisitId(visitId);
	}

	/**
	* Returns the group ID of this visit.
	*
	* @return the group ID of this visit
	*/
	@Override
	public long getGroupId() {
		return _visit.getGroupId();
	}

	/**
	* Sets the group ID of this visit.
	*
	* @param groupId the group ID of this visit
	*/
	@Override
	public void setGroupId(long groupId) {
		_visit.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this visit.
	*
	* @return the company ID of this visit
	*/
	@Override
	public long getCompanyId() {
		return _visit.getCompanyId();
	}

	/**
	* Sets the company ID of this visit.
	*
	* @param companyId the company ID of this visit
	*/
	@Override
	public void setCompanyId(long companyId) {
		_visit.setCompanyId(companyId);
	}

	/**
	* Returns the create date of this visit.
	*
	* @return the create date of this visit
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _visit.getCreateDate();
	}

	/**
	* Sets the create date of this visit.
	*
	* @param createDate the create date of this visit
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_visit.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this visit.
	*
	* @return the modified date of this visit
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _visit.getModifiedDate();
	}

	/**
	* Sets the modified date of this visit.
	*
	* @param modifiedDate the modified date of this visit
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_visit.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the doctor ID of this visit.
	*
	* @return the doctor ID of this visit
	*/
	@Override
	public long getDoctorId() {
		return _visit.getDoctorId();
	}

	/**
	* Sets the doctor ID of this visit.
	*
	* @param doctorId the doctor ID of this visit
	*/
	@Override
	public void setDoctorId(long doctorId) {
		_visit.setDoctorId(doctorId);
	}

	/**
	* Returns the patient ID of this visit.
	*
	* @return the patient ID of this visit
	*/
	@Override
	public long getPatientId() {
		return _visit.getPatientId();
	}

	/**
	* Sets the patient ID of this visit.
	*
	* @param patientId the patient ID of this visit
	*/
	@Override
	public void setPatientId(long patientId) {
		_visit.setPatientId(patientId);
	}

	/**
	* Returns the cancelled of this visit.
	*
	* @return the cancelled of this visit
	*/
	@Override
	public boolean getCancelled() {
		return _visit.getCancelled();
	}

	/**
	* Returns <code>true</code> if this visit is cancelled.
	*
	* @return <code>true</code> if this visit is cancelled; <code>false</code> otherwise
	*/
	@Override
	public boolean isCancelled() {
		return _visit.isCancelled();
	}

	/**
	* Sets whether this visit is cancelled.
	*
	* @param cancelled the cancelled of this visit
	*/
	@Override
	public void setCancelled(boolean cancelled) {
		_visit.setCancelled(cancelled);
	}

	/**
	* Returns the has happened of this visit.
	*
	* @return the has happened of this visit
	*/
	@Override
	public boolean getHasHappened() {
		return _visit.getHasHappened();
	}

	/**
	* Returns <code>true</code> if this visit is has happened.
	*
	* @return <code>true</code> if this visit is has happened; <code>false</code> otherwise
	*/
	@Override
	public boolean isHasHappened() {
		return _visit.isHasHappened();
	}

	/**
	* Sets whether this visit is has happened.
	*
	* @param hasHappened the has happened of this visit
	*/
	@Override
	public void setHasHappened(boolean hasHappened) {
		_visit.setHasHappened(hasHappened);
	}

	/**
	* Returns the visit date of this visit.
	*
	* @return the visit date of this visit
	*/
	@Override
	public java.util.Date getVisitDate() {
		return _visit.getVisitDate();
	}

	/**
	* Sets the visit date of this visit.
	*
	* @param visitDate the visit date of this visit
	*/
	@Override
	public void setVisitDate(java.util.Date visitDate) {
		_visit.setVisitDate(visitDate);
	}

	/**
	* Returns the start time minutes of this visit.
	*
	* @return the start time minutes of this visit
	*/
	@Override
	public int getStartTimeMinutes() {
		return _visit.getStartTimeMinutes();
	}

	/**
	* Sets the start time minutes of this visit.
	*
	* @param startTimeMinutes the start time minutes of this visit
	*/
	@Override
	public void setStartTimeMinutes(int startTimeMinutes) {
		_visit.setStartTimeMinutes(startTimeMinutes);
	}

	/**
	* Returns the duration of this visit.
	*
	* @return the duration of this visit
	*/
	@Override
	public int getDuration() {
		return _visit.getDuration();
	}

	/**
	* Sets the duration of this visit.
	*
	* @param duration the duration of this visit
	*/
	@Override
	public void setDuration(int duration) {
		_visit.setDuration(duration);
	}

	@Override
	public boolean isNew() {
		return _visit.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_visit.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _visit.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_visit.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _visit.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _visit.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_visit.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _visit.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_visit.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_visit.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_visit.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new VisitWrapper((Visit)_visit.clone());
	}

	@Override
	public int compareTo(salutem.visit.model.Visit visit) {
		return _visit.compareTo(visit);
	}

	@Override
	public int hashCode() {
		return _visit.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<salutem.visit.model.Visit> toCacheModel() {
		return _visit.toCacheModel();
	}

	@Override
	public salutem.visit.model.Visit toEscapedModel() {
		return new VisitWrapper(_visit.toEscapedModel());
	}

	@Override
	public salutem.visit.model.Visit toUnescapedModel() {
		return new VisitWrapper(_visit.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _visit.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _visit.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_visit.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VisitWrapper)) {
			return false;
		}

		VisitWrapper visitWrapper = (VisitWrapper)obj;

		if (Validator.equals(_visit, visitWrapper._visit)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Visit getWrappedVisit() {
		return _visit;
	}

	@Override
	public Visit getWrappedModel() {
		return _visit;
	}

	@Override
	public void resetOriginalValues() {
		_visit.resetOriginalValues();
	}

	private Visit _visit;
}