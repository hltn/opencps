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
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ArrayUtil;
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

import org.opencps.dossiermgt.NoSuchDossierLogException;
import org.opencps.dossiermgt.model.DossierLog;
import org.opencps.dossiermgt.model.impl.DossierLogImpl;
import org.opencps.dossiermgt.model.impl.DossierLogModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dossier log service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungnt
 * @see DossierLogPersistence
 * @see DossierLogUtil
 * @generated
 */
public class DossierLogPersistenceImpl extends BasePersistenceImpl<DossierLog>
	implements DossierLogPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DossierLogUtil} to access the dossier log persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DossierLogImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DossierLogModelImpl.ENTITY_CACHE_ENABLED,
			DossierLogModelImpl.FINDER_CACHE_ENABLED, DossierLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DossierLogModelImpl.ENTITY_CACHE_ENABLED,
			DossierLogModelImpl.FINDER_CACHE_ENABLED, DossierLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DossierLogModelImpl.ENTITY_CACHE_ENABLED,
			DossierLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(DossierLogModelImpl.ENTITY_CACHE_ENABLED,
			DossierLogModelImpl.FINDER_CACHE_ENABLED, DossierLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(DossierLogModelImpl.ENTITY_CACHE_ENABLED,
			DossierLogModelImpl.FINDER_CACHE_ENABLED, DossierLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDossierId",
			new String[] { Long.class.getName() },
			DossierLogModelImpl.DOSSIERID_COLUMN_BITMASK |
			DossierLogModelImpl.MODIFIEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERID = new FinderPath(DossierLogModelImpl.ENTITY_CACHE_ENABLED,
			DossierLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the dossier logs where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the matching dossier logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierLog> findByDossierId(long dossierId)
		throws SystemException {
		return findByDossierId(dossierId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the dossier logs where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of dossier logs
	 * @param end the upper bound of the range of dossier logs (not inclusive)
	 * @return the range of matching dossier logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierLog> findByDossierId(long dossierId, int start, int end)
		throws SystemException {
		return findByDossierId(dossierId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier logs where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of dossier logs
	 * @param end the upper bound of the range of dossier logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dossier logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierLog> findByDossierId(long dossierId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID;
			finderArgs = new Object[] { dossierId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERID;
			finderArgs = new Object[] { dossierId, start, end, orderByComparator };
		}

		List<DossierLog> list = (List<DossierLog>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DossierLog dossierLog : list) {
				if ((dossierId != dossierLog.getDossierId())) {
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

			query.append(_SQL_SELECT_DOSSIERLOG_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DossierLogModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (!pagination) {
					list = (List<DossierLog>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DossierLog>(list);
				}
				else {
					list = (List<DossierLog>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dossier log in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier log
	 * @throws org.opencps.dossiermgt.NoSuchDossierLogException if a matching dossier log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierLog findByDossierId_First(long dossierId,
		OrderByComparator orderByComparator)
		throws NoSuchDossierLogException, SystemException {
		DossierLog dossierLog = fetchByDossierId_First(dossierId,
				orderByComparator);

		if (dossierLog != null) {
			return dossierLog;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierLogException(msg.toString());
	}

	/**
	 * Returns the first dossier log in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier log, or <code>null</code> if a matching dossier log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierLog fetchByDossierId_First(long dossierId,
		OrderByComparator orderByComparator) throws SystemException {
		List<DossierLog> list = findByDossierId(dossierId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dossier log in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier log
	 * @throws org.opencps.dossiermgt.NoSuchDossierLogException if a matching dossier log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierLog findByDossierId_Last(long dossierId,
		OrderByComparator orderByComparator)
		throws NoSuchDossierLogException, SystemException {
		DossierLog dossierLog = fetchByDossierId_Last(dossierId,
				orderByComparator);

		if (dossierLog != null) {
			return dossierLog;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierLogException(msg.toString());
	}

	/**
	 * Returns the last dossier log in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier log, or <code>null</code> if a matching dossier log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierLog fetchByDossierId_Last(long dossierId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByDossierId(dossierId);

		if (count == 0) {
			return null;
		}

		List<DossierLog> list = findByDossierId(dossierId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dossier logs before and after the current dossier log in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierLogId the primary key of the current dossier log
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dossier log
	 * @throws org.opencps.dossiermgt.NoSuchDossierLogException if a dossier log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierLog[] findByDossierId_PrevAndNext(long dossierLogId,
		long dossierId, OrderByComparator orderByComparator)
		throws NoSuchDossierLogException, SystemException {
		DossierLog dossierLog = findByPrimaryKey(dossierLogId);

		Session session = null;

		try {
			session = openSession();

			DossierLog[] array = new DossierLogImpl[3];

			array[0] = getByDossierId_PrevAndNext(session, dossierLog,
					dossierId, orderByComparator, true);

			array[1] = dossierLog;

			array[2] = getByDossierId_PrevAndNext(session, dossierLog,
					dossierId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DossierLog getByDossierId_PrevAndNext(Session session,
		DossierLog dossierLog, long dossierId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOSSIERLOG_WHERE);

		query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

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
			query.append(DossierLogModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dossierLog);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DossierLog> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dossier logs where dossierId = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDossierId(long dossierId) throws SystemException {
		for (DossierLog dossierLog : findByDossierId(dossierId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dossierLog);
		}
	}

	/**
	 * Returns the number of dossier logs where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the number of matching dossier logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDossierId(long dossierId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERID;

		Object[] finderArgs = new Object[] { dossierId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DOSSIERLOG_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

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

	private static final String _FINDER_COLUMN_DOSSIERID_DOSSIERID_2 = "dossierLog.dossierId = ? AND dossierLog.dossierStatus != 'system'";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERIDSYNC =
		new FinderPath(DossierLogModelImpl.ENTITY_CACHE_ENABLED,
			DossierLogModelImpl.FINDER_CACHE_ENABLED, DossierLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierIdSync",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDSYNC =
		new FinderPath(DossierLogModelImpl.ENTITY_CACHE_ENABLED,
			DossierLogModelImpl.FINDER_CACHE_ENABLED, DossierLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDossierIdSync",
			new String[] { Long.class.getName(), Integer.class.getName() },
			DossierLogModelImpl.DOSSIERID_COLUMN_BITMASK |
			DossierLogModelImpl.SYNCSTATUS_COLUMN_BITMASK |
			DossierLogModelImpl.MODIFIEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERIDSYNC = new FinderPath(DossierLogModelImpl.ENTITY_CACHE_ENABLED,
			DossierLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierIdSync",
			new String[] { Long.class.getName(), Integer.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_DOSSIERIDSYNC =
		new FinderPath(DossierLogModelImpl.ENTITY_CACHE_ENABLED,
			DossierLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByDossierIdSync",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the dossier logs where dossierId = &#63; and syncStatus = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param syncStatus the sync status
	 * @return the matching dossier logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierLog> findByDossierIdSync(long dossierId, int syncStatus)
		throws SystemException {
		return findByDossierIdSync(dossierId, syncStatus, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier logs where dossierId = &#63; and syncStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param syncStatus the sync status
	 * @param start the lower bound of the range of dossier logs
	 * @param end the upper bound of the range of dossier logs (not inclusive)
	 * @return the range of matching dossier logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierLog> findByDossierIdSync(long dossierId, int syncStatus,
		int start, int end) throws SystemException {
		return findByDossierIdSync(dossierId, syncStatus, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier logs where dossierId = &#63; and syncStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param syncStatus the sync status
	 * @param start the lower bound of the range of dossier logs
	 * @param end the upper bound of the range of dossier logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dossier logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierLog> findByDossierIdSync(long dossierId, int syncStatus,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDSYNC;
			finderArgs = new Object[] { dossierId, syncStatus };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERIDSYNC;
			finderArgs = new Object[] {
					dossierId, syncStatus,
					
					start, end, orderByComparator
				};
		}

		List<DossierLog> list = (List<DossierLog>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DossierLog dossierLog : list) {
				if ((dossierId != dossierLog.getDossierId()) ||
						(syncStatus != dossierLog.getSyncStatus())) {
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

			query.append(_SQL_SELECT_DOSSIERLOG_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERIDSYNC_DOSSIERID_2);

			query.append(_FINDER_COLUMN_DOSSIERIDSYNC_SYNCSTATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DossierLogModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				qPos.add(syncStatus);

				if (!pagination) {
					list = (List<DossierLog>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DossierLog>(list);
				}
				else {
					list = (List<DossierLog>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dossier log in the ordered set where dossierId = &#63; and syncStatus = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param syncStatus the sync status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier log
	 * @throws org.opencps.dossiermgt.NoSuchDossierLogException if a matching dossier log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierLog findByDossierIdSync_First(long dossierId, int syncStatus,
		OrderByComparator orderByComparator)
		throws NoSuchDossierLogException, SystemException {
		DossierLog dossierLog = fetchByDossierIdSync_First(dossierId,
				syncStatus, orderByComparator);

		if (dossierLog != null) {
			return dossierLog;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", syncStatus=");
		msg.append(syncStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierLogException(msg.toString());
	}

	/**
	 * Returns the first dossier log in the ordered set where dossierId = &#63; and syncStatus = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param syncStatus the sync status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier log, or <code>null</code> if a matching dossier log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierLog fetchByDossierIdSync_First(long dossierId,
		int syncStatus, OrderByComparator orderByComparator)
		throws SystemException {
		List<DossierLog> list = findByDossierIdSync(dossierId, syncStatus, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dossier log in the ordered set where dossierId = &#63; and syncStatus = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param syncStatus the sync status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier log
	 * @throws org.opencps.dossiermgt.NoSuchDossierLogException if a matching dossier log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierLog findByDossierIdSync_Last(long dossierId, int syncStatus,
		OrderByComparator orderByComparator)
		throws NoSuchDossierLogException, SystemException {
		DossierLog dossierLog = fetchByDossierIdSync_Last(dossierId,
				syncStatus, orderByComparator);

		if (dossierLog != null) {
			return dossierLog;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", syncStatus=");
		msg.append(syncStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierLogException(msg.toString());
	}

	/**
	 * Returns the last dossier log in the ordered set where dossierId = &#63; and syncStatus = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param syncStatus the sync status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier log, or <code>null</code> if a matching dossier log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierLog fetchByDossierIdSync_Last(long dossierId, int syncStatus,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByDossierIdSync(dossierId, syncStatus);

		if (count == 0) {
			return null;
		}

		List<DossierLog> list = findByDossierIdSync(dossierId, syncStatus,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dossier logs before and after the current dossier log in the ordered set where dossierId = &#63; and syncStatus = &#63;.
	 *
	 * @param dossierLogId the primary key of the current dossier log
	 * @param dossierId the dossier ID
	 * @param syncStatus the sync status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dossier log
	 * @throws org.opencps.dossiermgt.NoSuchDossierLogException if a dossier log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierLog[] findByDossierIdSync_PrevAndNext(long dossierLogId,
		long dossierId, int syncStatus, OrderByComparator orderByComparator)
		throws NoSuchDossierLogException, SystemException {
		DossierLog dossierLog = findByPrimaryKey(dossierLogId);

		Session session = null;

		try {
			session = openSession();

			DossierLog[] array = new DossierLogImpl[3];

			array[0] = getByDossierIdSync_PrevAndNext(session, dossierLog,
					dossierId, syncStatus, orderByComparator, true);

			array[1] = dossierLog;

			array[2] = getByDossierIdSync_PrevAndNext(session, dossierLog,
					dossierId, syncStatus, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DossierLog getByDossierIdSync_PrevAndNext(Session session,
		DossierLog dossierLog, long dossierId, int syncStatus,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOSSIERLOG_WHERE);

		query.append(_FINDER_COLUMN_DOSSIERIDSYNC_DOSSIERID_2);

		query.append(_FINDER_COLUMN_DOSSIERIDSYNC_SYNCSTATUS_2);

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
			query.append(DossierLogModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		qPos.add(syncStatus);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dossierLog);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DossierLog> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the dossier logs where dossierId = &#63; and syncStatus = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param syncStatuses the sync statuses
	 * @return the matching dossier logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierLog> findByDossierIdSync(long dossierId,
		int[] syncStatuses) throws SystemException {
		return findByDossierIdSync(dossierId, syncStatuses, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier logs where dossierId = &#63; and syncStatus = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param syncStatuses the sync statuses
	 * @param start the lower bound of the range of dossier logs
	 * @param end the upper bound of the range of dossier logs (not inclusive)
	 * @return the range of matching dossier logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierLog> findByDossierIdSync(long dossierId,
		int[] syncStatuses, int start, int end) throws SystemException {
		return findByDossierIdSync(dossierId, syncStatuses, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier logs where dossierId = &#63; and syncStatus = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param syncStatuses the sync statuses
	 * @param start the lower bound of the range of dossier logs
	 * @param end the upper bound of the range of dossier logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dossier logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierLog> findByDossierIdSync(long dossierId,
		int[] syncStatuses, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		if ((syncStatuses != null) && (syncStatuses.length == 1)) {
			return findByDossierIdSync(dossierId, syncStatuses[0], start, end,
				orderByComparator);
		}

		boolean pagination = true;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderArgs = new Object[] { dossierId, StringUtil.merge(syncStatuses) };
		}
		else {
			finderArgs = new Object[] {
					dossierId, StringUtil.merge(syncStatuses),
					
					start, end, orderByComparator
				};
		}

		List<DossierLog> list = (List<DossierLog>)FinderCacheUtil.getResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERIDSYNC,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DossierLog dossierLog : list) {
				if ((dossierId != dossierLog.getDossierId()) ||
						!ArrayUtil.contains(syncStatuses,
							dossierLog.getSyncStatus())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_SELECT_DOSSIERLOG_WHERE);

			boolean conjunctionable = false;

			if (conjunctionable) {
				query.append(WHERE_AND);
			}

			query.append(_FINDER_COLUMN_DOSSIERIDSYNC_DOSSIERID_5);

			conjunctionable = true;

			if ((syncStatuses == null) || (syncStatuses.length > 0)) {
				if (conjunctionable) {
					query.append(WHERE_AND);
				}

				query.append(StringPool.OPEN_PARENTHESIS);

				for (int i = 0; i < syncStatuses.length; i++) {
					query.append(_FINDER_COLUMN_DOSSIERIDSYNC_SYNCSTATUS_5);

					if ((i + 1) < syncStatuses.length) {
						query.append(WHERE_OR);
					}
				}

				query.append(StringPool.CLOSE_PARENTHESIS);

				conjunctionable = true;
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DossierLogModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (syncStatuses != null) {
					qPos.add(syncStatuses);
				}

				if (!pagination) {
					list = (List<DossierLog>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DossierLog>(list);
				}
				else {
					list = (List<DossierLog>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERIDSYNC,
					finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERIDSYNC,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the dossier logs where dossierId = &#63; and syncStatus = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @param syncStatus the sync status
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDossierIdSync(long dossierId, int syncStatus)
		throws SystemException {
		for (DossierLog dossierLog : findByDossierIdSync(dossierId, syncStatus,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dossierLog);
		}
	}

	/**
	 * Returns the number of dossier logs where dossierId = &#63; and syncStatus = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param syncStatus the sync status
	 * @return the number of matching dossier logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDossierIdSync(long dossierId, int syncStatus)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERIDSYNC;

		Object[] finderArgs = new Object[] { dossierId, syncStatus };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DOSSIERLOG_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERIDSYNC_DOSSIERID_2);

			query.append(_FINDER_COLUMN_DOSSIERIDSYNC_SYNCSTATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				qPos.add(syncStatus);

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
	 * Returns the number of dossier logs where dossierId = &#63; and syncStatus = any &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param syncStatuses the sync statuses
	 * @return the number of matching dossier logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDossierIdSync(long dossierId, int[] syncStatuses)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				dossierId, StringUtil.merge(syncStatuses)
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_DOSSIERIDSYNC,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_COUNT_DOSSIERLOG_WHERE);

			boolean conjunctionable = false;

			if (conjunctionable) {
				query.append(WHERE_AND);
			}

			query.append(_FINDER_COLUMN_DOSSIERIDSYNC_DOSSIERID_5);

			conjunctionable = true;

			if ((syncStatuses == null) || (syncStatuses.length > 0)) {
				if (conjunctionable) {
					query.append(WHERE_AND);
				}

				query.append(StringPool.OPEN_PARENTHESIS);

				for (int i = 0; i < syncStatuses.length; i++) {
					query.append(_FINDER_COLUMN_DOSSIERIDSYNC_SYNCSTATUS_5);

					if ((i + 1) < syncStatuses.length) {
						query.append(WHERE_OR);
					}
				}

				query.append(StringPool.CLOSE_PARENTHESIS);

				conjunctionable = true;
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (syncStatuses != null) {
					qPos.add(syncStatuses);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_DOSSIERIDSYNC,
					finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_DOSSIERIDSYNC,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_DOSSIERIDSYNC_DOSSIERID_2 = "dossierLog.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_DOSSIERIDSYNC_DOSSIERID_5 = "(" +
		removeConjunction(_FINDER_COLUMN_DOSSIERIDSYNC_DOSSIERID_2) + ")";
	private static final String _FINDER_COLUMN_DOSSIERIDSYNC_SYNCSTATUS_2 = "dossierLog.syncStatus = ?";
	private static final String _FINDER_COLUMN_DOSSIERIDSYNC_SYNCSTATUS_5 = "(" +
		removeConjunction(_FINDER_COLUMN_DOSSIERIDSYNC_SYNCSTATUS_2) + ")";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_D_RC = new FinderPath(DossierLogModelImpl.ENTITY_CACHE_ENABLED,
			DossierLogModelImpl.FINDER_CACHE_ENABLED, DossierLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByD_RC",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_RC = new FinderPath(DossierLogModelImpl.ENTITY_CACHE_ENABLED,
			DossierLogModelImpl.FINDER_CACHE_ENABLED, DossierLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByD_RC",
			new String[] { Long.class.getName(), String.class.getName() },
			DossierLogModelImpl.DOSSIERID_COLUMN_BITMASK |
			DossierLogModelImpl.REQUESTCOMMAND_COLUMN_BITMASK |
			DossierLogModelImpl.MODIFIEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_D_RC = new FinderPath(DossierLogModelImpl.ENTITY_CACHE_ENABLED,
			DossierLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByD_RC",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the dossier logs where dossierId = &#63; and requestCommand = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param requestCommand the request command
	 * @return the matching dossier logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierLog> findByD_RC(long dossierId, String requestCommand)
		throws SystemException {
		return findByD_RC(dossierId, requestCommand, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier logs where dossierId = &#63; and requestCommand = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param requestCommand the request command
	 * @param start the lower bound of the range of dossier logs
	 * @param end the upper bound of the range of dossier logs (not inclusive)
	 * @return the range of matching dossier logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierLog> findByD_RC(long dossierId, String requestCommand,
		int start, int end) throws SystemException {
		return findByD_RC(dossierId, requestCommand, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier logs where dossierId = &#63; and requestCommand = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param requestCommand the request command
	 * @param start the lower bound of the range of dossier logs
	 * @param end the upper bound of the range of dossier logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dossier logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierLog> findByD_RC(long dossierId, String requestCommand,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_RC;
			finderArgs = new Object[] { dossierId, requestCommand };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_D_RC;
			finderArgs = new Object[] {
					dossierId, requestCommand,
					
					start, end, orderByComparator
				};
		}

		List<DossierLog> list = (List<DossierLog>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DossierLog dossierLog : list) {
				if ((dossierId != dossierLog.getDossierId()) ||
						!Validator.equals(requestCommand,
							dossierLog.getRequestCommand())) {
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

			query.append(_SQL_SELECT_DOSSIERLOG_WHERE);

			query.append(_FINDER_COLUMN_D_RC_DOSSIERID_2);

			boolean bindRequestCommand = false;

			if (requestCommand == null) {
				query.append(_FINDER_COLUMN_D_RC_REQUESTCOMMAND_1);
			}
			else if (requestCommand.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_D_RC_REQUESTCOMMAND_3);
			}
			else {
				bindRequestCommand = true;

				query.append(_FINDER_COLUMN_D_RC_REQUESTCOMMAND_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DossierLogModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (bindRequestCommand) {
					qPos.add(requestCommand);
				}

				if (!pagination) {
					list = (List<DossierLog>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DossierLog>(list);
				}
				else {
					list = (List<DossierLog>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dossier log in the ordered set where dossierId = &#63; and requestCommand = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param requestCommand the request command
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier log
	 * @throws org.opencps.dossiermgt.NoSuchDossierLogException if a matching dossier log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierLog findByD_RC_First(long dossierId, String requestCommand,
		OrderByComparator orderByComparator)
		throws NoSuchDossierLogException, SystemException {
		DossierLog dossierLog = fetchByD_RC_First(dossierId, requestCommand,
				orderByComparator);

		if (dossierLog != null) {
			return dossierLog;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", requestCommand=");
		msg.append(requestCommand);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierLogException(msg.toString());
	}

	/**
	 * Returns the first dossier log in the ordered set where dossierId = &#63; and requestCommand = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param requestCommand the request command
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier log, or <code>null</code> if a matching dossier log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierLog fetchByD_RC_First(long dossierId, String requestCommand,
		OrderByComparator orderByComparator) throws SystemException {
		List<DossierLog> list = findByD_RC(dossierId, requestCommand, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dossier log in the ordered set where dossierId = &#63; and requestCommand = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param requestCommand the request command
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier log
	 * @throws org.opencps.dossiermgt.NoSuchDossierLogException if a matching dossier log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierLog findByD_RC_Last(long dossierId, String requestCommand,
		OrderByComparator orderByComparator)
		throws NoSuchDossierLogException, SystemException {
		DossierLog dossierLog = fetchByD_RC_Last(dossierId, requestCommand,
				orderByComparator);

		if (dossierLog != null) {
			return dossierLog;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", requestCommand=");
		msg.append(requestCommand);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierLogException(msg.toString());
	}

	/**
	 * Returns the last dossier log in the ordered set where dossierId = &#63; and requestCommand = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param requestCommand the request command
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier log, or <code>null</code> if a matching dossier log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierLog fetchByD_RC_Last(long dossierId, String requestCommand,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByD_RC(dossierId, requestCommand);

		if (count == 0) {
			return null;
		}

		List<DossierLog> list = findByD_RC(dossierId, requestCommand,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dossier logs before and after the current dossier log in the ordered set where dossierId = &#63; and requestCommand = &#63;.
	 *
	 * @param dossierLogId the primary key of the current dossier log
	 * @param dossierId the dossier ID
	 * @param requestCommand the request command
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dossier log
	 * @throws org.opencps.dossiermgt.NoSuchDossierLogException if a dossier log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierLog[] findByD_RC_PrevAndNext(long dossierLogId,
		long dossierId, String requestCommand,
		OrderByComparator orderByComparator)
		throws NoSuchDossierLogException, SystemException {
		DossierLog dossierLog = findByPrimaryKey(dossierLogId);

		Session session = null;

		try {
			session = openSession();

			DossierLog[] array = new DossierLogImpl[3];

			array[0] = getByD_RC_PrevAndNext(session, dossierLog, dossierId,
					requestCommand, orderByComparator, true);

			array[1] = dossierLog;

			array[2] = getByD_RC_PrevAndNext(session, dossierLog, dossierId,
					requestCommand, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DossierLog getByD_RC_PrevAndNext(Session session,
		DossierLog dossierLog, long dossierId, String requestCommand,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOSSIERLOG_WHERE);

		query.append(_FINDER_COLUMN_D_RC_DOSSIERID_2);

		boolean bindRequestCommand = false;

		if (requestCommand == null) {
			query.append(_FINDER_COLUMN_D_RC_REQUESTCOMMAND_1);
		}
		else if (requestCommand.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_D_RC_REQUESTCOMMAND_3);
		}
		else {
			bindRequestCommand = true;

			query.append(_FINDER_COLUMN_D_RC_REQUESTCOMMAND_2);
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
			query.append(DossierLogModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		if (bindRequestCommand) {
			qPos.add(requestCommand);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dossierLog);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DossierLog> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dossier logs where dossierId = &#63; and requestCommand = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @param requestCommand the request command
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByD_RC(long dossierId, String requestCommand)
		throws SystemException {
		for (DossierLog dossierLog : findByD_RC(dossierId, requestCommand,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dossierLog);
		}
	}

	/**
	 * Returns the number of dossier logs where dossierId = &#63; and requestCommand = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param requestCommand the request command
	 * @return the number of matching dossier logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByD_RC(long dossierId, String requestCommand)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_D_RC;

		Object[] finderArgs = new Object[] { dossierId, requestCommand };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DOSSIERLOG_WHERE);

			query.append(_FINDER_COLUMN_D_RC_DOSSIERID_2);

			boolean bindRequestCommand = false;

			if (requestCommand == null) {
				query.append(_FINDER_COLUMN_D_RC_REQUESTCOMMAND_1);
			}
			else if (requestCommand.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_D_RC_REQUESTCOMMAND_3);
			}
			else {
				bindRequestCommand = true;

				query.append(_FINDER_COLUMN_D_RC_REQUESTCOMMAND_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (bindRequestCommand) {
					qPos.add(requestCommand);
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

	private static final String _FINDER_COLUMN_D_RC_DOSSIERID_2 = "dossierLog.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_D_RC_REQUESTCOMMAND_1 = "dossierLog.requestCommand IS NULL";
	private static final String _FINDER_COLUMN_D_RC_REQUESTCOMMAND_2 = "dossierLog.requestCommand = ?";
	private static final String _FINDER_COLUMN_D_RC_REQUESTCOMMAND_3 = "(dossierLog.requestCommand IS NULL OR dossierLog.requestCommand = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_D_A = new FinderPath(DossierLogModelImpl.ENTITY_CACHE_ENABLED,
			DossierLogModelImpl.FINDER_CACHE_ENABLED, DossierLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByD_A",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_A = new FinderPath(DossierLogModelImpl.ENTITY_CACHE_ENABLED,
			DossierLogModelImpl.FINDER_CACHE_ENABLED, DossierLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByD_A",
			new String[] { Long.class.getName(), Integer.class.getName() },
			DossierLogModelImpl.DOSSIERID_COLUMN_BITMASK |
			DossierLogModelImpl.ACTOR_COLUMN_BITMASK |
			DossierLogModelImpl.MODIFIEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_D_A = new FinderPath(DossierLogModelImpl.ENTITY_CACHE_ENABLED,
			DossierLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByD_A",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the dossier logs where dossierId = &#63; and actor = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param actor the actor
	 * @return the matching dossier logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierLog> findByD_A(long dossierId, int actor)
		throws SystemException {
		return findByD_A(dossierId, actor, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier logs where dossierId = &#63; and actor = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param actor the actor
	 * @param start the lower bound of the range of dossier logs
	 * @param end the upper bound of the range of dossier logs (not inclusive)
	 * @return the range of matching dossier logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierLog> findByD_A(long dossierId, int actor, int start,
		int end) throws SystemException {
		return findByD_A(dossierId, actor, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier logs where dossierId = &#63; and actor = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param actor the actor
	 * @param start the lower bound of the range of dossier logs
	 * @param end the upper bound of the range of dossier logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dossier logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierLog> findByD_A(long dossierId, int actor, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_A;
			finderArgs = new Object[] { dossierId, actor };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_D_A;
			finderArgs = new Object[] {
					dossierId, actor,
					
					start, end, orderByComparator
				};
		}

		List<DossierLog> list = (List<DossierLog>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DossierLog dossierLog : list) {
				if ((dossierId != dossierLog.getDossierId()) ||
						(actor != dossierLog.getActor())) {
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

			query.append(_SQL_SELECT_DOSSIERLOG_WHERE);

			query.append(_FINDER_COLUMN_D_A_DOSSIERID_2);

			query.append(_FINDER_COLUMN_D_A_ACTOR_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DossierLogModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				qPos.add(actor);

				if (!pagination) {
					list = (List<DossierLog>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DossierLog>(list);
				}
				else {
					list = (List<DossierLog>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dossier log in the ordered set where dossierId = &#63; and actor = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param actor the actor
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier log
	 * @throws org.opencps.dossiermgt.NoSuchDossierLogException if a matching dossier log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierLog findByD_A_First(long dossierId, int actor,
		OrderByComparator orderByComparator)
		throws NoSuchDossierLogException, SystemException {
		DossierLog dossierLog = fetchByD_A_First(dossierId, actor,
				orderByComparator);

		if (dossierLog != null) {
			return dossierLog;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", actor=");
		msg.append(actor);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierLogException(msg.toString());
	}

	/**
	 * Returns the first dossier log in the ordered set where dossierId = &#63; and actor = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param actor the actor
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier log, or <code>null</code> if a matching dossier log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierLog fetchByD_A_First(long dossierId, int actor,
		OrderByComparator orderByComparator) throws SystemException {
		List<DossierLog> list = findByD_A(dossierId, actor, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dossier log in the ordered set where dossierId = &#63; and actor = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param actor the actor
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier log
	 * @throws org.opencps.dossiermgt.NoSuchDossierLogException if a matching dossier log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierLog findByD_A_Last(long dossierId, int actor,
		OrderByComparator orderByComparator)
		throws NoSuchDossierLogException, SystemException {
		DossierLog dossierLog = fetchByD_A_Last(dossierId, actor,
				orderByComparator);

		if (dossierLog != null) {
			return dossierLog;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", actor=");
		msg.append(actor);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierLogException(msg.toString());
	}

	/**
	 * Returns the last dossier log in the ordered set where dossierId = &#63; and actor = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param actor the actor
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier log, or <code>null</code> if a matching dossier log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierLog fetchByD_A_Last(long dossierId, int actor,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByD_A(dossierId, actor);

		if (count == 0) {
			return null;
		}

		List<DossierLog> list = findByD_A(dossierId, actor, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dossier logs before and after the current dossier log in the ordered set where dossierId = &#63; and actor = &#63;.
	 *
	 * @param dossierLogId the primary key of the current dossier log
	 * @param dossierId the dossier ID
	 * @param actor the actor
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dossier log
	 * @throws org.opencps.dossiermgt.NoSuchDossierLogException if a dossier log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierLog[] findByD_A_PrevAndNext(long dossierLogId,
		long dossierId, int actor, OrderByComparator orderByComparator)
		throws NoSuchDossierLogException, SystemException {
		DossierLog dossierLog = findByPrimaryKey(dossierLogId);

		Session session = null;

		try {
			session = openSession();

			DossierLog[] array = new DossierLogImpl[3];

			array[0] = getByD_A_PrevAndNext(session, dossierLog, dossierId,
					actor, orderByComparator, true);

			array[1] = dossierLog;

			array[2] = getByD_A_PrevAndNext(session, dossierLog, dossierId,
					actor, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DossierLog getByD_A_PrevAndNext(Session session,
		DossierLog dossierLog, long dossierId, int actor,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOSSIERLOG_WHERE);

		query.append(_FINDER_COLUMN_D_A_DOSSIERID_2);

		query.append(_FINDER_COLUMN_D_A_ACTOR_2);

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
			query.append(DossierLogModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		qPos.add(actor);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dossierLog);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DossierLog> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dossier logs where dossierId = &#63; and actor = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @param actor the actor
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByD_A(long dossierId, int actor)
		throws SystemException {
		for (DossierLog dossierLog : findByD_A(dossierId, actor,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dossierLog);
		}
	}

	/**
	 * Returns the number of dossier logs where dossierId = &#63; and actor = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param actor the actor
	 * @return the number of matching dossier logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByD_A(long dossierId, int actor) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_D_A;

		Object[] finderArgs = new Object[] { dossierId, actor };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DOSSIERLOG_WHERE);

			query.append(_FINDER_COLUMN_D_A_DOSSIERID_2);

			query.append(_FINDER_COLUMN_D_A_ACTOR_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				qPos.add(actor);

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

	private static final String _FINDER_COLUMN_D_A_DOSSIERID_2 = "dossierLog.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_D_A_ACTOR_2 = "dossierLog.actor = ? AND dossierLog.dossierStatus != 'system'";

	public DossierLogPersistenceImpl() {
		setModelClass(DossierLog.class);
	}

	/**
	 * Caches the dossier log in the entity cache if it is enabled.
	 *
	 * @param dossierLog the dossier log
	 */
	@Override
	public void cacheResult(DossierLog dossierLog) {
		EntityCacheUtil.putResult(DossierLogModelImpl.ENTITY_CACHE_ENABLED,
			DossierLogImpl.class, dossierLog.getPrimaryKey(), dossierLog);

		dossierLog.resetOriginalValues();
	}

	/**
	 * Caches the dossier logs in the entity cache if it is enabled.
	 *
	 * @param dossierLogs the dossier logs
	 */
	@Override
	public void cacheResult(List<DossierLog> dossierLogs) {
		for (DossierLog dossierLog : dossierLogs) {
			if (EntityCacheUtil.getResult(
						DossierLogModelImpl.ENTITY_CACHE_ENABLED,
						DossierLogImpl.class, dossierLog.getPrimaryKey()) == null) {
				cacheResult(dossierLog);
			}
			else {
				dossierLog.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dossier logs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DossierLogImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DossierLogImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dossier log.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DossierLog dossierLog) {
		EntityCacheUtil.removeResult(DossierLogModelImpl.ENTITY_CACHE_ENABLED,
			DossierLogImpl.class, dossierLog.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DossierLog> dossierLogs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DossierLog dossierLog : dossierLogs) {
			EntityCacheUtil.removeResult(DossierLogModelImpl.ENTITY_CACHE_ENABLED,
				DossierLogImpl.class, dossierLog.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dossier log with the primary key. Does not add the dossier log to the database.
	 *
	 * @param dossierLogId the primary key for the new dossier log
	 * @return the new dossier log
	 */
	@Override
	public DossierLog create(long dossierLogId) {
		DossierLog dossierLog = new DossierLogImpl();

		dossierLog.setNew(true);
		dossierLog.setPrimaryKey(dossierLogId);

		return dossierLog;
	}

	/**
	 * Removes the dossier log with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dossierLogId the primary key of the dossier log
	 * @return the dossier log that was removed
	 * @throws org.opencps.dossiermgt.NoSuchDossierLogException if a dossier log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierLog remove(long dossierLogId)
		throws NoSuchDossierLogException, SystemException {
		return remove((Serializable)dossierLogId);
	}

	/**
	 * Removes the dossier log with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dossier log
	 * @return the dossier log that was removed
	 * @throws org.opencps.dossiermgt.NoSuchDossierLogException if a dossier log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierLog remove(Serializable primaryKey)
		throws NoSuchDossierLogException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DossierLog dossierLog = (DossierLog)session.get(DossierLogImpl.class,
					primaryKey);

			if (dossierLog == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDossierLogException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dossierLog);
		}
		catch (NoSuchDossierLogException nsee) {
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
	protected DossierLog removeImpl(DossierLog dossierLog)
		throws SystemException {
		dossierLog = toUnwrappedModel(dossierLog);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dossierLog)) {
				dossierLog = (DossierLog)session.get(DossierLogImpl.class,
						dossierLog.getPrimaryKeyObj());
			}

			if (dossierLog != null) {
				session.delete(dossierLog);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dossierLog != null) {
			clearCache(dossierLog);
		}

		return dossierLog;
	}

	@Override
	public DossierLog updateImpl(
		org.opencps.dossiermgt.model.DossierLog dossierLog)
		throws SystemException {
		dossierLog = toUnwrappedModel(dossierLog);

		boolean isNew = dossierLog.isNew();

		DossierLogModelImpl dossierLogModelImpl = (DossierLogModelImpl)dossierLog;

		Session session = null;

		try {
			session = openSession();

			if (dossierLog.isNew()) {
				session.save(dossierLog);

				dossierLog.setNew(false);
			}
			else {
				session.merge(dossierLog);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DossierLogModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dossierLogModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dossierLogModelImpl.getOriginalDossierId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);

				args = new Object[] { dossierLogModelImpl.getDossierId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);
			}

			if ((dossierLogModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDSYNC.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dossierLogModelImpl.getOriginalDossierId(),
						dossierLogModelImpl.getOriginalSyncStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOSSIERIDSYNC,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDSYNC,
					args);

				args = new Object[] {
						dossierLogModelImpl.getDossierId(),
						dossierLogModelImpl.getSyncStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOSSIERIDSYNC,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDSYNC,
					args);
			}

			if ((dossierLogModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_RC.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dossierLogModelImpl.getOriginalDossierId(),
						dossierLogModelImpl.getOriginalRequestCommand()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_D_RC, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_RC,
					args);

				args = new Object[] {
						dossierLogModelImpl.getDossierId(),
						dossierLogModelImpl.getRequestCommand()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_D_RC, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_RC,
					args);
			}

			if ((dossierLogModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_A.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dossierLogModelImpl.getOriginalDossierId(),
						dossierLogModelImpl.getOriginalActor()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_D_A, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_A,
					args);

				args = new Object[] {
						dossierLogModelImpl.getDossierId(),
						dossierLogModelImpl.getActor()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_D_A, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_A,
					args);
			}
		}

		EntityCacheUtil.putResult(DossierLogModelImpl.ENTITY_CACHE_ENABLED,
			DossierLogImpl.class, dossierLog.getPrimaryKey(), dossierLog);

		return dossierLog;
	}

	protected DossierLog toUnwrappedModel(DossierLog dossierLog) {
		if (dossierLog instanceof DossierLogImpl) {
			return dossierLog;
		}

		DossierLogImpl dossierLogImpl = new DossierLogImpl();

		dossierLogImpl.setNew(dossierLog.isNew());
		dossierLogImpl.setPrimaryKey(dossierLog.getPrimaryKey());

		dossierLogImpl.setDossierLogId(dossierLog.getDossierLogId());
		dossierLogImpl.setCompanyId(dossierLog.getCompanyId());
		dossierLogImpl.setGroupId(dossierLog.getGroupId());
		dossierLogImpl.setUserId(dossierLog.getUserId());
		dossierLogImpl.setCreateDate(dossierLog.getCreateDate());
		dossierLogImpl.setModifiedDate(dossierLog.getModifiedDate());
		dossierLogImpl.setDossierId(dossierLog.getDossierId());
		dossierLogImpl.setFileGroupId(dossierLog.getFileGroupId());
		dossierLogImpl.setRequestCommand(dossierLog.getRequestCommand());
		dossierLogImpl.setDossierStatus(dossierLog.getDossierStatus());
		dossierLogImpl.setActionInfo(dossierLog.getActionInfo());
		dossierLogImpl.setMessageInfo(dossierLog.getMessageInfo());
		dossierLogImpl.setUpdateDatetime(dossierLog.getUpdateDatetime());
		dossierLogImpl.setLevel(dossierLog.getLevel());
		dossierLogImpl.setActor(dossierLog.getActor());
		dossierLogImpl.setActorId(dossierLog.getActorId());
		dossierLogImpl.setActorName(dossierLog.getActorName());
		dossierLogImpl.setSyncStatus(dossierLog.getSyncStatus());

		return dossierLogImpl;
	}

	/**
	 * Returns the dossier log with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dossier log
	 * @return the dossier log
	 * @throws org.opencps.dossiermgt.NoSuchDossierLogException if a dossier log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierLog findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDossierLogException, SystemException {
		DossierLog dossierLog = fetchByPrimaryKey(primaryKey);

		if (dossierLog == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDossierLogException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dossierLog;
	}

	/**
	 * Returns the dossier log with the primary key or throws a {@link org.opencps.dossiermgt.NoSuchDossierLogException} if it could not be found.
	 *
	 * @param dossierLogId the primary key of the dossier log
	 * @return the dossier log
	 * @throws org.opencps.dossiermgt.NoSuchDossierLogException if a dossier log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierLog findByPrimaryKey(long dossierLogId)
		throws NoSuchDossierLogException, SystemException {
		return findByPrimaryKey((Serializable)dossierLogId);
	}

	/**
	 * Returns the dossier log with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dossier log
	 * @return the dossier log, or <code>null</code> if a dossier log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierLog fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DossierLog dossierLog = (DossierLog)EntityCacheUtil.getResult(DossierLogModelImpl.ENTITY_CACHE_ENABLED,
				DossierLogImpl.class, primaryKey);

		if (dossierLog == _nullDossierLog) {
			return null;
		}

		if (dossierLog == null) {
			Session session = null;

			try {
				session = openSession();

				dossierLog = (DossierLog)session.get(DossierLogImpl.class,
						primaryKey);

				if (dossierLog != null) {
					cacheResult(dossierLog);
				}
				else {
					EntityCacheUtil.putResult(DossierLogModelImpl.ENTITY_CACHE_ENABLED,
						DossierLogImpl.class, primaryKey, _nullDossierLog);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DossierLogModelImpl.ENTITY_CACHE_ENABLED,
					DossierLogImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dossierLog;
	}

	/**
	 * Returns the dossier log with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dossierLogId the primary key of the dossier log
	 * @return the dossier log, or <code>null</code> if a dossier log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierLog fetchByPrimaryKey(long dossierLogId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)dossierLogId);
	}

	/**
	 * Returns all the dossier logs.
	 *
	 * @return the dossier logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierLog> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier logs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dossier logs
	 * @param end the upper bound of the range of dossier logs (not inclusive)
	 * @return the range of dossier logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierLog> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier logs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dossier logs
	 * @param end the upper bound of the range of dossier logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dossier logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierLog> findAll(int start, int end,
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

		List<DossierLog> list = (List<DossierLog>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DOSSIERLOG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DOSSIERLOG;

				if (pagination) {
					sql = sql.concat(DossierLogModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DossierLog>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DossierLog>(list);
				}
				else {
					list = (List<DossierLog>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the dossier logs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DossierLog dossierLog : findAll()) {
			remove(dossierLog);
		}
	}

	/**
	 * Returns the number of dossier logs.
	 *
	 * @return the number of dossier logs
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

				Query q = session.createQuery(_SQL_COUNT_DOSSIERLOG);

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
	 * Initializes the dossier log persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.opencps.dossiermgt.model.DossierLog")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DossierLog>> listenersList = new ArrayList<ModelListener<DossierLog>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DossierLog>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DossierLogImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DOSSIERLOG = "SELECT dossierLog FROM DossierLog dossierLog";
	private static final String _SQL_SELECT_DOSSIERLOG_WHERE = "SELECT dossierLog FROM DossierLog dossierLog WHERE ";
	private static final String _SQL_COUNT_DOSSIERLOG = "SELECT COUNT(dossierLog) FROM DossierLog dossierLog";
	private static final String _SQL_COUNT_DOSSIERLOG_WHERE = "SELECT COUNT(dossierLog) FROM DossierLog dossierLog WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dossierLog.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DossierLog exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DossierLog exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DossierLogPersistenceImpl.class);
	private static DossierLog _nullDossierLog = new DossierLogImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DossierLog> toCacheModel() {
				return _nullDossierLogCacheModel;
			}
		};

	private static CacheModel<DossierLog> _nullDossierLogCacheModel = new CacheModel<DossierLog>() {
			@Override
			public DossierLog toEntityModel() {
				return _nullDossierLog;
			}
		};
}