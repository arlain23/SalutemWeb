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

package tul.salutem.entity.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Patient service. Represents a row in the &quot;salutem_Patient&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link tul.salutem.entity.model.impl.PatientModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link tul.salutem.entity.model.impl.PatientImpl}.
 * </p>
 *
 * @author Aneta Andrzejewska
 * @see Patient
 * @see tul.salutem.entity.model.impl.PatientImpl
 * @see tul.salutem.entity.model.impl.PatientModelImpl
 * @generated
 */
public interface PatientModel extends BaseModel<Patient>, GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a patient model instance should use the {@link Patient} interface instead.
	 */

	/**
	 * Returns the primary key of this patient.
	 *
	 * @return the primary key of this patient
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this patient.
	 *
	 * @param primaryKey the primary key of this patient
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the patient ID of this patient.
	 *
	 * @return the patient ID of this patient
	 */
	public long getPatientId();

	/**
	 * Sets the patient ID of this patient.
	 *
	 * @param patientId the patient ID of this patient
	 */
	public void setPatientId(long patientId);

	/**
	 * Returns the group ID of this patient.
	 *
	 * @return the group ID of this patient
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this patient.
	 *
	 * @param groupId the group ID of this patient
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this patient.
	 *
	 * @return the company ID of this patient
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this patient.
	 *
	 * @param companyId the company ID of this patient
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this patient.
	 *
	 * @return the user ID of this patient
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this patient.
	 *
	 * @param userId the user ID of this patient
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this patient.
	 *
	 * @return the user uuid of this patient
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this patient.
	 *
	 * @param userUuid the user uuid of this patient
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this patient.
	 *
	 * @return the user name of this patient
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this patient.
	 *
	 * @param userName the user name of this patient
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this patient.
	 *
	 * @return the create date of this patient
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this patient.
	 *
	 * @param createDate the create date of this patient
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this patient.
	 *
	 * @return the modified date of this patient
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this patient.
	 *
	 * @param modifiedDate the modified date of this patient
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the confirming user ID of this patient.
	 *
	 * @return the confirming user ID of this patient
	 */
	public long getConfirmingUserId();

	/**
	 * Sets the confirming user ID of this patient.
	 *
	 * @param confirmingUserId the confirming user ID of this patient
	 */
	public void setConfirmingUserId(long confirmingUserId);

	/**
	 * Returns the confirming user uuid of this patient.
	 *
	 * @return the confirming user uuid of this patient
	 * @throws SystemException if a system exception occurred
	 */
	public String getConfirmingUserUuid() throws SystemException;

	/**
	 * Sets the confirming user uuid of this patient.
	 *
	 * @param confirmingUserUuid the confirming user uuid of this patient
	 */
	public void setConfirmingUserUuid(String confirmingUserUuid);

	/**
	 * Returns the confirming user name of this patient.
	 *
	 * @return the confirming user name of this patient
	 */
	@AutoEscape
	public String getConfirmingUserName();

	/**
	 * Sets the confirming user name of this patient.
	 *
	 * @param confirmingUserName the confirming user name of this patient
	 */
	public void setConfirmingUserName(String confirmingUserName);

	/**
	 * Returns the is confirmed of this patient.
	 *
	 * @return the is confirmed of this patient
	 */
	public boolean getIsConfirmed();

	/**
	 * Returns <code>true</code> if this patient is is confirmed.
	 *
	 * @return <code>true</code> if this patient is is confirmed; <code>false</code> otherwise
	 */
	public boolean isIsConfirmed();

	/**
	 * Sets whether this patient is is confirmed.
	 *
	 * @param isConfirmed the is confirmed of this patient
	 */
	public void setIsConfirmed(boolean isConfirmed);

	/**
	 * Returns the name of this patient.
	 *
	 * @return the name of this patient
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this patient.
	 *
	 * @param name the name of this patient
	 */
	public void setName(String name);

	/**
	 * Returns the surname of this patient.
	 *
	 * @return the surname of this patient
	 */
	@AutoEscape
	public String getSurname();

	/**
	 * Sets the surname of this patient.
	 *
	 * @param surname the surname of this patient
	 */
	public void setSurname(String surname);

	/**
	 * Returns the middle name of this patient.
	 *
	 * @return the middle name of this patient
	 */
	@AutoEscape
	public String getMiddleName();

	/**
	 * Sets the middle name of this patient.
	 *
	 * @param middleName the middle name of this patient
	 */
	public void setMiddleName(String middleName);

	/**
	 * Returns the pesel of this patient.
	 *
	 * @return the pesel of this patient
	 */
	public int getPesel();

	/**
	 * Sets the pesel of this patient.
	 *
	 * @param pesel the pesel of this patient
	 */
	public void setPesel(int pesel);

	/**
	 * Returns the id number of this patient.
	 *
	 * @return the id number of this patient
	 */
	@AutoEscape
	public String getIdNumber();

	/**
	 * Sets the id number of this patient.
	 *
	 * @param idNumber the id number of this patient
	 */
	public void setIdNumber(String idNumber);

	/**
	 * Returns the id image of this patient.
	 *
	 * @return the id image of this patient
	 */
	@AutoEscape
	public String getIdImage();

	/**
	 * Sets the id image of this patient.
	 *
	 * @param idImage the id image of this patient
	 */
	public void setIdImage(String idImage);

	/**
	 * Returns the birth date of this patient.
	 *
	 * @return the birth date of this patient
	 */
	public Date getBirthDate();

	/**
	 * Sets the birth date of this patient.
	 *
	 * @param birthDate the birth date of this patient
	 */
	public void setBirthDate(Date birthDate);

	/**
	 * Returns the sex of this patient.
	 *
	 * @return the sex of this patient
	 */
	@AutoEscape
	public String getSex();

	/**
	 * Sets the sex of this patient.
	 *
	 * @param sex the sex of this patient
	 */
	public void setSex(String sex);

	/**
	 * Returns the address of this patient.
	 *
	 * @return the address of this patient
	 */
	@AutoEscape
	public String getAddress();

	/**
	 * Sets the address of this patient.
	 *
	 * @param address the address of this patient
	 */
	public void setAddress(String address);

	/**
	 * Returns the city name of this patient.
	 *
	 * @return the city name of this patient
	 */
	@AutoEscape
	public String getCityName();

	/**
	 * Sets the city name of this patient.
	 *
	 * @param cityName the city name of this patient
	 */
	public void setCityName(String cityName);

	/**
	 * Returns the blood type of this patient.
	 *
	 * @return the blood type of this patient
	 */
	@AutoEscape
	public String getBloodType();

	/**
	 * Sets the blood type of this patient.
	 *
	 * @param bloodType the blood type of this patient
	 */
	public void setBloodType(String bloodType);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(tul.salutem.entity.model.Patient patient);

	@Override
	public int hashCode();

	@Override
	public CacheModel<tul.salutem.entity.model.Patient> toCacheModel();

	@Override
	public tul.salutem.entity.model.Patient toEscapedModel();

	@Override
	public tul.salutem.entity.model.Patient toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}