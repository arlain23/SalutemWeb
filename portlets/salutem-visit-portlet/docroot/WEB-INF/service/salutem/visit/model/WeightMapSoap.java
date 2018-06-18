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
 * This class is used by SOAP remote services, specifically {@link salutem.visit.service.http.WeightMapServiceSoap}.
 *
 * @author Aneta Andrzejewska
 * @see salutem.visit.service.http.WeightMapServiceSoap
 * @generated
 */
public class WeightMapSoap implements Serializable {
	public static WeightMapSoap toSoapModel(WeightMap model) {
		WeightMapSoap soapModel = new WeightMapSoap();

		soapModel.setWeightMapId(model.getWeightMapId());
		soapModel.setRegressionId(model.getRegressionId());
		soapModel.setKey(model.getKey());
		soapModel.setValue(model.getValue());

		return soapModel;
	}

	public static WeightMapSoap[] toSoapModels(WeightMap[] models) {
		WeightMapSoap[] soapModels = new WeightMapSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static WeightMapSoap[][] toSoapModels(WeightMap[][] models) {
		WeightMapSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new WeightMapSoap[models.length][models[0].length];
		}
		else {
			soapModels = new WeightMapSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static WeightMapSoap[] toSoapModels(List<WeightMap> models) {
		List<WeightMapSoap> soapModels = new ArrayList<WeightMapSoap>(models.size());

		for (WeightMap model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new WeightMapSoap[soapModels.size()]);
	}

	public WeightMapSoap() {
	}

	public long getPrimaryKey() {
		return _weightMapId;
	}

	public void setPrimaryKey(long pk) {
		setWeightMapId(pk);
	}

	public long getWeightMapId() {
		return _weightMapId;
	}

	public void setWeightMapId(long weightMapId) {
		_weightMapId = weightMapId;
	}

	public long getRegressionId() {
		return _regressionId;
	}

	public void setRegressionId(long regressionId) {
		_regressionId = regressionId;
	}

	public String getKey() {
		return _key;
	}

	public void setKey(String key) {
		_key = key;
	}

	public double getValue() {
		return _value;
	}

	public void setValue(double value) {
		_value = value;
	}

	private long _weightMapId;
	private long _regressionId;
	private String _key;
	private double _value;
}