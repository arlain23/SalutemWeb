package tul.salutem.portlet.test;

import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.ProcessAction;

import tul.salutem.model.Test;
import tul.salutem.service.TestLocalServiceUtil;

import com.liferay.util.bridges.mvc.MVCPortlet;

public class TestActions extends MVCPortlet{
	@ProcessAction(name = "getHello")
	public void getHello(ActionRequest request, ActionResponse response) throws Exception {
	}
	
	public void clearData(ActionRequest request, ActionResponse response) throws Exception {
		List<Test> allTests = TestLocalServiceUtil.getAllTests();
		for (Test test : allTests) {
			TestLocalServiceUtil.deleteTest(test);
		}
	}
}
