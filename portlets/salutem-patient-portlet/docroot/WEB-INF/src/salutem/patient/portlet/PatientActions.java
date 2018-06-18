package salutem.patient.portlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import salutem.patient.model.Patient;
import salutem.patient.service.PatientLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
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

public class PatientActions extends MVCPortlet{
	private static Log _log = LogFactoryUtil.getLog(PatientActions.class);
	
	
	public void sendEmail(ActionRequest request, ActionResponse response){
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		long patientId = Long.valueOf(request.getParameter("patientId"));
		String body = request.getParameter("body");
		String header = request.getParameter("header");
		try {
			PatientLocalServiceUtil.sendEmail(patientId, themeDisplay.getUserId(), body, header);
		} catch (PortalException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}
	}
	public void confirmPatient(ActionRequest request, ActionResponse response){
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		long groupId = themeDisplay.getScopeGroupId();
		long patientId = Long.valueOf(request.getParameter("patientId"));
		boolean success = PatientLocalServiceUtil.confirmPatient(patientId, themeDisplay.getUserId());
		_log.info((success) ? "success" : "failure");
	}
	
	
	public void savePatient(ActionRequest request, ActionResponse response){
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		long groupId = themeDisplay.getScopeGroupId();
		
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(request);
		long patientId = ParamUtil.getLong(uploadRequest, "patientId");
		long userId = ParamUtil.getLong(uploadRequest, "userId");
		User user = null;
		try {
			user = UserLocalServiceUtil.getUser(userId);
		} catch (PortalException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}
		String name = user.getFirstName();
		String middleName =  user.getMiddleName();
		String surname = user.getLastName();
		Date birthDate = ParamUtil.getDate(uploadRequest, "patientBirthDate", format);
		String pesel = ParamUtil.getString(uploadRequest, "patientPesel");
		String patientIdNumber = ParamUtil.getString(uploadRequest, "patientIdNumber");
		File patientIdImage = uploadRequest.getFile("patientIdImage");
		String patientSex = ParamUtil.getString(uploadRequest, "patientSex");
		String patientAddress = ParamUtil.getString(uploadRequest, "patientAddress");
		String patientCityName = ParamUtil.getString(uploadRequest, "patientCityName");
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@ " + patientIdImage);
		ServiceContext serviceContext;
		try {
			serviceContext = ServiceContextFactory
					.getInstance(DLFolder.class.getName(),
							request);
		
			// get folder
			String description = "";
			
			DLFolder folder = getDLFolder(groupId, 0,
					"id_images", description, serviceContext, userId);
			if (patientId == 0) {
				// upload new image
				try {
					FileEntry uploadedFile = fileUploadByDLApp(folder, patientIdImage, pesel, 
							userId, groupId, serviceContext);
					
					// create new patient
					PatientLocalServiceUtil.createNewPatient(groupId, user.getCompanyId(), userId, user.getScreenName() ,
							name, middleName, surname, pesel, patientIdNumber,uploadedFile.getFileEntryId(), patientAddress, birthDate, patientCityName, patientSex);
				} catch (PortalException e) {
					e.printStackTrace();
				} catch (SystemException e) {
					e.printStackTrace();
				}
				
			} else {
				try {
					Patient patient = PatientLocalServiceUtil.getPatient(patientId);
					long idImageFileEntryId = patient.getIdImageFileEntryId();
					if (patientIdImage.exists()) {
						if (idImageFileEntryId != 0) {
							DLFileEntryLocalServiceUtil.deleteDLFileEntry(idImageFileEntryId);
						}
						FileEntry uploadedFile = fileUploadByDLApp(folder, patientIdImage, pesel, 
								userId, groupId, serviceContext);
						idImageFileEntryId = uploadedFile.getFileEntryId();
					}
					
					
					PatientLocalServiceUtil.updatePatient(patientId, name, middleName, surname, pesel,
							patientIdNumber,idImageFileEntryId, patientAddress, birthDate, patientCityName, patientSex);
				} catch (PortalException e) {
					e.printStackTrace();
				} catch (SystemException e) {
					e.printStackTrace();
				}
			}
		} catch (PortalException e1) {
			e1.printStackTrace();
		} catch (SystemException e1) {
			e1.printStackTrace();
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
