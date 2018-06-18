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

package salutem.visit.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import salutem.visit.model.WeightMap;

/**
 * The persistence interface for the weight map service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Aneta Andrzejewska
 * @see WeightMapPersistenceImpl
 * @see WeightMapUtil
 * @generated
 */
public interface WeightMapPersistence extends BasePersistence<WeightMap> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link WeightMapUtil} to access the weight map persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the weight maps where regressionId = &#63;.
	*
	* @param regressionId the regression ID
	* @return the matching weight maps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<salutem.visit.model.WeightMap> findByRegressionId(
		long regressionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the weight maps where regressionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.WeightMapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param regressionId the regression ID
	* @param start the lower bound of the range of weight maps
	* @param end the upper bound of the range of weight maps (not inclusive)
	* @return the range of matching weight maps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<salutem.visit.model.WeightMap> findByRegressionId(
		long regressionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the weight maps where regressionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.WeightMapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param regressionId the regression ID
	* @param start the lower bound of the range of weight maps
	* @param end the upper bound of the range of weight maps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching weight maps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<salutem.visit.model.WeightMap> findByRegressionId(
		long regressionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first weight map in the ordered set where regressionId = &#63;.
	*
	* @param regressionId the regression ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching weight map
	* @throws salutem.visit.NoSuchWeightMapException if a matching weight map could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.WeightMap findByRegressionId_First(
		long regressionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchWeightMapException;

	/**
	* Returns the first weight map in the ordered set where regressionId = &#63;.
	*
	* @param regressionId the regression ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching weight map, or <code>null</code> if a matching weight map could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.WeightMap fetchByRegressionId_First(
		long regressionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last weight map in the ordered set where regressionId = &#63;.
	*
	* @param regressionId the regression ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching weight map
	* @throws salutem.visit.NoSuchWeightMapException if a matching weight map could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.WeightMap findByRegressionId_Last(
		long regressionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchWeightMapException;

	/**
	* Returns the last weight map in the ordered set where regressionId = &#63;.
	*
	* @param regressionId the regression ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching weight map, or <code>null</code> if a matching weight map could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.WeightMap fetchByRegressionId_Last(
		long regressionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the weight maps before and after the current weight map in the ordered set where regressionId = &#63;.
	*
	* @param weightMapId the primary key of the current weight map
	* @param regressionId the regression ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next weight map
	* @throws salutem.visit.NoSuchWeightMapException if a weight map with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.WeightMap[] findByRegressionId_PrevAndNext(
		long weightMapId, long regressionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchWeightMapException;

	/**
	* Removes all the weight maps where regressionId = &#63; from the database.
	*
	* @param regressionId the regression ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByRegressionId(long regressionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of weight maps where regressionId = &#63;.
	*
	* @param regressionId the regression ID
	* @return the number of matching weight maps
	* @throws SystemException if a system exception occurred
	*/
	public int countByRegressionId(long regressionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the weight map in the entity cache if it is enabled.
	*
	* @param weightMap the weight map
	*/
	public void cacheResult(salutem.visit.model.WeightMap weightMap);

	/**
	* Caches the weight maps in the entity cache if it is enabled.
	*
	* @param weightMaps the weight maps
	*/
	public void cacheResult(
		java.util.List<salutem.visit.model.WeightMap> weightMaps);

	/**
	* Creates a new weight map with the primary key. Does not add the weight map to the database.
	*
	* @param weightMapId the primary key for the new weight map
	* @return the new weight map
	*/
	public salutem.visit.model.WeightMap create(long weightMapId);

	/**
	* Removes the weight map with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param weightMapId the primary key of the weight map
	* @return the weight map that was removed
	* @throws salutem.visit.NoSuchWeightMapException if a weight map with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.WeightMap remove(long weightMapId)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchWeightMapException;

	public salutem.visit.model.WeightMap updateImpl(
		salutem.visit.model.WeightMap weightMap)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the weight map with the primary key or throws a {@link salutem.visit.NoSuchWeightMapException} if it could not be found.
	*
	* @param weightMapId the primary key of the weight map
	* @return the weight map
	* @throws salutem.visit.NoSuchWeightMapException if a weight map with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.WeightMap findByPrimaryKey(long weightMapId)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchWeightMapException;

	/**
	* Returns the weight map with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param weightMapId the primary key of the weight map
	* @return the weight map, or <code>null</code> if a weight map with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public salutem.visit.model.WeightMap fetchByPrimaryKey(long weightMapId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the weight maps.
	*
	* @return the weight maps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<salutem.visit.model.WeightMap> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the weight maps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.WeightMapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of weight maps
	* @param end the upper bound of the range of weight maps (not inclusive)
	* @return the range of weight maps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<salutem.visit.model.WeightMap> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the weight maps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.WeightMapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of weight maps
	* @param end the upper bound of the range of weight maps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of weight maps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<salutem.visit.model.WeightMap> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the weight maps from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of weight maps.
	*
	* @return the number of weight maps
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}