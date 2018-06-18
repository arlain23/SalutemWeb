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

import salutem.doctor.model.DoctorSchedule;
import salutem.doctor.service.base.DoctorScheduleLocalServiceBaseImpl;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;

/**
 * The implementation of the doctor schedule local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link salutem.doctor.service.DoctorScheduleLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Aneta Andrzejewska
 * @see salutem.doctor.service.base.DoctorScheduleLocalServiceBaseImpl
 * @see salutem.doctor.service.DoctorScheduleLocalServiceUtil
 */
public class DoctorScheduleLocalServiceImpl
	extends DoctorScheduleLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link salutem.doctor.service.DoctorScheduleLocalServiceUtil} to access the doctor schedule local service.
	 */
	
	public JSONArray getSchedulesArrayByDoctorId(long doctorId) {
		JSONArray result = JSONFactoryUtil.createJSONArray();
		for (int dayIndex = 0; dayIndex < 7; dayIndex++) {
			List<DoctorSchedule> daySchedules = this.getSchedulesByDoctorIdAndDayIndex(doctorId, dayIndex);
			if (daySchedules.size() > 0) {
				for (int dayScheduleIterator = 0; dayScheduleIterator < daySchedules.size(); dayScheduleIterator++) {
					JSONObject dayObj = JSONFactoryUtil.createJSONObject();
					dayObj.put("day", dayIndex);
					JSONArray periods = JSONFactoryUtil.createJSONArray();
					for (int scheduleIndex = 0 ; scheduleIndex < daySchedules.size(); scheduleIndex++) {
						JSONObject singlePeriod = JSONFactoryUtil.createJSONObject();
						String[] scheduleTime = this.getScheduleTime(daySchedules.get(dayScheduleIterator).getScheduleId());
						singlePeriod.put("start", scheduleTime[0]);
						singlePeriod.put("end", scheduleTime[1]);
						periods.put(singlePeriod);
						System.out.println(dayIndex + " " + scheduleTime[0] + "->"  + scheduleTime[1]);
					}
					dayObj.put("periods", periods);
					result.put(dayObj);
				}
			}
		}
		return result;
	}
	public List<DoctorSchedule> getSchedulesByDoctorId(long doctorId) {
		try {
			return doctorSchedulePersistence.findByDoctorId(doctorId);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return new ArrayList<DoctorSchedule>();
	}
	
	public List<DoctorSchedule> getSchedulesByDoctorIdAndDayIndex(long doctorId, int dayIndex) {
		try {
			return doctorSchedulePersistence.findByDoctorIdAndDayOfWeek(doctorId, dayIndex);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return new ArrayList<DoctorSchedule>();
	}
	public void deleteAllByDoctorId(long doctorId) {
		try {
			doctorSchedulePersistence.removeByDoctorId(doctorId);
		} catch (SystemException e) {
			e.printStackTrace();
		}
	}
	public List<DoctorSchedule> getSchedulesByDayIndex(int dayIndex) {
		try {
			return doctorSchedulePersistence.findByDayOfWeek(dayIndex);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ArrayList<DoctorSchedule>();
	}
	public String[] getScheduleTime(long scheduleId) {
		String[] result = new String[2];
		try {
			DoctorSchedule doctorSchedule = super.getDoctorSchedule(scheduleId);
			double startTime = doctorSchedule.getStartTime();
			int firstPart = (int)startTime;
			int secondPart = (int) Math.round((startTime - firstPart) * 60);
			
			String firstPartString = String.valueOf(firstPart);
			if (firstPart < 10) {
				firstPartString = "0" + firstPart;
			} 
			String secondPartString = String.valueOf(secondPart);
			if (secondPart < 10) {
				secondPartString = "0" + secondPart;
			} 
			
			String startTimeString = firstPartString + ":" + secondPartString; 
			
			double endTime = doctorSchedule.getEndTime();
			firstPart = (int)endTime;
			firstPartString = String.valueOf(firstPart);
			if (firstPart < 10) {
				firstPartString = "0" + firstPart;
			} 
			secondPart = (int) Math.round((endTime - firstPart) * 60);
			secondPartString = String.valueOf(secondPart);
			if (secondPart < 10) {
				secondPartString = "0" + secondPart;
			} 
			String endTimeString = firstPartString + ":" + secondPartString; 
			result[0] = startTimeString;
			result[1] = endTimeString;
			
		} catch (PortalException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return result;
	}
	public DoctorSchedule addDoctorSchedule(long doctorId, int dayOfWeek, String startTimeString, String endTimeString)
			throws SystemException {
		
		String[] startTimeArray = startTimeString.split(":");
		double startTime = Double.valueOf(startTimeArray[0]);
		double minutes = Double.valueOf(startTimeArray[1]);
		minutes /= 60;
		startTime += minutes;
		
		String[] endTimeArray = endTimeString.split(":");
		double endTime = Double.valueOf(endTimeArray[0]);
		double endMinutes = Double.valueOf(endTimeArray[1]);
		endMinutes /= 60;
		endTime += endMinutes;
		
		long scheduleId = CounterLocalServiceUtil.increment(DoctorSchedule.class.getName());
		DoctorSchedule schedule = doctorSchedulePersistence.create(scheduleId);
		Date now = new Date();
		schedule.setCreateDate(now);
		schedule.setModifiedDate(now);
		schedule.setDoctorId(doctorId);
		schedule.setDayOfWeek(dayOfWeek);
		schedule.setStartTime(startTime);
		schedule.setEndTime(endTime);
		
		System.out.println("Adding " + doctorId + ": " + dayOfWeek + " " + startTime + "->" + endTime);
		doctorSchedulePersistence.update(schedule);
		return schedule;
		
	}
}