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

package org.opencps.processmgt.service.persistence;

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

import org.opencps.processmgt.NoSuchSchedulerJobsException;
import org.opencps.processmgt.model.SchedulerJobs;
import org.opencps.processmgt.model.impl.SchedulerJobsImpl;
import org.opencps.processmgt.model.impl.SchedulerJobsModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the scheduler jobs service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author khoavd
 * @see SchedulerJobsPersistence
 * @see SchedulerJobsUtil
 * @generated
 */
public class SchedulerJobsPersistenceImpl extends BasePersistenceImpl<SchedulerJobs>
	implements SchedulerJobsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link SchedulerJobsUtil} to access the scheduler jobs persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = SchedulerJobsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SchedulerJobsModelImpl.ENTITY_CACHE_ENABLED,
			SchedulerJobsModelImpl.FINDER_CACHE_ENABLED,
			SchedulerJobsImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SchedulerJobsModelImpl.ENTITY_CACHE_ENABLED,
			SchedulerJobsModelImpl.FINDER_CACHE_ENABLED,
			SchedulerJobsImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SchedulerJobsModelImpl.ENTITY_CACHE_ENABLED,
			SchedulerJobsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_S_T = new FinderPath(SchedulerJobsModelImpl.ENTITY_CACHE_ENABLED,
			SchedulerJobsModelImpl.FINDER_CACHE_ENABLED,
			SchedulerJobsImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByS_T",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_T = new FinderPath(SchedulerJobsModelImpl.ENTITY_CACHE_ENABLED,
			SchedulerJobsModelImpl.FINDER_CACHE_ENABLED,
			SchedulerJobsImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByS_T", new String[] { Integer.class.getName() },
			SchedulerJobsModelImpl.SCHEDULERTYPE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_S_T = new FinderPath(SchedulerJobsModelImpl.ENTITY_CACHE_ENABLED,
			SchedulerJobsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByS_T",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the scheduler jobses where schedulerType = &#63;.
	 *
	 * @param schedulerType the scheduler type
	 * @return the matching scheduler jobses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SchedulerJobs> findByS_T(int schedulerType)
		throws SystemException {
		return findByS_T(schedulerType, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the scheduler jobses where schedulerType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.processmgt.model.impl.SchedulerJobsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param schedulerType the scheduler type
	 * @param start the lower bound of the range of scheduler jobses
	 * @param end the upper bound of the range of scheduler jobses (not inclusive)
	 * @return the range of matching scheduler jobses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SchedulerJobs> findByS_T(int schedulerType, int start, int end)
		throws SystemException {
		return findByS_T(schedulerType, start, end, null);
	}

	/**
	 * Returns an ordered range of all the scheduler jobses where schedulerType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.processmgt.model.impl.SchedulerJobsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param schedulerType the scheduler type
	 * @param start the lower bound of the range of scheduler jobses
	 * @param end the upper bound of the range of scheduler jobses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching scheduler jobses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SchedulerJobs> findByS_T(int schedulerType, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_T;
			finderArgs = new Object[] { schedulerType };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_S_T;
			finderArgs = new Object[] {
					schedulerType,
					
					start, end, orderByComparator
				};
		}

		List<SchedulerJobs> list = (List<SchedulerJobs>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SchedulerJobs schedulerJobs : list) {
				if ((schedulerType != schedulerJobs.getSchedulerType())) {
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

			query.append(_SQL_SELECT_SCHEDULERJOBS_WHERE);

			query.append(_FINDER_COLUMN_S_T_SCHEDULERTYPE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(SchedulerJobsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(schedulerType);

				if (!pagination) {
					list = (List<SchedulerJobs>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<SchedulerJobs>(list);
				}
				else {
					list = (List<SchedulerJobs>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first scheduler jobs in the ordered set where schedulerType = &#63;.
	 *
	 * @param schedulerType the scheduler type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching scheduler jobs
	 * @throws org.opencps.processmgt.NoSuchSchedulerJobsException if a matching scheduler jobs could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SchedulerJobs findByS_T_First(int schedulerType,
		OrderByComparator orderByComparator)
		throws NoSuchSchedulerJobsException, SystemException {
		SchedulerJobs schedulerJobs = fetchByS_T_First(schedulerType,
				orderByComparator);

		if (schedulerJobs != null) {
			return schedulerJobs;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("schedulerType=");
		msg.append(schedulerType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSchedulerJobsException(msg.toString());
	}

	/**
	 * Returns the first scheduler jobs in the ordered set where schedulerType = &#63;.
	 *
	 * @param schedulerType the scheduler type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching scheduler jobs, or <code>null</code> if a matching scheduler jobs could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SchedulerJobs fetchByS_T_First(int schedulerType,
		OrderByComparator orderByComparator) throws SystemException {
		List<SchedulerJobs> list = findByS_T(schedulerType, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last scheduler jobs in the ordered set where schedulerType = &#63;.
	 *
	 * @param schedulerType the scheduler type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching scheduler jobs
	 * @throws org.opencps.processmgt.NoSuchSchedulerJobsException if a matching scheduler jobs could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SchedulerJobs findByS_T_Last(int schedulerType,
		OrderByComparator orderByComparator)
		throws NoSuchSchedulerJobsException, SystemException {
		SchedulerJobs schedulerJobs = fetchByS_T_Last(schedulerType,
				orderByComparator);

		if (schedulerJobs != null) {
			return schedulerJobs;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("schedulerType=");
		msg.append(schedulerType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSchedulerJobsException(msg.toString());
	}

	/**
	 * Returns the last scheduler jobs in the ordered set where schedulerType = &#63;.
	 *
	 * @param schedulerType the scheduler type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching scheduler jobs, or <code>null</code> if a matching scheduler jobs could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SchedulerJobs fetchByS_T_Last(int schedulerType,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByS_T(schedulerType);

		if (count == 0) {
			return null;
		}

		List<SchedulerJobs> list = findByS_T(schedulerType, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the scheduler jobses before and after the current scheduler jobs in the ordered set where schedulerType = &#63;.
	 *
	 * @param schedulerJobsId the primary key of the current scheduler jobs
	 * @param schedulerType the scheduler type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next scheduler jobs
	 * @throws org.opencps.processmgt.NoSuchSchedulerJobsException if a scheduler jobs with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SchedulerJobs[] findByS_T_PrevAndNext(long schedulerJobsId,
		int schedulerType, OrderByComparator orderByComparator)
		throws NoSuchSchedulerJobsException, SystemException {
		SchedulerJobs schedulerJobs = findByPrimaryKey(schedulerJobsId);

		Session session = null;

		try {
			session = openSession();

			SchedulerJobs[] array = new SchedulerJobsImpl[3];

			array[0] = getByS_T_PrevAndNext(session, schedulerJobs,
					schedulerType, orderByComparator, true);

			array[1] = schedulerJobs;

			array[2] = getByS_T_PrevAndNext(session, schedulerJobs,
					schedulerType, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected SchedulerJobs getByS_T_PrevAndNext(Session session,
		SchedulerJobs schedulerJobs, int schedulerType,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SCHEDULERJOBS_WHERE);

		query.append(_FINDER_COLUMN_S_T_SCHEDULERTYPE_2);

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
			query.append(SchedulerJobsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(schedulerType);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(schedulerJobs);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SchedulerJobs> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the scheduler jobses where schedulerType = &#63; from the database.
	 *
	 * @param schedulerType the scheduler type
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByS_T(int schedulerType) throws SystemException {
		for (SchedulerJobs schedulerJobs : findByS_T(schedulerType,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(schedulerJobs);
		}
	}

	/**
	 * Returns the number of scheduler jobses where schedulerType = &#63;.
	 *
	 * @param schedulerType the scheduler type
	 * @return the number of matching scheduler jobses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByS_T(int schedulerType) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_S_T;

		Object[] finderArgs = new Object[] { schedulerType };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SCHEDULERJOBS_WHERE);

			query.append(_FINDER_COLUMN_S_T_SCHEDULERTYPE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(schedulerType);

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

	private static final String _FINDER_COLUMN_S_T_SCHEDULERTYPE_2 = "schedulerJobs.schedulerType = ?";

	public SchedulerJobsPersistenceImpl() {
		setModelClass(SchedulerJobs.class);
	}

	/**
	 * Caches the scheduler jobs in the entity cache if it is enabled.
	 *
	 * @param schedulerJobs the scheduler jobs
	 */
	@Override
	public void cacheResult(SchedulerJobs schedulerJobs) {
		EntityCacheUtil.putResult(SchedulerJobsModelImpl.ENTITY_CACHE_ENABLED,
			SchedulerJobsImpl.class, schedulerJobs.getPrimaryKey(),
			schedulerJobs);

		schedulerJobs.resetOriginalValues();
	}

	/**
	 * Caches the scheduler jobses in the entity cache if it is enabled.
	 *
	 * @param schedulerJobses the scheduler jobses
	 */
	@Override
	public void cacheResult(List<SchedulerJobs> schedulerJobses) {
		for (SchedulerJobs schedulerJobs : schedulerJobses) {
			if (EntityCacheUtil.getResult(
						SchedulerJobsModelImpl.ENTITY_CACHE_ENABLED,
						SchedulerJobsImpl.class, schedulerJobs.getPrimaryKey()) == null) {
				cacheResult(schedulerJobs);
			}
			else {
				schedulerJobs.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all scheduler jobses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(SchedulerJobsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(SchedulerJobsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the scheduler jobs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SchedulerJobs schedulerJobs) {
		EntityCacheUtil.removeResult(SchedulerJobsModelImpl.ENTITY_CACHE_ENABLED,
			SchedulerJobsImpl.class, schedulerJobs.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<SchedulerJobs> schedulerJobses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (SchedulerJobs schedulerJobs : schedulerJobses) {
			EntityCacheUtil.removeResult(SchedulerJobsModelImpl.ENTITY_CACHE_ENABLED,
				SchedulerJobsImpl.class, schedulerJobs.getPrimaryKey());
		}
	}

	/**
	 * Creates a new scheduler jobs with the primary key. Does not add the scheduler jobs to the database.
	 *
	 * @param schedulerJobsId the primary key for the new scheduler jobs
	 * @return the new scheduler jobs
	 */
	@Override
	public SchedulerJobs create(long schedulerJobsId) {
		SchedulerJobs schedulerJobs = new SchedulerJobsImpl();

		schedulerJobs.setNew(true);
		schedulerJobs.setPrimaryKey(schedulerJobsId);

		return schedulerJobs;
	}

	/**
	 * Removes the scheduler jobs with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param schedulerJobsId the primary key of the scheduler jobs
	 * @return the scheduler jobs that was removed
	 * @throws org.opencps.processmgt.NoSuchSchedulerJobsException if a scheduler jobs with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SchedulerJobs remove(long schedulerJobsId)
		throws NoSuchSchedulerJobsException, SystemException {
		return remove((Serializable)schedulerJobsId);
	}

	/**
	 * Removes the scheduler jobs with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the scheduler jobs
	 * @return the scheduler jobs that was removed
	 * @throws org.opencps.processmgt.NoSuchSchedulerJobsException if a scheduler jobs with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SchedulerJobs remove(Serializable primaryKey)
		throws NoSuchSchedulerJobsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			SchedulerJobs schedulerJobs = (SchedulerJobs)session.get(SchedulerJobsImpl.class,
					primaryKey);

			if (schedulerJobs == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSchedulerJobsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(schedulerJobs);
		}
		catch (NoSuchSchedulerJobsException nsee) {
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
	protected SchedulerJobs removeImpl(SchedulerJobs schedulerJobs)
		throws SystemException {
		schedulerJobs = toUnwrappedModel(schedulerJobs);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(schedulerJobs)) {
				schedulerJobs = (SchedulerJobs)session.get(SchedulerJobsImpl.class,
						schedulerJobs.getPrimaryKeyObj());
			}

			if (schedulerJobs != null) {
				session.delete(schedulerJobs);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (schedulerJobs != null) {
			clearCache(schedulerJobs);
		}

		return schedulerJobs;
	}

	@Override
	public SchedulerJobs updateImpl(
		org.opencps.processmgt.model.SchedulerJobs schedulerJobs)
		throws SystemException {
		schedulerJobs = toUnwrappedModel(schedulerJobs);

		boolean isNew = schedulerJobs.isNew();

		SchedulerJobsModelImpl schedulerJobsModelImpl = (SchedulerJobsModelImpl)schedulerJobs;

		Session session = null;

		try {
			session = openSession();

			if (schedulerJobs.isNew()) {
				session.save(schedulerJobs);

				schedulerJobs.setNew(false);
			}
			else {
				session.merge(schedulerJobs);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !SchedulerJobsModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((schedulerJobsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_T.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						schedulerJobsModelImpl.getOriginalSchedulerType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_S_T, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_T,
					args);

				args = new Object[] { schedulerJobsModelImpl.getSchedulerType() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_S_T, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_T,
					args);
			}
		}

		EntityCacheUtil.putResult(SchedulerJobsModelImpl.ENTITY_CACHE_ENABLED,
			SchedulerJobsImpl.class, schedulerJobs.getPrimaryKey(),
			schedulerJobs);

		return schedulerJobs;
	}

	protected SchedulerJobs toUnwrappedModel(SchedulerJobs schedulerJobs) {
		if (schedulerJobs instanceof SchedulerJobsImpl) {
			return schedulerJobs;
		}

		SchedulerJobsImpl schedulerJobsImpl = new SchedulerJobsImpl();

		schedulerJobsImpl.setNew(schedulerJobs.isNew());
		schedulerJobsImpl.setPrimaryKey(schedulerJobs.getPrimaryKey());

		schedulerJobsImpl.setSchedulerJobsId(schedulerJobs.getSchedulerJobsId());
		schedulerJobsImpl.setCreateDate(schedulerJobs.getCreateDate());
		schedulerJobsImpl.setModifiedDate(schedulerJobs.getModifiedDate());
		schedulerJobsImpl.setDossierId(schedulerJobs.getDossierId());
		schedulerJobsImpl.setFileGroupId(schedulerJobs.getFileGroupId());
		schedulerJobsImpl.setProcessWorkflowId(schedulerJobs.getProcessWorkflowId());
		schedulerJobsImpl.setSchedulerType(schedulerJobs.getSchedulerType());
		schedulerJobsImpl.setShedulerPattern(schedulerJobs.getShedulerPattern());
		schedulerJobsImpl.setStatus(schedulerJobs.getStatus());

		return schedulerJobsImpl;
	}

	/**
	 * Returns the scheduler jobs with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the scheduler jobs
	 * @return the scheduler jobs
	 * @throws org.opencps.processmgt.NoSuchSchedulerJobsException if a scheduler jobs with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SchedulerJobs findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSchedulerJobsException, SystemException {
		SchedulerJobs schedulerJobs = fetchByPrimaryKey(primaryKey);

		if (schedulerJobs == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSchedulerJobsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return schedulerJobs;
	}

	/**
	 * Returns the scheduler jobs with the primary key or throws a {@link org.opencps.processmgt.NoSuchSchedulerJobsException} if it could not be found.
	 *
	 * @param schedulerJobsId the primary key of the scheduler jobs
	 * @return the scheduler jobs
	 * @throws org.opencps.processmgt.NoSuchSchedulerJobsException if a scheduler jobs with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SchedulerJobs findByPrimaryKey(long schedulerJobsId)
		throws NoSuchSchedulerJobsException, SystemException {
		return findByPrimaryKey((Serializable)schedulerJobsId);
	}

	/**
	 * Returns the scheduler jobs with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the scheduler jobs
	 * @return the scheduler jobs, or <code>null</code> if a scheduler jobs with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SchedulerJobs fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		SchedulerJobs schedulerJobs = (SchedulerJobs)EntityCacheUtil.getResult(SchedulerJobsModelImpl.ENTITY_CACHE_ENABLED,
				SchedulerJobsImpl.class, primaryKey);

		if (schedulerJobs == _nullSchedulerJobs) {
			return null;
		}

		if (schedulerJobs == null) {
			Session session = null;

			try {
				session = openSession();

				schedulerJobs = (SchedulerJobs)session.get(SchedulerJobsImpl.class,
						primaryKey);

				if (schedulerJobs != null) {
					cacheResult(schedulerJobs);
				}
				else {
					EntityCacheUtil.putResult(SchedulerJobsModelImpl.ENTITY_CACHE_ENABLED,
						SchedulerJobsImpl.class, primaryKey, _nullSchedulerJobs);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(SchedulerJobsModelImpl.ENTITY_CACHE_ENABLED,
					SchedulerJobsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return schedulerJobs;
	}

	/**
	 * Returns the scheduler jobs with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param schedulerJobsId the primary key of the scheduler jobs
	 * @return the scheduler jobs, or <code>null</code> if a scheduler jobs with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SchedulerJobs fetchByPrimaryKey(long schedulerJobsId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)schedulerJobsId);
	}

	/**
	 * Returns all the scheduler jobses.
	 *
	 * @return the scheduler jobses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SchedulerJobs> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the scheduler jobses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.processmgt.model.impl.SchedulerJobsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of scheduler jobses
	 * @param end the upper bound of the range of scheduler jobses (not inclusive)
	 * @return the range of scheduler jobses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SchedulerJobs> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the scheduler jobses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.processmgt.model.impl.SchedulerJobsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of scheduler jobses
	 * @param end the upper bound of the range of scheduler jobses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of scheduler jobses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SchedulerJobs> findAll(int start, int end,
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

		List<SchedulerJobs> list = (List<SchedulerJobs>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SCHEDULERJOBS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SCHEDULERJOBS;

				if (pagination) {
					sql = sql.concat(SchedulerJobsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<SchedulerJobs>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<SchedulerJobs>(list);
				}
				else {
					list = (List<SchedulerJobs>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the scheduler jobses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (SchedulerJobs schedulerJobs : findAll()) {
			remove(schedulerJobs);
		}
	}

	/**
	 * Returns the number of scheduler jobses.
	 *
	 * @return the number of scheduler jobses
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

				Query q = session.createQuery(_SQL_COUNT_SCHEDULERJOBS);

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
	 * Initializes the scheduler jobs persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.opencps.processmgt.model.SchedulerJobs")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<SchedulerJobs>> listenersList = new ArrayList<ModelListener<SchedulerJobs>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<SchedulerJobs>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(SchedulerJobsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_SCHEDULERJOBS = "SELECT schedulerJobs FROM SchedulerJobs schedulerJobs";
	private static final String _SQL_SELECT_SCHEDULERJOBS_WHERE = "SELECT schedulerJobs FROM SchedulerJobs schedulerJobs WHERE ";
	private static final String _SQL_COUNT_SCHEDULERJOBS = "SELECT COUNT(schedulerJobs) FROM SchedulerJobs schedulerJobs";
	private static final String _SQL_COUNT_SCHEDULERJOBS_WHERE = "SELECT COUNT(schedulerJobs) FROM SchedulerJobs schedulerJobs WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "schedulerJobs.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No SchedulerJobs exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No SchedulerJobs exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(SchedulerJobsPersistenceImpl.class);
	private static SchedulerJobs _nullSchedulerJobs = new SchedulerJobsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<SchedulerJobs> toCacheModel() {
				return _nullSchedulerJobsCacheModel;
			}
		};

	private static CacheModel<SchedulerJobs> _nullSchedulerJobsCacheModel = new CacheModel<SchedulerJobs>() {
			@Override
			public SchedulerJobs toEntityModel() {
				return _nullSchedulerJobs;
			}
		};
}