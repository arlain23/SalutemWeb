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

package salutem.visit.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import salutem.visit.service.ClassificationLocalServiceUtil;
import salutem.visit.service.ClassificationServiceUtil;
import salutem.visit.service.ClassificationSimilarityLocalServiceUtil;
import salutem.visit.service.ClassificationSimilarityServiceUtil;
import salutem.visit.service.ClpSerializer;
import salutem.visit.service.LocationLocalServiceUtil;
import salutem.visit.service.LocationServiceUtil;
import salutem.visit.service.RegressionLocalServiceUtil;
import salutem.visit.service.RegressionServiceUtil;
import salutem.visit.service.TimeLocalServiceUtil;
import salutem.visit.service.TimeServiceUtil;
import salutem.visit.service.VisitLocalServiceUtil;
import salutem.visit.service.VisitServiceUtil;
import salutem.visit.service.WeightMapLocalServiceUtil;
import salutem.visit.service.WeightMapServiceUtil;

/**
 * @author Aneta Andrzejewska
 */
public class ClpMessageListener extends BaseMessageListener {
	public static String getServletContextName() {
		return ClpSerializer.getServletContextName();
	}

	@Override
	protected void doReceive(Message message) throws Exception {
		String command = message.getString("command");
		String servletContextName = message.getString("servletContextName");

		if (command.equals("undeploy") &&
				servletContextName.equals(getServletContextName())) {
			ClassificationLocalServiceUtil.clearService();

			ClassificationServiceUtil.clearService();
			ClassificationSimilarityLocalServiceUtil.clearService();

			ClassificationSimilarityServiceUtil.clearService();
			LocationLocalServiceUtil.clearService();

			LocationServiceUtil.clearService();
			RegressionLocalServiceUtil.clearService();

			RegressionServiceUtil.clearService();
			TimeLocalServiceUtil.clearService();

			TimeServiceUtil.clearService();
			VisitLocalServiceUtil.clearService();

			VisitServiceUtil.clearService();
			WeightMapLocalServiceUtil.clearService();

			WeightMapServiceUtil.clearService();
		}
	}
}