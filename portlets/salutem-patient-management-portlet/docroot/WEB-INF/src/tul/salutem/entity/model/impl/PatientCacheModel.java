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

package tul.salutem.entity.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import tul.salutem.entity.model.Patient;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Patient in entity cache.
 *
 * @author Aneta Andrzejewska
 * @see Patient
 * @generated
 */
public class PatientCacheModel implements CacheModel<Patient>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

		sb.append("{patientId=");
		sb.append(patientId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", confirmingUserId=");
		sb.append(confirmingUserId);
		sb.append(", confirmingUserName=");
		sb.append(confirmingUserName);
		sb.append(", isConfirmed=");
		sb.append(isConfirmed);
		sb.append(", name=");
		sb.append(name);
		sb.append(", surname=");
		sb.append(surname);
		sb.append(", middleName=");
		sb.append(middleName);
		sb.append(", pesel=");
		sb.append(pesel);
		sb.append(", idNumber=");
		sb.append(idNumber);
		sb.append(", idImage=");
		sb.append(idImage);
		sb.append(", birthDate=");
		sb.append(birthDate);
		sb.append(", sex=");
		sb.append(sex);
		sb.append(", address=");
		sb.append(address);
		sb.append(", cityName=");
		sb.append(cityName);
		sb.append(", bloodType=");
		sb.append(bloodType);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Patient toEntityModel() {
		PatientImpl patientImpl = new PatientImpl();

		patientImpl.setPatientId(patientId);
		patientImpl.setGroupId(groupId);
		patientImpl.setCompanyId(companyId);
		patientImpl.setUserId(userId);

		if (userName == null) {
			patientImpl.setUserName(StringPool.BLANK);
		}
		else {
			patientImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			patientImpl.setCreateDate(null);
		}
		else {
			patientImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			patientImpl.setModifiedDate(null);
		}
		else {
			patientImpl.setModifiedDate(new Date(modifiedDate));
		}

		patientImpl.setConfirmingUserId(confirmingUserId);

		if (confirmingUserName == null) {
			patientImpl.setConfirmingUserName(StringPool.BLANK);
		}
		else {
			patientImpl.setConfirmingUserName(confirmingUserName);
		}

		patientImpl.setIsConfirmed(isConfirmed);

		if (name == null) {
			patientImpl.setName(StringPool.BLANK);
		}
		else {
			patientImpl.setName(name);
		}

		if (surname == null) {
			patientImpl.setSurname(StringPool.BLANK);
		}
		else {
			patientImpl.setSurname(surname);
		}

		if (middleName == null) {
			patientImpl.setMiddleName(StringPool.BLANK);
		}
		else {
			patientImpl.setMiddleName(middleName);
		}

		patientImpl.setPesel(pesel);

		if (idNumber == null) {
			patientImpl.setIdNumber(StringPool.BLANK);
		}
		else {
			patientImpl.setIdNumber(idNumber);
		}

		if (idImage == null) {
			patientImpl.setIdImage(StringPool.BLANK);
		}
		else {
			patientImpl.setIdImage(idImage);
		}

		if (birthDate == Long.MIN_VALUE) {
			patientImpl.setBirthDate(null);
		}
		else {
			patientImpl.setBirthDate(new Date(birthDate));
		}

		if (sex == null) {
			patientImpl.setSex(StringPool.BLANK);
		}
		else {
			patientImpl.setSex(sex);
		}

		if (address == null) {
			patientImpl.setAddress(StringPool.BLANK);
		}
		else {
			patientImpl.setAddress(address);
		}

		if (cityName == null) {
			patientImpl.setCityName(StringPool.BLANK);
		}
		else {
			patientImpl.setCityName(cityName);
		}

		if (bloodType == null) {
			patientImpl.setBloodType(StringPool.BLANK);
		}
		else {
			patientImpl.setBloodType(bloodType);
		}

		patientImpl.resetOriginalValues();

		return patientImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		patientId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		confirmingUserId = objectInput.readLong();
		confirmingUserName = objectInput.readUTF();
		isConfirmed = objectInput.readBoolean();
		name = objectInput.readUTF();
		surname = objectInput.readUTF();
		middleName = objectInput.readUTF();
		pesel = objectInput.readInt();
		idNumber = objectInput.readUTF();
		idImage = objectInput.readUTF();
		birthDate = objectInput.readLong();
		sex = objectInput.readUTF();
		address = objectInput.readUTF();
		cityName = objectInput.readUTF();
		bloodType = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(patientId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(confirmingUserId);

		if (confirmingUserName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(confirmingUserName);
		}

		objectOutput.writeBoolean(isConfirmed);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (surname == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(surname);
		}

		if (middleName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(middleName);
		}

		objectOutput.writeInt(pesel);

		if (idNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(idNumber);
		}

		if (idImage == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(idImage);
		}

		objectOutput.writeLong(birthDate);

		if (sex == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(sex);
		}

		if (address == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(address);
		}

		if (cityName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cityName);
		}

		if (bloodType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(bloodType);
		}
	}

	public long patientId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long confirmingUserId;
	public String confirmingUserName;
	public boolean isConfirmed;
	public String name;
	public String surname;
	public String middleName;
	public int pesel;
	public String idNumber;
	public String idImage;
	public long birthDate;
	public String sex;
	public String address;
	public String cityName;
	public String bloodType;
}