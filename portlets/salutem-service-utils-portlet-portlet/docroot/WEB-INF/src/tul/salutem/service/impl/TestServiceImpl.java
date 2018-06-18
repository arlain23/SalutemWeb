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

package tul.salutem.service.impl;

import java.util.Date;
import java.util.List;

import tul.salutem.model.Test;
import tul.salutem.service.base.TestServiceBaseImpl;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.Company;
import com.liferay.portal.model.Role;
import com.liferay.portal.model.User;
import com.liferay.portal.security.ac.AccessControlled;
import com.liferay.portal.service.CompanyLocalServiceUtil;
import com.liferay.portal.service.UserLocalServiceUtil;

/**
 * The implementation of the test remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link tul.salutem.service.TestService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Aneta Andrzejewska
 * @see tul.salutem.service.base.TestServiceBaseImpl
 * @see tul.salutem.service.TestServiceUtil
 */
public class TestServiceImpl extends TestServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link tul.salutem.service.TestServiceUtil} to access the test remote service.
	 */
	Log _log = LogFactoryUtil.getLog(TestServiceImpl.class);
	@AccessControlled(guestAccessEnabled=true)
	public boolean sayHello(String msg) {
		long testId;
		try {
			testId = CounterLocalServiceUtil.increment(Test.class.getName());
			Test test = testLocalService.createTest(testId);
			test.setUsername(msg);
			test.setCreateDate(new Date());
			testPersistence.update(test);
			return true;
		} catch (SystemException e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	@AccessControlled(guestAccessEnabled=true)
	public JSONArray checkUserAuthentication(String username, String password) {
		JSONArray result = JSONFactoryUtil.createJSONArray();
		int status = -2;
		List<Company> companies;
		List<Role> roles = null;
		User user = null;
		try {
			companies = CompanyLocalServiceUtil.getCompanies();
			
			Company defaultCompany = companies.get(0);
			long companyId = defaultCompany.getCompanyId();
			user = UserLocalServiceUtil.getUserByScreenName(companyId, username);
			status =  UserLocalServiceUtil.authenticateByUserId(companyId, user.getUserId(), password, 
					null, null, null);
			roles = user.getRoles();
		} catch (SystemException e) {
			_log.error(e);
			e.printStackTrace();
		} catch (PortalException e) {
			_log.error(e);
			e.printStackTrace();
		}
		JSONObject successFlag = JSONFactoryUtil.createJSONObject();
		successFlag.put("responseCode", status);
		if (status == 1) {
			JSONArray roleArray = JSONFactoryUtil.createJSONArray();
			JSONObject roleObject;
			for (Role role : roles) {
				roleObject = JSONFactoryUtil.createJSONObject();
				roleObject.put("roleId", role.getRoleId());
				roleObject.put("roleName", role.getName());
				roleArray.put(roleObject);
			}
			JSONObject userObject = JSONFactoryUtil.createJSONObject();
			userObject.put("userId", user.getUserId());
			userObject.put("firstName", user.getFirstName());
			userObject.put("middleName", user.getMiddleName());
			userObject.put("lastName", user.getLastName());
			userObject.put("email", user.getEmailAddress());
			try {
				userObject.put("isMale", user.getMale());
			} catch (PortalException e) {
				e.printStackTrace();
			} catch (SystemException e) {
				e.printStackTrace();
			}	
			try {
				userObject.put("birthDate", user.getBirthday());
			} catch (PortalException e) {
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			result.put(roleArray);
			result.put(userObject);
		}
		return result;
	}
}