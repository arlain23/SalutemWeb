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

package salutem.doctor.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import salutem.doctor.NoSuchDoctorException;
import salutem.doctor.model.Doctor;
import salutem.doctor.service.base.DoctorLocalServiceBaseImpl;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.Role;
import com.liferay.portal.model.User;
import com.liferay.portal.service.RoleLocalServiceUtil;
import com.liferay.portal.service.UserLocalServiceUtil;

/**
 * The implementation of the doctor local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link salutem.doctor.service.DoctorLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Aneta Andrzejewska
 * @see salutem.doctor.service.base.DoctorLocalServiceBaseImpl
 * @see salutem.doctor.service.DoctorLocalServiceUtil
 */
public class DoctorLocalServiceImpl extends DoctorLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link salutem.doctor.service.DoctorLocalServiceUtil} to access the doctor local service.
	 */
	
	public List<Doctor> getAllDoctors() {
		try {
			return doctorPersistence.findAll();
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return new ArrayList<Doctor>();
		
	}
	public List<Doctor> getAllDoctorsByGroupId(long groupId) {
		try {
			return doctorPersistence.findByGroupId(groupId);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return new ArrayList<Doctor>();
	}
	
	public List<User> getAllUsersNotSalutemDoctors(long groupId, long companyId) {
		List<User> result = new ArrayList<User>();
		try {
			Role doctorsRole = RoleLocalServiceUtil.getRole(companyId, "Doctor");
			List<User> doctorsUsers = UserLocalServiceUtil.getRoleUsers(doctorsRole.getRoleId());
			for (User doctorUser : doctorsUsers) {
				if (!existByUserId(doctorUser.getUserId(), groupId)){
					result.add(doctorUser);
				}
			}
		} catch (PortalException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return result;
		
	}
	public Doctor getDoctorByUserID(long userId, long groupId) {
		try {
			return doctorPersistence.findByUserIdAndGroupId_First(userId, groupId, null);
		} catch (NoSuchDoctorException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return null;
	}
	public boolean existByUserId(long userId, long groupId) {
		try {
			Doctor doctor = doctorPersistence.fetchByUserIdAndGroupId_First(userId, groupId, null);
			if (doctor != null) {
				return true;
			}
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return false;
	}
	public Doctor addDoctor(long groupId, long companyId, long userId, String userName,
			String firstName,String middleName, String surname,  long imageId) throws SystemException {
		long id = CounterLocalServiceUtil.increment(Doctor.class.getName());
		Doctor doctor = doctorPersistence.create(id);
		Date now = new Date();
		doctor.setCompanyId(companyId);
		doctor.setGroupId(groupId);
		doctor.setCreateDate(now);
		doctor.setModifiedDate(now);
		
		doctor.setImageId(imageId);
		doctor.setName(firstName);
		doctor.setMiddleName(middleName);
		doctor.setSurname(surname);
		doctor.setSpecialization("general-practitioner");
		doctor.setUserName(userName);
		doctor.setUserId(userId);
		
		doctorPersistence.update(doctor);
		return doctor;
	}
	public Doctor updateDoctor(long doctorId, long imageId) throws PortalException, SystemException {
		Doctor doctor = super.getDoctor(doctorId);
		doctor.setImageId(imageId);
		doctorPersistence.update(doctor);
		return doctor;
	}
}