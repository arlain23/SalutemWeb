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
 * This class is a wrapper for {@link Classification}.
 * </p>
 *
 * @author Aneta Andrzejewska
 * @see Classification
 * @generated
 */
public class ClassificationWrapper implements Classification,
	ModelWrapper<Classification> {
	public ClassificationWrapper(Classification classification) {
		_classification = classification;
	}

	@Override
	public Class<?> getModelClass() {
		return Classification.class;
	}

	@Override
	public String getModelClassName() {
		return Classification.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("classificationId", getClassificationId());
		attributes.put("patientId", getPatientId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long classificationId = (Long)attributes.get("classificationId");

		if (classificationId != null) {
			setClassificationId(classificationId);
		}

		Long patientId = (Long)attributes.get("patientId");

		if (patientId != null) {
			setPatientId(patientId);
		}
	}

	/**
	* Returns the primary key of this classification.
	*
	* @return the primary key of this classification
	*/
	@Override
	public long getPrimaryKey() {
		return _classification.getPrimaryKey();
	}

	/**
	* Sets the primary key of this classification.
	*
	* @param primaryKey the primary key of this classification
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_classification.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the classification ID of this classification.
	*
	* @return the classification ID of this classification
	*/
	@Override
	public long getClassificationId() {
		return _classification.getClassificationId();
	}

	/**
	* Sets the classification ID of this classification.
	*
	* @param classificationId the classification ID of this classification
	*/
	@Override
	public void setClassificationId(long classificationId) {
		_classification.setClassificationId(classificationId);
	}

	/**
	* Returns the patient ID of this classification.
	*
	* @return the patient ID of this classification
	*/
	@Override
	public long getPatientId() {
		return _classification.getPatientId();
	}

	/**
	* Sets the patient ID of this classification.
	*
	* @param patientId the patient ID of this classification
	*/
	@Override
	public void setPatientId(long patientId) {
		_classification.setPatientId(patientId);
	}

	@Override
	public boolean isNew() {
		return _classification.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_classification.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _classification.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_classification.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _classification.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _classification.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_classification.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _classification.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_classification.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_classification.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_classification.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ClassificationWrapper((Classification)_classification.clone());
	}

	@Override
	public int compareTo(salutem.visit.model.Classification classification) {
		return _classification.compareTo(classification);
	}

	@Override
	public int hashCode() {
		return _classification.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<salutem.visit.model.Classification> toCacheModel() {
		return _classification.toCacheModel();
	}

	@Override
	public salutem.visit.model.Classification toEscapedModel() {
		return new ClassificationWrapper(_classification.toEscapedModel());
	}

	@Override
	public salutem.visit.model.Classification toUnescapedModel() {
		return new ClassificationWrapper(_classification.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _classification.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _classification.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_classification.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ClassificationWrapper)) {
			return false;
		}

		ClassificationWrapper classificationWrapper = (ClassificationWrapper)obj;

		if (Validator.equals(_classification,
					classificationWrapper._classification)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Classification getWrappedClassification() {
		return _classification;
	}

	@Override
	public Classification getWrappedModel() {
		return _classification;
	}

	@Override
	public void resetOriginalValues() {
		_classification.resetOriginalValues();
	}

	private Classification _classification;
}