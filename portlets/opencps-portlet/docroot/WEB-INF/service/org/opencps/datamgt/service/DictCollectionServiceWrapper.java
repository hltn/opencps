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
 * Provides a wrapper for {@link DictCollectionService}.
 *
 * @author khoavd
 * @see DictCollectionService
 * @generated
 */
public class DictCollectionServiceWrapper implements DictCollectionService,
	ServiceWrapper<DictCollectionService> {
	public DictCollectionServiceWrapper(
		DictCollectionService dictCollectionService) {
		_dictCollectionService = dictCollectionService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dictCollectionService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dictCollectionService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dictCollectionService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* <p> Get DictCollection </p>
	*
	* @param groupId
	lÃƒÂ  mÃƒÂ£ UserGroup cÃ¡Â»Â§a ngÃ†Â°Ã¡Â»ï¿½i Ã„â€˜Ã„Æ’ng nhÃ¡ÂºÂ­p
	* @param collectionCode
	lÃƒÂ  mÃƒÂ£ cÃ¡Â»Â§a DictCollection
	* @return trÃ¡ÂºÂ£ vÃ¡Â»ï¿½ Ã„â€˜Ã¡Â»â€˜i tÃ†Â°Ã¡Â»Â£ng DictCollection theo dictCollectionId
	* @throws SystemException
	NÃ¡ÂºÂ¿u ngoÃ¡ÂºÂ¡i lÃ¡Â»â€¡ hÃ¡Â»â€¡ thÃ¡Â»â€˜ng xÃ¡ÂºÂ£y ra
	* @throws NoSuchDictCollectionException
	Khi xÃ¡ÂºÂ£y ra lÃ¡Â»â€”i khÃƒÂ´ng tÃƒÂ¬m thÃ¡ÂºÂ¥y DictCollection
	*/
	@Override
	public org.opencps.datamgt.model.DictCollection getDictCollection(
		long groupId, java.lang.String collectionCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.datamgt.NoSuchDictCollectionException {
		return _dictCollectionService.getDictCollection(groupId, collectionCode);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DictCollectionService getWrappedDictCollectionService() {
		return _dictCollectionService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDictCollectionService(
		DictCollectionService dictCollectionService) {
		_dictCollectionService = dictCollectionService;
	}

	@Override
	public DictCollectionService getWrappedService() {
		return _dictCollectionService;
	}

	@Override
	public void setWrappedService(DictCollectionService dictCollectionService) {
		_dictCollectionService = dictCollectionService;
	}

	private DictCollectionService _dictCollectionService;
}