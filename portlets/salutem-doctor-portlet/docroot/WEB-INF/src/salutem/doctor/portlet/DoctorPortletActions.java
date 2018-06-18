package salutem.doctor.portlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import salutem.doctor.model.Doctor;
import salutem.doctor.model.DoctorSchedule;
import salutem.doctor.service.DoctorLocalServiceUtil;
import salutem.doctor.service.DoctorScheduleLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.model.Role;
import com.liferay.portal.model.RoleConstants;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ResourcePermissionLocalServiceUtil;
import com.liferay.portal.service.RoleLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.documentlibrary.model.DLFolder;
import com.liferay.portlet.documentlibrary.service.DLAppServiceUtil;
import com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil;
import com.liferay.portlet.documentlibrary.service.DLFolderLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class DoctorPortletActions extends MVCPortlet{
	
	private static Log _log = LogFactoryUtil.getLog(DoctorPortletActions.class);
	
	public void editDoctor(ActionRequest request, ActionResponse response){
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		long groupId = themeDisplay.getScopeGroupId();
		long companyId = themeDisplay.getCompanyId();
		long requestUserId = themeDisplay.getUserId();
		
		long doctorId = Long.valueOf(request.getParameter("doctorId"));
		Map<String, String[]> amp = request.getParameterMap();
		String jsonSchedule = request.getParameter("jsonSchedule");
		System.out.println("JSON " + jsonSchedule);
		
		UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(request);
		File doctorImage = uploadRequest.getFile("doctorImage");
		ServiceContext serviceContext;
		Doctor edditedDoctor = null;
		
		DLFolder folder = null;
		try {
			serviceContext = ServiceContextFactory
					.getInstance(DLFolder.class.getName(),
							request);
			// get folder
			String description = "";
			
			folder = getDLFolder(groupId, 0,
					"doctor_images", description, serviceContext, requestUserId);
		} catch (PortalException e1) {
			e1.printStackTrace();
			return;
		} catch (SystemException e1) {
			e1.printStackTrace();
			return;
		}
		
		if (doctorId == 0) {
			//new doctor
			long userId = ParamUtil.getLong(uploadRequest, "userSelect");
			
			User user = null;
			try {
				user = UserLocalServiceUtil.getUser(userId);
				String name = user.getFirstName();
				String middleName =  user.getMiddleName();
				String surname = user.getLastName();
				
				String fullName = name + "_" + middleName + "_" + surname;
				// upload new image
				FileEntry uploadedFile = fileUploadByDLApp(folder, doctorImage, fullName, 
						requestUserId, groupId, serviceContext);
				
				edditedDoctor = DoctorLocalServiceUtil.addDoctor(groupId, companyId, userId, user.getScreenName(),
						name, middleName, surname, uploadedFile.getFileEntryId());
				doctorId = edditedDoctor.getDoctorId();
			} catch (PortalException e) {
				e.printStackTrace();
			} catch (SystemException e) {
				e.printStackTrace();
			}
			
		} else {
			//update doctor
			try {
				Doctor doctor = DoctorLocalServiceUtil.getDoctor(doctorId);
				long idImageFileEntryId = doctor.getImageId();
				if (doctorImage.exists()) {
					if (idImageFileEntryId != 0) {
						DLFileEntryLocalServiceUtil.deleteDLFileEntry(idImageFileEntryId);
					}
					String fullName = doctor.getName() + "_" + doctor.getMiddleName() + "_" + doctor.getSurname();
					FileEntry uploadedFile = fileUploadByDLApp(folder, doctorImage, fullName, 
							requestUserId, groupId, serviceContext);
					idImageFileEntryId = uploadedFile.getFileEntryId();
					edditedDoctor = DoctorLocalServiceUtil.updateDoctor(doctorId, idImageFileEntryId);
				}
			} catch (PortalException e) {
				e.printStackTrace();
			} catch (SystemException e) {
				e.printStackTrace();
			}
		}
		//add schedule

		try {
			DoctorScheduleLocalServiceUtil.deleteAllByDoctorId(doctorId);
			JSONArray scheduleArray = JSONFactoryUtil.createJSONArray(jsonSchedule);
			for (int i = 0; i < scheduleArray.length(); i++) {
				JSONObject singleScheduleObj = scheduleArray.getJSONObject(i);
				int dayIndex = singleScheduleObj.getInt("day");
				JSONArray periods = singleScheduleObj.getJSONArray("periods");
				for (int j = 0; j < periods.length(); j++) {
					JSONObject singlePeriodObj = periods.getJSONObject(j);
					String startTime = singlePeriodObj.getString("start");
					String endTime = singlePeriodObj.getString("end");
					System.out.println(dayIndex + ": " + startTime + "->" + endTime);
					
					System.out.println(doctorId);
					try {
						DoctorScheduleLocalServiceUtil.addDoctorSchedule(doctorId, dayIndex, startTime, endTime);
					} catch (SystemException e) {
						e.printStackTrace();
					}
				}
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}
	private FileEntry fileUploadByDLApp(DLFolder dlFolder, File file, String fileName, long userId, long groupId, ServiceContext serviceContext) {
	    fileName = fileName + getFileExtension(file);
		boolean fileExists = file.exists();
	    FileEntry fileEntry = null;
	    if (fileExists) {
			long repositoryId = groupId;
		 	String mimeType = MimeTypesUtil.getContentType(file);
			String title = fileName;
			String description = "";
			String changeLog = "";
			try {
		    	InputStream is = new FileInputStream( file );
		    	
		    	fileEntry = DLAppServiceUtil.addFileEntry(repositoryId, dlFolder.getFolderId(), fileName, mimeType, 
			    			title, description, changeLog, is, file.length(), serviceContext);
		    		
			} catch (Exception e) {
				_log.error(e);
		    }
	    } else {
	    	_log.error("File not found: " + file.getAbsolutePath());
	    }
		return fileEntry;
	}
	
	@SuppressWarnings("unchecked")
	private DLFolder getDLFolder(long groupId, long parentFolderId, String folderName, String description, ServiceContext serviceContext, long userId) {
		DynamicQuery query = DynamicQueryFactoryUtil.forClass(DLFolder.class)
				.add(PropertyFactoryUtil.forName("name").eq(folderName))
				.add(PropertyFactoryUtil.forName("parentFolderId").eq(parentFolderId));
		List<DLFolder> dlFolders;
		try {
			dlFolders = DLFolderLocalServiceUtil.dynamicQuery(query);
			if (dlFolders.size() == 0) {
				return createDLFolder(groupId, parentFolderId, folderName, description, serviceContext, userId);
			} else {
				return dlFolders.get(0);
			}
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return null;
	}
	private DLFolder createDLFolder(long groupId, long parentFolderId, String folderName, String description, ServiceContext serviceContext, long userId) {
		boolean mountPoint = false;  // mountPoint which is a boolean specifying whether the folder is a facade for mounting a third-party repository
		boolean hidden = false; // true if you want to hidden the folder 
		try {
			DLFolder dlFolder =  DLFolderLocalServiceUtil.addFolder(userId, groupId, groupId, mountPoint, parentFolderId, folderName, description, hidden, serviceContext);
			setFolderPermissions(dlFolder);
			return dlFolder;
		} catch (PortalException e1) {
			e1.printStackTrace();
		} catch (SystemException e1) {
			e1.printStackTrace();
		}
		return null;
	}
	public static void setFolderPermissions(DLFolder folder) {
		try {
		Role guestRole = RoleLocalServiceUtil.getRole(folder.getCompanyId(), RoleConstants.GUEST);

		ResourcePermissionLocalServiceUtil.setResourcePermissions(folder.getCompanyId(),
				DLFolder.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, String.valueOf(folder.getFolderId()), 
				guestRole.getRoleId(), new String[]{"VIEW"});
		} catch (SystemException e) {
			e.printStackTrace();
		} catch (PortalException e) {
			e.printStackTrace();
		}
	}
	private String getFileExtension(File file) {
	    String name = file.getName();
	    try {
	        return name.substring(name.lastIndexOf("."));
	    } catch (Exception e) {
	        return "";
	    }
	}
}
