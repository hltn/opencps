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

package org.opencps.datamgt.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.security.ac.AccessControlled;
import com.liferay.portal.service.BaseService;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service interface for DictItem. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author khoavd
 * @see DictItemServiceUtil
 * @see org.opencps.datamgt.service.base.DictItemServiceBaseImpl
 * @see org.opencps.datamgt.service.impl.DictItemServiceImpl
 * @generated
 */
@AccessControlled
@JSONWebService
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface DictItemService extends BaseService, InvokableService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DictItemServiceUtil} to access the dict item remote service. Add custom service methods to {@link org.opencps.datamgt.service.impl.DictItemServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable;

	@com.liferay.portal.kernel.jsonwebservice.JSONWebService(value = "add-dictitem", method = "POST")
	public org.opencps.datamgt.model.DictItem addDictItem(
		java.lang.String dictCollectionCode, java.lang.String dictItemCode,
		java.lang.String dictItemName, java.lang.String parentDictItemCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@com.liferay.portal.kernel.jsonwebservice.JSONWebService(value = "add-dictitem", method = "POST")
	public org.opencps.datamgt.model.DictItem addDictItem(
		java.lang.String dictCollectionCode, java.lang.String dictItemCode,
		java.lang.String dictItemName, java.lang.String dictItemDescription,
		java.lang.String parentDictItemCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@com.liferay.portal.kernel.jsonwebservice.JSONWebService(value = "update-dictitem", method = "POST")
	public org.opencps.datamgt.model.DictItem updateDictItem(
		java.lang.String dictCollectionCode, java.lang.String dictItemCode,
		java.lang.String dictItemName, java.lang.String parentDictItemCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@com.liferay.portal.kernel.jsonwebservice.JSONWebService(value = "update-dictitem", method = "POST")
	public org.opencps.datamgt.model.DictItem updateDictItem(
		java.lang.String dictCollectionCode, java.lang.String dictItemCode,
		java.lang.String dictItemName, java.lang.String dictItemDescription,
		java.lang.String parentDictItemCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@com.liferay.portal.kernel.jsonwebservice.JSONWebService(value = "delete-dictitem", method = "POST")
	public void deleteDictItem(java.lang.String dictCollectionCode,
		java.lang.String dictItemCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@com.liferay.portal.kernel.jsonwebservice.JSONWebService(value = "get-dictitem-by-pk")
	@com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.opencps.datamgt.model.DictItem getDictItem(long dictItemId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@com.liferay.portal.kernel.jsonwebservice.JSONWebService(value = "get-dictitem-inuse-by-code")
	@com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.opencps.datamgt.model.DictItem getDictItemInuseByItemCode(
		long dictCollectionId, java.lang.String itemCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@com.liferay.portal.kernel.jsonwebservice.JSONWebService(value = "get-dictitems-by-parentId")
	@com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.opencps.datamgt.model.DictItem> getDictItemsByParentItemId(
		long parentItemId)
		throws com.liferay.portal.kernel.exception.SystemException;

	@com.liferay.portal.kernel.jsonwebservice.JSONWebService(value = "get-dictitems-by-dictcollectionId")
	@com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.opencps.datamgt.model.DictItem> getDictItemsByDictCollectionId(
		long dictCollectionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	@com.liferay.portal.kernel.jsonwebservice.JSONWebService(value = "get-dictitems-inuse-by-dictcollectionId_parentItemId")
	@com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.opencps.datamgt.model.DictItem> getDictItemsInUseByDictCollectionIdAndParentItemId(
		long dictCollectionId, long parentItemId)
		throws com.liferay.portal.kernel.exception.SystemException;

	@com.liferay.portal.kernel.jsonwebservice.JSONWebService(value = "get-dictitems-inuse-by-dictcollectionId_parentItemId_datasource")
	@com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.kernel.json.JSONObject getDictItemsInUseByDictCollectionIdAndParentItemIdDataSource(
		long dictCollectionId, long parentItemId)
		throws com.liferay.portal.kernel.exception.SystemException;

	@com.liferay.portal.kernel.jsonwebservice.JSONWebService(value = "get-dictitems_itemCode_datasource")
	@com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.kernel.json.JSONObject getDictItemsByItemCodeDataSource(
		java.lang.String collectionCode, java.lang.String itemCode, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;
}