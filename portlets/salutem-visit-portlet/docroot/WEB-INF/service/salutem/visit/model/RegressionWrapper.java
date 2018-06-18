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
 * This class is a wrapper for {@link Regression}.
 * </p>
 *
 * @author Aneta Andrzejewska
 * @see Regression
 * @generated
 */
public class RegressionWrapper implements Regression, ModelWrapper<Regression> {
	public RegressionWrapper(Regression regression) {
		_regression = regression;
	}

	@Override
	public Class<?> getModelClass() {
		return Regression.class;
	}

	@Override
	public String getModelClassName() {
		return Regression.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("regressionId", getRegressionId());
		attributes.put("patientId", getPatientId());
		attributes.put("doctorId", getDoctorId());
		attributes.put("minimumList", getMinimumList());
		attributes.put("maximumList", getMaximumList());
		attributes.put("chosenK", getChosenK());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long regressionId = (Long)attributes.get("regressionId");

		if (regressionId != null) {
			setRegressionId(regressionId);
		}

		Long patientId = (Long)attributes.get("patientId");

		if (patientId != null) {
			setPatientId(patientId);
		}

		Long doctorId = (Long)attributes.get("doctorId");

		if (doctorId != null) {
			setDoctorId(doctorId);
		}

		String minimumList = (String)attributes.get("minimumList");

		if (minimumList != null) {
			setMinimumList(minimumList);
		}

		String maximumList = (String)attributes.get("maximumList");

		if (maximumList != null) {
			setMaximumList(maximumList);
		}

		Integer chosenK = (Integer)attributes.get("chosenK");

		if (chosenK != null) {
			setChosenK(chosenK);
		}
	}

	/**
	* Returns the primary key of this regression.
	*
	* @return the primary key of this regression
	*/
	@Override
	public long getPrimaryKey() {
		return _regression.getPrimaryKey();
	}

	/**
	* Sets the primary key of this regression.
	*
	* @param primaryKey the primary key of this regression
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_regression.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the regression ID of this regression.
	*
	* @return the regression ID of this regression
	*/
	@Override
	public long getRegressionId() {
		return _regression.getRegressionId();
	}

	/**
	* Sets the regression ID of this regression.
	*
	* @param regressionId the regression ID of this regression
	*/
	@Override
	public void setRegressionId(long regressionId) {
		_regression.setRegressionId(regressionId);
	}

	/**
	* Returns the patient ID of this regression.
	*
	* @return the patient ID of this regression
	*/
	@Override
	public long getPatientId() {
		return _regression.getPatientId();
	}

	/**
	* Sets the patient ID of this regression.
	*
	* @param patientId the patient ID of this regression
	*/
	@Override
	public void setPatientId(long patientId) {
		_regression.setPatientId(patientId);
	}

	/**
	* Returns the doctor ID of this regression.
	*
	* @return the doctor ID of this regression
	*/
	@Override
	public long getDoctorId() {
		return _regression.getDoctorId();
	}

	/**
	* Sets the doctor ID of this regression.
	*
	* @param doctorId the doctor ID of this regression
	*/
	@Override
	public void setDoctorId(long doctorId) {
		_regression.setDoctorId(doctorId);
	}

	/**
	* Returns the minimum list of this regression.
	*
	* @return the minimum list of this regression
	*/
	@Override
	public java.lang.String getMinimumList() {
		return _regression.getMinimumList();
	}

	/**
	* Sets the minimum list of this regression.
	*
	* @param minimumList the minimum list of this regression
	*/
	@Override
	public void setMinimumList(java.lang.String minimumList) {
		_regression.setMinimumList(minimumList);
	}

	/**
	* Returns the maximum list of this regression.
	*
	* @return the maximum list of this regression
	*/
	@Override
	public java.lang.String getMaximumList() {
		return _regression.getMaximumList();
	}

	/**
	* Sets the maximum list of this regression.
	*
	* @param maximumList the maximum list of this regression
	*/
	@Override
	public void setMaximumList(java.lang.String maximumList) {
		_regression.setMaximumList(maximumList);
	}

	/**
	* Returns the chosen k of this regression.
	*
	* @return the chosen k of this regression
	*/
	@Override
	public int getChosenK() {
		return _regression.getChosenK();
	}

	/**
	* Sets the chosen k of this regression.
	*
	* @param chosenK the chosen k of this regression
	*/
	@Override
	public void setChosenK(int chosenK) {
		_regression.setChosenK(chosenK);
	}

	@Override
	public boolean isNew() {
		return _regression.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_regression.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _regression.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_regression.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _regression.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _regression.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_regression.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _regression.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_regression.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_regression.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_regression.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new RegressionWrapper((Regression)_regression.clone());
	}

	@Override
	public int compareTo(salutem.visit.model.Regression regression) {
		return _regression.compareTo(regression);
	}

	@Override
	public int hashCode() {
		return _regression.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<salutem.visit.model.Regression> toCacheModel() {
		return _regression.toCacheModel();
	}

	@Override
	public salutem.visit.model.Regression toEscapedModel() {
		return new RegressionWrapper(_regression.toEscapedModel());
	}

	@Override
	public salutem.visit.model.Regression toUnescapedModel() {
		return new RegressionWrapper(_regression.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _regression.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _regression.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_regression.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RegressionWrapper)) {
			return false;
		}

		RegressionWrapper regressionWrapper = (RegressionWrapper)obj;

		if (Validator.equals(_regression, regressionWrapper._regression)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Regression getWrappedRegression() {
		return _regression;
	}

	@Override
	public Regression getWrappedModel() {
		return _regression;
	}

	@Override
	public void resetOriginalValues() {
		_regression.resetOriginalValues();
	}

	private Regression _regression;
}