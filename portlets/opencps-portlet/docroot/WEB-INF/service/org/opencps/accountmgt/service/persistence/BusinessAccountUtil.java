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

package org.opencps.accountmgt.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import org.opencps.accountmgt.model.BusinessAccount;

import java.util.List;

/**
 * The persistence utility for the business account service. This utility wraps {@link BusinessAccountPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author khoavd
 * @see BusinessAccountPersistence
 * @see BusinessAccountPersistenceImpl
 * @generated
 */
public class BusinessAccountUtil {
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
	public static void clearCache(BusinessAccount businessAccount) {
		getPersistence().clearCache(businessAccount);
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
	public static List<BusinessAccount> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<BusinessAccount> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<BusinessAccount> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static BusinessAccount update(BusinessAccount businessAccount)
		throws SystemException {
		return getPersistence().update(businessAccount);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static BusinessAccount update(BusinessAccount businessAccount,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(businessAccount, serviceContext);
	}

	/**
	* Returns all the business accounts where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching business accounts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.accountmgt.model.BusinessAccount> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the business accounts where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.accountmgt.model.impl.BusinessAccountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of business accounts
	* @param end the upper bound of the range of business accounts (not inclusive)
	* @return the range of matching business accounts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.accountmgt.model.BusinessAccount> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the business accounts where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.accountmgt.model.impl.BusinessAccountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of business accounts
	* @param end the upper bound of the range of business accounts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching business accounts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.accountmgt.model.BusinessAccount> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first business account in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching business account
	* @throws org.opencps.accountmgt.NoSuchBusinessAccountException if a matching business account could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.accountmgt.model.BusinessAccount findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.accountmgt.NoSuchBusinessAccountException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first business account in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching business account, or <code>null</code> if a matching business account could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.accountmgt.model.BusinessAccount fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last business account in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching business account
	* @throws org.opencps.accountmgt.NoSuchBusinessAccountException if a matching business account could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.accountmgt.model.BusinessAccount findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.accountmgt.NoSuchBusinessAccountException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last business account in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching business account, or <code>null</code> if a matching business account could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.accountmgt.model.BusinessAccount fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the business accounts before and after the current business account in the ordered set where groupId = &#63;.
	*
	* @param businessAccountId the primary key of the current business account
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next business account
	* @throws org.opencps.accountmgt.NoSuchBusinessAccountException if a business account with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.accountmgt.model.BusinessAccount[] findByGroupId_PrevAndNext(
		long businessAccountId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.accountmgt.NoSuchBusinessAccountException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(businessAccountId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the business accounts where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of business accounts where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching business accounts
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns all the business accounts where groupId = &#63; and businessId = &#63;.
	*
	* @param groupId the group ID
	* @param businessId the business ID
	* @return the matching business accounts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.accountmgt.model.BusinessAccount> findByGroupBusiness(
		long groupId, long businessId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupBusiness(groupId, businessId);
	}

	/**
	* Returns a range of all the business accounts where groupId = &#63; and businessId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.accountmgt.model.impl.BusinessAccountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param businessId the business ID
	* @param start the lower bound of the range of business accounts
	* @param end the upper bound of the range of business accounts (not inclusive)
	* @return the range of matching business accounts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.accountmgt.model.BusinessAccount> findByGroupBusiness(
		long groupId, long businessId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupBusiness(groupId, businessId, start, end);
	}

	/**
	* Returns an ordered range of all the business accounts where groupId = &#63; and businessId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.accountmgt.model.impl.BusinessAccountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param businessId the business ID
	* @param start the lower bound of the range of business accounts
	* @param end the upper bound of the range of business accounts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching business accounts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.accountmgt.model.BusinessAccount> findByGroupBusiness(
		long groupId, long businessId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupBusiness(groupId, businessId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first business account in the ordered set where groupId = &#63; and businessId = &#63;.
	*
	* @param groupId the group ID
	* @param businessId the business ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching business account
	* @throws org.opencps.accountmgt.NoSuchBusinessAccountException if a matching business account could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.accountmgt.model.BusinessAccount findByGroupBusiness_First(
		long groupId, long businessId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.accountmgt.NoSuchBusinessAccountException {
		return getPersistence()
				   .findByGroupBusiness_First(groupId, businessId,
			orderByComparator);
	}

	/**
	* Returns the first business account in the ordered set where groupId = &#63; and businessId = &#63;.
	*
	* @param groupId the group ID
	* @param businessId the business ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching business account, or <code>null</code> if a matching business account could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.accountmgt.model.BusinessAccount fetchByGroupBusiness_First(
		long groupId, long businessId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByGroupBusiness_First(groupId, businessId,
			orderByComparator);
	}

	/**
	* Returns the last business account in the ordered set where groupId = &#63; and businessId = &#63;.
	*
	* @param groupId the group ID
	* @param businessId the business ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching business account
	* @throws org.opencps.accountmgt.NoSuchBusinessAccountException if a matching business account could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.accountmgt.model.BusinessAccount findByGroupBusiness_Last(
		long groupId, long businessId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.accountmgt.NoSuchBusinessAccountException {
		return getPersistence()
				   .findByGroupBusiness_Last(groupId, businessId,
			orderByComparator);
	}

	/**
	* Returns the last business account in the ordered set where groupId = &#63; and businessId = &#63;.
	*
	* @param groupId the group ID
	* @param businessId the business ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching business account, or <code>null</code> if a matching business account could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.accountmgt.model.BusinessAccount fetchByGroupBusiness_Last(
		long groupId, long businessId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByGroupBusiness_Last(groupId, businessId,
			orderByComparator);
	}

	/**
	* Returns the business accounts before and after the current business account in the ordered set where groupId = &#63; and businessId = &#63;.
	*
	* @param businessAccountId the primary key of the current business account
	* @param groupId the group ID
	* @param businessId the business ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next business account
	* @throws org.opencps.accountmgt.NoSuchBusinessAccountException if a business account with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.accountmgt.model.BusinessAccount[] findByGroupBusiness_PrevAndNext(
		long businessAccountId, long groupId, long businessId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.accountmgt.NoSuchBusinessAccountException {
		return getPersistence()
				   .findByGroupBusiness_PrevAndNext(businessAccountId, groupId,
			businessId, orderByComparator);
	}

	/**
	* Removes all the business accounts where groupId = &#63; and businessId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param businessId the business ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupBusiness(long groupId, long businessId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupBusiness(groupId, businessId);
	}

	/**
	* Returns the number of business accounts where groupId = &#63; and businessId = &#63;.
	*
	* @param groupId the group ID
	* @param businessId the business ID
	* @return the number of matching business accounts
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupBusiness(long groupId, long businessId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupBusiness(groupId, businessId);
	}

	/**
	* Caches the business account in the entity cache if it is enabled.
	*
	* @param businessAccount the business account
	*/
	public static void cacheResult(
		org.opencps.accountmgt.model.BusinessAccount businessAccount) {
		getPersistence().cacheResult(businessAccount);
	}

	/**
	* Caches the business accounts in the entity cache if it is enabled.
	*
	* @param businessAccounts the business accounts
	*/
	public static void cacheResult(
		java.util.List<org.opencps.accountmgt.model.BusinessAccount> businessAccounts) {
		getPersistence().cacheResult(businessAccounts);
	}

	/**
	* Creates a new business account with the primary key. Does not add the business account to the database.
	*
	* @param businessAccountId the primary key for the new business account
	* @return the new business account
	*/
	public static org.opencps.accountmgt.model.BusinessAccount create(
		long businessAccountId) {
		return getPersistence().create(businessAccountId);
	}

	/**
	* Removes the business account with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param businessAccountId the primary key of the business account
	* @return the business account that was removed
	* @throws org.opencps.accountmgt.NoSuchBusinessAccountException if a business account with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.accountmgt.model.BusinessAccount remove(
		long businessAccountId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.accountmgt.NoSuchBusinessAccountException {
		return getPersistence().remove(businessAccountId);
	}

	public static org.opencps.accountmgt.model.BusinessAccount updateImpl(
		org.opencps.accountmgt.model.BusinessAccount businessAccount)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(businessAccount);
	}

	/**
	* Returns the business account with the primary key or throws a {@link org.opencps.accountmgt.NoSuchBusinessAccountException} if it could not be found.
	*
	* @param businessAccountId the primary key of the business account
	* @return the business account
	* @throws org.opencps.accountmgt.NoSuchBusinessAccountException if a business account with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.accountmgt.model.BusinessAccount findByPrimaryKey(
		long businessAccountId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.accountmgt.NoSuchBusinessAccountException {
		return getPersistence().findByPrimaryKey(businessAccountId);
	}

	/**
	* Returns the business account with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param businessAccountId the primary key of the business account
	* @return the business account, or <code>null</code> if a business account with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.accountmgt.model.BusinessAccount fetchByPrimaryKey(
		long businessAccountId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(businessAccountId);
	}

	/**
	* Returns all the business accounts.
	*
	* @return the business accounts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.accountmgt.model.BusinessAccount> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the business accounts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.accountmgt.model.impl.BusinessAccountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of business accounts
	* @param end the upper bound of the range of business accounts (not inclusive)
	* @return the range of business accounts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.accountmgt.model.BusinessAccount> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the business accounts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.accountmgt.model.impl.BusinessAccountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of business accounts
	* @param end the upper bound of the range of business accounts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of business accounts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.accountmgt.model.BusinessAccount> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the business accounts from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of business accounts.
	*
	* @return the number of business accounts
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static BusinessAccountPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (BusinessAccountPersistence)PortletBeanLocatorUtil.locate(org.opencps.accountmgt.service.ClpSerializer.getServletContextName(),
					BusinessAccountPersistence.class.getName());

			ReferenceRegistry.registerReference(BusinessAccountUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(BusinessAccountPersistence persistence) {
	}

	private static BusinessAccountPersistence _persistence;
}