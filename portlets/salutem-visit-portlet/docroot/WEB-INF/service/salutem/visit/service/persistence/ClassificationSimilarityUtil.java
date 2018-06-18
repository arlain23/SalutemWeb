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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import salutem.visit.model.ClassificationSimilarity;

import java.util.List;

/**
 * The persistence utility for the classification similarity service. This utility wraps {@link ClassificationSimilarityPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Aneta Andrzejewska
 * @see ClassificationSimilarityPersistence
 * @see ClassificationSimilarityPersistenceImpl
 * @generated
 */
public class ClassificationSimilarityUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(
		ClassificationSimilarity classificationSimilarity) {
		getPersistence().clearCache(classificationSimilarity);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ClassificationSimilarity> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ClassificationSimilarity> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ClassificationSimilarity> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static ClassificationSimilarity update(
		ClassificationSimilarity classificationSimilarity)
		throws SystemException {
		return getPersistence().update(classificationSimilarity);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static ClassificationSimilarity update(
		ClassificationSimilarity classificationSimilarity,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(classificationSimilarity, serviceContext);
	}

	/**
	* Returns all the classification similarities where classificationId = &#63;.
	*
	* @param classificationId the classification ID
	* @return the matching classification similarities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.visit.model.ClassificationSimilarity> findByClassificationId(
		long classificationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByClassificationId(classificationId);
	}

	/**
	* Returns a range of all the classification similarities where classificationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.ClassificationSimilarityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param classificationId the classification ID
	* @param start the lower bound of the range of classification similarities
	* @param end the upper bound of the range of classification similarities (not inclusive)
	* @return the range of matching classification similarities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.visit.model.ClassificationSimilarity> findByClassificationId(
		long classificationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByClassificationId(classificationId, start, end);
	}

	/**
	* Returns an ordered range of all the classification similarities where classificationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.ClassificationSimilarityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param classificationId the classification ID
	* @param start the lower bound of the range of classification similarities
	* @param end the upper bound of the range of classification similarities (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching classification similarities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.visit.model.ClassificationSimilarity> findByClassificationId(
		long classificationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByClassificationId(classificationId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first classification similarity in the ordered set where classificationId = &#63;.
	*
	* @param classificationId the classification ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching classification similarity
	* @throws salutem.visit.NoSuchClassificationSimilarityException if a matching classification similarity could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.ClassificationSimilarity findByClassificationId_First(
		long classificationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchClassificationSimilarityException {
		return getPersistence()
				   .findByClassificationId_First(classificationId,
			orderByComparator);
	}

	/**
	* Returns the first classification similarity in the ordered set where classificationId = &#63;.
	*
	* @param classificationId the classification ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching classification similarity, or <code>null</code> if a matching classification similarity could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.ClassificationSimilarity fetchByClassificationId_First(
		long classificationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByClassificationId_First(classificationId,
			orderByComparator);
	}

	/**
	* Returns the last classification similarity in the ordered set where classificationId = &#63;.
	*
	* @param classificationId the classification ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching classification similarity
	* @throws salutem.visit.NoSuchClassificationSimilarityException if a matching classification similarity could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.ClassificationSimilarity findByClassificationId_Last(
		long classificationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchClassificationSimilarityException {
		return getPersistence()
				   .findByClassificationId_Last(classificationId,
			orderByComparator);
	}

	/**
	* Returns the last classification similarity in the ordered set where classificationId = &#63;.
	*
	* @param classificationId the classification ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching classification similarity, or <code>null</code> if a matching classification similarity could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.ClassificationSimilarity fetchByClassificationId_Last(
		long classificationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByClassificationId_Last(classificationId,
			orderByComparator);
	}

	/**
	* Returns the classification similarities before and after the current classification similarity in the ordered set where classificationId = &#63;.
	*
	* @param similarityId the primary key of the current classification similarity
	* @param classificationId the classification ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next classification similarity
	* @throws salutem.visit.NoSuchClassificationSimilarityException if a classification similarity with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.ClassificationSimilarity[] findByClassificationId_PrevAndNext(
		long similarityId, long classificationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchClassificationSimilarityException {
		return getPersistence()
				   .findByClassificationId_PrevAndNext(similarityId,
			classificationId, orderByComparator);
	}

	/**
	* Removes all the classification similarities where classificationId = &#63; from the database.
	*
	* @param classificationId the classification ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByClassificationId(long classificationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByClassificationId(classificationId);
	}

	/**
	* Returns the number of classification similarities where classificationId = &#63;.
	*
	* @param classificationId the classification ID
	* @return the number of matching classification similarities
	* @throws SystemException if a system exception occurred
	*/
	public static int countByClassificationId(long classificationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByClassificationId(classificationId);
	}

	/**
	* Caches the classification similarity in the entity cache if it is enabled.
	*
	* @param classificationSimilarity the classification similarity
	*/
	public static void cacheResult(
		salutem.visit.model.ClassificationSimilarity classificationSimilarity) {
		getPersistence().cacheResult(classificationSimilarity);
	}

	/**
	* Caches the classification similarities in the entity cache if it is enabled.
	*
	* @param classificationSimilarities the classification similarities
	*/
	public static void cacheResult(
		java.util.List<salutem.visit.model.ClassificationSimilarity> classificationSimilarities) {
		getPersistence().cacheResult(classificationSimilarities);
	}

	/**
	* Creates a new classification similarity with the primary key. Does not add the classification similarity to the database.
	*
	* @param similarityId the primary key for the new classification similarity
	* @return the new classification similarity
	*/
	public static salutem.visit.model.ClassificationSimilarity create(
		long similarityId) {
		return getPersistence().create(similarityId);
	}

	/**
	* Removes the classification similarity with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param similarityId the primary key of the classification similarity
	* @return the classification similarity that was removed
	* @throws salutem.visit.NoSuchClassificationSimilarityException if a classification similarity with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.ClassificationSimilarity remove(
		long similarityId)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchClassificationSimilarityException {
		return getPersistence().remove(similarityId);
	}

	public static salutem.visit.model.ClassificationSimilarity updateImpl(
		salutem.visit.model.ClassificationSimilarity classificationSimilarity)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(classificationSimilarity);
	}

	/**
	* Returns the classification similarity with the primary key or throws a {@link salutem.visit.NoSuchClassificationSimilarityException} if it could not be found.
	*
	* @param similarityId the primary key of the classification similarity
	* @return the classification similarity
	* @throws salutem.visit.NoSuchClassificationSimilarityException if a classification similarity with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.ClassificationSimilarity findByPrimaryKey(
		long similarityId)
		throws com.liferay.portal.kernel.exception.SystemException,
			salutem.visit.NoSuchClassificationSimilarityException {
		return getPersistence().findByPrimaryKey(similarityId);
	}

	/**
	* Returns the classification similarity with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param similarityId the primary key of the classification similarity
	* @return the classification similarity, or <code>null</code> if a classification similarity with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static salutem.visit.model.ClassificationSimilarity fetchByPrimaryKey(
		long similarityId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(similarityId);
	}

	/**
	* Returns all the classification similarities.
	*
	* @return the classification similarities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.visit.model.ClassificationSimilarity> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the classification similarities.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.ClassificationSimilarityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of classification similarities
	* @param end the upper bound of the range of classification similarities (not inclusive)
	* @return the range of classification similarities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.visit.model.ClassificationSimilarity> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the classification similarities.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link salutem.visit.model.impl.ClassificationSimilarityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of classification similarities
	* @param end the upper bound of the range of classification similarities (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of classification similarities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<salutem.visit.model.ClassificationSimilarity> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the classification similarities from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of classification similarities.
	*
	* @return the number of classification similarities
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ClassificationSimilarityPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ClassificationSimilarityPersistence)PortletBeanLocatorUtil.locate(salutem.visit.service.ClpSerializer.getServletContextName(),
					ClassificationSimilarityPersistence.class.getName());

			ReferenceRegistry.registerReference(ClassificationSimilarityUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ClassificationSimilarityPersistence persistence) {
	}

	private static ClassificationSimilarityPersistence _persistence;
}