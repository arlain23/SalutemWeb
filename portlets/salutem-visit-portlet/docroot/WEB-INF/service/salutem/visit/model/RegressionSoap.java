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
 * This class is used by SOAP remote services, specifically {@link salutem.visit.service.http.RegressionServiceSoap}.
 *
 * @author Aneta Andrzejewska
 * @see salutem.visit.service.http.RegressionServiceSoap
 * @generated
 */
public class RegressionSoap implements Serializable {
	public static RegressionSoap toSoapModel(Regression model) {
		RegressionSoap soapModel = new RegressionSoap();

		soapModel.setRegressionId(model.getRegressionId());
		soapModel.setPatientId(model.getPatientId());
		soapModel.setDoctorId(model.getDoctorId());
		soapModel.setMinimumList(model.getMinimumList());
		soapModel.setMaximumList(model.getMaximumList());
		soapModel.setChosenK(model.getChosenK());

		return soapModel;
	}

	public static RegressionSoap[] toSoapModels(Regression[] models) {
		RegressionSoap[] soapModels = new RegressionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RegressionSoap[][] toSoapModels(Regression[][] models) {
		RegressionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new RegressionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RegressionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RegressionSoap[] toSoapModels(List<Regression> models) {
		List<RegressionSoap> soapModels = new ArrayList<RegressionSoap>(models.size());

		for (Regression model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RegressionSoap[soapModels.size()]);
	}

	public RegressionSoap() {
	}

	public long getPrimaryKey() {
		return _regressionId;
	}

	public void setPrimaryKey(long pk) {
		setRegressionId(pk);
	}

	public long getRegressionId() {
		return _regressionId;
	}

	public void setRegressionId(long regressionId) {
		_regressionId = regressionId;
	}

	public long getPatientId() {
		return _patientId;
	}

	public void setPatientId(long patientId) {
		_patientId = patientId;
	}

	public long getDoctorId() {
		return _doctorId;
	}

	public void setDoctorId(long doctorId) {
		_doctorId = doctorId;
	}

	public String getMinimumList() {
		return _minimumList;
	}

	public void setMinimumList(String minimumList) {
		_minimumList = minimumList;
	}

	public String getMaximumList() {
		return _maximumList;
	}

	public void setMaximumList(String maximumList) {
		_maximumList = maximumList;
	}

	public int getChosenK() {
		return _chosenK;
	}

	public void setChosenK(int chosenK) {
		_chosenK = chosenK;
	}

	private long _regressionId;
	private long _patientId;
	private long _doctorId;
	private String _minimumList;
	private String _maximumList;
	private int _chosenK;
}