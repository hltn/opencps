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

package org.opencps.paymentmgt.service.persistence;

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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import org.opencps.paymentmgt.NoSuchPaymentFileException;
import org.opencps.paymentmgt.model.PaymentFile;
import org.opencps.paymentmgt.model.impl.PaymentFileImpl;
import org.opencps.paymentmgt.model.impl.PaymentFileModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the Payment file service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see PaymentFilePersistence
 * @see PaymentFileUtil
 * @generated
 */
public class PaymentFilePersistenceImpl extends BasePersistenceImpl<PaymentFile>
	implements PaymentFilePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PaymentFileUtil} to access the Payment file persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PaymentFileImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PaymentFileModelImpl.ENTITY_CACHE_ENABLED,
			PaymentFileModelImpl.FINDER_CACHE_ENABLED, PaymentFileImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PaymentFileModelImpl.ENTITY_CACHE_ENABLED,
			PaymentFileModelImpl.FINDER_CACHE_ENABLED, PaymentFileImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PaymentFileModelImpl.ENTITY_CACHE_ENABLED,
			PaymentFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(PaymentFileModelImpl.ENTITY_CACHE_ENABLED,
			PaymentFileModelImpl.FINDER_CACHE_ENABLED, PaymentFileImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(PaymentFileModelImpl.ENTITY_CACHE_ENABLED,
			PaymentFileModelImpl.FINDER_CACHE_ENABLED, PaymentFileImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			PaymentFileModelImpl.UUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(PaymentFileModelImpl.ENTITY_CACHE_ENABLED,
			PaymentFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the Payment files where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching Payment files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentFile> findByUuid(String uuid) throws SystemException {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the Payment files where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.paymentmgt.model.impl.PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of Payment files
	 * @param end the upper bound of the range of Payment files (not inclusive)
	 * @return the range of matching Payment files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentFile> findByUuid(String uuid, int start, int end)
		throws SystemException {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the Payment files where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.paymentmgt.model.impl.PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of Payment files
	 * @param end the upper bound of the range of Payment files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching Payment files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentFile> findByUuid(String uuid, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid, start, end, orderByComparator };
		}

		List<PaymentFile> list = (List<PaymentFile>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (PaymentFile paymentFile : list) {
				if (!Validator.equals(uuid, paymentFile.getUuid())) {
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

			query.append(_SQL_SELECT_PAYMENTFILE_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PaymentFileModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				if (!pagination) {
					list = (List<PaymentFile>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PaymentFile>(list);
				}
				else {
					list = (List<PaymentFile>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first Payment file in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Payment file
	 * @throws org.opencps.paymentmgt.NoSuchPaymentFileException if a matching Payment file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile findByUuid_First(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchPaymentFileException, SystemException {
		PaymentFile paymentFile = fetchByUuid_First(uuid, orderByComparator);

		if (paymentFile != null) {
			return paymentFile;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPaymentFileException(msg.toString());
	}

	/**
	 * Returns the first Payment file in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Payment file, or <code>null</code> if a matching Payment file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile fetchByUuid_First(String uuid,
		OrderByComparator orderByComparator) throws SystemException {
		List<PaymentFile> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last Payment file in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Payment file
	 * @throws org.opencps.paymentmgt.NoSuchPaymentFileException if a matching Payment file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile findByUuid_Last(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchPaymentFileException, SystemException {
		PaymentFile paymentFile = fetchByUuid_Last(uuid, orderByComparator);

		if (paymentFile != null) {
			return paymentFile;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPaymentFileException(msg.toString());
	}

	/**
	 * Returns the last Payment file in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Payment file, or <code>null</code> if a matching Payment file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile fetchByUuid_Last(String uuid,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<PaymentFile> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the Payment files before and after the current Payment file in the ordered set where uuid = &#63;.
	 *
	 * @param paymentFileId the primary key of the current Payment file
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next Payment file
	 * @throws org.opencps.paymentmgt.NoSuchPaymentFileException if a Payment file with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile[] findByUuid_PrevAndNext(long paymentFileId,
		String uuid, OrderByComparator orderByComparator)
		throws NoSuchPaymentFileException, SystemException {
		PaymentFile paymentFile = findByPrimaryKey(paymentFileId);

		Session session = null;

		try {
			session = openSession();

			PaymentFile[] array = new PaymentFileImpl[3];

			array[0] = getByUuid_PrevAndNext(session, paymentFile, uuid,
					orderByComparator, true);

			array[1] = paymentFile;

			array[2] = getByUuid_PrevAndNext(session, paymentFile, uuid,
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

	protected PaymentFile getByUuid_PrevAndNext(Session session,
		PaymentFile paymentFile, String uuid,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PAYMENTFILE_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
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
			query.append(PaymentFileModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(paymentFile);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<PaymentFile> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the Payment files where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUuid(String uuid) throws SystemException {
		for (PaymentFile paymentFile : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(paymentFile);
		}
	}

	/**
	 * Returns the number of Payment files where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching Payment files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUuid(String uuid) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PAYMENTFILE_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
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

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "paymentFile.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "paymentFile.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(paymentFile.uuid IS NULL OR paymentFile.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(PaymentFileModelImpl.ENTITY_CACHE_ENABLED,
			PaymentFileModelImpl.FINDER_CACHE_ENABLED, PaymentFileImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			PaymentFileModelImpl.UUID_COLUMN_BITMASK |
			PaymentFileModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(PaymentFileModelImpl.ENTITY_CACHE_ENABLED,
			PaymentFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the Payment file where uuid = &#63; and groupId = &#63; or throws a {@link org.opencps.paymentmgt.NoSuchPaymentFileException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching Payment file
	 * @throws org.opencps.paymentmgt.NoSuchPaymentFileException if a matching Payment file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile findByUUID_G(String uuid, long groupId)
		throws NoSuchPaymentFileException, SystemException {
		PaymentFile paymentFile = fetchByUUID_G(uuid, groupId);

		if (paymentFile == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchPaymentFileException(msg.toString());
		}

		return paymentFile;
	}

	/**
	 * Returns the Payment file where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching Payment file, or <code>null</code> if a matching Payment file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile fetchByUUID_G(String uuid, long groupId)
		throws SystemException {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the Payment file where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching Payment file, or <code>null</code> if a matching Payment file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof PaymentFile) {
			PaymentFile paymentFile = (PaymentFile)result;

			if (!Validator.equals(uuid, paymentFile.getUuid()) ||
					(groupId != paymentFile.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_PAYMENTFILE_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				List<PaymentFile> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					PaymentFile paymentFile = list.get(0);

					result = paymentFile;

					cacheResult(paymentFile);

					if ((paymentFile.getUuid() == null) ||
							!paymentFile.getUuid().equals(uuid) ||
							(paymentFile.getGroupId() != groupId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, paymentFile);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G,
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
			return (PaymentFile)result;
		}
	}

	/**
	 * Removes the Payment file where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the Payment file that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile removeByUUID_G(String uuid, long groupId)
		throws NoSuchPaymentFileException, SystemException {
		PaymentFile paymentFile = findByUUID_G(uuid, groupId);

		return remove(paymentFile);
	}

	/**
	 * Returns the number of Payment files where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching Payment files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_PAYMENTFILE_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

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

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "paymentFile.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "paymentFile.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(paymentFile.uuid IS NULL OR paymentFile.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "paymentFile.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(PaymentFileModelImpl.ENTITY_CACHE_ENABLED,
			PaymentFileModelImpl.FINDER_CACHE_ENABLED, PaymentFileImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(PaymentFileModelImpl.ENTITY_CACHE_ENABLED,
			PaymentFileModelImpl.FINDER_CACHE_ENABLED, PaymentFileImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			PaymentFileModelImpl.UUID_COLUMN_BITMASK |
			PaymentFileModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(PaymentFileModelImpl.ENTITY_CACHE_ENABLED,
			PaymentFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the Payment files where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching Payment files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentFile> findByUuid_C(String uuid, long companyId)
		throws SystemException {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the Payment files where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.paymentmgt.model.impl.PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of Payment files
	 * @param end the upper bound of the range of Payment files (not inclusive)
	 * @return the range of matching Payment files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentFile> findByUuid_C(String uuid, long companyId,
		int start, int end) throws SystemException {
		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the Payment files where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.paymentmgt.model.impl.PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of Payment files
	 * @param end the upper bound of the range of Payment files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching Payment files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentFile> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] { uuid, companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] {
					uuid, companyId,
					
					start, end, orderByComparator
				};
		}

		List<PaymentFile> list = (List<PaymentFile>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (PaymentFile paymentFile : list) {
				if (!Validator.equals(uuid, paymentFile.getUuid()) ||
						(companyId != paymentFile.getCompanyId())) {
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

			query.append(_SQL_SELECT_PAYMENTFILE_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PaymentFileModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				if (!pagination) {
					list = (List<PaymentFile>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PaymentFile>(list);
				}
				else {
					list = (List<PaymentFile>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first Payment file in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Payment file
	 * @throws org.opencps.paymentmgt.NoSuchPaymentFileException if a matching Payment file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile findByUuid_C_First(String uuid, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchPaymentFileException, SystemException {
		PaymentFile paymentFile = fetchByUuid_C_First(uuid, companyId,
				orderByComparator);

		if (paymentFile != null) {
			return paymentFile;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPaymentFileException(msg.toString());
	}

	/**
	 * Returns the first Payment file in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Payment file, or <code>null</code> if a matching Payment file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<PaymentFile> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last Payment file in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Payment file
	 * @throws org.opencps.paymentmgt.NoSuchPaymentFileException if a matching Payment file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchPaymentFileException, SystemException {
		PaymentFile paymentFile = fetchByUuid_C_Last(uuid, companyId,
				orderByComparator);

		if (paymentFile != null) {
			return paymentFile;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPaymentFileException(msg.toString());
	}

	/**
	 * Returns the last Payment file in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Payment file, or <code>null</code> if a matching Payment file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<PaymentFile> list = findByUuid_C(uuid, companyId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the Payment files before and after the current Payment file in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param paymentFileId the primary key of the current Payment file
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next Payment file
	 * @throws org.opencps.paymentmgt.NoSuchPaymentFileException if a Payment file with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile[] findByUuid_C_PrevAndNext(long paymentFileId,
		String uuid, long companyId, OrderByComparator orderByComparator)
		throws NoSuchPaymentFileException, SystemException {
		PaymentFile paymentFile = findByPrimaryKey(paymentFileId);

		Session session = null;

		try {
			session = openSession();

			PaymentFile[] array = new PaymentFileImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, paymentFile, uuid,
					companyId, orderByComparator, true);

			array[1] = paymentFile;

			array[2] = getByUuid_C_PrevAndNext(session, paymentFile, uuid,
					companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected PaymentFile getByUuid_C_PrevAndNext(Session session,
		PaymentFile paymentFile, String uuid, long companyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PAYMENTFILE_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

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
			query.append(PaymentFileModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(paymentFile);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<PaymentFile> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the Payment files where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId)
		throws SystemException {
		for (PaymentFile paymentFile : findByUuid_C(uuid, companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(paymentFile);
		}
	}

	/**
	 * Returns the number of Payment files where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching Payment files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_PAYMENTFILE_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

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

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "paymentFile.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "paymentFile.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(paymentFile.uuid IS NULL OR paymentFile.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "paymentFile.companyId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_GOODCODE = new FinderPath(PaymentFileModelImpl.ENTITY_CACHE_ENABLED,
			PaymentFileModelImpl.FINDER_CACHE_ENABLED, PaymentFileImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByGoodCode",
			new String[] { Long.class.getName(), String.class.getName() },
			PaymentFileModelImpl.GROUPID_COLUMN_BITMASK |
			PaymentFileModelImpl.KEYPAYGOODCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GOODCODE = new FinderPath(PaymentFileModelImpl.ENTITY_CACHE_ENABLED,
			PaymentFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGoodCode",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns the Payment file where groupId = &#63; and keypayGoodCode = &#63; or throws a {@link org.opencps.paymentmgt.NoSuchPaymentFileException} if it could not be found.
	 *
	 * @param groupId the group ID
	 * @param keypayGoodCode the keypay good code
	 * @return the matching Payment file
	 * @throws org.opencps.paymentmgt.NoSuchPaymentFileException if a matching Payment file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile findByGoodCode(long groupId, String keypayGoodCode)
		throws NoSuchPaymentFileException, SystemException {
		PaymentFile paymentFile = fetchByGoodCode(groupId, keypayGoodCode);

		if (paymentFile == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", keypayGoodCode=");
			msg.append(keypayGoodCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchPaymentFileException(msg.toString());
		}

		return paymentFile;
	}

	/**
	 * Returns the Payment file where groupId = &#63; and keypayGoodCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group ID
	 * @param keypayGoodCode the keypay good code
	 * @return the matching Payment file, or <code>null</code> if a matching Payment file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile fetchByGoodCode(long groupId, String keypayGoodCode)
		throws SystemException {
		return fetchByGoodCode(groupId, keypayGoodCode, true);
	}

	/**
	 * Returns the Payment file where groupId = &#63; and keypayGoodCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupId the group ID
	 * @param keypayGoodCode the keypay good code
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching Payment file, or <code>null</code> if a matching Payment file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile fetchByGoodCode(long groupId, String keypayGoodCode,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { groupId, keypayGoodCode };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_GOODCODE,
					finderArgs, this);
		}

		if (result instanceof PaymentFile) {
			PaymentFile paymentFile = (PaymentFile)result;

			if ((groupId != paymentFile.getGroupId()) ||
					!Validator.equals(keypayGoodCode,
						paymentFile.getKeypayGoodCode())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_PAYMENTFILE_WHERE);

			query.append(_FINDER_COLUMN_GOODCODE_GROUPID_2);

			boolean bindKeypayGoodCode = false;

			if (keypayGoodCode == null) {
				query.append(_FINDER_COLUMN_GOODCODE_KEYPAYGOODCODE_1);
			}
			else if (keypayGoodCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_GOODCODE_KEYPAYGOODCODE_3);
			}
			else {
				bindKeypayGoodCode = true;

				query.append(_FINDER_COLUMN_GOODCODE_KEYPAYGOODCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindKeypayGoodCode) {
					qPos.add(keypayGoodCode);
				}

				List<PaymentFile> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GOODCODE,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"PaymentFilePersistenceImpl.fetchByGoodCode(long, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					PaymentFile paymentFile = list.get(0);

					result = paymentFile;

					cacheResult(paymentFile);

					if ((paymentFile.getGroupId() != groupId) ||
							(paymentFile.getKeypayGoodCode() == null) ||
							!paymentFile.getKeypayGoodCode()
											.equals(keypayGoodCode)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GOODCODE,
							finderArgs, paymentFile);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GOODCODE,
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
			return (PaymentFile)result;
		}
	}

	/**
	 * Removes the Payment file where groupId = &#63; and keypayGoodCode = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param keypayGoodCode the keypay good code
	 * @return the Payment file that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile removeByGoodCode(long groupId, String keypayGoodCode)
		throws NoSuchPaymentFileException, SystemException {
		PaymentFile paymentFile = findByGoodCode(groupId, keypayGoodCode);

		return remove(paymentFile);
	}

	/**
	 * Returns the number of Payment files where groupId = &#63; and keypayGoodCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param keypayGoodCode the keypay good code
	 * @return the number of matching Payment files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByGoodCode(long groupId, String keypayGoodCode)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GOODCODE;

		Object[] finderArgs = new Object[] { groupId, keypayGoodCode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_PAYMENTFILE_WHERE);

			query.append(_FINDER_COLUMN_GOODCODE_GROUPID_2);

			boolean bindKeypayGoodCode = false;

			if (keypayGoodCode == null) {
				query.append(_FINDER_COLUMN_GOODCODE_KEYPAYGOODCODE_1);
			}
			else if (keypayGoodCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_GOODCODE_KEYPAYGOODCODE_3);
			}
			else {
				bindKeypayGoodCode = true;

				query.append(_FINDER_COLUMN_GOODCODE_KEYPAYGOODCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindKeypayGoodCode) {
					qPos.add(keypayGoodCode);
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

	private static final String _FINDER_COLUMN_GOODCODE_GROUPID_2 = "paymentFile.groupId = ? AND ";
	private static final String _FINDER_COLUMN_GOODCODE_KEYPAYGOODCODE_1 = "paymentFile.keypayGoodCode IS NULL";
	private static final String _FINDER_COLUMN_GOODCODE_KEYPAYGOODCODE_2 = "paymentFile.keypayGoodCode = ?";
	private static final String _FINDER_COLUMN_GOODCODE_KEYPAYGOODCODE_3 = "(paymentFile.keypayGoodCode IS NULL OR paymentFile.keypayGoodCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_D_P = new FinderPath(PaymentFileModelImpl.ENTITY_CACHE_ENABLED,
			PaymentFileModelImpl.FINDER_CACHE_ENABLED, PaymentFileImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByD_P",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_P = new FinderPath(PaymentFileModelImpl.ENTITY_CACHE_ENABLED,
			PaymentFileModelImpl.FINDER_CACHE_ENABLED, PaymentFileImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByD_P",
			new String[] { Long.class.getName(), Integer.class.getName() },
			PaymentFileModelImpl.DOSSIERID_COLUMN_BITMASK |
			PaymentFileModelImpl.PAYMENTSTATUS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_D_P = new FinderPath(PaymentFileModelImpl.ENTITY_CACHE_ENABLED,
			PaymentFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByD_P",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the Payment files where dossierId = &#63; and paymentStatus = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param paymentStatus the payment status
	 * @return the matching Payment files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentFile> findByD_P(long dossierId, int paymentStatus)
		throws SystemException {
		return findByD_P(dossierId, paymentStatus, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the Payment files where dossierId = &#63; and paymentStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.paymentmgt.model.impl.PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param paymentStatus the payment status
	 * @param start the lower bound of the range of Payment files
	 * @param end the upper bound of the range of Payment files (not inclusive)
	 * @return the range of matching Payment files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentFile> findByD_P(long dossierId, int paymentStatus,
		int start, int end) throws SystemException {
		return findByD_P(dossierId, paymentStatus, start, end, null);
	}

	/**
	 * Returns an ordered range of all the Payment files where dossierId = &#63; and paymentStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.paymentmgt.model.impl.PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param paymentStatus the payment status
	 * @param start the lower bound of the range of Payment files
	 * @param end the upper bound of the range of Payment files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching Payment files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentFile> findByD_P(long dossierId, int paymentStatus,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_P;
			finderArgs = new Object[] { dossierId, paymentStatus };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_D_P;
			finderArgs = new Object[] {
					dossierId, paymentStatus,
					
					start, end, orderByComparator
				};
		}

		List<PaymentFile> list = (List<PaymentFile>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (PaymentFile paymentFile : list) {
				if ((dossierId != paymentFile.getDossierId()) ||
						(paymentStatus != paymentFile.getPaymentStatus())) {
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

			query.append(_SQL_SELECT_PAYMENTFILE_WHERE);

			query.append(_FINDER_COLUMN_D_P_DOSSIERID_2);

			query.append(_FINDER_COLUMN_D_P_PAYMENTSTATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PaymentFileModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				qPos.add(paymentStatus);

				if (!pagination) {
					list = (List<PaymentFile>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PaymentFile>(list);
				}
				else {
					list = (List<PaymentFile>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first Payment file in the ordered set where dossierId = &#63; and paymentStatus = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param paymentStatus the payment status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Payment file
	 * @throws org.opencps.paymentmgt.NoSuchPaymentFileException if a matching Payment file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile findByD_P_First(long dossierId, int paymentStatus,
		OrderByComparator orderByComparator)
		throws NoSuchPaymentFileException, SystemException {
		PaymentFile paymentFile = fetchByD_P_First(dossierId, paymentStatus,
				orderByComparator);

		if (paymentFile != null) {
			return paymentFile;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", paymentStatus=");
		msg.append(paymentStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPaymentFileException(msg.toString());
	}

	/**
	 * Returns the first Payment file in the ordered set where dossierId = &#63; and paymentStatus = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param paymentStatus the payment status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Payment file, or <code>null</code> if a matching Payment file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile fetchByD_P_First(long dossierId, int paymentStatus,
		OrderByComparator orderByComparator) throws SystemException {
		List<PaymentFile> list = findByD_P(dossierId, paymentStatus, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last Payment file in the ordered set where dossierId = &#63; and paymentStatus = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param paymentStatus the payment status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Payment file
	 * @throws org.opencps.paymentmgt.NoSuchPaymentFileException if a matching Payment file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile findByD_P_Last(long dossierId, int paymentStatus,
		OrderByComparator orderByComparator)
		throws NoSuchPaymentFileException, SystemException {
		PaymentFile paymentFile = fetchByD_P_Last(dossierId, paymentStatus,
				orderByComparator);

		if (paymentFile != null) {
			return paymentFile;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", paymentStatus=");
		msg.append(paymentStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPaymentFileException(msg.toString());
	}

	/**
	 * Returns the last Payment file in the ordered set where dossierId = &#63; and paymentStatus = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param paymentStatus the payment status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Payment file, or <code>null</code> if a matching Payment file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile fetchByD_P_Last(long dossierId, int paymentStatus,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByD_P(dossierId, paymentStatus);

		if (count == 0) {
			return null;
		}

		List<PaymentFile> list = findByD_P(dossierId, paymentStatus, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the Payment files before and after the current Payment file in the ordered set where dossierId = &#63; and paymentStatus = &#63;.
	 *
	 * @param paymentFileId the primary key of the current Payment file
	 * @param dossierId the dossier ID
	 * @param paymentStatus the payment status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next Payment file
	 * @throws org.opencps.paymentmgt.NoSuchPaymentFileException if a Payment file with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile[] findByD_P_PrevAndNext(long paymentFileId,
		long dossierId, int paymentStatus, OrderByComparator orderByComparator)
		throws NoSuchPaymentFileException, SystemException {
		PaymentFile paymentFile = findByPrimaryKey(paymentFileId);

		Session session = null;

		try {
			session = openSession();

			PaymentFile[] array = new PaymentFileImpl[3];

			array[0] = getByD_P_PrevAndNext(session, paymentFile, dossierId,
					paymentStatus, orderByComparator, true);

			array[1] = paymentFile;

			array[2] = getByD_P_PrevAndNext(session, paymentFile, dossierId,
					paymentStatus, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected PaymentFile getByD_P_PrevAndNext(Session session,
		PaymentFile paymentFile, long dossierId, int paymentStatus,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PAYMENTFILE_WHERE);

		query.append(_FINDER_COLUMN_D_P_DOSSIERID_2);

		query.append(_FINDER_COLUMN_D_P_PAYMENTSTATUS_2);

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
			query.append(PaymentFileModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		qPos.add(paymentStatus);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(paymentFile);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<PaymentFile> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the Payment files where dossierId = &#63; and paymentStatus = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @param paymentStatus the payment status
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByD_P(long dossierId, int paymentStatus)
		throws SystemException {
		for (PaymentFile paymentFile : findByD_P(dossierId, paymentStatus,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(paymentFile);
		}
	}

	/**
	 * Returns the number of Payment files where dossierId = &#63; and paymentStatus = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param paymentStatus the payment status
	 * @return the number of matching Payment files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByD_P(long dossierId, int paymentStatus)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_D_P;

		Object[] finderArgs = new Object[] { dossierId, paymentStatus };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_PAYMENTFILE_WHERE);

			query.append(_FINDER_COLUMN_D_P_DOSSIERID_2);

			query.append(_FINDER_COLUMN_D_P_PAYMENTSTATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				qPos.add(paymentStatus);

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

	private static final String _FINDER_COLUMN_D_P_DOSSIERID_2 = "paymentFile.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_D_P_PAYMENTSTATUS_2 = "paymentFile.paymentStatus = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_D_ = new FinderPath(PaymentFileModelImpl.ENTITY_CACHE_ENABLED,
			PaymentFileModelImpl.FINDER_CACHE_ENABLED, PaymentFileImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByD_",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_ = new FinderPath(PaymentFileModelImpl.ENTITY_CACHE_ENABLED,
			PaymentFileModelImpl.FINDER_CACHE_ENABLED, PaymentFileImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByD_",
			new String[] { Long.class.getName() },
			PaymentFileModelImpl.DOSSIERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_D_ = new FinderPath(PaymentFileModelImpl.ENTITY_CACHE_ENABLED,
			PaymentFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByD_",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the Payment files where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the matching Payment files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentFile> findByD_(long dossierId) throws SystemException {
		return findByD_(dossierId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the Payment files where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.paymentmgt.model.impl.PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of Payment files
	 * @param end the upper bound of the range of Payment files (not inclusive)
	 * @return the range of matching Payment files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentFile> findByD_(long dossierId, int start, int end)
		throws SystemException {
		return findByD_(dossierId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the Payment files where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.paymentmgt.model.impl.PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of Payment files
	 * @param end the upper bound of the range of Payment files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching Payment files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentFile> findByD_(long dossierId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_;
			finderArgs = new Object[] { dossierId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_D_;
			finderArgs = new Object[] { dossierId, start, end, orderByComparator };
		}

		List<PaymentFile> list = (List<PaymentFile>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (PaymentFile paymentFile : list) {
				if ((dossierId != paymentFile.getDossierId())) {
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

			query.append(_SQL_SELECT_PAYMENTFILE_WHERE);

			query.append(_FINDER_COLUMN_D__DOSSIERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PaymentFileModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (!pagination) {
					list = (List<PaymentFile>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PaymentFile>(list);
				}
				else {
					list = (List<PaymentFile>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first Payment file in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Payment file
	 * @throws org.opencps.paymentmgt.NoSuchPaymentFileException if a matching Payment file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile findByD__First(long dossierId,
		OrderByComparator orderByComparator)
		throws NoSuchPaymentFileException, SystemException {
		PaymentFile paymentFile = fetchByD__First(dossierId, orderByComparator);

		if (paymentFile != null) {
			return paymentFile;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPaymentFileException(msg.toString());
	}

	/**
	 * Returns the first Payment file in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Payment file, or <code>null</code> if a matching Payment file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile fetchByD__First(long dossierId,
		OrderByComparator orderByComparator) throws SystemException {
		List<PaymentFile> list = findByD_(dossierId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last Payment file in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Payment file
	 * @throws org.opencps.paymentmgt.NoSuchPaymentFileException if a matching Payment file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile findByD__Last(long dossierId,
		OrderByComparator orderByComparator)
		throws NoSuchPaymentFileException, SystemException {
		PaymentFile paymentFile = fetchByD__Last(dossierId, orderByComparator);

		if (paymentFile != null) {
			return paymentFile;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPaymentFileException(msg.toString());
	}

	/**
	 * Returns the last Payment file in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Payment file, or <code>null</code> if a matching Payment file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile fetchByD__Last(long dossierId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByD_(dossierId);

		if (count == 0) {
			return null;
		}

		List<PaymentFile> list = findByD_(dossierId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the Payment files before and after the current Payment file in the ordered set where dossierId = &#63;.
	 *
	 * @param paymentFileId the primary key of the current Payment file
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next Payment file
	 * @throws org.opencps.paymentmgt.NoSuchPaymentFileException if a Payment file with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile[] findByD__PrevAndNext(long paymentFileId,
		long dossierId, OrderByComparator orderByComparator)
		throws NoSuchPaymentFileException, SystemException {
		PaymentFile paymentFile = findByPrimaryKey(paymentFileId);

		Session session = null;

		try {
			session = openSession();

			PaymentFile[] array = new PaymentFileImpl[3];

			array[0] = getByD__PrevAndNext(session, paymentFile, dossierId,
					orderByComparator, true);

			array[1] = paymentFile;

			array[2] = getByD__PrevAndNext(session, paymentFile, dossierId,
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

	protected PaymentFile getByD__PrevAndNext(Session session,
		PaymentFile paymentFile, long dossierId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PAYMENTFILE_WHERE);

		query.append(_FINDER_COLUMN_D__DOSSIERID_2);

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
			query.append(PaymentFileModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(paymentFile);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<PaymentFile> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the Payment files where dossierId = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByD_(long dossierId) throws SystemException {
		for (PaymentFile paymentFile : findByD_(dossierId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(paymentFile);
		}
	}

	/**
	 * Returns the number of Payment files where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the number of matching Payment files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByD_(long dossierId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_D_;

		Object[] finderArgs = new Object[] { dossierId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PAYMENTFILE_WHERE);

			query.append(_FINDER_COLUMN_D__DOSSIERID_2);

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

	private static final String _FINDER_COLUMN_D__DOSSIERID_2 = "paymentFile.dossierId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_MERCHANTRESPONSE = new FinderPath(PaymentFileModelImpl.ENTITY_CACHE_ENABLED,
			PaymentFileModelImpl.FINDER_CACHE_ENABLED, PaymentFileImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByMerchantResponse",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Double.class.getName()
			},
			PaymentFileModelImpl.KEYPAYTRANSACTIONID_COLUMN_BITMASK |
			PaymentFileModelImpl.KEYPAYGOODCODE_COLUMN_BITMASK |
			PaymentFileModelImpl.AMOUNT_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MERCHANTRESPONSE = new FinderPath(PaymentFileModelImpl.ENTITY_CACHE_ENABLED,
			PaymentFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByMerchantResponse",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Double.class.getName()
			});

	/**
	 * Returns the Payment file where keypayTransactionId = &#63; and keypayGoodCode = &#63; and amount = &#63; or throws a {@link org.opencps.paymentmgt.NoSuchPaymentFileException} if it could not be found.
	 *
	 * @param keypayTransactionId the keypay transaction ID
	 * @param keypayGoodCode the keypay good code
	 * @param amount the amount
	 * @return the matching Payment file
	 * @throws org.opencps.paymentmgt.NoSuchPaymentFileException if a matching Payment file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile findByMerchantResponse(long keypayTransactionId,
		String keypayGoodCode, double amount)
		throws NoSuchPaymentFileException, SystemException {
		PaymentFile paymentFile = fetchByMerchantResponse(keypayTransactionId,
				keypayGoodCode, amount);

		if (paymentFile == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("keypayTransactionId=");
			msg.append(keypayTransactionId);

			msg.append(", keypayGoodCode=");
			msg.append(keypayGoodCode);

			msg.append(", amount=");
			msg.append(amount);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchPaymentFileException(msg.toString());
		}

		return paymentFile;
	}

	/**
	 * Returns the Payment file where keypayTransactionId = &#63; and keypayGoodCode = &#63; and amount = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param keypayTransactionId the keypay transaction ID
	 * @param keypayGoodCode the keypay good code
	 * @param amount the amount
	 * @return the matching Payment file, or <code>null</code> if a matching Payment file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile fetchByMerchantResponse(long keypayTransactionId,
		String keypayGoodCode, double amount) throws SystemException {
		return fetchByMerchantResponse(keypayTransactionId, keypayGoodCode,
			amount, true);
	}

	/**
	 * Returns the Payment file where keypayTransactionId = &#63; and keypayGoodCode = &#63; and amount = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param keypayTransactionId the keypay transaction ID
	 * @param keypayGoodCode the keypay good code
	 * @param amount the amount
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching Payment file, or <code>null</code> if a matching Payment file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile fetchByMerchantResponse(long keypayTransactionId,
		String keypayGoodCode, double amount, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				keypayTransactionId, keypayGoodCode, amount
			};

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_MERCHANTRESPONSE,
					finderArgs, this);
		}

		if (result instanceof PaymentFile) {
			PaymentFile paymentFile = (PaymentFile)result;

			if ((keypayTransactionId != paymentFile.getKeypayTransactionId()) ||
					!Validator.equals(keypayGoodCode,
						paymentFile.getKeypayGoodCode()) ||
					(amount != paymentFile.getAmount())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_PAYMENTFILE_WHERE);

			query.append(_FINDER_COLUMN_MERCHANTRESPONSE_KEYPAYTRANSACTIONID_2);

			boolean bindKeypayGoodCode = false;

			if (keypayGoodCode == null) {
				query.append(_FINDER_COLUMN_MERCHANTRESPONSE_KEYPAYGOODCODE_1);
			}
			else if (keypayGoodCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MERCHANTRESPONSE_KEYPAYGOODCODE_3);
			}
			else {
				bindKeypayGoodCode = true;

				query.append(_FINDER_COLUMN_MERCHANTRESPONSE_KEYPAYGOODCODE_2);
			}

			query.append(_FINDER_COLUMN_MERCHANTRESPONSE_AMOUNT_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(keypayTransactionId);

				if (bindKeypayGoodCode) {
					qPos.add(keypayGoodCode);
				}

				qPos.add(amount);

				List<PaymentFile> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MERCHANTRESPONSE,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"PaymentFilePersistenceImpl.fetchByMerchantResponse(long, String, double, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					PaymentFile paymentFile = list.get(0);

					result = paymentFile;

					cacheResult(paymentFile);

					if ((paymentFile.getKeypayTransactionId() != keypayTransactionId) ||
							(paymentFile.getKeypayGoodCode() == null) ||
							!paymentFile.getKeypayGoodCode()
											.equals(keypayGoodCode) ||
							(paymentFile.getAmount() != amount)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MERCHANTRESPONSE,
							finderArgs, paymentFile);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MERCHANTRESPONSE,
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
			return (PaymentFile)result;
		}
	}

	/**
	 * Removes the Payment file where keypayTransactionId = &#63; and keypayGoodCode = &#63; and amount = &#63; from the database.
	 *
	 * @param keypayTransactionId the keypay transaction ID
	 * @param keypayGoodCode the keypay good code
	 * @param amount the amount
	 * @return the Payment file that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile removeByMerchantResponse(long keypayTransactionId,
		String keypayGoodCode, double amount)
		throws NoSuchPaymentFileException, SystemException {
		PaymentFile paymentFile = findByMerchantResponse(keypayTransactionId,
				keypayGoodCode, amount);

		return remove(paymentFile);
	}

	/**
	 * Returns the number of Payment files where keypayTransactionId = &#63; and keypayGoodCode = &#63; and amount = &#63;.
	 *
	 * @param keypayTransactionId the keypay transaction ID
	 * @param keypayGoodCode the keypay good code
	 * @param amount the amount
	 * @return the number of matching Payment files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByMerchantResponse(long keypayTransactionId,
		String keypayGoodCode, double amount) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_MERCHANTRESPONSE;

		Object[] finderArgs = new Object[] {
				keypayTransactionId, keypayGoodCode, amount
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_PAYMENTFILE_WHERE);

			query.append(_FINDER_COLUMN_MERCHANTRESPONSE_KEYPAYTRANSACTIONID_2);

			boolean bindKeypayGoodCode = false;

			if (keypayGoodCode == null) {
				query.append(_FINDER_COLUMN_MERCHANTRESPONSE_KEYPAYGOODCODE_1);
			}
			else if (keypayGoodCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MERCHANTRESPONSE_KEYPAYGOODCODE_3);
			}
			else {
				bindKeypayGoodCode = true;

				query.append(_FINDER_COLUMN_MERCHANTRESPONSE_KEYPAYGOODCODE_2);
			}

			query.append(_FINDER_COLUMN_MERCHANTRESPONSE_AMOUNT_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(keypayTransactionId);

				if (bindKeypayGoodCode) {
					qPos.add(keypayGoodCode);
				}

				qPos.add(amount);

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

	private static final String _FINDER_COLUMN_MERCHANTRESPONSE_KEYPAYTRANSACTIONID_2 =
		"paymentFile.keypayTransactionId = ? AND ";
	private static final String _FINDER_COLUMN_MERCHANTRESPONSE_KEYPAYGOODCODE_1 =
		"paymentFile.keypayGoodCode IS NULL AND ";
	private static final String _FINDER_COLUMN_MERCHANTRESPONSE_KEYPAYGOODCODE_2 =
		"paymentFile.keypayGoodCode = ? AND ";
	private static final String _FINDER_COLUMN_MERCHANTRESPONSE_KEYPAYGOODCODE_3 =
		"(paymentFile.keypayGoodCode IS NULL OR paymentFile.keypayGoodCode = '') AND ";
	private static final String _FINDER_COLUMN_MERCHANTRESPONSE_AMOUNT_2 = "paymentFile.amount = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_G_C = new FinderPath(PaymentFileModelImpl.ENTITY_CACHE_ENABLED,
			PaymentFileModelImpl.FINDER_CACHE_ENABLED, PaymentFileImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByG_C",
			new String[] { String.class.getName() },
			PaymentFileModelImpl.KEYPAYGOODCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_C = new FinderPath(PaymentFileModelImpl.ENTITY_CACHE_ENABLED,
			PaymentFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_C",
			new String[] { String.class.getName() });

	/**
	 * Returns the Payment file where keypayGoodCode = &#63; or throws a {@link org.opencps.paymentmgt.NoSuchPaymentFileException} if it could not be found.
	 *
	 * @param keypayGoodCode the keypay good code
	 * @return the matching Payment file
	 * @throws org.opencps.paymentmgt.NoSuchPaymentFileException if a matching Payment file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile findByG_C(String keypayGoodCode)
		throws NoSuchPaymentFileException, SystemException {
		PaymentFile paymentFile = fetchByG_C(keypayGoodCode);

		if (paymentFile == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("keypayGoodCode=");
			msg.append(keypayGoodCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchPaymentFileException(msg.toString());
		}

		return paymentFile;
	}

	/**
	 * Returns the Payment file where keypayGoodCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param keypayGoodCode the keypay good code
	 * @return the matching Payment file, or <code>null</code> if a matching Payment file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile fetchByG_C(String keypayGoodCode)
		throws SystemException {
		return fetchByG_C(keypayGoodCode, true);
	}

	/**
	 * Returns the Payment file where keypayGoodCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param keypayGoodCode the keypay good code
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching Payment file, or <code>null</code> if a matching Payment file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile fetchByG_C(String keypayGoodCode,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { keypayGoodCode };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_G_C,
					finderArgs, this);
		}

		if (result instanceof PaymentFile) {
			PaymentFile paymentFile = (PaymentFile)result;

			if (!Validator.equals(keypayGoodCode,
						paymentFile.getKeypayGoodCode())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_PAYMENTFILE_WHERE);

			boolean bindKeypayGoodCode = false;

			if (keypayGoodCode == null) {
				query.append(_FINDER_COLUMN_G_C_KEYPAYGOODCODE_1);
			}
			else if (keypayGoodCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_C_KEYPAYGOODCODE_3);
			}
			else {
				bindKeypayGoodCode = true;

				query.append(_FINDER_COLUMN_G_C_KEYPAYGOODCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindKeypayGoodCode) {
					qPos.add(keypayGoodCode);
				}

				List<PaymentFile> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_C,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"PaymentFilePersistenceImpl.fetchByG_C(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					PaymentFile paymentFile = list.get(0);

					result = paymentFile;

					cacheResult(paymentFile);

					if ((paymentFile.getKeypayGoodCode() == null) ||
							!paymentFile.getKeypayGoodCode()
											.equals(keypayGoodCode)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_C,
							finderArgs, paymentFile);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_C,
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
			return (PaymentFile)result;
		}
	}

	/**
	 * Removes the Payment file where keypayGoodCode = &#63; from the database.
	 *
	 * @param keypayGoodCode the keypay good code
	 * @return the Payment file that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile removeByG_C(String keypayGoodCode)
		throws NoSuchPaymentFileException, SystemException {
		PaymentFile paymentFile = findByG_C(keypayGoodCode);

		return remove(paymentFile);
	}

	/**
	 * Returns the number of Payment files where keypayGoodCode = &#63;.
	 *
	 * @param keypayGoodCode the keypay good code
	 * @return the number of matching Payment files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByG_C(String keypayGoodCode) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_C;

		Object[] finderArgs = new Object[] { keypayGoodCode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PAYMENTFILE_WHERE);

			boolean bindKeypayGoodCode = false;

			if (keypayGoodCode == null) {
				query.append(_FINDER_COLUMN_G_C_KEYPAYGOODCODE_1);
			}
			else if (keypayGoodCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_C_KEYPAYGOODCODE_3);
			}
			else {
				bindKeypayGoodCode = true;

				query.append(_FINDER_COLUMN_G_C_KEYPAYGOODCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindKeypayGoodCode) {
					qPos.add(keypayGoodCode);
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

	private static final String _FINDER_COLUMN_G_C_KEYPAYGOODCODE_1 = "paymentFile.keypayGoodCode IS NULL";
	private static final String _FINDER_COLUMN_G_C_KEYPAYGOODCODE_2 = "paymentFile.keypayGoodCode = ?";
	private static final String _FINDER_COLUMN_G_C_KEYPAYGOODCODE_3 = "(paymentFile.keypayGoodCode IS NULL OR paymentFile.keypayGoodCode = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_T_I = new FinderPath(PaymentFileModelImpl.ENTITY_CACHE_ENABLED,
			PaymentFileModelImpl.FINDER_CACHE_ENABLED, PaymentFileImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByT_I",
			new String[] { Long.class.getName() },
			PaymentFileModelImpl.KEYPAYTRANSACTIONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_T_I = new FinderPath(PaymentFileModelImpl.ENTITY_CACHE_ENABLED,
			PaymentFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByT_I",
			new String[] { Long.class.getName() });

	/**
	 * Returns the Payment file where keypayTransactionId = &#63; or throws a {@link org.opencps.paymentmgt.NoSuchPaymentFileException} if it could not be found.
	 *
	 * @param keypayTransactionId the keypay transaction ID
	 * @return the matching Payment file
	 * @throws org.opencps.paymentmgt.NoSuchPaymentFileException if a matching Payment file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile findByT_I(long keypayTransactionId)
		throws NoSuchPaymentFileException, SystemException {
		PaymentFile paymentFile = fetchByT_I(keypayTransactionId);

		if (paymentFile == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("keypayTransactionId=");
			msg.append(keypayTransactionId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchPaymentFileException(msg.toString());
		}

		return paymentFile;
	}

	/**
	 * Returns the Payment file where keypayTransactionId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param keypayTransactionId the keypay transaction ID
	 * @return the matching Payment file, or <code>null</code> if a matching Payment file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile fetchByT_I(long keypayTransactionId)
		throws SystemException {
		return fetchByT_I(keypayTransactionId, true);
	}

	/**
	 * Returns the Payment file where keypayTransactionId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param keypayTransactionId the keypay transaction ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching Payment file, or <code>null</code> if a matching Payment file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile fetchByT_I(long keypayTransactionId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { keypayTransactionId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_T_I,
					finderArgs, this);
		}

		if (result instanceof PaymentFile) {
			PaymentFile paymentFile = (PaymentFile)result;

			if ((keypayTransactionId != paymentFile.getKeypayTransactionId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_PAYMENTFILE_WHERE);

			query.append(_FINDER_COLUMN_T_I_KEYPAYTRANSACTIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(keypayTransactionId);

				List<PaymentFile> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_T_I,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"PaymentFilePersistenceImpl.fetchByT_I(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					PaymentFile paymentFile = list.get(0);

					result = paymentFile;

					cacheResult(paymentFile);

					if ((paymentFile.getKeypayTransactionId() != keypayTransactionId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_T_I,
							finderArgs, paymentFile);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_T_I,
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
			return (PaymentFile)result;
		}
	}

	/**
	 * Removes the Payment file where keypayTransactionId = &#63; from the database.
	 *
	 * @param keypayTransactionId the keypay transaction ID
	 * @return the Payment file that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile removeByT_I(long keypayTransactionId)
		throws NoSuchPaymentFileException, SystemException {
		PaymentFile paymentFile = findByT_I(keypayTransactionId);

		return remove(paymentFile);
	}

	/**
	 * Returns the number of Payment files where keypayTransactionId = &#63;.
	 *
	 * @param keypayTransactionId the keypay transaction ID
	 * @return the number of matching Payment files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByT_I(long keypayTransactionId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_T_I;

		Object[] finderArgs = new Object[] { keypayTransactionId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PAYMENTFILE_WHERE);

			query.append(_FINDER_COLUMN_T_I_KEYPAYTRANSACTIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(keypayTransactionId);

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

	private static final String _FINDER_COLUMN_T_I_KEYPAYTRANSACTIONID_2 = "paymentFile.keypayTransactionId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_OID = new FinderPath(PaymentFileModelImpl.ENTITY_CACHE_ENABLED,
			PaymentFileModelImpl.FINDER_CACHE_ENABLED, PaymentFileImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByOID",
			new String[] { String.class.getName() },
			PaymentFileModelImpl.OID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_OID = new FinderPath(PaymentFileModelImpl.ENTITY_CACHE_ENABLED,
			PaymentFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByOID",
			new String[] { String.class.getName() });

	/**
	 * Returns the Payment file where oid = &#63; or throws a {@link org.opencps.paymentmgt.NoSuchPaymentFileException} if it could not be found.
	 *
	 * @param oid the oid
	 * @return the matching Payment file
	 * @throws org.opencps.paymentmgt.NoSuchPaymentFileException if a matching Payment file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile findByOID(String oid)
		throws NoSuchPaymentFileException, SystemException {
		PaymentFile paymentFile = fetchByOID(oid);

		if (paymentFile == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("oid=");
			msg.append(oid);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchPaymentFileException(msg.toString());
		}

		return paymentFile;
	}

	/**
	 * Returns the Payment file where oid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param oid the oid
	 * @return the matching Payment file, or <code>null</code> if a matching Payment file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile fetchByOID(String oid) throws SystemException {
		return fetchByOID(oid, true);
	}

	/**
	 * Returns the Payment file where oid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param oid the oid
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching Payment file, or <code>null</code> if a matching Payment file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile fetchByOID(String oid, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { oid };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_OID,
					finderArgs, this);
		}

		if (result instanceof PaymentFile) {
			PaymentFile paymentFile = (PaymentFile)result;

			if (!Validator.equals(oid, paymentFile.getOid())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_PAYMENTFILE_WHERE);

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

				List<PaymentFile> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_OID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"PaymentFilePersistenceImpl.fetchByOID(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					PaymentFile paymentFile = list.get(0);

					result = paymentFile;

					cacheResult(paymentFile);

					if ((paymentFile.getOid() == null) ||
							!paymentFile.getOid().equals(oid)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_OID,
							finderArgs, paymentFile);
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
			return (PaymentFile)result;
		}
	}

	/**
	 * Removes the Payment file where oid = &#63; from the database.
	 *
	 * @param oid the oid
	 * @return the Payment file that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile removeByOID(String oid)
		throws NoSuchPaymentFileException, SystemException {
		PaymentFile paymentFile = findByOID(oid);

		return remove(paymentFile);
	}

	/**
	 * Returns the number of Payment files where oid = &#63;.
	 *
	 * @param oid the oid
	 * @return the number of matching Payment files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByOID(String oid) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_OID;

		Object[] finderArgs = new Object[] { oid };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PAYMENTFILE_WHERE);

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

	private static final String _FINDER_COLUMN_OID_OID_1 = "paymentFile.oid IS NULL";
	private static final String _FINDER_COLUMN_OID_OID_2 = "paymentFile.oid = ?";
	private static final String _FINDER_COLUMN_OID_OID_3 = "(paymentFile.oid IS NULL OR paymentFile.oid = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_F_NEW_REQUEST =
		new FinderPath(PaymentFileModelImpl.ENTITY_CACHE_ENABLED,
			PaymentFileModelImpl.FINDER_CACHE_ENABLED, PaymentFileImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByF_NEW_Request",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_NEW_REQUEST =
		new FinderPath(PaymentFileModelImpl.ENTITY_CACHE_ENABLED,
			PaymentFileModelImpl.FINDER_CACHE_ENABLED, PaymentFileImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByF_NEW_Request",
			new String[] { Integer.class.getName() },
			PaymentFileModelImpl.PAYMENTSTATUS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_NEW_REQUEST = new FinderPath(PaymentFileModelImpl.ENTITY_CACHE_ENABLED,
			PaymentFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByF_NEW_Request",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the Payment files where paymentStatus = &#63;.
	 *
	 * @param paymentStatus the payment status
	 * @return the matching Payment files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentFile> findByF_NEW_Request(int paymentStatus)
		throws SystemException {
		return findByF_NEW_Request(paymentStatus, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the Payment files where paymentStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.paymentmgt.model.impl.PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param paymentStatus the payment status
	 * @param start the lower bound of the range of Payment files
	 * @param end the upper bound of the range of Payment files (not inclusive)
	 * @return the range of matching Payment files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentFile> findByF_NEW_Request(int paymentStatus, int start,
		int end) throws SystemException {
		return findByF_NEW_Request(paymentStatus, start, end, null);
	}

	/**
	 * Returns an ordered range of all the Payment files where paymentStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.paymentmgt.model.impl.PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param paymentStatus the payment status
	 * @param start the lower bound of the range of Payment files
	 * @param end the upper bound of the range of Payment files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching Payment files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentFile> findByF_NEW_Request(int paymentStatus, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_NEW_REQUEST;
			finderArgs = new Object[] { paymentStatus };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_F_NEW_REQUEST;
			finderArgs = new Object[] {
					paymentStatus,
					
					start, end, orderByComparator
				};
		}

		List<PaymentFile> list = (List<PaymentFile>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (PaymentFile paymentFile : list) {
				if ((paymentStatus != paymentFile.getPaymentStatus())) {
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

			query.append(_SQL_SELECT_PAYMENTFILE_WHERE);

			query.append(_FINDER_COLUMN_F_NEW_REQUEST_PAYMENTSTATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PaymentFileModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(paymentStatus);

				if (!pagination) {
					list = (List<PaymentFile>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PaymentFile>(list);
				}
				else {
					list = (List<PaymentFile>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first Payment file in the ordered set where paymentStatus = &#63;.
	 *
	 * @param paymentStatus the payment status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Payment file
	 * @throws org.opencps.paymentmgt.NoSuchPaymentFileException if a matching Payment file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile findByF_NEW_Request_First(int paymentStatus,
		OrderByComparator orderByComparator)
		throws NoSuchPaymentFileException, SystemException {
		PaymentFile paymentFile = fetchByF_NEW_Request_First(paymentStatus,
				orderByComparator);

		if (paymentFile != null) {
			return paymentFile;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("paymentStatus=");
		msg.append(paymentStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPaymentFileException(msg.toString());
	}

	/**
	 * Returns the first Payment file in the ordered set where paymentStatus = &#63;.
	 *
	 * @param paymentStatus the payment status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Payment file, or <code>null</code> if a matching Payment file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile fetchByF_NEW_Request_First(int paymentStatus,
		OrderByComparator orderByComparator) throws SystemException {
		List<PaymentFile> list = findByF_NEW_Request(paymentStatus, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last Payment file in the ordered set where paymentStatus = &#63;.
	 *
	 * @param paymentStatus the payment status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Payment file
	 * @throws org.opencps.paymentmgt.NoSuchPaymentFileException if a matching Payment file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile findByF_NEW_Request_Last(int paymentStatus,
		OrderByComparator orderByComparator)
		throws NoSuchPaymentFileException, SystemException {
		PaymentFile paymentFile = fetchByF_NEW_Request_Last(paymentStatus,
				orderByComparator);

		if (paymentFile != null) {
			return paymentFile;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("paymentStatus=");
		msg.append(paymentStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPaymentFileException(msg.toString());
	}

	/**
	 * Returns the last Payment file in the ordered set where paymentStatus = &#63;.
	 *
	 * @param paymentStatus the payment status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Payment file, or <code>null</code> if a matching Payment file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile fetchByF_NEW_Request_Last(int paymentStatus,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByF_NEW_Request(paymentStatus);

		if (count == 0) {
			return null;
		}

		List<PaymentFile> list = findByF_NEW_Request(paymentStatus, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the Payment files before and after the current Payment file in the ordered set where paymentStatus = &#63;.
	 *
	 * @param paymentFileId the primary key of the current Payment file
	 * @param paymentStatus the payment status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next Payment file
	 * @throws org.opencps.paymentmgt.NoSuchPaymentFileException if a Payment file with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile[] findByF_NEW_Request_PrevAndNext(long paymentFileId,
		int paymentStatus, OrderByComparator orderByComparator)
		throws NoSuchPaymentFileException, SystemException {
		PaymentFile paymentFile = findByPrimaryKey(paymentFileId);

		Session session = null;

		try {
			session = openSession();

			PaymentFile[] array = new PaymentFileImpl[3];

			array[0] = getByF_NEW_Request_PrevAndNext(session, paymentFile,
					paymentStatus, orderByComparator, true);

			array[1] = paymentFile;

			array[2] = getByF_NEW_Request_PrevAndNext(session, paymentFile,
					paymentStatus, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected PaymentFile getByF_NEW_Request_PrevAndNext(Session session,
		PaymentFile paymentFile, int paymentStatus,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PAYMENTFILE_WHERE);

		query.append(_FINDER_COLUMN_F_NEW_REQUEST_PAYMENTSTATUS_2);

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
			query.append(PaymentFileModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(paymentStatus);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(paymentFile);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<PaymentFile> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the Payment files where paymentStatus = &#63; from the database.
	 *
	 * @param paymentStatus the payment status
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByF_NEW_Request(int paymentStatus)
		throws SystemException {
		for (PaymentFile paymentFile : findByF_NEW_Request(paymentStatus,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(paymentFile);
		}
	}

	/**
	 * Returns the number of Payment files where paymentStatus = &#63;.
	 *
	 * @param paymentStatus the payment status
	 * @return the number of matching Payment files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByF_NEW_Request(int paymentStatus)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_F_NEW_REQUEST;

		Object[] finderArgs = new Object[] { paymentStatus };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PAYMENTFILE_WHERE);

			query.append(_FINDER_COLUMN_F_NEW_REQUEST_PAYMENTSTATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(paymentStatus);

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

	private static final String _FINDER_COLUMN_F_NEW_REQUEST_PAYMENTSTATUS_2 = "paymentFile.paymentStatus = ?";

	public PaymentFilePersistenceImpl() {
		setModelClass(PaymentFile.class);
	}

	/**
	 * Caches the Payment file in the entity cache if it is enabled.
	 *
	 * @param paymentFile the Payment file
	 */
	@Override
	public void cacheResult(PaymentFile paymentFile) {
		EntityCacheUtil.putResult(PaymentFileModelImpl.ENTITY_CACHE_ENABLED,
			PaymentFileImpl.class, paymentFile.getPrimaryKey(), paymentFile);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { paymentFile.getUuid(), paymentFile.getGroupId() },
			paymentFile);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GOODCODE,
			new Object[] {
				paymentFile.getGroupId(), paymentFile.getKeypayGoodCode()
			}, paymentFile);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MERCHANTRESPONSE,
			new Object[] {
				paymentFile.getKeypayTransactionId(),
				paymentFile.getKeypayGoodCode(), paymentFile.getAmount()
			}, paymentFile);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_C,
			new Object[] { paymentFile.getKeypayGoodCode() }, paymentFile);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_T_I,
			new Object[] { paymentFile.getKeypayTransactionId() }, paymentFile);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_OID,
			new Object[] { paymentFile.getOid() }, paymentFile);

		paymentFile.resetOriginalValues();
	}

	/**
	 * Caches the Payment files in the entity cache if it is enabled.
	 *
	 * @param paymentFiles the Payment files
	 */
	@Override
	public void cacheResult(List<PaymentFile> paymentFiles) {
		for (PaymentFile paymentFile : paymentFiles) {
			if (EntityCacheUtil.getResult(
						PaymentFileModelImpl.ENTITY_CACHE_ENABLED,
						PaymentFileImpl.class, paymentFile.getPrimaryKey()) == null) {
				cacheResult(paymentFile);
			}
			else {
				paymentFile.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all Payment files.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PaymentFileImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PaymentFileImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the Payment file.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PaymentFile paymentFile) {
		EntityCacheUtil.removeResult(PaymentFileModelImpl.ENTITY_CACHE_ENABLED,
			PaymentFileImpl.class, paymentFile.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(paymentFile);
	}

	@Override
	public void clearCache(List<PaymentFile> paymentFiles) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (PaymentFile paymentFile : paymentFiles) {
			EntityCacheUtil.removeResult(PaymentFileModelImpl.ENTITY_CACHE_ENABLED,
				PaymentFileImpl.class, paymentFile.getPrimaryKey());

			clearUniqueFindersCache(paymentFile);
		}
	}

	protected void cacheUniqueFindersCache(PaymentFile paymentFile) {
		if (paymentFile.isNew()) {
			Object[] args = new Object[] {
					paymentFile.getUuid(), paymentFile.getGroupId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
				paymentFile);

			args = new Object[] {
					paymentFile.getGroupId(), paymentFile.getKeypayGoodCode()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GOODCODE, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GOODCODE, args,
				paymentFile);

			args = new Object[] {
					paymentFile.getKeypayTransactionId(),
					paymentFile.getKeypayGoodCode(), paymentFile.getAmount()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MERCHANTRESPONSE,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MERCHANTRESPONSE,
				args, paymentFile);

			args = new Object[] { paymentFile.getKeypayGoodCode() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_C, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_C, args,
				paymentFile);

			args = new Object[] { paymentFile.getKeypayTransactionId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_T_I, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_T_I, args,
				paymentFile);

			args = new Object[] { paymentFile.getOid() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_OID, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_OID, args,
				paymentFile);
		}
		else {
			PaymentFileModelImpl paymentFileModelImpl = (PaymentFileModelImpl)paymentFile;

			if ((paymentFileModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						paymentFile.getUuid(), paymentFile.getGroupId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
					paymentFile);
			}

			if ((paymentFileModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_GOODCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						paymentFile.getGroupId(),
						paymentFile.getKeypayGoodCode()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GOODCODE, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GOODCODE, args,
					paymentFile);
			}

			if ((paymentFileModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_MERCHANTRESPONSE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						paymentFile.getKeypayTransactionId(),
						paymentFile.getKeypayGoodCode(), paymentFile.getAmount()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MERCHANTRESPONSE,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MERCHANTRESPONSE,
					args, paymentFile);
			}

			if ((paymentFileModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_G_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { paymentFile.getKeypayGoodCode() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_C, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_C, args,
					paymentFile);
			}

			if ((paymentFileModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_T_I.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						paymentFile.getKeypayTransactionId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_T_I, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_T_I, args,
					paymentFile);
			}

			if ((paymentFileModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_OID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { paymentFile.getOid() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_OID, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_OID, args,
					paymentFile);
			}
		}
	}

	protected void clearUniqueFindersCache(PaymentFile paymentFile) {
		PaymentFileModelImpl paymentFileModelImpl = (PaymentFileModelImpl)paymentFile;

		Object[] args = new Object[] {
				paymentFile.getUuid(), paymentFile.getGroupId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);

		if ((paymentFileModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			args = new Object[] {
					paymentFileModelImpl.getOriginalUuid(),
					paymentFileModelImpl.getOriginalGroupId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		args = new Object[] {
				paymentFile.getGroupId(), paymentFile.getKeypayGoodCode()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GOODCODE, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GOODCODE, args);

		if ((paymentFileModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_GOODCODE.getColumnBitmask()) != 0) {
			args = new Object[] {
					paymentFileModelImpl.getOriginalGroupId(),
					paymentFileModelImpl.getOriginalKeypayGoodCode()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GOODCODE, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GOODCODE, args);
		}

		args = new Object[] {
				paymentFile.getKeypayTransactionId(),
				paymentFile.getKeypayGoodCode(), paymentFile.getAmount()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MERCHANTRESPONSE, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MERCHANTRESPONSE, args);

		if ((paymentFileModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_MERCHANTRESPONSE.getColumnBitmask()) != 0) {
			args = new Object[] {
					paymentFileModelImpl.getOriginalKeypayTransactionId(),
					paymentFileModelImpl.getOriginalKeypayGoodCode(),
					paymentFileModelImpl.getOriginalAmount()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MERCHANTRESPONSE,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MERCHANTRESPONSE,
				args);
		}

		args = new Object[] { paymentFile.getKeypayGoodCode() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_C, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_C, args);

		if ((paymentFileModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_G_C.getColumnBitmask()) != 0) {
			args = new Object[] { paymentFileModelImpl.getOriginalKeypayGoodCode() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_C, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_C, args);
		}

		args = new Object[] { paymentFile.getKeypayTransactionId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_T_I, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_T_I, args);

		if ((paymentFileModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_T_I.getColumnBitmask()) != 0) {
			args = new Object[] {
					paymentFileModelImpl.getOriginalKeypayTransactionId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_T_I, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_T_I, args);
		}

		args = new Object[] { paymentFile.getOid() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_OID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_OID, args);

		if ((paymentFileModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_OID.getColumnBitmask()) != 0) {
			args = new Object[] { paymentFileModelImpl.getOriginalOid() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_OID, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_OID, args);
		}
	}

	/**
	 * Creates a new Payment file with the primary key. Does not add the Payment file to the database.
	 *
	 * @param paymentFileId the primary key for the new Payment file
	 * @return the new Payment file
	 */
	@Override
	public PaymentFile create(long paymentFileId) {
		PaymentFile paymentFile = new PaymentFileImpl();

		paymentFile.setNew(true);
		paymentFile.setPrimaryKey(paymentFileId);

		String uuid = PortalUUIDUtil.generate();

		paymentFile.setUuid(uuid);

		return paymentFile;
	}

	/**
	 * Removes the Payment file with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param paymentFileId the primary key of the Payment file
	 * @return the Payment file that was removed
	 * @throws org.opencps.paymentmgt.NoSuchPaymentFileException if a Payment file with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile remove(long paymentFileId)
		throws NoSuchPaymentFileException, SystemException {
		return remove((Serializable)paymentFileId);
	}

	/**
	 * Removes the Payment file with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the Payment file
	 * @return the Payment file that was removed
	 * @throws org.opencps.paymentmgt.NoSuchPaymentFileException if a Payment file with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile remove(Serializable primaryKey)
		throws NoSuchPaymentFileException, SystemException {
		Session session = null;

		try {
			session = openSession();

			PaymentFile paymentFile = (PaymentFile)session.get(PaymentFileImpl.class,
					primaryKey);

			if (paymentFile == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPaymentFileException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(paymentFile);
		}
		catch (NoSuchPaymentFileException nsee) {
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
	protected PaymentFile removeImpl(PaymentFile paymentFile)
		throws SystemException {
		paymentFile = toUnwrappedModel(paymentFile);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(paymentFile)) {
				paymentFile = (PaymentFile)session.get(PaymentFileImpl.class,
						paymentFile.getPrimaryKeyObj());
			}

			if (paymentFile != null) {
				session.delete(paymentFile);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (paymentFile != null) {
			clearCache(paymentFile);
		}

		return paymentFile;
	}

	@Override
	public PaymentFile updateImpl(
		org.opencps.paymentmgt.model.PaymentFile paymentFile)
		throws SystemException {
		paymentFile = toUnwrappedModel(paymentFile);

		boolean isNew = paymentFile.isNew();

		PaymentFileModelImpl paymentFileModelImpl = (PaymentFileModelImpl)paymentFile;

		if (Validator.isNull(paymentFile.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			paymentFile.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (paymentFile.isNew()) {
				session.save(paymentFile);

				paymentFile.setNew(false);
			}
			else {
				session.merge(paymentFile);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !PaymentFileModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((paymentFileModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						paymentFileModelImpl.getOriginalUuid()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { paymentFileModelImpl.getUuid() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((paymentFileModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						paymentFileModelImpl.getOriginalUuid(),
						paymentFileModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						paymentFileModelImpl.getUuid(),
						paymentFileModelImpl.getCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}

			if ((paymentFileModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_P.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						paymentFileModelImpl.getOriginalDossierId(),
						paymentFileModelImpl.getOriginalPaymentStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_D_P, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_P,
					args);

				args = new Object[] {
						paymentFileModelImpl.getDossierId(),
						paymentFileModelImpl.getPaymentStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_D_P, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_P,
					args);
			}

			if ((paymentFileModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						paymentFileModelImpl.getOriginalDossierId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_D_, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_,
					args);

				args = new Object[] { paymentFileModelImpl.getDossierId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_D_, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_D_,
					args);
			}

			if ((paymentFileModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_NEW_REQUEST.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						paymentFileModelImpl.getOriginalPaymentStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_NEW_REQUEST,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_NEW_REQUEST,
					args);

				args = new Object[] { paymentFileModelImpl.getPaymentStatus() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_NEW_REQUEST,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_NEW_REQUEST,
					args);
			}
		}

		EntityCacheUtil.putResult(PaymentFileModelImpl.ENTITY_CACHE_ENABLED,
			PaymentFileImpl.class, paymentFile.getPrimaryKey(), paymentFile);

		clearUniqueFindersCache(paymentFile);
		cacheUniqueFindersCache(paymentFile);

		return paymentFile;
	}

	protected PaymentFile toUnwrappedModel(PaymentFile paymentFile) {
		if (paymentFile instanceof PaymentFileImpl) {
			return paymentFile;
		}

		PaymentFileImpl paymentFileImpl = new PaymentFileImpl();

		paymentFileImpl.setNew(paymentFile.isNew());
		paymentFileImpl.setPrimaryKey(paymentFile.getPrimaryKey());

		paymentFileImpl.setUuid(paymentFile.getUuid());
		paymentFileImpl.setPaymentFileId(paymentFile.getPaymentFileId());
		paymentFileImpl.setCompanyId(paymentFile.getCompanyId());
		paymentFileImpl.setGroupId(paymentFile.getGroupId());
		paymentFileImpl.setUserId(paymentFile.getUserId());
		paymentFileImpl.setCreateDate(paymentFile.getCreateDate());
		paymentFileImpl.setModifiedDate(paymentFile.getModifiedDate());
		paymentFileImpl.setDossierId(paymentFile.getDossierId());
		paymentFileImpl.setFileGroupId(paymentFile.getFileGroupId());
		paymentFileImpl.setOwnerUserId(paymentFile.getOwnerUserId());
		paymentFileImpl.setOwnerOrganizationId(paymentFile.getOwnerOrganizationId());
		paymentFileImpl.setGovAgencyOrganizationId(paymentFile.getGovAgencyOrganizationId());
		paymentFileImpl.setPaymentName(paymentFile.getPaymentName());
		paymentFileImpl.setRequestDatetime(paymentFile.getRequestDatetime());
		paymentFileImpl.setAmount(paymentFile.getAmount());
		paymentFileImpl.setRequestNote(paymentFile.getRequestNote());
		paymentFileImpl.setPaymentOptions(paymentFile.getPaymentOptions());
		paymentFileImpl.setKeypayUrl(paymentFile.getKeypayUrl());
		paymentFileImpl.setKeypayTransactionId(paymentFile.getKeypayTransactionId());
		paymentFileImpl.setKeypayGoodCode(paymentFile.getKeypayGoodCode());
		paymentFileImpl.setKeypayMerchantCode(paymentFile.getKeypayMerchantCode());
		paymentFileImpl.setBankInfo(paymentFile.getBankInfo());
		paymentFileImpl.setPlaceInfo(paymentFile.getPlaceInfo());
		paymentFileImpl.setPaymentStatus(paymentFile.getPaymentStatus());
		paymentFileImpl.setPaymentMethod(paymentFile.getPaymentMethod());
		paymentFileImpl.setConfirmDatetime(paymentFile.getConfirmDatetime());
		paymentFileImpl.setConfirmFileEntryId(paymentFile.getConfirmFileEntryId());
		paymentFileImpl.setApproveDatetime(paymentFile.getApproveDatetime());
		paymentFileImpl.setAccountUserName(paymentFile.getAccountUserName());
		paymentFileImpl.setApproveNote(paymentFile.getApproveNote());
		paymentFileImpl.setGovAgencyTaxNo(paymentFile.getGovAgencyTaxNo());
		paymentFileImpl.setInvoiceTemplateNo(paymentFile.getInvoiceTemplateNo());
		paymentFileImpl.setInvoiceIssueNo(paymentFile.getInvoiceIssueNo());
		paymentFileImpl.setInvoiceNo(paymentFile.getInvoiceNo());
		paymentFileImpl.setSyncStatus(paymentFile.getSyncStatus());
		paymentFileImpl.setOid(paymentFile.getOid());

		return paymentFileImpl;
	}

	/**
	 * Returns the Payment file with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the Payment file
	 * @return the Payment file
	 * @throws org.opencps.paymentmgt.NoSuchPaymentFileException if a Payment file with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPaymentFileException, SystemException {
		PaymentFile paymentFile = fetchByPrimaryKey(primaryKey);

		if (paymentFile == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPaymentFileException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return paymentFile;
	}

	/**
	 * Returns the Payment file with the primary key or throws a {@link org.opencps.paymentmgt.NoSuchPaymentFileException} if it could not be found.
	 *
	 * @param paymentFileId the primary key of the Payment file
	 * @return the Payment file
	 * @throws org.opencps.paymentmgt.NoSuchPaymentFileException if a Payment file with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile findByPrimaryKey(long paymentFileId)
		throws NoSuchPaymentFileException, SystemException {
		return findByPrimaryKey((Serializable)paymentFileId);
	}

	/**
	 * Returns the Payment file with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the Payment file
	 * @return the Payment file, or <code>null</code> if a Payment file with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		PaymentFile paymentFile = (PaymentFile)EntityCacheUtil.getResult(PaymentFileModelImpl.ENTITY_CACHE_ENABLED,
				PaymentFileImpl.class, primaryKey);

		if (paymentFile == _nullPaymentFile) {
			return null;
		}

		if (paymentFile == null) {
			Session session = null;

			try {
				session = openSession();

				paymentFile = (PaymentFile)session.get(PaymentFileImpl.class,
						primaryKey);

				if (paymentFile != null) {
					cacheResult(paymentFile);
				}
				else {
					EntityCacheUtil.putResult(PaymentFileModelImpl.ENTITY_CACHE_ENABLED,
						PaymentFileImpl.class, primaryKey, _nullPaymentFile);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PaymentFileModelImpl.ENTITY_CACHE_ENABLED,
					PaymentFileImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return paymentFile;
	}

	/**
	 * Returns the Payment file with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param paymentFileId the primary key of the Payment file
	 * @return the Payment file, or <code>null</code> if a Payment file with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentFile fetchByPrimaryKey(long paymentFileId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)paymentFileId);
	}

	/**
	 * Returns all the Payment files.
	 *
	 * @return the Payment files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentFile> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the Payment files.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.paymentmgt.model.impl.PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Payment files
	 * @param end the upper bound of the range of Payment files (not inclusive)
	 * @return the range of Payment files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentFile> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the Payment files.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.paymentmgt.model.impl.PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Payment files
	 * @param end the upper bound of the range of Payment files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of Payment files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentFile> findAll(int start, int end,
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

		List<PaymentFile> list = (List<PaymentFile>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PAYMENTFILE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PAYMENTFILE;

				if (pagination) {
					sql = sql.concat(PaymentFileModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<PaymentFile>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PaymentFile>(list);
				}
				else {
					list = (List<PaymentFile>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the Payment files from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (PaymentFile paymentFile : findAll()) {
			remove(paymentFile);
		}
	}

	/**
	 * Returns the number of Payment files.
	 *
	 * @return the number of Payment files
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

				Query q = session.createQuery(_SQL_COUNT_PAYMENTFILE);

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

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the Payment file persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.opencps.paymentmgt.model.PaymentFile")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<PaymentFile>> listenersList = new ArrayList<ModelListener<PaymentFile>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<PaymentFile>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PaymentFileImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PAYMENTFILE = "SELECT paymentFile FROM PaymentFile paymentFile";
	private static final String _SQL_SELECT_PAYMENTFILE_WHERE = "SELECT paymentFile FROM PaymentFile paymentFile WHERE ";
	private static final String _SQL_COUNT_PAYMENTFILE = "SELECT COUNT(paymentFile) FROM PaymentFile paymentFile";
	private static final String _SQL_COUNT_PAYMENTFILE_WHERE = "SELECT COUNT(paymentFile) FROM PaymentFile paymentFile WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "paymentFile.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PaymentFile exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No PaymentFile exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PaymentFilePersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
	private static PaymentFile _nullPaymentFile = new PaymentFileImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<PaymentFile> toCacheModel() {
				return _nullPaymentFileCacheModel;
			}
		};

	private static CacheModel<PaymentFile> _nullPaymentFileCacheModel = new CacheModel<PaymentFile>() {
			@Override
			public PaymentFile toEntityModel() {
				return _nullPaymentFile;
			}
		};
}