package salutem.patient.search;

import java.util.ArrayList;
import java.util.List;

import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;

import salutem.patient.model.Patient;

import com.liferay.portal.kernel.dao.search.SearchContainer;

public class PatientSearchContainer extends SearchContainer<Patient>{
	public static final String	EMPTY_RESULTS_MESSAGE	= "No Record Found";
	public static final int DEFAULT_DELTA = 5;
	static List<String>	headerNames	= new ArrayList<String>();
	static {
		headerNames.add("eId");
		headerNames.add("eName");
	}
	public PatientSearchContainer(PortletRequest portletRequest, PortletURL iteratorURL) {
		super(portletRequest, new PatientDisplayTerms(portletRequest), new PatientDisplayTerms(portletRequest), DEFAULT_CUR_PARAM, DEFAULT_DELTA, iteratorURL,
				headerNames, EMPTY_RESULTS_MESSAGE);
		PatientDisplayTerms displayTerms = (PatientDisplayTerms) getDisplayTerms();
		iteratorURL.setParameter("eId", ""+displayTerms.geteId());
		iteratorURL.setParameter("eName", displayTerms.geteName());
	}
}
