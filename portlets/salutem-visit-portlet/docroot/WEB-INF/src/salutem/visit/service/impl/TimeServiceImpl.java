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

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import salutem.visit.model.Time;
import salutem.visit.model.Visit;
import salutem.visit.portlet.VisitActions;
import salutem.visit.service.VisitLocalServiceUtil;
import salutem.visit.service.base.TimeServiceBaseImpl;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.ac.AccessControlled;

/**
 * The implementation of the time remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link salutem.visit.service.TimeService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Aneta Andrzejewska
 * @see salutem.visit.service.base.TimeServiceBaseImpl
 * @see salutem.visit.service.TimeServiceUtil
 */
public class TimeServiceImpl extends TimeServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link salutem.visit.service.TimeServiceUtil} to access the time remote service.
	 */
	@AccessControlled(guestAccessEnabled=true)
	public String registerEntrance(long doctorId, long patientId, String date, long groupId) throws SystemException {
		//finish all previous visits
		List<Time> nonFinishedVisits = timePersistence.findByDoctorIdAndWasFinished(doctorId, false);
		for (Time time : nonFinishedVisits) {
			time.setWasFinished(true);
			timePersistence.update(time);
		}
		try {
			Date visitDate = new SimpleDateFormat("dd.MM.yyyy_hh.mm").parse(date);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(visitDate);
			int visitDay = calendar.get(Calendar.DAY_OF_MONTH);
			int visitMonth = calendar.get(Calendar.MONTH);
			int visitYear = calendar.get(Calendar.YEAR);
			int hours = calendar.get(Calendar.HOUR_OF_DAY);
			int minutes = calendar.get(Calendar.MINUTE);
			
			String uuid = UUID.randomUUID().toString();
			
			long timeId = CounterLocalServiceUtil.increment(Time.class.getName());
			Time visit = timePersistence.create(timeId);
			visit.setEntryUuid(uuid);
			visit.setDoctorId(doctorId);
			visit.setPatientId(patientId);
			visit.setVisitDuration(0);
			visit.setWasFinished(false);
			visit.setVisitDay(visitDay);
			visit.setVisitMonth(visitMonth);
			visit.setVisitYear(visitYear);
			visit.setGroupId(groupId);
			int visitTime = hours * 60 + minutes;
			visit.setVisitTime(visitTime);
			//find visit 
			List<Visit> visits = VisitLocalServiceUtil.getVisitsByDoctrIdPatientIdAndDate(visitDate, doctorId, patientId);
			if (visits.size() > 0) {
				visit.setVisitId(visits.get(0).getVisitId());
				visit.setWasPlanned(true);
			} else {
				visit.setVisitId(-1);
				visit.setWasPlanned(false);
			}
			timePersistence.update(visit);
			
			return uuid;
		} catch (ParseException e) {
			e.printStackTrace();
		} 
		
		return "error";
	}
	
	@AccessControlled(guestAccessEnabled=true)
	public boolean registerExit(String date, String uuid) {
		Date visitDate;
		try {
			visitDate = new SimpleDateFormat("dd.MM.yyyy_hh.mm").parse(date);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(visitDate);
			
			int hours = calendar.get(Calendar.HOUR_OF_DAY);
			int minutes = calendar.get(Calendar.MINUTE);
			
			List<Time> registeredVisits = timePersistence.findByUUID(uuid);
			if (registeredVisits.size() == 0) {
				return false;
			}
			Time theVisit = registeredVisits.get(0);
			int startTime = theVisit.getVisitTime();
			int endTime  = hours * 60 + minutes;
			
			int visitDuration = endTime - startTime;
			
			theVisit.setVisitDuration(visitDuration);
			theVisit.setWasFinished(true);
			
			timePersistence.update(theVisit);
			
			return true;
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return false;
	}
	
}