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
 * Provides the remote service interface for DictCollection. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author khoavd
 * @see DictCollectionServiceUtil
 * @see org.opencps.datamgt.service.base.DictCollectionServiceBaseImpl
 * @see org.opencps.datamgt.service.impl.DictCollectionServiceImpl
 * @generated
 */
@AccessControlled
@JSONWebService
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface DictCollectionService extends BaseService, InvokableService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DictCollectionServiceUtil} to access the dict collection remote service. Add custom service methods to {@link org.opencps.datamgt.service.impl.DictCollectionServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
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
	@com.liferay.portal.kernel.jsonwebservice.JSONWebService(value = "get-dictcollection-by-gc")
	@com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.opencps.datamgt.model.DictCollection getDictCollection(
		long groupId, java.lang.String collectionCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.datamgt.NoSuchDictCollectionException;
}