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

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DictItemService}.
 *
 * @author khoavd
 * @see DictItemService
 * @generated
 */
public class DictItemServiceWrapper implements DictItemService,
	ServiceWrapper<DictItemService> {
	public DictItemServiceWrapper(DictItemService dictItemService) {
		_dictItemService = dictItemService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dictItemService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dictItemService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dictItemService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public org.opencps.datamgt.model.DictItem addDictItem(
		java.lang.String dictCollectionCode, java.lang.String dictItemCode,
		java.lang.String dictItemName, java.lang.String parentDictItemCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dictItemService.addDictItem(dictCollectionCode, dictItemCode,
			dictItemName, parentDictItemCode);
	}

	@Override
	public org.opencps.datamgt.model.DictItem addDictItem(
		java.lang.String dictCollectionCode, java.lang.String dictItemCode,
		java.lang.String dictItemName, java.lang.String dictItemDescription,
		java.lang.String parentDictItemCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dictItemService.addDictItem(dictCollectionCode, dictItemCode,
			dictItemName, dictItemDescription, parentDictItemCode);
	}

	@Override
	public org.opencps.datamgt.model.DictItem updateDictItem(
		java.lang.String dictCollectionCode, java.lang.String dictItemCode,
		java.lang.String dictItemName, java.lang.String parentDictItemCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dictItemService.updateDictItem(dictCollectionCode,
			dictItemCode, dictItemName, parentDictItemCode);
	}

	@Override
	public org.opencps.datamgt.model.DictItem updateDictItem(
		java.lang.String dictCollectionCode, java.lang.String dictItemCode,
		java.lang.String dictItemName, java.lang.String dictItemDescription,
		java.lang.String parentDictItemCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dictItemService.updateDictItem(dictCollectionCode,
			dictItemCode, dictItemName, dictItemDescription, parentDictItemCode);
	}

	@Override
	public void deleteDictItem(java.lang.String dictCollectionCode,
		java.lang.String dictItemCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dictItemService.deleteDictItem(dictCollectionCode, dictItemCode);
	}

	@Override
	public org.opencps.datamgt.model.DictItem getDictItem(long dictItemId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dictItemService.getDictItem(dictItemId);
	}

	@Override
	public org.opencps.datamgt.model.DictItem getDictItemInuseByItemCode(
		long dictCollectionId, java.lang.String itemCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dictItemService.getDictItemInuseByItemCode(dictCollectionId,
			itemCode);
	}

	@Override
	public java.util.List<org.opencps.datamgt.model.DictItem> getDictItemsByParentItemId(
		long parentItemId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictItemService.getDictItemsByParentItemId(parentItemId);
	}

	@Override
	public java.util.List<org.opencps.datamgt.model.DictItem> getDictItemsByDictCollectionId(
		long dictCollectionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictItemService.getDictItemsByDictCollectionId(dictCollectionId);
	}

	@Override
	public java.util.List<org.opencps.datamgt.model.DictItem> getDictItemsInUseByDictCollectionIdAndParentItemId(
		long dictCollectionId, long parentItemId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictItemService.getDictItemsInUseByDictCollectionIdAndParentItemId(dictCollectionId,
			parentItemId);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONObject getDictItemsInUseByDictCollectionIdAndParentItemIdDataSource(
		long dictCollectionId, long parentItemId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictItemService.getDictItemsInUseByDictCollectionIdAndParentItemIdDataSource(dictCollectionId,
			parentItemId);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONObject getDictItemsByItemCodeDataSource(
		java.lang.String collectionCode, java.lang.String itemCode, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dictItemService.getDictItemsByItemCodeDataSource(collectionCode,
			itemCode, groupId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DictItemService getWrappedDictItemService() {
		return _dictItemService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDictItemService(DictItemService dictItemService) {
		_dictItemService = dictItemService;
	}

	@Override
	public DictItemService getWrappedService() {
		return _dictItemService;
	}

	@Override
	public void setWrappedService(DictItemService dictItemService) {
		_dictItemService = dictItemService;
	}

	private DictItemService _dictItemService;
}