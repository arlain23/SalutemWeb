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

package salutem.visit.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link salutem.visit.service.http.ClassificationServiceSoap}.
 *
 * @author Aneta Andrzejewska
 * @see salutem.visit.service.http.ClassificationServiceSoap
 * @generated
 */
public class ClassificationSoap implements Serializable {
	public static ClassificationSoap toSoapModel(Classification model) {
		ClassificationSoap soapModel = new ClassificationSoap();

		soapModel.setClassificationId(model.getClassificationId());
		soapModel.setPatientId(model.getPatientId());

		return soapModel;
	}

	public static ClassificationSoap[] toSoapModels(Classification[] models) {
		ClassificationSoap[] soapModels = new ClassificationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ClassificationSoap[][] toSoapModels(Classification[][] models) {
		ClassificationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ClassificationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ClassificationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ClassificationSoap[] toSoapModels(List<Classification> models) {
		List<ClassificationSoap> soapModels = new ArrayList<ClassificationSoap>(models.size());

		for (Classification model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ClassificationSoap[soapModels.size()]);
	}

	public ClassificationSoap() {
	}

	public long getPrimaryKey() {
		return _classificationId;
	}

	public void setPrimaryKey(long pk) {
		setClassificationId(pk);
	}

	public long getClassificationId() {
		return _classificationId;
	}

	public void setClassificationId(long classificationId) {
		_classificationId = classificationId;
	}

	public long getPatientId() {
		return _patientId;
	}

	public void setPatientId(long patientId) {
		_patientId = patientId;
	}

	private long _classificationId;
	private long _patientId;
}