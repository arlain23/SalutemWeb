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

package tul.salutem.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import tul.salutem.model.Test;

/**
 * The persistence interface for the test service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Aneta Andrzejewska
 * @see TestPersistenceImpl
 * @see TestUtil
 * @generated
 */
public interface TestPersistence extends BasePersistence<Test> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TestUtil} to access the test persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the tests where username = &#63;.
	*
	* @param username the username
	* @return the matching tests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<tul.salutem.model.Test> findByusername(
		java.lang.String username)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tests where username = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tul.salutem.model.impl.TestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param username the username
	* @param start the lower bound of the range of tests
	* @param end the upper bound of the range of tests (not inclusive)
	* @return the range of matching tests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<tul.salutem.model.Test> findByusername(
		java.lang.String username, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tests where username = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tul.salutem.model.impl.TestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param username the username
	* @param start the lower bound of the range of tests
	* @param end the upper bound of the range of tests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<tul.salutem.model.Test> findByusername(
		java.lang.String username, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first test in the ordered set where username = &#63;.
	*
	* @param username the username
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test
	* @throws tul.salutem.NoSuchTestException if a matching test could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tul.salutem.model.Test findByusername_First(
		java.lang.String username,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tul.salutem.NoSuchTestException;

	/**
	* Returns the first test in the ordered set where username = &#63;.
	*
	* @param username the username
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test, or <code>null</code> if a matching test could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tul.salutem.model.Test fetchByusername_First(
		java.lang.String username,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last test in the ordered set where username = &#63;.
	*
	* @param username the username
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test
	* @throws tul.salutem.NoSuchTestException if a matching test could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tul.salutem.model.Test findByusername_Last(
		java.lang.String username,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tul.salutem.NoSuchTestException;

	/**
	* Returns the last test in the ordered set where username = &#63;.
	*
	* @param username the username
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test, or <code>null</code> if a matching test could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tul.salutem.model.Test fetchByusername_Last(
		java.lang.String username,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tests before and after the current test in the ordered set where username = &#63;.
	*
	* @param testId the primary key of the current test
	* @param username the username
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next test
	* @throws tul.salutem.NoSuchTestException if a test with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tul.salutem.model.Test[] findByusername_PrevAndNext(long testId,
		java.lang.String username,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tul.salutem.NoSuchTestException;

	/**
	* Removes all the tests where username = &#63; from the database.
	*
	* @param username the username
	* @throws SystemException if a system exception occurred
	*/
	public void removeByusername(java.lang.String username)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tests where username = &#63;.
	*
	* @param username the username
	* @return the number of matching tests
	* @throws SystemException if a system exception occurred
	*/
	public int countByusername(java.lang.String username)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the test in the entity cache if it is enabled.
	*
	* @param test the test
	*/
	public void cacheResult(tul.salutem.model.Test test);

	/**
	* Caches the tests in the entity cache if it is enabled.
	*
	* @param tests the tests
	*/
	public void cacheResult(java.util.List<tul.salutem.model.Test> tests);

	/**
	* Creates a new test with the primary key. Does not add the test to the database.
	*
	* @param testId the primary key for the new test
	* @return the new test
	*/
	public tul.salutem.model.Test create(long testId);

	/**
	* Removes the test with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param testId the primary key of the test
	* @return the test that was removed
	* @throws tul.salutem.NoSuchTestException if a test with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tul.salutem.model.Test remove(long testId)
		throws com.liferay.portal.kernel.exception.SystemException,
			tul.salutem.NoSuchTestException;

	public tul.salutem.model.Test updateImpl(tul.salutem.model.Test test)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the test with the primary key or throws a {@link tul.salutem.NoSuchTestException} if it could not be found.
	*
	* @param testId the primary key of the test
	* @return the test
	* @throws tul.salutem.NoSuchTestException if a test with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tul.salutem.model.Test findByPrimaryKey(long testId)
		throws com.liferay.portal.kernel.exception.SystemException,
			tul.salutem.NoSuchTestException;

	/**
	* Returns the test with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param testId the primary key of the test
	* @return the test, or <code>null</code> if a test with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tul.salutem.model.Test fetchByPrimaryKey(long testId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tests.
	*
	* @return the tests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<tul.salutem.model.Test> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tul.salutem.model.impl.TestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tests
	* @param end the upper bound of the range of tests (not inclusive)
	* @return the range of tests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<tul.salutem.model.Test> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tul.salutem.model.impl.TestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tests
	* @param end the upper bound of the range of tests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<tul.salutem.model.Test> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the tests from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tests.
	*
	* @return the number of tests
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}