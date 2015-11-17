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

package com.prodyna.service.persistence;

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

import com.prodyna.NoSuchUserDataException;

import com.prodyna.model.UserData;
import com.prodyna.model.impl.UserDataImpl;
import com.prodyna.model.impl.UserDataModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the user data service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserDataPersistence
 * @see UserDataUtil
 * @generated
 */
public class UserDataPersistenceImpl extends BasePersistenceImpl<UserData>
	implements UserDataPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link UserDataUtil} to access the user data persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = UserDataImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(UserDataModelImpl.ENTITY_CACHE_ENABLED,
			UserDataModelImpl.FINDER_CACHE_ENABLED, UserDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(UserDataModelImpl.ENTITY_CACHE_ENABLED,
			UserDataModelImpl.FINDER_CACHE_ENABLED, UserDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(UserDataModelImpl.ENTITY_CACHE_ENABLED,
			UserDataModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_C_U = new FinderPath(UserDataModelImpl.ENTITY_CACHE_ENABLED,
			UserDataModelImpl.FINDER_CACHE_ENABLED, UserDataImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByC_U",
			new String[] { Long.class.getName(), Long.class.getName() },
			UserDataModelImpl.COMPANYID_COLUMN_BITMASK |
			UserDataModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_U = new FinderPath(UserDataModelImpl.ENTITY_CACHE_ENABLED,
			UserDataModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_U",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns the user data where companyId = &#63; and userId = &#63; or throws a {@link com.prodyna.NoSuchUserDataException} if it could not be found.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @return the matching user data
	 * @throws com.prodyna.NoSuchUserDataException if a matching user data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserData findByC_U(long companyId, long userId)
		throws NoSuchUserDataException, SystemException {
		UserData userData = fetchByC_U(companyId, userId);

		if (userData == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(", userId=");
			msg.append(userId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchUserDataException(msg.toString());
		}

		return userData;
	}

	/**
	 * Returns the user data where companyId = &#63; and userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @return the matching user data, or <code>null</code> if a matching user data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserData fetchByC_U(long companyId, long userId)
		throws SystemException {
		return fetchByC_U(companyId, userId, true);
	}

	/**
	 * Returns the user data where companyId = &#63; and userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching user data, or <code>null</code> if a matching user data could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserData fetchByC_U(long companyId, long userId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { companyId, userId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_C_U,
					finderArgs, this);
		}

		if (result instanceof UserData) {
			UserData userData = (UserData)result;

			if ((companyId != userData.getCompanyId()) ||
					(userId != userData.getUserId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_USERDATA_WHERE);

			query.append(_FINDER_COLUMN_C_U_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_U_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(userId);

				List<UserData> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_U,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"UserDataPersistenceImpl.fetchByC_U(long, long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					UserData userData = list.get(0);

					result = userData;

					cacheResult(userData);

					if ((userData.getCompanyId() != companyId) ||
							(userData.getUserId() != userId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_U,
							finderArgs, userData);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_U,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (UserData)result;
		}
	}

	/**
	 * Removes the user data where companyId = &#63; and userId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @return the user data that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserData removeByC_U(long companyId, long userId)
		throws NoSuchUserDataException, SystemException {
		UserData userData = findByC_U(companyId, userId);

		return remove(userData);
	}

	/**
	 * Returns the number of user datas where companyId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @return the number of matching user datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_U(long companyId, long userId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_U;

		Object[] finderArgs = new Object[] { companyId, userId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_USERDATA_WHERE);

			query.append(_FINDER_COLUMN_C_U_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_U_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

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

	private static final String _FINDER_COLUMN_C_U_COMPANYID_2 = "userData.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_U_USERID_2 = "userData.userId = ?";

	public UserDataPersistenceImpl() {
		setModelClass(UserData.class);
	}

	/**
	 * Caches the user data in the entity cache if it is enabled.
	 *
	 * @param userData the user data
	 */
	@Override
	public void cacheResult(UserData userData) {
		EntityCacheUtil.putResult(UserDataModelImpl.ENTITY_CACHE_ENABLED,
			UserDataImpl.class, userData.getPrimaryKey(), userData);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_U,
			new Object[] { userData.getCompanyId(), userData.getUserId() },
			userData);

		userData.resetOriginalValues();
	}

	/**
	 * Caches the user datas in the entity cache if it is enabled.
	 *
	 * @param userDatas the user datas
	 */
	@Override
	public void cacheResult(List<UserData> userDatas) {
		for (UserData userData : userDatas) {
			if (EntityCacheUtil.getResult(
						UserDataModelImpl.ENTITY_CACHE_ENABLED,
						UserDataImpl.class, userData.getPrimaryKey()) == null) {
				cacheResult(userData);
			}
			else {
				userData.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all user datas.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(UserDataImpl.class.getName());
		}

		EntityCacheUtil.clearCache(UserDataImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the user data.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(UserData userData) {
		EntityCacheUtil.removeResult(UserDataModelImpl.ENTITY_CACHE_ENABLED,
			UserDataImpl.class, userData.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(userData);
	}

	@Override
	public void clearCache(List<UserData> userDatas) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (UserData userData : userDatas) {
			EntityCacheUtil.removeResult(UserDataModelImpl.ENTITY_CACHE_ENABLED,
				UserDataImpl.class, userData.getPrimaryKey());

			clearUniqueFindersCache(userData);
		}
	}

	protected void cacheUniqueFindersCache(UserData userData) {
		if (userData.isNew()) {
			Object[] args = new Object[] {
					userData.getCompanyId(), userData.getUserId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_C_U, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_U, args, userData);
		}
		else {
			UserDataModelImpl userDataModelImpl = (UserDataModelImpl)userData;

			if ((userDataModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_C_U.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						userData.getCompanyId(), userData.getUserId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_C_U, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_U, args,
					userData);
			}
		}
	}

	protected void clearUniqueFindersCache(UserData userData) {
		UserDataModelImpl userDataModelImpl = (UserDataModelImpl)userData;

		Object[] args = new Object[] {
				userData.getCompanyId(), userData.getUserId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_U, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_U, args);

		if ((userDataModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_C_U.getColumnBitmask()) != 0) {
			args = new Object[] {
					userDataModelImpl.getOriginalCompanyId(),
					userDataModelImpl.getOriginalUserId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_U, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_U, args);
		}
	}

	/**
	 * Creates a new user data with the primary key. Does not add the user data to the database.
	 *
	 * @param userDataId the primary key for the new user data
	 * @return the new user data
	 */
	@Override
	public UserData create(long userDataId) {
		UserData userData = new UserDataImpl();

		userData.setNew(true);
		userData.setPrimaryKey(userDataId);

		return userData;
	}

	/**
	 * Removes the user data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userDataId the primary key of the user data
	 * @return the user data that was removed
	 * @throws com.prodyna.NoSuchUserDataException if a user data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserData remove(long userDataId)
		throws NoSuchUserDataException, SystemException {
		return remove((Serializable)userDataId);
	}

	/**
	 * Removes the user data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the user data
	 * @return the user data that was removed
	 * @throws com.prodyna.NoSuchUserDataException if a user data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserData remove(Serializable primaryKey)
		throws NoSuchUserDataException, SystemException {
		Session session = null;

		try {
			session = openSession();

			UserData userData = (UserData)session.get(UserDataImpl.class,
					primaryKey);

			if (userData == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchUserDataException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(userData);
		}
		catch (NoSuchUserDataException nsee) {
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
	protected UserData removeImpl(UserData userData) throws SystemException {
		userData = toUnwrappedModel(userData);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(userData)) {
				userData = (UserData)session.get(UserDataImpl.class,
						userData.getPrimaryKeyObj());
			}

			if (userData != null) {
				session.delete(userData);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (userData != null) {
			clearCache(userData);
		}

		return userData;
	}

	@Override
	public UserData updateImpl(com.prodyna.model.UserData userData)
		throws SystemException {
		userData = toUnwrappedModel(userData);

		boolean isNew = userData.isNew();

		Session session = null;

		try {
			session = openSession();

			if (userData.isNew()) {
				session.save(userData);

				userData.setNew(false);
			}
			else {
				session.merge(userData);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !UserDataModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(UserDataModelImpl.ENTITY_CACHE_ENABLED,
			UserDataImpl.class, userData.getPrimaryKey(), userData);

		clearUniqueFindersCache(userData);
		cacheUniqueFindersCache(userData);

		return userData;
	}

	protected UserData toUnwrappedModel(UserData userData) {
		if (userData instanceof UserDataImpl) {
			return userData;
		}

		UserDataImpl userDataImpl = new UserDataImpl();

		userDataImpl.setNew(userData.isNew());
		userDataImpl.setPrimaryKey(userData.getPrimaryKey());

		userDataImpl.setUserDataId(userData.getUserDataId());
		userDataImpl.setCompanyId(userData.getCompanyId());
		userDataImpl.setUserId(userData.getUserId());
		userDataImpl.setCreationDate(userData.getCreationDate());
		userDataImpl.setModifiedDate(userData.getModifiedDate());
		userDataImpl.setT_ShirtSize(userData.getT_ShirtSize());
		userDataImpl.setDateOfBirth(userData.getDateOfBirth());
		userDataImpl.setGlasses(userData.isGlasses());
		userDataImpl.setCoffeesPerDay(userData.getCoffeesPerDay());
		userDataImpl.setHeightCm(userData.getHeightCm());

		return userDataImpl;
	}

	/**
	 * Returns the user data with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the user data
	 * @return the user data
	 * @throws com.prodyna.NoSuchUserDataException if a user data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserData findByPrimaryKey(Serializable primaryKey)
		throws NoSuchUserDataException, SystemException {
		UserData userData = fetchByPrimaryKey(primaryKey);

		if (userData == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchUserDataException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return userData;
	}

	/**
	 * Returns the user data with the primary key or throws a {@link com.prodyna.NoSuchUserDataException} if it could not be found.
	 *
	 * @param userDataId the primary key of the user data
	 * @return the user data
	 * @throws com.prodyna.NoSuchUserDataException if a user data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserData findByPrimaryKey(long userDataId)
		throws NoSuchUserDataException, SystemException {
		return findByPrimaryKey((Serializable)userDataId);
	}

	/**
	 * Returns the user data with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the user data
	 * @return the user data, or <code>null</code> if a user data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserData fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		UserData userData = (UserData)EntityCacheUtil.getResult(UserDataModelImpl.ENTITY_CACHE_ENABLED,
				UserDataImpl.class, primaryKey);

		if (userData == _nullUserData) {
			return null;
		}

		if (userData == null) {
			Session session = null;

			try {
				session = openSession();

				userData = (UserData)session.get(UserDataImpl.class, primaryKey);

				if (userData != null) {
					cacheResult(userData);
				}
				else {
					EntityCacheUtil.putResult(UserDataModelImpl.ENTITY_CACHE_ENABLED,
						UserDataImpl.class, primaryKey, _nullUserData);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(UserDataModelImpl.ENTITY_CACHE_ENABLED,
					UserDataImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return userData;
	}

	/**
	 * Returns the user data with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param userDataId the primary key of the user data
	 * @return the user data, or <code>null</code> if a user data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserData fetchByPrimaryKey(long userDataId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)userDataId);
	}

	/**
	 * Returns all the user datas.
	 *
	 * @return the user datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserData> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.prodyna.model.impl.UserDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of user datas
	 * @param end the upper bound of the range of user datas (not inclusive)
	 * @return the range of user datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserData> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the user datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.prodyna.model.impl.UserDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of user datas
	 * @param end the upper bound of the range of user datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of user datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserData> findAll(int start, int end,
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

		List<UserData> list = (List<UserData>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_USERDATA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_USERDATA;

				if (pagination) {
					sql = sql.concat(UserDataModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<UserData>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<UserData>(list);
				}
				else {
					list = (List<UserData>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the user datas from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (UserData userData : findAll()) {
			remove(userData);
		}
	}

	/**
	 * Returns the number of user datas.
	 *
	 * @return the number of user datas
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

				Query q = session.createQuery(_SQL_COUNT_USERDATA);

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
	 * Initializes the user data persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.prodyna.model.UserData")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<UserData>> listenersList = new ArrayList<ModelListener<UserData>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<UserData>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(UserDataImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_USERDATA = "SELECT userData FROM UserData userData";
	private static final String _SQL_SELECT_USERDATA_WHERE = "SELECT userData FROM UserData userData WHERE ";
	private static final String _SQL_COUNT_USERDATA = "SELECT COUNT(userData) FROM UserData userData";
	private static final String _SQL_COUNT_USERDATA_WHERE = "SELECT COUNT(userData) FROM UserData userData WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "userData.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No UserData exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No UserData exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(UserDataPersistenceImpl.class);
	private static UserData _nullUserData = new UserDataImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<UserData> toCacheModel() {
				return _nullUserDataCacheModel;
			}
		};

	private static CacheModel<UserData> _nullUserDataCacheModel = new CacheModel<UserData>() {
			@Override
			public UserData toEntityModel() {
				return _nullUserData;
			}
		};
}