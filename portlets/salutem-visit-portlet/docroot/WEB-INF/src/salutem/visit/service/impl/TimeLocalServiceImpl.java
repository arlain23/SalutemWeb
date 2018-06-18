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

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import salutem.doctor.model.DoctorSchedule;
import salutem.doctor.service.DoctorScheduleLocalServiceUtil;
import salutem.visit.model.Time;
import salutem.visit.model.Visit;
import salutem.visit.service.TimeLocalServiceUtil;
import salutem.visit.service.VisitLocalServiceUtil;
import salutem.visit.service.base.TimeLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;

/**
 * The implementation of the time local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link salutem.visit.service.TimeLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Aneta Andrzejewska
 * @see salutem.visit.service.base.TimeLocalServiceBaseImpl
 * @see salutem.visit.service.TimeLocalServiceUtil
 */
public class TimeLocalServiceImpl extends TimeLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link salutem.visit.service.TimeLocalServiceUtil} to access the time local service.
	 */
	public List<Time> getTimeByDoctorIdAndPatientId(long doctorId, long patientId) {
		try {
			return timePersistence.findByDoctorIdAndPatientId(doctorId, patientId);
		} catch (SystemException e) {
			e.printStackTrace();
			return new ArrayList<Time>();
		}
	}
	public Time getFinishedByDoctorId (long doctorId) {
		try {
			return timePersistence.fetchByDoctorIdAndWasFinished_First(doctorId, false, null);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Time> getTimesByDoctorIdDayMonthAndYear(long doctorId, int visitDay, int visitMonth, int visitYear) {
		try {
			return timePersistence.findByDoctorIdAndDayMonthAndYear(doctorId, visitDay, visitMonth, visitYear);
		} catch (SystemException e) {
			e.printStackTrace();
			return new ArrayList<Time>();
		}
		
	}
	
	public JSONArray getPlannedVisits(long doctorId, int visitDay, int visitMonth, int visitYear, long patientId) throws SystemException {
		JSONArray result = JSONFactoryUtil.createJSONArray();
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, visitDay);
		calendar.set(Calendar.MONTH, visitMonth);
		calendar.set(Calendar.YEAR, visitYear);
		
		List<Visit> visits = VisitLocalServiceUtil.getVisitsByDoctrIdAndDate(calendar.getTime(), doctorId);
		if (visits.size() == 0) return result;
		// get doctor schedule
		int dayIndex = calendar.get(Calendar.DAY_OF_WEEK);
		dayIndex -= 2;
		if (dayIndex < 0) dayIndex = 6;
		
		List<DoctorSchedule> schedules = DoctorScheduleLocalServiceUtil.getSchedulesByDoctorIdAndDayIndex(doctorId, dayIndex);
				
		for (DoctorSchedule schedule : schedules) {
			int startTime = doubleScheduleToInt(schedule.getStartTime());
			//object types : visit, break 
			
			// first visit
			int previousVisitEndTime = startTime;
			for (Visit visit : visits) {
				int visitStartTime = visit.getStartTimeMinutes();
				if (visitStartTime > previousVisitEndTime) {
					int duration = visitStartTime - previousVisitEndTime;
					JSONObject obj = JSONFactoryUtil.createJSONObject();
					obj.put("type", "break");
					obj.put("startTime", previousVisitEndTime);
					obj.put("endTime", previousVisitEndTime + duration);
					obj.put("status", "break");
					obj.put("delayStatus", "break");
					obj.put("delay", 0);
					result.put(obj);
				}
				JSONObject obj = JSONFactoryUtil.createJSONObject();
				obj.put("type", "visit");
				obj.put("startTime", visitStartTime);
				obj.put("endTime", visitStartTime + visit.getDuration());
				
				//get status and delay
				String status = "pending";
				List<Time> patientTimes = timePersistence.findByDoctorIdAndPatientIdAndDayMonthAndYear(doctorId, visit.getPatientId(), 
						visitDay, visitMonth, visitYear);
				String delayStatus = "on-time";
				int delay = 0;
				if (patientTimes.size() > 0) {
					Time patientTime = patientTimes.get(0);
					int realStartTime = patientTime.getVisitTime();
					delay = realStartTime - visitStartTime;
					if (delay > 5) {
						delayStatus = "delayed";
					}
					
					if (patientTime.getWasFinished()) {
						status = "finished";
					} else {
						status = "happening";
					}
				}
				if (visit.getPatientId() == patientId) {
					status = "my-visit";
				}
				obj.put("status", status);
				obj.put("delayStatus", delayStatus);
				obj.put("delay", delay);
				result.put(obj);
				previousVisitEndTime = visit.getStartTimeMinutes() + visit.getDuration();
			}
		}
		return result;
	
	}
	
	public JSONArray getTimeQueueInfo(long doctorId, int visitDay, int visitMonth, int visitYear) {
		JSONArray result = JSONFactoryUtil.createJSONArray();
		List<Time> times = getTimesByDoctorIdDayMonthAndYear(doctorId, visitDay, visitMonth, visitYear);
		
		// get doctor schedule
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, visitDay);
		calendar.set(Calendar.MONTH, visitMonth);
		calendar.set(Calendar.YEAR, visitYear);
		int dayIndex = calendar.get(Calendar.DAY_OF_WEEK);
		dayIndex -= 2;
		if (dayIndex < 0) dayIndex = 6;
		
		List<DoctorSchedule> schedules = DoctorScheduleLocalServiceUtil.getSchedulesByDoctorIdAndDayIndex(doctorId, dayIndex);
		int timeIterator = 0;
		for (DoctorSchedule schedule : schedules) {
			int startTime = doubleScheduleToInt(schedule.getStartTime());
			int endTime = doubleScheduleToInt(schedule.getEndTime());
			
			//object types : visit, break 
			
			// first time
			int timeStartTime = times.get(0).getVisitTime();
			if (timeStartTime > startTime) {
				int duration = timeStartTime - startTime;
				JSONObject obj = JSONFactoryUtil.createJSONObject();
				obj.put("type", "break");
				obj.put("duration", duration);
				result.put(obj);
			}
			
			for (Time time : times) {
				
			}
			
		}
		
		
		return result;
	}
	public List<Time> getTimesByPatientId(long patientId) {
		try {
			return timePersistence.findByPatientId(patientId);
		} catch (SystemException e) {
			e.printStackTrace();
			return new ArrayList<Time>();
		}
		
	}
	public double getMeanTime(long patientId) {
		List<Time> times = getTimesByPatientId(patientId);
		double sum = 0;
		for (Time time : times) {
			sum += time.getVisitDuration();
		}
		return sum / times.size();
	}
	private int doubleScheduleToInt(double schedule) {
		return (int)(schedule * 60);
	}
}