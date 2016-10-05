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
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for DictVersion. This utility wraps
 * {@link org.opencps.datamgt.service.impl.DictVersionLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author khoavd
 * @see DictVersionLocalService
 * @see org.opencps.datamgt.service.base.DictVersionLocalServiceBaseImpl
 * @see org.opencps.datamgt.service.impl.DictVersionLocalServiceImpl
 * @generated
 */
public class DictVersionLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.opencps.datamgt.service.impl.DictVersionLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the dict version to the database. Also notifies the appropriate model listeners.
	*
	* @param dictVersion the dict version
	* @return the dict version that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.datamgt.model.DictVersion addDictVersion(
		org.opencps.datamgt.model.DictVersion dictVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDictVersion(dictVersion);
	}

	/**
	* Creates a new dict version with the primary key. Does not add the dict version to the database.
	*
	* @param dictVersionId the primary key for the new dict version
	* @return the new dict version
	*/
	public static org.opencps.datamgt.model.DictVersion createDictVersion(
		long dictVersionId) {
		return getService().createDictVersion(dictVersionId);
	}

	/**
	* Deletes the dict version with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dictVersionId the primary key of the dict version
	* @return the dict version that was removed
	* @throws PortalException if a dict version with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.datamgt.model.DictVersion deleteDictVersion(
		long dictVersionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDictVersion(dictVersionId);
	}

	/**
	* Deletes the dict version from the database. Also notifies the appropriate model listeners.
	*
	* @param dictVersion the dict version
	* @return the dict version that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.datamgt.model.DictVersion deleteDictVersion(
		org.opencps.datamgt.model.DictVersion dictVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDictVersion(dictVersion);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.datamgt.model.impl.DictVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.datamgt.model.impl.DictVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static org.opencps.datamgt.model.DictVersion fetchDictVersion(
		long dictVersionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDictVersion(dictVersionId);
	}

	/**
	* Returns the dict version with the primary key.
	*
	* @param dictVersionId the primary key of the dict version
	* @return the dict version
	* @throws PortalException if a dict version with the primary key could not be found
	* @throws SystemException if a system exception occurred
	* @throws org.opencps.datamgt.NoSuchDictVersionException
	*/
	public static org.opencps.datamgt.model.DictVersion getDictVersion(
		long dictVersionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			org.opencps.datamgt.NoSuchDictVersionException {
		return getService().getDictVersion(dictVersionId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dict versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.datamgt.model.impl.DictVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dict versions
	* @param end the upper bound of the range of dict versions (not inclusive)
	* @return the range of dict versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.datamgt.model.DictVersion> getDictVersions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDictVersions(start, end);
	}

	/**
	* Returns the number of dict versions.
	*
	* @return the number of dict versions
	* @throws SystemException if a system exception occurred
	*/
	public static int getDictVersionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDictVersionsCount();
	}

	/**
	* Updates the dict version in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dictVersion the dict version
	* @return the dict version that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.datamgt.model.DictVersion updateDictVersion(
		org.opencps.datamgt.model.DictVersion dictVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDictVersion(dictVersion);
	}

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

	/**
	* <p>
	* Add DictVersion
	* </p>
	*
	* @param userId
	lÃƒÂ  id cÃ¡Â»Â§a ngÃ†Â°Ã¡Â»ï¿½i Ã„â€˜Ã„Æ’ng nhÃ¡ÂºÂ­p
	* @param dictCollection
	lÃƒÂ  Ã„â€˜Ã¡Â»â€˜i tÃ†Â°Ã¡Â»Â£ng DictCollection
	* @param version
	lÃƒÂ  thuÃ¡Â»â„¢c tÃƒÂ­nh phiÃƒÂªn bÃ¡ÂºÂ£n cÃ¡Â»Â§a DictVersion
	* @param serviceContext
	CÃƒÂ³ thÃ¡Â»Æ’ lÃ¡ÂºÂ¥y ra cÃƒÂ¡c userId, GroupId, CompanyId
	* @param validatedFrom
	NgÃƒÂ y phÃƒÂª bÃ¡ÂºÂ¯t Ã„â€˜Ã¡ÂºÂ§u phÃƒÂª duyÃ¡Â»â€¡t
	* @param validatedTo
	NgÃƒÂ y kÃ¡ÂºÂ¿t thÃƒÂºc phÃƒÂª duyÃ¡Â»â€¡t
	* @param description
	MÃƒÂ´ tÃ¡ÂºÂ£
	* @return trÃ¡ÂºÂ£ vÃ¡Â»ï¿½ Ã„â€˜Ã¡Â»â€˜i tÃ†Â°Ã¡Â»Â£ng DictVersion
	* @throws SystemException
	NÃ¡ÂºÂ¿u ngoÃ¡ÂºÂ¡i lÃ¡Â»â€¡ hÃ¡Â»â€¡ thÃ¡Â»â€˜ng xÃ¡ÂºÂ£y ra
	* @throws ExistDraftException
	*/
	public static org.opencps.datamgt.model.DictVersion addDictVersion(
		long userId, org.opencps.datamgt.model.DictCollection dictCollection,
		java.lang.String version, java.lang.String description,
		java.util.Date validatedFrom, java.util.Date validatedTo,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.datamgt.ExistDraftException {
		return getService()
				   .addDictVersion(userId, dictCollection, version,
			description, validatedFrom, validatedTo, serviceContext);
	}

	/**
	* <p>
	* Delete DictVersion
	* </p>
	*
	* @param dictVersionId
	lÃƒÂ  id cuÃ¡ÂºÂ£ DictVersion
	* @throws SystemException
	NÃ¡ÂºÂ¿u ngoÃ¡ÂºÂ¡i lÃ¡Â»â€¡ hÃ¡Â»â€¡ thÃ¡Â»â€˜ng xÃ¡ÂºÂ£y ra
	* @throws NoSuchDictVersionException
	Khi xÃ¡ÂºÂ£y ra lÃ¡Â»â€”i khÃƒÂ´ng tÃƒÂ¬m thÃ¡ÂºÂ¥y DictVersion
	*/
	public static void deleteDictVersionByDictVersionId(long dictVersionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.datamgt.NoSuchDictVersionException {
		getService().deleteDictVersionByDictVersionId(dictVersionId);
	}

	/**
	* <p>
	* Update DictVersion
	* </p>
	*
	* @param dictVersionId
	lÃƒÂ  id cÃ¡Â»Â§a DictVersion
	* @param userId
	lÃƒÂ  id cÃ¡Â»Â§a ngÃ†Â°Ã¡Â»ï¿½i Ã„â€˜Ã„Æ’ng nhÃ¡ÂºÂ­p
	* @param dictCollection
	lÃƒÂ  Ã„â€˜Ã¡Â»â€˜i tÃ†Â°Ã¡Â»Â£ng DictCollection
	* @param version
	lÃƒÂ  thuÃ¡Â»â„¢c tÃƒÂ­nh phiÃƒÂªn bÃ¡ÂºÂ£n cÃ¡Â»Â§a DictVersion
	* @param serviceContext
	CÃƒÂ³ thÃ¡Â»Æ’ lÃ¡ÂºÂ¥y ra cÃƒÂ¡c userId, GroupId, CompanyId
	* @param validatedFrom
	NgÃƒÂ y phÃƒÂª bÃ¡ÂºÂ¯t Ã„â€˜Ã¡ÂºÂ§u phÃƒÂª duyÃ¡Â»â€¡t
	* @param validatedTo
	NgÃƒÂ y kÃ¡ÂºÂ¿t thÃƒÂºc phÃƒÂª duyÃ¡Â»â€¡t
	* @param description
	MÃƒÂ´ tÃ¡ÂºÂ£
	* @return trÃ¡ÂºÂ£ vÃ¡Â»ï¿½ Ã„â€˜Ã¡Â»â€˜i tÃ†Â°Ã¡Â»Â£ng DictVersion
	* @throws SystemException
	NÃ¡ÂºÂ¿u ngoÃ¡ÂºÂ¡i lÃ¡Â»â€¡ hÃ¡Â»â€¡ thÃ¡Â»â€˜ng xÃ¡ÂºÂ£y ra
	* @throws NoSuchDictVersionException
	Khi xÃ¡ÂºÂ£y ra lÃ¡Â»â€”i khÃƒÂ´ng tÃƒÂ¬m thÃ¡ÂºÂ¥y DictVersion
	*/
	public static org.opencps.datamgt.model.DictVersion updateDictVersion(
		long dictVersionId, long userId,
		org.opencps.datamgt.model.DictCollection dictCollection,
		java.lang.String version, java.lang.String description,
		java.util.Date validatedFrom, java.util.Date validatedTo,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.datamgt.NoSuchDictVersionException {
		return getService()
				   .updateDictVersion(dictVersionId, userId, dictCollection,
			version, description, validatedFrom, validatedTo, serviceContext);
	}

	public static java.util.List<org.opencps.datamgt.model.DictVersion> getDictVersion(
		int start, int end, com.liferay.portal.kernel.util.OrderByComparator odc)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.datamgt.NoSuchDictVersionException {
		return getService().getDictVersion(start, end, odc);
	}

	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countAll();
	}

	/**
	* <p>
	* Get DictVersion
	* </p>
	*
	* @param dictVersionId
	lÃƒÂ  DictVersion
	* @return Ã„â€˜Ã¡Â»â€˜i tÃ†Â°Ã¡Â»Â£ng DictVersions
	* @throws SystemException
	NÃ¡ÂºÂ¿u ngoÃ¡ÂºÂ¡i lÃ¡Â»â€¡ hÃ¡Â»â€¡ thÃ¡Â»â€˜ng xÃ¡ÂºÂ£y ra ChuyÃ¡Â»Æ’n trÃ¡ÂºÂ¡ng thÃƒÂ¡i version tÃ¡Â»Â«
	drafting sang inuse, khi Ã„â€˜ÃƒÂ³ phiÃƒÂªn bÃ¡ÂºÂ£n Ã„â€˜ang sÃ¡Â»Â­ dÃ¡Â»Â¥ng sÃ¡ÂºÂ½ tÃ¡Â»Â± Ã„â€˜Ã¡Â»â„¢ng
	Ã„â€˜Ã†Â°Ã¡Â»Â£c chuyÃ¡Â»Æ’n thÃƒÂ nh hÃ¡ÂºÂ¿t hÃ¡ÂºÂ¡n
	* @throws NoSuchDictVersionException
	Khi xÃ¡ÂºÂ£y ra lÃ¡Â»â€”i khÃƒÂ´ng tÃƒÂ¬m thÃ¡ÂºÂ¥y DictVersion
	*/
	public static org.opencps.datamgt.model.DictVersion makeDictVersionInUse(
		int dictVersionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.datamgt.NoSuchDictVersionException {
		return getService().makeDictVersionInUse(dictVersionId);
	}

	/**
	* <p>
	* Get DictVersion
	* </p>
	*
	* @param dictCollectionId
	lÃƒÂ  id DictVersion
	* @return tÃ¡ÂºÂ­p hÃ¡Â»Â£p Ã„â€˜Ã¡Â»â€˜i tÃ†Â°Ã¡Â»Â£ng DictVersion
	* @throws SystemException
	NÃ¡ÂºÂ¿u ngoÃ¡ÂºÂ¡i lÃ¡Â»â€¡ hÃ¡Â»â€¡ thÃ¡Â»â€˜ng xÃ¡ÂºÂ£y ra
	* @throws NoSuchDictVersionException
	Khi xÃ¡ÂºÂ£y ra lÃ¡Â»â€”i khÃƒÂ´ng tÃƒÂ¬m thÃ¡ÂºÂ¥y DictVersion
	*/
	public static java.util.List<org.opencps.datamgt.model.DictVersion> getDictVersions(
		int dictCollectionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDictVersions(dictCollectionId);
	}

	/**
	* <p>
	* Get DictVersion
	* </p>
	*
	* @param dictCollection
	lÃƒÂ  Ã„â€˜Ã¡Â»â€˜i tÃ†Â°Ã¡Â»Â£ng dictCollection Ã„â€˜ÃƒÂ£ Ã„â€˜Ã†Â°Ã¡Â»Â£c xÃƒÂ¡c Ã„â€˜Ã¡Â»â€¹nh
	* @return LÃ¡ÂºÂ¥y version Ã„â€˜ang sÃ¡Â»Â­ dÃ¡Â»Â¥ng cÃ¡Â»Â§a mÃ¡Â»â„¢t collection, mÃ¡Â»â€”i collection chÃ¡Â»â€°
	cÃƒÂ³ tÃ¡Â»â€˜i Ã„â€˜a 1 version Ã„â€˜ang sÃ¡Â»Â­ dÃ¡Â»Â¥ng
	* @throws SystemException
	NÃ¡ÂºÂ¿u ngoÃ¡ÂºÂ¡i lÃ¡Â»â€¡ hÃ¡Â»â€¡ thÃ¡Â»â€˜ng xÃ¡ÂºÂ£y ra
	* @throws NoSuchDictVersionException
	Khi xÃ¡ÂºÂ£y ra lÃ¡Â»â€”i khÃƒÂ´ng tÃƒÂ¬m thÃ¡ÂºÂ¥y DictVersion
	*/
	public static org.opencps.datamgt.model.DictVersion getDictVersionInUse(
		org.opencps.datamgt.model.DictCollection dictCollection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDictVersionInUse(dictCollection);
	}

	public static void clearService() {
		_service = null;
	}

	public static DictVersionLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DictVersionLocalService.class.getName());

			if (invokableLocalService instanceof DictVersionLocalService) {
				_service = (DictVersionLocalService)invokableLocalService;
			}
			else {
				_service = new DictVersionLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(DictVersionLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(DictVersionLocalService service) {
	}

	private static DictVersionLocalService _service;
}