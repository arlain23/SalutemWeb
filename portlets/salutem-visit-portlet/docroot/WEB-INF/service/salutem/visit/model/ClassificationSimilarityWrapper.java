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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ClassificationSimilarity}.
 * </p>
 *
 * @author Aneta Andrzejewska
 * @see ClassificationSimilarity
 * @generated
 */
public class ClassificationSimilarityWrapper implements ClassificationSimilarity,
	ModelWrapper<ClassificationSimilarity> {
	public ClassificationSimilarityWrapper(
		ClassificationSimilarity classificationSimilarity) {
		_classificationSimilarity = classificationSimilarity;
	}

	@Override
	public Class<?> getModelClass() {
		return ClassificationSimilarity.class;
	}

	@Override
	public String getModelClassName() {
		return ClassificationSimilarity.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("similarityId", getSimilarityId());
		attributes.put("classificationId", getClassificationId());
		attributes.put("patientId", getPatientId());
		attributes.put("similarity", getSimilarity());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long similarityId = (Long)attributes.get("similarityId");

		if (similarityId != null) {
			setSimilarityId(similarityId);
		}

		Long classificationId = (Long)attributes.get("classificationId");

		if (classificationId != null) {
			setClassificationId(classificationId);
		}

		Long patientId = (Long)attributes.get("patientId");

		if (patientId != null) {
			setPatientId(patientId);
		}

		Double similarity = (Double)attributes.get("similarity");

		if (similarity != null) {
			setSimilarity(similarity);
		}
	}

	/**
	* Returns the primary key of this classification similarity.
	*
	* @return the primary key of this classification similarity
	*/
	@Override
	public long getPrimaryKey() {
		return _classificationSimilarity.getPrimaryKey();
	}

	/**
	* Sets the primary key of this classification similarity.
	*
	* @param primaryKey the primary key of this classification similarity
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_classificationSimilarity.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the similarity ID of this classification similarity.
	*
	* @return the similarity ID of this classification similarity
	*/
	@Override
	public long getSimilarityId() {
		return _classificationSimilarity.getSimilarityId();
	}

	/**
	* Sets the similarity ID of this classification similarity.
	*
	* @param similarityId the similarity ID of this classification similarity
	*/
	@Override
	public void setSimilarityId(long similarityId) {
		_classificationSimilarity.setSimilarityId(similarityId);
	}

	/**
	* Returns the classification ID of this classification similarity.
	*
	* @return the classification ID of this classification similarity
	*/
	@Override
	public long getClassificationId() {
		return _classificationSimilarity.getClassificationId();
	}

	/**
	* Sets the classification ID of this classification similarity.
	*
	* @param classificationId the classification ID of this classification similarity
	*/
	@Override
	public void setClassificationId(long classificationId) {
		_classificationSimilarity.setClassificationId(classificationId);
	}

	/**
	* Returns the patient ID of this classification similarity.
	*
	* @return the patient ID of this classification similarity
	*/
	@Override
	public long getPatientId() {
		return _classificationSimilarity.getPatientId();
	}

	/**
	* Sets the patient ID of this classification similarity.
	*
	* @param patientId the patient ID of this classification similarity
	*/
	@Override
	public void setPatientId(long patientId) {
		_classificationSimilarity.setPatientId(patientId);
	}

	/**
	* Returns the similarity of this classification similarity.
	*
	* @return the similarity of this classification similarity
	*/
	@Override
	public double getSimilarity() {
		return _classificationSimilarity.getSimilarity();
	}

	/**
	* Sets the similarity of this classification similarity.
	*
	* @param similarity the similarity of this classification similarity
	*/
	@Override
	public void setSimilarity(double similarity) {
		_classificationSimilarity.setSimilarity(similarity);
	}

	@Override
	public boolean isNew() {
		return _classificationSimilarity.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_classificationSimilarity.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _classificationSimilarity.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_classificationSimilarity.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _classificationSimilarity.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _classificationSimilarity.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_classificationSimilarity.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _classificationSimilarity.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_classificationSimilarity.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_classificationSimilarity.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_classificationSimilarity.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ClassificationSimilarityWrapper((ClassificationSimilarity)_classificationSimilarity.clone());
	}

	@Override
	public int compareTo(
		salutem.visit.model.ClassificationSimilarity classificationSimilarity) {
		return _classificationSimilarity.compareTo(classificationSimilarity);
	}

	@Override
	public int hashCode() {
		return _classificationSimilarity.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<salutem.visit.model.ClassificationSimilarity> toCacheModel() {
		return _classificationSimilarity.toCacheModel();
	}

	@Override
	public salutem.visit.model.ClassificationSimilarity toEscapedModel() {
		return new ClassificationSimilarityWrapper(_classificationSimilarity.toEscapedModel());
	}

	@Override
	public salutem.visit.model.ClassificationSimilarity toUnescapedModel() {
		return new ClassificationSimilarityWrapper(_classificationSimilarity.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _classificationSimilarity.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _classificationSimilarity.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_classificationSimilarity.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ClassificationSimilarityWrapper)) {
			return false;
		}

		ClassificationSimilarityWrapper classificationSimilarityWrapper = (ClassificationSimilarityWrapper)obj;

		if (Validator.equals(_classificationSimilarity,
					classificationSimilarityWrapper._classificationSimilarity)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ClassificationSimilarity getWrappedClassificationSimilarity() {
		return _classificationSimilarity;
	}

	@Override
	public ClassificationSimilarity getWrappedModel() {
		return _classificationSimilarity;
	}

	@Override
	public void resetOriginalValues() {
		_classificationSimilarity.resetOriginalValues();
	}

	private ClassificationSimilarity _classificationSimilarity;
}