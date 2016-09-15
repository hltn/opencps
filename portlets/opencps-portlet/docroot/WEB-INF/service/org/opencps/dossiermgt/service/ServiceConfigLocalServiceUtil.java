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

package org.opencps.dossiermgt.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for ServiceConfig. This utility wraps
 * {@link org.opencps.dossiermgt.service.impl.ServiceConfigLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author trungnt
 * @see ServiceConfigLocalService
 * @see org.opencps.dossiermgt.service.base.ServiceConfigLocalServiceBaseImpl
 * @see org.opencps.dossiermgt.service.impl.ServiceConfigLocalServiceImpl
 * @generated
 */
public class ServiceConfigLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.opencps.dossiermgt.service.impl.ServiceConfigLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the service config to the database. Also notifies the appropriate model listeners.
	*
	* @param serviceConfig the service config
	* @return the service config that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.ServiceConfig addServiceConfig(
		org.opencps.dossiermgt.model.ServiceConfig serviceConfig)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addServiceConfig(serviceConfig);
	}

	/**
	* Creates a new service config with the primary key. Does not add the service config to the database.
	*
	* @param serviceConfigId the primary key for the new service config
	* @return the new service config
	*/
	public static org.opencps.dossiermgt.model.ServiceConfig createServiceConfig(
		long serviceConfigId) {
		return getService().createServiceConfig(serviceConfigId);
	}

	/**
	* Deletes the service config with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param serviceConfigId the primary key of the service config
	* @return the service config that was removed
	* @throws PortalException if a service config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.ServiceConfig deleteServiceConfig(
		long serviceConfigId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteServiceConfig(serviceConfigId);
	}

	/**
	* Deletes the service config from the database. Also notifies the appropriate model listeners.
	*
	* @param serviceConfig the service config
	* @return the service config that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.ServiceConfig deleteServiceConfig(
		org.opencps.dossiermgt.model.ServiceConfig serviceConfig)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteServiceConfig(serviceConfig);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.ServiceConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.ServiceConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static org.opencps.dossiermgt.model.ServiceConfig fetchServiceConfig(
		long serviceConfigId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchServiceConfig(serviceConfigId);
	}

	/**
	* Returns the service config with the primary key.
	*
	* @param serviceConfigId the primary key of the service config
	* @return the service config
	* @throws PortalException if a service config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.ServiceConfig getServiceConfig(
		long serviceConfigId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getServiceConfig(serviceConfigId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<org.opencps.dossiermgt.model.ServiceConfig> getServiceConfigs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getServiceConfigs(start, end);
	}

	/**
	* Returns the number of service configs.
	*
	* @return the number of service configs
	* @throws SystemException if a system exception occurred
	*/
	public static int getServiceConfigsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getServiceConfigsCount();
	}

	/**
	* Updates the service config in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param serviceConfig the service config
	* @return the service config that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.ServiceConfig updateServiceConfig(
		org.opencps.dossiermgt.model.ServiceConfig serviceConfig)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateServiceConfig(serviceConfig);
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
	* @param serviceInfoId
	* @param serviceAdministrationIndex
	* @param serviceDomainIndex
	* @param dossierTemplateId
	* @param govAgencyCode
	* @param govAgencyName
	* @param serviceLevel
	* @param domainCode
	* @param userId
	* @param serviceInstruction
	* @param servicePortal
	* @param serviceOnegate
	* @param serviceBackoffice
	* @param serviceCitizen
	* @param serviceBusinees
	* @param serviceContext
	* @return
	* @throws PortalException
	* @throws SystemException
	*/
	public static org.opencps.dossiermgt.model.ServiceConfig addServiceConfig(
		long serviceInfoId, java.lang.String serviceAdministrationIndex,
		java.lang.String serviceDomainIndex, long dossierTemplateId,
		java.lang.String govAgencyCode, java.lang.String govAgencyName,
		int serviceLevel, java.lang.String domainCode, long userId,
		java.lang.String serviceInstruction, boolean servicePortal,
		boolean serviceOnegate, boolean serviceBackoffice,
		boolean serviceCitizen, boolean serviceBusinees,
		java.lang.String govAgencyIndex, java.lang.String serviceUrl,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addServiceConfig(serviceInfoId, serviceAdministrationIndex,
			serviceDomainIndex, dossierTemplateId, govAgencyCode,
			govAgencyName, serviceLevel, domainCode, userId,
			serviceInstruction, servicePortal, serviceOnegate,
			serviceBackoffice, serviceCitizen, serviceBusinees, govAgencyIndex,
			serviceUrl, serviceContext);
	}

	/**
	* @return
	* @throws SystemException
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countAll();
	}

	/**
	* @param dossierTemplateId
	* @return
	* @throws SystemException
	*/
	public static int countByDossierTemplateId(long dossierTemplateId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByDossierTemplateId(dossierTemplateId);
	}

	/**
	* @param groupId
	* @param keywords
	* @param govAgencyCode
	* @param domainCode
	* @return
	*/
	public static int countServiceConfig(long groupId,
		java.lang.String keywords, java.lang.String govAgencyCode,
		java.lang.String domainCode) {
		return getService()
				   .countServiceConfig(groupId, keywords, govAgencyCode,
			domainCode);
	}

	/**
	* @param groupId
	* @param keyword
	* @param servicePortal
	* @param serviceOnegate
	* @param serviceBackoffice
	* @param serviceCitizen
	* @param serviceBusinees
	* @param serviceDomainIndex
	* @param govAgencyIndex
	* @return
	*/
	public static int countServiceConfigAdvance(long groupId,
		java.lang.String keyword, int servicePortal, int serviceOnegate,
		int serviceBackoffice, int serviceCitizen, int serviceBusinees,
		java.lang.String serviceDomainIndex, java.lang.String govAgencyIndex) {
		return getService()
				   .countServiceConfigAdvance(groupId, keyword, servicePortal,
			serviceOnegate, serviceBackoffice, serviceCitizen, serviceBusinees,
			serviceDomainIndex, govAgencyIndex);
	}

	/**
	* @param groupId
	* @param serviceModes
	* @return
	*/
	public static int countServiceConfigByServiceMode(long groupId,
		int[] serviceModes) {
		return getService()
				   .countServiceConfigByServiceMode(groupId, serviceModes);
	}

	/**
	* @param groupId
	* @param serviceMode
	* @return
	* @throws SystemException
	*/
	public static int countServiceConFigsByG_M(long groupId, int serviceMode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countServiceConFigsByG_M(groupId, serviceMode);
	}

	/**
	* @param serviceConfigId
	* @throws NoSuchServiceConfigException
	* @throws SystemException
	*/
	public static void deleteServiceConfigById(long serviceConfigId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchServiceConfigException {
		getService().deleteServiceConfigById(serviceConfigId);
	}

	/**
	* @param groupId
	* @param keyword
	* @param servicePortal
	* @param serviceOnegate
	* @param serviceBackoffice
	* @param serviceCitizen
	* @param serviceBusinees
	* @param serviceDomainIndex
	* @param govAgencyIndex
	* @param start
	* @param end
	* @param orderByComparator
	* @return
	*/
	public static java.util.List searchServiceConfigAdvance(long groupId,
		java.lang.String keyword, int servicePortal, int serviceOnegate,
		int serviceBackoffice, int serviceCitizen, int serviceBusinees,
		java.lang.String serviceDomainIndex, java.lang.String govAgencyIndex,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator) {
		return getService()
				   .searchServiceConfigAdvance(groupId, keyword, servicePortal,
			serviceOnegate, serviceBackoffice, serviceCitizen, serviceBusinees,
			serviceDomainIndex, govAgencyIndex, start, end, orderByComparator);
	}

	/**
	* @param groupId
	* @param userId
	* @param servicePortal
	* @param serviceOnegate
	* @param serviceBackoffice
	* @param serviceCitizen
	* @param serviceBusinees
	* @param start
	* @param end
	* @param orderByComparator
	* @return
	*/
	public static java.util.List getServiceConfigRecent(long groupId,
		long userId, int servicePortal, int serviceOnegate,
		int serviceBackoffice, int serviceCitizen, int serviceBusinees,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator) {
		return getService()
				   .getServiceConfigRecent(groupId, userId, servicePortal,
			serviceOnegate, serviceBackoffice, serviceCitizen, serviceBusinees,
			start, end, orderByComparator);
	}

	/**
	* @param start
	* @param end
	* @param orderByComparator
	* @return
	* @throws SystemException
	*/
	public static java.util.List<org.opencps.dossiermgt.model.ServiceConfig> getAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAll(start, end, orderByComparator);
	}

	/**
	* @param groupId
	* @param serviceInfoId
	* @return
	* @throws NoSuchServiceConfigException
	* @throws SystemException
	*/
	public static org.opencps.dossiermgt.model.ServiceConfig getServiceConfigByG_S(
		long groupId, long serviceInfoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchServiceConfigException {
		return getService().getServiceConfigByG_S(groupId, serviceInfoId);
	}

	/**
	* @param groupId
	* @param serviceInfoId
	* @param serviceAdministrationIndex
	* @return
	* @throws NoSuchServiceConfigException
	* @throws SystemException
	*/
	public static org.opencps.dossiermgt.model.ServiceConfig getServiceConfigByG_S_A(
		long groupId, long serviceInfoId,
		java.lang.String serviceAdministrationIndex)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchServiceConfigException {
		return getService()
				   .getServiceConfigByG_S_A(groupId, serviceInfoId,
			serviceAdministrationIndex);
	}

	/**
	* @param groupId
	* @param serviceInfoId
	* @param govAgencyCode
	* @return
	* @throws NoSuchServiceConfigException
	* @throws SystemException
	*/
	public static org.opencps.dossiermgt.model.ServiceConfig getServiceConfigByG_S_G(
		long groupId, long serviceInfoId, java.lang.String govAgencyCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchServiceConfigException {
		return getService()
				   .getServiceConfigByG_S_G(groupId, serviceInfoId,
			govAgencyCode);
	}

	/**
	* @param dossierTemplateId
	* @return
	* @throws SystemException
	*/
	public static java.util.List<org.opencps.dossiermgt.model.ServiceConfig> getServiceConfigs(
		long dossierTemplateId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getServiceConfigs(dossierTemplateId);
	}

	/**
	* @param groupId
	* @param serviceMode
	* @param start
	* @param end
	* @return
	* @throws SystemException
	*/
	public static java.util.List<org.opencps.dossiermgt.model.ServiceConfig> getServiceConFigsByG_M(
		long groupId, int serviceMode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getServiceConFigsByG_M(groupId, serviceMode, start, end);
	}

	/**
	* @param groupId
	* @param keywords
	* @param govAgencyCode
	* @param domainCode
	* @param start
	* @param end
	* @return
	*/
	public static java.util.List<org.opencps.dossiermgt.model.ServiceConfig> searchServiceConfig(
		long groupId, java.lang.String keywords,
		java.lang.String govAgencyCode, java.lang.String domainCode, int start,
		int end) {
		return getService()
				   .searchServiceConfig(groupId, keywords, govAgencyCode,
			domainCode, start, end);
	}

	/**
	* @param groupId
	* @param serviceModes
	* @param start
	* @param end
	* @param orderByComparator
	* @return
	*/
	public static java.util.List<org.opencps.dossiermgt.model.ServiceConfig> searchServiceConfigByServiceMode(
		long groupId, int[] serviceModes, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator) {
		return getService()
				   .searchServiceConfigByServiceMode(groupId, serviceModes,
			start, end, orderByComparator);
	}

	/**
	* @param serviceConfigId
	* @param serviceInfoId
	* @param serviceAdministrationIndex
	* @param serviceDomainIndex
	* @param dossierTemplateId
	* @param govAgencyCode
	* @param govAgencyName
	* @param serviceLevel
	* @param domainCode
	* @param userId
	* @param serviceInstruction
	* @param servicePortal
	* @param serviceOnegate
	* @param serviceBackoffice
	* @param serviceCitizen
	* @param serviceBusinees
	* @param serviceContext
	* @return
	* @throws PortalException
	* @throws SystemException
	*/
	public static org.opencps.dossiermgt.model.ServiceConfig updateServiceConfig(
		long serviceConfigId, long serviceInfoId,
		java.lang.String serviceAdministrationIndex,
		java.lang.String serviceDomainIndex, long dossierTemplateId,
		java.lang.String govAgencyCode, java.lang.String govAgencyName,
		int serviceLevel, java.lang.String domainCode, long userId,
		java.lang.String serviceInstruction, boolean servicePortal,
		boolean serviceOnegate, boolean serviceBackoffice,
		boolean serviceCitizen, boolean serviceBusinees,
		java.lang.String govAgencyIndex, java.lang.String serviceUrl,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateServiceConfig(serviceConfigId, serviceInfoId,
			serviceAdministrationIndex, serviceDomainIndex, dossierTemplateId,
			govAgencyCode, govAgencyName, serviceLevel, domainCode, userId,
			serviceInstruction, servicePortal, serviceOnegate,
			serviceBackoffice, serviceCitizen, serviceBusinees, govAgencyIndex,
			serviceUrl, serviceContext);
	}

	public static java.util.List<org.opencps.dossiermgt.model.ServiceConfig> getServiceConfigsByS_G(
		long serviceInfoId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getServiceConfigsByS_G(serviceInfoId, groupId);
	}

	public static void clearService() {
		_service = null;
	}

	public static ServiceConfigLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					ServiceConfigLocalService.class.getName());

			if (invokableLocalService instanceof ServiceConfigLocalService) {
				_service = (ServiceConfigLocalService)invokableLocalService;
			}
			else {
				_service = new ServiceConfigLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(ServiceConfigLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(ServiceConfigLocalService service) {
	}

	private static ServiceConfigLocalService _service;
}