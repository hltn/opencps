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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import org.opencps.paymentmgt.model.PaymentFile;

import java.util.List;

/**
 * The persistence utility for the Payment file service. This utility wraps {@link PaymentFilePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see PaymentFilePersistence
 * @see PaymentFilePersistenceImpl
 * @generated
 */
public class PaymentFileUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(PaymentFile paymentFile) {
		getPersistence().clearCache(paymentFile);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<PaymentFile> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PaymentFile> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PaymentFile> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static PaymentFile update(PaymentFile paymentFile)
		throws SystemException {
		return getPersistence().update(paymentFile);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static PaymentFile update(PaymentFile paymentFile,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(paymentFile, serviceContext);
	}

	/**
	* Returns all the Payment files where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching Payment files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.paymentmgt.model.PaymentFile> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid);
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
	public static java.util.List<org.opencps.paymentmgt.model.PaymentFile> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end);
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
	public static java.util.List<org.opencps.paymentmgt.model.PaymentFile> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
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
	public static org.opencps.paymentmgt.model.PaymentFile findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.paymentmgt.NoSuchPaymentFileException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first Payment file in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Payment file, or <code>null</code> if a matching Payment file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.paymentmgt.model.PaymentFile fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
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
	public static org.opencps.paymentmgt.model.PaymentFile findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.paymentmgt.NoSuchPaymentFileException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last Payment file in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Payment file, or <code>null</code> if a matching Payment file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.paymentmgt.model.PaymentFile fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
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
	public static org.opencps.paymentmgt.model.PaymentFile[] findByUuid_PrevAndNext(
		long paymentFileId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.paymentmgt.NoSuchPaymentFileException {
		return getPersistence()
				   .findByUuid_PrevAndNext(paymentFileId, uuid,
			orderByComparator);
	}

	/**
	* Removes all the Payment files where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of Payment files where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching Payment files
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the Payment file where uuid = &#63; and groupId = &#63; or throws a {@link org.opencps.paymentmgt.NoSuchPaymentFileException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching Payment file
	* @throws org.opencps.paymentmgt.NoSuchPaymentFileException if a matching Payment file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.paymentmgt.model.PaymentFile findByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.paymentmgt.NoSuchPaymentFileException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the Payment file where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching Payment file, or <code>null</code> if a matching Payment file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.paymentmgt.model.PaymentFile fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId);
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
	public static org.opencps.paymentmgt.model.PaymentFile fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the Payment file where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the Payment file that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.paymentmgt.model.PaymentFile removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.paymentmgt.NoSuchPaymentFileException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of Payment files where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching Payment files
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the Payment files where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching Payment files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.paymentmgt.model.PaymentFile> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_C(uuid, companyId);
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
	public static java.util.List<org.opencps.paymentmgt.model.PaymentFile> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
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
	public static java.util.List<org.opencps.paymentmgt.model.PaymentFile> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
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
	public static org.opencps.paymentmgt.model.PaymentFile findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.paymentmgt.NoSuchPaymentFileException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
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
	public static org.opencps.paymentmgt.model.PaymentFile fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
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
	public static org.opencps.paymentmgt.model.PaymentFile findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.paymentmgt.NoSuchPaymentFileException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
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
	public static org.opencps.paymentmgt.model.PaymentFile fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
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
	public static org.opencps.paymentmgt.model.PaymentFile[] findByUuid_C_PrevAndNext(
		long paymentFileId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.paymentmgt.NoSuchPaymentFileException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(paymentFileId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the Payment files where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of Payment files where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching Payment files
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns the Payment file where groupId = &#63; and keypayGoodCode = &#63; or throws a {@link org.opencps.paymentmgt.NoSuchPaymentFileException} if it could not be found.
	*
	* @param groupId the group ID
	* @param keypayGoodCode the keypay good code
	* @return the matching Payment file
	* @throws org.opencps.paymentmgt.NoSuchPaymentFileException if a matching Payment file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.paymentmgt.model.PaymentFile findByGoodCode(
		long groupId, java.lang.String keypayGoodCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.paymentmgt.NoSuchPaymentFileException {
		return getPersistence().findByGoodCode(groupId, keypayGoodCode);
	}

	/**
	* Returns the Payment file where groupId = &#63; and keypayGoodCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param keypayGoodCode the keypay good code
	* @return the matching Payment file, or <code>null</code> if a matching Payment file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.paymentmgt.model.PaymentFile fetchByGoodCode(
		long groupId, java.lang.String keypayGoodCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGoodCode(groupId, keypayGoodCode);
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
	public static org.opencps.paymentmgt.model.PaymentFile fetchByGoodCode(
		long groupId, java.lang.String keypayGoodCode, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByGoodCode(groupId, keypayGoodCode, retrieveFromCache);
	}

	/**
	* Removes the Payment file where groupId = &#63; and keypayGoodCode = &#63; from the database.
	*
	* @param groupId the group ID
	* @param keypayGoodCode the keypay good code
	* @return the Payment file that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.paymentmgt.model.PaymentFile removeByGoodCode(
		long groupId, java.lang.String keypayGoodCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.paymentmgt.NoSuchPaymentFileException {
		return getPersistence().removeByGoodCode(groupId, keypayGoodCode);
	}

	/**
	* Returns the number of Payment files where groupId = &#63; and keypayGoodCode = &#63;.
	*
	* @param groupId the group ID
	* @param keypayGoodCode the keypay good code
	* @return the number of matching Payment files
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGoodCode(long groupId,
		java.lang.String keypayGoodCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGoodCode(groupId, keypayGoodCode);
	}

	/**
	* Returns all the Payment files where dossierId = &#63; and paymentStatus = &#63;.
	*
	* @param dossierId the dossier ID
	* @param paymentStatus the payment status
	* @return the matching Payment files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.paymentmgt.model.PaymentFile> findByD_P(
		long dossierId, int paymentStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByD_P(dossierId, paymentStatus);
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
	public static java.util.List<org.opencps.paymentmgt.model.PaymentFile> findByD_P(
		long dossierId, int paymentStatus, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByD_P(dossierId, paymentStatus, start, end);
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
	public static java.util.List<org.opencps.paymentmgt.model.PaymentFile> findByD_P(
		long dossierId, int paymentStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByD_P(dossierId, paymentStatus, start, end,
			orderByComparator);
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
	public static org.opencps.paymentmgt.model.PaymentFile findByD_P_First(
		long dossierId, int paymentStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.paymentmgt.NoSuchPaymentFileException {
		return getPersistence()
				   .findByD_P_First(dossierId, paymentStatus, orderByComparator);
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
	public static org.opencps.paymentmgt.model.PaymentFile fetchByD_P_First(
		long dossierId, int paymentStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByD_P_First(dossierId, paymentStatus, orderByComparator);
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
	public static org.opencps.paymentmgt.model.PaymentFile findByD_P_Last(
		long dossierId, int paymentStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.paymentmgt.NoSuchPaymentFileException {
		return getPersistence()
				   .findByD_P_Last(dossierId, paymentStatus, orderByComparator);
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
	public static org.opencps.paymentmgt.model.PaymentFile fetchByD_P_Last(
		long dossierId, int paymentStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByD_P_Last(dossierId, paymentStatus, orderByComparator);
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
	public static org.opencps.paymentmgt.model.PaymentFile[] findByD_P_PrevAndNext(
		long paymentFileId, long dossierId, int paymentStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.paymentmgt.NoSuchPaymentFileException {
		return getPersistence()
				   .findByD_P_PrevAndNext(paymentFileId, dossierId,
			paymentStatus, orderByComparator);
	}

	/**
	* Removes all the Payment files where dossierId = &#63; and paymentStatus = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param paymentStatus the payment status
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByD_P(long dossierId, int paymentStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByD_P(dossierId, paymentStatus);
	}

	/**
	* Returns the number of Payment files where dossierId = &#63; and paymentStatus = &#63;.
	*
	* @param dossierId the dossier ID
	* @param paymentStatus the payment status
	* @return the number of matching Payment files
	* @throws SystemException if a system exception occurred
	*/
	public static int countByD_P(long dossierId, int paymentStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByD_P(dossierId, paymentStatus);
	}

	/**
	* Returns all the Payment files where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the matching Payment files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.paymentmgt.model.PaymentFile> findByD_(
		long dossierId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByD_(dossierId);
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
	public static java.util.List<org.opencps.paymentmgt.model.PaymentFile> findByD_(
		long dossierId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByD_(dossierId, start, end);
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
	public static java.util.List<org.opencps.paymentmgt.model.PaymentFile> findByD_(
		long dossierId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByD_(dossierId, start, end, orderByComparator);
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
	public static org.opencps.paymentmgt.model.PaymentFile findByD__First(
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.paymentmgt.NoSuchPaymentFileException {
		return getPersistence().findByD__First(dossierId, orderByComparator);
	}

	/**
	* Returns the first Payment file in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Payment file, or <code>null</code> if a matching Payment file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.paymentmgt.model.PaymentFile fetchByD__First(
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByD__First(dossierId, orderByComparator);
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
	public static org.opencps.paymentmgt.model.PaymentFile findByD__Last(
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.paymentmgt.NoSuchPaymentFileException {
		return getPersistence().findByD__Last(dossierId, orderByComparator);
	}

	/**
	* Returns the last Payment file in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Payment file, or <code>null</code> if a matching Payment file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.paymentmgt.model.PaymentFile fetchByD__Last(
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByD__Last(dossierId, orderByComparator);
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
	public static org.opencps.paymentmgt.model.PaymentFile[] findByD__PrevAndNext(
		long paymentFileId, long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.paymentmgt.NoSuchPaymentFileException {
		return getPersistence()
				   .findByD__PrevAndNext(paymentFileId, dossierId,
			orderByComparator);
	}

	/**
	* Removes all the Payment files where dossierId = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByD_(long dossierId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByD_(dossierId);
	}

	/**
	* Returns the number of Payment files where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the number of matching Payment files
	* @throws SystemException if a system exception occurred
	*/
	public static int countByD_(long dossierId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByD_(dossierId);
	}

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
	public static org.opencps.paymentmgt.model.PaymentFile findByMerchantResponse(
		long keypayTransactionId, java.lang.String keypayGoodCode, double amount)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.paymentmgt.NoSuchPaymentFileException {
		return getPersistence()
				   .findByMerchantResponse(keypayTransactionId, keypayGoodCode,
			amount);
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
	public static org.opencps.paymentmgt.model.PaymentFile fetchByMerchantResponse(
		long keypayTransactionId, java.lang.String keypayGoodCode, double amount)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByMerchantResponse(keypayTransactionId,
			keypayGoodCode, amount);
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
	public static org.opencps.paymentmgt.model.PaymentFile fetchByMerchantResponse(
		long keypayTransactionId, java.lang.String keypayGoodCode,
		double amount, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByMerchantResponse(keypayTransactionId,
			keypayGoodCode, amount, retrieveFromCache);
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
	public static org.opencps.paymentmgt.model.PaymentFile removeByMerchantResponse(
		long keypayTransactionId, java.lang.String keypayGoodCode, double amount)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.paymentmgt.NoSuchPaymentFileException {
		return getPersistence()
				   .removeByMerchantResponse(keypayTransactionId,
			keypayGoodCode, amount);
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
	public static int countByMerchantResponse(long keypayTransactionId,
		java.lang.String keypayGoodCode, double amount)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByMerchantResponse(keypayTransactionId,
			keypayGoodCode, amount);
	}

	/**
	* Returns the Payment file where keypayGoodCode = &#63; or throws a {@link org.opencps.paymentmgt.NoSuchPaymentFileException} if it could not be found.
	*
	* @param keypayGoodCode the keypay good code
	* @return the matching Payment file
	* @throws org.opencps.paymentmgt.NoSuchPaymentFileException if a matching Payment file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.paymentmgt.model.PaymentFile findByG_C(
		java.lang.String keypayGoodCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.paymentmgt.NoSuchPaymentFileException {
		return getPersistence().findByG_C(keypayGoodCode);
	}

	/**
	* Returns the Payment file where keypayGoodCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param keypayGoodCode the keypay good code
	* @return the matching Payment file, or <code>null</code> if a matching Payment file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.paymentmgt.model.PaymentFile fetchByG_C(
		java.lang.String keypayGoodCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByG_C(keypayGoodCode);
	}

	/**
	* Returns the Payment file where keypayGoodCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param keypayGoodCode the keypay good code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching Payment file, or <code>null</code> if a matching Payment file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.paymentmgt.model.PaymentFile fetchByG_C(
		java.lang.String keypayGoodCode, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByG_C(keypayGoodCode, retrieveFromCache);
	}

	/**
	* Removes the Payment file where keypayGoodCode = &#63; from the database.
	*
	* @param keypayGoodCode the keypay good code
	* @return the Payment file that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.paymentmgt.model.PaymentFile removeByG_C(
		java.lang.String keypayGoodCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.paymentmgt.NoSuchPaymentFileException {
		return getPersistence().removeByG_C(keypayGoodCode);
	}

	/**
	* Returns the number of Payment files where keypayGoodCode = &#63;.
	*
	* @param keypayGoodCode the keypay good code
	* @return the number of matching Payment files
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_C(java.lang.String keypayGoodCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_C(keypayGoodCode);
	}

	/**
	* Returns the Payment file where keypayTransactionId = &#63; or throws a {@link org.opencps.paymentmgt.NoSuchPaymentFileException} if it could not be found.
	*
	* @param keypayTransactionId the keypay transaction ID
	* @return the matching Payment file
	* @throws org.opencps.paymentmgt.NoSuchPaymentFileException if a matching Payment file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.paymentmgt.model.PaymentFile findByT_I(
		long keypayTransactionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.paymentmgt.NoSuchPaymentFileException {
		return getPersistence().findByT_I(keypayTransactionId);
	}

	/**
	* Returns the Payment file where keypayTransactionId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param keypayTransactionId the keypay transaction ID
	* @return the matching Payment file, or <code>null</code> if a matching Payment file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.paymentmgt.model.PaymentFile fetchByT_I(
		long keypayTransactionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByT_I(keypayTransactionId);
	}

	/**
	* Returns the Payment file where keypayTransactionId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param keypayTransactionId the keypay transaction ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching Payment file, or <code>null</code> if a matching Payment file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.paymentmgt.model.PaymentFile fetchByT_I(
		long keypayTransactionId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByT_I(keypayTransactionId, retrieveFromCache);
	}

	/**
	* Removes the Payment file where keypayTransactionId = &#63; from the database.
	*
	* @param keypayTransactionId the keypay transaction ID
	* @return the Payment file that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.paymentmgt.model.PaymentFile removeByT_I(
		long keypayTransactionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.paymentmgt.NoSuchPaymentFileException {
		return getPersistence().removeByT_I(keypayTransactionId);
	}

	/**
	* Returns the number of Payment files where keypayTransactionId = &#63;.
	*
	* @param keypayTransactionId the keypay transaction ID
	* @return the number of matching Payment files
	* @throws SystemException if a system exception occurred
	*/
	public static int countByT_I(long keypayTransactionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByT_I(keypayTransactionId);
	}

	/**
	* Returns the Payment file where oid = &#63; or throws a {@link org.opencps.paymentmgt.NoSuchPaymentFileException} if it could not be found.
	*
	* @param oid the oid
	* @return the matching Payment file
	* @throws org.opencps.paymentmgt.NoSuchPaymentFileException if a matching Payment file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.paymentmgt.model.PaymentFile findByOID(
		java.lang.String oid)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.paymentmgt.NoSuchPaymentFileException {
		return getPersistence().findByOID(oid);
	}

	/**
	* Returns the Payment file where oid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param oid the oid
	* @return the matching Payment file, or <code>null</code> if a matching Payment file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.paymentmgt.model.PaymentFile fetchByOID(
		java.lang.String oid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByOID(oid);
	}

	/**
	* Returns the Payment file where oid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param oid the oid
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching Payment file, or <code>null</code> if a matching Payment file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.paymentmgt.model.PaymentFile fetchByOID(
		java.lang.String oid, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByOID(oid, retrieveFromCache);
	}

	/**
	* Removes the Payment file where oid = &#63; from the database.
	*
	* @param oid the oid
	* @return the Payment file that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.paymentmgt.model.PaymentFile removeByOID(
		java.lang.String oid)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.paymentmgt.NoSuchPaymentFileException {
		return getPersistence().removeByOID(oid);
	}

	/**
	* Returns the number of Payment files where oid = &#63;.
	*
	* @param oid the oid
	* @return the number of matching Payment files
	* @throws SystemException if a system exception occurred
	*/
	public static int countByOID(java.lang.String oid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByOID(oid);
	}

	/**
	* Returns all the Payment files where paymentStatus = &#63;.
	*
	* @param paymentStatus the payment status
	* @return the matching Payment files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.paymentmgt.model.PaymentFile> findByF_NEW_Request(
		int paymentStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByF_NEW_Request(paymentStatus);
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
	public static java.util.List<org.opencps.paymentmgt.model.PaymentFile> findByF_NEW_Request(
		int paymentStatus, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByF_NEW_Request(paymentStatus, start, end);
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
	public static java.util.List<org.opencps.paymentmgt.model.PaymentFile> findByF_NEW_Request(
		int paymentStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByF_NEW_Request(paymentStatus, start, end,
			orderByComparator);
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
	public static org.opencps.paymentmgt.model.PaymentFile findByF_NEW_Request_First(
		int paymentStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.paymentmgt.NoSuchPaymentFileException {
		return getPersistence()
				   .findByF_NEW_Request_First(paymentStatus, orderByComparator);
	}

	/**
	* Returns the first Payment file in the ordered set where paymentStatus = &#63;.
	*
	* @param paymentStatus the payment status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Payment file, or <code>null</code> if a matching Payment file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.paymentmgt.model.PaymentFile fetchByF_NEW_Request_First(
		int paymentStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByF_NEW_Request_First(paymentStatus, orderByComparator);
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
	public static org.opencps.paymentmgt.model.PaymentFile findByF_NEW_Request_Last(
		int paymentStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.paymentmgt.NoSuchPaymentFileException {
		return getPersistence()
				   .findByF_NEW_Request_Last(paymentStatus, orderByComparator);
	}

	/**
	* Returns the last Payment file in the ordered set where paymentStatus = &#63;.
	*
	* @param paymentStatus the payment status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Payment file, or <code>null</code> if a matching Payment file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.paymentmgt.model.PaymentFile fetchByF_NEW_Request_Last(
		int paymentStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByF_NEW_Request_Last(paymentStatus, orderByComparator);
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
	public static org.opencps.paymentmgt.model.PaymentFile[] findByF_NEW_Request_PrevAndNext(
		long paymentFileId, int paymentStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.paymentmgt.NoSuchPaymentFileException {
		return getPersistence()
				   .findByF_NEW_Request_PrevAndNext(paymentFileId,
			paymentStatus, orderByComparator);
	}

	/**
	* Removes all the Payment files where paymentStatus = &#63; from the database.
	*
	* @param paymentStatus the payment status
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByF_NEW_Request(int paymentStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByF_NEW_Request(paymentStatus);
	}

	/**
	* Returns the number of Payment files where paymentStatus = &#63;.
	*
	* @param paymentStatus the payment status
	* @return the number of matching Payment files
	* @throws SystemException if a system exception occurred
	*/
	public static int countByF_NEW_Request(int paymentStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByF_NEW_Request(paymentStatus);
	}

	/**
	* Caches the Payment file in the entity cache if it is enabled.
	*
	* @param paymentFile the Payment file
	*/
	public static void cacheResult(
		org.opencps.paymentmgt.model.PaymentFile paymentFile) {
		getPersistence().cacheResult(paymentFile);
	}

	/**
	* Caches the Payment files in the entity cache if it is enabled.
	*
	* @param paymentFiles the Payment files
	*/
	public static void cacheResult(
		java.util.List<org.opencps.paymentmgt.model.PaymentFile> paymentFiles) {
		getPersistence().cacheResult(paymentFiles);
	}

	/**
	* Creates a new Payment file with the primary key. Does not add the Payment file to the database.
	*
	* @param paymentFileId the primary key for the new Payment file
	* @return the new Payment file
	*/
	public static org.opencps.paymentmgt.model.PaymentFile create(
		long paymentFileId) {
		return getPersistence().create(paymentFileId);
	}

	/**
	* Removes the Payment file with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param paymentFileId the primary key of the Payment file
	* @return the Payment file that was removed
	* @throws org.opencps.paymentmgt.NoSuchPaymentFileException if a Payment file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.paymentmgt.model.PaymentFile remove(
		long paymentFileId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.paymentmgt.NoSuchPaymentFileException {
		return getPersistence().remove(paymentFileId);
	}

	public static org.opencps.paymentmgt.model.PaymentFile updateImpl(
		org.opencps.paymentmgt.model.PaymentFile paymentFile)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(paymentFile);
	}

	/**
	* Returns the Payment file with the primary key or throws a {@link org.opencps.paymentmgt.NoSuchPaymentFileException} if it could not be found.
	*
	* @param paymentFileId the primary key of the Payment file
	* @return the Payment file
	* @throws org.opencps.paymentmgt.NoSuchPaymentFileException if a Payment file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.paymentmgt.model.PaymentFile findByPrimaryKey(
		long paymentFileId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.paymentmgt.NoSuchPaymentFileException {
		return getPersistence().findByPrimaryKey(paymentFileId);
	}

	/**
	* Returns the Payment file with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param paymentFileId the primary key of the Payment file
	* @return the Payment file, or <code>null</code> if a Payment file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.paymentmgt.model.PaymentFile fetchByPrimaryKey(
		long paymentFileId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(paymentFileId);
	}

	/**
	* Returns all the Payment files.
	*
	* @return the Payment files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.paymentmgt.model.PaymentFile> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<org.opencps.paymentmgt.model.PaymentFile> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
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
	public static java.util.List<org.opencps.paymentmgt.model.PaymentFile> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the Payment files from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of Payment files.
	*
	* @return the number of Payment files
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static PaymentFilePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (PaymentFilePersistence)PortletBeanLocatorUtil.locate(org.opencps.paymentmgt.service.ClpSerializer.getServletContextName(),
					PaymentFilePersistence.class.getName());

			ReferenceRegistry.registerReference(PaymentFileUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(PaymentFilePersistence persistence) {
	}

	private static PaymentFilePersistence _persistence;
}