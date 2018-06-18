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

package tul.salutem.entity.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import tul.salutem.entity.NoSuchPatientException;
import tul.salutem.entity.model.Patient;
import tul.salutem.entity.model.impl.PatientImpl;
import tul.salutem.entity.model.impl.PatientModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the patient service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Aneta Andrzejewska
 * @see PatientPersistence
 * @see PatientUtil
 * @generated
 */
public class PatientPersistenceImpl extends BasePersistenceImpl<Patient>
	implements PatientPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PatientUtil} to access the patient persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PatientImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PatientModelImpl.ENTITY_CACHE_ENABLED,
			PatientModelImpl.FINDER_CACHE_ENABLED, PatientImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PatientModelImpl.ENTITY_CACHE_ENABLED,
			PatientModelImpl.FINDER_CACHE_ENABLED, PatientImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PatientModelImpl.ENTITY_CACHE_ENABLED,
			PatientModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID = new FinderPath(PatientModelImpl.ENTITY_CACHE_ENABLED,
			PatientModelImpl.FINDER_CACHE_ENABLED, PatientImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUserId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID =
		new FinderPath(PatientModelImpl.ENTITY_CACHE_ENABLED,
			PatientModelImpl.FINDER_CACHE_ENABLED, PatientImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUserId",
			new String[] { Long.class.getName() },
			PatientModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERID = new FinderPath(PatientModelImpl.ENTITY_CACHE_ENABLED,
			PatientModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the patients where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching patients
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Patient> findByUserId(long userId) throws SystemException {
		return findByUserId(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the patients where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tul.salutem.entity.model.impl.PatientModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of patients
	 * @param end the upper bound of the range of patients (not inclusive)
	 * @return the range of matching patients
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Patient> findByUserId(long userId, int start, int end)
		throws SystemException {
		return findByUserId(userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the patients where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tul.salutem.entity.model.impl.PatientModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of patients
	 * @param end the upper bound of the range of patients (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching patients
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Patient> findByUserId(long userId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID;
			finderArgs = new Object[] { userId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID;
			finderArgs = new Object[] { userId, start, end, orderByComparator };
		}

		List<Patient> list = (List<Patient>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Patient patient : list) {
				if ((userId != patient.getUserId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_PATIENT_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PatientModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (!pagination) {
					list = (List<Patient>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Patient>(list);
				}
				else {
					list = (List<Patient>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first patient in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching patient
	 * @throws tul.salutem.entity.NoSuchPatientException if a matching patient could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Patient findByUserId_First(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchPatientException, SystemException {
		Patient patient = fetchByUserId_First(userId, orderByComparator);

		if (patient != null) {
			return patient;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPatientException(msg.toString());
	}

	/**
	 * Returns the first patient in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching patient, or <code>null</code> if a matching patient could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Patient fetchByUserId_First(long userId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Patient> list = findByUserId(userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last patient in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching patient
	 * @throws tul.salutem.entity.NoSuchPatientException if a matching patient could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Patient findByUserId_Last(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchPatientException, SystemException {
		Patient patient = fetchByUserId_Last(userId, orderByComparator);

		if (patient != null) {
			return patient;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPatientException(msg.toString());
	}

	/**
	 * Returns the last patient in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching patient, or <code>null</code> if a matching patient could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Patient fetchByUserId_Last(long userId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUserId(userId);

		if (count == 0) {
			return null;
		}

		List<Patient> list = findByUserId(userId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the patients before and after the current patient in the ordered set where userId = &#63;.
	 *
	 * @param patientId the primary key of the current patient
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next patient
	 * @throws tul.salutem.entity.NoSuchPatientException if a patient with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Patient[] findByUserId_PrevAndNext(long patientId, long userId,
		OrderByComparator orderByComparator)
		throws NoSuchPatientException, SystemException {
		Patient patient = findByPrimaryKey(patientId);

		Session session = null;

		try {
			session = openSession();

			Patient[] array = new PatientImpl[3];

			array[0] = getByUserId_PrevAndNext(session, patient, userId,
					orderByComparator, true);

			array[1] = patient;

			array[2] = getByUserId_PrevAndNext(session, patient, userId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Patient getByUserId_PrevAndNext(Session session, Patient patient,
		long userId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PATIENT_WHERE);

		query.append(_FINDER_COLUMN_USERID_USERID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(PatientModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(patient);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Patient> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the patients where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUserId(long userId) throws SystemException {
		for (Patient patient : findByUserId(userId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(patient);
		}
	}

	/**
	 * Returns the number of patients where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching patients
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUserId(long userId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USERID;

		Object[] finderArgs = new Object[] { userId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PATIENT_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_USERID_USERID_2 = "patient.userId = ?";

	public PatientPersistenceImpl() {
		setModelClass(Patient.class);
	}

	/**
	 * Caches the patient in the entity cache if it is enabled.
	 *
	 * @param patient the patient
	 */
	@Override
	public void cacheResult(Patient patient) {
		EntityCacheUtil.putResult(PatientModelImpl.ENTITY_CACHE_ENABLED,
			PatientImpl.class, patient.getPrimaryKey(), patient);

		patient.resetOriginalValues();
	}

	/**
	 * Caches the patients in the entity cache if it is enabled.
	 *
	 * @param patients the patients
	 */
	@Override
	public void cacheResult(List<Patient> patients) {
		for (Patient patient : patients) {
			if (EntityCacheUtil.getResult(
						PatientModelImpl.ENTITY_CACHE_ENABLED,
						PatientImpl.class, patient.getPrimaryKey()) == null) {
				cacheResult(patient);
			}
			else {
				patient.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all patients.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PatientImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PatientImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the patient.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Patient patient) {
		EntityCacheUtil.removeResult(PatientModelImpl.ENTITY_CACHE_ENABLED,
			PatientImpl.class, patient.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Patient> patients) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Patient patient : patients) {
			EntityCacheUtil.removeResult(PatientModelImpl.ENTITY_CACHE_ENABLED,
				PatientImpl.class, patient.getPrimaryKey());
		}
	}

	/**
	 * Creates a new patient with the primary key. Does not add the patient to the database.
	 *
	 * @param patientId the primary key for the new patient
	 * @return the new patient
	 */
	@Override
	public Patient create(long patientId) {
		Patient patient = new PatientImpl();

		patient.setNew(true);
		patient.setPrimaryKey(patientId);

		return patient;
	}

	/**
	 * Removes the patient with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param patientId the primary key of the patient
	 * @return the patient that was removed
	 * @throws tul.salutem.entity.NoSuchPatientException if a patient with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Patient remove(long patientId)
		throws NoSuchPatientException, SystemException {
		return remove((Serializable)patientId);
	}

	/**
	 * Removes the patient with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the patient
	 * @return the patient that was removed
	 * @throws tul.salutem.entity.NoSuchPatientException if a patient with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Patient remove(Serializable primaryKey)
		throws NoSuchPatientException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Patient patient = (Patient)session.get(PatientImpl.class, primaryKey);

			if (patient == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPatientException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(patient);
		}
		catch (NoSuchPatientException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Patient removeImpl(Patient patient) throws SystemException {
		patient = toUnwrappedModel(patient);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(patient)) {
				patient = (Patient)session.get(PatientImpl.class,
						patient.getPrimaryKeyObj());
			}

			if (patient != null) {
				session.delete(patient);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (patient != null) {
			clearCache(patient);
		}

		return patient;
	}

	@Override
	public Patient updateImpl(tul.salutem.entity.model.Patient patient)
		throws SystemException {
		patient = toUnwrappedModel(patient);

		boolean isNew = patient.isNew();

		PatientModelImpl patientModelImpl = (PatientModelImpl)patient;

		Session session = null;

		try {
			session = openSession();

			if (patient.isNew()) {
				session.save(patient);

				patient.setNew(false);
			}
			else {
				session.merge(patient);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !PatientModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((patientModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						patientModelImpl.getOriginalUserId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);

				args = new Object[] { patientModelImpl.getUserId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);
			}
		}

		EntityCacheUtil.putResult(PatientModelImpl.ENTITY_CACHE_ENABLED,
			PatientImpl.class, patient.getPrimaryKey(), patient);

		return patient;
	}

	protected Patient toUnwrappedModel(Patient patient) {
		if (patient instanceof PatientImpl) {
			return patient;
		}

		PatientImpl patientImpl = new PatientImpl();

		patientImpl.setNew(patient.isNew());
		patientImpl.setPrimaryKey(patient.getPrimaryKey());

		patientImpl.setPatientId(patient.getPatientId());
		patientImpl.setGroupId(patient.getGroupId());
		patientImpl.setCompanyId(patient.getCompanyId());
		patientImpl.setUserId(patient.getUserId());
		patientImpl.setUserName(patient.getUserName());
		patientImpl.setCreateDate(patient.getCreateDate());
		patientImpl.setModifiedDate(patient.getModifiedDate());
		patientImpl.setConfirmingUserId(patient.getConfirmingUserId());
		patientImpl.setConfirmingUserName(patient.getConfirmingUserName());
		patientImpl.setIsConfirmed(patient.isIsConfirmed());
		patientImpl.setName(patient.getName());
		patientImpl.setSurname(patient.getSurname());
		patientImpl.setMiddleName(patient.getMiddleName());
		patientImpl.setPesel(patient.getPesel());
		patientImpl.setIdNumber(patient.getIdNumber());
		patientImpl.setIdImage(patient.getIdImage());
		patientImpl.setBirthDate(patient.getBirthDate());
		patientImpl.setSex(patient.getSex());
		patientImpl.setAddress(patient.getAddress());
		patientImpl.setCityName(patient.getCityName());
		patientImpl.setBloodType(patient.getBloodType());

		return patientImpl;
	}

	/**
	 * Returns the patient with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the patient
	 * @return the patient
	 * @throws tul.salutem.entity.NoSuchPatientException if a patient with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Patient findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPatientException, SystemException {
		Patient patient = fetchByPrimaryKey(primaryKey);

		if (patient == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPatientException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return patient;
	}

	/**
	 * Returns the patient with the primary key or throws a {@link tul.salutem.entity.NoSuchPatientException} if it could not be found.
	 *
	 * @param patientId the primary key of the patient
	 * @return the patient
	 * @throws tul.salutem.entity.NoSuchPatientException if a patient with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Patient findByPrimaryKey(long patientId)
		throws NoSuchPatientException, SystemException {
		return findByPrimaryKey((Serializable)patientId);
	}

	/**
	 * Returns the patient with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the patient
	 * @return the patient, or <code>null</code> if a patient with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Patient fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Patient patient = (Patient)EntityCacheUtil.getResult(PatientModelImpl.ENTITY_CACHE_ENABLED,
				PatientImpl.class, primaryKey);

		if (patient == _nullPatient) {
			return null;
		}

		if (patient == null) {
			Session session = null;

			try {
				session = openSession();

				patient = (Patient)session.get(PatientImpl.class, primaryKey);

				if (patient != null) {
					cacheResult(patient);
				}
				else {
					EntityCacheUtil.putResult(PatientModelImpl.ENTITY_CACHE_ENABLED,
						PatientImpl.class, primaryKey, _nullPatient);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PatientModelImpl.ENTITY_CACHE_ENABLED,
					PatientImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return patient;
	}

	/**
	 * Returns the patient with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param patientId the primary key of the patient
	 * @return the patient, or <code>null</code> if a patient with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Patient fetchByPrimaryKey(long patientId) throws SystemException {
		return fetchByPrimaryKey((Serializable)patientId);
	}

	/**
	 * Returns all the patients.
	 *
	 * @return the patients
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Patient> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the patients.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tul.salutem.entity.model.impl.PatientModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of patients
	 * @param end the upper bound of the range of patients (not inclusive)
	 * @return the range of patients
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Patient> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the patients.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tul.salutem.entity.model.impl.PatientModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of patients
	 * @param end the upper bound of the range of patients (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of patients
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Patient> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Patient> list = (List<Patient>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PATIENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PATIENT;

				if (pagination) {
					sql = sql.concat(PatientModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Patient>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Patient>(list);
				}
				else {
					list = (List<Patient>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the patients from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Patient patient : findAll()) {
			remove(patient);
		}
	}

	/**
	 * Returns the number of patients.
	 *
	 * @return the number of patients
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_PATIENT);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the patient persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.tul.salutem.entity.model.Patient")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Patient>> listenersList = new ArrayList<ModelListener<Patient>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Patient>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(PatientImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PATIENT = "SELECT patient FROM Patient patient";
	private static final String _SQL_SELECT_PATIENT_WHERE = "SELECT patient FROM Patient patient WHERE ";
	private static final String _SQL_COUNT_PATIENT = "SELECT COUNT(patient) FROM Patient patient";
	private static final String _SQL_COUNT_PATIENT_WHERE = "SELECT COUNT(patient) FROM Patient patient WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "patient.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Patient exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Patient exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PatientPersistenceImpl.class);
	private static Patient _nullPatient = new PatientImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Patient> toCacheModel() {
				return _nullPatientCacheModel;
			}
		};

	private static CacheModel<Patient> _nullPatientCacheModel = new CacheModel<Patient>() {
			@Override
			public Patient toEntityModel() {
				return _nullPatient;
			}
		};
}