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
import java.util.HashMap;
import java.util.List;

import salutem.visit.model.Regression;
import salutem.visit.model.WeightMap;
import salutem.visit.service.base.RegressionLocalServiceBaseImpl;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the regression local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link salutem.visit.service.RegressionLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Aneta Andrzejewska
 * @see salutem.visit.service.base.RegressionLocalServiceBaseImpl
 * @see salutem.visit.service.RegressionLocalServiceUtil
 */
public class RegressionLocalServiceImpl extends RegressionLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link salutem.visit.service.RegressionLocalServiceUtil} to access the regression local service.
	 */
	public Regression getRegression(long patientId, long doctorId) {
		try {
			return regressionPersistence.fetchByPatientIdAndDoctorId_First(patientId, doctorId, null);
		} catch (SystemException e) {
			e.printStackTrace();
			return null;
		}
		
	}
	public List<WeightMap> getWeightMaps(long regressionId) {
		try {
			return weightMapPersistence.findByRegressionId(regressionId);
		} catch (SystemException e) {
			e.printStackTrace();
			return new ArrayList<WeightMap>();
		}
	}
	public Regression addRegressionWeights(long patientId, long doctorId, List<Double> minList, List<Double> maxList, HashMap<List<Integer>, Double> finalPolynomial, int chosenK ) throws SystemException {
		Regression regression = regressionPersistence.fetchByPatientIdAndDoctorId_First(patientId, doctorId, null);
		StringBuilder minSb = new StringBuilder();
		for (Double weight : minList) {
			minSb.append(weight);
			minSb.append(",");
		}
		
		StringBuilder maxSb = new StringBuilder();
		for (Double weight : maxList) {
			maxSb.append(weight);
			maxSb.append(",");
		}
		
		
		if (regression == null) {
			long id = CounterLocalServiceUtil.increment(Regression.class.getName());
			regression = regressionPersistence.create(id);
			regression.setDoctorId(doctorId);
			regression.setPatientId(patientId);
		} 
		regression.setMaximumList(maxSb.toString());
		regression.setMinimumList(minSb.toString());
		regression.setChosenK(chosenK);
		Regression regressionObj = regressionPersistence.update(regression);	
		addWeightMap(regressionObj.getRegressionId(), finalPolynomial);
		return regressionObj;
	}
	public List<WeightMap> addWeightMap(long regressionId, HashMap<List<Integer>, Double> finalPolynomial) throws SystemException {
		weightMapPersistence.removeByRegressionId(regressionId);
		List<WeightMap> result = new ArrayList<WeightMap>();
		for (List<Integer> key : finalPolynomial.keySet()) {
			long mapId = CounterLocalServiceUtil.increment(WeightMap.class.getName());
			WeightMap singleEntry = weightMapPersistence.create(mapId);
			singleEntry.setRegressionId(regressionId);
			StringBuilder sb = new StringBuilder();
			for (Integer i : key) {
				sb.append(i);
				sb.append(",");
			}
			singleEntry.setKey(sb.toString());
			singleEntry.setValue(finalPolynomial.get(key));
			WeightMap entry = weightMapPersistence.update(singleEntry);
			result.add(entry);
		}
		return result;		
	}
	
}