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

import org.opencps.datamgt.service.DictCollectionServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link org.opencps.datamgt.service.DictCollectionServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link org.opencps.datamgt.model.DictCollectionSoap}.
 * If the method in the service utility returns a
 * {@link org.opencps.datamgt.model.DictCollection}, that is translated to a
 * {@link org.opencps.datamgt.model.DictCollectionSoap}. Methods that SOAP cannot
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
 * @see DictCollectionServiceHttp
 * @see org.opencps.datamgt.model.DictCollectionSoap
 * @see org.opencps.datamgt.service.DictCollectionServiceUtil
 * @generated
 */
public class DictCollectionServiceSoap {
	/**
	* <p> Get DictCollection </p>
	*
	* @param groupId
	lÃ  mÃ£ UserGroup cá»§a ngÆ°á»�i Ä‘Äƒng nháº­p
	* @param collectionCode
	lÃ  mÃ£ cá»§a DictCollection
	* @return tráº£ vá»� Ä‘á»‘i tÆ°á»£ng DictCollection theo dictCollectionId
	* @throws SystemException
	Náº¿u ngoáº¡i lá»‡ há»‡ thá»‘ng xáº£y ra
	* @throws NoSuchDictCollectionException
	Khi xáº£y ra lá»—i khÃ´ng tÃ¬m tháº¥y DictCollection
	*/
	public static org.opencps.datamgt.model.DictCollectionSoap getDictCollection(
		long groupId, java.lang.String collectionCode)
		throws RemoteException {
		try {
			org.opencps.datamgt.model.DictCollection returnValue = DictCollectionServiceUtil.getDictCollection(groupId,
					collectionCode);

			return org.opencps.datamgt.model.DictCollectionSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(DictCollectionServiceSoap.class);
}