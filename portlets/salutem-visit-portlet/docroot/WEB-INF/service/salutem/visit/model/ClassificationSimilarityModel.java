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

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the ClassificationSimilarity service. Represents a row in the &quot;visit_ClassificationSimilarity&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link salutem.visit.model.impl.ClassificationSimilarityModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link salutem.visit.model.impl.ClassificationSimilarityImpl}.
 * </p>
 *
 * @author Aneta Andrzejewska
 * @see ClassificationSimilarity
 * @see salutem.visit.model.impl.ClassificationSimilarityImpl
 * @see salutem.visit.model.impl.ClassificationSimilarityModelImpl
 * @generated
 */
public interface ClassificationSimilarityModel extends BaseModel<ClassificationSimilarity> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a classification similarity model instance should use the {@link ClassificationSimilarity} interface instead.
	 */

	/**
	 * Returns the primary key of this classification similarity.
	 *
	 * @return the primary key of this classification similarity
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this classification similarity.
	 *
	 * @param primaryKey the primary key of this classification similarity
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the similarity ID of this classification similarity.
	 *
	 * @return the similarity ID of this classification similarity
	 */
	public long getSimilarityId();

	/**
	 * Sets the similarity ID of this classification similarity.
	 *
	 * @param similarityId the similarity ID of this classification similarity
	 */
	public void setSimilarityId(long similarityId);

	/**
	 * Returns the classification ID of this classification similarity.
	 *
	 * @return the classification ID of this classification similarity
	 */
	public long getClassificationId();

	/**
	 * Sets the classification ID of this classification similarity.
	 *
	 * @param classificationId the classification ID of this classification similarity
	 */
	public void setClassificationId(long classificationId);

	/**
	 * Returns the patient ID of this classification similarity.
	 *
	 * @return the patient ID of this classification similarity
	 */
	public long getPatientId();

	/**
	 * Sets the patient ID of this classification similarity.
	 *
	 * @param patientId the patient ID of this classification similarity
	 */
	public void setPatientId(long patientId);

	/**
	 * Returns the similarity of this classification similarity.
	 *
	 * @return the similarity of this classification similarity
	 */
	public double getSimilarity();

	/**
	 * Sets the similarity of this classification similarity.
	 *
	 * @param similarity the similarity of this classification similarity
	 */
	public void setSimilarity(double similarity);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		salutem.visit.model.ClassificationSimilarity classificationSimilarity);

	@Override
	public int hashCode();

	@Override
	public CacheModel<salutem.visit.model.ClassificationSimilarity> toCacheModel();

	@Override
	public salutem.visit.model.ClassificationSimilarity toEscapedModel();

	@Override
	public salutem.visit.model.ClassificationSimilarity toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}