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
 * This class is a wrapper for {@link WeightMap}.
 * </p>
 *
 * @author Aneta Andrzejewska
 * @see WeightMap
 * @generated
 */
public class WeightMapWrapper implements WeightMap, ModelWrapper<WeightMap> {
	public WeightMapWrapper(WeightMap weightMap) {
		_weightMap = weightMap;
	}

	@Override
	public Class<?> getModelClass() {
		return WeightMap.class;
	}

	@Override
	public String getModelClassName() {
		return WeightMap.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("weightMapId", getWeightMapId());
		attributes.put("regressionId", getRegressionId());
		attributes.put("key", getKey());
		attributes.put("value", getValue());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long weightMapId = (Long)attributes.get("weightMapId");

		if (weightMapId != null) {
			setWeightMapId(weightMapId);
		}

		Long regressionId = (Long)attributes.get("regressionId");

		if (regressionId != null) {
			setRegressionId(regressionId);
		}

		String key = (String)attributes.get("key");

		if (key != null) {
			setKey(key);
		}

		Double value = (Double)attributes.get("value");

		if (value != null) {
			setValue(value);
		}
	}

	/**
	* Returns the primary key of this weight map.
	*
	* @return the primary key of this weight map
	*/
	@Override
	public long getPrimaryKey() {
		return _weightMap.getPrimaryKey();
	}

	/**
	* Sets the primary key of this weight map.
	*
	* @param primaryKey the primary key of this weight map
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_weightMap.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the weight map ID of this weight map.
	*
	* @return the weight map ID of this weight map
	*/
	@Override
	public long getWeightMapId() {
		return _weightMap.getWeightMapId();
	}

	/**
	* Sets the weight map ID of this weight map.
	*
	* @param weightMapId the weight map ID of this weight map
	*/
	@Override
	public void setWeightMapId(long weightMapId) {
		_weightMap.setWeightMapId(weightMapId);
	}

	/**
	* Returns the regression ID of this weight map.
	*
	* @return the regression ID of this weight map
	*/
	@Override
	public long getRegressionId() {
		return _weightMap.getRegressionId();
	}

	/**
	* Sets the regression ID of this weight map.
	*
	* @param regressionId the regression ID of this weight map
	*/
	@Override
	public void setRegressionId(long regressionId) {
		_weightMap.setRegressionId(regressionId);
	}

	/**
	* Returns the key of this weight map.
	*
	* @return the key of this weight map
	*/
	@Override
	public java.lang.String getKey() {
		return _weightMap.getKey();
	}

	/**
	* Sets the key of this weight map.
	*
	* @param key the key of this weight map
	*/
	@Override
	public void setKey(java.lang.String key) {
		_weightMap.setKey(key);
	}

	/**
	* Returns the value of this weight map.
	*
	* @return the value of this weight map
	*/
	@Override
	public double getValue() {
		return _weightMap.getValue();
	}

	/**
	* Sets the value of this weight map.
	*
	* @param value the value of this weight map
	*/
	@Override
	public void setValue(double value) {
		_weightMap.setValue(value);
	}

	@Override
	public boolean isNew() {
		return _weightMap.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_weightMap.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _weightMap.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_weightMap.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _weightMap.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _weightMap.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_weightMap.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _weightMap.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_weightMap.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_weightMap.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_weightMap.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new WeightMapWrapper((WeightMap)_weightMap.clone());
	}

	@Override
	public int compareTo(salutem.visit.model.WeightMap weightMap) {
		return _weightMap.compareTo(weightMap);
	}

	@Override
	public int hashCode() {
		return _weightMap.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<salutem.visit.model.WeightMap> toCacheModel() {
		return _weightMap.toCacheModel();
	}

	@Override
	public salutem.visit.model.WeightMap toEscapedModel() {
		return new WeightMapWrapper(_weightMap.toEscapedModel());
	}

	@Override
	public salutem.visit.model.WeightMap toUnescapedModel() {
		return new WeightMapWrapper(_weightMap.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _weightMap.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _weightMap.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_weightMap.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof WeightMapWrapper)) {
			return false;
		}

		WeightMapWrapper weightMapWrapper = (WeightMapWrapper)obj;

		if (Validator.equals(_weightMap, weightMapWrapper._weightMap)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public WeightMap getWrappedWeightMap() {
		return _weightMap;
	}

	@Override
	public WeightMap getWrappedModel() {
		return _weightMap;
	}

	@Override
	public void resetOriginalValues() {
		_weightMap.resetOriginalValues();
	}

	private WeightMap _weightMap;
}