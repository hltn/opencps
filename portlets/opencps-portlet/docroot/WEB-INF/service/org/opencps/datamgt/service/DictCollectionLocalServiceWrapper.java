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
 * Provides a wrapper for {@link DictCollectionLocalService}.
 *
 * @author khoavd
 * @see DictCollectionLocalService
 * @generated
 */
public class DictCollectionLocalServiceWrapper
	implements DictCollectionLocalService,
		ServiceWrapper<DictCollectionLocalService> {
	public DictCollectionLocalServiceWrapper(
		DictCollectionLocalService dictCollectionLocalService) {
		_dictCollectionLocalService = dictCollectionLocalService;
	}

	/**
	* Adds the dict collection to the database. Also notifies the appropriate model listeners.
	*
	* @param dictCollection the dict collection
	* @return the dict collection that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.opencps.datamgt.model.DictCollection addDictCollection(
		org.opencps.datamgt.model.DictCollection dictCollection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictCollectionLocalService.addDictCollection(dictCollection);
	}

	/**
	* Creates a new dict collection with the primary key. Does not add the dict collection to the database.
	*
	* @param dictCollectionId the primary key for the new dict collection
	* @return the new dict collection
	*/
	@Override
	public org.opencps.datamgt.model.DictCollection createDictCollection(
		long dictCollectionId) {
		return _dictCollectionLocalService.createDictCollection(dictCollectionId);
	}

	/**
	* Deletes the dict collection with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dictCollectionId the primary key of the dict collection
	* @return the dict collection that was removed
	* @throws PortalException if a dict collection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.opencps.datamgt.model.DictCollection deleteDictCollection(
		long dictCollectionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dictCollectionLocalService.deleteDictCollection(dictCollectionId);
	}

	/**
	* Deletes the dict collection from the database. Also notifies the appropriate model listeners.
	*
	* @param dictCollection the dict collection
	* @return the dict collection that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.opencps.datamgt.model.DictCollection deleteDictCollection(
		org.opencps.datamgt.model.DictCollection dictCollection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictCollectionLocalService.deleteDictCollection(dictCollection);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dictCollectionLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictCollectionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _dictCollectionLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictCollectionLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictCollectionLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictCollectionLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.opencps.datamgt.model.DictCollection fetchDictCollection(
		long dictCollectionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictCollectionLocalService.fetchDictCollection(dictCollectionId);
	}

	/**
	* Returns the dict collection with the primary key.
	*
	* @param dictCollectionId the primary key of the dict collection
	* @return the dict collection
	* @throws PortalException if a dict collection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	* @throws org.opencps.datamgt.NoSuchDictCollectionException
	*/
	@Override
	public org.opencps.datamgt.model.DictCollection getDictCollection(
		long dictCollectionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			org.opencps.datamgt.NoSuchDictCollectionException {
		return _dictCollectionLocalService.getDictCollection(dictCollectionId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dictCollectionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dict collections.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.datamgt.model.impl.DictCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dict collections
	* @param end the upper bound of the range of dict collections (not inclusive)
	* @return the range of dict collections
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.opencps.datamgt.model.DictCollection> getDictCollections(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictCollectionLocalService.getDictCollections(start, end);
	}

	/**
	* Returns the number of dict collections.
	*
	* @return the number of dict collections
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDictCollectionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictCollectionLocalService.getDictCollectionsCount();
	}

	/**
	* Updates the dict collection in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dictCollection the dict collection
	* @return the dict collection that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.opencps.datamgt.model.DictCollection updateDictCollection(
		org.opencps.datamgt.model.DictCollection dictCollection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictCollectionLocalService.updateDictCollection(dictCollection);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dictCollectionLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dictCollectionLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dictCollectionLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* <p> Add DictCollection </p>
	*
	* @param userId
	lÃƒÂ  id cÃ¡Â»Â§a ngÃ†Â°Ã¡Â»ï¿½i Ã„â€˜Ã„Æ’ng nhÃ¡ÂºÂ­p
	* @param collectionCode
	lÃƒÂ  thuÃ¡Â»â„¢c tÃƒÂ­nh mÃƒÂ£ cÃ¡Â»Â§a DictCollection
	* @param collectionName
	lÃƒÂ  thuÃ¡Â»â„¢c tÃƒÂ­nh tÃƒÂªn cÃ¡Â»Â§a DictCollection
	* @param serviceContext
	CÃƒÂ³ thÃ¡Â»Æ’ lÃ¡ÂºÂ¥y ra cÃƒÂ¡c userId, GroupId, CompanyId
	* @param description
	MÃƒÂ´ tÃ¡ÂºÂ£
	* @return trÃ¡ÂºÂ£ vÃ¡Â»ï¿½ Ã„â€˜Ã¡Â»â€˜i tÃ†Â°Ã¡Â»Â£ng DictCollection
	* @throws SystemException
	NÃ¡ÂºÂ¿u ngoÃ¡ÂºÂ¡i lÃ¡Â»â€¡ hÃ¡Â»â€¡ thÃ¡Â»â€˜ng xÃ¡ÂºÂ£y ra
	*/
	@Override
	public org.opencps.datamgt.model.DictCollection addDictCollection(
		long userId, java.lang.String collectionCode,
		java.util.Map<java.util.Locale, java.lang.String> collectionNameMap,
		java.lang.String description,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictCollectionLocalService.addDictCollection(userId,
			collectionCode, collectionNameMap, description, serviceContext);
	}

	/**
	* @return
	* @throws SystemException
	*/
	@Override
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictCollectionLocalService.countAll();
	}

	/**
	* @param groupId
	* @param collectionNames
	* @return
	* @throws SystemException
	*/
	@Override
	public int countDictCollection(long groupId,
		java.lang.String[] collectionNames)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictCollectionLocalService.countDictCollection(groupId,
			collectionNames);
	}

	/**
	* <p> Xoa ban ghi DictCollection. Kiem tra truong hop neu ton tai ban ghi
	* lien quan trong bang DictVersion va DictItem thi khong xoa </p>
	*
	* @param dictCollectionId
	lÃƒÂ  DictCollection
	* @throws SystemException
	NÃ¡ÂºÂ¿u ngoÃ¡ÂºÂ¡i lÃ¡Â»â€¡ hÃ¡Â»â€¡ thÃ¡Â»â€˜ng xÃ¡ÂºÂ£y ra
	* @throws NoSuchDictCollectionException
	Khi xÃ¡ÂºÂ£y ra lÃ¡Â»â€”i khÃƒÂ´ng tÃƒÂ¬m thÃ¡ÂºÂ¥y DictCollection
	*/
	@Override
	public void deleteCollection(long dictCollectionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.datamgt.NoSuchDictCollectionException {
		_dictCollectionLocalService.deleteCollection(dictCollectionId);
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
		return _dictCollectionLocalService.getDictCollection(groupId,
			collectionCode);
	}

	/**
	* <p> Lay tat ca doi tuong DictCollection trong CSDL </p>
	*
	* @return trÃ¡ÂºÂ£ vÃ¡Â»ï¿½ tÃ¡ÂºÂ­p hÃ¡Â»Â£p cÃƒÂ¡c Ã„â€˜Ã¡Â»â€˜i tÃ†Â°Ã¡Â»Â£ng DictCollection
	* @throws SystemException
	NÃ¡ÂºÂ¿u ngoÃ¡ÂºÂ¡i lÃ¡Â»â€¡ hÃ¡Â»â€¡ thÃ¡Â»â€˜ng xÃ¡ÂºÂ£y ra
	* @throws SystemException
	NÃ¡ÂºÂ¿u ngoÃ¡ÂºÂ¡i lÃ¡Â»â€¡ hÃ¡Â»â€¡ thÃ¡Â»â€˜ng xÃ¡ÂºÂ£y ra
	*/
	@Override
	public java.util.List<org.opencps.datamgt.model.DictCollection> getDictCollections()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictCollectionLocalService.getDictCollections();
	}

	/**
	* @param start
	* @param end
	* @param odc
	* @return
	* @throws SystemException
	*/
	@Override
	public java.util.List<org.opencps.datamgt.model.DictCollection> getDictCollections(
		int start, int end, com.liferay.portal.kernel.util.OrderByComparator odc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictCollectionLocalService.getDictCollections(start, end, odc);
	}

	/**
	* <p> Lay tat doi tuong DictCollection </p>
	*
	* @param groupId
	lÃƒÂ  id cÃ¡Â»Â§a UserGroup
	* @return trÃ¡ÂºÂ£ vÃ¡Â»ï¿½ Ã„â€˜Ã¡Â»â€˜i tÃ†Â°Ã¡Â»Â£ng DictCollection theo groupId
	* @throws SystemException
	NÃ¡ÂºÂ¿u ngoÃ¡ÂºÂ¡i lÃ¡Â»â€¡ hÃ¡Â»â€¡ thÃ¡Â»â€˜ng xÃ¡ÂºÂ£y ra
	*/
	@Override
	public java.util.List<org.opencps.datamgt.model.DictCollection> getDictCollections(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictCollectionLocalService.getDictCollections(groupId);
	}

	/**
	* @param groupId
	* @param collectionNames
	* @param start
	* @param end
	* @param odc
	* @return
	* @throws SystemException
	*/
	@Override
	public java.util.List<org.opencps.datamgt.model.DictCollection> getDictCollections(
		long groupId, java.lang.String[] collectionNames, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator odc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dictCollectionLocalService.getDictCollections(groupId,
			collectionNames, start, end, odc);
	}

	/**
	* <p> Cap nhat DictCollection </p>
	*
	* @param dictCollectionId
	lÃƒÂ  id cÃ¡Â»Â§a DictCollection
	* @param userId
	lÃƒÂ  id cÃ¡Â»Â§a ngÃ†Â°Ã¡Â»ï¿½i Ã„â€˜Ã„Æ’ng nhÃ¡ÂºÂ­p
	* @param collectionCode
	lÃƒÂ  thuÃ¡Â»â„¢c tÃƒÂ­nh mÃƒÂ£ cÃ¡Â»Â§a DictCollection
	* @param collectionName
	lÃƒÂ  thuÃ¡Â»â„¢c tÃƒÂ­nh tÃƒÂªn cÃ¡Â»Â§a DictCollection
	* @param serviceContext
	CÃƒÂ³ thÃ¡Â»Æ’ lÃ¡ÂºÂ¥y ra cÃƒÂ¡c userId, GroupId, CompanyId
	* @param description
	MÃƒÂ´ tÃ¡ÂºÂ£
	* @return trÃ¡ÂºÂ£ vÃ¡Â»ï¿½ Ã„â€˜Ã¡Â»â€˜i tÃ†Â°Ã¡Â»Â£ng DictCollection
	* @throws SystemException
	NÃ¡ÂºÂ¿u ngoÃ¡ÂºÂ¡i lÃ¡Â»â€¡ hÃ¡Â»â€¡ thÃ¡Â»â€˜ng xÃ¡ÂºÂ£y ra
	* @throws NoSuchDictCollectionException
	Khi xÃ¡ÂºÂ£y ra lÃ¡Â»â€”i khÃƒÂ´ng tÃƒÂ¬m thÃ¡ÂºÂ¥y DictCollection
	*/
	@Override
	public org.opencps.datamgt.model.DictCollection updateDictCollection(
		long dictCollectionId, long userId, java.lang.String collectionCode,
		java.util.Map<java.util.Locale, java.lang.String> collectionNameMap,
		java.lang.String description,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.datamgt.NoSuchDictCollectionException {
		return _dictCollectionLocalService.updateDictCollection(dictCollectionId,
			userId, collectionCode, collectionNameMap, description,
			serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DictCollectionLocalService getWrappedDictCollectionLocalService() {
		return _dictCollectionLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDictCollectionLocalService(
		DictCollectionLocalService dictCollectionLocalService) {
		_dictCollectionLocalService = dictCollectionLocalService;
	}

	@Override
	public DictCollectionLocalService getWrappedService() {
		return _dictCollectionLocalService;
	}

	@Override
	public void setWrappedService(
		DictCollectionLocalService dictCollectionLocalService) {
		_dictCollectionLocalService = dictCollectionLocalService;
	}

	private DictCollectionLocalService _dictCollectionLocalService;
}