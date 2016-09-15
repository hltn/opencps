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

package org.opencps.api.service.persistence;

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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import org.opencps.api.NoSuchApiServiceException;
import org.opencps.api.model.ApiService;
import org.opencps.api.model.impl.ApiServiceImpl;
import org.opencps.api.model.impl.ApiServiceModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the api service service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see ApiServicePersistence
 * @see ApiServiceUtil
 * @generated
 */
public class ApiServicePersistenceImpl extends BasePersistenceImpl<ApiService>
	implements ApiServicePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ApiServiceUtil} to access the api service persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ApiServiceImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ApiServiceModelImpl.ENTITY_CACHE_ENABLED,
			ApiServiceModelImpl.FINDER_CACHE_ENABLED, ApiServiceImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ApiServiceModelImpl.ENTITY_CACHE_ENABLED,
			ApiServiceModelImpl.FINDER_CACHE_ENABLED, ApiServiceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ApiServiceModelImpl.ENTITY_CACHE_ENABLED,
			ApiServiceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_APICODE = new FinderPath(ApiServiceModelImpl.ENTITY_CACHE_ENABLED,
			ApiServiceModelImpl.FINDER_CACHE_ENABLED, ApiServiceImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByApiCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APICODE =
		new FinderPath(ApiServiceModelImpl.ENTITY_CACHE_ENABLED,
			ApiServiceModelImpl.FINDER_CACHE_ENABLED, ApiServiceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByApiCode",
			new String[] { String.class.getName() },
			ApiServiceModelImpl.APICODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_APICODE = new FinderPath(ApiServiceModelImpl.ENTITY_CACHE_ENABLED,
			ApiServiceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByApiCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the api services where apiCode = &#63;.
	 *
	 * @param apiCode the api code
	 * @return the matching api services
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ApiService> findByApiCode(String apiCode)
		throws SystemException {
		return findByApiCode(apiCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the api services where apiCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.api.model.impl.ApiServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param apiCode the api code
	 * @param start the lower bound of the range of api services
	 * @param end the upper bound of the range of api services (not inclusive)
	 * @return the range of matching api services
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ApiService> findByApiCode(String apiCode, int start, int end)
		throws SystemException {
		return findByApiCode(apiCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the api services where apiCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.api.model.impl.ApiServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param apiCode the api code
	 * @param start the lower bound of the range of api services
	 * @param end the upper bound of the range of api services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching api services
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ApiService> findByApiCode(String apiCode, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APICODE;
			finderArgs = new Object[] { apiCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_APICODE;
			finderArgs = new Object[] { apiCode, start, end, orderByComparator };
		}

		List<ApiService> list = (List<ApiService>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ApiService apiService : list) {
				if (!Validator.equals(apiCode, apiService.getApiCode())) {
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

			query.append(_SQL_SELECT_APISERVICE_WHERE);

			boolean bindApiCode = false;

			if (apiCode == null) {
				query.append(_FINDER_COLUMN_APICODE_APICODE_1);
			}
			else if (apiCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_APICODE_APICODE_3);
			}
			else {
				bindApiCode = true;

				query.append(_FINDER_COLUMN_APICODE_APICODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ApiServiceModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindApiCode) {
					qPos.add(apiCode);
				}

				if (!pagination) {
					list = (List<ApiService>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ApiService>(list);
				}
				else {
					list = (List<ApiService>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first api service in the ordered set where apiCode = &#63;.
	 *
	 * @param apiCode the api code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching api service
	 * @throws org.opencps.api.NoSuchApiServiceException if a matching api service could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApiService findByApiCode_First(String apiCode,
		OrderByComparator orderByComparator)
		throws NoSuchApiServiceException, SystemException {
		ApiService apiService = fetchByApiCode_First(apiCode, orderByComparator);

		if (apiService != null) {
			return apiService;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("apiCode=");
		msg.append(apiCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchApiServiceException(msg.toString());
	}

	/**
	 * Returns the first api service in the ordered set where apiCode = &#63;.
	 *
	 * @param apiCode the api code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching api service, or <code>null</code> if a matching api service could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApiService fetchByApiCode_First(String apiCode,
		OrderByComparator orderByComparator) throws SystemException {
		List<ApiService> list = findByApiCode(apiCode, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last api service in the ordered set where apiCode = &#63;.
	 *
	 * @param apiCode the api code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching api service
	 * @throws org.opencps.api.NoSuchApiServiceException if a matching api service could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApiService findByApiCode_Last(String apiCode,
		OrderByComparator orderByComparator)
		throws NoSuchApiServiceException, SystemException {
		ApiService apiService = fetchByApiCode_Last(apiCode, orderByComparator);

		if (apiService != null) {
			return apiService;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("apiCode=");
		msg.append(apiCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchApiServiceException(msg.toString());
	}

	/**
	 * Returns the last api service in the ordered set where apiCode = &#63;.
	 *
	 * @param apiCode the api code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching api service, or <code>null</code> if a matching api service could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApiService fetchByApiCode_Last(String apiCode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByApiCode(apiCode);

		if (count == 0) {
			return null;
		}

		List<ApiService> list = findByApiCode(apiCode, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the api services before and after the current api service in the ordered set where apiCode = &#63;.
	 *
	 * @param apiLogId the primary key of the current api service
	 * @param apiCode the api code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next api service
	 * @throws org.opencps.api.NoSuchApiServiceException if a api service with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApiService[] findByApiCode_PrevAndNext(long apiLogId,
		String apiCode, OrderByComparator orderByComparator)
		throws NoSuchApiServiceException, SystemException {
		ApiService apiService = findByPrimaryKey(apiLogId);

		Session session = null;

		try {
			session = openSession();

			ApiService[] array = new ApiServiceImpl[3];

			array[0] = getByApiCode_PrevAndNext(session, apiService, apiCode,
					orderByComparator, true);

			array[1] = apiService;

			array[2] = getByApiCode_PrevAndNext(session, apiService, apiCode,
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

	protected ApiService getByApiCode_PrevAndNext(Session session,
		ApiService apiService, String apiCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_APISERVICE_WHERE);

		boolean bindApiCode = false;

		if (apiCode == null) {
			query.append(_FINDER_COLUMN_APICODE_APICODE_1);
		}
		else if (apiCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_APICODE_APICODE_3);
		}
		else {
			bindApiCode = true;

			query.append(_FINDER_COLUMN_APICODE_APICODE_2);
		}

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
			query.append(ApiServiceModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindApiCode) {
			qPos.add(apiCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(apiService);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ApiService> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the api services where apiCode = &#63; from the database.
	 *
	 * @param apiCode the api code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByApiCode(String apiCode) throws SystemException {
		for (ApiService apiService : findByApiCode(apiCode, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(apiService);
		}
	}

	/**
	 * Returns the number of api services where apiCode = &#63;.
	 *
	 * @param apiCode the api code
	 * @return the number of matching api services
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByApiCode(String apiCode) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_APICODE;

		Object[] finderArgs = new Object[] { apiCode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_APISERVICE_WHERE);

			boolean bindApiCode = false;

			if (apiCode == null) {
				query.append(_FINDER_COLUMN_APICODE_APICODE_1);
			}
			else if (apiCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_APICODE_APICODE_3);
			}
			else {
				bindApiCode = true;

				query.append(_FINDER_COLUMN_APICODE_APICODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindApiCode) {
					qPos.add(apiCode);
				}

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

	private static final String _FINDER_COLUMN_APICODE_APICODE_1 = "apiService.apiCode IS NULL";
	private static final String _FINDER_COLUMN_APICODE_APICODE_2 = "apiService.apiCode = ?";
	private static final String _FINDER_COLUMN_APICODE_APICODE_3 = "(apiService.apiCode IS NULL OR apiService.apiCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_OID = new FinderPath(ApiServiceModelImpl.ENTITY_CACHE_ENABLED,
			ApiServiceModelImpl.FINDER_CACHE_ENABLED, ApiServiceImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByOid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OID = new FinderPath(ApiServiceModelImpl.ENTITY_CACHE_ENABLED,
			ApiServiceModelImpl.FINDER_CACHE_ENABLED, ApiServiceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByOid",
			new String[] { String.class.getName() },
			ApiServiceModelImpl.OID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_OID = new FinderPath(ApiServiceModelImpl.ENTITY_CACHE_ENABLED,
			ApiServiceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByOid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the api services where oid = &#63;.
	 *
	 * @param oid the oid
	 * @return the matching api services
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ApiService> findByOid(String oid) throws SystemException {
		return findByOid(oid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the api services where oid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.api.model.impl.ApiServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param oid the oid
	 * @param start the lower bound of the range of api services
	 * @param end the upper bound of the range of api services (not inclusive)
	 * @return the range of matching api services
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ApiService> findByOid(String oid, int start, int end)
		throws SystemException {
		return findByOid(oid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the api services where oid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.api.model.impl.ApiServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param oid the oid
	 * @param start the lower bound of the range of api services
	 * @param end the upper bound of the range of api services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching api services
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ApiService> findByOid(String oid, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OID;
			finderArgs = new Object[] { oid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_OID;
			finderArgs = new Object[] { oid, start, end, orderByComparator };
		}

		List<ApiService> list = (List<ApiService>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ApiService apiService : list) {
				if (!Validator.equals(oid, apiService.getOid())) {
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

			query.append(_SQL_SELECT_APISERVICE_WHERE);

			boolean bindOid = false;

			if (oid == null) {
				query.append(_FINDER_COLUMN_OID_OID_1);
			}
			else if (oid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_OID_OID_3);
			}
			else {
				bindOid = true;

				query.append(_FINDER_COLUMN_OID_OID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ApiServiceModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindOid) {
					qPos.add(oid);
				}

				if (!pagination) {
					list = (List<ApiService>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ApiService>(list);
				}
				else {
					list = (List<ApiService>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first api service in the ordered set where oid = &#63;.
	 *
	 * @param oid the oid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching api service
	 * @throws org.opencps.api.NoSuchApiServiceException if a matching api service could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApiService findByOid_First(String oid,
		OrderByComparator orderByComparator)
		throws NoSuchApiServiceException, SystemException {
		ApiService apiService = fetchByOid_First(oid, orderByComparator);

		if (apiService != null) {
			return apiService;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("oid=");
		msg.append(oid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchApiServiceException(msg.toString());
	}

	/**
	 * Returns the first api service in the ordered set where oid = &#63;.
	 *
	 * @param oid the oid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching api service, or <code>null</code> if a matching api service could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApiService fetchByOid_First(String oid,
		OrderByComparator orderByComparator) throws SystemException {
		List<ApiService> list = findByOid(oid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last api service in the ordered set where oid = &#63;.
	 *
	 * @param oid the oid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching api service
	 * @throws org.opencps.api.NoSuchApiServiceException if a matching api service could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApiService findByOid_Last(String oid,
		OrderByComparator orderByComparator)
		throws NoSuchApiServiceException, SystemException {
		ApiService apiService = fetchByOid_Last(oid, orderByComparator);

		if (apiService != null) {
			return apiService;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("oid=");
		msg.append(oid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchApiServiceException(msg.toString());
	}

	/**
	 * Returns the last api service in the ordered set where oid = &#63;.
	 *
	 * @param oid the oid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching api service, or <code>null</code> if a matching api service could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApiService fetchByOid_Last(String oid,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByOid(oid);

		if (count == 0) {
			return null;
		}

		List<ApiService> list = findByOid(oid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the api services before and after the current api service in the ordered set where oid = &#63;.
	 *
	 * @param apiLogId the primary key of the current api service
	 * @param oid the oid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next api service
	 * @throws org.opencps.api.NoSuchApiServiceException if a api service with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApiService[] findByOid_PrevAndNext(long apiLogId, String oid,
		OrderByComparator orderByComparator)
		throws NoSuchApiServiceException, SystemException {
		ApiService apiService = findByPrimaryKey(apiLogId);

		Session session = null;

		try {
			session = openSession();

			ApiService[] array = new ApiServiceImpl[3];

			array[0] = getByOid_PrevAndNext(session, apiService, oid,
					orderByComparator, true);

			array[1] = apiService;

			array[2] = getByOid_PrevAndNext(session, apiService, oid,
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

	protected ApiService getByOid_PrevAndNext(Session session,
		ApiService apiService, String oid, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_APISERVICE_WHERE);

		boolean bindOid = false;

		if (oid == null) {
			query.append(_FINDER_COLUMN_OID_OID_1);
		}
		else if (oid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_OID_OID_3);
		}
		else {
			bindOid = true;

			query.append(_FINDER_COLUMN_OID_OID_2);
		}

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
			query.append(ApiServiceModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindOid) {
			qPos.add(oid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(apiService);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ApiService> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the api services where oid = &#63; from the database.
	 *
	 * @param oid the oid
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByOid(String oid) throws SystemException {
		for (ApiService apiService : findByOid(oid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(apiService);
		}
	}

	/**
	 * Returns the number of api services where oid = &#63;.
	 *
	 * @param oid the oid
	 * @return the number of matching api services
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByOid(String oid) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_OID;

		Object[] finderArgs = new Object[] { oid };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_APISERVICE_WHERE);

			boolean bindOid = false;

			if (oid == null) {
				query.append(_FINDER_COLUMN_OID_OID_1);
			}
			else if (oid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_OID_OID_3);
			}
			else {
				bindOid = true;

				query.append(_FINDER_COLUMN_OID_OID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindOid) {
					qPos.add(oid);
				}

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

	private static final String _FINDER_COLUMN_OID_OID_1 = "apiService.oid IS NULL";
	private static final String _FINDER_COLUMN_OID_OID_2 = "apiService.oid = ?";
	private static final String _FINDER_COLUMN_OID_OID_3 = "(apiService.oid IS NULL OR apiService.oid = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_A_O = new FinderPath(ApiServiceModelImpl.ENTITY_CACHE_ENABLED,
			ApiServiceModelImpl.FINDER_CACHE_ENABLED, ApiServiceImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByA_O",
			new String[] {
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_O = new FinderPath(ApiServiceModelImpl.ENTITY_CACHE_ENABLED,
			ApiServiceModelImpl.FINDER_CACHE_ENABLED, ApiServiceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByA_O",
			new String[] { String.class.getName(), String.class.getName() },
			ApiServiceModelImpl.APICODE_COLUMN_BITMASK |
			ApiServiceModelImpl.OID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_A_O = new FinderPath(ApiServiceModelImpl.ENTITY_CACHE_ENABLED,
			ApiServiceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByA_O",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns all the api services where apiCode = &#63; and oid = &#63;.
	 *
	 * @param apiCode the api code
	 * @param oid the oid
	 * @return the matching api services
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ApiService> findByA_O(String apiCode, String oid)
		throws SystemException {
		return findByA_O(apiCode, oid, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the api services where apiCode = &#63; and oid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.api.model.impl.ApiServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param apiCode the api code
	 * @param oid the oid
	 * @param start the lower bound of the range of api services
	 * @param end the upper bound of the range of api services (not inclusive)
	 * @return the range of matching api services
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ApiService> findByA_O(String apiCode, String oid, int start,
		int end) throws SystemException {
		return findByA_O(apiCode, oid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the api services where apiCode = &#63; and oid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.api.model.impl.ApiServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param apiCode the api code
	 * @param oid the oid
	 * @param start the lower bound of the range of api services
	 * @param end the upper bound of the range of api services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching api services
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ApiService> findByA_O(String apiCode, String oid, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_O;
			finderArgs = new Object[] { apiCode, oid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_A_O;
			finderArgs = new Object[] {
					apiCode, oid,
					
					start, end, orderByComparator
				};
		}

		List<ApiService> list = (List<ApiService>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ApiService apiService : list) {
				if (!Validator.equals(apiCode, apiService.getApiCode()) ||
						!Validator.equals(oid, apiService.getOid())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_APISERVICE_WHERE);

			boolean bindApiCode = false;

			if (apiCode == null) {
				query.append(_FINDER_COLUMN_A_O_APICODE_1);
			}
			else if (apiCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_A_O_APICODE_3);
			}
			else {
				bindApiCode = true;

				query.append(_FINDER_COLUMN_A_O_APICODE_2);
			}

			boolean bindOid = false;

			if (oid == null) {
				query.append(_FINDER_COLUMN_A_O_OID_1);
			}
			else if (oid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_A_O_OID_3);
			}
			else {
				bindOid = true;

				query.append(_FINDER_COLUMN_A_O_OID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ApiServiceModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindApiCode) {
					qPos.add(apiCode);
				}

				if (bindOid) {
					qPos.add(oid);
				}

				if (!pagination) {
					list = (List<ApiService>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ApiService>(list);
				}
				else {
					list = (List<ApiService>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first api service in the ordered set where apiCode = &#63; and oid = &#63;.
	 *
	 * @param apiCode the api code
	 * @param oid the oid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching api service
	 * @throws org.opencps.api.NoSuchApiServiceException if a matching api service could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApiService findByA_O_First(String apiCode, String oid,
		OrderByComparator orderByComparator)
		throws NoSuchApiServiceException, SystemException {
		ApiService apiService = fetchByA_O_First(apiCode, oid, orderByComparator);

		if (apiService != null) {
			return apiService;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("apiCode=");
		msg.append(apiCode);

		msg.append(", oid=");
		msg.append(oid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchApiServiceException(msg.toString());
	}

	/**
	 * Returns the first api service in the ordered set where apiCode = &#63; and oid = &#63;.
	 *
	 * @param apiCode the api code
	 * @param oid the oid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching api service, or <code>null</code> if a matching api service could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApiService fetchByA_O_First(String apiCode, String oid,
		OrderByComparator orderByComparator) throws SystemException {
		List<ApiService> list = findByA_O(apiCode, oid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last api service in the ordered set where apiCode = &#63; and oid = &#63;.
	 *
	 * @param apiCode the api code
	 * @param oid the oid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching api service
	 * @throws org.opencps.api.NoSuchApiServiceException if a matching api service could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApiService findByA_O_Last(String apiCode, String oid,
		OrderByComparator orderByComparator)
		throws NoSuchApiServiceException, SystemException {
		ApiService apiService = fetchByA_O_Last(apiCode, oid, orderByComparator);

		if (apiService != null) {
			return apiService;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("apiCode=");
		msg.append(apiCode);

		msg.append(", oid=");
		msg.append(oid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchApiServiceException(msg.toString());
	}

	/**
	 * Returns the last api service in the ordered set where apiCode = &#63; and oid = &#63;.
	 *
	 * @param apiCode the api code
	 * @param oid the oid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching api service, or <code>null</code> if a matching api service could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApiService fetchByA_O_Last(String apiCode, String oid,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByA_O(apiCode, oid);

		if (count == 0) {
			return null;
		}

		List<ApiService> list = findByA_O(apiCode, oid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the api services before and after the current api service in the ordered set where apiCode = &#63; and oid = &#63;.
	 *
	 * @param apiLogId the primary key of the current api service
	 * @param apiCode the api code
	 * @param oid the oid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next api service
	 * @throws org.opencps.api.NoSuchApiServiceException if a api service with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApiService[] findByA_O_PrevAndNext(long apiLogId, String apiCode,
		String oid, OrderByComparator orderByComparator)
		throws NoSuchApiServiceException, SystemException {
		ApiService apiService = findByPrimaryKey(apiLogId);

		Session session = null;

		try {
			session = openSession();

			ApiService[] array = new ApiServiceImpl[3];

			array[0] = getByA_O_PrevAndNext(session, apiService, apiCode, oid,
					orderByComparator, true);

			array[1] = apiService;

			array[2] = getByA_O_PrevAndNext(session, apiService, apiCode, oid,
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

	protected ApiService getByA_O_PrevAndNext(Session session,
		ApiService apiService, String apiCode, String oid,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_APISERVICE_WHERE);

		boolean bindApiCode = false;

		if (apiCode == null) {
			query.append(_FINDER_COLUMN_A_O_APICODE_1);
		}
		else if (apiCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_A_O_APICODE_3);
		}
		else {
			bindApiCode = true;

			query.append(_FINDER_COLUMN_A_O_APICODE_2);
		}

		boolean bindOid = false;

		if (oid == null) {
			query.append(_FINDER_COLUMN_A_O_OID_1);
		}
		else if (oid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_A_O_OID_3);
		}
		else {
			bindOid = true;

			query.append(_FINDER_COLUMN_A_O_OID_2);
		}

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
			query.append(ApiServiceModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindApiCode) {
			qPos.add(apiCode);
		}

		if (bindOid) {
			qPos.add(oid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(apiService);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ApiService> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the api services where apiCode = &#63; and oid = &#63; from the database.
	 *
	 * @param apiCode the api code
	 * @param oid the oid
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByA_O(String apiCode, String oid)
		throws SystemException {
		for (ApiService apiService : findByA_O(apiCode, oid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(apiService);
		}
	}

	/**
	 * Returns the number of api services where apiCode = &#63; and oid = &#63;.
	 *
	 * @param apiCode the api code
	 * @param oid the oid
	 * @return the number of matching api services
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByA_O(String apiCode, String oid) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_A_O;

		Object[] finderArgs = new Object[] { apiCode, oid };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_APISERVICE_WHERE);

			boolean bindApiCode = false;

			if (apiCode == null) {
				query.append(_FINDER_COLUMN_A_O_APICODE_1);
			}
			else if (apiCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_A_O_APICODE_3);
			}
			else {
				bindApiCode = true;

				query.append(_FINDER_COLUMN_A_O_APICODE_2);
			}

			boolean bindOid = false;

			if (oid == null) {
				query.append(_FINDER_COLUMN_A_O_OID_1);
			}
			else if (oid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_A_O_OID_3);
			}
			else {
				bindOid = true;

				query.append(_FINDER_COLUMN_A_O_OID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindApiCode) {
					qPos.add(apiCode);
				}

				if (bindOid) {
					qPos.add(oid);
				}

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

	private static final String _FINDER_COLUMN_A_O_APICODE_1 = "apiService.apiCode IS NULL AND ";
	private static final String _FINDER_COLUMN_A_O_APICODE_2 = "apiService.apiCode = ? AND ";
	private static final String _FINDER_COLUMN_A_O_APICODE_3 = "(apiService.apiCode IS NULL OR apiService.apiCode = '') AND ";
	private static final String _FINDER_COLUMN_A_O_OID_1 = "apiService.oid IS NULL";
	private static final String _FINDER_COLUMN_A_O_OID_2 = "apiService.oid = ?";
	private static final String _FINDER_COLUMN_A_O_OID_3 = "(apiService.oid IS NULL OR apiService.oid = '')";

	public ApiServicePersistenceImpl() {
		setModelClass(ApiService.class);
	}

	/**
	 * Caches the api service in the entity cache if it is enabled.
	 *
	 * @param apiService the api service
	 */
	@Override
	public void cacheResult(ApiService apiService) {
		EntityCacheUtil.putResult(ApiServiceModelImpl.ENTITY_CACHE_ENABLED,
			ApiServiceImpl.class, apiService.getPrimaryKey(), apiService);

		apiService.resetOriginalValues();
	}

	/**
	 * Caches the api services in the entity cache if it is enabled.
	 *
	 * @param apiServices the api services
	 */
	@Override
	public void cacheResult(List<ApiService> apiServices) {
		for (ApiService apiService : apiServices) {
			if (EntityCacheUtil.getResult(
						ApiServiceModelImpl.ENTITY_CACHE_ENABLED,
						ApiServiceImpl.class, apiService.getPrimaryKey()) == null) {
				cacheResult(apiService);
			}
			else {
				apiService.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all api services.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ApiServiceImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ApiServiceImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the api service.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ApiService apiService) {
		EntityCacheUtil.removeResult(ApiServiceModelImpl.ENTITY_CACHE_ENABLED,
			ApiServiceImpl.class, apiService.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ApiService> apiServices) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ApiService apiService : apiServices) {
			EntityCacheUtil.removeResult(ApiServiceModelImpl.ENTITY_CACHE_ENABLED,
				ApiServiceImpl.class, apiService.getPrimaryKey());
		}
	}

	/**
	 * Creates a new api service with the primary key. Does not add the api service to the database.
	 *
	 * @param apiLogId the primary key for the new api service
	 * @return the new api service
	 */
	@Override
	public ApiService create(long apiLogId) {
		ApiService apiService = new ApiServiceImpl();

		apiService.setNew(true);
		apiService.setPrimaryKey(apiLogId);

		return apiService;
	}

	/**
	 * Removes the api service with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param apiLogId the primary key of the api service
	 * @return the api service that was removed
	 * @throws org.opencps.api.NoSuchApiServiceException if a api service with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApiService remove(long apiLogId)
		throws NoSuchApiServiceException, SystemException {
		return remove((Serializable)apiLogId);
	}

	/**
	 * Removes the api service with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the api service
	 * @return the api service that was removed
	 * @throws org.opencps.api.NoSuchApiServiceException if a api service with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApiService remove(Serializable primaryKey)
		throws NoSuchApiServiceException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ApiService apiService = (ApiService)session.get(ApiServiceImpl.class,
					primaryKey);

			if (apiService == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchApiServiceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(apiService);
		}
		catch (NoSuchApiServiceException nsee) {
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
	protected ApiService removeImpl(ApiService apiService)
		throws SystemException {
		apiService = toUnwrappedModel(apiService);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(apiService)) {
				apiService = (ApiService)session.get(ApiServiceImpl.class,
						apiService.getPrimaryKeyObj());
			}

			if (apiService != null) {
				session.delete(apiService);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (apiService != null) {
			clearCache(apiService);
		}

		return apiService;
	}

	@Override
	public ApiService updateImpl(org.opencps.api.model.ApiService apiService)
		throws SystemException {
		apiService = toUnwrappedModel(apiService);

		boolean isNew = apiService.isNew();

		ApiServiceModelImpl apiServiceModelImpl = (ApiServiceModelImpl)apiService;

		Session session = null;

		try {
			session = openSession();

			if (apiService.isNew()) {
				session.save(apiService);

				apiService.setNew(false);
			}
			else {
				session.merge(apiService);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ApiServiceModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((apiServiceModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APICODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						apiServiceModelImpl.getOriginalApiCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_APICODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APICODE,
					args);

				args = new Object[] { apiServiceModelImpl.getApiCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_APICODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APICODE,
					args);
			}

			if ((apiServiceModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						apiServiceModelImpl.getOriginalOid()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_OID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OID,
					args);

				args = new Object[] { apiServiceModelImpl.getOid() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_OID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OID,
					args);
			}

			if ((apiServiceModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_O.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						apiServiceModelImpl.getOriginalApiCode(),
						apiServiceModelImpl.getOriginalOid()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_A_O, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_O,
					args);

				args = new Object[] {
						apiServiceModelImpl.getApiCode(),
						apiServiceModelImpl.getOid()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_A_O, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_O,
					args);
			}
		}

		EntityCacheUtil.putResult(ApiServiceModelImpl.ENTITY_CACHE_ENABLED,
			ApiServiceImpl.class, apiService.getPrimaryKey(), apiService);

		return apiService;
	}

	protected ApiService toUnwrappedModel(ApiService apiService) {
		if (apiService instanceof ApiServiceImpl) {
			return apiService;
		}

		ApiServiceImpl apiServiceImpl = new ApiServiceImpl();

		apiServiceImpl.setNew(apiService.isNew());
		apiServiceImpl.setPrimaryKey(apiService.getPrimaryKey());

		apiServiceImpl.setApiLogId(apiService.getApiLogId());
		apiServiceImpl.setCompanyId(apiService.getCompanyId());
		apiServiceImpl.setGroupId(apiService.getGroupId());
		apiServiceImpl.setUserId(apiService.getUserId());
		apiServiceImpl.setCreateDate(apiService.getCreateDate());
		apiServiceImpl.setModifiedDate(apiService.getModifiedDate());
		apiServiceImpl.setOid(apiService.getOid());
		apiServiceImpl.setApiCode(apiService.getApiCode());
		apiServiceImpl.setIpAddress(apiService.getIpAddress());
		apiServiceImpl.setHttpAgent(apiService.getHttpAgent());
		apiServiceImpl.setParams(apiService.getParams());
		apiServiceImpl.setStatus(apiService.getStatus());

		return apiServiceImpl;
	}

	/**
	 * Returns the api service with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the api service
	 * @return the api service
	 * @throws org.opencps.api.NoSuchApiServiceException if a api service with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApiService findByPrimaryKey(Serializable primaryKey)
		throws NoSuchApiServiceException, SystemException {
		ApiService apiService = fetchByPrimaryKey(primaryKey);

		if (apiService == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchApiServiceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return apiService;
	}

	/**
	 * Returns the api service with the primary key or throws a {@link org.opencps.api.NoSuchApiServiceException} if it could not be found.
	 *
	 * @param apiLogId the primary key of the api service
	 * @return the api service
	 * @throws org.opencps.api.NoSuchApiServiceException if a api service with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApiService findByPrimaryKey(long apiLogId)
		throws NoSuchApiServiceException, SystemException {
		return findByPrimaryKey((Serializable)apiLogId);
	}

	/**
	 * Returns the api service with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the api service
	 * @return the api service, or <code>null</code> if a api service with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApiService fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ApiService apiService = (ApiService)EntityCacheUtil.getResult(ApiServiceModelImpl.ENTITY_CACHE_ENABLED,
				ApiServiceImpl.class, primaryKey);

		if (apiService == _nullApiService) {
			return null;
		}

		if (apiService == null) {
			Session session = null;

			try {
				session = openSession();

				apiService = (ApiService)session.get(ApiServiceImpl.class,
						primaryKey);

				if (apiService != null) {
					cacheResult(apiService);
				}
				else {
					EntityCacheUtil.putResult(ApiServiceModelImpl.ENTITY_CACHE_ENABLED,
						ApiServiceImpl.class, primaryKey, _nullApiService);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ApiServiceModelImpl.ENTITY_CACHE_ENABLED,
					ApiServiceImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return apiService;
	}

	/**
	 * Returns the api service with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param apiLogId the primary key of the api service
	 * @return the api service, or <code>null</code> if a api service with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ApiService fetchByPrimaryKey(long apiLogId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)apiLogId);
	}

	/**
	 * Returns all the api services.
	 *
	 * @return the api services
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ApiService> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the api services.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.api.model.impl.ApiServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of api services
	 * @param end the upper bound of the range of api services (not inclusive)
	 * @return the range of api services
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ApiService> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the api services.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.api.model.impl.ApiServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of api services
	 * @param end the upper bound of the range of api services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of api services
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ApiService> findAll(int start, int end,
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

		List<ApiService> list = (List<ApiService>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_APISERVICE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_APISERVICE;

				if (pagination) {
					sql = sql.concat(ApiServiceModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ApiService>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ApiService>(list);
				}
				else {
					list = (List<ApiService>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the api services from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ApiService apiService : findAll()) {
			remove(apiService);
		}
	}

	/**
	 * Returns the number of api services.
	 *
	 * @return the number of api services
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

				Query q = session.createQuery(_SQL_COUNT_APISERVICE);

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
	 * Initializes the api service persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.opencps.api.model.ApiService")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ApiService>> listenersList = new ArrayList<ModelListener<ApiService>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ApiService>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ApiServiceImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_APISERVICE = "SELECT apiService FROM ApiService apiService";
	private static final String _SQL_SELECT_APISERVICE_WHERE = "SELECT apiService FROM ApiService apiService WHERE ";
	private static final String _SQL_COUNT_APISERVICE = "SELECT COUNT(apiService) FROM ApiService apiService";
	private static final String _SQL_COUNT_APISERVICE_WHERE = "SELECT COUNT(apiService) FROM ApiService apiService WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "apiService.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ApiService exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ApiService exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ApiServicePersistenceImpl.class);
	private static ApiService _nullApiService = new ApiServiceImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ApiService> toCacheModel() {
				return _nullApiServiceCacheModel;
			}
		};

	private static CacheModel<ApiService> _nullApiServiceCacheModel = new CacheModel<ApiService>() {
			@Override
			public ApiService toEntityModel() {
				return _nullApiService;
			}
		};
}