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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link tul.salutem.entity.service.http.PatientServiceSoap}.
 *
 * @author Aneta Andrzejewska
 * @see tul.salutem.entity.service.http.PatientServiceSoap
 * @generated
 */
public class PatientSoap implements Serializable {
	public static PatientSoap toSoapModel(Patient model) {
		PatientSoap soapModel = new PatientSoap();

		soapModel.setPatientId(model.getPatientId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setConfirmingUserId(model.getConfirmingUserId());
		soapModel.setConfirmingUserName(model.getConfirmingUserName());
		soapModel.setIsConfirmed(model.getIsConfirmed());
		soapModel.setName(model.getName());
		soapModel.setSurname(model.getSurname());
		soapModel.setMiddleName(model.getMiddleName());
		soapModel.setPesel(model.getPesel());
		soapModel.setIdNumber(model.getIdNumber());
		soapModel.setIdImage(model.getIdImage());
		soapModel.setBirthDate(model.getBirthDate());
		soapModel.setSex(model.getSex());
		soapModel.setAddress(model.getAddress());
		soapModel.setCityName(model.getCityName());
		soapModel.setBloodType(model.getBloodType());

		return soapModel;
	}

	public static PatientSoap[] toSoapModels(Patient[] models) {
		PatientSoap[] soapModels = new PatientSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PatientSoap[][] toSoapModels(Patient[][] models) {
		PatientSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PatientSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PatientSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PatientSoap[] toSoapModels(List<Patient> models) {
		List<PatientSoap> soapModels = new ArrayList<PatientSoap>(models.size());

		for (Patient model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PatientSoap[soapModels.size()]);
	}

	public PatientSoap() {
	}

	public long getPrimaryKey() {
		return _patientId;
	}

	public void setPrimaryKey(long pk) {
		setPatientId(pk);
	}

	public long getPatientId() {
		return _patientId;
	}

	public void setPatientId(long patientId) {
		_patientId = patientId;
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

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
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

	public long getConfirmingUserId() {
		return _confirmingUserId;
	}

	public void setConfirmingUserId(long confirmingUserId) {
		_confirmingUserId = confirmingUserId;
	}

	public String getConfirmingUserName() {
		return _confirmingUserName;
	}

	public void setConfirmingUserName(String confirmingUserName) {
		_confirmingUserName = confirmingUserName;
	}

	public boolean getIsConfirmed() {
		return _isConfirmed;
	}

	public boolean isIsConfirmed() {
		return _isConfirmed;
	}

	public void setIsConfirmed(boolean isConfirmed) {
		_isConfirmed = isConfirmed;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getSurname() {
		return _surname;
	}

	public void setSurname(String surname) {
		_surname = surname;
	}

	public String getMiddleName() {
		return _middleName;
	}

	public void setMiddleName(String middleName) {
		_middleName = middleName;
	}

	public int getPesel() {
		return _pesel;
	}

	public void setPesel(int pesel) {
		_pesel = pesel;
	}

	public String getIdNumber() {
		return _idNumber;
	}

	public void setIdNumber(String idNumber) {
		_idNumber = idNumber;
	}

	public String getIdImage() {
		return _idImage;
	}

	public void setIdImage(String idImage) {
		_idImage = idImage;
	}

	public Date getBirthDate() {
		return _birthDate;
	}

	public void setBirthDate(Date birthDate) {
		_birthDate = birthDate;
	}

	public String getSex() {
		return _sex;
	}

	public void setSex(String sex) {
		_sex = sex;
	}

	public String getAddress() {
		return _address;
	}

	public void setAddress(String address) {
		_address = address;
	}

	public String getCityName() {
		return _cityName;
	}

	public void setCityName(String cityName) {
		_cityName = cityName;
	}

	public String getBloodType() {
		return _bloodType;
	}

	public void setBloodType(String bloodType) {
		_bloodType = bloodType;
	}

	private long _patientId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _confirmingUserId;
	private String _confirmingUserName;
	private boolean _isConfirmed;
	private String _name;
	private String _surname;
	private String _middleName;
	private int _pesel;
	private String _idNumber;
	private String _idImage;
	private Date _birthDate;
	private String _sex;
	private String _address;
	private String _cityName;
	private String _bloodType;
}