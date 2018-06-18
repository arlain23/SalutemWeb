package salutem.patient.search;

import java.util.Collections;
import java.util.List;

import salutem.patient.model.Patient;
import salutem.patient.service.ClpSerializer;
import salutem.patient.service.PatientLocalServiceUtil;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Junction;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

public class PatientSearchHelper {

	
	
	public static List<Patient> getPatient(String pPesel, String pName, String pSurName, boolean isAndOperator) throws SystemException {
		ClassLoader classLoader = (ClassLoader) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(), "portletClassLoader");
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Patient.class);
		Junction junction = null;
		List<Patient> patientList = Collections.EMPTY_LIST;
		if (isAndOperator) {
			junction = RestrictionsFactoryUtil.conjunction();
		} else {
			junction = RestrictionsFactoryUtil.disjunction();
		}
		
		if (!Validator.isBlank(pPesel)) {
			System.out.println(pPesel);
			junction.add(PropertyFactoryUtil.forName("pesel").like(StringPool.PERCENT + HtmlUtil.escape(pPesel) + StringPool.PERCENT));
		}
		if (!Validator.isBlank(pName)) {
			System.out.println(pName);
			junction.add(PropertyFactoryUtil.forName("name").like(StringPool.PERCENT + HtmlUtil.escape(pName) + StringPool.PERCENT));
		}
		if (!Validator.isBlank(pSurName)) {
			System.out.println(pSurName);
			junction.add(PropertyFactoryUtil.forName("surname").like(StringPool.PERCENT + HtmlUtil.escape(pSurName) + StringPool.PERCENT));
		}
		dynamicQuery.add(junction);
		try {
			patientList = PatientLocalServiceUtil.dynamicQuery(dynamicQuery);
		} catch (final SystemException e) {
		}
		return patientList;

	}
	public static List<Patient> getPatientByKeyword(String keywords) throws SystemException {
		List<Patient> patientList = Collections.EMPTY_LIST;
		final ClassLoader classLoader = (ClassLoader) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(), "portletClassLoader");
		Junction junction = RestrictionsFactoryUtil.disjunction();
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Patient.class);
		junction.add(PropertyFactoryUtil.forName("pesel").like(StringPool.PERCENT + HtmlUtil.escape(keywords) + StringPool.PERCENT));
		junction.add(PropertyFactoryUtil.forName("name").like(StringPool.PERCENT + HtmlUtil.escape(keywords) + StringPool.PERCENT));
		junction.add(PropertyFactoryUtil.forName("surname").like(StringPool.PERCENT + HtmlUtil.escape(keywords) + StringPool.PERCENT));
		dynamicQuery.add(junction);
		try {
			patientList = PatientLocalServiceUtil.dynamicQuery(dynamicQuery);
		} catch (final SystemException e) {
		}
		return patientList;
	}
	
	
	public static List<Patient>getPatient(PatientDisplayTerms displayTerms,int start,int end) throws SystemException{
        List<Patient> patientList = getPatientData(displayTerms.isAdvancedSearch(), displayTerms.isAndOperator(), displayTerms.geteId(), displayTerms.geteName(), displayTerms.getKeywords());
        return ListUtil.subList(patientList, start , end) ;
	}
	public static int getTotalPatientCount(PatientDisplayTerms displayTerms,int start,int end) throws SystemException{
	       return getPatientData(displayTerms.isAdvancedSearch(), displayTerms.isAndOperator(), displayTerms.geteId(), displayTerms.geteName(), displayTerms.getKeywords()).size();
		}
	
	public static List<Patient>getPatientData(boolean isAdvancedSearch,boolean isAndOperator,int eid,String eName,String keywords) throws SystemException {
		List<Patient> patientList = Collections.EMPTY_LIST;
      
		if((Validator.isBlank(keywords)) && (!isAdvancedSearch)){// No search
			patientList = PatientLocalServiceUtil.getPatients(0, PatientLocalServiceUtil.getPatientsCount());
		}
		else{
			ClassLoader classLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),"portletClassLoader");
			DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Patient.class);
			Junction junction = null;
			 if(isAdvancedSearch){// Advance Search
				  if(isAndOperator){
					  System.out.println("All means And");
					  junction = RestrictionsFactoryUtil.conjunction();
				  }else{
					  System.out.println("Any means OR");
					  junction = RestrictionsFactoryUtil.disjunction();
				  }
				  if(!Validator.isBlank(eName)){
				  junction.add(PropertyFactoryUtil.forName("emp.eName").like("%"+eName+"%"));
				  }
				  
			  }else{// Normal Search
				  junction = RestrictionsFactoryUtil.disjunction();
				  if(Validator.isDigit(keywords)){
					  junction.add(PropertyFactoryUtil.forName("emp.eId").eq(Integer.valueOf(keywords)));
				  }
				  junction.add(PropertyFactoryUtil.forName("emp.eName").like("%"+keywords+"%"));
			  }
              dynamicQuery.add(junction);
			  patientList =  PatientLocalServiceUtil.dynamicQuery(dynamicQuery);
		}
          return patientList;
	}
}