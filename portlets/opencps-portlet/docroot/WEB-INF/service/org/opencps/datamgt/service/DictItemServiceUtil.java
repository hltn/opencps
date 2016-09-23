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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for DictItem. This utility wraps
 * {@link org.opencps.datamgt.service.impl.DictItemServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author khoavd
 * @see DictItemService
 * @see org.opencps.datamgt.service.base.DictItemServiceBaseImpl
 * @see org.opencps.datamgt.service.impl.DictItemServiceImpl
 * @generated
 */
public class DictItemServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.opencps.datamgt.service.impl.DictItemServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static org.opencps.datamgt.model.DictItem addDictItem(
		java.lang.String dictCollectionCode, java.lang.String dictItemCode,
		java.lang.String dictItemName, java.lang.String parentDictItemCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addDictItem(dictCollectionCode, dictItemCode, dictItemName,
			parentDictItemCode);
	}

	public static org.opencps.datamgt.model.DictItem addDictItem(
		java.lang.String dictCollectionCode, java.lang.String dictItemCode,
		java.lang.String dictItemName, java.lang.String dictItemDescription,
		java.lang.String parentDictItemCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addDictItem(dictCollectionCode, dictItemCode, dictItemName,
			dictItemDescription, parentDictItemCode);
	}

	public static org.opencps.datamgt.model.DictItem updateDictItem(
		java.lang.String dictCollectionCode, java.lang.String dictItemCode,
		java.lang.String dictItemName, java.lang.String parentDictItemCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateDictItem(dictCollectionCode, dictItemCode,
			dictItemName, parentDictItemCode);
	}

	public static org.opencps.datamgt.model.DictItem updateDictItem(
		java.lang.String dictCollectionCode, java.lang.String dictItemCode,
		java.lang.String dictItemName, java.lang.String dictItemDescription,
		java.lang.String parentDictItemCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateDictItem(dictCollectionCode, dictItemCode,
			dictItemName, dictItemDescription, parentDictItemCode);
	}

	public static void deleteDictItem(java.lang.String dictCollectionCode,
		java.lang.String dictItemCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDictItem(dictCollectionCode, dictItemCode);
	}

	public static org.opencps.datamgt.model.DictItem getDictItem(
		long dictItemId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDictItem(dictItemId);
	}

	public static org.opencps.datamgt.model.DictItem getDictItemInuseByItemCode(
		long dictCollectionId, java.lang.String itemCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getDictItemInuseByItemCode(dictCollectionId, itemCode);
	}

	public static java.util.List<org.opencps.datamgt.model.DictItem> getDictItemsByParentItemId(
		long parentItemId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDictItemsByParentItemId(parentItemId);
	}

	public static java.util.List<org.opencps.datamgt.model.DictItem> getDictItemsByDictCollectionId(
		long dictCollectionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDictItemsByDictCollectionId(dictCollectionId);
	}

	public static java.util.List<org.opencps.datamgt.model.DictItem> getDictItemsInUseByDictCollectionIdAndParentItemId(
		long dictCollectionId, long parentItemId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getDictItemsInUseByDictCollectionIdAndParentItemId(dictCollectionId,
			parentItemId);
	}

	public static com.liferay.portal.kernel.json.JSONObject getDictItemsInUseByDictCollectionIdAndParentItemIdDataSource(
		long dictCollectionId, long parentItemId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getDictItemsInUseByDictCollectionIdAndParentItemIdDataSource(dictCollectionId,
			parentItemId);
	}

	public static com.liferay.portal.kernel.json.JSONObject getDictItemsByItemCodeDataSource(
		java.lang.String collectionCode, java.lang.String itemCode, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getDictItemsByItemCodeDataSource(collectionCode, itemCode,
			groupId);
	}

	public static com.liferay.portal.kernel.json.JSONObject getDictItemsByItemCodeDataSourceFitter(
		java.lang.String collectionCode, java.lang.String itemCode,
		java.lang.String keywords, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getDictItemsByItemCodeDataSourceFitter(collectionCode,
			itemCode, keywords, groupId);
	}

	public static void clearService() {
		_service = null;
	}

	public static DictItemService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DictItemService.class.getName());

			if (invokableService instanceof DictItemService) {
				_service = (DictItemService)invokableService;
			}
			else {
				_service = new DictItemServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(DictItemServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(DictItemService service) {
	}

	private static DictItemService _service;
}