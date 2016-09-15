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

import org.opencps.dossiermgt.NoSuchDossierFileException;
import org.opencps.dossiermgt.model.DossierFile;
import org.opencps.dossiermgt.model.impl.DossierFileImpl;
import org.opencps.dossiermgt.model.impl.DossierFileModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dossier file service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungnt
 * @see DossierFilePersistence
 * @see DossierFileUtil
 * @generated
 */
public class DossierFilePersistenceImpl extends BasePersistenceImpl<DossierFile>
	implements DossierFilePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DossierFileUtil} to access the dossier file persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DossierFileImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DossierFileModelImpl.ENTITY_CACHE_ENABLED,
			DossierFileModelImpl.FINDER_CACHE_ENABLED, DossierFileImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DossierFileModelImpl.ENTITY_CACHE_ENABLED,
			DossierFileModelImpl.FINDER_CACHE_ENABLED, DossierFileImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DossierFileModelImpl.ENTITY_CACHE_ENABLED,
			DossierFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_D_DP = new FinderPath(DossierFileModelImpl.ENTITY_CACHE_ENABLED,
			DossierFileModelImpl.FINDER_CACHE_ENABLED, DossierFileImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByD_DP",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_DP = new FinderPath(DossierFileModelImpl.ENTITY_CACHE_ENABLED,
			DossierFileModelImpl.FINDER_CACHE_ENABLED, DossierFileImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByD_DP",
			new String[] { Long.class.getName(), Long.class.getName() },
			DossierFileModelImpl.DOSSIERID_COLUMN_BITMASK |
			DossierFileModelImpl.DOSSIERPARTID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_D_DP = new FinderPath(DossierFileModelImpl.ENTITY_CACHE_ENABLED,
			DossierFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByD_DP",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the dossier files where dossierId = &#63; and dossierPartId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param dossierPartId the dossier part ID
	 * @return the matching dossier files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierFile> findByD_DP(long dossierId, long dossierPartId)
		throws SystemException {
		return findByD_DP(dossierId, dossierPartId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier files where dossierId = &#63; and dossierPartId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param dossierPartId the dossier part ID
	 * @param start the lower bound of the range of dossier files
	 * @param end the upper bound of the range of dossier files (not inclusive)
	 * @return the range of matching dossier files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierFile> findByD_DP(long dossierId, long dossierPartId,
		int start, int end) throws SystemException {
		return findByD_DP(dossierId, dossierPartId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier files where dossierId = &#63; and dossierPartId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param dossierPartId the dossier part ID
	 * @param start the lower bound of the range of dossier files
	 * @param end the upper bound of the range of dossier files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dossier files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierFile> findByD_DP(long dossierId, long dossierPartId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_DP;
			finderArgs = new Object[] { dossierId, dossierPartId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_D_DP;
			finderArgs = new Object[] {
					dossierId, dossierPartId,
					
					start, end, orderByComparator
				};
		}

		List<DossierFile> list = (List<DossierFile>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DossierFile dossierFile : list) {
				if ((dossierId != dossierFile.getDossierId()) ||
						(dossierPartId != dossierFile.getDossierPartId())) {
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

			query.append(_SQL_SELECT_DOSSIERFILE_WHERE);

			query.append(_FINDER_COLUMN_D_DP_DOSSIERID_2);

			query.append(_FINDER_COLUMN_D_DP_DOSSIERPARTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DossierFileModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				qPos.add(dossierPartId);

				if (!pagination) {
					list = (List<DossierFile>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DossierFile>(list);
				}
				else {
					list = (List<DossierFile>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dossier file in the ordered set where dossierId = &#63; and dossierPartId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param dossierPartId the dossier part ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier file
	 * @throws org.opencps.dossiermgt.NoSuchDossierFileException if a matching dossier file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile findByD_DP_First(long dossierId, long dossierPartId,
		OrderByComparator orderByComparator)
		throws NoSuchDossierFileException, SystemException {
		DossierFile dossierFile = fetchByD_DP_First(dossierId, dossierPartId,
				orderByComparator);

		if (dossierFile != null) {
			return dossierFile;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", dossierPartId=");
		msg.append(dossierPartId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierFileException(msg.toString());
	}

	/**
	 * Returns the first dossier file in the ordered set where dossierId = &#63; and dossierPartId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param dossierPartId the dossier part ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier file, or <code>null</code> if a matching dossier file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile fetchByD_DP_First(long dossierId, long dossierPartId,
		OrderByComparator orderByComparator) throws SystemException {
		List<DossierFile> list = findByD_DP(dossierId, dossierPartId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dossier file in the ordered set where dossierId = &#63; and dossierPartId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param dossierPartId the dossier part ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier file
	 * @throws org.opencps.dossiermgt.NoSuchDossierFileException if a matching dossier file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile findByD_DP_Last(long dossierId, long dossierPartId,
		OrderByComparator orderByComparator)
		throws NoSuchDossierFileException, SystemException {
		DossierFile dossierFile = fetchByD_DP_Last(dossierId, dossierPartId,
				orderByComparator);

		if (dossierFile != null) {
			return dossierFile;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", dossierPartId=");
		msg.append(dossierPartId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierFileException(msg.toString());
	}

	/**
	 * Returns the last dossier file in the ordered set where dossierId = &#63; and dossierPartId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param dossierPartId the dossier part ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier file, or <code>null</code> if a matching dossier file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile fetchByD_DP_Last(long dossierId, long dossierPartId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByD_DP(dossierId, dossierPartId);

		if (count == 0) {
			return null;
		}

		List<DossierFile> list = findByD_DP(dossierId, dossierPartId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dossier files before and after the current dossier file in the ordered set where dossierId = &#63; and dossierPartId = &#63;.
	 *
	 * @param dossierFileId the primary key of the current dossier file
	 * @param dossierId the dossier ID
	 * @param dossierPartId the dossier part ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dossier file
	 * @throws org.opencps.dossiermgt.NoSuchDossierFileException if a dossier file with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile[] findByD_DP_PrevAndNext(long dossierFileId,
		long dossierId, long dossierPartId, OrderByComparator orderByComparator)
		throws NoSuchDossierFileException, SystemException {
		DossierFile dossierFile = findByPrimaryKey(dossierFileId);

		Session session = null;

		try {
			session = openSession();

			DossierFile[] array = new DossierFileImpl[3];

			array[0] = getByD_DP_PrevAndNext(session, dossierFile, dossierId,
					dossierPartId, orderByComparator, true);

			array[1] = dossierFile;

			array[2] = getByD_DP_PrevAndNext(session, dossierFile, dossierId,
					dossierPartId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DossierFile getByD_DP_PrevAndNext(Session session,
		DossierFile dossierFile, long dossierId, long dossierPartId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOSSIERFILE_WHERE);

		query.append(_FINDER_COLUMN_D_DP_DOSSIERID_2);

		query.append(_FINDER_COLUMN_D_DP_DOSSIERPARTID_2);

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
			query.append(DossierFileModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		qPos.add(dossierPartId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dossierFile);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DossierFile> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dossier files where dossierId = &#63; and dossierPartId = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @param dossierPartId the dossier part ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByD_DP(long dossierId, long dossierPartId)
		throws SystemException {
		for (DossierFile dossierFile : findByD_DP(dossierId, dossierPartId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dossierFile);
		}
	}

	/**
	 * Returns the number of dossier files where dossierId = &#63; and dossierPartId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param dossierPartId the dossier part ID
	 * @return the number of matching dossier files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByD_DP(long dossierId, long dossierPartId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_D_DP;

		Object[] finderArgs = new Object[] { dossierId, dossierPartId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DOSSIERFILE_WHERE);

			query.append(_FINDER_COLUMN_D_DP_DOSSIERID_2);

			query.append(_FINDER_COLUMN_D_DP_DOSSIERPARTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				qPos.add(dossierPartId);

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

	private static final String _FINDER_COLUMN_D_DP_DOSSIERID_2 = "dossierFile.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_D_DP_DOSSIERPARTID_2 = "dossierFile.dossierPartId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(DossierFileModelImpl.ENTITY_CACHE_ENABLED,
			DossierFileModelImpl.FINDER_CACHE_ENABLED, DossierFileImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(DossierFileModelImpl.ENTITY_CACHE_ENABLED,
			DossierFileModelImpl.FINDER_CACHE_ENABLED, DossierFileImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDossierId",
			new String[] { Long.class.getName() },
			DossierFileModelImpl.DOSSIERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERID = new FinderPath(DossierFileModelImpl.ENTITY_CACHE_ENABLED,
			DossierFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the dossier files where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the matching dossier files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierFile> findByDossierId(long dossierId)
		throws SystemException {
		return findByDossierId(dossierId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the dossier files where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of dossier files
	 * @param end the upper bound of the range of dossier files (not inclusive)
	 * @return the range of matching dossier files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierFile> findByDossierId(long dossierId, int start, int end)
		throws SystemException {
		return findByDossierId(dossierId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier files where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of dossier files
	 * @param end the upper bound of the range of dossier files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dossier files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierFile> findByDossierId(long dossierId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
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

		List<DossierFile> list = (List<DossierFile>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DossierFile dossierFile : list) {
				if ((dossierId != dossierFile.getDossierId())) {
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

			query.append(_SQL_SELECT_DOSSIERFILE_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DossierFileModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (!pagination) {
					list = (List<DossierFile>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DossierFile>(list);
				}
				else {
					list = (List<DossierFile>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dossier file in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier file
	 * @throws org.opencps.dossiermgt.NoSuchDossierFileException if a matching dossier file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile findByDossierId_First(long dossierId,
		OrderByComparator orderByComparator)
		throws NoSuchDossierFileException, SystemException {
		DossierFile dossierFile = fetchByDossierId_First(dossierId,
				orderByComparator);

		if (dossierFile != null) {
			return dossierFile;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierFileException(msg.toString());
	}

	/**
	 * Returns the first dossier file in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier file, or <code>null</code> if a matching dossier file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile fetchByDossierId_First(long dossierId,
		OrderByComparator orderByComparator) throws SystemException {
		List<DossierFile> list = findByDossierId(dossierId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dossier file in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier file
	 * @throws org.opencps.dossiermgt.NoSuchDossierFileException if a matching dossier file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile findByDossierId_Last(long dossierId,
		OrderByComparator orderByComparator)
		throws NoSuchDossierFileException, SystemException {
		DossierFile dossierFile = fetchByDossierId_Last(dossierId,
				orderByComparator);

		if (dossierFile != null) {
			return dossierFile;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierFileException(msg.toString());
	}

	/**
	 * Returns the last dossier file in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier file, or <code>null</code> if a matching dossier file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile fetchByDossierId_Last(long dossierId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByDossierId(dossierId);

		if (count == 0) {
			return null;
		}

		List<DossierFile> list = findByDossierId(dossierId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dossier files before and after the current dossier file in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierFileId the primary key of the current dossier file
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dossier file
	 * @throws org.opencps.dossiermgt.NoSuchDossierFileException if a dossier file with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile[] findByDossierId_PrevAndNext(long dossierFileId,
		long dossierId, OrderByComparator orderByComparator)
		throws NoSuchDossierFileException, SystemException {
		DossierFile dossierFile = findByPrimaryKey(dossierFileId);

		Session session = null;

		try {
			session = openSession();

			DossierFile[] array = new DossierFileImpl[3];

			array[0] = getByDossierId_PrevAndNext(session, dossierFile,
					dossierId, orderByComparator, true);

			array[1] = dossierFile;

			array[2] = getByDossierId_PrevAndNext(session, dossierFile,
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

	protected DossierFile getByDossierId_PrevAndNext(Session session,
		DossierFile dossierFile, long dossierId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOSSIERFILE_WHERE);

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
			query.append(DossierFileModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dossierFile);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DossierFile> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dossier files where dossierId = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDossierId(long dossierId) throws SystemException {
		for (DossierFile dossierFile : findByDossierId(dossierId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dossierFile);
		}
	}

	/**
	 * Returns the number of dossier files where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the number of matching dossier files
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

			query.append(_SQL_COUNT_DOSSIERFILE_WHERE);

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

	private static final String _FINDER_COLUMN_DOSSIERID_DOSSIERID_2 = "dossierFile.dossierId = ? AND dossierFile.removed=0";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_D_GF = new FinderPath(DossierFileModelImpl.ENTITY_CACHE_ENABLED,
			DossierFileModelImpl.FINDER_CACHE_ENABLED, DossierFileImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByD_GF",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_GF = new FinderPath(DossierFileModelImpl.ENTITY_CACHE_ENABLED,
			DossierFileModelImpl.FINDER_CACHE_ENABLED, DossierFileImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByD_GF",
			new String[] { Long.class.getName(), Long.class.getName() },
			DossierFileModelImpl.DOSSIERID_COLUMN_BITMASK |
			DossierFileModelImpl.GROUPFILEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_D_GF = new FinderPath(DossierFileModelImpl.ENTITY_CACHE_ENABLED,
			DossierFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByD_GF",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the dossier files where dossierId = &#63; and groupFileId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param groupFileId the group file ID
	 * @return the matching dossier files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierFile> findByD_GF(long dossierId, long groupFileId)
		throws SystemException {
		return findByD_GF(dossierId, groupFileId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier files where dossierId = &#63; and groupFileId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param groupFileId the group file ID
	 * @param start the lower bound of the range of dossier files
	 * @param end the upper bound of the range of dossier files (not inclusive)
	 * @return the range of matching dossier files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierFile> findByD_GF(long dossierId, long groupFileId,
		int start, int end) throws SystemException {
		return findByD_GF(dossierId, groupFileId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier files where dossierId = &#63; and groupFileId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param groupFileId the group file ID
	 * @param start the lower bound of the range of dossier files
	 * @param end the upper bound of the range of dossier files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dossier files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierFile> findByD_GF(long dossierId, long groupFileId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_GF;
			finderArgs = new Object[] { dossierId, groupFileId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_D_GF;
			finderArgs = new Object[] {
					dossierId, groupFileId,
					
					start, end, orderByComparator
				};
		}

		List<DossierFile> list = (List<DossierFile>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DossierFile dossierFile : list) {
				if ((dossierId != dossierFile.getDossierId()) ||
						(groupFileId != dossierFile.getGroupFileId())) {
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

			query.append(_SQL_SELECT_DOSSIERFILE_WHERE);

			query.append(_FINDER_COLUMN_D_GF_DOSSIERID_2);

			query.append(_FINDER_COLUMN_D_GF_GROUPFILEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DossierFileModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				qPos.add(groupFileId);

				if (!pagination) {
					list = (List<DossierFile>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DossierFile>(list);
				}
				else {
					list = (List<DossierFile>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dossier file in the ordered set where dossierId = &#63; and groupFileId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param groupFileId the group file ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier file
	 * @throws org.opencps.dossiermgt.NoSuchDossierFileException if a matching dossier file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile findByD_GF_First(long dossierId, long groupFileId,
		OrderByComparator orderByComparator)
		throws NoSuchDossierFileException, SystemException {
		DossierFile dossierFile = fetchByD_GF_First(dossierId, groupFileId,
				orderByComparator);

		if (dossierFile != null) {
			return dossierFile;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", groupFileId=");
		msg.append(groupFileId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierFileException(msg.toString());
	}

	/**
	 * Returns the first dossier file in the ordered set where dossierId = &#63; and groupFileId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param groupFileId the group file ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier file, or <code>null</code> if a matching dossier file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile fetchByD_GF_First(long dossierId, long groupFileId,
		OrderByComparator orderByComparator) throws SystemException {
		List<DossierFile> list = findByD_GF(dossierId, groupFileId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dossier file in the ordered set where dossierId = &#63; and groupFileId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param groupFileId the group file ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier file
	 * @throws org.opencps.dossiermgt.NoSuchDossierFileException if a matching dossier file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile findByD_GF_Last(long dossierId, long groupFileId,
		OrderByComparator orderByComparator)
		throws NoSuchDossierFileException, SystemException {
		DossierFile dossierFile = fetchByD_GF_Last(dossierId, groupFileId,
				orderByComparator);

		if (dossierFile != null) {
			return dossierFile;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", groupFileId=");
		msg.append(groupFileId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierFileException(msg.toString());
	}

	/**
	 * Returns the last dossier file in the ordered set where dossierId = &#63; and groupFileId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param groupFileId the group file ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier file, or <code>null</code> if a matching dossier file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile fetchByD_GF_Last(long dossierId, long groupFileId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByD_GF(dossierId, groupFileId);

		if (count == 0) {
			return null;
		}

		List<DossierFile> list = findByD_GF(dossierId, groupFileId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dossier files before and after the current dossier file in the ordered set where dossierId = &#63; and groupFileId = &#63;.
	 *
	 * @param dossierFileId the primary key of the current dossier file
	 * @param dossierId the dossier ID
	 * @param groupFileId the group file ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dossier file
	 * @throws org.opencps.dossiermgt.NoSuchDossierFileException if a dossier file with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile[] findByD_GF_PrevAndNext(long dossierFileId,
		long dossierId, long groupFileId, OrderByComparator orderByComparator)
		throws NoSuchDossierFileException, SystemException {
		DossierFile dossierFile = findByPrimaryKey(dossierFileId);

		Session session = null;

		try {
			session = openSession();

			DossierFile[] array = new DossierFileImpl[3];

			array[0] = getByD_GF_PrevAndNext(session, dossierFile, dossierId,
					groupFileId, orderByComparator, true);

			array[1] = dossierFile;

			array[2] = getByD_GF_PrevAndNext(session, dossierFile, dossierId,
					groupFileId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DossierFile getByD_GF_PrevAndNext(Session session,
		DossierFile dossierFile, long dossierId, long groupFileId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOSSIERFILE_WHERE);

		query.append(_FINDER_COLUMN_D_GF_DOSSIERID_2);

		query.append(_FINDER_COLUMN_D_GF_GROUPFILEID_2);

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
			query.append(DossierFileModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		qPos.add(groupFileId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dossierFile);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DossierFile> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dossier files where dossierId = &#63; and groupFileId = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @param groupFileId the group file ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByD_GF(long dossierId, long groupFileId)
		throws SystemException {
		for (DossierFile dossierFile : findByD_GF(dossierId, groupFileId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dossierFile);
		}
	}

	/**
	 * Returns the number of dossier files where dossierId = &#63; and groupFileId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param groupFileId the group file ID
	 * @return the number of matching dossier files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByD_GF(long dossierId, long groupFileId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_D_GF;

		Object[] finderArgs = new Object[] { dossierId, groupFileId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DOSSIERFILE_WHERE);

			query.append(_FINDER_COLUMN_D_GF_DOSSIERID_2);

			query.append(_FINDER_COLUMN_D_GF_GROUPFILEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				qPos.add(groupFileId);

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

	private static final String _FINDER_COLUMN_D_GF_DOSSIERID_2 = "dossierFile.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_D_GF_GROUPFILEID_2 = "dossierFile.groupFileId = ? AND dossierFile.removed=0";
	public static final FinderPath FINDER_PATH_FETCH_BY_DOSSIERFILEINUSE = new FinderPath(DossierFileModelImpl.ENTITY_CACHE_ENABLED,
			DossierFileModelImpl.FINDER_CACHE_ENABLED, DossierFileImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByDossierFileInUse",
			new String[] { Long.class.getName(), Long.class.getName() },
			DossierFileModelImpl.DOSSIERID_COLUMN_BITMASK |
			DossierFileModelImpl.DOSSIERPARTID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERFILEINUSE = new FinderPath(DossierFileModelImpl.ENTITY_CACHE_ENABLED,
			DossierFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDossierFileInUse",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns the dossier file where dossierId = &#63; and dossierPartId = &#63; or throws a {@link org.opencps.dossiermgt.NoSuchDossierFileException} if it could not be found.
	 *
	 * @param dossierId the dossier ID
	 * @param dossierPartId the dossier part ID
	 * @return the matching dossier file
	 * @throws org.opencps.dossiermgt.NoSuchDossierFileException if a matching dossier file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile findByDossierFileInUse(long dossierId, long dossierPartId)
		throws NoSuchDossierFileException, SystemException {
		DossierFile dossierFile = fetchByDossierFileInUse(dossierId,
				dossierPartId);

		if (dossierFile == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("dossierId=");
			msg.append(dossierId);

			msg.append(", dossierPartId=");
			msg.append(dossierPartId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDossierFileException(msg.toString());
		}

		return dossierFile;
	}

	/**
	 * Returns the dossier file where dossierId = &#63; and dossierPartId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param dossierId the dossier ID
	 * @param dossierPartId the dossier part ID
	 * @return the matching dossier file, or <code>null</code> if a matching dossier file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile fetchByDossierFileInUse(long dossierId,
		long dossierPartId) throws SystemException {
		return fetchByDossierFileInUse(dossierId, dossierPartId, true);
	}

	/**
	 * Returns the dossier file where dossierId = &#63; and dossierPartId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param dossierId the dossier ID
	 * @param dossierPartId the dossier part ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dossier file, or <code>null</code> if a matching dossier file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile fetchByDossierFileInUse(long dossierId,
		long dossierPartId, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { dossierId, dossierPartId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_DOSSIERFILEINUSE,
					finderArgs, this);
		}

		if (result instanceof DossierFile) {
			DossierFile dossierFile = (DossierFile)result;

			if ((dossierId != dossierFile.getDossierId()) ||
					(dossierPartId != dossierFile.getDossierPartId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_DOSSIERFILE_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERFILEINUSE_DOSSIERID_2);

			query.append(_FINDER_COLUMN_DOSSIERFILEINUSE_DOSSIERPARTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				qPos.add(dossierPartId);

				List<DossierFile> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOSSIERFILEINUSE,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DossierFilePersistenceImpl.fetchByDossierFileInUse(long, long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DossierFile dossierFile = list.get(0);

					result = dossierFile;

					cacheResult(dossierFile);

					if ((dossierFile.getDossierId() != dossierId) ||
							(dossierFile.getDossierPartId() != dossierPartId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOSSIERFILEINUSE,
							finderArgs, dossierFile);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DOSSIERFILEINUSE,
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
			return (DossierFile)result;
		}
	}

	/**
	 * Removes the dossier file where dossierId = &#63; and dossierPartId = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @param dossierPartId the dossier part ID
	 * @return the dossier file that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile removeByDossierFileInUse(long dossierId,
		long dossierPartId) throws NoSuchDossierFileException, SystemException {
		DossierFile dossierFile = findByDossierFileInUse(dossierId,
				dossierPartId);

		return remove(dossierFile);
	}

	/**
	 * Returns the number of dossier files where dossierId = &#63; and dossierPartId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param dossierPartId the dossier part ID
	 * @return the number of matching dossier files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDossierFileInUse(long dossierId, long dossierPartId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERFILEINUSE;

		Object[] finderArgs = new Object[] { dossierId, dossierPartId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DOSSIERFILE_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERFILEINUSE_DOSSIERID_2);

			query.append(_FINDER_COLUMN_DOSSIERFILEINUSE_DOSSIERPARTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				qPos.add(dossierPartId);

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

	private static final String _FINDER_COLUMN_DOSSIERFILEINUSE_DOSSIERID_2 = "dossierFile.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_DOSSIERFILEINUSE_DOSSIERPARTID_2 = "dossierFile.dossierPartId = ? AND dossierFile.removed=0";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_D_DP_GF = new FinderPath(DossierFileModelImpl.ENTITY_CACHE_ENABLED,
			DossierFileModelImpl.FINDER_CACHE_ENABLED, DossierFileImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByD_DP_GF",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_DP_GF =
		new FinderPath(DossierFileModelImpl.ENTITY_CACHE_ENABLED,
			DossierFileModelImpl.FINDER_CACHE_ENABLED, DossierFileImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByD_DP_GF",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			},
			DossierFileModelImpl.DOSSIERID_COLUMN_BITMASK |
			DossierFileModelImpl.DOSSIERPARTID_COLUMN_BITMASK |
			DossierFileModelImpl.GROUPFILEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_D_DP_GF = new FinderPath(DossierFileModelImpl.ENTITY_CACHE_ENABLED,
			DossierFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByD_DP_GF",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});

	/**
	 * Returns all the dossier files where dossierId = &#63; and dossierPartId = &#63; and groupFileId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param dossierPartId the dossier part ID
	 * @param groupFileId the group file ID
	 * @return the matching dossier files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierFile> findByD_DP_GF(long dossierId, long dossierPartId,
		long groupFileId) throws SystemException {
		return findByD_DP_GF(dossierId, dossierPartId, groupFileId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier files where dossierId = &#63; and dossierPartId = &#63; and groupFileId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param dossierPartId the dossier part ID
	 * @param groupFileId the group file ID
	 * @param start the lower bound of the range of dossier files
	 * @param end the upper bound of the range of dossier files (not inclusive)
	 * @return the range of matching dossier files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierFile> findByD_DP_GF(long dossierId, long dossierPartId,
		long groupFileId, int start, int end) throws SystemException {
		return findByD_DP_GF(dossierId, dossierPartId, groupFileId, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the dossier files where dossierId = &#63; and dossierPartId = &#63; and groupFileId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param dossierPartId the dossier part ID
	 * @param groupFileId the group file ID
	 * @param start the lower bound of the range of dossier files
	 * @param end the upper bound of the range of dossier files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dossier files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierFile> findByD_DP_GF(long dossierId, long dossierPartId,
		long groupFileId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_DP_GF;
			finderArgs = new Object[] { dossierId, dossierPartId, groupFileId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_D_DP_GF;
			finderArgs = new Object[] {
					dossierId, dossierPartId, groupFileId,
					
					start, end, orderByComparator
				};
		}

		List<DossierFile> list = (List<DossierFile>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DossierFile dossierFile : list) {
				if ((dossierId != dossierFile.getDossierId()) ||
						(dossierPartId != dossierFile.getDossierPartId()) ||
						(groupFileId != dossierFile.getGroupFileId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_DOSSIERFILE_WHERE);

			query.append(_FINDER_COLUMN_D_DP_GF_DOSSIERID_2);

			query.append(_FINDER_COLUMN_D_DP_GF_DOSSIERPARTID_2);

			query.append(_FINDER_COLUMN_D_DP_GF_GROUPFILEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DossierFileModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				qPos.add(dossierPartId);

				qPos.add(groupFileId);

				if (!pagination) {
					list = (List<DossierFile>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DossierFile>(list);
				}
				else {
					list = (List<DossierFile>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dossier file in the ordered set where dossierId = &#63; and dossierPartId = &#63; and groupFileId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param dossierPartId the dossier part ID
	 * @param groupFileId the group file ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier file
	 * @throws org.opencps.dossiermgt.NoSuchDossierFileException if a matching dossier file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile findByD_DP_GF_First(long dossierId, long dossierPartId,
		long groupFileId, OrderByComparator orderByComparator)
		throws NoSuchDossierFileException, SystemException {
		DossierFile dossierFile = fetchByD_DP_GF_First(dossierId,
				dossierPartId, groupFileId, orderByComparator);

		if (dossierFile != null) {
			return dossierFile;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", dossierPartId=");
		msg.append(dossierPartId);

		msg.append(", groupFileId=");
		msg.append(groupFileId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierFileException(msg.toString());
	}

	/**
	 * Returns the first dossier file in the ordered set where dossierId = &#63; and dossierPartId = &#63; and groupFileId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param dossierPartId the dossier part ID
	 * @param groupFileId the group file ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier file, or <code>null</code> if a matching dossier file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile fetchByD_DP_GF_First(long dossierId, long dossierPartId,
		long groupFileId, OrderByComparator orderByComparator)
		throws SystemException {
		List<DossierFile> list = findByD_DP_GF(dossierId, dossierPartId,
				groupFileId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dossier file in the ordered set where dossierId = &#63; and dossierPartId = &#63; and groupFileId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param dossierPartId the dossier part ID
	 * @param groupFileId the group file ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier file
	 * @throws org.opencps.dossiermgt.NoSuchDossierFileException if a matching dossier file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile findByD_DP_GF_Last(long dossierId, long dossierPartId,
		long groupFileId, OrderByComparator orderByComparator)
		throws NoSuchDossierFileException, SystemException {
		DossierFile dossierFile = fetchByD_DP_GF_Last(dossierId, dossierPartId,
				groupFileId, orderByComparator);

		if (dossierFile != null) {
			return dossierFile;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", dossierPartId=");
		msg.append(dossierPartId);

		msg.append(", groupFileId=");
		msg.append(groupFileId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierFileException(msg.toString());
	}

	/**
	 * Returns the last dossier file in the ordered set where dossierId = &#63; and dossierPartId = &#63; and groupFileId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param dossierPartId the dossier part ID
	 * @param groupFileId the group file ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier file, or <code>null</code> if a matching dossier file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile fetchByD_DP_GF_Last(long dossierId, long dossierPartId,
		long groupFileId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByD_DP_GF(dossierId, dossierPartId, groupFileId);

		if (count == 0) {
			return null;
		}

		List<DossierFile> list = findByD_DP_GF(dossierId, dossierPartId,
				groupFileId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dossier files before and after the current dossier file in the ordered set where dossierId = &#63; and dossierPartId = &#63; and groupFileId = &#63;.
	 *
	 * @param dossierFileId the primary key of the current dossier file
	 * @param dossierId the dossier ID
	 * @param dossierPartId the dossier part ID
	 * @param groupFileId the group file ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dossier file
	 * @throws org.opencps.dossiermgt.NoSuchDossierFileException if a dossier file with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile[] findByD_DP_GF_PrevAndNext(long dossierFileId,
		long dossierId, long dossierPartId, long groupFileId,
		OrderByComparator orderByComparator)
		throws NoSuchDossierFileException, SystemException {
		DossierFile dossierFile = findByPrimaryKey(dossierFileId);

		Session session = null;

		try {
			session = openSession();

			DossierFile[] array = new DossierFileImpl[3];

			array[0] = getByD_DP_GF_PrevAndNext(session, dossierFile,
					dossierId, dossierPartId, groupFileId, orderByComparator,
					true);

			array[1] = dossierFile;

			array[2] = getByD_DP_GF_PrevAndNext(session, dossierFile,
					dossierId, dossierPartId, groupFileId, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DossierFile getByD_DP_GF_PrevAndNext(Session session,
		DossierFile dossierFile, long dossierId, long dossierPartId,
		long groupFileId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOSSIERFILE_WHERE);

		query.append(_FINDER_COLUMN_D_DP_GF_DOSSIERID_2);

		query.append(_FINDER_COLUMN_D_DP_GF_DOSSIERPARTID_2);

		query.append(_FINDER_COLUMN_D_DP_GF_GROUPFILEID_2);

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
			query.append(DossierFileModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		qPos.add(dossierPartId);

		qPos.add(groupFileId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dossierFile);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DossierFile> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dossier files where dossierId = &#63; and dossierPartId = &#63; and groupFileId = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @param dossierPartId the dossier part ID
	 * @param groupFileId the group file ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByD_DP_GF(long dossierId, long dossierPartId,
		long groupFileId) throws SystemException {
		for (DossierFile dossierFile : findByD_DP_GF(dossierId, dossierPartId,
				groupFileId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dossierFile);
		}
	}

	/**
	 * Returns the number of dossier files where dossierId = &#63; and dossierPartId = &#63; and groupFileId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param dossierPartId the dossier part ID
	 * @param groupFileId the group file ID
	 * @return the number of matching dossier files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByD_DP_GF(long dossierId, long dossierPartId,
		long groupFileId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_D_DP_GF;

		Object[] finderArgs = new Object[] { dossierId, dossierPartId, groupFileId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_DOSSIERFILE_WHERE);

			query.append(_FINDER_COLUMN_D_DP_GF_DOSSIERID_2);

			query.append(_FINDER_COLUMN_D_DP_GF_DOSSIERPARTID_2);

			query.append(_FINDER_COLUMN_D_DP_GF_GROUPFILEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				qPos.add(dossierPartId);

				qPos.add(groupFileId);

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

	private static final String _FINDER_COLUMN_D_DP_GF_DOSSIERID_2 = "dossierFile.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_D_DP_GF_DOSSIERPARTID_2 = "dossierFile.dossierPartId = ? AND ";
	private static final String _FINDER_COLUMN_D_DP_GF_GROUPFILEID_2 = "dossierFile.groupFileId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_DOSSIERFILEINUSEBYGROUPFILEID =
		new FinderPath(DossierFileModelImpl.ENTITY_CACHE_ENABLED,
			DossierFileModelImpl.FINDER_CACHE_ENABLED, DossierFileImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByDossierFileInUseByGroupFileId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			},
			DossierFileModelImpl.DOSSIERID_COLUMN_BITMASK |
			DossierFileModelImpl.DOSSIERPARTID_COLUMN_BITMASK |
			DossierFileModelImpl.GROUPFILEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERFILEINUSEBYGROUPFILEID =
		new FinderPath(DossierFileModelImpl.ENTITY_CACHE_ENABLED,
			DossierFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDossierFileInUseByGroupFileId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});

	/**
	 * Returns the dossier file where dossierId = &#63; and dossierPartId = &#63; and groupFileId = &#63; or throws a {@link org.opencps.dossiermgt.NoSuchDossierFileException} if it could not be found.
	 *
	 * @param dossierId the dossier ID
	 * @param dossierPartId the dossier part ID
	 * @param groupFileId the group file ID
	 * @return the matching dossier file
	 * @throws org.opencps.dossiermgt.NoSuchDossierFileException if a matching dossier file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile findByDossierFileInUseByGroupFileId(long dossierId,
		long dossierPartId, long groupFileId)
		throws NoSuchDossierFileException, SystemException {
		DossierFile dossierFile = fetchByDossierFileInUseByGroupFileId(dossierId,
				dossierPartId, groupFileId);

		if (dossierFile == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("dossierId=");
			msg.append(dossierId);

			msg.append(", dossierPartId=");
			msg.append(dossierPartId);

			msg.append(", groupFileId=");
			msg.append(groupFileId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDossierFileException(msg.toString());
		}

		return dossierFile;
	}

	/**
	 * Returns the dossier file where dossierId = &#63; and dossierPartId = &#63; and groupFileId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param dossierId the dossier ID
	 * @param dossierPartId the dossier part ID
	 * @param groupFileId the group file ID
	 * @return the matching dossier file, or <code>null</code> if a matching dossier file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile fetchByDossierFileInUseByGroupFileId(long dossierId,
		long dossierPartId, long groupFileId) throws SystemException {
		return fetchByDossierFileInUseByGroupFileId(dossierId, dossierPartId,
			groupFileId, true);
	}

	/**
	 * Returns the dossier file where dossierId = &#63; and dossierPartId = &#63; and groupFileId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param dossierId the dossier ID
	 * @param dossierPartId the dossier part ID
	 * @param groupFileId the group file ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dossier file, or <code>null</code> if a matching dossier file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile fetchByDossierFileInUseByGroupFileId(long dossierId,
		long dossierPartId, long groupFileId, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { dossierId, dossierPartId, groupFileId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_DOSSIERFILEINUSEBYGROUPFILEID,
					finderArgs, this);
		}

		if (result instanceof DossierFile) {
			DossierFile dossierFile = (DossierFile)result;

			if ((dossierId != dossierFile.getDossierId()) ||
					(dossierPartId != dossierFile.getDossierPartId()) ||
					(groupFileId != dossierFile.getGroupFileId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_DOSSIERFILE_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERFILEINUSEBYGROUPFILEID_DOSSIERID_2);

			query.append(_FINDER_COLUMN_DOSSIERFILEINUSEBYGROUPFILEID_DOSSIERPARTID_2);

			query.append(_FINDER_COLUMN_DOSSIERFILEINUSEBYGROUPFILEID_GROUPFILEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				qPos.add(dossierPartId);

				qPos.add(groupFileId);

				List<DossierFile> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOSSIERFILEINUSEBYGROUPFILEID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DossierFilePersistenceImpl.fetchByDossierFileInUseByGroupFileId(long, long, long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DossierFile dossierFile = list.get(0);

					result = dossierFile;

					cacheResult(dossierFile);

					if ((dossierFile.getDossierId() != dossierId) ||
							(dossierFile.getDossierPartId() != dossierPartId) ||
							(dossierFile.getGroupFileId() != groupFileId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOSSIERFILEINUSEBYGROUPFILEID,
							finderArgs, dossierFile);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DOSSIERFILEINUSEBYGROUPFILEID,
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
			return (DossierFile)result;
		}
	}

	/**
	 * Removes the dossier file where dossierId = &#63; and dossierPartId = &#63; and groupFileId = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @param dossierPartId the dossier part ID
	 * @param groupFileId the group file ID
	 * @return the dossier file that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile removeByDossierFileInUseByGroupFileId(long dossierId,
		long dossierPartId, long groupFileId)
		throws NoSuchDossierFileException, SystemException {
		DossierFile dossierFile = findByDossierFileInUseByGroupFileId(dossierId,
				dossierPartId, groupFileId);

		return remove(dossierFile);
	}

	/**
	 * Returns the number of dossier files where dossierId = &#63; and dossierPartId = &#63; and groupFileId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param dossierPartId the dossier part ID
	 * @param groupFileId the group file ID
	 * @return the number of matching dossier files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDossierFileInUseByGroupFileId(long dossierId,
		long dossierPartId, long groupFileId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERFILEINUSEBYGROUPFILEID;

		Object[] finderArgs = new Object[] { dossierId, dossierPartId, groupFileId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_DOSSIERFILE_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERFILEINUSEBYGROUPFILEID_DOSSIERID_2);

			query.append(_FINDER_COLUMN_DOSSIERFILEINUSEBYGROUPFILEID_DOSSIERPARTID_2);

			query.append(_FINDER_COLUMN_DOSSIERFILEINUSEBYGROUPFILEID_GROUPFILEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				qPos.add(dossierPartId);

				qPos.add(groupFileId);

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

	private static final String _FINDER_COLUMN_DOSSIERFILEINUSEBYGROUPFILEID_DOSSIERID_2 =
		"dossierFile.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_DOSSIERFILEINUSEBYGROUPFILEID_DOSSIERPARTID_2 =
		"dossierFile.dossierPartId = ? AND ";
	private static final String _FINDER_COLUMN_DOSSIERFILEINUSEBYGROUPFILEID_GROUPFILEID_2 =
		"dossierFile.groupFileId = ? AND dossierFile.removed=0";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TEMPLATEFILENODOSSIERID =
		new FinderPath(DossierFileModelImpl.ENTITY_CACHE_ENABLED,
			DossierFileModelImpl.FINDER_CACHE_ENABLED, DossierFileImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByTemplateFileNoDossierId",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEMPLATEFILENODOSSIERID =
		new FinderPath(DossierFileModelImpl.ENTITY_CACHE_ENABLED,
			DossierFileModelImpl.FINDER_CACHE_ENABLED, DossierFileImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByTemplateFileNoDossierId",
			new String[] { Long.class.getName(), String.class.getName() },
			DossierFileModelImpl.DOSSIERID_COLUMN_BITMASK |
			DossierFileModelImpl.TEMPLATEFILENO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TEMPLATEFILENODOSSIERID = new FinderPath(DossierFileModelImpl.ENTITY_CACHE_ENABLED,
			DossierFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByTemplateFileNoDossierId",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the dossier files where dossierId = &#63; and templateFileNo = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param templateFileNo the template file no
	 * @return the matching dossier files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierFile> findByTemplateFileNoDossierId(long dossierId,
		String templateFileNo) throws SystemException {
		return findByTemplateFileNoDossierId(dossierId, templateFileNo,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier files where dossierId = &#63; and templateFileNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param templateFileNo the template file no
	 * @param start the lower bound of the range of dossier files
	 * @param end the upper bound of the range of dossier files (not inclusive)
	 * @return the range of matching dossier files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierFile> findByTemplateFileNoDossierId(long dossierId,
		String templateFileNo, int start, int end) throws SystemException {
		return findByTemplateFileNoDossierId(dossierId, templateFileNo, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the dossier files where dossierId = &#63; and templateFileNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param templateFileNo the template file no
	 * @param start the lower bound of the range of dossier files
	 * @param end the upper bound of the range of dossier files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dossier files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierFile> findByTemplateFileNoDossierId(long dossierId,
		String templateFileNo, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEMPLATEFILENODOSSIERID;
			finderArgs = new Object[] { dossierId, templateFileNo };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TEMPLATEFILENODOSSIERID;
			finderArgs = new Object[] {
					dossierId, templateFileNo,
					
					start, end, orderByComparator
				};
		}

		List<DossierFile> list = (List<DossierFile>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DossierFile dossierFile : list) {
				if ((dossierId != dossierFile.getDossierId()) ||
						!Validator.equals(templateFileNo,
							dossierFile.getTemplateFileNo())) {
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

			query.append(_SQL_SELECT_DOSSIERFILE_WHERE);

			query.append(_FINDER_COLUMN_TEMPLATEFILENODOSSIERID_DOSSIERID_2);

			boolean bindTemplateFileNo = false;

			if (templateFileNo == null) {
				query.append(_FINDER_COLUMN_TEMPLATEFILENODOSSIERID_TEMPLATEFILENO_1);
			}
			else if (templateFileNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEMPLATEFILENODOSSIERID_TEMPLATEFILENO_3);
			}
			else {
				bindTemplateFileNo = true;

				query.append(_FINDER_COLUMN_TEMPLATEFILENODOSSIERID_TEMPLATEFILENO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DossierFileModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (bindTemplateFileNo) {
					qPos.add(templateFileNo);
				}

				if (!pagination) {
					list = (List<DossierFile>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DossierFile>(list);
				}
				else {
					list = (List<DossierFile>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dossier file in the ordered set where dossierId = &#63; and templateFileNo = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param templateFileNo the template file no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier file
	 * @throws org.opencps.dossiermgt.NoSuchDossierFileException if a matching dossier file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile findByTemplateFileNoDossierId_First(long dossierId,
		String templateFileNo, OrderByComparator orderByComparator)
		throws NoSuchDossierFileException, SystemException {
		DossierFile dossierFile = fetchByTemplateFileNoDossierId_First(dossierId,
				templateFileNo, orderByComparator);

		if (dossierFile != null) {
			return dossierFile;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", templateFileNo=");
		msg.append(templateFileNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierFileException(msg.toString());
	}

	/**
	 * Returns the first dossier file in the ordered set where dossierId = &#63; and templateFileNo = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param templateFileNo the template file no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier file, or <code>null</code> if a matching dossier file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile fetchByTemplateFileNoDossierId_First(long dossierId,
		String templateFileNo, OrderByComparator orderByComparator)
		throws SystemException {
		List<DossierFile> list = findByTemplateFileNoDossierId(dossierId,
				templateFileNo, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dossier file in the ordered set where dossierId = &#63; and templateFileNo = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param templateFileNo the template file no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier file
	 * @throws org.opencps.dossiermgt.NoSuchDossierFileException if a matching dossier file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile findByTemplateFileNoDossierId_Last(long dossierId,
		String templateFileNo, OrderByComparator orderByComparator)
		throws NoSuchDossierFileException, SystemException {
		DossierFile dossierFile = fetchByTemplateFileNoDossierId_Last(dossierId,
				templateFileNo, orderByComparator);

		if (dossierFile != null) {
			return dossierFile;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", templateFileNo=");
		msg.append(templateFileNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierFileException(msg.toString());
	}

	/**
	 * Returns the last dossier file in the ordered set where dossierId = &#63; and templateFileNo = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param templateFileNo the template file no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier file, or <code>null</code> if a matching dossier file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile fetchByTemplateFileNoDossierId_Last(long dossierId,
		String templateFileNo, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByTemplateFileNoDossierId(dossierId, templateFileNo);

		if (count == 0) {
			return null;
		}

		List<DossierFile> list = findByTemplateFileNoDossierId(dossierId,
				templateFileNo, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dossier files before and after the current dossier file in the ordered set where dossierId = &#63; and templateFileNo = &#63;.
	 *
	 * @param dossierFileId the primary key of the current dossier file
	 * @param dossierId the dossier ID
	 * @param templateFileNo the template file no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dossier file
	 * @throws org.opencps.dossiermgt.NoSuchDossierFileException if a dossier file with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile[] findByTemplateFileNoDossierId_PrevAndNext(
		long dossierFileId, long dossierId, String templateFileNo,
		OrderByComparator orderByComparator)
		throws NoSuchDossierFileException, SystemException {
		DossierFile dossierFile = findByPrimaryKey(dossierFileId);

		Session session = null;

		try {
			session = openSession();

			DossierFile[] array = new DossierFileImpl[3];

			array[0] = getByTemplateFileNoDossierId_PrevAndNext(session,
					dossierFile, dossierId, templateFileNo, orderByComparator,
					true);

			array[1] = dossierFile;

			array[2] = getByTemplateFileNoDossierId_PrevAndNext(session,
					dossierFile, dossierId, templateFileNo, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DossierFile getByTemplateFileNoDossierId_PrevAndNext(
		Session session, DossierFile dossierFile, long dossierId,
		String templateFileNo, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOSSIERFILE_WHERE);

		query.append(_FINDER_COLUMN_TEMPLATEFILENODOSSIERID_DOSSIERID_2);

		boolean bindTemplateFileNo = false;

		if (templateFileNo == null) {
			query.append(_FINDER_COLUMN_TEMPLATEFILENODOSSIERID_TEMPLATEFILENO_1);
		}
		else if (templateFileNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_TEMPLATEFILENODOSSIERID_TEMPLATEFILENO_3);
		}
		else {
			bindTemplateFileNo = true;

			query.append(_FINDER_COLUMN_TEMPLATEFILENODOSSIERID_TEMPLATEFILENO_2);
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
			query.append(DossierFileModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		if (bindTemplateFileNo) {
			qPos.add(templateFileNo);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dossierFile);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DossierFile> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dossier files where dossierId = &#63; and templateFileNo = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @param templateFileNo the template file no
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTemplateFileNoDossierId(long dossierId,
		String templateFileNo) throws SystemException {
		for (DossierFile dossierFile : findByTemplateFileNoDossierId(
				dossierId, templateFileNo, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(dossierFile);
		}
	}

	/**
	 * Returns the number of dossier files where dossierId = &#63; and templateFileNo = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param templateFileNo the template file no
	 * @return the number of matching dossier files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByTemplateFileNoDossierId(long dossierId,
		String templateFileNo) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TEMPLATEFILENODOSSIERID;

		Object[] finderArgs = new Object[] { dossierId, templateFileNo };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DOSSIERFILE_WHERE);

			query.append(_FINDER_COLUMN_TEMPLATEFILENODOSSIERID_DOSSIERID_2);

			boolean bindTemplateFileNo = false;

			if (templateFileNo == null) {
				query.append(_FINDER_COLUMN_TEMPLATEFILENODOSSIERID_TEMPLATEFILENO_1);
			}
			else if (templateFileNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEMPLATEFILENODOSSIERID_TEMPLATEFILENO_3);
			}
			else {
				bindTemplateFileNo = true;

				query.append(_FINDER_COLUMN_TEMPLATEFILENODOSSIERID_TEMPLATEFILENO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (bindTemplateFileNo) {
					qPos.add(templateFileNo);
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

	private static final String _FINDER_COLUMN_TEMPLATEFILENODOSSIERID_DOSSIERID_2 =
		"dossierFile.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_TEMPLATEFILENODOSSIERID_TEMPLATEFILENO_1 =
		"dossierFile.templateFileNo IS NULL";
	private static final String _FINDER_COLUMN_TEMPLATEFILENODOSSIERID_TEMPLATEFILENO_2 =
		"dossierFile.templateFileNo = ?";
	private static final String _FINDER_COLUMN_TEMPLATEFILENODOSSIERID_TEMPLATEFILENO_3 =
		"(dossierFile.templateFileNo IS NULL OR dossierFile.templateFileNo = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_OID = new FinderPath(DossierFileModelImpl.ENTITY_CACHE_ENABLED,
			DossierFileModelImpl.FINDER_CACHE_ENABLED, DossierFileImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByOid",
			new String[] { String.class.getName() },
			DossierFileModelImpl.OID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_OID = new FinderPath(DossierFileModelImpl.ENTITY_CACHE_ENABLED,
			DossierFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByOid",
			new String[] { String.class.getName() });

	/**
	 * Returns the dossier file where oid = &#63; or throws a {@link org.opencps.dossiermgt.NoSuchDossierFileException} if it could not be found.
	 *
	 * @param oid the oid
	 * @return the matching dossier file
	 * @throws org.opencps.dossiermgt.NoSuchDossierFileException if a matching dossier file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile findByOid(String oid)
		throws NoSuchDossierFileException, SystemException {
		DossierFile dossierFile = fetchByOid(oid);

		if (dossierFile == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("oid=");
			msg.append(oid);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDossierFileException(msg.toString());
		}

		return dossierFile;
	}

	/**
	 * Returns the dossier file where oid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param oid the oid
	 * @return the matching dossier file, or <code>null</code> if a matching dossier file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile fetchByOid(String oid) throws SystemException {
		return fetchByOid(oid, true);
	}

	/**
	 * Returns the dossier file where oid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param oid the oid
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dossier file, or <code>null</code> if a matching dossier file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile fetchByOid(String oid, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { oid };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_OID,
					finderArgs, this);
		}

		if (result instanceof DossierFile) {
			DossierFile dossierFile = (DossierFile)result;

			if (!Validator.equals(oid, dossierFile.getOid())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_DOSSIERFILE_WHERE);

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

				List<DossierFile> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_OID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DossierFilePersistenceImpl.fetchByOid(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DossierFile dossierFile = list.get(0);

					result = dossierFile;

					cacheResult(dossierFile);

					if ((dossierFile.getOid() == null) ||
							!dossierFile.getOid().equals(oid)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_OID,
							finderArgs, dossierFile);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_OID,
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
			return (DossierFile)result;
		}
	}

	/**
	 * Removes the dossier file where oid = &#63; from the database.
	 *
	 * @param oid the oid
	 * @return the dossier file that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile removeByOid(String oid)
		throws NoSuchDossierFileException, SystemException {
		DossierFile dossierFile = findByOid(oid);

		return remove(dossierFile);
	}

	/**
	 * Returns the number of dossier files where oid = &#63;.
	 *
	 * @param oid the oid
	 * @return the number of matching dossier files
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

			query.append(_SQL_COUNT_DOSSIERFILE_WHERE);

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

	private static final String _FINDER_COLUMN_OID_OID_1 = "dossierFile.oid IS NULL";
	private static final String _FINDER_COLUMN_OID_OID_2 = "dossierFile.oid = ?";
	private static final String _FINDER_COLUMN_OID_OID_3 = "(dossierFile.oid IS NULL OR dossierFile.oid = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_D_S_R = new FinderPath(DossierFileModelImpl.ENTITY_CACHE_ENABLED,
			DossierFileModelImpl.FINDER_CACHE_ENABLED, DossierFileImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByD_S_R",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_S_R = new FinderPath(DossierFileModelImpl.ENTITY_CACHE_ENABLED,
			DossierFileModelImpl.FINDER_CACHE_ENABLED, DossierFileImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByD_S_R",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			},
			DossierFileModelImpl.DOSSIERID_COLUMN_BITMASK |
			DossierFileModelImpl.SYNCSTATUS_COLUMN_BITMASK |
			DossierFileModelImpl.REMOVED_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_D_S_R = new FinderPath(DossierFileModelImpl.ENTITY_CACHE_ENABLED,
			DossierFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByD_S_R",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns all the dossier files where dossierId = &#63; and syncStatus = &#63; and removed = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param syncStatus the sync status
	 * @param removed the removed
	 * @return the matching dossier files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierFile> findByD_S_R(long dossierId, int syncStatus,
		int removed) throws SystemException {
		return findByD_S_R(dossierId, syncStatus, removed, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier files where dossierId = &#63; and syncStatus = &#63; and removed = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param syncStatus the sync status
	 * @param removed the removed
	 * @param start the lower bound of the range of dossier files
	 * @param end the upper bound of the range of dossier files (not inclusive)
	 * @return the range of matching dossier files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierFile> findByD_S_R(long dossierId, int syncStatus,
		int removed, int start, int end) throws SystemException {
		return findByD_S_R(dossierId, syncStatus, removed, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier files where dossierId = &#63; and syncStatus = &#63; and removed = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param syncStatus the sync status
	 * @param removed the removed
	 * @param start the lower bound of the range of dossier files
	 * @param end the upper bound of the range of dossier files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dossier files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierFile> findByD_S_R(long dossierId, int syncStatus,
		int removed, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_S_R;
			finderArgs = new Object[] { dossierId, syncStatus, removed };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_D_S_R;
			finderArgs = new Object[] {
					dossierId, syncStatus, removed,
					
					start, end, orderByComparator
				};
		}

		List<DossierFile> list = (List<DossierFile>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DossierFile dossierFile : list) {
				if ((dossierId != dossierFile.getDossierId()) ||
						(syncStatus != dossierFile.getSyncStatus()) ||
						(removed != dossierFile.getRemoved())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_DOSSIERFILE_WHERE);

			query.append(_FINDER_COLUMN_D_S_R_DOSSIERID_2);

			query.append(_FINDER_COLUMN_D_S_R_SYNCSTATUS_2);

			query.append(_FINDER_COLUMN_D_S_R_REMOVED_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DossierFileModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				qPos.add(syncStatus);

				qPos.add(removed);

				if (!pagination) {
					list = (List<DossierFile>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DossierFile>(list);
				}
				else {
					list = (List<DossierFile>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dossier file in the ordered set where dossierId = &#63; and syncStatus = &#63; and removed = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param syncStatus the sync status
	 * @param removed the removed
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier file
	 * @throws org.opencps.dossiermgt.NoSuchDossierFileException if a matching dossier file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile findByD_S_R_First(long dossierId, int syncStatus,
		int removed, OrderByComparator orderByComparator)
		throws NoSuchDossierFileException, SystemException {
		DossierFile dossierFile = fetchByD_S_R_First(dossierId, syncStatus,
				removed, orderByComparator);

		if (dossierFile != null) {
			return dossierFile;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", syncStatus=");
		msg.append(syncStatus);

		msg.append(", removed=");
		msg.append(removed);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierFileException(msg.toString());
	}

	/**
	 * Returns the first dossier file in the ordered set where dossierId = &#63; and syncStatus = &#63; and removed = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param syncStatus the sync status
	 * @param removed the removed
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier file, or <code>null</code> if a matching dossier file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile fetchByD_S_R_First(long dossierId, int syncStatus,
		int removed, OrderByComparator orderByComparator)
		throws SystemException {
		List<DossierFile> list = findByD_S_R(dossierId, syncStatus, removed, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dossier file in the ordered set where dossierId = &#63; and syncStatus = &#63; and removed = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param syncStatus the sync status
	 * @param removed the removed
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier file
	 * @throws org.opencps.dossiermgt.NoSuchDossierFileException if a matching dossier file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile findByD_S_R_Last(long dossierId, int syncStatus,
		int removed, OrderByComparator orderByComparator)
		throws NoSuchDossierFileException, SystemException {
		DossierFile dossierFile = fetchByD_S_R_Last(dossierId, syncStatus,
				removed, orderByComparator);

		if (dossierFile != null) {
			return dossierFile;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", syncStatus=");
		msg.append(syncStatus);

		msg.append(", removed=");
		msg.append(removed);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierFileException(msg.toString());
	}

	/**
	 * Returns the last dossier file in the ordered set where dossierId = &#63; and syncStatus = &#63; and removed = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param syncStatus the sync status
	 * @param removed the removed
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier file, or <code>null</code> if a matching dossier file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile fetchByD_S_R_Last(long dossierId, int syncStatus,
		int removed, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByD_S_R(dossierId, syncStatus, removed);

		if (count == 0) {
			return null;
		}

		List<DossierFile> list = findByD_S_R(dossierId, syncStatus, removed,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dossier files before and after the current dossier file in the ordered set where dossierId = &#63; and syncStatus = &#63; and removed = &#63;.
	 *
	 * @param dossierFileId the primary key of the current dossier file
	 * @param dossierId the dossier ID
	 * @param syncStatus the sync status
	 * @param removed the removed
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dossier file
	 * @throws org.opencps.dossiermgt.NoSuchDossierFileException if a dossier file with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile[] findByD_S_R_PrevAndNext(long dossierFileId,
		long dossierId, int syncStatus, int removed,
		OrderByComparator orderByComparator)
		throws NoSuchDossierFileException, SystemException {
		DossierFile dossierFile = findByPrimaryKey(dossierFileId);

		Session session = null;

		try {
			session = openSession();

			DossierFile[] array = new DossierFileImpl[3];

			array[0] = getByD_S_R_PrevAndNext(session, dossierFile, dossierId,
					syncStatus, removed, orderByComparator, true);

			array[1] = dossierFile;

			array[2] = getByD_S_R_PrevAndNext(session, dossierFile, dossierId,
					syncStatus, removed, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DossierFile getByD_S_R_PrevAndNext(Session session,
		DossierFile dossierFile, long dossierId, int syncStatus, int removed,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOSSIERFILE_WHERE);

		query.append(_FINDER_COLUMN_D_S_R_DOSSIERID_2);

		query.append(_FINDER_COLUMN_D_S_R_SYNCSTATUS_2);

		query.append(_FINDER_COLUMN_D_S_R_REMOVED_2);

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
			query.append(DossierFileModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		qPos.add(syncStatus);

		qPos.add(removed);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dossierFile);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DossierFile> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dossier files where dossierId = &#63; and syncStatus = &#63; and removed = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @param syncStatus the sync status
	 * @param removed the removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByD_S_R(long dossierId, int syncStatus, int removed)
		throws SystemException {
		for (DossierFile dossierFile : findByD_S_R(dossierId, syncStatus,
				removed, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dossierFile);
		}
	}

	/**
	 * Returns the number of dossier files where dossierId = &#63; and syncStatus = &#63; and removed = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param syncStatus the sync status
	 * @param removed the removed
	 * @return the number of matching dossier files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByD_S_R(long dossierId, int syncStatus, int removed)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_D_S_R;

		Object[] finderArgs = new Object[] { dossierId, syncStatus, removed };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_DOSSIERFILE_WHERE);

			query.append(_FINDER_COLUMN_D_S_R_DOSSIERID_2);

			query.append(_FINDER_COLUMN_D_S_R_SYNCSTATUS_2);

			query.append(_FINDER_COLUMN_D_S_R_REMOVED_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				qPos.add(syncStatus);

				qPos.add(removed);

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

	private static final String _FINDER_COLUMN_D_S_R_DOSSIERID_2 = "dossierFile.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_D_S_R_SYNCSTATUS_2 = "dossierFile.syncStatus = ? AND ";
	private static final String _FINDER_COLUMN_D_S_R_REMOVED_2 = "dossierFile.removed = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_F_D_S_R = new FinderPath(DossierFileModelImpl.ENTITY_CACHE_ENABLED,
			DossierFileModelImpl.FINDER_CACHE_ENABLED, DossierFileImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByF_D_S_R",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_D_S_R =
		new FinderPath(DossierFileModelImpl.ENTITY_CACHE_ENABLED,
			DossierFileModelImpl.FINDER_CACHE_ENABLED, DossierFileImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByF_D_S_R",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName()
			},
			DossierFileModelImpl.GROUPFILEID_COLUMN_BITMASK |
			DossierFileModelImpl.DOSSIERID_COLUMN_BITMASK |
			DossierFileModelImpl.SYNCSTATUS_COLUMN_BITMASK |
			DossierFileModelImpl.REMOVED_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_D_S_R = new FinderPath(DossierFileModelImpl.ENTITY_CACHE_ENABLED,
			DossierFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByF_D_S_R",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName()
			});

	/**
	 * Returns all the dossier files where groupFileId = &#63; and dossierId = &#63; and syncStatus = &#63; and removed = &#63;.
	 *
	 * @param groupFileId the group file ID
	 * @param dossierId the dossier ID
	 * @param syncStatus the sync status
	 * @param removed the removed
	 * @return the matching dossier files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierFile> findByF_D_S_R(long groupFileId, long dossierId,
		int syncStatus, int removed) throws SystemException {
		return findByF_D_S_R(groupFileId, dossierId, syncStatus, removed,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier files where groupFileId = &#63; and dossierId = &#63; and syncStatus = &#63; and removed = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupFileId the group file ID
	 * @param dossierId the dossier ID
	 * @param syncStatus the sync status
	 * @param removed the removed
	 * @param start the lower bound of the range of dossier files
	 * @param end the upper bound of the range of dossier files (not inclusive)
	 * @return the range of matching dossier files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierFile> findByF_D_S_R(long groupFileId, long dossierId,
		int syncStatus, int removed, int start, int end)
		throws SystemException {
		return findByF_D_S_R(groupFileId, dossierId, syncStatus, removed,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier files where groupFileId = &#63; and dossierId = &#63; and syncStatus = &#63; and removed = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupFileId the group file ID
	 * @param dossierId the dossier ID
	 * @param syncStatus the sync status
	 * @param removed the removed
	 * @param start the lower bound of the range of dossier files
	 * @param end the upper bound of the range of dossier files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dossier files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierFile> findByF_D_S_R(long groupFileId, long dossierId,
		int syncStatus, int removed, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_D_S_R;
			finderArgs = new Object[] {
					groupFileId, dossierId, syncStatus, removed
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_F_D_S_R;
			finderArgs = new Object[] {
					groupFileId, dossierId, syncStatus, removed,
					
					start, end, orderByComparator
				};
		}

		List<DossierFile> list = (List<DossierFile>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DossierFile dossierFile : list) {
				if ((groupFileId != dossierFile.getGroupFileId()) ||
						(dossierId != dossierFile.getDossierId()) ||
						(syncStatus != dossierFile.getSyncStatus()) ||
						(removed != dossierFile.getRemoved())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(6 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(6);
			}

			query.append(_SQL_SELECT_DOSSIERFILE_WHERE);

			query.append(_FINDER_COLUMN_F_D_S_R_GROUPFILEID_2);

			query.append(_FINDER_COLUMN_F_D_S_R_DOSSIERID_2);

			query.append(_FINDER_COLUMN_F_D_S_R_SYNCSTATUS_2);

			query.append(_FINDER_COLUMN_F_D_S_R_REMOVED_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DossierFileModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupFileId);

				qPos.add(dossierId);

				qPos.add(syncStatus);

				qPos.add(removed);

				if (!pagination) {
					list = (List<DossierFile>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DossierFile>(list);
				}
				else {
					list = (List<DossierFile>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dossier file in the ordered set where groupFileId = &#63; and dossierId = &#63; and syncStatus = &#63; and removed = &#63;.
	 *
	 * @param groupFileId the group file ID
	 * @param dossierId the dossier ID
	 * @param syncStatus the sync status
	 * @param removed the removed
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier file
	 * @throws org.opencps.dossiermgt.NoSuchDossierFileException if a matching dossier file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile findByF_D_S_R_First(long groupFileId, long dossierId,
		int syncStatus, int removed, OrderByComparator orderByComparator)
		throws NoSuchDossierFileException, SystemException {
		DossierFile dossierFile = fetchByF_D_S_R_First(groupFileId, dossierId,
				syncStatus, removed, orderByComparator);

		if (dossierFile != null) {
			return dossierFile;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupFileId=");
		msg.append(groupFileId);

		msg.append(", dossierId=");
		msg.append(dossierId);

		msg.append(", syncStatus=");
		msg.append(syncStatus);

		msg.append(", removed=");
		msg.append(removed);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierFileException(msg.toString());
	}

	/**
	 * Returns the first dossier file in the ordered set where groupFileId = &#63; and dossierId = &#63; and syncStatus = &#63; and removed = &#63;.
	 *
	 * @param groupFileId the group file ID
	 * @param dossierId the dossier ID
	 * @param syncStatus the sync status
	 * @param removed the removed
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dossier file, or <code>null</code> if a matching dossier file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile fetchByF_D_S_R_First(long groupFileId, long dossierId,
		int syncStatus, int removed, OrderByComparator orderByComparator)
		throws SystemException {
		List<DossierFile> list = findByF_D_S_R(groupFileId, dossierId,
				syncStatus, removed, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dossier file in the ordered set where groupFileId = &#63; and dossierId = &#63; and syncStatus = &#63; and removed = &#63;.
	 *
	 * @param groupFileId the group file ID
	 * @param dossierId the dossier ID
	 * @param syncStatus the sync status
	 * @param removed the removed
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier file
	 * @throws org.opencps.dossiermgt.NoSuchDossierFileException if a matching dossier file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile findByF_D_S_R_Last(long groupFileId, long dossierId,
		int syncStatus, int removed, OrderByComparator orderByComparator)
		throws NoSuchDossierFileException, SystemException {
		DossierFile dossierFile = fetchByF_D_S_R_Last(groupFileId, dossierId,
				syncStatus, removed, orderByComparator);

		if (dossierFile != null) {
			return dossierFile;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupFileId=");
		msg.append(groupFileId);

		msg.append(", dossierId=");
		msg.append(dossierId);

		msg.append(", syncStatus=");
		msg.append(syncStatus);

		msg.append(", removed=");
		msg.append(removed);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDossierFileException(msg.toString());
	}

	/**
	 * Returns the last dossier file in the ordered set where groupFileId = &#63; and dossierId = &#63; and syncStatus = &#63; and removed = &#63;.
	 *
	 * @param groupFileId the group file ID
	 * @param dossierId the dossier ID
	 * @param syncStatus the sync status
	 * @param removed the removed
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dossier file, or <code>null</code> if a matching dossier file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile fetchByF_D_S_R_Last(long groupFileId, long dossierId,
		int syncStatus, int removed, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByF_D_S_R(groupFileId, dossierId, syncStatus, removed);

		if (count == 0) {
			return null;
		}

		List<DossierFile> list = findByF_D_S_R(groupFileId, dossierId,
				syncStatus, removed, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dossier files before and after the current dossier file in the ordered set where groupFileId = &#63; and dossierId = &#63; and syncStatus = &#63; and removed = &#63;.
	 *
	 * @param dossierFileId the primary key of the current dossier file
	 * @param groupFileId the group file ID
	 * @param dossierId the dossier ID
	 * @param syncStatus the sync status
	 * @param removed the removed
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dossier file
	 * @throws org.opencps.dossiermgt.NoSuchDossierFileException if a dossier file with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile[] findByF_D_S_R_PrevAndNext(long dossierFileId,
		long groupFileId, long dossierId, int syncStatus, int removed,
		OrderByComparator orderByComparator)
		throws NoSuchDossierFileException, SystemException {
		DossierFile dossierFile = findByPrimaryKey(dossierFileId);

		Session session = null;

		try {
			session = openSession();

			DossierFile[] array = new DossierFileImpl[3];

			array[0] = getByF_D_S_R_PrevAndNext(session, dossierFile,
					groupFileId, dossierId, syncStatus, removed,
					orderByComparator, true);

			array[1] = dossierFile;

			array[2] = getByF_D_S_R_PrevAndNext(session, dossierFile,
					groupFileId, dossierId, syncStatus, removed,
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

	protected DossierFile getByF_D_S_R_PrevAndNext(Session session,
		DossierFile dossierFile, long groupFileId, long dossierId,
		int syncStatus, int removed, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOSSIERFILE_WHERE);

		query.append(_FINDER_COLUMN_F_D_S_R_GROUPFILEID_2);

		query.append(_FINDER_COLUMN_F_D_S_R_DOSSIERID_2);

		query.append(_FINDER_COLUMN_F_D_S_R_SYNCSTATUS_2);

		query.append(_FINDER_COLUMN_F_D_S_R_REMOVED_2);

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
			query.append(DossierFileModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupFileId);

		qPos.add(dossierId);

		qPos.add(syncStatus);

		qPos.add(removed);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dossierFile);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DossierFile> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dossier files where groupFileId = &#63; and dossierId = &#63; and syncStatus = &#63; and removed = &#63; from the database.
	 *
	 * @param groupFileId the group file ID
	 * @param dossierId the dossier ID
	 * @param syncStatus the sync status
	 * @param removed the removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByF_D_S_R(long groupFileId, long dossierId,
		int syncStatus, int removed) throws SystemException {
		for (DossierFile dossierFile : findByF_D_S_R(groupFileId, dossierId,
				syncStatus, removed, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dossierFile);
		}
	}

	/**
	 * Returns the number of dossier files where groupFileId = &#63; and dossierId = &#63; and syncStatus = &#63; and removed = &#63;.
	 *
	 * @param groupFileId the group file ID
	 * @param dossierId the dossier ID
	 * @param syncStatus the sync status
	 * @param removed the removed
	 * @return the number of matching dossier files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByF_D_S_R(long groupFileId, long dossierId, int syncStatus,
		int removed) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_F_D_S_R;

		Object[] finderArgs = new Object[] {
				groupFileId, dossierId, syncStatus, removed
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_DOSSIERFILE_WHERE);

			query.append(_FINDER_COLUMN_F_D_S_R_GROUPFILEID_2);

			query.append(_FINDER_COLUMN_F_D_S_R_DOSSIERID_2);

			query.append(_FINDER_COLUMN_F_D_S_R_SYNCSTATUS_2);

			query.append(_FINDER_COLUMN_F_D_S_R_REMOVED_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupFileId);

				qPos.add(dossierId);

				qPos.add(syncStatus);

				qPos.add(removed);

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

	private static final String _FINDER_COLUMN_F_D_S_R_GROUPFILEID_2 = "dossierFile.groupFileId = ? AND ";
	private static final String _FINDER_COLUMN_F_D_S_R_DOSSIERID_2 = "dossierFile.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_F_D_S_R_SYNCSTATUS_2 = "dossierFile.syncStatus = ? AND ";
	private static final String _FINDER_COLUMN_F_D_S_R_REMOVED_2 = "dossierFile.removed = ?";

	public DossierFilePersistenceImpl() {
		setModelClass(DossierFile.class);
	}

	/**
	 * Caches the dossier file in the entity cache if it is enabled.
	 *
	 * @param dossierFile the dossier file
	 */
	@Override
	public void cacheResult(DossierFile dossierFile) {
		EntityCacheUtil.putResult(DossierFileModelImpl.ENTITY_CACHE_ENABLED,
			DossierFileImpl.class, dossierFile.getPrimaryKey(), dossierFile);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOSSIERFILEINUSE,
			new Object[] {
				dossierFile.getDossierId(), dossierFile.getDossierPartId()
			}, dossierFile);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOSSIERFILEINUSEBYGROUPFILEID,
			new Object[] {
				dossierFile.getDossierId(), dossierFile.getDossierPartId(),
				dossierFile.getGroupFileId()
			}, dossierFile);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_OID,
			new Object[] { dossierFile.getOid() }, dossierFile);

		dossierFile.resetOriginalValues();
	}

	/**
	 * Caches the dossier files in the entity cache if it is enabled.
	 *
	 * @param dossierFiles the dossier files
	 */
	@Override
	public void cacheResult(List<DossierFile> dossierFiles) {
		for (DossierFile dossierFile : dossierFiles) {
			if (EntityCacheUtil.getResult(
						DossierFileModelImpl.ENTITY_CACHE_ENABLED,
						DossierFileImpl.class, dossierFile.getPrimaryKey()) == null) {
				cacheResult(dossierFile);
			}
			else {
				dossierFile.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dossier files.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DossierFileImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DossierFileImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dossier file.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DossierFile dossierFile) {
		EntityCacheUtil.removeResult(DossierFileModelImpl.ENTITY_CACHE_ENABLED,
			DossierFileImpl.class, dossierFile.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(dossierFile);
	}

	@Override
	public void clearCache(List<DossierFile> dossierFiles) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DossierFile dossierFile : dossierFiles) {
			EntityCacheUtil.removeResult(DossierFileModelImpl.ENTITY_CACHE_ENABLED,
				DossierFileImpl.class, dossierFile.getPrimaryKey());

			clearUniqueFindersCache(dossierFile);
		}
	}

	protected void cacheUniqueFindersCache(DossierFile dossierFile) {
		if (dossierFile.isNew()) {
			Object[] args = new Object[] {
					dossierFile.getDossierId(), dossierFile.getDossierPartId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DOSSIERFILEINUSE,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOSSIERFILEINUSE,
				args, dossierFile);

			args = new Object[] {
					dossierFile.getDossierId(), dossierFile.getDossierPartId(),
					dossierFile.getGroupFileId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DOSSIERFILEINUSEBYGROUPFILEID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOSSIERFILEINUSEBYGROUPFILEID,
				args, dossierFile);

			args = new Object[] { dossierFile.getOid() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_OID, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_OID, args,
				dossierFile);
		}
		else {
			DossierFileModelImpl dossierFileModelImpl = (DossierFileModelImpl)dossierFile;

			if ((dossierFileModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_DOSSIERFILEINUSE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dossierFile.getDossierId(),
						dossierFile.getDossierPartId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DOSSIERFILEINUSE,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOSSIERFILEINUSE,
					args, dossierFile);
			}

			if ((dossierFileModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_DOSSIERFILEINUSEBYGROUPFILEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dossierFile.getDossierId(),
						dossierFile.getDossierPartId(),
						dossierFile.getGroupFileId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DOSSIERFILEINUSEBYGROUPFILEID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOSSIERFILEINUSEBYGROUPFILEID,
					args, dossierFile);
			}

			if ((dossierFileModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_OID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { dossierFile.getOid() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_OID, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_OID, args,
					dossierFile);
			}
		}
	}

	protected void clearUniqueFindersCache(DossierFile dossierFile) {
		DossierFileModelImpl dossierFileModelImpl = (DossierFileModelImpl)dossierFile;

		Object[] args = new Object[] {
				dossierFile.getDossierId(), dossierFile.getDossierPartId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOSSIERFILEINUSE, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DOSSIERFILEINUSE, args);

		if ((dossierFileModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_DOSSIERFILEINUSE.getColumnBitmask()) != 0) {
			args = new Object[] {
					dossierFileModelImpl.getOriginalDossierId(),
					dossierFileModelImpl.getOriginalDossierPartId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOSSIERFILEINUSE,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DOSSIERFILEINUSE,
				args);
		}

		args = new Object[] {
				dossierFile.getDossierId(), dossierFile.getDossierPartId(),
				dossierFile.getGroupFileId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOSSIERFILEINUSEBYGROUPFILEID,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DOSSIERFILEINUSEBYGROUPFILEID,
			args);

		if ((dossierFileModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_DOSSIERFILEINUSEBYGROUPFILEID.getColumnBitmask()) != 0) {
			args = new Object[] {
					dossierFileModelImpl.getOriginalDossierId(),
					dossierFileModelImpl.getOriginalDossierPartId(),
					dossierFileModelImpl.getOriginalGroupFileId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOSSIERFILEINUSEBYGROUPFILEID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DOSSIERFILEINUSEBYGROUPFILEID,
				args);
		}

		args = new Object[] { dossierFile.getOid() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_OID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_OID, args);

		if ((dossierFileModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_OID.getColumnBitmask()) != 0) {
			args = new Object[] { dossierFileModelImpl.getOriginalOid() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_OID, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_OID, args);
		}
	}

	/**
	 * Creates a new dossier file with the primary key. Does not add the dossier file to the database.
	 *
	 * @param dossierFileId the primary key for the new dossier file
	 * @return the new dossier file
	 */
	@Override
	public DossierFile create(long dossierFileId) {
		DossierFile dossierFile = new DossierFileImpl();

		dossierFile.setNew(true);
		dossierFile.setPrimaryKey(dossierFileId);

		return dossierFile;
	}

	/**
	 * Removes the dossier file with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dossierFileId the primary key of the dossier file
	 * @return the dossier file that was removed
	 * @throws org.opencps.dossiermgt.NoSuchDossierFileException if a dossier file with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile remove(long dossierFileId)
		throws NoSuchDossierFileException, SystemException {
		return remove((Serializable)dossierFileId);
	}

	/**
	 * Removes the dossier file with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dossier file
	 * @return the dossier file that was removed
	 * @throws org.opencps.dossiermgt.NoSuchDossierFileException if a dossier file with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile remove(Serializable primaryKey)
		throws NoSuchDossierFileException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DossierFile dossierFile = (DossierFile)session.get(DossierFileImpl.class,
					primaryKey);

			if (dossierFile == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDossierFileException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dossierFile);
		}
		catch (NoSuchDossierFileException nsee) {
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
	protected DossierFile removeImpl(DossierFile dossierFile)
		throws SystemException {
		dossierFile = toUnwrappedModel(dossierFile);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dossierFile)) {
				dossierFile = (DossierFile)session.get(DossierFileImpl.class,
						dossierFile.getPrimaryKeyObj());
			}

			if (dossierFile != null) {
				session.delete(dossierFile);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dossierFile != null) {
			clearCache(dossierFile);
		}

		return dossierFile;
	}

	@Override
	public DossierFile updateImpl(
		org.opencps.dossiermgt.model.DossierFile dossierFile)
		throws SystemException {
		dossierFile = toUnwrappedModel(dossierFile);

		boolean isNew = dossierFile.isNew();

		DossierFileModelImpl dossierFileModelImpl = (DossierFileModelImpl)dossierFile;

		Session session = null;

		try {
			session = openSession();

			if (dossierFile.isNew()) {
				session.save(dossierFile);

				dossierFile.setNew(false);
			}
			else {
				session.merge(dossierFile);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DossierFileModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dossierFileModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_DP.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dossierFileModelImpl.getOriginalDossierId(),
						dossierFileModelImpl.getOriginalDossierPartId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_D_DP, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_DP,
					args);

				args = new Object[] {
						dossierFileModelImpl.getDossierId(),
						dossierFileModelImpl.getDossierPartId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_D_DP, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_DP,
					args);
			}

			if ((dossierFileModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dossierFileModelImpl.getOriginalDossierId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);

				args = new Object[] { dossierFileModelImpl.getDossierId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);
			}

			if ((dossierFileModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_GF.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dossierFileModelImpl.getOriginalDossierId(),
						dossierFileModelImpl.getOriginalGroupFileId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_D_GF, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_GF,
					args);

				args = new Object[] {
						dossierFileModelImpl.getDossierId(),
						dossierFileModelImpl.getGroupFileId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_D_GF, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_GF,
					args);
			}

			if ((dossierFileModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_DP_GF.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dossierFileModelImpl.getOriginalDossierId(),
						dossierFileModelImpl.getOriginalDossierPartId(),
						dossierFileModelImpl.getOriginalGroupFileId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_D_DP_GF, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_DP_GF,
					args);

				args = new Object[] {
						dossierFileModelImpl.getDossierId(),
						dossierFileModelImpl.getDossierPartId(),
						dossierFileModelImpl.getGroupFileId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_D_DP_GF, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_DP_GF,
					args);
			}

			if ((dossierFileModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEMPLATEFILENODOSSIERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dossierFileModelImpl.getOriginalDossierId(),
						dossierFileModelImpl.getOriginalTemplateFileNo()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEMPLATEFILENODOSSIERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEMPLATEFILENODOSSIERID,
					args);

				args = new Object[] {
						dossierFileModelImpl.getDossierId(),
						dossierFileModelImpl.getTemplateFileNo()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEMPLATEFILENODOSSIERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEMPLATEFILENODOSSIERID,
					args);
			}

			if ((dossierFileModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_S_R.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dossierFileModelImpl.getOriginalDossierId(),
						dossierFileModelImpl.getOriginalSyncStatus(),
						dossierFileModelImpl.getOriginalRemoved()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_D_S_R, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_S_R,
					args);

				args = new Object[] {
						dossierFileModelImpl.getDossierId(),
						dossierFileModelImpl.getSyncStatus(),
						dossierFileModelImpl.getRemoved()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_D_S_R, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_S_R,
					args);
			}

			if ((dossierFileModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_D_S_R.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dossierFileModelImpl.getOriginalGroupFileId(),
						dossierFileModelImpl.getOriginalDossierId(),
						dossierFileModelImpl.getOriginalSyncStatus(),
						dossierFileModelImpl.getOriginalRemoved()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_D_S_R, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_D_S_R,
					args);

				args = new Object[] {
						dossierFileModelImpl.getGroupFileId(),
						dossierFileModelImpl.getDossierId(),
						dossierFileModelImpl.getSyncStatus(),
						dossierFileModelImpl.getRemoved()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_D_S_R, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_D_S_R,
					args);
			}
		}

		EntityCacheUtil.putResult(DossierFileModelImpl.ENTITY_CACHE_ENABLED,
			DossierFileImpl.class, dossierFile.getPrimaryKey(), dossierFile);

		clearUniqueFindersCache(dossierFile);
		cacheUniqueFindersCache(dossierFile);

		return dossierFile;
	}

	protected DossierFile toUnwrappedModel(DossierFile dossierFile) {
		if (dossierFile instanceof DossierFileImpl) {
			return dossierFile;
		}

		DossierFileImpl dossierFileImpl = new DossierFileImpl();

		dossierFileImpl.setNew(dossierFile.isNew());
		dossierFileImpl.setPrimaryKey(dossierFile.getPrimaryKey());

		dossierFileImpl.setDossierFileId(dossierFile.getDossierFileId());
		dossierFileImpl.setCompanyId(dossierFile.getCompanyId());
		dossierFileImpl.setGroupId(dossierFile.getGroupId());
		dossierFileImpl.setUserId(dossierFile.getUserId());
		dossierFileImpl.setCreateDate(dossierFile.getCreateDate());
		dossierFileImpl.setModifiedDate(dossierFile.getModifiedDate());
		dossierFileImpl.setDossierId(dossierFile.getDossierId());
		dossierFileImpl.setOid(dossierFile.getOid());
		dossierFileImpl.setDossierPartId(dossierFile.getDossierPartId());
		dossierFileImpl.setTemplateFileNo(dossierFile.getTemplateFileNo());
		dossierFileImpl.setGroupFileId(dossierFile.getGroupFileId());
		dossierFileImpl.setOwnerUserId(dossierFile.getOwnerUserId());
		dossierFileImpl.setOwnerOrganizationId(dossierFile.getOwnerOrganizationId());
		dossierFileImpl.setGovAgencyOrganizationId(dossierFile.getGovAgencyOrganizationId());
		dossierFileImpl.setDisplayName(dossierFile.getDisplayName());
		dossierFileImpl.setFormData(dossierFile.getFormData());
		dossierFileImpl.setFileEntryId(dossierFile.getFileEntryId());
		dossierFileImpl.setDossierFileMark(dossierFile.getDossierFileMark());
		dossierFileImpl.setDossierFileType(dossierFile.getDossierFileType());
		dossierFileImpl.setDossierFileNo(dossierFile.getDossierFileNo());
		dossierFileImpl.setDossierFileDate(dossierFile.getDossierFileDate());
		dossierFileImpl.setRemoved(dossierFile.getRemoved());
		dossierFileImpl.setOriginal(dossierFile.getOriginal());
		dossierFileImpl.setSyncStatus(dossierFile.getSyncStatus());
		dossierFileImpl.setVersion(dossierFile.getVersion());
		dossierFileImpl.setSigned(dossierFile.isSigned());

		return dossierFileImpl;
	}

	/**
	 * Returns the dossier file with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dossier file
	 * @return the dossier file
	 * @throws org.opencps.dossiermgt.NoSuchDossierFileException if a dossier file with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDossierFileException, SystemException {
		DossierFile dossierFile = fetchByPrimaryKey(primaryKey);

		if (dossierFile == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDossierFileException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dossierFile;
	}

	/**
	 * Returns the dossier file with the primary key or throws a {@link org.opencps.dossiermgt.NoSuchDossierFileException} if it could not be found.
	 *
	 * @param dossierFileId the primary key of the dossier file
	 * @return the dossier file
	 * @throws org.opencps.dossiermgt.NoSuchDossierFileException if a dossier file with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile findByPrimaryKey(long dossierFileId)
		throws NoSuchDossierFileException, SystemException {
		return findByPrimaryKey((Serializable)dossierFileId);
	}

	/**
	 * Returns the dossier file with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dossier file
	 * @return the dossier file, or <code>null</code> if a dossier file with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DossierFile dossierFile = (DossierFile)EntityCacheUtil.getResult(DossierFileModelImpl.ENTITY_CACHE_ENABLED,
				DossierFileImpl.class, primaryKey);

		if (dossierFile == _nullDossierFile) {
			return null;
		}

		if (dossierFile == null) {
			Session session = null;

			try {
				session = openSession();

				dossierFile = (DossierFile)session.get(DossierFileImpl.class,
						primaryKey);

				if (dossierFile != null) {
					cacheResult(dossierFile);
				}
				else {
					EntityCacheUtil.putResult(DossierFileModelImpl.ENTITY_CACHE_ENABLED,
						DossierFileImpl.class, primaryKey, _nullDossierFile);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DossierFileModelImpl.ENTITY_CACHE_ENABLED,
					DossierFileImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dossierFile;
	}

	/**
	 * Returns the dossier file with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dossierFileId the primary key of the dossier file
	 * @return the dossier file, or <code>null</code> if a dossier file with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DossierFile fetchByPrimaryKey(long dossierFileId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)dossierFileId);
	}

	/**
	 * Returns all the dossier files.
	 *
	 * @return the dossier files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierFile> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dossier files.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dossier files
	 * @param end the upper bound of the range of dossier files (not inclusive)
	 * @return the range of dossier files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierFile> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dossier files.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dossier files
	 * @param end the upper bound of the range of dossier files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dossier files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DossierFile> findAll(int start, int end,
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

		List<DossierFile> list = (List<DossierFile>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DOSSIERFILE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DOSSIERFILE;

				if (pagination) {
					sql = sql.concat(DossierFileModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DossierFile>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DossierFile>(list);
				}
				else {
					list = (List<DossierFile>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the dossier files from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DossierFile dossierFile : findAll()) {
			remove(dossierFile);
		}
	}

	/**
	 * Returns the number of dossier files.
	 *
	 * @return the number of dossier files
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

				Query q = session.createQuery(_SQL_COUNT_DOSSIERFILE);

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
	 * Initializes the dossier file persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.opencps.dossiermgt.model.DossierFile")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DossierFile>> listenersList = new ArrayList<ModelListener<DossierFile>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DossierFile>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DossierFileImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DOSSIERFILE = "SELECT dossierFile FROM DossierFile dossierFile";
	private static final String _SQL_SELECT_DOSSIERFILE_WHERE = "SELECT dossierFile FROM DossierFile dossierFile WHERE ";
	private static final String _SQL_COUNT_DOSSIERFILE = "SELECT COUNT(dossierFile) FROM DossierFile dossierFile";
	private static final String _SQL_COUNT_DOSSIERFILE_WHERE = "SELECT COUNT(dossierFile) FROM DossierFile dossierFile WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dossierFile.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DossierFile exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DossierFile exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DossierFilePersistenceImpl.class);
	private static DossierFile _nullDossierFile = new DossierFileImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DossierFile> toCacheModel() {
				return _nullDossierFileCacheModel;
			}
		};

	private static CacheModel<DossierFile> _nullDossierFileCacheModel = new CacheModel<DossierFile>() {
			@Override
			public DossierFile toEntityModel() {
				return _nullDossierFile;
			}
		};
}