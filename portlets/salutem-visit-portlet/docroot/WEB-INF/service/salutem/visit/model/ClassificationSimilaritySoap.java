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
 * This class is used by SOAP remote services, specifically {@link salutem.visit.service.http.ClassificationSimilarityServiceSoap}.
 *
 * @author Aneta Andrzejewska
 * @see salutem.visit.service.http.ClassificationSimilarityServiceSoap
 * @generated
 */
public class ClassificationSimilaritySoap implements Serializable {
	public static ClassificationSimilaritySoap toSoapModel(
		ClassificationSimilarity model) {
		ClassificationSimilaritySoap soapModel = new ClassificationSimilaritySoap();

		soapModel.setSimilarityId(model.getSimilarityId());
		soapModel.setClassificationId(model.getClassificationId());
		soapModel.setPatientId(model.getPatientId());
		soapModel.setSimilarity(model.getSimilarity());

		return soapModel;
	}

	public static ClassificationSimilaritySoap[] toSoapModels(
		ClassificationSimilarity[] models) {
		ClassificationSimilaritySoap[] soapModels = new ClassificationSimilaritySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ClassificationSimilaritySoap[][] toSoapModels(
		ClassificationSimilarity[][] models) {
		ClassificationSimilaritySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ClassificationSimilaritySoap[models.length][models[0].length];
		}
		else {
			soapModels = new ClassificationSimilaritySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ClassificationSimilaritySoap[] toSoapModels(
		List<ClassificationSimilarity> models) {
		List<ClassificationSimilaritySoap> soapModels = new ArrayList<ClassificationSimilaritySoap>(models.size());

		for (ClassificationSimilarity model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ClassificationSimilaritySoap[soapModels.size()]);
	}

	public ClassificationSimilaritySoap() {
	}

	public long getPrimaryKey() {
		return _similarityId;
	}

	public void setPrimaryKey(long pk) {
		setSimilarityId(pk);
	}

	public long getSimilarityId() {
		return _similarityId;
	}

	public void setSimilarityId(long similarityId) {
		_similarityId = similarityId;
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

	public double getSimilarity() {
		return _similarity;
	}

	public void setSimilarity(double similarity) {
		_similarity = similarity;
	}

	private long _similarityId;
	private long _classificationId;
	private long _patientId;
	private double _similarity;
}