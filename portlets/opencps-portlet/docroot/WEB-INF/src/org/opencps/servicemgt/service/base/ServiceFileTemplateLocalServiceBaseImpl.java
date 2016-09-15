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

package org.opencps.servicemgt.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import org.opencps.servicemgt.model.ServiceFileTemplate;
import org.opencps.servicemgt.service.ServiceFileTemplateLocalService;
import org.opencps.servicemgt.service.persistence.ServiceFileTemplatePK;
import org.opencps.servicemgt.service.persistence.ServiceFileTemplatePersistence;
import org.opencps.servicemgt.service.persistence.ServiceInfoFinder;
import org.opencps.servicemgt.service.persistence.ServiceInfoPersistence;
import org.opencps.servicemgt.service.persistence.TemplateFileFinder;
import org.opencps.servicemgt.service.persistence.TemplateFilePersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the service file template local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link org.opencps.servicemgt.service.impl.ServiceFileTemplateLocalServiceImpl}.
 * </p>
 *
 * @author khoavd
 * @see org.opencps.servicemgt.service.impl.ServiceFileTemplateLocalServiceImpl
 * @see org.opencps.servicemgt.service.ServiceFileTemplateLocalServiceUtil
 * @generated
 */
public abstract class ServiceFileTemplateLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements ServiceFileTemplateLocalService,
		IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link org.opencps.servicemgt.service.ServiceFileTemplateLocalServiceUtil} to access the service file template local service.
	 */

	/**
	 * Adds the service file template to the database. Also notifies the appropriate model listeners.
	 *
	 * @param serviceFileTemplate the service file template
	 * @return the service file template that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public ServiceFileTemplate addServiceFileTemplate(
		ServiceFileTemplate serviceFileTemplate) throws SystemException {
		serviceFileTemplate.setNew(true);

		return serviceFileTemplatePersistence.update(serviceFileTemplate);
	}

	/**
	 * Creates a new service file template with the primary key. Does not add the service file template to the database.
	 *
	 * @param serviceFileTemplatePK the primary key for the new service file template
	 * @return the new service file template
	 */
	@Override
	public ServiceFileTemplate createServiceFileTemplate(
		ServiceFileTemplatePK serviceFileTemplatePK) {
		return serviceFileTemplatePersistence.create(serviceFileTemplatePK);
	}

	/**
	 * Deletes the service file template with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param serviceFileTemplatePK the primary key of the service file template
	 * @return the service file template that was removed
	 * @throws PortalException if a service file template with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public ServiceFileTemplate deleteServiceFileTemplate(
		ServiceFileTemplatePK serviceFileTemplatePK)
		throws PortalException, SystemException {
		return serviceFileTemplatePersistence.remove(serviceFileTemplatePK);
	}

	/**
	 * Deletes the service file template from the database. Also notifies the appropriate model listeners.
	 *
	 * @param serviceFileTemplate the service file template
	 * @return the service file template that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public ServiceFileTemplate deleteServiceFileTemplate(
		ServiceFileTemplate serviceFileTemplate) throws SystemException {
		return serviceFileTemplatePersistence.remove(serviceFileTemplate);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(ServiceFileTemplate.class,
			clazz.getClassLoader());
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
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return serviceFileTemplatePersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.servicemgt.model.impl.ServiceFileTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return serviceFileTemplatePersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.servicemgt.model.impl.ServiceFileTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return serviceFileTemplatePersistence.findWithDynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return serviceFileTemplatePersistence.countWithDynamicQuery(dynamicQuery);
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
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) throws SystemException {
		return serviceFileTemplatePersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public ServiceFileTemplate fetchServiceFileTemplate(
		ServiceFileTemplatePK serviceFileTemplatePK) throws SystemException {
		return serviceFileTemplatePersistence.fetchByPrimaryKey(serviceFileTemplatePK);
	}

	/**
	 * Returns the service file template with the primary key.
	 *
	 * @param serviceFileTemplatePK the primary key of the service file template
	 * @return the service file template
	 * @throws PortalException if a service file template with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceFileTemplate getServiceFileTemplate(
		ServiceFileTemplatePK serviceFileTemplatePK)
		throws PortalException, SystemException {
		return serviceFileTemplatePersistence.findByPrimaryKey(serviceFileTemplatePK);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return serviceFileTemplatePersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the service file templates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.servicemgt.model.impl.ServiceFileTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of service file templates
	 * @param end the upper bound of the range of service file templates (not inclusive)
	 * @return the range of service file templates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServiceFileTemplate> getServiceFileTemplates(int start, int end)
		throws SystemException {
		return serviceFileTemplatePersistence.findAll(start, end);
	}

	/**
	 * Returns the number of service file templates.
	 *
	 * @return the number of service file templates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getServiceFileTemplatesCount() throws SystemException {
		return serviceFileTemplatePersistence.countAll();
	}

	/**
	 * Updates the service file template in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param serviceFileTemplate the service file template
	 * @return the service file template that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public ServiceFileTemplate updateServiceFileTemplate(
		ServiceFileTemplate serviceFileTemplate) throws SystemException {
		return serviceFileTemplatePersistence.update(serviceFileTemplate);
	}

	/**
	 * Returns the service file template local service.
	 *
	 * @return the service file template local service
	 */
	public org.opencps.servicemgt.service.ServiceFileTemplateLocalService getServiceFileTemplateLocalService() {
		return serviceFileTemplateLocalService;
	}

	/**
	 * Sets the service file template local service.
	 *
	 * @param serviceFileTemplateLocalService the service file template local service
	 */
	public void setServiceFileTemplateLocalService(
		org.opencps.servicemgt.service.ServiceFileTemplateLocalService serviceFileTemplateLocalService) {
		this.serviceFileTemplateLocalService = serviceFileTemplateLocalService;
	}

	/**
	 * Returns the service file template remote service.
	 *
	 * @return the service file template remote service
	 */
	public org.opencps.servicemgt.service.ServiceFileTemplateService getServiceFileTemplateService() {
		return serviceFileTemplateService;
	}

	/**
	 * Sets the service file template remote service.
	 *
	 * @param serviceFileTemplateService the service file template remote service
	 */
	public void setServiceFileTemplateService(
		org.opencps.servicemgt.service.ServiceFileTemplateService serviceFileTemplateService) {
		this.serviceFileTemplateService = serviceFileTemplateService;
	}

	/**
	 * Returns the service file template persistence.
	 *
	 * @return the service file template persistence
	 */
	public ServiceFileTemplatePersistence getServiceFileTemplatePersistence() {
		return serviceFileTemplatePersistence;
	}

	/**
	 * Sets the service file template persistence.
	 *
	 * @param serviceFileTemplatePersistence the service file template persistence
	 */
	public void setServiceFileTemplatePersistence(
		ServiceFileTemplatePersistence serviceFileTemplatePersistence) {
		this.serviceFileTemplatePersistence = serviceFileTemplatePersistence;
	}

	/**
	 * Returns the service info local service.
	 *
	 * @return the service info local service
	 */
	public org.opencps.servicemgt.service.ServiceInfoLocalService getServiceInfoLocalService() {
		return serviceInfoLocalService;
	}

	/**
	 * Sets the service info local service.
	 *
	 * @param serviceInfoLocalService the service info local service
	 */
	public void setServiceInfoLocalService(
		org.opencps.servicemgt.service.ServiceInfoLocalService serviceInfoLocalService) {
		this.serviceInfoLocalService = serviceInfoLocalService;
	}

	/**
	 * Returns the service info remote service.
	 *
	 * @return the service info remote service
	 */
	public org.opencps.servicemgt.service.ServiceInfoService getServiceInfoService() {
		return serviceInfoService;
	}

	/**
	 * Sets the service info remote service.
	 *
	 * @param serviceInfoService the service info remote service
	 */
	public void setServiceInfoService(
		org.opencps.servicemgt.service.ServiceInfoService serviceInfoService) {
		this.serviceInfoService = serviceInfoService;
	}

	/**
	 * Returns the service info persistence.
	 *
	 * @return the service info persistence
	 */
	public ServiceInfoPersistence getServiceInfoPersistence() {
		return serviceInfoPersistence;
	}

	/**
	 * Sets the service info persistence.
	 *
	 * @param serviceInfoPersistence the service info persistence
	 */
	public void setServiceInfoPersistence(
		ServiceInfoPersistence serviceInfoPersistence) {
		this.serviceInfoPersistence = serviceInfoPersistence;
	}

	/**
	 * Returns the service info finder.
	 *
	 * @return the service info finder
	 */
	public ServiceInfoFinder getServiceInfoFinder() {
		return serviceInfoFinder;
	}

	/**
	 * Sets the service info finder.
	 *
	 * @param serviceInfoFinder the service info finder
	 */
	public void setServiceInfoFinder(ServiceInfoFinder serviceInfoFinder) {
		this.serviceInfoFinder = serviceInfoFinder;
	}

	/**
	 * Returns the template file local service.
	 *
	 * @return the template file local service
	 */
	public org.opencps.servicemgt.service.TemplateFileLocalService getTemplateFileLocalService() {
		return templateFileLocalService;
	}

	/**
	 * Sets the template file local service.
	 *
	 * @param templateFileLocalService the template file local service
	 */
	public void setTemplateFileLocalService(
		org.opencps.servicemgt.service.TemplateFileLocalService templateFileLocalService) {
		this.templateFileLocalService = templateFileLocalService;
	}

	/**
	 * Returns the template file remote service.
	 *
	 * @return the template file remote service
	 */
	public org.opencps.servicemgt.service.TemplateFileService getTemplateFileService() {
		return templateFileService;
	}

	/**
	 * Sets the template file remote service.
	 *
	 * @param templateFileService the template file remote service
	 */
	public void setTemplateFileService(
		org.opencps.servicemgt.service.TemplateFileService templateFileService) {
		this.templateFileService = templateFileService;
	}

	/**
	 * Returns the template file persistence.
	 *
	 * @return the template file persistence
	 */
	public TemplateFilePersistence getTemplateFilePersistence() {
		return templateFilePersistence;
	}

	/**
	 * Sets the template file persistence.
	 *
	 * @param templateFilePersistence the template file persistence
	 */
	public void setTemplateFilePersistence(
		TemplateFilePersistence templateFilePersistence) {
		this.templateFilePersistence = templateFilePersistence;
	}

	/**
	 * Returns the template file finder.
	 *
	 * @return the template file finder
	 */
	public TemplateFileFinder getTemplateFileFinder() {
		return templateFileFinder;
	}

	/**
	 * Sets the template file finder.
	 *
	 * @param templateFileFinder the template file finder
	 */
	public void setTemplateFileFinder(TemplateFileFinder templateFileFinder) {
		this.templateFileFinder = templateFileFinder;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();

		PersistedModelLocalServiceRegistryUtil.register("org.opencps.servicemgt.model.ServiceFileTemplate",
			serviceFileTemplateLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"org.opencps.servicemgt.model.ServiceFileTemplate");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return ServiceFileTemplate.class;
	}

	protected String getModelClassName() {
		return ServiceFileTemplate.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = serviceFileTemplatePersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = org.opencps.servicemgt.service.ServiceFileTemplateLocalService.class)
	protected org.opencps.servicemgt.service.ServiceFileTemplateLocalService serviceFileTemplateLocalService;
	@BeanReference(type = org.opencps.servicemgt.service.ServiceFileTemplateService.class)
	protected org.opencps.servicemgt.service.ServiceFileTemplateService serviceFileTemplateService;
	@BeanReference(type = ServiceFileTemplatePersistence.class)
	protected ServiceFileTemplatePersistence serviceFileTemplatePersistence;
	@BeanReference(type = org.opencps.servicemgt.service.ServiceInfoLocalService.class)
	protected org.opencps.servicemgt.service.ServiceInfoLocalService serviceInfoLocalService;
	@BeanReference(type = org.opencps.servicemgt.service.ServiceInfoService.class)
	protected org.opencps.servicemgt.service.ServiceInfoService serviceInfoService;
	@BeanReference(type = ServiceInfoPersistence.class)
	protected ServiceInfoPersistence serviceInfoPersistence;
	@BeanReference(type = ServiceInfoFinder.class)
	protected ServiceInfoFinder serviceInfoFinder;
	@BeanReference(type = org.opencps.servicemgt.service.TemplateFileLocalService.class)
	protected org.opencps.servicemgt.service.TemplateFileLocalService templateFileLocalService;
	@BeanReference(type = org.opencps.servicemgt.service.TemplateFileService.class)
	protected org.opencps.servicemgt.service.TemplateFileService templateFileService;
	@BeanReference(type = TemplateFilePersistence.class)
	protected TemplateFilePersistence templateFilePersistence;
	@BeanReference(type = TemplateFileFinder.class)
	protected TemplateFileFinder templateFileFinder;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private ServiceFileTemplateLocalServiceClpInvoker _clpInvoker = new ServiceFileTemplateLocalServiceClpInvoker();
}