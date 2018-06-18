package salutem.doctor.search;

import java.util.Collections;
import java.util.List;

import salutem.doctor.model.Doctor;
import salutem.doctor.service.ClpSerializer;
import salutem.doctor.service.DoctorLocalServiceUtil;

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

public class DoctorSearchHelper {

	
	
	public static List<Doctor> getDoctor(String dName, String dSurName, boolean isAndOperator) throws SystemException {
		ClassLoader classLoader = (ClassLoader) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(), "portletClassLoader");
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Doctor.class);
		Junction junction = null;
		List<Doctor> patientList = Collections.EMPTY_LIST;
		if (isAndOperator) {
			junction = RestrictionsFactoryUtil.conjunction();
		} else {
			junction = RestrictionsFactoryUtil.disjunction();
		}
		if (!Validator.isBlank(dName)) {
			junction.add(PropertyFactoryUtil.forName("name").like(StringPool.PERCENT + HtmlUtil.escape(dName) + StringPool.PERCENT));
		}
		if (!Validator.isBlank(dSurName)) {
			junction.add(PropertyFactoryUtil.forName("surname").like(StringPool.PERCENT + HtmlUtil.escape(dSurName) + StringPool.PERCENT));
		}
		dynamicQuery.add(junction);
		try {
			patientList = DoctorLocalServiceUtil.dynamicQuery(dynamicQuery);
		} catch (final SystemException e) {
		}
		return patientList;

	}
	public static List<Doctor> getDoctorByKeyword(String keywords) throws SystemException {
		List<Doctor> patientList = Collections.EMPTY_LIST;
		final ClassLoader classLoader = (ClassLoader) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(), "portletClassLoader");
		Junction junction = RestrictionsFactoryUtil.disjunction();
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Doctor.class);
		junction.add(PropertyFactoryUtil.forName("name").like(StringPool.PERCENT + HtmlUtil.escape(keywords) + StringPool.PERCENT));
		junction.add(PropertyFactoryUtil.forName("surname").like(StringPool.PERCENT + HtmlUtil.escape(keywords) + StringPool.PERCENT));
		dynamicQuery.add(junction);
		try {
			patientList = DoctorLocalServiceUtil.dynamicQuery(dynamicQuery);
		} catch (final SystemException e) {
		}
		return patientList;
	}
	
}