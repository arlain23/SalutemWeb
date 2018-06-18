package salutem.patient.search;

import javax.portlet.PortletRequest;

import com.liferay.portal.kernel.dao.search.DisplayTerms;
import com.liferay.portal.kernel.util.ParamUtil;

public class PatientDisplayTerms extends DisplayTerms{
	private int eId;
	private String eName;
	public PatientDisplayTerms(PortletRequest portletRequest) {
		super(portletRequest);
		eId = ParamUtil.getInteger(portletRequest, "eId");
		eName = ParamUtil.getString(portletRequest, "eName");
	}
	public int geteId() {
		return eId;
	}
   public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
}
