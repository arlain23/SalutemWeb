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

package salutem.visit.service.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import salutem.patient.service.PatientLocalServiceUtil;
import salutem.visit.model.Visit;
import salutem.visit.service.base.VisitLocalServiceBaseImpl;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Order;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the visit local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link salutem.visit.service.VisitLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Aneta Andrzejewska
 * @see salutem.visit.service.base.VisitLocalServiceBaseImpl
 * @see salutem.visit.service.VisitLocalServiceUtil
 */
public class VisitLocalServiceImpl extends VisitLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link salutem.visit.service.VisitLocalServiceUtil} to access the visit local service.
	 */
	
	public Visit addVisit(long groupId, long companyId, long doctorId, long patientId, 
			Date visitDate, int startTime, int duration) throws SystemException {
		long id = CounterLocalServiceUtil.increment(Visit.class.getName());
		Visit visit = visitPersistence.create(id);
		Date now = new Date();

		visit.setGroupId(groupId);
		visit.setCompanyId(companyId);
		visit.setCreateDate(now);
		visit.setModifiedDate(now);
		
		visit.setCancelled(false);
		visit.setDoctorId(doctorId);
		visit.setPatientId(patientId);
		visit.setStartTimeMinutes(startTime);
		visit.setDuration(duration);
		visit.setHasHappened(false);
		visit.setVisitDate(visitDate);
		
		super.updateVisit(visit);
		return visit;
	}
	@SuppressWarnings("unchecked")
	public List<Visit> getVisitsByDoctrIdPatientIdAndDate(Date date, long doctorId, long patientId) throws SystemException {
		Calendar fromDate = Calendar.getInstance();
		fromDate.setTime(date);
		fromDate.set(Calendar.HOUR_OF_DAY, 0);
		fromDate.set(Calendar.MINUTE, 0);
		fromDate.set(Calendar.SECOND, 0);
		fromDate.set(Calendar.MILLISECOND, 0);
		
		Calendar toDate = Calendar.getInstance();
		toDate.setTime(date);
		toDate.set(Calendar.HOUR_OF_DAY, 23);
		toDate.set(Calendar.MINUTE, 59);
		toDate.set(Calendar.SECOND, 59);
		
		Order defaultOrder = OrderFactoryUtil.asc("startTimeMinutes");
		
		DynamicQuery visitQuery = DynamicQueryFactoryUtil.forClass(Visit.class,getClassLoader())
				            .add(RestrictionsFactoryUtil.between("visitDate", fromDate.getTime(), toDate.getTime()))
				            .add(PropertyFactoryUtil.forName("doctorId").eq(doctorId))
				            .add(PropertyFactoryUtil.forName("patientId").eq(patientId))
				            .addOrder(defaultOrder);
		
		return super.dynamicQuery(visitQuery);
	}
	
	@SuppressWarnings("unchecked")
	public List<Visit> getVisitsByDoctrIdAndDate(Date date, long doctorId) throws SystemException {
		Calendar fromDate = Calendar.getInstance();
		fromDate.setTime(date);
		fromDate.set(Calendar.HOUR_OF_DAY, 0);
		fromDate.set(Calendar.MINUTE, 0);
		fromDate.set(Calendar.SECOND, 0);
		fromDate.set(Calendar.MILLISECOND, 0);
		
		Calendar toDate = Calendar.getInstance();
		toDate.setTime(date);
		toDate.set(Calendar.HOUR_OF_DAY, 23);
		toDate.set(Calendar.MINUTE, 59);
		toDate.set(Calendar.SECOND, 59);
		
		Order defaultOrder = OrderFactoryUtil.asc("startTimeMinutes");
		
		DynamicQuery visitQuery = DynamicQueryFactoryUtil.forClass(Visit.class,getClassLoader())
				            .add(RestrictionsFactoryUtil.between("visitDate", fromDate.getTime(), toDate.getTime()))
				            .add(PropertyFactoryUtil.forName("doctorId").eq(doctorId))
				            .addOrder(defaultOrder);
		
		return super.dynamicQuery(visitQuery);
	}
	
	@SuppressWarnings("unchecked")
	public List<Visit> getVisitsPatientIdAndDate(Date date, long patientId) throws SystemException {
		Calendar fromDate = Calendar.getInstance();
		fromDate.setTime(date);
		fromDate.set(Calendar.HOUR_OF_DAY, 0);
		fromDate.set(Calendar.MINUTE, 0);
		fromDate.set(Calendar.SECOND, 0);
		fromDate.set(Calendar.MILLISECOND, 0);
		
		Calendar toDate = Calendar.getInstance();
		toDate.setTime(date);
		toDate.set(Calendar.HOUR_OF_DAY, 23);
		toDate.set(Calendar.MINUTE, 59);
		toDate.set(Calendar.SECOND, 59);
		
		Order defaultOrder = OrderFactoryUtil.asc("startTimeMinutes");
		
		DynamicQuery visitQuery = DynamicQueryFactoryUtil.forClass(Visit.class,getClassLoader())
				            .add(RestrictionsFactoryUtil.between("visitDate", fromDate.getTime(), toDate.getTime()))
				            .add(PropertyFactoryUtil.forName("patientId").eq(patientId))
				            .addOrder(defaultOrder);
		
		return super.dynamicQuery(visitQuery);
	}
	public long getPatientId(long userId) {
		return PatientLocalServiceUtil.getPatientByUserId(userId).getPatientId();
	}
}