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

package salutem.visit.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import salutem.ai.kNNObj;
import salutem.visit.NoSuchClassificationException;
import salutem.visit.model.Classification;
import salutem.visit.model.ClassificationSimilarity;
import salutem.visit.service.base.ClassificationLocalServiceBaseImpl;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the classification local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link salutem.visit.service.ClassificationLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Aneta Andrzejewska
 * @see salutem.visit.service.base.ClassificationLocalServiceBaseImpl
 * @see salutem.visit.service.ClassificationLocalServiceUtil
 */
public class ClassificationLocalServiceImpl
	extends ClassificationLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link salutem.visit.service.ClassificationLocalServiceUtil} to access the classification local service.
	 */
	public Classification getClassificationByPatientId(long patientId) {
		try {
			return classificationPersistence.findByPatientId_First(patientId, null);
		} catch (NoSuchClassificationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public Classification addClassification(long patientId) {
		try {
			Classification classification = classificationPersistence.fetchByPatientId_First(patientId, null);
			long classificationId;
			if (classification == null) {
				classificationId = CounterLocalServiceUtil.increment(Classification.class.getName());
				classification = classificationPersistence.create(classificationId);
				classification.setPatientId(patientId);
				classificationPersistence.update(classification);
			} else {
				classificationId = classification.getClassificationId();
			}
			return classification;
		} catch (SystemException e) {
			e.printStackTrace();
			return null;
		}
	}
	public void removeSimilaritiesByClassificationId(long classificationId) {
		try {
			classificationSimilarityPersistence.removeByClassificationId(classificationId);
		} catch (SystemException e) {
			e.printStackTrace();
		}
	}
	public ClassificationSimilarity addClassificationSimilarity(
			long classificationId, long patientId, double similarityVal) throws SystemException {
		long similarityId = CounterLocalServiceUtil.increment(ClassificationSimilarity.class.getName());
		ClassificationSimilarity similarity = classificationSimilarityPersistence.create(similarityId);
		similarity.setClassificationId(classificationId);
		similarity.setPatientId(patientId);
		similarity.setSimilarity(similarityVal);
		similarity = classificationSimilarityPersistence.update(similarity);
		return similarity;
		
	}
	public List<ClassificationSimilarity> getSimilaritiesByClassificationId(long classificationId) {
		try {
			return classificationSimilarityPersistence.findByClassificationId(classificationId);
		} catch (SystemException e) {
			e.printStackTrace();
			return new ArrayList<ClassificationSimilarity>();
		}
		
	}
}