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

import org.opencps.processmgt.NoSuchProcessOrderException;
import org.opencps.processmgt.model.ProcessOrder;
import org.opencps.processmgt.model.impl.ProcessOrderImpl;
import org.opencps.processmgt.model.impl.ProcessOrderModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the process order service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author khoavd
 * @see ProcessOrderPersistence
 * @see ProcessOrderUtil
 * @generated
 */
public class ProcessOrderPersistenceImpl extends BasePersistenceImpl<ProcessOrder>
	implements ProcessOrderPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ProcessOrderUtil} to access the process order persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ProcessOrderImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ProcessOrderModelImpl.ENTITY_CACHE_ENABLED,
			ProcessOrderModelImpl.FINDER_CACHE_ENABLED, ProcessOrderImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ProcessOrderModelImpl.ENTITY_CACHE_ENABLED,
			ProcessOrderModelImpl.FINDER_CACHE_ENABLED, ProcessOrderImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ProcessOrderModelImpl.ENTITY_CACHE_ENABLED,
			ProcessOrderModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_D_F = new FinderPath(ProcessOrderModelImpl.ENTITY_CACHE_ENABLED,
			ProcessOrderModelImpl.FINDER_CACHE_ENABLED, ProcessOrderImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByD_F",
			new String[] { Long.class.getName(), Long.class.getName() },
			ProcessOrderModelImpl.DOSSIERID_COLUMN_BITMASK |
			ProcessOrderModelImpl.FILEGROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_D_F = new FinderPath(ProcessOrderModelImpl.ENTITY_CACHE_ENABLED,
			ProcessOrderModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByD_F",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns the process order where dossierId = &#63; and fileGroupId = &#63; or throws a {@link org.opencps.processmgt.NoSuchProcessOrderException} if it could not be found.
	 *
	 * @param dossierId the dossier ID
	 * @param fileGroupId the file group ID
	 * @return the matching process order
	 * @throws org.opencps.processmgt.NoSuchProcessOrderException if a matching process order could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder findByD_F(long dossierId, long fileGroupId)
		throws NoSuchProcessOrderException, SystemException {
		ProcessOrder processOrder = fetchByD_F(dossierId, fileGroupId);

		if (processOrder == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("dossierId=");
			msg.append(dossierId);

			msg.append(", fileGroupId=");
			msg.append(fileGroupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchProcessOrderException(msg.toString());
		}

		return processOrder;
	}

	/**
	 * Returns the process order where dossierId = &#63; and fileGroupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param dossierId the dossier ID
	 * @param fileGroupId the file group ID
	 * @return the matching process order, or <code>null</code> if a matching process order could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder fetchByD_F(long dossierId, long fileGroupId)
		throws SystemException {
		return fetchByD_F(dossierId, fileGroupId, true);
	}

	/**
	 * Returns the process order where dossierId = &#63; and fileGroupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param dossierId the dossier ID
	 * @param fileGroupId the file group ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching process order, or <code>null</code> if a matching process order could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder fetchByD_F(long dossierId, long fileGroupId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { dossierId, fileGroupId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_D_F,
					finderArgs, this);
		}

		if (result instanceof ProcessOrder) {
			ProcessOrder processOrder = (ProcessOrder)result;

			if ((dossierId != processOrder.getDossierId()) ||
					(fileGroupId != processOrder.getFileGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_PROCESSORDER_WHERE);

			query.append(_FINDER_COLUMN_D_F_DOSSIERID_2);

			query.append(_FINDER_COLUMN_D_F_FILEGROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				qPos.add(fileGroupId);

				List<ProcessOrder> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_D_F,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"ProcessOrderPersistenceImpl.fetchByD_F(long, long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					ProcessOrder processOrder = list.get(0);

					result = processOrder;

					cacheResult(processOrder);

					if ((processOrder.getDossierId() != dossierId) ||
							(processOrder.getFileGroupId() != fileGroupId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_D_F,
							finderArgs, processOrder);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_D_F,
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
			return (ProcessOrder)result;
		}
	}

	/**
	 * Removes the process order where dossierId = &#63; and fileGroupId = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @param fileGroupId the file group ID
	 * @return the process order that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder removeByD_F(long dossierId, long fileGroupId)
		throws NoSuchProcessOrderException, SystemException {
		ProcessOrder processOrder = findByD_F(dossierId, fileGroupId);

		return remove(processOrder);
	}

	/**
	 * Returns the number of process orders where dossierId = &#63; and fileGroupId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param fileGroupId the file group ID
	 * @return the number of matching process orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByD_F(long dossierId, long fileGroupId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_D_F;

		Object[] finderArgs = new Object[] { dossierId, fileGroupId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_PROCESSORDER_WHERE);

			query.append(_FINDER_COLUMN_D_F_DOSSIERID_2);

			query.append(_FINDER_COLUMN_D_F_FILEGROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				qPos.add(fileGroupId);

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

	private static final String _FINDER_COLUMN_D_F_DOSSIERID_2 = "processOrder.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_D_F_FILEGROUPID_2 = "processOrder.fileGroupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PROCESSSTEPID =
		new FinderPath(ProcessOrderModelImpl.ENTITY_CACHE_ENABLED,
			ProcessOrderModelImpl.FINDER_CACHE_ENABLED, ProcessOrderImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByprocessStepId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROCESSSTEPID =
		new FinderPath(ProcessOrderModelImpl.ENTITY_CACHE_ENABLED,
			ProcessOrderModelImpl.FINDER_CACHE_ENABLED, ProcessOrderImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByprocessStepId",
			new String[] { Long.class.getName() },
			ProcessOrderModelImpl.PROCESSSTEPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PROCESSSTEPID = new FinderPath(ProcessOrderModelImpl.ENTITY_CACHE_ENABLED,
			ProcessOrderModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByprocessStepId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the process orders where processStepId = &#63;.
	 *
	 * @param processStepId the process step ID
	 * @return the matching process orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProcessOrder> findByprocessStepId(long processStepId)
		throws SystemException {
		return findByprocessStepId(processStepId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the process orders where processStepId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.processmgt.model.impl.ProcessOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param processStepId the process step ID
	 * @param start the lower bound of the range of process orders
	 * @param end the upper bound of the range of process orders (not inclusive)
	 * @return the range of matching process orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProcessOrder> findByprocessStepId(long processStepId,
		int start, int end) throws SystemException {
		return findByprocessStepId(processStepId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the process orders where processStepId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.processmgt.model.impl.ProcessOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param processStepId the process step ID
	 * @param start the lower bound of the range of process orders
	 * @param end the upper bound of the range of process orders (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching process orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProcessOrder> findByprocessStepId(long processStepId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROCESSSTEPID;
			finderArgs = new Object[] { processStepId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PROCESSSTEPID;
			finderArgs = new Object[] {
					processStepId,
					
					start, end, orderByComparator
				};
		}

		List<ProcessOrder> list = (List<ProcessOrder>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ProcessOrder processOrder : list) {
				if ((processStepId != processOrder.getProcessStepId())) {
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

			query.append(_SQL_SELECT_PROCESSORDER_WHERE);

			query.append(_FINDER_COLUMN_PROCESSSTEPID_PROCESSSTEPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ProcessOrderModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(processStepId);

				if (!pagination) {
					list = (List<ProcessOrder>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ProcessOrder>(list);
				}
				else {
					list = (List<ProcessOrder>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first process order in the ordered set where processStepId = &#63;.
	 *
	 * @param processStepId the process step ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching process order
	 * @throws org.opencps.processmgt.NoSuchProcessOrderException if a matching process order could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder findByprocessStepId_First(long processStepId,
		OrderByComparator orderByComparator)
		throws NoSuchProcessOrderException, SystemException {
		ProcessOrder processOrder = fetchByprocessStepId_First(processStepId,
				orderByComparator);

		if (processOrder != null) {
			return processOrder;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("processStepId=");
		msg.append(processStepId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchProcessOrderException(msg.toString());
	}

	/**
	 * Returns the first process order in the ordered set where processStepId = &#63;.
	 *
	 * @param processStepId the process step ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching process order, or <code>null</code> if a matching process order could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder fetchByprocessStepId_First(long processStepId,
		OrderByComparator orderByComparator) throws SystemException {
		List<ProcessOrder> list = findByprocessStepId(processStepId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last process order in the ordered set where processStepId = &#63;.
	 *
	 * @param processStepId the process step ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching process order
	 * @throws org.opencps.processmgt.NoSuchProcessOrderException if a matching process order could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder findByprocessStepId_Last(long processStepId,
		OrderByComparator orderByComparator)
		throws NoSuchProcessOrderException, SystemException {
		ProcessOrder processOrder = fetchByprocessStepId_Last(processStepId,
				orderByComparator);

		if (processOrder != null) {
			return processOrder;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("processStepId=");
		msg.append(processStepId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchProcessOrderException(msg.toString());
	}

	/**
	 * Returns the last process order in the ordered set where processStepId = &#63;.
	 *
	 * @param processStepId the process step ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching process order, or <code>null</code> if a matching process order could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder fetchByprocessStepId_Last(long processStepId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByprocessStepId(processStepId);

		if (count == 0) {
			return null;
		}

		List<ProcessOrder> list = findByprocessStepId(processStepId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the process orders before and after the current process order in the ordered set where processStepId = &#63;.
	 *
	 * @param processOrderId the primary key of the current process order
	 * @param processStepId the process step ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next process order
	 * @throws org.opencps.processmgt.NoSuchProcessOrderException if a process order with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder[] findByprocessStepId_PrevAndNext(long processOrderId,
		long processStepId, OrderByComparator orderByComparator)
		throws NoSuchProcessOrderException, SystemException {
		ProcessOrder processOrder = findByPrimaryKey(processOrderId);

		Session session = null;

		try {
			session = openSession();

			ProcessOrder[] array = new ProcessOrderImpl[3];

			array[0] = getByprocessStepId_PrevAndNext(session, processOrder,
					processStepId, orderByComparator, true);

			array[1] = processOrder;

			array[2] = getByprocessStepId_PrevAndNext(session, processOrder,
					processStepId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ProcessOrder getByprocessStepId_PrevAndNext(Session session,
		ProcessOrder processOrder, long processStepId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PROCESSORDER_WHERE);

		query.append(_FINDER_COLUMN_PROCESSSTEPID_PROCESSSTEPID_2);

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
			query.append(ProcessOrderModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(processStepId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(processOrder);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ProcessOrder> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the process orders where processStepId = &#63; from the database.
	 *
	 * @param processStepId the process step ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByprocessStepId(long processStepId)
		throws SystemException {
		for (ProcessOrder processOrder : findByprocessStepId(processStepId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(processOrder);
		}
	}

	/**
	 * Returns the number of process orders where processStepId = &#63;.
	 *
	 * @param processStepId the process step ID
	 * @return the number of matching process orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByprocessStepId(long processStepId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PROCESSSTEPID;

		Object[] finderArgs = new Object[] { processStepId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PROCESSORDER_WHERE);

			query.append(_FINDER_COLUMN_PROCESSSTEPID_PROCESSSTEPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(processStepId);

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

	private static final String _FINDER_COLUMN_PROCESSSTEPID_PROCESSSTEPID_2 = "processOrder.processStepId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SERVICEINFOID =
		new FinderPath(ProcessOrderModelImpl.ENTITY_CACHE_ENABLED,
			ProcessOrderModelImpl.FINDER_CACHE_ENABLED, ProcessOrderImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByServiceInfoId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEINFOID =
		new FinderPath(ProcessOrderModelImpl.ENTITY_CACHE_ENABLED,
			ProcessOrderModelImpl.FINDER_CACHE_ENABLED, ProcessOrderImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByServiceInfoId",
			new String[] { Long.class.getName() },
			ProcessOrderModelImpl.SERVICEINFOID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SERVICEINFOID = new FinderPath(ProcessOrderModelImpl.ENTITY_CACHE_ENABLED,
			ProcessOrderModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByServiceInfoId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the process orders where serviceInfoId = &#63;.
	 *
	 * @param serviceInfoId the service info ID
	 * @return the matching process orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProcessOrder> findByServiceInfoId(long serviceInfoId)
		throws SystemException {
		return findByServiceInfoId(serviceInfoId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the process orders where serviceInfoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.processmgt.model.impl.ProcessOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param serviceInfoId the service info ID
	 * @param start the lower bound of the range of process orders
	 * @param end the upper bound of the range of process orders (not inclusive)
	 * @return the range of matching process orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProcessOrder> findByServiceInfoId(long serviceInfoId,
		int start, int end) throws SystemException {
		return findByServiceInfoId(serviceInfoId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the process orders where serviceInfoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.processmgt.model.impl.ProcessOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param serviceInfoId the service info ID
	 * @param start the lower bound of the range of process orders
	 * @param end the upper bound of the range of process orders (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching process orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProcessOrder> findByServiceInfoId(long serviceInfoId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEINFOID;
			finderArgs = new Object[] { serviceInfoId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SERVICEINFOID;
			finderArgs = new Object[] {
					serviceInfoId,
					
					start, end, orderByComparator
				};
		}

		List<ProcessOrder> list = (List<ProcessOrder>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ProcessOrder processOrder : list) {
				if ((serviceInfoId != processOrder.getServiceInfoId())) {
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

			query.append(_SQL_SELECT_PROCESSORDER_WHERE);

			query.append(_FINDER_COLUMN_SERVICEINFOID_SERVICEINFOID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ProcessOrderModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(serviceInfoId);

				if (!pagination) {
					list = (List<ProcessOrder>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ProcessOrder>(list);
				}
				else {
					list = (List<ProcessOrder>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first process order in the ordered set where serviceInfoId = &#63;.
	 *
	 * @param serviceInfoId the service info ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching process order
	 * @throws org.opencps.processmgt.NoSuchProcessOrderException if a matching process order could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder findByServiceInfoId_First(long serviceInfoId,
		OrderByComparator orderByComparator)
		throws NoSuchProcessOrderException, SystemException {
		ProcessOrder processOrder = fetchByServiceInfoId_First(serviceInfoId,
				orderByComparator);

		if (processOrder != null) {
			return processOrder;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("serviceInfoId=");
		msg.append(serviceInfoId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchProcessOrderException(msg.toString());
	}

	/**
	 * Returns the first process order in the ordered set where serviceInfoId = &#63;.
	 *
	 * @param serviceInfoId the service info ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching process order, or <code>null</code> if a matching process order could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder fetchByServiceInfoId_First(long serviceInfoId,
		OrderByComparator orderByComparator) throws SystemException {
		List<ProcessOrder> list = findByServiceInfoId(serviceInfoId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last process order in the ordered set where serviceInfoId = &#63;.
	 *
	 * @param serviceInfoId the service info ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching process order
	 * @throws org.opencps.processmgt.NoSuchProcessOrderException if a matching process order could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder findByServiceInfoId_Last(long serviceInfoId,
		OrderByComparator orderByComparator)
		throws NoSuchProcessOrderException, SystemException {
		ProcessOrder processOrder = fetchByServiceInfoId_Last(serviceInfoId,
				orderByComparator);

		if (processOrder != null) {
			return processOrder;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("serviceInfoId=");
		msg.append(serviceInfoId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchProcessOrderException(msg.toString());
	}

	/**
	 * Returns the last process order in the ordered set where serviceInfoId = &#63;.
	 *
	 * @param serviceInfoId the service info ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching process order, or <code>null</code> if a matching process order could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder fetchByServiceInfoId_Last(long serviceInfoId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByServiceInfoId(serviceInfoId);

		if (count == 0) {
			return null;
		}

		List<ProcessOrder> list = findByServiceInfoId(serviceInfoId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the process orders before and after the current process order in the ordered set where serviceInfoId = &#63;.
	 *
	 * @param processOrderId the primary key of the current process order
	 * @param serviceInfoId the service info ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next process order
	 * @throws org.opencps.processmgt.NoSuchProcessOrderException if a process order with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder[] findByServiceInfoId_PrevAndNext(long processOrderId,
		long serviceInfoId, OrderByComparator orderByComparator)
		throws NoSuchProcessOrderException, SystemException {
		ProcessOrder processOrder = findByPrimaryKey(processOrderId);

		Session session = null;

		try {
			session = openSession();

			ProcessOrder[] array = new ProcessOrderImpl[3];

			array[0] = getByServiceInfoId_PrevAndNext(session, processOrder,
					serviceInfoId, orderByComparator, true);

			array[1] = processOrder;

			array[2] = getByServiceInfoId_PrevAndNext(session, processOrder,
					serviceInfoId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ProcessOrder getByServiceInfoId_PrevAndNext(Session session,
		ProcessOrder processOrder, long serviceInfoId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PROCESSORDER_WHERE);

		query.append(_FINDER_COLUMN_SERVICEINFOID_SERVICEINFOID_2);

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
			query.append(ProcessOrderModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(serviceInfoId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(processOrder);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ProcessOrder> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the process orders where serviceInfoId = &#63; from the database.
	 *
	 * @param serviceInfoId the service info ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByServiceInfoId(long serviceInfoId)
		throws SystemException {
		for (ProcessOrder processOrder : findByServiceInfoId(serviceInfoId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(processOrder);
		}
	}

	/**
	 * Returns the number of process orders where serviceInfoId = &#63;.
	 *
	 * @param serviceInfoId the service info ID
	 * @return the number of matching process orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByServiceInfoId(long serviceInfoId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SERVICEINFOID;

		Object[] finderArgs = new Object[] { serviceInfoId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PROCESSORDER_WHERE);

			query.append(_FINDER_COLUMN_SERVICEINFOID_SERVICEINFOID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

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

	private static final String _FINDER_COLUMN_SERVICEINFOID_SERVICEINFOID_2 = "processOrder.serviceInfoId = ?";

	public ProcessOrderPersistenceImpl() {
		setModelClass(ProcessOrder.class);
	}

	/**
	 * Caches the process order in the entity cache if it is enabled.
	 *
	 * @param processOrder the process order
	 */
	@Override
	public void cacheResult(ProcessOrder processOrder) {
		EntityCacheUtil.putResult(ProcessOrderModelImpl.ENTITY_CACHE_ENABLED,
			ProcessOrderImpl.class, processOrder.getPrimaryKey(), processOrder);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_D_F,
			new Object[] {
				processOrder.getDossierId(), processOrder.getFileGroupId()
			}, processOrder);

		processOrder.resetOriginalValues();
	}

	/**
	 * Caches the process orders in the entity cache if it is enabled.
	 *
	 * @param processOrders the process orders
	 */
	@Override
	public void cacheResult(List<ProcessOrder> processOrders) {
		for (ProcessOrder processOrder : processOrders) {
			if (EntityCacheUtil.getResult(
						ProcessOrderModelImpl.ENTITY_CACHE_ENABLED,
						ProcessOrderImpl.class, processOrder.getPrimaryKey()) == null) {
				cacheResult(processOrder);
			}
			else {
				processOrder.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all process orders.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ProcessOrderImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ProcessOrderImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the process order.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ProcessOrder processOrder) {
		EntityCacheUtil.removeResult(ProcessOrderModelImpl.ENTITY_CACHE_ENABLED,
			ProcessOrderImpl.class, processOrder.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(processOrder);
	}

	@Override
	public void clearCache(List<ProcessOrder> processOrders) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ProcessOrder processOrder : processOrders) {
			EntityCacheUtil.removeResult(ProcessOrderModelImpl.ENTITY_CACHE_ENABLED,
				ProcessOrderImpl.class, processOrder.getPrimaryKey());

			clearUniqueFindersCache(processOrder);
		}
	}

	protected void cacheUniqueFindersCache(ProcessOrder processOrder) {
		if (processOrder.isNew()) {
			Object[] args = new Object[] {
					processOrder.getDossierId(), processOrder.getFileGroupId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_D_F, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_D_F, args,
				processOrder);
		}
		else {
			ProcessOrderModelImpl processOrderModelImpl = (ProcessOrderModelImpl)processOrder;

			if ((processOrderModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_D_F.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						processOrder.getDossierId(),
						processOrder.getFileGroupId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_D_F, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_D_F, args,
					processOrder);
			}
		}
	}

	protected void clearUniqueFindersCache(ProcessOrder processOrder) {
		ProcessOrderModelImpl processOrderModelImpl = (ProcessOrderModelImpl)processOrder;

		Object[] args = new Object[] {
				processOrder.getDossierId(), processOrder.getFileGroupId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_D_F, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_D_F, args);

		if ((processOrderModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_D_F.getColumnBitmask()) != 0) {
			args = new Object[] {
					processOrderModelImpl.getOriginalDossierId(),
					processOrderModelImpl.getOriginalFileGroupId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_D_F, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_D_F, args);
		}
	}

	/**
	 * Creates a new process order with the primary key. Does not add the process order to the database.
	 *
	 * @param processOrderId the primary key for the new process order
	 * @return the new process order
	 */
	@Override
	public ProcessOrder create(long processOrderId) {
		ProcessOrder processOrder = new ProcessOrderImpl();

		processOrder.setNew(true);
		processOrder.setPrimaryKey(processOrderId);

		return processOrder;
	}

	/**
	 * Removes the process order with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param processOrderId the primary key of the process order
	 * @return the process order that was removed
	 * @throws org.opencps.processmgt.NoSuchProcessOrderException if a process order with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder remove(long processOrderId)
		throws NoSuchProcessOrderException, SystemException {
		return remove((Serializable)processOrderId);
	}

	/**
	 * Removes the process order with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the process order
	 * @return the process order that was removed
	 * @throws org.opencps.processmgt.NoSuchProcessOrderException if a process order with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder remove(Serializable primaryKey)
		throws NoSuchProcessOrderException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ProcessOrder processOrder = (ProcessOrder)session.get(ProcessOrderImpl.class,
					primaryKey);

			if (processOrder == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchProcessOrderException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(processOrder);
		}
		catch (NoSuchProcessOrderException nsee) {
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
	protected ProcessOrder removeImpl(ProcessOrder processOrder)
		throws SystemException {
		processOrder = toUnwrappedModel(processOrder);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(processOrder)) {
				processOrder = (ProcessOrder)session.get(ProcessOrderImpl.class,
						processOrder.getPrimaryKeyObj());
			}

			if (processOrder != null) {
				session.delete(processOrder);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (processOrder != null) {
			clearCache(processOrder);
		}

		return processOrder;
	}

	@Override
	public ProcessOrder updateImpl(
		org.opencps.processmgt.model.ProcessOrder processOrder)
		throws SystemException {
		processOrder = toUnwrappedModel(processOrder);

		boolean isNew = processOrder.isNew();

		ProcessOrderModelImpl processOrderModelImpl = (ProcessOrderModelImpl)processOrder;

		Session session = null;

		try {
			session = openSession();

			if (processOrder.isNew()) {
				session.save(processOrder);

				processOrder.setNew(false);
			}
			else {
				session.merge(processOrder);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ProcessOrderModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((processOrderModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROCESSSTEPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						processOrderModelImpl.getOriginalProcessStepId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PROCESSSTEPID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROCESSSTEPID,
					args);

				args = new Object[] { processOrderModelImpl.getProcessStepId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PROCESSSTEPID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROCESSSTEPID,
					args);
			}

			if ((processOrderModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEINFOID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						processOrderModelImpl.getOriginalServiceInfoId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SERVICEINFOID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEINFOID,
					args);

				args = new Object[] { processOrderModelImpl.getServiceInfoId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SERVICEINFOID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEINFOID,
					args);
			}
		}

		EntityCacheUtil.putResult(ProcessOrderModelImpl.ENTITY_CACHE_ENABLED,
			ProcessOrderImpl.class, processOrder.getPrimaryKey(), processOrder);

		clearUniqueFindersCache(processOrder);
		cacheUniqueFindersCache(processOrder);

		return processOrder;
	}

	protected ProcessOrder toUnwrappedModel(ProcessOrder processOrder) {
		if (processOrder instanceof ProcessOrderImpl) {
			return processOrder;
		}

		ProcessOrderImpl processOrderImpl = new ProcessOrderImpl();

		processOrderImpl.setNew(processOrder.isNew());
		processOrderImpl.setPrimaryKey(processOrder.getPrimaryKey());

		processOrderImpl.setProcessOrderId(processOrder.getProcessOrderId());
		processOrderImpl.setCompanyId(processOrder.getCompanyId());
		processOrderImpl.setGroupId(processOrder.getGroupId());
		processOrderImpl.setUserId(processOrder.getUserId());
		processOrderImpl.setCreateDate(processOrder.getCreateDate());
		processOrderImpl.setModifiedDate(processOrder.getModifiedDate());
		processOrderImpl.setServiceInfoId(processOrder.getServiceInfoId());
		processOrderImpl.setDossierTemplateId(processOrder.getDossierTemplateId());
		processOrderImpl.setGovAgencyCode(processOrder.getGovAgencyCode());
		processOrderImpl.setGovAgencyName(processOrder.getGovAgencyName());
		processOrderImpl.setGovAgencyOrganizationId(processOrder.getGovAgencyOrganizationId());
		processOrderImpl.setServiceProcessId(processOrder.getServiceProcessId());
		processOrderImpl.setDossierId(processOrder.getDossierId());
		processOrderImpl.setFileGroupId(processOrder.getFileGroupId());
		processOrderImpl.setProcessStepId(processOrder.getProcessStepId());
		processOrderImpl.setActionUserId(processOrder.getActionUserId());
		processOrderImpl.setActionDatetime(processOrder.getActionDatetime());
		processOrderImpl.setActionNote(processOrder.getActionNote());
		processOrderImpl.setAssignToUserId(processOrder.getAssignToUserId());
		processOrderImpl.setProcessWorkflowId(processOrder.getProcessWorkflowId());
		processOrderImpl.setDossierStatus(processOrder.getDossierStatus());
		processOrderImpl.setErrorInfo(processOrder.getErrorInfo());

		return processOrderImpl;
	}

	/**
	 * Returns the process order with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the process order
	 * @return the process order
	 * @throws org.opencps.processmgt.NoSuchProcessOrderException if a process order with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder findByPrimaryKey(Serializable primaryKey)
		throws NoSuchProcessOrderException, SystemException {
		ProcessOrder processOrder = fetchByPrimaryKey(primaryKey);

		if (processOrder == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchProcessOrderException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return processOrder;
	}

	/**
	 * Returns the process order with the primary key or throws a {@link org.opencps.processmgt.NoSuchProcessOrderException} if it could not be found.
	 *
	 * @param processOrderId the primary key of the process order
	 * @return the process order
	 * @throws org.opencps.processmgt.NoSuchProcessOrderException if a process order with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder findByPrimaryKey(long processOrderId)
		throws NoSuchProcessOrderException, SystemException {
		return findByPrimaryKey((Serializable)processOrderId);
	}

	/**
	 * Returns the process order with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the process order
	 * @return the process order, or <code>null</code> if a process order with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ProcessOrder processOrder = (ProcessOrder)EntityCacheUtil.getResult(ProcessOrderModelImpl.ENTITY_CACHE_ENABLED,
				ProcessOrderImpl.class, primaryKey);

		if (processOrder == _nullProcessOrder) {
			return null;
		}

		if (processOrder == null) {
			Session session = null;

			try {
				session = openSession();

				processOrder = (ProcessOrder)session.get(ProcessOrderImpl.class,
						primaryKey);

				if (processOrder != null) {
					cacheResult(processOrder);
				}
				else {
					EntityCacheUtil.putResult(ProcessOrderModelImpl.ENTITY_CACHE_ENABLED,
						ProcessOrderImpl.class, primaryKey, _nullProcessOrder);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ProcessOrderModelImpl.ENTITY_CACHE_ENABLED,
					ProcessOrderImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return processOrder;
	}

	/**
	 * Returns the process order with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param processOrderId the primary key of the process order
	 * @return the process order, or <code>null</code> if a process order with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProcessOrder fetchByPrimaryKey(long processOrderId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)processOrderId);
	}

	/**
	 * Returns all the process orders.
	 *
	 * @return the process orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProcessOrder> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the process orders.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.processmgt.model.impl.ProcessOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of process orders
	 * @param end the upper bound of the range of process orders (not inclusive)
	 * @return the range of process orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProcessOrder> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the process orders.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.processmgt.model.impl.ProcessOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of process orders
	 * @param end the upper bound of the range of process orders (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of process orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProcessOrder> findAll(int start, int end,
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

		List<ProcessOrder> list = (List<ProcessOrder>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PROCESSORDER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PROCESSORDER;

				if (pagination) {
					sql = sql.concat(ProcessOrderModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ProcessOrder>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ProcessOrder>(list);
				}
				else {
					list = (List<ProcessOrder>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the process orders from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ProcessOrder processOrder : findAll()) {
			remove(processOrder);
		}
	}

	/**
	 * Returns the number of process orders.
	 *
	 * @return the number of process orders
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

				Query q = session.createQuery(_SQL_COUNT_PROCESSORDER);

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
	 * Initializes the process order persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.opencps.processmgt.model.ProcessOrder")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ProcessOrder>> listenersList = new ArrayList<ModelListener<ProcessOrder>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ProcessOrder>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ProcessOrderImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PROCESSORDER = "SELECT processOrder FROM ProcessOrder processOrder";
	private static final String _SQL_SELECT_PROCESSORDER_WHERE = "SELECT processOrder FROM ProcessOrder processOrder WHERE ";
	private static final String _SQL_COUNT_PROCESSORDER = "SELECT COUNT(processOrder) FROM ProcessOrder processOrder";
	private static final String _SQL_COUNT_PROCESSORDER_WHERE = "SELECT COUNT(processOrder) FROM ProcessOrder processOrder WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "processOrder.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ProcessOrder exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ProcessOrder exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ProcessOrderPersistenceImpl.class);
	private static ProcessOrder _nullProcessOrder = new ProcessOrderImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ProcessOrder> toCacheModel() {
				return _nullProcessOrderCacheModel;
			}
		};

	private static CacheModel<ProcessOrder> _nullProcessOrderCacheModel = new CacheModel<ProcessOrder>() {
			@Override
			public ProcessOrder toEntityModel() {
				return _nullProcessOrder;
			}
		};
}