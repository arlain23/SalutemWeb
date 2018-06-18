package salutem.visit.portlet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.servlet.http.HttpServletResponse;

import salutem.ai.VisitDurationUtil;
import salutem.doctor.model.Doctor;
import salutem.doctor.model.DoctorSchedule;
import salutem.doctor.service.DoctorLocalServiceUtil;
import salutem.doctor.service.DoctorScheduleLocalServiceUtil;
import salutem.visit.model.Location;
import salutem.visit.model.Visit;
import salutem.visit.service.LocationLocalServiceUtil;
import salutem.visit.service.VisitLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class VisitActions extends MVCPortlet{
	
	
	public void saveTrack(ActionRequest request, ActionResponse response) {
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		long groupId = themeDisplay.getScopeGroupId();
		
		UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(request);
		long patientId = ParamUtil.getLong(uploadRequest, "patientId");
		File googleTrack = uploadRequest.getFile("patientGoogleTrack");
		try {
			InputStream stream = new FileInputStream(googleTrack);
			BufferedReader streamReader = new BufferedReader(new InputStreamReader(stream, "UTF-8"));
		    StringBuilder responseStrBuilder = new StringBuilder();
	
		    String inputStr;
		    while ((inputStr = streamReader.readLine()) != null)
		        responseStrBuilder.append(inputStr);
	
		    JSONObject jsonObject = JSONFactoryUtil.createJSONObject(responseStrBuilder.toString());
		    JSONArray locationArray = jsonObject.getJSONArray("locations");
		    for (int i = 0; i < locationArray.length(); i++) {
		    	JSONObject singleObj = locationArray.getJSONObject(i);
		    	long timeStamp = singleObj.getLong("timestampMs");
		    	Calendar calendar = Calendar.getInstance();
		    	calendar.setTimeInMillis(timeStamp);
		    	double lat = (singleObj.getLong("latitudeE7") / 10000000.0);
		    	double lon = (singleObj.getLong("longitudeE7") / 10000000.0);
		    	lat = (double)Math.round(lat * 1000d) / 1000d;
    			lon = (double)Math.round(lon * 1000d) / 1000d;
		    	
		    	int day = calendar.get(Calendar.DAY_OF_MONTH);
		    	int month = calendar.get(Calendar.MONTH);
		    	int year = calendar.get(Calendar.YEAR);
		    	
		    	List<Location> locations = LocationLocalServiceUtil.findByPatientIdAndYearAndMonthAndLatAndLon(patientId, year, month, day, lat, lon);
		    	if (locations.size() == 0) {
		    		//add new location
		    		try {
						LocationLocalServiceUtil.addLocation(patientId, year, month, day, lat, lon);
					} catch (SystemException e) {
						e.printStackTrace();
					}
		    	}
		    }
		    streamReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void viewTrack(ActionRequest request, ActionResponse response) {
		UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(request);
		long patientId = ParamUtil.getLong(request, "patientId");
		boolean hasDate = ParamUtil.getBoolean(uploadRequest, "hasDate");
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = ParamUtil.getDate(uploadRequest, "patientId",format);
		List<Location> allLocations;
		if (hasDate) {
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			allLocations = LocationLocalServiceUtil.findByPatientIdAndYearAndMonth(patientId,
					calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH));
		} else {
			allLocations = LocationLocalServiceUtil.findByPatientId(patientId);
		}
		JSONArray locationArray = JSONFactoryUtil.createJSONArray();
		for (Location loc : allLocations) {
			JSONObject singleLoc = JSONFactoryUtil.createJSONObject();
			String dateString = loc.getDay() + "." + (loc.getMonth()+1) + loc.getYear();
			singleLoc.put("date", dateString);
			singleLoc.put("lat", loc.getLat());
			singleLoc.put("lon", loc.getLon());
			locationArray.put(singleLoc);
		}
		    
		try {
			sendResponse(response, locationArray);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void saveVisit(ActionRequest request, ActionResponse response) {
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		long groupId = themeDisplay.getScopeGroupId();
		long companyId = themeDisplay.getCompanyId();
		DateFormat format = new SimpleDateFormat("dd.MM.yyyy");
		UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(request);
		long patientId = ParamUtil.getLong(request, "patientId");
		long doctorId = ParamUtil.getLong(request, "doctorId");
		Date visitDate = ParamUtil.getDate(uploadRequest, "chosenDate", format);
		int duration = ParamUtil.getInteger(uploadRequest, "duration");
		int startTime = ParamUtil.getInteger(uploadRequest, "startTimeSelect");
		String redirect = ParamUtil.getString(uploadRequest, "redirect");
		
		
		System.out.println(patientId + " " + doctorId + " " + visitDate + " " + duration);
		System.out.println("start itme " + startTime);
		
		try {
			VisitLocalServiceUtil.addVisit(groupId, companyId, doctorId, patientId,
					visitDate, startTime, duration);
			try {
				request.getPortletSession().setAttribute("wasSaved", "true");
				response.sendRedirect(redirect);
			} catch (IOException e) {
				e.printStackTrace();
			} 
		} catch (SystemException e1) {
			e1.printStackTrace();
		}
	}
	public void changeTime(ActionRequest request, ActionResponse response) {
		UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(request);
		long patientID = ParamUtil.getLong(request, "patientID");
		long doctorID = ParamUtil.getLong(request, "doctorID");
		int minutes = ParamUtil.getInteger(request, "minutes");
		DateFormat format = new SimpleDateFormat("dd.MM.yyyy");
		Date visitDate = ParamUtil.getDate(uploadRequest, "visitDate", format);
		
		System.out.println(patientID + " " + doctorID + " " + visitDate + " " + minutes);
		JSONObject doctorScheduleObj = JSONFactoryUtil.createJSONObject();

		//get predicted time
		int predictedTime = VisitDurationUtil.getVisitDuration(doctorID, patientID, visitDate, minutes);
		
		//put data
		doctorScheduleObj.put("duration", predictedTime);
		JSONArray result = JSONFactoryUtil.createJSONArray();
		result.put(doctorScheduleObj);
		try {
			sendResponse(response, result);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	@SuppressWarnings("unused")
	public void chooseDate (ActionRequest request, ActionResponse response) throws IOException, SystemException, PortalException{
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		long groupId = themeDisplay.getScopeGroupId();
		
		DateFormat format = new SimpleDateFormat("dd.MM.yyyy");
		UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(request);
		long patientID = ParamUtil.getLong(request, "patientID");
		Date visitDate = ParamUtil.getDate(uploadRequest, "visitDate", format);
		
		Calendar visitCalendar = Calendar.getInstance();
		visitCalendar.setTime(visitDate);
		int dayIndex = visitCalendar.get(Calendar.DAY_OF_WEEK);
		dayIndex -= 2;
		if (dayIndex < 0) dayIndex = 6;
		System.out.println(visitDate);
		System.out.println("day index " + dayIndex);
		
		JSONArray result = JSONFactoryUtil.createJSONArray();
		// get doctor schedules available on that day
		List<DoctorSchedule> availableDoctorSchedules = 
				DoctorScheduleLocalServiceUtil.getSchedulesByDayIndex(dayIndex);
		
		Set<Long> usedDoctorIds = new HashSet<Long>();
		for (DoctorSchedule schedule : availableDoctorSchedules) {
			long doctorID = schedule.getDoctorId();
			if (!usedDoctorIds.contains(doctorID)) {
				Doctor doctor = DoctorLocalServiceUtil.getDoctor(doctorID);
				String doctorName = doctor.getName() + " " + doctor.getSurname();
				usedDoctorIds.add(doctorID);

				JSONObject doctorScheduleObj = JSONFactoryUtil.createJSONObject();

				//get predicted time
				int predictedTime = VisitDurationUtil.getMeanVisitDuration(doctorID, patientID);
				
				//put data
				doctorScheduleObj.put("doctorID", doctorID);
				doctorScheduleObj.put("doctorName", doctorName);
				doctorScheduleObj.put("duration", predictedTime);
				
				// get available times
				List<DoctorSchedule> availableSchedules = DoctorScheduleLocalServiceUtil.
						getSchedulesByDoctorIdAndDayIndex(doctorID, dayIndex);
				// get planned visits ordered by start time
				List<Visit> plannedVisits = VisitLocalServiceUtil.getVisitsByDoctrIdAndDate
						(visitDate, doctorID);

				System.out.println("planned visits " + plannedVisits.size());
				int visitIterator = 0;
				JSONArray freeVisitsArray = JSONFactoryUtil.createJSONArray();
				
				for (DoctorSchedule curSchedule : availableSchedules) {
					int startMinutes = (int)(curSchedule.getStartTime() * 60);
					int endMinutes = (int)(curSchedule.getEndTime() * 60);
					
					int periodStartTime = startMinutes;
					int periodEndTime = endMinutes;
					
					System.out.println("processing " + periodStartTime + " -> " + periodEndTime);
					JSONObject freeSchedule = JSONFactoryUtil.createJSONObject();
					
					boolean putLast = true;
					for (int i = visitIterator; i < plannedVisits.size(); i++) {
						Visit currentVisit = plannedVisits.get(i);
						
						if (currentVisit.getStartTimeMinutes() >= endMinutes) {
							System.out.println("breaking");
							periodEndTime = endMinutes;
							break;
						}
						periodEndTime = currentVisit.getStartTimeMinutes();
						int periodLength = periodEndTime - periodStartTime;
						if (predictedTime <= periodLength) {
							System.out.println(predictedTime + "->" + periodLength);
							//add a period
							freeSchedule.put("startTime", formatTime(periodStartTime));
							freeSchedule.put("startTimeInt", periodStartTime);
							freeSchedule.put("endTime", formatTime(periodEndTime));
							freeSchedule.put("endTimeInt", periodEndTime);
							System.out.println("putting obj");
							freeVisitsArray.put(freeSchedule);
						} else {
							if(visitIterator !=0) {
								System.out.println(predictedTime + "!->" + periodLength);
								putLast = false;
							}

						}
						// create new period
						freeSchedule = JSONFactoryUtil.createJSONObject();
						periodStartTime = periodEndTime + currentVisit.getDuration();
						
						visitIterator++;
					}
					freeSchedule.put("startTime", formatTime(periodStartTime));
					freeSchedule.put("startTimeInt", periodStartTime);
					freeSchedule.put("endTime", formatTime(endMinutes));
					freeSchedule.put("endTimeInt", endMinutes);
					if (putLast) {
						freeVisitsArray.put(freeSchedule);
					}
				}
				
				doctorScheduleObj.put("visits", freeVisitsArray);
				result.put(doctorScheduleObj);
			}
			
		}
		
		// get all visits for that day
		sendResponse(response, result);
		
	}
	public static String formatTime(int time) {
		int hours = time / 60;
		int minutes = time % 60;
		String hoursS = ((hours < 10) ? ("0" + hours) : ("" + hours));
		String minutesS = ((minutes < 10) ? ("0" + minutes) : ("" + minutes));
		return hoursS + ":" + minutesS;
	}
	private void sendResponse(ActionResponse response, JSONArray array)
			throws IOException {
		HttpServletResponse httpResp = PortalUtil.getHttpServletResponse(response);
		httpResp.setCharacterEncoding("UTF-8");
		httpResp.setContentType("application/json;charset=UTF-8");
		httpResp.setHeader("Cache-Control", "no-cache");
		httpResp.getWriter().print(array);
		httpResp.flushBuffer();
	}
	private void sendResponse(ActionResponse response, JSONObject object)
			throws IOException {
		HttpServletResponse httpResp = PortalUtil.getHttpServletResponse(response);
		httpResp.setCharacterEncoding("UTF-8");
		httpResp.setContentType("application/json;charset=UTF-8");
		httpResp.setHeader("Cache-Control", "no-cache");
		httpResp.getWriter().print(object);
		httpResp.flushBuffer();
	}
}
