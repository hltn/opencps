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

package org.opencps.dossiermgt.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import org.opencps.dossiermgt.model.ServiceConfig;

import java.util.List;

/**
 * The persistence utility for the service config service. This utility wraps {@link ServiceConfigPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungnt
 * @see ServiceConfigPersistence
 * @see ServiceConfigPersistenceImpl
 * @generated
 */
public class ServiceConfigUtil {
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
	public static void clearCache(ServiceConfig serviceConfig) {
		getPersistence().clearCache(serviceConfig);
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
	public static List<ServiceConfig> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ServiceConfig> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ServiceConfig> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static ServiceConfig update(ServiceConfig serviceConfig)
		throws SystemException {
		return getPersistence().update(serviceConfig);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static ServiceConfig update(ServiceConfig serviceConfig,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(serviceConfig, serviceContext);
	}

	/**
	* Returns all the service configs where dossierTemplateId = &#63;.
	*
	* @param dossierTemplateId the dossier template ID
	* @return the matching service configs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.ServiceConfig> findByDossierTemplateId(
		long dossierTemplateId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDossierTemplateId(dossierTemplateId);
	}

	/**
	* Returns a range of all the service configs where dossierTemplateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.ServiceConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierTemplateId the dossier template ID
	* @param start the lower bound of the range of service configs
	* @param end the upper bound of the range of service configs (not inclusive)
	* @return the range of matching service configs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.ServiceConfig> findByDossierTemplateId(
		long dossierTemplateId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDossierTemplateId(dossierTemplateId, start, end);
	}

	/**
	* Returns an ordered range of all the service configs where dossierTemplateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.ServiceConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierTemplateId the dossier template ID
	* @param start the lower bound of the range of service configs
	* @param end the upper bound of the range of service configs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching service configs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.ServiceConfig> findByDossierTemplateId(
		long dossierTemplateId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDossierTemplateId(dossierTemplateId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first service config in the ordered set where dossierTemplateId = &#63;.
	*
	* @param dossierTemplateId the dossier template ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching service config
	* @throws org.opencps.dossiermgt.NoSuchServiceConfigException if a matching service config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.ServiceConfig findByDossierTemplateId_First(
		long dossierTemplateId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchServiceConfigException {
		return getPersistence()
				   .findByDossierTemplateId_First(dossierTemplateId,
			orderByComparator);
	}

	/**
	* Returns the first service config in the ordered set where dossierTemplateId = &#63;.
	*
	* @param dossierTemplateId the dossier template ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching service config, or <code>null</code> if a matching service config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.ServiceConfig fetchByDossierTemplateId_First(
		long dossierTemplateId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDossierTemplateId_First(dossierTemplateId,
			orderByComparator);
	}

	/**
	* Returns the last service config in the ordered set where dossierTemplateId = &#63;.
	*
	* @param dossierTemplateId the dossier template ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching service config
	* @throws org.opencps.dossiermgt.NoSuchServiceConfigException if a matching service config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.ServiceConfig findByDossierTemplateId_Last(
		long dossierTemplateId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchServiceConfigException {
		return getPersistence()
				   .findByDossierTemplateId_Last(dossierTemplateId,
			orderByComparator);
	}

	/**
	* Returns the last service config in the ordered set where dossierTemplateId = &#63;.
	*
	* @param dossierTemplateId the dossier template ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching service config, or <code>null</code> if a matching service config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.ServiceConfig fetchByDossierTemplateId_Last(
		long dossierTemplateId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDossierTemplateId_Last(dossierTemplateId,
			orderByComparator);
	}

	/**
	* Returns the service configs before and after the current service config in the ordered set where dossierTemplateId = &#63;.
	*
	* @param serviceConfigId the primary key of the current service config
	* @param dossierTemplateId the dossier template ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next service config
	* @throws org.opencps.dossiermgt.NoSuchServiceConfigException if a service config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.ServiceConfig[] findByDossierTemplateId_PrevAndNext(
		long serviceConfigId, long dossierTemplateId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchServiceConfigException {
		return getPersistence()
				   .findByDossierTemplateId_PrevAndNext(serviceConfigId,
			dossierTemplateId, orderByComparator);
	}

	/**
	* Removes all the service configs where dossierTemplateId = &#63; from the database.
	*
	* @param dossierTemplateId the dossier template ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDossierTemplateId(long dossierTemplateId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDossierTemplateId(dossierTemplateId);
	}

	/**
	* Returns the number of service configs where dossierTemplateId = &#63;.
	*
	* @param dossierTemplateId the dossier template ID
	* @return the number of matching service configs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDossierTemplateId(long dossierTemplateId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDossierTemplateId(dossierTemplateId);
	}

	/**
	* Returns the service config where groupId = &#63; and serviceInfoId = &#63; or throws a {@link org.opencps.dossiermgt.NoSuchServiceConfigException} if it could not be found.
	*
	* @param groupId the group ID
	* @param serviceInfoId the service info ID
	* @return the matching service config
	* @throws org.opencps.dossiermgt.NoSuchServiceConfigException if a matching service config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.ServiceConfig findByG_S(
		long groupId, long serviceInfoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchServiceConfigException {
		return getPersistence().findByG_S(groupId, serviceInfoId);
	}

	/**
	* Returns the service config where groupId = &#63; and serviceInfoId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param serviceInfoId the service info ID
	* @return the matching service config, or <code>null</code> if a matching service config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.ServiceConfig fetchByG_S(
		long groupId, long serviceInfoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByG_S(groupId, serviceInfoId);
	}

	/**
	* Returns the service config where groupId = &#63; and serviceInfoId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param serviceInfoId the service info ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching service config, or <code>null</code> if a matching service config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.ServiceConfig fetchByG_S(
		long groupId, long serviceInfoId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_S(groupId, serviceInfoId, retrieveFromCache);
	}

	/**
	* Removes the service config where groupId = &#63; and serviceInfoId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param serviceInfoId the service info ID
	* @return the service config that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.ServiceConfig removeByG_S(
		long groupId, long serviceInfoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchServiceConfigException {
		return getPersistence().removeByG_S(groupId, serviceInfoId);
	}

	/**
	* Returns the number of service configs where groupId = &#63; and serviceInfoId = &#63;.
	*
	* @param groupId the group ID
	* @param serviceInfoId the service info ID
	* @return the number of matching service configs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_S(long groupId, long serviceInfoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_S(groupId, serviceInfoId);
	}

	/**
	* Returns the service config where groupId = &#63; and serviceInfoId = &#63; and serviceAdministrationIndex = &#63; or throws a {@link org.opencps.dossiermgt.NoSuchServiceConfigException} if it could not be found.
	*
	* @param groupId the group ID
	* @param serviceInfoId the service info ID
	* @param serviceAdministrationIndex the service administration index
	* @return the matching service config
	* @throws org.opencps.dossiermgt.NoSuchServiceConfigException if a matching service config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.ServiceConfig findByG_S_A(
		long groupId, long serviceInfoId,
		java.lang.String serviceAdministrationIndex)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchServiceConfigException {
		return getPersistence()
				   .findByG_S_A(groupId, serviceInfoId,
			serviceAdministrationIndex);
	}

	/**
	* Returns the service config where groupId = &#63; and serviceInfoId = &#63; and serviceAdministrationIndex = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param serviceInfoId the service info ID
	* @param serviceAdministrationIndex the service administration index
	* @return the matching service config, or <code>null</code> if a matching service config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.ServiceConfig fetchByG_S_A(
		long groupId, long serviceInfoId,
		java.lang.String serviceAdministrationIndex)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_S_A(groupId, serviceInfoId,
			serviceAdministrationIndex);
	}

	/**
	* Returns the service config where groupId = &#63; and serviceInfoId = &#63; and serviceAdministrationIndex = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param serviceInfoId the service info ID
	* @param serviceAdministrationIndex the service administration index
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching service config, or <code>null</code> if a matching service config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.ServiceConfig fetchByG_S_A(
		long groupId, long serviceInfoId,
		java.lang.String serviceAdministrationIndex, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_S_A(groupId, serviceInfoId,
			serviceAdministrationIndex, retrieveFromCache);
	}

	/**
	* Removes the service config where groupId = &#63; and serviceInfoId = &#63; and serviceAdministrationIndex = &#63; from the database.
	*
	* @param groupId the group ID
	* @param serviceInfoId the service info ID
	* @param serviceAdministrationIndex the service administration index
	* @return the service config that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.ServiceConfig removeByG_S_A(
		long groupId, long serviceInfoId,
		java.lang.String serviceAdministrationIndex)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchServiceConfigException {
		return getPersistence()
				   .removeByG_S_A(groupId, serviceInfoId,
			serviceAdministrationIndex);
	}

	/**
	* Returns the number of service configs where groupId = &#63; and serviceInfoId = &#63; and serviceAdministrationIndex = &#63;.
	*
	* @param groupId the group ID
	* @param serviceInfoId the service info ID
	* @param serviceAdministrationIndex the service administration index
	* @return the number of matching service configs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_S_A(long groupId, long serviceInfoId,
		java.lang.String serviceAdministrationIndex)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByG_S_A(groupId, serviceInfoId,
			serviceAdministrationIndex);
	}

	/**
	* Returns the service config where groupId = &#63; and serviceInfoId = &#63; and govAgencyCode = &#63; or throws a {@link org.opencps.dossiermgt.NoSuchServiceConfigException} if it could not be found.
	*
	* @param groupId the group ID
	* @param serviceInfoId the service info ID
	* @param govAgencyCode the gov agency code
	* @return the matching service config
	* @throws org.opencps.dossiermgt.NoSuchServiceConfigException if a matching service config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.ServiceConfig findByG_S_G(
		long groupId, long serviceInfoId, java.lang.String govAgencyCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchServiceConfigException {
		return getPersistence()
				   .findByG_S_G(groupId, serviceInfoId, govAgencyCode);
	}

	/**
	* Returns the service config where groupId = &#63; and serviceInfoId = &#63; and govAgencyCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param serviceInfoId the service info ID
	* @param govAgencyCode the gov agency code
	* @return the matching service config, or <code>null</code> if a matching service config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.ServiceConfig fetchByG_S_G(
		long groupId, long serviceInfoId, java.lang.String govAgencyCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_S_G(groupId, serviceInfoId, govAgencyCode);
	}

	/**
	* Returns the service config where groupId = &#63; and serviceInfoId = &#63; and govAgencyCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param serviceInfoId the service info ID
	* @param govAgencyCode the gov agency code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching service config, or <code>null</code> if a matching service config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.ServiceConfig fetchByG_S_G(
		long groupId, long serviceInfoId, java.lang.String govAgencyCode,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_S_G(groupId, serviceInfoId, govAgencyCode,
			retrieveFromCache);
	}

	/**
	* Removes the service config where groupId = &#63; and serviceInfoId = &#63; and govAgencyCode = &#63; from the database.
	*
	* @param groupId the group ID
	* @param serviceInfoId the service info ID
	* @param govAgencyCode the gov agency code
	* @return the service config that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.ServiceConfig removeByG_S_G(
		long groupId, long serviceInfoId, java.lang.String govAgencyCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchServiceConfigException {
		return getPersistence()
				   .removeByG_S_G(groupId, serviceInfoId, govAgencyCode);
	}

	/**
	* Returns the number of service configs where groupId = &#63; and serviceInfoId = &#63; and govAgencyCode = &#63;.
	*
	* @param groupId the group ID
	* @param serviceInfoId the service info ID
	* @param govAgencyCode the gov agency code
	* @return the number of matching service configs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_S_G(long groupId, long serviceInfoId,
		java.lang.String govAgencyCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByG_S_G(groupId, serviceInfoId, govAgencyCode);
	}

	/**
	* Returns all the service configs where groupId = &#63; and serviceMode = &#63;.
	*
	* @param groupId the group ID
	* @param serviceMode the service mode
	* @return the matching service configs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.ServiceConfig> findByG_M(
		long groupId, int serviceMode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_M(groupId, serviceMode);
	}

	/**
	* Returns a range of all the service configs where groupId = &#63; and serviceMode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.ServiceConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param serviceMode the service mode
	* @param start the lower bound of the range of service configs
	* @param end the upper bound of the range of service configs (not inclusive)
	* @return the range of matching service configs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.ServiceConfig> findByG_M(
		long groupId, int serviceMode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_M(groupId, serviceMode, start, end);
	}

	/**
	* Returns an ordered range of all the service configs where groupId = &#63; and serviceMode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.ServiceConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param serviceMode the service mode
	* @param start the lower bound of the range of service configs
	* @param end the upper bound of the range of service configs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching service configs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.ServiceConfig> findByG_M(
		long groupId, int serviceMode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_M(groupId, serviceMode, start, end,
			orderByComparator);
	}

	/**
	* Returns the first service config in the ordered set where groupId = &#63; and serviceMode = &#63;.
	*
	* @param groupId the group ID
	* @param serviceMode the service mode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching service config
	* @throws org.opencps.dossiermgt.NoSuchServiceConfigException if a matching service config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.ServiceConfig findByG_M_First(
		long groupId, int serviceMode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchServiceConfigException {
		return getPersistence()
				   .findByG_M_First(groupId, serviceMode, orderByComparator);
	}

	/**
	* Returns the first service config in the ordered set where groupId = &#63; and serviceMode = &#63;.
	*
	* @param groupId the group ID
	* @param serviceMode the service mode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching service config, or <code>null</code> if a matching service config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.ServiceConfig fetchByG_M_First(
		long groupId, int serviceMode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_M_First(groupId, serviceMode, orderByComparator);
	}

	/**
	* Returns the last service config in the ordered set where groupId = &#63; and serviceMode = &#63;.
	*
	* @param groupId the group ID
	* @param serviceMode the service mode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching service config
	* @throws org.opencps.dossiermgt.NoSuchServiceConfigException if a matching service config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.ServiceConfig findByG_M_Last(
		long groupId, int serviceMode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchServiceConfigException {
		return getPersistence()
				   .findByG_M_Last(groupId, serviceMode, orderByComparator);
	}

	/**
	* Returns the last service config in the ordered set where groupId = &#63; and serviceMode = &#63;.
	*
	* @param groupId the group ID
	* @param serviceMode the service mode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching service config, or <code>null</code> if a matching service config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.ServiceConfig fetchByG_M_Last(
		long groupId, int serviceMode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_M_Last(groupId, serviceMode, orderByComparator);
	}

	/**
	* Returns the service configs before and after the current service config in the ordered set where groupId = &#63; and serviceMode = &#63;.
	*
	* @param serviceConfigId the primary key of the current service config
	* @param groupId the group ID
	* @param serviceMode the service mode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next service config
	* @throws org.opencps.dossiermgt.NoSuchServiceConfigException if a service config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.ServiceConfig[] findByG_M_PrevAndNext(
		long serviceConfigId, long groupId, int serviceMode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchServiceConfigException {
		return getPersistence()
				   .findByG_M_PrevAndNext(serviceConfigId, groupId,
			serviceMode, orderByComparator);
	}

	/**
	* Returns all the service configs that the user has permission to view where groupId = &#63; and serviceMode = &#63;.
	*
	* @param groupId the group ID
	* @param serviceMode the service mode
	* @return the matching service configs that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.ServiceConfig> filterFindByG_M(
		long groupId, int serviceMode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByG_M(groupId, serviceMode);
	}

	/**
	* Returns a range of all the service configs that the user has permission to view where groupId = &#63; and serviceMode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.ServiceConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param serviceMode the service mode
	* @param start the lower bound of the range of service configs
	* @param end the upper bound of the range of service configs (not inclusive)
	* @return the range of matching service configs that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.ServiceConfig> filterFindByG_M(
		long groupId, int serviceMode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByG_M(groupId, serviceMode, start, end);
	}

	/**
	* Returns an ordered range of all the service configs that the user has permissions to view where groupId = &#63; and serviceMode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.ServiceConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param serviceMode the service mode
	* @param start the lower bound of the range of service configs
	* @param end the upper bound of the range of service configs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching service configs that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.ServiceConfig> filterFindByG_M(
		long groupId, int serviceMode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByG_M(groupId, serviceMode, start, end,
			orderByComparator);
	}

	/**
	* Returns the service configs before and after the current service config in the ordered set of service configs that the user has permission to view where groupId = &#63; and serviceMode = &#63;.
	*
	* @param serviceConfigId the primary key of the current service config
	* @param groupId the group ID
	* @param serviceMode the service mode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next service config
	* @throws org.opencps.dossiermgt.NoSuchServiceConfigException if a service config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.ServiceConfig[] filterFindByG_M_PrevAndNext(
		long serviceConfigId, long groupId, int serviceMode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchServiceConfigException {
		return getPersistence()
				   .filterFindByG_M_PrevAndNext(serviceConfigId, groupId,
			serviceMode, orderByComparator);
	}

	/**
	* Removes all the service configs where groupId = &#63; and serviceMode = &#63; from the database.
	*
	* @param groupId the group ID
	* @param serviceMode the service mode
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_M(long groupId, int serviceMode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_M(groupId, serviceMode);
	}

	/**
	* Returns the number of service configs where groupId = &#63; and serviceMode = &#63;.
	*
	* @param groupId the group ID
	* @param serviceMode the service mode
	* @return the number of matching service configs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_M(long groupId, int serviceMode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_M(groupId, serviceMode);
	}

	/**
	* Returns the number of service configs that the user has permission to view where groupId = &#63; and serviceMode = &#63;.
	*
	* @param groupId the group ID
	* @param serviceMode the service mode
	* @return the number of matching service configs that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static int filterCountByG_M(long groupId, int serviceMode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterCountByG_M(groupId, serviceMode);
	}

	/**
	* Returns all the service configs where serviceInfoId = &#63; and groupId = &#63;.
	*
	* @param serviceInfoId the service info ID
	* @param groupId the group ID
	* @return the matching service configs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.ServiceConfig> findByS_G(
		long serviceInfoId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByS_G(serviceInfoId, groupId);
	}

	/**
	* Returns a range of all the service configs where serviceInfoId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.ServiceConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param serviceInfoId the service info ID
	* @param groupId the group ID
	* @param start the lower bound of the range of service configs
	* @param end the upper bound of the range of service configs (not inclusive)
	* @return the range of matching service configs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.ServiceConfig> findByS_G(
		long serviceInfoId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByS_G(serviceInfoId, groupId, start, end);
	}

	/**
	* Returns an ordered range of all the service configs where serviceInfoId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.ServiceConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param serviceInfoId the service info ID
	* @param groupId the group ID
	* @param start the lower bound of the range of service configs
	* @param end the upper bound of the range of service configs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching service configs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.ServiceConfig> findByS_G(
		long serviceInfoId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_G(serviceInfoId, groupId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first service config in the ordered set where serviceInfoId = &#63; and groupId = &#63;.
	*
	* @param serviceInfoId the service info ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching service config
	* @throws org.opencps.dossiermgt.NoSuchServiceConfigException if a matching service config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.ServiceConfig findByS_G_First(
		long serviceInfoId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchServiceConfigException {
		return getPersistence()
				   .findByS_G_First(serviceInfoId, groupId, orderByComparator);
	}

	/**
	* Returns the first service config in the ordered set where serviceInfoId = &#63; and groupId = &#63;.
	*
	* @param serviceInfoId the service info ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching service config, or <code>null</code> if a matching service config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.ServiceConfig fetchByS_G_First(
		long serviceInfoId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByS_G_First(serviceInfoId, groupId, orderByComparator);
	}

	/**
	* Returns the last service config in the ordered set where serviceInfoId = &#63; and groupId = &#63;.
	*
	* @param serviceInfoId the service info ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching service config
	* @throws org.opencps.dossiermgt.NoSuchServiceConfigException if a matching service config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.ServiceConfig findByS_G_Last(
		long serviceInfoId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchServiceConfigException {
		return getPersistence()
				   .findByS_G_Last(serviceInfoId, groupId, orderByComparator);
	}

	/**
	* Returns the last service config in the ordered set where serviceInfoId = &#63; and groupId = &#63;.
	*
	* @param serviceInfoId the service info ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching service config, or <code>null</code> if a matching service config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.ServiceConfig fetchByS_G_Last(
		long serviceInfoId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByS_G_Last(serviceInfoId, groupId, orderByComparator);
	}

	/**
	* Returns the service configs before and after the current service config in the ordered set where serviceInfoId = &#63; and groupId = &#63;.
	*
	* @param serviceConfigId the primary key of the current service config
	* @param serviceInfoId the service info ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next service config
	* @throws org.opencps.dossiermgt.NoSuchServiceConfigException if a service config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.ServiceConfig[] findByS_G_PrevAndNext(
		long serviceConfigId, long serviceInfoId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchServiceConfigException {
		return getPersistence()
				   .findByS_G_PrevAndNext(serviceConfigId, serviceInfoId,
			groupId, orderByComparator);
	}

	/**
	* Returns all the service configs that the user has permission to view where serviceInfoId = &#63; and groupId = &#63;.
	*
	* @param serviceInfoId the service info ID
	* @param groupId the group ID
	* @return the matching service configs that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.ServiceConfig> filterFindByS_G(
		long serviceInfoId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByS_G(serviceInfoId, groupId);
	}

	/**
	* Returns a range of all the service configs that the user has permission to view where serviceInfoId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.ServiceConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param serviceInfoId the service info ID
	* @param groupId the group ID
	* @param start the lower bound of the range of service configs
	* @param end the upper bound of the range of service configs (not inclusive)
	* @return the range of matching service configs that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.ServiceConfig> filterFindByS_G(
		long serviceInfoId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByS_G(serviceInfoId, groupId, start, end);
	}

	/**
	* Returns an ordered range of all the service configs that the user has permissions to view where serviceInfoId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.ServiceConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param serviceInfoId the service info ID
	* @param groupId the group ID
	* @param start the lower bound of the range of service configs
	* @param end the upper bound of the range of service configs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching service configs that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.ServiceConfig> filterFindByS_G(
		long serviceInfoId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByS_G(serviceInfoId, groupId, start, end,
			orderByComparator);
	}

	/**
	* Returns the service configs before and after the current service config in the ordered set of service configs that the user has permission to view where serviceInfoId = &#63; and groupId = &#63;.
	*
	* @param serviceConfigId the primary key of the current service config
	* @param serviceInfoId the service info ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next service config
	* @throws org.opencps.dossiermgt.NoSuchServiceConfigException if a service config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.ServiceConfig[] filterFindByS_G_PrevAndNext(
		long serviceConfigId, long serviceInfoId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchServiceConfigException {
		return getPersistence()
				   .filterFindByS_G_PrevAndNext(serviceConfigId, serviceInfoId,
			groupId, orderByComparator);
	}

	/**
	* Removes all the service configs where serviceInfoId = &#63; and groupId = &#63; from the database.
	*
	* @param serviceInfoId the service info ID
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByS_G(long serviceInfoId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByS_G(serviceInfoId, groupId);
	}

	/**
	* Returns the number of service configs where serviceInfoId = &#63; and groupId = &#63;.
	*
	* @param serviceInfoId the service info ID
	* @param groupId the group ID
	* @return the number of matching service configs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByS_G(long serviceInfoId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByS_G(serviceInfoId, groupId);
	}

	/**
	* Returns the number of service configs that the user has permission to view where serviceInfoId = &#63; and groupId = &#63;.
	*
	* @param serviceInfoId the service info ID
	* @param groupId the group ID
	* @return the number of matching service configs that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static int filterCountByS_G(long serviceInfoId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterCountByS_G(serviceInfoId, groupId);
	}

	/**
	* Caches the service config in the entity cache if it is enabled.
	*
	* @param serviceConfig the service config
	*/
	public static void cacheResult(
		org.opencps.dossiermgt.model.ServiceConfig serviceConfig) {
		getPersistence().cacheResult(serviceConfig);
	}

	/**
	* Caches the service configs in the entity cache if it is enabled.
	*
	* @param serviceConfigs the service configs
	*/
	public static void cacheResult(
		java.util.List<org.opencps.dossiermgt.model.ServiceConfig> serviceConfigs) {
		getPersistence().cacheResult(serviceConfigs);
	}

	/**
	* Creates a new service config with the primary key. Does not add the service config to the database.
	*
	* @param serviceConfigId the primary key for the new service config
	* @return the new service config
	*/
	public static org.opencps.dossiermgt.model.ServiceConfig create(
		long serviceConfigId) {
		return getPersistence().create(serviceConfigId);
	}

	/**
	* Removes the service config with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param serviceConfigId the primary key of the service config
	* @return the service config that was removed
	* @throws org.opencps.dossiermgt.NoSuchServiceConfigException if a service config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.ServiceConfig remove(
		long serviceConfigId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchServiceConfigException {
		return getPersistence().remove(serviceConfigId);
	}

	public static org.opencps.dossiermgt.model.ServiceConfig updateImpl(
		org.opencps.dossiermgt.model.ServiceConfig serviceConfig)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(serviceConfig);
	}

	/**
	* Returns the service config with the primary key or throws a {@link org.opencps.dossiermgt.NoSuchServiceConfigException} if it could not be found.
	*
	* @param serviceConfigId the primary key of the service config
	* @return the service config
	* @throws org.opencps.dossiermgt.NoSuchServiceConfigException if a service config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.ServiceConfig findByPrimaryKey(
		long serviceConfigId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchServiceConfigException {
		return getPersistence().findByPrimaryKey(serviceConfigId);
	}

	/**
	* Returns the service config with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param serviceConfigId the primary key of the service config
	* @return the service config, or <code>null</code> if a service config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.ServiceConfig fetchByPrimaryKey(
		long serviceConfigId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(serviceConfigId);
	}

	/**
	* Returns all the service configs.
	*
	* @return the service configs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.ServiceConfig> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the service configs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.ServiceConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of service configs
	* @param end the upper bound of the range of service configs (not inclusive)
	* @return the range of service configs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.ServiceConfig> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the service configs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.ServiceConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of service configs
	* @param end the upper bound of the range of service configs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of service configs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.ServiceConfig> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the service configs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of service configs.
	*
	* @return the number of service configs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ServiceConfigPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ServiceConfigPersistence)PortletBeanLocatorUtil.locate(org.opencps.dossiermgt.service.ClpSerializer.getServletContextName(),
					ServiceConfigPersistence.class.getName());

			ReferenceRegistry.registerReference(ServiceConfigUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ServiceConfigPersistence persistence) {
	}

	private static ServiceConfigPersistence _persistence;
}