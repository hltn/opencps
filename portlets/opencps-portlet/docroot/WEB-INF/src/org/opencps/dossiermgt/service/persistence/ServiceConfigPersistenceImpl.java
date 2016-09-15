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

package org.opencps.dossiermgt.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
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
import com.liferay.portal.security.permission.InlineSQLHelperUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import org.opencps.dossiermgt.NoSuchServiceConfigException;
import org.opencps.dossiermgt.model.ServiceConfig;
import org.opencps.dossiermgt.model.impl.ServiceConfigImpl;
import org.opencps.dossiermgt.model.impl.ServiceConfigModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the service config service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungnt
 * @see ServiceConfigPersistence
 * @see ServiceConfigUtil
 * @generated
 */
public class ServiceConfigPersistenceImpl extends BasePersistenceImpl<ServiceConfig>
	implements ServiceConfigPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ServiceConfigUtil} to access the service config persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ServiceConfigImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ServiceConfigModelImpl.ENTITY_CACHE_ENABLED,
			ServiceConfigModelImpl.FINDER_CACHE_ENABLED,
			ServiceConfigImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ServiceConfigModelImpl.ENTITY_CACHE_ENABLED,
			ServiceConfigModelImpl.FINDER_CACHE_ENABLED,
			ServiceConfigImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ServiceConfigModelImpl.ENTITY_CACHE_ENABLED,
			ServiceConfigModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERTEMPLATEID =
		new FinderPath(ServiceConfigModelImpl.ENTITY_CACHE_ENABLED,
			ServiceConfigModelImpl.FINDER_CACHE_ENABLED,
			ServiceConfigImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDossierTemplateId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERTEMPLATEID =
		new FinderPath(ServiceConfigModelImpl.ENTITY_CACHE_ENABLED,
			ServiceConfigModelImpl.FINDER_CACHE_ENABLED,
			ServiceConfigImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDossierTemplateId", new String[] { Long.class.getName() },
			ServiceConfigModelImpl.DOSSIERTEMPLATEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERTEMPLATEID = new FinderPath(ServiceConfigModelImpl.ENTITY_CACHE_ENABLED,
			ServiceConfigModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDossierTemplateId", new String[] { Long.class.getName() });

	/**
	 * Returns all the service configs where dossierTemplateId = &#63;.
	 *
	 * @param dossierTemplateId the dossier template ID
	 * @return the matching service configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServiceConfig> findByDossierTemplateId(long dossierTemplateId)
		throws SystemException {
		return findByDossierTemplateId(dossierTemplateId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the service configs where dossierTemplateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.ServiceConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierTemplateId the dossier template ID
	 * @param start the lower bound of the range of service configs
	 * @param end the upper bound of the range of service configs (not inclusive)
	 * @return the range of matching service configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServiceConfig> findByDossierTemplateId(long dossierTemplateId,
		int start, int end) throws SystemException {
		return findByDossierTemplateId(dossierTemplateId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the service configs where dossierTemplateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.ServiceConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierTemplateId the dossier template ID
	 * @param start the lower bound of the range of service configs
	 * @param end the upper bound of the range of service configs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching service configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServiceConfig> findByDossierTemplateId(long dossierTemplateId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERTEMPLATEID;
			finderArgs = new Object[] { dossierTemplateId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERTEMPLATEID;
			finderArgs = new Object[] {
					dossierTemplateId,
					
					start, end, orderByComparator
				};
		}

		List<ServiceConfig> list = (List<ServiceConfig>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ServiceConfig serviceConfig : list) {
				if ((dossierTemplateId != serviceConfig.getDossierTemplateId())) {
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

			query.append(_SQL_SELECT_SERVICECONFIG_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERTEMPLATEID_DOSSIERTEMPLATEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ServiceConfigModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierTemplateId);

				if (!pagination) {
					list = (List<ServiceConfig>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ServiceConfig>(list);
				}
				else {
					list = (List<ServiceConfig>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first service config in the ordered set where dossierTemplateId = &#63;.
	 *
	 * @param dossierTemplateId the dossier template ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching service config
	 * @throws org.opencps.dossiermgt.NoSuchServiceConfigException if a matching service config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceConfig findByDossierTemplateId_First(long dossierTemplateId,
		OrderByComparator orderByComparator)
		throws NoSuchServiceConfigException, SystemException {
		ServiceConfig serviceConfig = fetchByDossierTemplateId_First(dossierTemplateId,
				orderByComparator);

		if (serviceConfig != null) {
			return serviceConfig;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierTemplateId=");
		msg.append(dossierTemplateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchServiceConfigException(msg.toString());
	}

	/**
	 * Returns the first service config in the ordered set where dossierTemplateId = &#63;.
	 *
	 * @param dossierTemplateId the dossier template ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching service config, or <code>null</code> if a matching service config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceConfig fetchByDossierTemplateId_First(
		long dossierTemplateId, OrderByComparator orderByComparator)
		throws SystemException {
		List<ServiceConfig> list = findByDossierTemplateId(dossierTemplateId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last service config in the ordered set where dossierTemplateId = &#63;.
	 *
	 * @param dossierTemplateId the dossier template ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching service config
	 * @throws org.opencps.dossiermgt.NoSuchServiceConfigException if a matching service config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceConfig findByDossierTemplateId_Last(long dossierTemplateId,
		OrderByComparator orderByComparator)
		throws NoSuchServiceConfigException, SystemException {
		ServiceConfig serviceConfig = fetchByDossierTemplateId_Last(dossierTemplateId,
				orderByComparator);

		if (serviceConfig != null) {
			return serviceConfig;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierTemplateId=");
		msg.append(dossierTemplateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchServiceConfigException(msg.toString());
	}

	/**
	 * Returns the last service config in the ordered set where dossierTemplateId = &#63;.
	 *
	 * @param dossierTemplateId the dossier template ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching service config, or <code>null</code> if a matching service config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceConfig fetchByDossierTemplateId_Last(long dossierTemplateId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByDossierTemplateId(dossierTemplateId);

		if (count == 0) {
			return null;
		}

		List<ServiceConfig> list = findByDossierTemplateId(dossierTemplateId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the service configs before and after the current service config in the ordered set where dossierTemplateId = &#63;.
	 *
	 * @param serviceConfigId the primary key of the current service config
	 * @param dossierTemplateId the dossier template ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next service config
	 * @throws org.opencps.dossiermgt.NoSuchServiceConfigException if a service config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceConfig[] findByDossierTemplateId_PrevAndNext(
		long serviceConfigId, long dossierTemplateId,
		OrderByComparator orderByComparator)
		throws NoSuchServiceConfigException, SystemException {
		ServiceConfig serviceConfig = findByPrimaryKey(serviceConfigId);

		Session session = null;

		try {
			session = openSession();

			ServiceConfig[] array = new ServiceConfigImpl[3];

			array[0] = getByDossierTemplateId_PrevAndNext(session,
					serviceConfig, dossierTemplateId, orderByComparator, true);

			array[1] = serviceConfig;

			array[2] = getByDossierTemplateId_PrevAndNext(session,
					serviceConfig, dossierTemplateId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ServiceConfig getByDossierTemplateId_PrevAndNext(
		Session session, ServiceConfig serviceConfig, long dossierTemplateId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SERVICECONFIG_WHERE);

		query.append(_FINDER_COLUMN_DOSSIERTEMPLATEID_DOSSIERTEMPLATEID_2);

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
			query.append(ServiceConfigModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierTemplateId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(serviceConfig);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ServiceConfig> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the service configs where dossierTemplateId = &#63; from the database.
	 *
	 * @param dossierTemplateId the dossier template ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDossierTemplateId(long dossierTemplateId)
		throws SystemException {
		for (ServiceConfig serviceConfig : findByDossierTemplateId(
				dossierTemplateId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(serviceConfig);
		}
	}

	/**
	 * Returns the number of service configs where dossierTemplateId = &#63;.
	 *
	 * @param dossierTemplateId the dossier template ID
	 * @return the number of matching service configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDossierTemplateId(long dossierTemplateId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERTEMPLATEID;

		Object[] finderArgs = new Object[] { dossierTemplateId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SERVICECONFIG_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERTEMPLATEID_DOSSIERTEMPLATEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierTemplateId);

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

	private static final String _FINDER_COLUMN_DOSSIERTEMPLATEID_DOSSIERTEMPLATEID_2 =
		"serviceConfig.dossierTemplateId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_G_S = new FinderPath(ServiceConfigModelImpl.ENTITY_CACHE_ENABLED,
			ServiceConfigModelImpl.FINDER_CACHE_ENABLED,
			ServiceConfigImpl.class, FINDER_CLASS_NAME_ENTITY, "fetchByG_S",
			new String[] { Long.class.getName(), Long.class.getName() },
			ServiceConfigModelImpl.GROUPID_COLUMN_BITMASK |
			ServiceConfigModelImpl.SERVICEINFOID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_S = new FinderPath(ServiceConfigModelImpl.ENTITY_CACHE_ENABLED,
			ServiceConfigModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_S",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns the service config where groupId = &#63; and serviceInfoId = &#63; or throws a {@link org.opencps.dossiermgt.NoSuchServiceConfigException} if it could not be found.
	 *
	 * @param groupId the group ID
	 * @param serviceInfoId the service info ID
	 * @return the matching service config
	 * @throws org.opencps.dossiermgt.NoSuchServiceConfigException if a matching service config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceConfig findByG_S(long groupId, long serviceInfoId)
		throws NoSuchServiceConfigException, SystemException {
		ServiceConfig serviceConfig = fetchByG_S(groupId, serviceInfoId);

		if (serviceConfig == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", serviceInfoId=");
			msg.append(serviceInfoId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchServiceConfigException(msg.toString());
		}

		return serviceConfig;
	}

	/**
	 * Returns the service config where groupId = &#63; and serviceInfoId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group ID
	 * @param serviceInfoId the service info ID
	 * @return the matching service config, or <code>null</code> if a matching service config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceConfig fetchByG_S(long groupId, long serviceInfoId)
		throws SystemException {
		return fetchByG_S(groupId, serviceInfoId, true);
	}

	/**
	 * Returns the service config where groupId = &#63; and serviceInfoId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupId the group ID
	 * @param serviceInfoId the service info ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching service config, or <code>null</code> if a matching service config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceConfig fetchByG_S(long groupId, long serviceInfoId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { groupId, serviceInfoId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_G_S,
					finderArgs, this);
		}

		if (result instanceof ServiceConfig) {
			ServiceConfig serviceConfig = (ServiceConfig)result;

			if ((groupId != serviceConfig.getGroupId()) ||
					(serviceInfoId != serviceConfig.getServiceInfoId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_SERVICECONFIG_WHERE);

			query.append(_FINDER_COLUMN_G_S_GROUPID_2);

			query.append(_FINDER_COLUMN_G_S_SERVICEINFOID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(serviceInfoId);

				List<ServiceConfig> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_S,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"ServiceConfigPersistenceImpl.fetchByG_S(long, long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					ServiceConfig serviceConfig = list.get(0);

					result = serviceConfig;

					cacheResult(serviceConfig);

					if ((serviceConfig.getGroupId() != groupId) ||
							(serviceConfig.getServiceInfoId() != serviceInfoId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_S,
							finderArgs, serviceConfig);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_S,
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
			return (ServiceConfig)result;
		}
	}

	/**
	 * Removes the service config where groupId = &#63; and serviceInfoId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param serviceInfoId the service info ID
	 * @return the service config that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceConfig removeByG_S(long groupId, long serviceInfoId)
		throws NoSuchServiceConfigException, SystemException {
		ServiceConfig serviceConfig = findByG_S(groupId, serviceInfoId);

		return remove(serviceConfig);
	}

	/**
	 * Returns the number of service configs where groupId = &#63; and serviceInfoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param serviceInfoId the service info ID
	 * @return the number of matching service configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByG_S(long groupId, long serviceInfoId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_S;

		Object[] finderArgs = new Object[] { groupId, serviceInfoId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_SERVICECONFIG_WHERE);

			query.append(_FINDER_COLUMN_G_S_GROUPID_2);

			query.append(_FINDER_COLUMN_G_S_SERVICEINFOID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(serviceInfoId);

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

	private static final String _FINDER_COLUMN_G_S_GROUPID_2 = "serviceConfig.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_S_SERVICEINFOID_2 = "serviceConfig.serviceInfoId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_G_S_A = new FinderPath(ServiceConfigModelImpl.ENTITY_CACHE_ENABLED,
			ServiceConfigModelImpl.FINDER_CACHE_ENABLED,
			ServiceConfigImpl.class, FINDER_CLASS_NAME_ENTITY, "fetchByG_S_A",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			},
			ServiceConfigModelImpl.GROUPID_COLUMN_BITMASK |
			ServiceConfigModelImpl.SERVICEINFOID_COLUMN_BITMASK |
			ServiceConfigModelImpl.SERVICEADMINISTRATIONINDEX_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_S_A = new FinderPath(ServiceConfigModelImpl.ENTITY_CACHE_ENABLED,
			ServiceConfigModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_S_A",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns the service config where groupId = &#63; and serviceInfoId = &#63; and serviceAdministrationIndex = &#63; or throws a {@link org.opencps.dossiermgt.NoSuchServiceConfigException} if it could not be found.
	 *
	 * @param groupId the group ID
	 * @param serviceInfoId the service info ID
	 * @param serviceAdministrationIndex the service administration index
	 * @return the matching service config
	 * @throws org.opencps.dossiermgt.NoSuchServiceConfigException if a matching service config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceConfig findByG_S_A(long groupId, long serviceInfoId,
		String serviceAdministrationIndex)
		throws NoSuchServiceConfigException, SystemException {
		ServiceConfig serviceConfig = fetchByG_S_A(groupId, serviceInfoId,
				serviceAdministrationIndex);

		if (serviceConfig == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", serviceInfoId=");
			msg.append(serviceInfoId);

			msg.append(", serviceAdministrationIndex=");
			msg.append(serviceAdministrationIndex);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchServiceConfigException(msg.toString());
		}

		return serviceConfig;
	}

	/**
	 * Returns the service config where groupId = &#63; and serviceInfoId = &#63; and serviceAdministrationIndex = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group ID
	 * @param serviceInfoId the service info ID
	 * @param serviceAdministrationIndex the service administration index
	 * @return the matching service config, or <code>null</code> if a matching service config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceConfig fetchByG_S_A(long groupId, long serviceInfoId,
		String serviceAdministrationIndex) throws SystemException {
		return fetchByG_S_A(groupId, serviceInfoId, serviceAdministrationIndex,
			true);
	}

	/**
	 * Returns the service config where groupId = &#63; and serviceInfoId = &#63; and serviceAdministrationIndex = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupId the group ID
	 * @param serviceInfoId the service info ID
	 * @param serviceAdministrationIndex the service administration index
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching service config, or <code>null</code> if a matching service config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceConfig fetchByG_S_A(long groupId, long serviceInfoId,
		String serviceAdministrationIndex, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, serviceInfoId, serviceAdministrationIndex
			};

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_G_S_A,
					finderArgs, this);
		}

		if (result instanceof ServiceConfig) {
			ServiceConfig serviceConfig = (ServiceConfig)result;

			if ((groupId != serviceConfig.getGroupId()) ||
					(serviceInfoId != serviceConfig.getServiceInfoId()) ||
					!Validator.equals(serviceAdministrationIndex,
						serviceConfig.getServiceAdministrationIndex())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_SERVICECONFIG_WHERE);

			query.append(_FINDER_COLUMN_G_S_A_GROUPID_2);

			query.append(_FINDER_COLUMN_G_S_A_SERVICEINFOID_2);

			boolean bindServiceAdministrationIndex = false;

			if (serviceAdministrationIndex == null) {
				query.append(_FINDER_COLUMN_G_S_A_SERVICEADMINISTRATIONINDEX_1);
			}
			else if (serviceAdministrationIndex.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_S_A_SERVICEADMINISTRATIONINDEX_3);
			}
			else {
				bindServiceAdministrationIndex = true;

				query.append(_FINDER_COLUMN_G_S_A_SERVICEADMINISTRATIONINDEX_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(serviceInfoId);

				if (bindServiceAdministrationIndex) {
					qPos.add(serviceAdministrationIndex);
				}

				List<ServiceConfig> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_S_A,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"ServiceConfigPersistenceImpl.fetchByG_S_A(long, long, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					ServiceConfig serviceConfig = list.get(0);

					result = serviceConfig;

					cacheResult(serviceConfig);

					if ((serviceConfig.getGroupId() != groupId) ||
							(serviceConfig.getServiceInfoId() != serviceInfoId) ||
							(serviceConfig.getServiceAdministrationIndex() == null) ||
							!serviceConfig.getServiceAdministrationIndex()
											  .equals(serviceAdministrationIndex)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_S_A,
							finderArgs, serviceConfig);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_S_A,
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
			return (ServiceConfig)result;
		}
	}

	/**
	 * Removes the service config where groupId = &#63; and serviceInfoId = &#63; and serviceAdministrationIndex = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param serviceInfoId the service info ID
	 * @param serviceAdministrationIndex the service administration index
	 * @return the service config that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceConfig removeByG_S_A(long groupId, long serviceInfoId,
		String serviceAdministrationIndex)
		throws NoSuchServiceConfigException, SystemException {
		ServiceConfig serviceConfig = findByG_S_A(groupId, serviceInfoId,
				serviceAdministrationIndex);

		return remove(serviceConfig);
	}

	/**
	 * Returns the number of service configs where groupId = &#63; and serviceInfoId = &#63; and serviceAdministrationIndex = &#63;.
	 *
	 * @param groupId the group ID
	 * @param serviceInfoId the service info ID
	 * @param serviceAdministrationIndex the service administration index
	 * @return the number of matching service configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByG_S_A(long groupId, long serviceInfoId,
		String serviceAdministrationIndex) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_S_A;

		Object[] finderArgs = new Object[] {
				groupId, serviceInfoId, serviceAdministrationIndex
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_SERVICECONFIG_WHERE);

			query.append(_FINDER_COLUMN_G_S_A_GROUPID_2);

			query.append(_FINDER_COLUMN_G_S_A_SERVICEINFOID_2);

			boolean bindServiceAdministrationIndex = false;

			if (serviceAdministrationIndex == null) {
				query.append(_FINDER_COLUMN_G_S_A_SERVICEADMINISTRATIONINDEX_1);
			}
			else if (serviceAdministrationIndex.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_S_A_SERVICEADMINISTRATIONINDEX_3);
			}
			else {
				bindServiceAdministrationIndex = true;

				query.append(_FINDER_COLUMN_G_S_A_SERVICEADMINISTRATIONINDEX_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(serviceInfoId);

				if (bindServiceAdministrationIndex) {
					qPos.add(serviceAdministrationIndex);
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

	private static final String _FINDER_COLUMN_G_S_A_GROUPID_2 = "serviceConfig.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_S_A_SERVICEINFOID_2 = "serviceConfig.serviceInfoId = ? AND ";
	private static final String _FINDER_COLUMN_G_S_A_SERVICEADMINISTRATIONINDEX_1 =
		"serviceConfig.serviceAdministrationIndex IS NULL";
	private static final String _FINDER_COLUMN_G_S_A_SERVICEADMINISTRATIONINDEX_2 =
		"serviceConfig.serviceAdministrationIndex = ?";
	private static final String _FINDER_COLUMN_G_S_A_SERVICEADMINISTRATIONINDEX_3 =
		"(serviceConfig.serviceAdministrationIndex IS NULL OR serviceConfig.serviceAdministrationIndex = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_G_S_G = new FinderPath(ServiceConfigModelImpl.ENTITY_CACHE_ENABLED,
			ServiceConfigModelImpl.FINDER_CACHE_ENABLED,
			ServiceConfigImpl.class, FINDER_CLASS_NAME_ENTITY, "fetchByG_S_G",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			},
			ServiceConfigModelImpl.GROUPID_COLUMN_BITMASK |
			ServiceConfigModelImpl.SERVICEINFOID_COLUMN_BITMASK |
			ServiceConfigModelImpl.GOVAGENCYCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_S_G = new FinderPath(ServiceConfigModelImpl.ENTITY_CACHE_ENABLED,
			ServiceConfigModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_S_G",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns the service config where groupId = &#63; and serviceInfoId = &#63; and govAgencyCode = &#63; or throws a {@link org.opencps.dossiermgt.NoSuchServiceConfigException} if it could not be found.
	 *
	 * @param groupId the group ID
	 * @param serviceInfoId the service info ID
	 * @param govAgencyCode the gov agency code
	 * @return the matching service config
	 * @throws org.opencps.dossiermgt.NoSuchServiceConfigException if a matching service config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceConfig findByG_S_G(long groupId, long serviceInfoId,
		String govAgencyCode)
		throws NoSuchServiceConfigException, SystemException {
		ServiceConfig serviceConfig = fetchByG_S_G(groupId, serviceInfoId,
				govAgencyCode);

		if (serviceConfig == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", serviceInfoId=");
			msg.append(serviceInfoId);

			msg.append(", govAgencyCode=");
			msg.append(govAgencyCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchServiceConfigException(msg.toString());
		}

		return serviceConfig;
	}

	/**
	 * Returns the service config where groupId = &#63; and serviceInfoId = &#63; and govAgencyCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group ID
	 * @param serviceInfoId the service info ID
	 * @param govAgencyCode the gov agency code
	 * @return the matching service config, or <code>null</code> if a matching service config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceConfig fetchByG_S_G(long groupId, long serviceInfoId,
		String govAgencyCode) throws SystemException {
		return fetchByG_S_G(groupId, serviceInfoId, govAgencyCode, true);
	}

	/**
	 * Returns the service config where groupId = &#63; and serviceInfoId = &#63; and govAgencyCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupId the group ID
	 * @param serviceInfoId the service info ID
	 * @param govAgencyCode the gov agency code
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching service config, or <code>null</code> if a matching service config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceConfig fetchByG_S_G(long groupId, long serviceInfoId,
		String govAgencyCode, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, serviceInfoId, govAgencyCode };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_G_S_G,
					finderArgs, this);
		}

		if (result instanceof ServiceConfig) {
			ServiceConfig serviceConfig = (ServiceConfig)result;

			if ((groupId != serviceConfig.getGroupId()) ||
					(serviceInfoId != serviceConfig.getServiceInfoId()) ||
					!Validator.equals(govAgencyCode,
						serviceConfig.getGovAgencyCode())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_SERVICECONFIG_WHERE);

			query.append(_FINDER_COLUMN_G_S_G_GROUPID_2);

			query.append(_FINDER_COLUMN_G_S_G_SERVICEINFOID_2);

			boolean bindGovAgencyCode = false;

			if (govAgencyCode == null) {
				query.append(_FINDER_COLUMN_G_S_G_GOVAGENCYCODE_1);
			}
			else if (govAgencyCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_S_G_GOVAGENCYCODE_3);
			}
			else {
				bindGovAgencyCode = true;

				query.append(_FINDER_COLUMN_G_S_G_GOVAGENCYCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(serviceInfoId);

				if (bindGovAgencyCode) {
					qPos.add(govAgencyCode);
				}

				List<ServiceConfig> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_S_G,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"ServiceConfigPersistenceImpl.fetchByG_S_G(long, long, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					ServiceConfig serviceConfig = list.get(0);

					result = serviceConfig;

					cacheResult(serviceConfig);

					if ((serviceConfig.getGroupId() != groupId) ||
							(serviceConfig.getServiceInfoId() != serviceInfoId) ||
							(serviceConfig.getGovAgencyCode() == null) ||
							!serviceConfig.getGovAgencyCode()
											  .equals(govAgencyCode)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_S_G,
							finderArgs, serviceConfig);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_S_G,
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
			return (ServiceConfig)result;
		}
	}

	/**
	 * Removes the service config where groupId = &#63; and serviceInfoId = &#63; and govAgencyCode = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param serviceInfoId the service info ID
	 * @param govAgencyCode the gov agency code
	 * @return the service config that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceConfig removeByG_S_G(long groupId, long serviceInfoId,
		String govAgencyCode)
		throws NoSuchServiceConfigException, SystemException {
		ServiceConfig serviceConfig = findByG_S_G(groupId, serviceInfoId,
				govAgencyCode);

		return remove(serviceConfig);
	}

	/**
	 * Returns the number of service configs where groupId = &#63; and serviceInfoId = &#63; and govAgencyCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param serviceInfoId the service info ID
	 * @param govAgencyCode the gov agency code
	 * @return the number of matching service configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByG_S_G(long groupId, long serviceInfoId,
		String govAgencyCode) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_S_G;

		Object[] finderArgs = new Object[] { groupId, serviceInfoId, govAgencyCode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_SERVICECONFIG_WHERE);

			query.append(_FINDER_COLUMN_G_S_G_GROUPID_2);

			query.append(_FINDER_COLUMN_G_S_G_SERVICEINFOID_2);

			boolean bindGovAgencyCode = false;

			if (govAgencyCode == null) {
				query.append(_FINDER_COLUMN_G_S_G_GOVAGENCYCODE_1);
			}
			else if (govAgencyCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_S_G_GOVAGENCYCODE_3);
			}
			else {
				bindGovAgencyCode = true;

				query.append(_FINDER_COLUMN_G_S_G_GOVAGENCYCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(serviceInfoId);

				if (bindGovAgencyCode) {
					qPos.add(govAgencyCode);
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

	private static final String _FINDER_COLUMN_G_S_G_GROUPID_2 = "serviceConfig.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_S_G_SERVICEINFOID_2 = "serviceConfig.serviceInfoId = ? AND ";
	private static final String _FINDER_COLUMN_G_S_G_GOVAGENCYCODE_1 = "serviceConfig.govAgencyCode IS NULL";
	private static final String _FINDER_COLUMN_G_S_G_GOVAGENCYCODE_2 = "serviceConfig.govAgencyCode = ?";
	private static final String _FINDER_COLUMN_G_S_G_GOVAGENCYCODE_3 = "(serviceConfig.govAgencyCode IS NULL OR serviceConfig.govAgencyCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_M = new FinderPath(ServiceConfigModelImpl.ENTITY_CACHE_ENABLED,
			ServiceConfigModelImpl.FINDER_CACHE_ENABLED,
			ServiceConfigImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByG_M",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_M = new FinderPath(ServiceConfigModelImpl.ENTITY_CACHE_ENABLED,
			ServiceConfigModelImpl.FINDER_CACHE_ENABLED,
			ServiceConfigImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByG_M",
			new String[] { Long.class.getName(), Integer.class.getName() },
			ServiceConfigModelImpl.GROUPID_COLUMN_BITMASK |
			ServiceConfigModelImpl.SERVICEMODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_M = new FinderPath(ServiceConfigModelImpl.ENTITY_CACHE_ENABLED,
			ServiceConfigModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_M",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the service configs where groupId = &#63; and serviceMode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param serviceMode the service mode
	 * @return the matching service configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServiceConfig> findByG_M(long groupId, int serviceMode)
		throws SystemException {
		return findByG_M(groupId, serviceMode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the service configs where groupId = &#63; and serviceMode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.ServiceConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param serviceMode the service mode
	 * @param start the lower bound of the range of service configs
	 * @param end the upper bound of the range of service configs (not inclusive)
	 * @return the range of matching service configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServiceConfig> findByG_M(long groupId, int serviceMode,
		int start, int end) throws SystemException {
		return findByG_M(groupId, serviceMode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the service configs where groupId = &#63; and serviceMode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.ServiceConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param serviceMode the service mode
	 * @param start the lower bound of the range of service configs
	 * @param end the upper bound of the range of service configs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching service configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServiceConfig> findByG_M(long groupId, int serviceMode,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_M;
			finderArgs = new Object[] { groupId, serviceMode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_M;
			finderArgs = new Object[] {
					groupId, serviceMode,
					
					start, end, orderByComparator
				};
		}

		List<ServiceConfig> list = (List<ServiceConfig>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ServiceConfig serviceConfig : list) {
				if ((groupId != serviceConfig.getGroupId()) ||
						(serviceMode != serviceConfig.getServiceMode())) {
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

			query.append(_SQL_SELECT_SERVICECONFIG_WHERE);

			query.append(_FINDER_COLUMN_G_M_GROUPID_2);

			query.append(_FINDER_COLUMN_G_M_SERVICEMODE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ServiceConfigModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(serviceMode);

				if (!pagination) {
					list = (List<ServiceConfig>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ServiceConfig>(list);
				}
				else {
					list = (List<ServiceConfig>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first service config in the ordered set where groupId = &#63; and serviceMode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param serviceMode the service mode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching service config
	 * @throws org.opencps.dossiermgt.NoSuchServiceConfigException if a matching service config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceConfig findByG_M_First(long groupId, int serviceMode,
		OrderByComparator orderByComparator)
		throws NoSuchServiceConfigException, SystemException {
		ServiceConfig serviceConfig = fetchByG_M_First(groupId, serviceMode,
				orderByComparator);

		if (serviceConfig != null) {
			return serviceConfig;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", serviceMode=");
		msg.append(serviceMode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchServiceConfigException(msg.toString());
	}

	/**
	 * Returns the first service config in the ordered set where groupId = &#63; and serviceMode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param serviceMode the service mode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching service config, or <code>null</code> if a matching service config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceConfig fetchByG_M_First(long groupId, int serviceMode,
		OrderByComparator orderByComparator) throws SystemException {
		List<ServiceConfig> list = findByG_M(groupId, serviceMode, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last service config in the ordered set where groupId = &#63; and serviceMode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param serviceMode the service mode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching service config
	 * @throws org.opencps.dossiermgt.NoSuchServiceConfigException if a matching service config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceConfig findByG_M_Last(long groupId, int serviceMode,
		OrderByComparator orderByComparator)
		throws NoSuchServiceConfigException, SystemException {
		ServiceConfig serviceConfig = fetchByG_M_Last(groupId, serviceMode,
				orderByComparator);

		if (serviceConfig != null) {
			return serviceConfig;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", serviceMode=");
		msg.append(serviceMode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchServiceConfigException(msg.toString());
	}

	/**
	 * Returns the last service config in the ordered set where groupId = &#63; and serviceMode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param serviceMode the service mode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching service config, or <code>null</code> if a matching service config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceConfig fetchByG_M_Last(long groupId, int serviceMode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByG_M(groupId, serviceMode);

		if (count == 0) {
			return null;
		}

		List<ServiceConfig> list = findByG_M(groupId, serviceMode, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the service configs before and after the current service config in the ordered set where groupId = &#63; and serviceMode = &#63;.
	 *
	 * @param serviceConfigId the primary key of the current service config
	 * @param groupId the group ID
	 * @param serviceMode the service mode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next service config
	 * @throws org.opencps.dossiermgt.NoSuchServiceConfigException if a service config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceConfig[] findByG_M_PrevAndNext(long serviceConfigId,
		long groupId, int serviceMode, OrderByComparator orderByComparator)
		throws NoSuchServiceConfigException, SystemException {
		ServiceConfig serviceConfig = findByPrimaryKey(serviceConfigId);

		Session session = null;

		try {
			session = openSession();

			ServiceConfig[] array = new ServiceConfigImpl[3];

			array[0] = getByG_M_PrevAndNext(session, serviceConfig, groupId,
					serviceMode, orderByComparator, true);

			array[1] = serviceConfig;

			array[2] = getByG_M_PrevAndNext(session, serviceConfig, groupId,
					serviceMode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ServiceConfig getByG_M_PrevAndNext(Session session,
		ServiceConfig serviceConfig, long groupId, int serviceMode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SERVICECONFIG_WHERE);

		query.append(_FINDER_COLUMN_G_M_GROUPID_2);

		query.append(_FINDER_COLUMN_G_M_SERVICEMODE_2);

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
			query.append(ServiceConfigModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(serviceMode);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(serviceConfig);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ServiceConfig> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the service configs that the user has permission to view where groupId = &#63; and serviceMode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param serviceMode the service mode
	 * @return the matching service configs that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServiceConfig> filterFindByG_M(long groupId, int serviceMode)
		throws SystemException {
		return filterFindByG_M(groupId, serviceMode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the service configs that the user has permission to view where groupId = &#63; and serviceMode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.ServiceConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param serviceMode the service mode
	 * @param start the lower bound of the range of service configs
	 * @param end the upper bound of the range of service configs (not inclusive)
	 * @return the range of matching service configs that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServiceConfig> filterFindByG_M(long groupId, int serviceMode,
		int start, int end) throws SystemException {
		return filterFindByG_M(groupId, serviceMode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the service configs that the user has permissions to view where groupId = &#63; and serviceMode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.ServiceConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param serviceMode the service mode
	 * @param start the lower bound of the range of service configs
	 * @param end the upper bound of the range of service configs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching service configs that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServiceConfig> filterFindByG_M(long groupId, int serviceMode,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return findByG_M(groupId, serviceMode, start, end, orderByComparator);
		}

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_SERVICECONFIG_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_SERVICECONFIG_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_G_M_GROUPID_2);

		query.append(_FINDER_COLUMN_G_M_SERVICEMODE_2);

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_SERVICECONFIG_NO_INLINE_DISTINCT_WHERE_2);
		}

		if (orderByComparator != null) {
			if (getDB().isSupportsInlineDistinct()) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator, true);
			}
			else {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_TABLE,
					orderByComparator, true);
			}
		}
		else {
			if (getDB().isSupportsInlineDistinct()) {
				query.append(ServiceConfigModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(ServiceConfigModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				ServiceConfig.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN, groupId);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			if (getDB().isSupportsInlineDistinct()) {
				q.addEntity(_FILTER_ENTITY_ALIAS, ServiceConfigImpl.class);
			}
			else {
				q.addEntity(_FILTER_ENTITY_TABLE, ServiceConfigImpl.class);
			}

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(groupId);

			qPos.add(serviceMode);

			return (List<ServiceConfig>)QueryUtil.list(q, getDialect(), start,
				end);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	/**
	 * Returns the service configs before and after the current service config in the ordered set of service configs that the user has permission to view where groupId = &#63; and serviceMode = &#63;.
	 *
	 * @param serviceConfigId the primary key of the current service config
	 * @param groupId the group ID
	 * @param serviceMode the service mode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next service config
	 * @throws org.opencps.dossiermgt.NoSuchServiceConfigException if a service config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceConfig[] filterFindByG_M_PrevAndNext(long serviceConfigId,
		long groupId, int serviceMode, OrderByComparator orderByComparator)
		throws NoSuchServiceConfigException, SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return findByG_M_PrevAndNext(serviceConfigId, groupId, serviceMode,
				orderByComparator);
		}

		ServiceConfig serviceConfig = findByPrimaryKey(serviceConfigId);

		Session session = null;

		try {
			session = openSession();

			ServiceConfig[] array = new ServiceConfigImpl[3];

			array[0] = filterGetByG_M_PrevAndNext(session, serviceConfig,
					groupId, serviceMode, orderByComparator, true);

			array[1] = serviceConfig;

			array[2] = filterGetByG_M_PrevAndNext(session, serviceConfig,
					groupId, serviceMode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ServiceConfig filterGetByG_M_PrevAndNext(Session session,
		ServiceConfig serviceConfig, long groupId, int serviceMode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_SERVICECONFIG_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_SERVICECONFIG_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_G_M_GROUPID_2);

		query.append(_FINDER_COLUMN_G_M_SERVICEMODE_2);

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_SERVICECONFIG_NO_INLINE_DISTINCT_WHERE_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				if (getDB().isSupportsInlineDistinct()) {
					query.append(_ORDER_BY_ENTITY_ALIAS);
				}
				else {
					query.append(_ORDER_BY_ENTITY_TABLE);
				}

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
				if (getDB().isSupportsInlineDistinct()) {
					query.append(_ORDER_BY_ENTITY_ALIAS);
				}
				else {
					query.append(_ORDER_BY_ENTITY_TABLE);
				}

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
			if (getDB().isSupportsInlineDistinct()) {
				query.append(ServiceConfigModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(ServiceConfigModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				ServiceConfig.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN, groupId);

		SQLQuery q = session.createSQLQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		if (getDB().isSupportsInlineDistinct()) {
			q.addEntity(_FILTER_ENTITY_ALIAS, ServiceConfigImpl.class);
		}
		else {
			q.addEntity(_FILTER_ENTITY_TABLE, ServiceConfigImpl.class);
		}

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(serviceMode);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(serviceConfig);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ServiceConfig> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the service configs where groupId = &#63; and serviceMode = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param serviceMode the service mode
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByG_M(long groupId, int serviceMode)
		throws SystemException {
		for (ServiceConfig serviceConfig : findByG_M(groupId, serviceMode,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(serviceConfig);
		}
	}

	/**
	 * Returns the number of service configs where groupId = &#63; and serviceMode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param serviceMode the service mode
	 * @return the number of matching service configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByG_M(long groupId, int serviceMode)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_M;

		Object[] finderArgs = new Object[] { groupId, serviceMode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_SERVICECONFIG_WHERE);

			query.append(_FINDER_COLUMN_G_M_GROUPID_2);

			query.append(_FINDER_COLUMN_G_M_SERVICEMODE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(serviceMode);

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

	/**
	 * Returns the number of service configs that the user has permission to view where groupId = &#63; and serviceMode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param serviceMode the service mode
	 * @return the number of matching service configs that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int filterCountByG_M(long groupId, int serviceMode)
		throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return countByG_M(groupId, serviceMode);
		}

		StringBundler query = new StringBundler(3);

		query.append(_FILTER_SQL_COUNT_SERVICECONFIG_WHERE);

		query.append(_FINDER_COLUMN_G_M_GROUPID_2);

		query.append(_FINDER_COLUMN_G_M_SERVICEMODE_2);

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				ServiceConfig.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN, groupId);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME,
				com.liferay.portal.kernel.dao.orm.Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(groupId);

			qPos.add(serviceMode);

			Long count = (Long)q.uniqueResult();

			return count.intValue();
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	private static final String _FINDER_COLUMN_G_M_GROUPID_2 = "serviceConfig.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_M_SERVICEMODE_2 = "serviceConfig.serviceMode = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_S_G = new FinderPath(ServiceConfigModelImpl.ENTITY_CACHE_ENABLED,
			ServiceConfigModelImpl.FINDER_CACHE_ENABLED,
			ServiceConfigImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByS_G",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_G = new FinderPath(ServiceConfigModelImpl.ENTITY_CACHE_ENABLED,
			ServiceConfigModelImpl.FINDER_CACHE_ENABLED,
			ServiceConfigImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByS_G",
			new String[] { Long.class.getName(), Long.class.getName() },
			ServiceConfigModelImpl.SERVICEINFOID_COLUMN_BITMASK |
			ServiceConfigModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_S_G = new FinderPath(ServiceConfigModelImpl.ENTITY_CACHE_ENABLED,
			ServiceConfigModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByS_G",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the service configs where serviceInfoId = &#63; and groupId = &#63;.
	 *
	 * @param serviceInfoId the service info ID
	 * @param groupId the group ID
	 * @return the matching service configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServiceConfig> findByS_G(long serviceInfoId, long groupId)
		throws SystemException {
		return findByS_G(serviceInfoId, groupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the service configs where serviceInfoId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.ServiceConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param serviceInfoId the service info ID
	 * @param groupId the group ID
	 * @param start the lower bound of the range of service configs
	 * @param end the upper bound of the range of service configs (not inclusive)
	 * @return the range of matching service configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServiceConfig> findByS_G(long serviceInfoId, long groupId,
		int start, int end) throws SystemException {
		return findByS_G(serviceInfoId, groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the service configs where serviceInfoId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.ServiceConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param serviceInfoId the service info ID
	 * @param groupId the group ID
	 * @param start the lower bound of the range of service configs
	 * @param end the upper bound of the range of service configs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching service configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServiceConfig> findByS_G(long serviceInfoId, long groupId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_G;
			finderArgs = new Object[] { serviceInfoId, groupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_S_G;
			finderArgs = new Object[] {
					serviceInfoId, groupId,
					
					start, end, orderByComparator
				};
		}

		List<ServiceConfig> list = (List<ServiceConfig>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ServiceConfig serviceConfig : list) {
				if ((serviceInfoId != serviceConfig.getServiceInfoId()) ||
						(groupId != serviceConfig.getGroupId())) {
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

			query.append(_SQL_SELECT_SERVICECONFIG_WHERE);

			query.append(_FINDER_COLUMN_S_G_SERVICEINFOID_2);

			query.append(_FINDER_COLUMN_S_G_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ServiceConfigModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(serviceInfoId);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<ServiceConfig>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ServiceConfig>(list);
				}
				else {
					list = (List<ServiceConfig>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first service config in the ordered set where serviceInfoId = &#63; and groupId = &#63;.
	 *
	 * @param serviceInfoId the service info ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching service config
	 * @throws org.opencps.dossiermgt.NoSuchServiceConfigException if a matching service config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceConfig findByS_G_First(long serviceInfoId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchServiceConfigException, SystemException {
		ServiceConfig serviceConfig = fetchByS_G_First(serviceInfoId, groupId,
				orderByComparator);

		if (serviceConfig != null) {
			return serviceConfig;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("serviceInfoId=");
		msg.append(serviceInfoId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchServiceConfigException(msg.toString());
	}

	/**
	 * Returns the first service config in the ordered set where serviceInfoId = &#63; and groupId = &#63;.
	 *
	 * @param serviceInfoId the service info ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching service config, or <code>null</code> if a matching service config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceConfig fetchByS_G_First(long serviceInfoId, long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		List<ServiceConfig> list = findByS_G(serviceInfoId, groupId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last service config in the ordered set where serviceInfoId = &#63; and groupId = &#63;.
	 *
	 * @param serviceInfoId the service info ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching service config
	 * @throws org.opencps.dossiermgt.NoSuchServiceConfigException if a matching service config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceConfig findByS_G_Last(long serviceInfoId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchServiceConfigException, SystemException {
		ServiceConfig serviceConfig = fetchByS_G_Last(serviceInfoId, groupId,
				orderByComparator);

		if (serviceConfig != null) {
			return serviceConfig;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("serviceInfoId=");
		msg.append(serviceInfoId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchServiceConfigException(msg.toString());
	}

	/**
	 * Returns the last service config in the ordered set where serviceInfoId = &#63; and groupId = &#63;.
	 *
	 * @param serviceInfoId the service info ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching service config, or <code>null</code> if a matching service config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceConfig fetchByS_G_Last(long serviceInfoId, long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByS_G(serviceInfoId, groupId);

		if (count == 0) {
			return null;
		}

		List<ServiceConfig> list = findByS_G(serviceInfoId, groupId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the service configs before and after the current service config in the ordered set where serviceInfoId = &#63; and groupId = &#63;.
	 *
	 * @param serviceConfigId the primary key of the current service config
	 * @param serviceInfoId the service info ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next service config
	 * @throws org.opencps.dossiermgt.NoSuchServiceConfigException if a service config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceConfig[] findByS_G_PrevAndNext(long serviceConfigId,
		long serviceInfoId, long groupId, OrderByComparator orderByComparator)
		throws NoSuchServiceConfigException, SystemException {
		ServiceConfig serviceConfig = findByPrimaryKey(serviceConfigId);

		Session session = null;

		try {
			session = openSession();

			ServiceConfig[] array = new ServiceConfigImpl[3];

			array[0] = getByS_G_PrevAndNext(session, serviceConfig,
					serviceInfoId, groupId, orderByComparator, true);

			array[1] = serviceConfig;

			array[2] = getByS_G_PrevAndNext(session, serviceConfig,
					serviceInfoId, groupId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ServiceConfig getByS_G_PrevAndNext(Session session,
		ServiceConfig serviceConfig, long serviceInfoId, long groupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SERVICECONFIG_WHERE);

		query.append(_FINDER_COLUMN_S_G_SERVICEINFOID_2);

		query.append(_FINDER_COLUMN_S_G_GROUPID_2);

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
			query.append(ServiceConfigModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(serviceInfoId);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(serviceConfig);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ServiceConfig> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the service configs that the user has permission to view where serviceInfoId = &#63; and groupId = &#63;.
	 *
	 * @param serviceInfoId the service info ID
	 * @param groupId the group ID
	 * @return the matching service configs that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServiceConfig> filterFindByS_G(long serviceInfoId, long groupId)
		throws SystemException {
		return filterFindByS_G(serviceInfoId, groupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the service configs that the user has permission to view where serviceInfoId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.ServiceConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param serviceInfoId the service info ID
	 * @param groupId the group ID
	 * @param start the lower bound of the range of service configs
	 * @param end the upper bound of the range of service configs (not inclusive)
	 * @return the range of matching service configs that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServiceConfig> filterFindByS_G(long serviceInfoId,
		long groupId, int start, int end) throws SystemException {
		return filterFindByS_G(serviceInfoId, groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the service configs that the user has permissions to view where serviceInfoId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.ServiceConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param serviceInfoId the service info ID
	 * @param groupId the group ID
	 * @param start the lower bound of the range of service configs
	 * @param end the upper bound of the range of service configs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching service configs that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServiceConfig> filterFindByS_G(long serviceInfoId,
		long groupId, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return findByS_G(serviceInfoId, groupId, start, end,
				orderByComparator);
		}

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_SERVICECONFIG_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_SERVICECONFIG_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_S_G_SERVICEINFOID_2);

		query.append(_FINDER_COLUMN_S_G_GROUPID_2);

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_SERVICECONFIG_NO_INLINE_DISTINCT_WHERE_2);
		}

		if (orderByComparator != null) {
			if (getDB().isSupportsInlineDistinct()) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator, true);
			}
			else {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_TABLE,
					orderByComparator, true);
			}
		}
		else {
			if (getDB().isSupportsInlineDistinct()) {
				query.append(ServiceConfigModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(ServiceConfigModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				ServiceConfig.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN, groupId);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			if (getDB().isSupportsInlineDistinct()) {
				q.addEntity(_FILTER_ENTITY_ALIAS, ServiceConfigImpl.class);
			}
			else {
				q.addEntity(_FILTER_ENTITY_TABLE, ServiceConfigImpl.class);
			}

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(serviceInfoId);

			qPos.add(groupId);

			return (List<ServiceConfig>)QueryUtil.list(q, getDialect(), start,
				end);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	/**
	 * Returns the service configs before and after the current service config in the ordered set of service configs that the user has permission to view where serviceInfoId = &#63; and groupId = &#63;.
	 *
	 * @param serviceConfigId the primary key of the current service config
	 * @param serviceInfoId the service info ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next service config
	 * @throws org.opencps.dossiermgt.NoSuchServiceConfigException if a service config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceConfig[] filterFindByS_G_PrevAndNext(long serviceConfigId,
		long serviceInfoId, long groupId, OrderByComparator orderByComparator)
		throws NoSuchServiceConfigException, SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return findByS_G_PrevAndNext(serviceConfigId, serviceInfoId,
				groupId, orderByComparator);
		}

		ServiceConfig serviceConfig = findByPrimaryKey(serviceConfigId);

		Session session = null;

		try {
			session = openSession();

			ServiceConfig[] array = new ServiceConfigImpl[3];

			array[0] = filterGetByS_G_PrevAndNext(session, serviceConfig,
					serviceInfoId, groupId, orderByComparator, true);

			array[1] = serviceConfig;

			array[2] = filterGetByS_G_PrevAndNext(session, serviceConfig,
					serviceInfoId, groupId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ServiceConfig filterGetByS_G_PrevAndNext(Session session,
		ServiceConfig serviceConfig, long serviceInfoId, long groupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_SERVICECONFIG_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_SERVICECONFIG_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_S_G_SERVICEINFOID_2);

		query.append(_FINDER_COLUMN_S_G_GROUPID_2);

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_SERVICECONFIG_NO_INLINE_DISTINCT_WHERE_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				if (getDB().isSupportsInlineDistinct()) {
					query.append(_ORDER_BY_ENTITY_ALIAS);
				}
				else {
					query.append(_ORDER_BY_ENTITY_TABLE);
				}

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
				if (getDB().isSupportsInlineDistinct()) {
					query.append(_ORDER_BY_ENTITY_ALIAS);
				}
				else {
					query.append(_ORDER_BY_ENTITY_TABLE);
				}

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
			if (getDB().isSupportsInlineDistinct()) {
				query.append(ServiceConfigModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(ServiceConfigModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				ServiceConfig.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN, groupId);

		SQLQuery q = session.createSQLQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		if (getDB().isSupportsInlineDistinct()) {
			q.addEntity(_FILTER_ENTITY_ALIAS, ServiceConfigImpl.class);
		}
		else {
			q.addEntity(_FILTER_ENTITY_TABLE, ServiceConfigImpl.class);
		}

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(serviceInfoId);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(serviceConfig);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ServiceConfig> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the service configs where serviceInfoId = &#63; and groupId = &#63; from the database.
	 *
	 * @param serviceInfoId the service info ID
	 * @param groupId the group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByS_G(long serviceInfoId, long groupId)
		throws SystemException {
		for (ServiceConfig serviceConfig : findByS_G(serviceInfoId, groupId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(serviceConfig);
		}
	}

	/**
	 * Returns the number of service configs where serviceInfoId = &#63; and groupId = &#63;.
	 *
	 * @param serviceInfoId the service info ID
	 * @param groupId the group ID
	 * @return the number of matching service configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByS_G(long serviceInfoId, long groupId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_S_G;

		Object[] finderArgs = new Object[] { serviceInfoId, groupId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_SERVICECONFIG_WHERE);

			query.append(_FINDER_COLUMN_S_G_SERVICEINFOID_2);

			query.append(_FINDER_COLUMN_S_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(serviceInfoId);

				qPos.add(groupId);

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

	/**
	 * Returns the number of service configs that the user has permission to view where serviceInfoId = &#63; and groupId = &#63;.
	 *
	 * @param serviceInfoId the service info ID
	 * @param groupId the group ID
	 * @return the number of matching service configs that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int filterCountByS_G(long serviceInfoId, long groupId)
		throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return countByS_G(serviceInfoId, groupId);
		}

		StringBundler query = new StringBundler(3);

		query.append(_FILTER_SQL_COUNT_SERVICECONFIG_WHERE);

		query.append(_FINDER_COLUMN_S_G_SERVICEINFOID_2);

		query.append(_FINDER_COLUMN_S_G_GROUPID_2);

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				ServiceConfig.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN, groupId);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME,
				com.liferay.portal.kernel.dao.orm.Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(serviceInfoId);

			qPos.add(groupId);

			Long count = (Long)q.uniqueResult();

			return count.intValue();
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	private static final String _FINDER_COLUMN_S_G_SERVICEINFOID_2 = "serviceConfig.serviceInfoId = ? AND ";
	private static final String _FINDER_COLUMN_S_G_GROUPID_2 = "serviceConfig.groupId = ?";

	public ServiceConfigPersistenceImpl() {
		setModelClass(ServiceConfig.class);
	}

	/**
	 * Caches the service config in the entity cache if it is enabled.
	 *
	 * @param serviceConfig the service config
	 */
	@Override
	public void cacheResult(ServiceConfig serviceConfig) {
		EntityCacheUtil.putResult(ServiceConfigModelImpl.ENTITY_CACHE_ENABLED,
			ServiceConfigImpl.class, serviceConfig.getPrimaryKey(),
			serviceConfig);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_S,
			new Object[] {
				serviceConfig.getGroupId(), serviceConfig.getServiceInfoId()
			}, serviceConfig);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_S_A,
			new Object[] {
				serviceConfig.getGroupId(), serviceConfig.getServiceInfoId(),
				serviceConfig.getServiceAdministrationIndex()
			}, serviceConfig);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_S_G,
			new Object[] {
				serviceConfig.getGroupId(), serviceConfig.getServiceInfoId(),
				serviceConfig.getGovAgencyCode()
			}, serviceConfig);

		serviceConfig.resetOriginalValues();
	}

	/**
	 * Caches the service configs in the entity cache if it is enabled.
	 *
	 * @param serviceConfigs the service configs
	 */
	@Override
	public void cacheResult(List<ServiceConfig> serviceConfigs) {
		for (ServiceConfig serviceConfig : serviceConfigs) {
			if (EntityCacheUtil.getResult(
						ServiceConfigModelImpl.ENTITY_CACHE_ENABLED,
						ServiceConfigImpl.class, serviceConfig.getPrimaryKey()) == null) {
				cacheResult(serviceConfig);
			}
			else {
				serviceConfig.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all service configs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ServiceConfigImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ServiceConfigImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the service config.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ServiceConfig serviceConfig) {
		EntityCacheUtil.removeResult(ServiceConfigModelImpl.ENTITY_CACHE_ENABLED,
			ServiceConfigImpl.class, serviceConfig.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(serviceConfig);
	}

	@Override
	public void clearCache(List<ServiceConfig> serviceConfigs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ServiceConfig serviceConfig : serviceConfigs) {
			EntityCacheUtil.removeResult(ServiceConfigModelImpl.ENTITY_CACHE_ENABLED,
				ServiceConfigImpl.class, serviceConfig.getPrimaryKey());

			clearUniqueFindersCache(serviceConfig);
		}
	}

	protected void cacheUniqueFindersCache(ServiceConfig serviceConfig) {
		if (serviceConfig.isNew()) {
			Object[] args = new Object[] {
					serviceConfig.getGroupId(), serviceConfig.getServiceInfoId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_S, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_S, args,
				serviceConfig);

			args = new Object[] {
					serviceConfig.getGroupId(), serviceConfig.getServiceInfoId(),
					serviceConfig.getServiceAdministrationIndex()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_S_A, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_S_A, args,
				serviceConfig);

			args = new Object[] {
					serviceConfig.getGroupId(), serviceConfig.getServiceInfoId(),
					serviceConfig.getGovAgencyCode()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_S_G, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_S_G, args,
				serviceConfig);
		}
		else {
			ServiceConfigModelImpl serviceConfigModelImpl = (ServiceConfigModelImpl)serviceConfig;

			if ((serviceConfigModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_G_S.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						serviceConfig.getGroupId(),
						serviceConfig.getServiceInfoId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_S, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_S, args,
					serviceConfig);
			}

			if ((serviceConfigModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_G_S_A.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						serviceConfig.getGroupId(),
						serviceConfig.getServiceInfoId(),
						serviceConfig.getServiceAdministrationIndex()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_S_A, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_S_A, args,
					serviceConfig);
			}

			if ((serviceConfigModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_G_S_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						serviceConfig.getGroupId(),
						serviceConfig.getServiceInfoId(),
						serviceConfig.getGovAgencyCode()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_S_G, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_S_G, args,
					serviceConfig);
			}
		}
	}

	protected void clearUniqueFindersCache(ServiceConfig serviceConfig) {
		ServiceConfigModelImpl serviceConfigModelImpl = (ServiceConfigModelImpl)serviceConfig;

		Object[] args = new Object[] {
				serviceConfig.getGroupId(), serviceConfig.getServiceInfoId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_S, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_S, args);

		if ((serviceConfigModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_G_S.getColumnBitmask()) != 0) {
			args = new Object[] {
					serviceConfigModelImpl.getOriginalGroupId(),
					serviceConfigModelImpl.getOriginalServiceInfoId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_S, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_S, args);
		}

		args = new Object[] {
				serviceConfig.getGroupId(), serviceConfig.getServiceInfoId(),
				serviceConfig.getServiceAdministrationIndex()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_S_A, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_S_A, args);

		if ((serviceConfigModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_G_S_A.getColumnBitmask()) != 0) {
			args = new Object[] {
					serviceConfigModelImpl.getOriginalGroupId(),
					serviceConfigModelImpl.getOriginalServiceInfoId(),
					serviceConfigModelImpl.getOriginalServiceAdministrationIndex()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_S_A, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_S_A, args);
		}

		args = new Object[] {
				serviceConfig.getGroupId(), serviceConfig.getServiceInfoId(),
				serviceConfig.getGovAgencyCode()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_S_G, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_S_G, args);

		if ((serviceConfigModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_G_S_G.getColumnBitmask()) != 0) {
			args = new Object[] {
					serviceConfigModelImpl.getOriginalGroupId(),
					serviceConfigModelImpl.getOriginalServiceInfoId(),
					serviceConfigModelImpl.getOriginalGovAgencyCode()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_S_G, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_S_G, args);
		}
	}

	/**
	 * Creates a new service config with the primary key. Does not add the service config to the database.
	 *
	 * @param serviceConfigId the primary key for the new service config
	 * @return the new service config
	 */
	@Override
	public ServiceConfig create(long serviceConfigId) {
		ServiceConfig serviceConfig = new ServiceConfigImpl();

		serviceConfig.setNew(true);
		serviceConfig.setPrimaryKey(serviceConfigId);

		return serviceConfig;
	}

	/**
	 * Removes the service config with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param serviceConfigId the primary key of the service config
	 * @return the service config that was removed
	 * @throws org.opencps.dossiermgt.NoSuchServiceConfigException if a service config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceConfig remove(long serviceConfigId)
		throws NoSuchServiceConfigException, SystemException {
		return remove((Serializable)serviceConfigId);
	}

	/**
	 * Removes the service config with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the service config
	 * @return the service config that was removed
	 * @throws org.opencps.dossiermgt.NoSuchServiceConfigException if a service config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceConfig remove(Serializable primaryKey)
		throws NoSuchServiceConfigException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ServiceConfig serviceConfig = (ServiceConfig)session.get(ServiceConfigImpl.class,
					primaryKey);

			if (serviceConfig == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchServiceConfigException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(serviceConfig);
		}
		catch (NoSuchServiceConfigException nsee) {
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
	protected ServiceConfig removeImpl(ServiceConfig serviceConfig)
		throws SystemException {
		serviceConfig = toUnwrappedModel(serviceConfig);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(serviceConfig)) {
				serviceConfig = (ServiceConfig)session.get(ServiceConfigImpl.class,
						serviceConfig.getPrimaryKeyObj());
			}

			if (serviceConfig != null) {
				session.delete(serviceConfig);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (serviceConfig != null) {
			clearCache(serviceConfig);
		}

		return serviceConfig;
	}

	@Override
	public ServiceConfig updateImpl(
		org.opencps.dossiermgt.model.ServiceConfig serviceConfig)
		throws SystemException {
		serviceConfig = toUnwrappedModel(serviceConfig);

		boolean isNew = serviceConfig.isNew();

		ServiceConfigModelImpl serviceConfigModelImpl = (ServiceConfigModelImpl)serviceConfig;

		Session session = null;

		try {
			session = openSession();

			if (serviceConfig.isNew()) {
				session.save(serviceConfig);

				serviceConfig.setNew(false);
			}
			else {
				session.merge(serviceConfig);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ServiceConfigModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((serviceConfigModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERTEMPLATEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						serviceConfigModelImpl.getOriginalDossierTemplateId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOSSIERTEMPLATEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERTEMPLATEID,
					args);

				args = new Object[] {
						serviceConfigModelImpl.getDossierTemplateId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOSSIERTEMPLATEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERTEMPLATEID,
					args);
			}

			if ((serviceConfigModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_M.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						serviceConfigModelImpl.getOriginalGroupId(),
						serviceConfigModelImpl.getOriginalServiceMode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_M, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_M,
					args);

				args = new Object[] {
						serviceConfigModelImpl.getGroupId(),
						serviceConfigModelImpl.getServiceMode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_M, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_M,
					args);
			}

			if ((serviceConfigModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						serviceConfigModelImpl.getOriginalServiceInfoId(),
						serviceConfigModelImpl.getOriginalGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_S_G, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_G,
					args);

				args = new Object[] {
						serviceConfigModelImpl.getServiceInfoId(),
						serviceConfigModelImpl.getGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_S_G, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_G,
					args);
			}
		}

		EntityCacheUtil.putResult(ServiceConfigModelImpl.ENTITY_CACHE_ENABLED,
			ServiceConfigImpl.class, serviceConfig.getPrimaryKey(),
			serviceConfig);

		clearUniqueFindersCache(serviceConfig);
		cacheUniqueFindersCache(serviceConfig);

		return serviceConfig;
	}

	protected ServiceConfig toUnwrappedModel(ServiceConfig serviceConfig) {
		if (serviceConfig instanceof ServiceConfigImpl) {
			return serviceConfig;
		}

		ServiceConfigImpl serviceConfigImpl = new ServiceConfigImpl();

		serviceConfigImpl.setNew(serviceConfig.isNew());
		serviceConfigImpl.setPrimaryKey(serviceConfig.getPrimaryKey());

		serviceConfigImpl.setServiceConfigId(serviceConfig.getServiceConfigId());
		serviceConfigImpl.setCompanyId(serviceConfig.getCompanyId());
		serviceConfigImpl.setGroupId(serviceConfig.getGroupId());
		serviceConfigImpl.setUserId(serviceConfig.getUserId());
		serviceConfigImpl.setCreateDate(serviceConfig.getCreateDate());
		serviceConfigImpl.setModifiedDate(serviceConfig.getModifiedDate());
		serviceConfigImpl.setServiceInfoId(serviceConfig.getServiceInfoId());
		serviceConfigImpl.setServiceDomainIndex(serviceConfig.getServiceDomainIndex());
		serviceConfigImpl.setServiceAdministrationIndex(serviceConfig.getServiceAdministrationIndex());
		serviceConfigImpl.setDossierTemplateId(serviceConfig.getDossierTemplateId());
		serviceConfigImpl.setGovAgencyCode(serviceConfig.getGovAgencyCode());
		serviceConfigImpl.setGovAgencyName(serviceConfig.getGovAgencyName());
		serviceConfigImpl.setServiceInstruction(serviceConfig.getServiceInstruction());
		serviceConfigImpl.setServiceLevel(serviceConfig.getServiceLevel());
		serviceConfigImpl.setServicePortal(serviceConfig.isServicePortal());
		serviceConfigImpl.setServiceOnegate(serviceConfig.isServiceOnegate());
		serviceConfigImpl.setServiceBackoffice(serviceConfig.isServiceBackoffice());
		serviceConfigImpl.setGovAgencyOrganizationId(serviceConfig.getGovAgencyOrganizationId());
		serviceConfigImpl.setServiceCitizen(serviceConfig.isServiceCitizen());
		serviceConfigImpl.setServiceBusinees(serviceConfig.isServiceBusinees());
		serviceConfigImpl.setServiceProcessId(serviceConfig.getServiceProcessId());
		serviceConfigImpl.setDomainCode(serviceConfig.getDomainCode());
		serviceConfigImpl.setServiceMode(serviceConfig.getServiceMode());
		serviceConfigImpl.setGovAgencyIndex(serviceConfig.getGovAgencyIndex());
		serviceConfigImpl.setServiceUrl(serviceConfig.getServiceUrl());

		return serviceConfigImpl;
	}

	/**
	 * Returns the service config with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the service config
	 * @return the service config
	 * @throws org.opencps.dossiermgt.NoSuchServiceConfigException if a service config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceConfig findByPrimaryKey(Serializable primaryKey)
		throws NoSuchServiceConfigException, SystemException {
		ServiceConfig serviceConfig = fetchByPrimaryKey(primaryKey);

		if (serviceConfig == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchServiceConfigException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return serviceConfig;
	}

	/**
	 * Returns the service config with the primary key or throws a {@link org.opencps.dossiermgt.NoSuchServiceConfigException} if it could not be found.
	 *
	 * @param serviceConfigId the primary key of the service config
	 * @return the service config
	 * @throws org.opencps.dossiermgt.NoSuchServiceConfigException if a service config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceConfig findByPrimaryKey(long serviceConfigId)
		throws NoSuchServiceConfigException, SystemException {
		return findByPrimaryKey((Serializable)serviceConfigId);
	}

	/**
	 * Returns the service config with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the service config
	 * @return the service config, or <code>null</code> if a service config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceConfig fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ServiceConfig serviceConfig = (ServiceConfig)EntityCacheUtil.getResult(ServiceConfigModelImpl.ENTITY_CACHE_ENABLED,
				ServiceConfigImpl.class, primaryKey);

		if (serviceConfig == _nullServiceConfig) {
			return null;
		}

		if (serviceConfig == null) {
			Session session = null;

			try {
				session = openSession();

				serviceConfig = (ServiceConfig)session.get(ServiceConfigImpl.class,
						primaryKey);

				if (serviceConfig != null) {
					cacheResult(serviceConfig);
				}
				else {
					EntityCacheUtil.putResult(ServiceConfigModelImpl.ENTITY_CACHE_ENABLED,
						ServiceConfigImpl.class, primaryKey, _nullServiceConfig);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ServiceConfigModelImpl.ENTITY_CACHE_ENABLED,
					ServiceConfigImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return serviceConfig;
	}

	/**
	 * Returns the service config with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param serviceConfigId the primary key of the service config
	 * @return the service config, or <code>null</code> if a service config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceConfig fetchByPrimaryKey(long serviceConfigId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)serviceConfigId);
	}

	/**
	 * Returns all the service configs.
	 *
	 * @return the service configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServiceConfig> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the service configs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.ServiceConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of service configs
	 * @param end the upper bound of the range of service configs (not inclusive)
	 * @return the range of service configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServiceConfig> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the service configs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.ServiceConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of service configs
	 * @param end the upper bound of the range of service configs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of service configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServiceConfig> findAll(int start, int end,
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

		List<ServiceConfig> list = (List<ServiceConfig>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SERVICECONFIG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SERVICECONFIG;

				if (pagination) {
					sql = sql.concat(ServiceConfigModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ServiceConfig>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ServiceConfig>(list);
				}
				else {
					list = (List<ServiceConfig>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the service configs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ServiceConfig serviceConfig : findAll()) {
			remove(serviceConfig);
		}
	}

	/**
	 * Returns the number of service configs.
	 *
	 * @return the number of service configs
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

				Query q = session.createQuery(_SQL_COUNT_SERVICECONFIG);

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
	 * Initializes the service config persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.opencps.dossiermgt.model.ServiceConfig")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ServiceConfig>> listenersList = new ArrayList<ModelListener<ServiceConfig>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ServiceConfig>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ServiceConfigImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_SERVICECONFIG = "SELECT serviceConfig FROM ServiceConfig serviceConfig";
	private static final String _SQL_SELECT_SERVICECONFIG_WHERE = "SELECT serviceConfig FROM ServiceConfig serviceConfig WHERE ";
	private static final String _SQL_COUNT_SERVICECONFIG = "SELECT COUNT(serviceConfig) FROM ServiceConfig serviceConfig";
	private static final String _SQL_COUNT_SERVICECONFIG_WHERE = "SELECT COUNT(serviceConfig) FROM ServiceConfig serviceConfig WHERE ";
	private static final String _FILTER_ENTITY_TABLE_FILTER_PK_COLUMN = "serviceConfig.serviceConfigId";
	private static final String _FILTER_SQL_SELECT_SERVICECONFIG_WHERE = "SELECT DISTINCT {serviceConfig.*} FROM opencps_service_config serviceConfig WHERE ";
	private static final String _FILTER_SQL_SELECT_SERVICECONFIG_NO_INLINE_DISTINCT_WHERE_1 =
		"SELECT {opencps_service_config.*} FROM (SELECT DISTINCT serviceConfig.serviceConfigId FROM opencps_service_config serviceConfig WHERE ";
	private static final String _FILTER_SQL_SELECT_SERVICECONFIG_NO_INLINE_DISTINCT_WHERE_2 =
		") TEMP_TABLE INNER JOIN opencps_service_config ON TEMP_TABLE.serviceConfigId = opencps_service_config.serviceConfigId";
	private static final String _FILTER_SQL_COUNT_SERVICECONFIG_WHERE = "SELECT COUNT(DISTINCT serviceConfig.serviceConfigId) AS COUNT_VALUE FROM opencps_service_config serviceConfig WHERE ";
	private static final String _FILTER_ENTITY_ALIAS = "serviceConfig";
	private static final String _FILTER_ENTITY_TABLE = "opencps_service_config";
	private static final String _ORDER_BY_ENTITY_ALIAS = "serviceConfig.";
	private static final String _ORDER_BY_ENTITY_TABLE = "opencps_service_config.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ServiceConfig exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ServiceConfig exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ServiceConfigPersistenceImpl.class);
	private static ServiceConfig _nullServiceConfig = new ServiceConfigImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ServiceConfig> toCacheModel() {
				return _nullServiceConfigCacheModel;
			}
		};

	private static CacheModel<ServiceConfig> _nullServiceConfigCacheModel = new CacheModel<ServiceConfig>() {
			@Override
			public ServiceConfig toEntityModel() {
				return _nullServiceConfig;
			}
		};
}