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
 * This class is a wrapper for {@link Doctor}.
 * </p>
 *
 * @author Aneta Andrzejewska
 * @see Doctor
 * @generated
 */
public class DoctorWrapper implements Doctor, ModelWrapper<Doctor> {
	public DoctorWrapper(Doctor doctor) {
		_doctor = doctor;
	}

	@Override
	public Class<?> getModelClass() {
		return Doctor.class;
	}

	@Override
	public String getModelClassName() {
		return Doctor.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("doctorId", getDoctorId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("surname", getSurname());
		attributes.put("imageId", getImageId());
		attributes.put("middleName", getMiddleName());
		attributes.put("specialization", getSpecialization());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long doctorId = (Long)attributes.get("doctorId");

		if (doctorId != null) {
			setDoctorId(doctorId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String surname = (String)attributes.get("surname");

		if (surname != null) {
			setSurname(surname);
		}

		Long imageId = (Long)attributes.get("imageId");

		if (imageId != null) {
			setImageId(imageId);
		}

		String middleName = (String)attributes.get("middleName");

		if (middleName != null) {
			setMiddleName(middleName);
		}

		String specialization = (String)attributes.get("specialization");

		if (specialization != null) {
			setSpecialization(specialization);
		}
	}

	/**
	* Returns the primary key of this doctor.
	*
	* @return the primary key of this doctor
	*/
	@Override
	public long getPrimaryKey() {
		return _doctor.getPrimaryKey();
	}

	/**
	* Sets the primary key of this doctor.
	*
	* @param primaryKey the primary key of this doctor
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_doctor.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the doctor ID of this doctor.
	*
	* @return the doctor ID of this doctor
	*/
	@Override
	public long getDoctorId() {
		return _doctor.getDoctorId();
	}

	/**
	* Sets the doctor ID of this doctor.
	*
	* @param doctorId the doctor ID of this doctor
	*/
	@Override
	public void setDoctorId(long doctorId) {
		_doctor.setDoctorId(doctorId);
	}

	/**
	* Returns the group ID of this doctor.
	*
	* @return the group ID of this doctor
	*/
	@Override
	public long getGroupId() {
		return _doctor.getGroupId();
	}

	/**
	* Sets the group ID of this doctor.
	*
	* @param groupId the group ID of this doctor
	*/
	@Override
	public void setGroupId(long groupId) {
		_doctor.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this doctor.
	*
	* @return the company ID of this doctor
	*/
	@Override
	public long getCompanyId() {
		return _doctor.getCompanyId();
	}

	/**
	* Sets the company ID of this doctor.
	*
	* @param companyId the company ID of this doctor
	*/
	@Override
	public void setCompanyId(long companyId) {
		_doctor.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this doctor.
	*
	* @return the user ID of this doctor
	*/
	@Override
	public long getUserId() {
		return _doctor.getUserId();
	}

	/**
	* Sets the user ID of this doctor.
	*
	* @param userId the user ID of this doctor
	*/
	@Override
	public void setUserId(long userId) {
		_doctor.setUserId(userId);
	}

	/**
	* Returns the user uuid of this doctor.
	*
	* @return the user uuid of this doctor
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _doctor.getUserUuid();
	}

	/**
	* Sets the user uuid of this doctor.
	*
	* @param userUuid the user uuid of this doctor
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_doctor.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this doctor.
	*
	* @return the user name of this doctor
	*/
	@Override
	public java.lang.String getUserName() {
		return _doctor.getUserName();
	}

	/**
	* Sets the user name of this doctor.
	*
	* @param userName the user name of this doctor
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_doctor.setUserName(userName);
	}

	/**
	* Returns the create date of this doctor.
	*
	* @return the create date of this doctor
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _doctor.getCreateDate();
	}

	/**
	* Sets the create date of this doctor.
	*
	* @param createDate the create date of this doctor
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_doctor.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this doctor.
	*
	* @return the modified date of this doctor
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _doctor.getModifiedDate();
	}

	/**
	* Sets the modified date of this doctor.
	*
	* @param modifiedDate the modified date of this doctor
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_doctor.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the name of this doctor.
	*
	* @return the name of this doctor
	*/
	@Override
	public java.lang.String getName() {
		return _doctor.getName();
	}

	/**
	* Sets the name of this doctor.
	*
	* @param name the name of this doctor
	*/
	@Override
	public void setName(java.lang.String name) {
		_doctor.setName(name);
	}

	/**
	* Returns the surname of this doctor.
	*
	* @return the surname of this doctor
	*/
	@Override
	public java.lang.String getSurname() {
		return _doctor.getSurname();
	}

	/**
	* Sets the surname of this doctor.
	*
	* @param surname the surname of this doctor
	*/
	@Override
	public void setSurname(java.lang.String surname) {
		_doctor.setSurname(surname);
	}

	/**
	* Returns the image ID of this doctor.
	*
	* @return the image ID of this doctor
	*/
	@Override
	public long getImageId() {
		return _doctor.getImageId();
	}

	/**
	* Sets the image ID of this doctor.
	*
	* @param imageId the image ID of this doctor
	*/
	@Override
	public void setImageId(long imageId) {
		_doctor.setImageId(imageId);
	}

	/**
	* Returns the middle name of this doctor.
	*
	* @return the middle name of this doctor
	*/
	@Override
	public java.lang.String getMiddleName() {
		return _doctor.getMiddleName();
	}

	/**
	* Sets the middle name of this doctor.
	*
	* @param middleName the middle name of this doctor
	*/
	@Override
	public void setMiddleName(java.lang.String middleName) {
		_doctor.setMiddleName(middleName);
	}

	/**
	* Returns the specialization of this doctor.
	*
	* @return the specialization of this doctor
	*/
	@Override
	public java.lang.String getSpecialization() {
		return _doctor.getSpecialization();
	}

	/**
	* Sets the specialization of this doctor.
	*
	* @param specialization the specialization of this doctor
	*/
	@Override
	public void setSpecialization(java.lang.String specialization) {
		_doctor.setSpecialization(specialization);
	}

	@Override
	public boolean isNew() {
		return _doctor.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_doctor.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _doctor.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_doctor.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _doctor.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _doctor.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_doctor.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _doctor.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_doctor.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_doctor.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_doctor.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DoctorWrapper((Doctor)_doctor.clone());
	}

	@Override
	public int compareTo(salutem.doctor.model.Doctor doctor) {
		return _doctor.compareTo(doctor);
	}

	@Override
	public int hashCode() {
		return _doctor.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<salutem.doctor.model.Doctor> toCacheModel() {
		return _doctor.toCacheModel();
	}

	@Override
	public salutem.doctor.model.Doctor toEscapedModel() {
		return new DoctorWrapper(_doctor.toEscapedModel());
	}

	@Override
	public salutem.doctor.model.Doctor toUnescapedModel() {
		return new DoctorWrapper(_doctor.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _doctor.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _doctor.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_doctor.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DoctorWrapper)) {
			return false;
		}

		DoctorWrapper doctorWrapper = (DoctorWrapper)obj;

		if (Validator.equals(_doctor, doctorWrapper._doctor)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Doctor getWrappedDoctor() {
		return _doctor;
	}

	@Override
	public Doctor getWrappedModel() {
		return _doctor;
	}

	@Override
	public void resetOriginalValues() {
		_doctor.resetOriginalValues();
	}

	private Doctor _doctor;
}