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

package org.opencps.datamgt.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import org.opencps.datamgt.service.DictItemServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link org.opencps.datamgt.service.DictItemServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link org.opencps.datamgt.model.DictItemSoap}.
 * If the method in the service utility returns a
 * {@link org.opencps.datamgt.model.DictItem}, that is translated to a
 * {@link org.opencps.datamgt.model.DictItemSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author khoavd
 * @see DictItemServiceHttp
 * @see org.opencps.datamgt.model.DictItemSoap
 * @see org.opencps.datamgt.service.DictItemServiceUtil
 * @generated
 */
public class DictItemServiceSoap {
	public static org.opencps.datamgt.model.DictItemSoap addDictItem(
		java.lang.String dictCollectionCode, java.lang.String dictItemCode,
		java.lang.String dictItemName, java.lang.String parentDictItemCode)
		throws RemoteException {
		try {
			org.opencps.datamgt.model.DictItem returnValue = DictItemServiceUtil.addDictItem(dictCollectionCode,
					dictItemCode, dictItemName, parentDictItemCode);

			return org.opencps.datamgt.model.DictItemSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static org.opencps.datamgt.model.DictItemSoap addDictItem(
		java.lang.String dictCollectionCode, java.lang.String dictItemCode,
		java.lang.String dictItemName, java.lang.String dictItemDescription,
		java.lang.String parentDictItemCode) throws RemoteException {
		try {
			org.opencps.datamgt.model.DictItem returnValue = DictItemServiceUtil.addDictItem(dictCollectionCode,
					dictItemCode, dictItemName, dictItemDescription,
					parentDictItemCode);

			return org.opencps.datamgt.model.DictItemSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static org.opencps.datamgt.model.DictItemSoap updateDictItem(
		java.lang.String dictCollectionCode, java.lang.String dictItemCode,
		java.lang.String dictItemName, java.lang.String parentDictItemCode)
		throws RemoteException {
		try {
			org.opencps.datamgt.model.DictItem returnValue = DictItemServiceUtil.updateDictItem(dictCollectionCode,
					dictItemCode, dictItemName, parentDictItemCode);

			return org.opencps.datamgt.model.DictItemSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static org.opencps.datamgt.model.DictItemSoap updateDictItem(
		java.lang.String dictCollectionCode, java.lang.String dictItemCode,
		java.lang.String dictItemName, java.lang.String dictItemDescription,
		java.lang.String parentDictItemCode) throws RemoteException {
		try {
			org.opencps.datamgt.model.DictItem returnValue = DictItemServiceUtil.updateDictItem(dictCollectionCode,
					dictItemCode, dictItemName, dictItemDescription,
					parentDictItemCode);

			return org.opencps.datamgt.model.DictItemSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteDictItem(java.lang.String dictCollectionCode,
		java.lang.String dictItemCode) throws RemoteException {
		try {
			DictItemServiceUtil.deleteDictItem(dictCollectionCode, dictItemCode);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static org.opencps.datamgt.model.DictItemSoap getDictItem(
		long dictItemId) throws RemoteException {
		try {
			org.opencps.datamgt.model.DictItem returnValue = DictItemServiceUtil.getDictItem(dictItemId);

			return org.opencps.datamgt.model.DictItemSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static org.opencps.datamgt.model.DictItemSoap getDictItemInuseByItemCode(
		long dictCollectionId, java.lang.String itemCode)
		throws RemoteException {
		try {
			org.opencps.datamgt.model.DictItem returnValue = DictItemServiceUtil.getDictItemInuseByItemCode(dictCollectionId,
					itemCode);

			return org.opencps.datamgt.model.DictItemSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static org.opencps.datamgt.model.DictItemSoap[] getDictItemsByParentItemId(
		long parentItemId) throws RemoteException {
		try {
			java.util.List<org.opencps.datamgt.model.DictItem> returnValue = DictItemServiceUtil.getDictItemsByParentItemId(parentItemId);

			return org.opencps.datamgt.model.DictItemSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static org.opencps.datamgt.model.DictItemSoap[] getDictItemsByDictCollectionId(
		long dictCollectionId) throws RemoteException {
		try {
			java.util.List<org.opencps.datamgt.model.DictItem> returnValue = DictItemServiceUtil.getDictItemsByDictCollectionId(dictCollectionId);

			return org.opencps.datamgt.model.DictItemSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static org.opencps.datamgt.model.DictItemSoap[] getDictItemsInUseByDictCollectionIdAndParentItemId(
		long dictCollectionId, long parentItemId) throws RemoteException {
		try {
			java.util.List<org.opencps.datamgt.model.DictItem> returnValue = DictItemServiceUtil.getDictItemsInUseByDictCollectionIdAndParentItemId(dictCollectionId,
					parentItemId);

			return org.opencps.datamgt.model.DictItemSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String getDictItemsInUseByDictCollectionIdAndParentItemIdDataSource(
		long dictCollectionId, long parentItemId) throws RemoteException {
		try {
			com.liferay.portal.kernel.json.JSONObject returnValue = DictItemServiceUtil.getDictItemsInUseByDictCollectionIdAndParentItemIdDataSource(dictCollectionId,
					parentItemId);

			return returnValue.toString();
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String getDictItemsByItemCodeDataSource(
		java.lang.String collectionCode, java.lang.String itemCode, long groupId)
		throws RemoteException {
		try {
			com.liferay.portal.kernel.json.JSONObject returnValue = DictItemServiceUtil.getDictItemsByItemCodeDataSource(collectionCode,
					itemCode, groupId);

			return returnValue.toString();
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String getDictItemsByItemCodeDataSourceFitter(
		java.lang.String collectionCode, java.lang.String itemCode,
		java.lang.String keywords, long groupId) throws RemoteException {
		try {
			com.liferay.portal.kernel.json.JSONObject returnValue = DictItemServiceUtil.getDictItemsByItemCodeDataSourceFitter(collectionCode,
					itemCode, keywords, groupId);

			return returnValue.toString();
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(DictItemServiceSoap.class);
}