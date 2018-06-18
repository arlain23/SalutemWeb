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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import salutem.patient.service.ClpSerializer;
import salutem.patient.service.PatientLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Aneta Andrzejewska
 */
public class PatientClp extends BaseModelImpl<Patient> implements Patient {
	public PatientClp() {
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
	public long getPrimaryKey() {
		return _patientId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setPatientId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _patientId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getPatientId() {
		return _patientId;
	}

	@Override
	public void setPatientId(long patientId) {
		_patientId = patientId;

		if (_patientRemoteModel != null) {
			try {
				Class<?> clazz = _patientRemoteModel.getClass();

				Method method = clazz.getMethod("setPatientId", long.class);

				method.invoke(_patientRemoteModel, patientId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_patientRemoteModel != null) {
			try {
				Class<?> clazz = _patientRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_patientRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_patientRemoteModel != null) {
			try {
				Class<?> clazz = _patientRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_patientRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_patientRemoteModel != null) {
			try {
				Class<?> clazz = _patientRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_patientRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getUserName() {
		return _userName;
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;

		if (_patientRemoteModel != null) {
			try {
				Class<?> clazz = _patientRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_patientRemoteModel, userName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_patientRemoteModel != null) {
			try {
				Class<?> clazz = _patientRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_patientRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_patientRemoteModel != null) {
			try {
				Class<?> clazz = _patientRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_patientRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getConfirmingUserId() {
		return _confirmingUserId;
	}

	@Override
	public void setConfirmingUserId(long confirmingUserId) {
		_confirmingUserId = confirmingUserId;

		if (_patientRemoteModel != null) {
			try {
				Class<?> clazz = _patientRemoteModel.getClass();

				Method method = clazz.getMethod("setConfirmingUserId",
						long.class);

				method.invoke(_patientRemoteModel, confirmingUserId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getConfirmingUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getConfirmingUserId(), "uuid",
			_confirmingUserUuid);
	}

	@Override
	public void setConfirmingUserUuid(String confirmingUserUuid) {
		_confirmingUserUuid = confirmingUserUuid;
	}

	@Override
	public String getConfirmingUserName() {
		return _confirmingUserName;
	}

	@Override
	public void setConfirmingUserName(String confirmingUserName) {
		_confirmingUserName = confirmingUserName;

		if (_patientRemoteModel != null) {
			try {
				Class<?> clazz = _patientRemoteModel.getClass();

				Method method = clazz.getMethod("setConfirmingUserName",
						String.class);

				method.invoke(_patientRemoteModel, confirmingUserName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getIsConfirmed() {
		return _isConfirmed;
	}

	@Override
	public boolean isIsConfirmed() {
		return _isConfirmed;
	}

	@Override
	public void setIsConfirmed(boolean isConfirmed) {
		_isConfirmed = isConfirmed;

		if (_patientRemoteModel != null) {
			try {
				Class<?> clazz = _patientRemoteModel.getClass();

				Method method = clazz.getMethod("setIsConfirmed", boolean.class);

				method.invoke(_patientRemoteModel, isConfirmed);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getName() {
		return _name;
	}

	@Override
	public void setName(String name) {
		_name = name;

		if (_patientRemoteModel != null) {
			try {
				Class<?> clazz = _patientRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_patientRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSurname() {
		return _surname;
	}

	@Override
	public void setSurname(String surname) {
		_surname = surname;

		if (_patientRemoteModel != null) {
			try {
				Class<?> clazz = _patientRemoteModel.getClass();

				Method method = clazz.getMethod("setSurname", String.class);

				method.invoke(_patientRemoteModel, surname);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMiddleName() {
		return _middleName;
	}

	@Override
	public void setMiddleName(String middleName) {
		_middleName = middleName;

		if (_patientRemoteModel != null) {
			try {
				Class<?> clazz = _patientRemoteModel.getClass();

				Method method = clazz.getMethod("setMiddleName", String.class);

				method.invoke(_patientRemoteModel, middleName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPesel() {
		return _pesel;
	}

	@Override
	public void setPesel(String pesel) {
		_pesel = pesel;

		if (_patientRemoteModel != null) {
			try {
				Class<?> clazz = _patientRemoteModel.getClass();

				Method method = clazz.getMethod("setPesel", String.class);

				method.invoke(_patientRemoteModel, pesel);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getIdNumber() {
		return _idNumber;
	}

	@Override
	public void setIdNumber(String idNumber) {
		_idNumber = idNumber;

		if (_patientRemoteModel != null) {
			try {
				Class<?> clazz = _patientRemoteModel.getClass();

				Method method = clazz.getMethod("setIdNumber", String.class);

				method.invoke(_patientRemoteModel, idNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getIdImageFileEntryId() {
		return _idImageFileEntryId;
	}

	@Override
	public void setIdImageFileEntryId(long idImageFileEntryId) {
		_idImageFileEntryId = idImageFileEntryId;

		if (_patientRemoteModel != null) {
			try {
				Class<?> clazz = _patientRemoteModel.getClass();

				Method method = clazz.getMethod("setIdImageFileEntryId",
						long.class);

				method.invoke(_patientRemoteModel, idImageFileEntryId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getBirthDate() {
		return _birthDate;
	}

	@Override
	public void setBirthDate(Date birthDate) {
		_birthDate = birthDate;

		if (_patientRemoteModel != null) {
			try {
				Class<?> clazz = _patientRemoteModel.getClass();

				Method method = clazz.getMethod("setBirthDate", Date.class);

				method.invoke(_patientRemoteModel, birthDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSex() {
		return _sex;
	}

	@Override
	public void setSex(String sex) {
		_sex = sex;

		if (_patientRemoteModel != null) {
			try {
				Class<?> clazz = _patientRemoteModel.getClass();

				Method method = clazz.getMethod("setSex", String.class);

				method.invoke(_patientRemoteModel, sex);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAddress() {
		return _address;
	}

	@Override
	public void setAddress(String address) {
		_address = address;

		if (_patientRemoteModel != null) {
			try {
				Class<?> clazz = _patientRemoteModel.getClass();

				Method method = clazz.getMethod("setAddress", String.class);

				method.invoke(_patientRemoteModel, address);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCityName() {
		return _cityName;
	}

	@Override
	public void setCityName(String cityName) {
		_cityName = cityName;

		if (_patientRemoteModel != null) {
			try {
				Class<?> clazz = _patientRemoteModel.getClass();

				Method method = clazz.getMethod("setCityName", String.class);

				method.invoke(_patientRemoteModel, cityName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getPatientRemoteModel() {
		return _patientRemoteModel;
	}

	public void setPatientRemoteModel(BaseModel<?> patientRemoteModel) {
		_patientRemoteModel = patientRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _patientRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_patientRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PatientLocalServiceUtil.addPatient(this);
		}
		else {
			PatientLocalServiceUtil.updatePatient(this);
		}
	}

	@Override
	public Patient toEscapedModel() {
		return (Patient)ProxyUtil.newProxyInstance(Patient.class.getClassLoader(),
			new Class[] { Patient.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PatientClp clone = new PatientClp();

		clone.setPatientId(getPatientId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setConfirmingUserId(getConfirmingUserId());
		clone.setConfirmingUserName(getConfirmingUserName());
		clone.setIsConfirmed(getIsConfirmed());
		clone.setName(getName());
		clone.setSurname(getSurname());
		clone.setMiddleName(getMiddleName());
		clone.setPesel(getPesel());
		clone.setIdNumber(getIdNumber());
		clone.setIdImageFileEntryId(getIdImageFileEntryId());
		clone.setBirthDate(getBirthDate());
		clone.setSex(getSex());
		clone.setAddress(getAddress());
		clone.setCityName(getCityName());

		return clone;
	}

	@Override
	public int compareTo(Patient patient) {
		int value = 0;

		value = getSurname().compareToIgnoreCase(patient.getSurname());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PatientClp)) {
			return false;
		}

		PatientClp patient = (PatientClp)obj;

		long primaryKey = patient.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(41);

		sb.append("{patientId=");
		sb.append(getPatientId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", confirmingUserId=");
		sb.append(getConfirmingUserId());
		sb.append(", confirmingUserName=");
		sb.append(getConfirmingUserName());
		sb.append(", isConfirmed=");
		sb.append(getIsConfirmed());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", surname=");
		sb.append(getSurname());
		sb.append(", middleName=");
		sb.append(getMiddleName());
		sb.append(", pesel=");
		sb.append(getPesel());
		sb.append(", idNumber=");
		sb.append(getIdNumber());
		sb.append(", idImageFileEntryId=");
		sb.append(getIdImageFileEntryId());
		sb.append(", birthDate=");
		sb.append(getBirthDate());
		sb.append(", sex=");
		sb.append(getSex());
		sb.append(", address=");
		sb.append(getAddress());
		sb.append(", cityName=");
		sb.append(getCityName());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(64);

		sb.append("<model><model-name>");
		sb.append("salutem.patient.model.Patient");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>patientId</column-name><column-value><![CDATA[");
		sb.append(getPatientId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>confirmingUserId</column-name><column-value><![CDATA[");
		sb.append(getConfirmingUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>confirmingUserName</column-name><column-value><![CDATA[");
		sb.append(getConfirmingUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isConfirmed</column-name><column-value><![CDATA[");
		sb.append(getIsConfirmed());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>surname</column-name><column-value><![CDATA[");
		sb.append(getSurname());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>middleName</column-name><column-value><![CDATA[");
		sb.append(getMiddleName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>pesel</column-name><column-value><![CDATA[");
		sb.append(getPesel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>idNumber</column-name><column-value><![CDATA[");
		sb.append(getIdNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>idImageFileEntryId</column-name><column-value><![CDATA[");
		sb.append(getIdImageFileEntryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>birthDate</column-name><column-value><![CDATA[");
		sb.append(getBirthDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sex</column-name><column-value><![CDATA[");
		sb.append(getSex());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>address</column-name><column-value><![CDATA[");
		sb.append(getAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cityName</column-name><column-value><![CDATA[");
		sb.append(getCityName());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _patientId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _confirmingUserId;
	private String _confirmingUserUuid;
	private String _confirmingUserName;
	private boolean _isConfirmed;
	private String _name;
	private String _surname;
	private String _middleName;
	private String _pesel;
	private String _idNumber;
	private long _idImageFileEntryId;
	private Date _birthDate;
	private String _sex;
	private String _address;
	private String _cityName;
	private BaseModel<?> _patientRemoteModel;
	private Class<?> _clpSerializerClass = salutem.patient.service.ClpSerializer.class;
}