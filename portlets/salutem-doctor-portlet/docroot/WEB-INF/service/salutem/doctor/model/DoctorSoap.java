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
 * This class is used by SOAP remote services, specifically {@link salutem.doctor.service.http.DoctorServiceSoap}.
 *
 * @author Aneta Andrzejewska
 * @see salutem.doctor.service.http.DoctorServiceSoap
 * @generated
 */
public class DoctorSoap implements Serializable {
	public static DoctorSoap toSoapModel(Doctor model) {
		DoctorSoap soapModel = new DoctorSoap();

		soapModel.setDoctorId(model.getDoctorId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setName(model.getName());
		soapModel.setSurname(model.getSurname());
		soapModel.setImageId(model.getImageId());
		soapModel.setMiddleName(model.getMiddleName());
		soapModel.setSpecialization(model.getSpecialization());

		return soapModel;
	}

	public static DoctorSoap[] toSoapModels(Doctor[] models) {
		DoctorSoap[] soapModels = new DoctorSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DoctorSoap[][] toSoapModels(Doctor[][] models) {
		DoctorSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DoctorSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DoctorSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DoctorSoap[] toSoapModels(List<Doctor> models) {
		List<DoctorSoap> soapModels = new ArrayList<DoctorSoap>(models.size());

		for (Doctor model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DoctorSoap[soapModels.size()]);
	}

	public DoctorSoap() {
	}

	public long getPrimaryKey() {
		return _doctorId;
	}

	public void setPrimaryKey(long pk) {
		setDoctorId(pk);
	}

	public long getDoctorId() {
		return _doctorId;
	}

	public void setDoctorId(long doctorId) {
		_doctorId = doctorId;
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

	public long getImageId() {
		return _imageId;
	}

	public void setImageId(long imageId) {
		_imageId = imageId;
	}

	public String getMiddleName() {
		return _middleName;
	}

	public void setMiddleName(String middleName) {
		_middleName = middleName;
	}

	public String getSpecialization() {
		return _specialization;
	}

	public void setSpecialization(String specialization) {
		_specialization = specialization;
	}

	private long _doctorId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
	private String _surname;
	private long _imageId;
	private String _middleName;
	private String _specialization;
}