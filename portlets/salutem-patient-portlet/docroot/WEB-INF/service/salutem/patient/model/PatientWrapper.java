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

package salutem.patient.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Patient}.
 * </p>
 *
 * @author Aneta Andrzejewska
 * @see Patient
 * @generated
 */
public class PatientWrapper implements Patient, ModelWrapper<Patient> {
	public PatientWrapper(Patient patient) {
		_patient = patient;
	}

	@Override
	public Class<?> getModelClass() {
		return Patient.class;
	}

	@Override
	public String getModelClassName() {
		return Patient.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("patientId", getPatientId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("confirmingUserId", getConfirmingUserId());
		attributes.put("confirmingUserName", getConfirmingUserName());
		attributes.put("isConfirmed", getIsConfirmed());
		attributes.put("name", getName());
		attributes.put("surname", getSurname());
		attributes.put("middleName", getMiddleName());
		attributes.put("pesel", getPesel());
		attributes.put("idNumber", getIdNumber());
		attributes.put("idImageFileEntryId", getIdImageFileEntryId());
		attributes.put("birthDate", getBirthDate());
		attributes.put("sex", getSex());
		attributes.put("address", getAddress());
		attributes.put("cityName", getCityName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long patientId = (Long)attributes.get("patientId");

		if (patientId != null) {
			setPatientId(patientId);
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

		Long confirmingUserId = (Long)attributes.get("confirmingUserId");

		if (confirmingUserId != null) {
			setConfirmingUserId(confirmingUserId);
		}

		String confirmingUserName = (String)attributes.get("confirmingUserName");

		if (confirmingUserName != null) {
			setConfirmingUserName(confirmingUserName);
		}

		Boolean isConfirmed = (Boolean)attributes.get("isConfirmed");

		if (isConfirmed != null) {
			setIsConfirmed(isConfirmed);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String surname = (String)attributes.get("surname");

		if (surname != null) {
			setSurname(surname);
		}

		String middleName = (String)attributes.get("middleName");

		if (middleName != null) {
			setMiddleName(middleName);
		}

		String pesel = (String)attributes.get("pesel");

		if (pesel != null) {
			setPesel(pesel);
		}

		String idNumber = (String)attributes.get("idNumber");

		if (idNumber != null) {
			setIdNumber(idNumber);
		}

		Long idImageFileEntryId = (Long)attributes.get("idImageFileEntryId");

		if (idImageFileEntryId != null) {
			setIdImageFileEntryId(idImageFileEntryId);
		}

		Date birthDate = (Date)attributes.get("birthDate");

		if (birthDate != null) {
			setBirthDate(birthDate);
		}

		String sex = (String)attributes.get("sex");

		if (sex != null) {
			setSex(sex);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String cityName = (String)attributes.get("cityName");

		if (cityName != null) {
			setCityName(cityName);
		}
	}

	/**
	* Returns the primary key of this patient.
	*
	* @return the primary key of this patient
	*/
	@Override
	public long getPrimaryKey() {
		return _patient.getPrimaryKey();
	}

	/**
	* Sets the primary key of this patient.
	*
	* @param primaryKey the primary key of this patient
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_patient.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the patient ID of this patient.
	*
	* @return the patient ID of this patient
	*/
	@Override
	public long getPatientId() {
		return _patient.getPatientId();
	}

	/**
	* Sets the patient ID of this patient.
	*
	* @param patientId the patient ID of this patient
	*/
	@Override
	public void setPatientId(long patientId) {
		_patient.setPatientId(patientId);
	}

	/**
	* Returns the group ID of this patient.
	*
	* @return the group ID of this patient
	*/
	@Override
	public long getGroupId() {
		return _patient.getGroupId();
	}

	/**
	* Sets the group ID of this patient.
	*
	* @param groupId the group ID of this patient
	*/
	@Override
	public void setGroupId(long groupId) {
		_patient.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this patient.
	*
	* @return the company ID of this patient
	*/
	@Override
	public long getCompanyId() {
		return _patient.getCompanyId();
	}

	/**
	* Sets the company ID of this patient.
	*
	* @param companyId the company ID of this patient
	*/
	@Override
	public void setCompanyId(long companyId) {
		_patient.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this patient.
	*
	* @return the user ID of this patient
	*/
	@Override
	public long getUserId() {
		return _patient.getUserId();
	}

	/**
	* Sets the user ID of this patient.
	*
	* @param userId the user ID of this patient
	*/
	@Override
	public void setUserId(long userId) {
		_patient.setUserId(userId);
	}

	/**
	* Returns the user uuid of this patient.
	*
	* @return the user uuid of this patient
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _patient.getUserUuid();
	}

	/**
	* Sets the user uuid of this patient.
	*
	* @param userUuid the user uuid of this patient
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_patient.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this patient.
	*
	* @return the user name of this patient
	*/
	@Override
	public java.lang.String getUserName() {
		return _patient.getUserName();
	}

	/**
	* Sets the user name of this patient.
	*
	* @param userName the user name of this patient
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_patient.setUserName(userName);
	}

	/**
	* Returns the create date of this patient.
	*
	* @return the create date of this patient
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _patient.getCreateDate();
	}

	/**
	* Sets the create date of this patient.
	*
	* @param createDate the create date of this patient
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_patient.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this patient.
	*
	* @return the modified date of this patient
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _patient.getModifiedDate();
	}

	/**
	* Sets the modified date of this patient.
	*
	* @param modifiedDate the modified date of this patient
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_patient.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the confirming user ID of this patient.
	*
	* @return the confirming user ID of this patient
	*/
	@Override
	public long getConfirmingUserId() {
		return _patient.getConfirmingUserId();
	}

	/**
	* Sets the confirming user ID of this patient.
	*
	* @param confirmingUserId the confirming user ID of this patient
	*/
	@Override
	public void setConfirmingUserId(long confirmingUserId) {
		_patient.setConfirmingUserId(confirmingUserId);
	}

	/**
	* Returns the confirming user uuid of this patient.
	*
	* @return the confirming user uuid of this patient
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getConfirmingUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _patient.getConfirmingUserUuid();
	}

	/**
	* Sets the confirming user uuid of this patient.
	*
	* @param confirmingUserUuid the confirming user uuid of this patient
	*/
	@Override
	public void setConfirmingUserUuid(java.lang.String confirmingUserUuid) {
		_patient.setConfirmingUserUuid(confirmingUserUuid);
	}

	/**
	* Returns the confirming user name of this patient.
	*
	* @return the confirming user name of this patient
	*/
	@Override
	public java.lang.String getConfirmingUserName() {
		return _patient.getConfirmingUserName();
	}

	/**
	* Sets the confirming user name of this patient.
	*
	* @param confirmingUserName the confirming user name of this patient
	*/
	@Override
	public void setConfirmingUserName(java.lang.String confirmingUserName) {
		_patient.setConfirmingUserName(confirmingUserName);
	}

	/**
	* Returns the is confirmed of this patient.
	*
	* @return the is confirmed of this patient
	*/
	@Override
	public boolean getIsConfirmed() {
		return _patient.getIsConfirmed();
	}

	/**
	* Returns <code>true</code> if this patient is is confirmed.
	*
	* @return <code>true</code> if this patient is is confirmed; <code>false</code> otherwise
	*/
	@Override
	public boolean isIsConfirmed() {
		return _patient.isIsConfirmed();
	}

	/**
	* Sets whether this patient is is confirmed.
	*
	* @param isConfirmed the is confirmed of this patient
	*/
	@Override
	public void setIsConfirmed(boolean isConfirmed) {
		_patient.setIsConfirmed(isConfirmed);
	}

	/**
	* Returns the name of this patient.
	*
	* @return the name of this patient
	*/
	@Override
	public java.lang.String getName() {
		return _patient.getName();
	}

	/**
	* Sets the name of this patient.
	*
	* @param name the name of this patient
	*/
	@Override
	public void setName(java.lang.String name) {
		_patient.setName(name);
	}

	/**
	* Returns the surname of this patient.
	*
	* @return the surname of this patient
	*/
	@Override
	public java.lang.String getSurname() {
		return _patient.getSurname();
	}

	/**
	* Sets the surname of this patient.
	*
	* @param surname the surname of this patient
	*/
	@Override
	public void setSurname(java.lang.String surname) {
		_patient.setSurname(surname);
	}

	/**
	* Returns the middle name of this patient.
	*
	* @return the middle name of this patient
	*/
	@Override
	public java.lang.String getMiddleName() {
		return _patient.getMiddleName();
	}

	/**
	* Sets the middle name of this patient.
	*
	* @param middleName the middle name of this patient
	*/
	@Override
	public void setMiddleName(java.lang.String middleName) {
		_patient.setMiddleName(middleName);
	}

	/**
	* Returns the pesel of this patient.
	*
	* @return the pesel of this patient
	*/
	@Override
	public java.lang.String getPesel() {
		return _patient.getPesel();
	}

	/**
	* Sets the pesel of this patient.
	*
	* @param pesel the pesel of this patient
	*/
	@Override
	public void setPesel(java.lang.String pesel) {
		_patient.setPesel(pesel);
	}

	/**
	* Returns the id number of this patient.
	*
	* @return the id number of this patient
	*/
	@Override
	public java.lang.String getIdNumber() {
		return _patient.getIdNumber();
	}

	/**
	* Sets the id number of this patient.
	*
	* @param idNumber the id number of this patient
	*/
	@Override
	public void setIdNumber(java.lang.String idNumber) {
		_patient.setIdNumber(idNumber);
	}

	/**
	* Returns the id image file entry ID of this patient.
	*
	* @return the id image file entry ID of this patient
	*/
	@Override
	public long getIdImageFileEntryId() {
		return _patient.getIdImageFileEntryId();
	}

	/**
	* Sets the id image file entry ID of this patient.
	*
	* @param idImageFileEntryId the id image file entry ID of this patient
	*/
	@Override
	public void setIdImageFileEntryId(long idImageFileEntryId) {
		_patient.setIdImageFileEntryId(idImageFileEntryId);
	}

	/**
	* Returns the birth date of this patient.
	*
	* @return the birth date of this patient
	*/
	@Override
	public java.util.Date getBirthDate() {
		return _patient.getBirthDate();
	}

	/**
	* Sets the birth date of this patient.
	*
	* @param birthDate the birth date of this patient
	*/
	@Override
	public void setBirthDate(java.util.Date birthDate) {
		_patient.setBirthDate(birthDate);
	}

	/**
	* Returns the sex of this patient.
	*
	* @return the sex of this patient
	*/
	@Override
	public java.lang.String getSex() {
		return _patient.getSex();
	}

	/**
	* Sets the sex of this patient.
	*
	* @param sex the sex of this patient
	*/
	@Override
	public void setSex(java.lang.String sex) {
		_patient.setSex(sex);
	}

	/**
	* Returns the address of this patient.
	*
	* @return the address of this patient
	*/
	@Override
	public java.lang.String getAddress() {
		return _patient.getAddress();
	}

	/**
	* Sets the address of this patient.
	*
	* @param address the address of this patient
	*/
	@Override
	public void setAddress(java.lang.String address) {
		_patient.setAddress(address);
	}

	/**
	* Returns the city name of this patient.
	*
	* @return the city name of this patient
	*/
	@Override
	public java.lang.String getCityName() {
		return _patient.getCityName();
	}

	/**
	* Sets the city name of this patient.
	*
	* @param cityName the city name of this patient
	*/
	@Override
	public void setCityName(java.lang.String cityName) {
		_patient.setCityName(cityName);
	}

	@Override
	public boolean isNew() {
		return _patient.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_patient.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _patient.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_patient.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _patient.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _patient.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_patient.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _patient.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_patient.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_patient.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_patient.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PatientWrapper((Patient)_patient.clone());
	}

	@Override
	public int compareTo(salutem.patient.model.Patient patient) {
		return _patient.compareTo(patient);
	}

	@Override
	public int hashCode() {
		return _patient.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<salutem.patient.model.Patient> toCacheModel() {
		return _patient.toCacheModel();
	}

	@Override
	public salutem.patient.model.Patient toEscapedModel() {
		return new PatientWrapper(_patient.toEscapedModel());
	}

	@Override
	public salutem.patient.model.Patient toUnescapedModel() {
		return new PatientWrapper(_patient.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _patient.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _patient.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_patient.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PatientWrapper)) {
			return false;
		}

		PatientWrapper patientWrapper = (PatientWrapper)obj;

		if (Validator.equals(_patient, patientWrapper._patient)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Patient getWrappedPatient() {
		return _patient;
	}

	@Override
	public Patient getWrappedModel() {
		return _patient;
	}

	@Override
	public void resetOriginalValues() {
		_patient.resetOriginalValues();
	}

	private Patient _patient;
}