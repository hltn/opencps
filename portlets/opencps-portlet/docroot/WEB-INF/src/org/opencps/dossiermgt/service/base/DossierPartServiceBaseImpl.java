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

package org.opencps.dossiermgt.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import org.opencps.dossiermgt.model.DossierPart;
import org.opencps.dossiermgt.service.DossierPartService;
import org.opencps.dossiermgt.service.persistence.DossierFileFinder;
import org.opencps.dossiermgt.service.persistence.DossierFilePersistence;
import org.opencps.dossiermgt.service.persistence.DossierFinder;
import org.opencps.dossiermgt.service.persistence.DossierLogFinder;
import org.opencps.dossiermgt.service.persistence.DossierLogPersistence;
import org.opencps.dossiermgt.service.persistence.DossierPartPersistence;
import org.opencps.dossiermgt.service.persistence.DossierPersistence;
import org.opencps.dossiermgt.service.persistence.DossierStatusPersistence;
import org.opencps.dossiermgt.service.persistence.DossierTemplatePersistence;
import org.opencps.dossiermgt.service.persistence.FileGroupPersistence;
import org.opencps.dossiermgt.service.persistence.ServiceConfigFinder;
import org.opencps.dossiermgt.service.persistence.ServiceConfigPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the dossier part remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link org.opencps.dossiermgt.service.impl.DossierPartServiceImpl}.
 * </p>
 *
 * @author trungnt
 * @see org.opencps.dossiermgt.service.impl.DossierPartServiceImpl
 * @see org.opencps.dossiermgt.service.DossierPartServiceUtil
 * @generated
 */
public abstract class DossierPartServiceBaseImpl extends BaseServiceImpl
	implements DossierPartService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link org.opencps.dossiermgt.service.DossierPartServiceUtil} to access the dossier part remote service.
	 */

	/**
	 * Returns the dossier local service.
	 *
	 * @return the dossier local service
	 */
	public org.opencps.dossiermgt.service.DossierLocalService getDossierLocalService() {
		return dossierLocalService;
	}

	/**
	 * Sets the dossier local service.
	 *
	 * @param dossierLocalService the dossier local service
	 */
	public void setDossierLocalService(
		org.opencps.dossiermgt.service.DossierLocalService dossierLocalService) {
		this.dossierLocalService = dossierLocalService;
	}

	/**
	 * Returns the dossier remote service.
	 *
	 * @return the dossier remote service
	 */
	public org.opencps.dossiermgt.service.DossierService getDossierService() {
		return dossierService;
	}

	/**
	 * Sets the dossier remote service.
	 *
	 * @param dossierService the dossier remote service
	 */
	public void setDossierService(
		org.opencps.dossiermgt.service.DossierService dossierService) {
		this.dossierService = dossierService;
	}

	/**
	 * Returns the dossier persistence.
	 *
	 * @return the dossier persistence
	 */
	public DossierPersistence getDossierPersistence() {
		return dossierPersistence;
	}

	/**
	 * Sets the dossier persistence.
	 *
	 * @param dossierPersistence the dossier persistence
	 */
	public void setDossierPersistence(DossierPersistence dossierPersistence) {
		this.dossierPersistence = dossierPersistence;
	}

	/**
	 * Returns the dossier finder.
	 *
	 * @return the dossier finder
	 */
	public DossierFinder getDossierFinder() {
		return dossierFinder;
	}

	/**
	 * Sets the dossier finder.
	 *
	 * @param dossierFinder the dossier finder
	 */
	public void setDossierFinder(DossierFinder dossierFinder) {
		this.dossierFinder = dossierFinder;
	}

	/**
	 * Returns the dossier file local service.
	 *
	 * @return the dossier file local service
	 */
	public org.opencps.dossiermgt.service.DossierFileLocalService getDossierFileLocalService() {
		return dossierFileLocalService;
	}

	/**
	 * Sets the dossier file local service.
	 *
	 * @param dossierFileLocalService the dossier file local service
	 */
	public void setDossierFileLocalService(
		org.opencps.dossiermgt.service.DossierFileLocalService dossierFileLocalService) {
		this.dossierFileLocalService = dossierFileLocalService;
	}

	/**
	 * Returns the dossier file remote service.
	 *
	 * @return the dossier file remote service
	 */
	public org.opencps.dossiermgt.service.DossierFileService getDossierFileService() {
		return dossierFileService;
	}

	/**
	 * Sets the dossier file remote service.
	 *
	 * @param dossierFileService the dossier file remote service
	 */
	public void setDossierFileService(
		org.opencps.dossiermgt.service.DossierFileService dossierFileService) {
		this.dossierFileService = dossierFileService;
	}

	/**
	 * Returns the dossier file persistence.
	 *
	 * @return the dossier file persistence
	 */
	public DossierFilePersistence getDossierFilePersistence() {
		return dossierFilePersistence;
	}

	/**
	 * Sets the dossier file persistence.
	 *
	 * @param dossierFilePersistence the dossier file persistence
	 */
	public void setDossierFilePersistence(
		DossierFilePersistence dossierFilePersistence) {
		this.dossierFilePersistence = dossierFilePersistence;
	}

	/**
	 * Returns the dossier file finder.
	 *
	 * @return the dossier file finder
	 */
	public DossierFileFinder getDossierFileFinder() {
		return dossierFileFinder;
	}

	/**
	 * Sets the dossier file finder.
	 *
	 * @param dossierFileFinder the dossier file finder
	 */
	public void setDossierFileFinder(DossierFileFinder dossierFileFinder) {
		this.dossierFileFinder = dossierFileFinder;
	}

	/**
	 * Returns the dossier log local service.
	 *
	 * @return the dossier log local service
	 */
	public org.opencps.dossiermgt.service.DossierLogLocalService getDossierLogLocalService() {
		return dossierLogLocalService;
	}

	/**
	 * Sets the dossier log local service.
	 *
	 * @param dossierLogLocalService the dossier log local service
	 */
	public void setDossierLogLocalService(
		org.opencps.dossiermgt.service.DossierLogLocalService dossierLogLocalService) {
		this.dossierLogLocalService = dossierLogLocalService;
	}

	/**
	 * Returns the dossier log remote service.
	 *
	 * @return the dossier log remote service
	 */
	public org.opencps.dossiermgt.service.DossierLogService getDossierLogService() {
		return dossierLogService;
	}

	/**
	 * Sets the dossier log remote service.
	 *
	 * @param dossierLogService the dossier log remote service
	 */
	public void setDossierLogService(
		org.opencps.dossiermgt.service.DossierLogService dossierLogService) {
		this.dossierLogService = dossierLogService;
	}

	/**
	 * Returns the dossier log persistence.
	 *
	 * @return the dossier log persistence
	 */
	public DossierLogPersistence getDossierLogPersistence() {
		return dossierLogPersistence;
	}

	/**
	 * Sets the dossier log persistence.
	 *
	 * @param dossierLogPersistence the dossier log persistence
	 */
	public void setDossierLogPersistence(
		DossierLogPersistence dossierLogPersistence) {
		this.dossierLogPersistence = dossierLogPersistence;
	}

	/**
	 * Returns the dossier log finder.
	 *
	 * @return the dossier log finder
	 */
	public DossierLogFinder getDossierLogFinder() {
		return dossierLogFinder;
	}

	/**
	 * Sets the dossier log finder.
	 *
	 * @param dossierLogFinder the dossier log finder
	 */
	public void setDossierLogFinder(DossierLogFinder dossierLogFinder) {
		this.dossierLogFinder = dossierLogFinder;
	}

	/**
	 * Returns the dossier part local service.
	 *
	 * @return the dossier part local service
	 */
	public org.opencps.dossiermgt.service.DossierPartLocalService getDossierPartLocalService() {
		return dossierPartLocalService;
	}

	/**
	 * Sets the dossier part local service.
	 *
	 * @param dossierPartLocalService the dossier part local service
	 */
	public void setDossierPartLocalService(
		org.opencps.dossiermgt.service.DossierPartLocalService dossierPartLocalService) {
		this.dossierPartLocalService = dossierPartLocalService;
	}

	/**
	 * Returns the dossier part remote service.
	 *
	 * @return the dossier part remote service
	 */
	public org.opencps.dossiermgt.service.DossierPartService getDossierPartService() {
		return dossierPartService;
	}

	/**
	 * Sets the dossier part remote service.
	 *
	 * @param dossierPartService the dossier part remote service
	 */
	public void setDossierPartService(
		org.opencps.dossiermgt.service.DossierPartService dossierPartService) {
		this.dossierPartService = dossierPartService;
	}

	/**
	 * Returns the dossier part persistence.
	 *
	 * @return the dossier part persistence
	 */
	public DossierPartPersistence getDossierPartPersistence() {
		return dossierPartPersistence;
	}

	/**
	 * Sets the dossier part persistence.
	 *
	 * @param dossierPartPersistence the dossier part persistence
	 */
	public void setDossierPartPersistence(
		DossierPartPersistence dossierPartPersistence) {
		this.dossierPartPersistence = dossierPartPersistence;
	}

	/**
	 * Returns the dossier status local service.
	 *
	 * @return the dossier status local service
	 */
	public org.opencps.dossiermgt.service.DossierStatusLocalService getDossierStatusLocalService() {
		return dossierStatusLocalService;
	}

	/**
	 * Sets the dossier status local service.
	 *
	 * @param dossierStatusLocalService the dossier status local service
	 */
	public void setDossierStatusLocalService(
		org.opencps.dossiermgt.service.DossierStatusLocalService dossierStatusLocalService) {
		this.dossierStatusLocalService = dossierStatusLocalService;
	}

	/**
	 * Returns the dossier status remote service.
	 *
	 * @return the dossier status remote service
	 */
	public org.opencps.dossiermgt.service.DossierStatusService getDossierStatusService() {
		return dossierStatusService;
	}

	/**
	 * Sets the dossier status remote service.
	 *
	 * @param dossierStatusService the dossier status remote service
	 */
	public void setDossierStatusService(
		org.opencps.dossiermgt.service.DossierStatusService dossierStatusService) {
		this.dossierStatusService = dossierStatusService;
	}

	/**
	 * Returns the dossier status persistence.
	 *
	 * @return the dossier status persistence
	 */
	public DossierStatusPersistence getDossierStatusPersistence() {
		return dossierStatusPersistence;
	}

	/**
	 * Sets the dossier status persistence.
	 *
	 * @param dossierStatusPersistence the dossier status persistence
	 */
	public void setDossierStatusPersistence(
		DossierStatusPersistence dossierStatusPersistence) {
		this.dossierStatusPersistence = dossierStatusPersistence;
	}

	/**
	 * Returns the dossier template local service.
	 *
	 * @return the dossier template local service
	 */
	public org.opencps.dossiermgt.service.DossierTemplateLocalService getDossierTemplateLocalService() {
		return dossierTemplateLocalService;
	}

	/**
	 * Sets the dossier template local service.
	 *
	 * @param dossierTemplateLocalService the dossier template local service
	 */
	public void setDossierTemplateLocalService(
		org.opencps.dossiermgt.service.DossierTemplateLocalService dossierTemplateLocalService) {
		this.dossierTemplateLocalService = dossierTemplateLocalService;
	}

	/**
	 * Returns the dossier template remote service.
	 *
	 * @return the dossier template remote service
	 */
	public org.opencps.dossiermgt.service.DossierTemplateService getDossierTemplateService() {
		return dossierTemplateService;
	}

	/**
	 * Sets the dossier template remote service.
	 *
	 * @param dossierTemplateService the dossier template remote service
	 */
	public void setDossierTemplateService(
		org.opencps.dossiermgt.service.DossierTemplateService dossierTemplateService) {
		this.dossierTemplateService = dossierTemplateService;
	}

	/**
	 * Returns the dossier template persistence.
	 *
	 * @return the dossier template persistence
	 */
	public DossierTemplatePersistence getDossierTemplatePersistence() {
		return dossierTemplatePersistence;
	}

	/**
	 * Sets the dossier template persistence.
	 *
	 * @param dossierTemplatePersistence the dossier template persistence
	 */
	public void setDossierTemplatePersistence(
		DossierTemplatePersistence dossierTemplatePersistence) {
		this.dossierTemplatePersistence = dossierTemplatePersistence;
	}

	/**
	 * Returns the file group local service.
	 *
	 * @return the file group local service
	 */
	public org.opencps.dossiermgt.service.FileGroupLocalService getFileGroupLocalService() {
		return fileGroupLocalService;
	}

	/**
	 * Sets the file group local service.
	 *
	 * @param fileGroupLocalService the file group local service
	 */
	public void setFileGroupLocalService(
		org.opencps.dossiermgt.service.FileGroupLocalService fileGroupLocalService) {
		this.fileGroupLocalService = fileGroupLocalService;
	}

	/**
	 * Returns the file group remote service.
	 *
	 * @return the file group remote service
	 */
	public org.opencps.dossiermgt.service.FileGroupService getFileGroupService() {
		return fileGroupService;
	}

	/**
	 * Sets the file group remote service.
	 *
	 * @param fileGroupService the file group remote service
	 */
	public void setFileGroupService(
		org.opencps.dossiermgt.service.FileGroupService fileGroupService) {
		this.fileGroupService = fileGroupService;
	}

	/**
	 * Returns the file group persistence.
	 *
	 * @return the file group persistence
	 */
	public FileGroupPersistence getFileGroupPersistence() {
		return fileGroupPersistence;
	}

	/**
	 * Sets the file group persistence.
	 *
	 * @param fileGroupPersistence the file group persistence
	 */
	public void setFileGroupPersistence(
		FileGroupPersistence fileGroupPersistence) {
		this.fileGroupPersistence = fileGroupPersistence;
	}

	/**
	 * Returns the service config local service.
	 *
	 * @return the service config local service
	 */
	public org.opencps.dossiermgt.service.ServiceConfigLocalService getServiceConfigLocalService() {
		return serviceConfigLocalService;
	}

	/**
	 * Sets the service config local service.
	 *
	 * @param serviceConfigLocalService the service config local service
	 */
	public void setServiceConfigLocalService(
		org.opencps.dossiermgt.service.ServiceConfigLocalService serviceConfigLocalService) {
		this.serviceConfigLocalService = serviceConfigLocalService;
	}

	/**
	 * Returns the service config remote service.
	 *
	 * @return the service config remote service
	 */
	public org.opencps.dossiermgt.service.ServiceConfigService getServiceConfigService() {
		return serviceConfigService;
	}

	/**
	 * Sets the service config remote service.
	 *
	 * @param serviceConfigService the service config remote service
	 */
	public void setServiceConfigService(
		org.opencps.dossiermgt.service.ServiceConfigService serviceConfigService) {
		this.serviceConfigService = serviceConfigService;
	}

	/**
	 * Returns the service config persistence.
	 *
	 * @return the service config persistence
	 */
	public ServiceConfigPersistence getServiceConfigPersistence() {
		return serviceConfigPersistence;
	}

	/**
	 * Sets the service config persistence.
	 *
	 * @param serviceConfigPersistence the service config persistence
	 */
	public void setServiceConfigPersistence(
		ServiceConfigPersistence serviceConfigPersistence) {
		this.serviceConfigPersistence = serviceConfigPersistence;
	}

	/**
	 * Returns the service config finder.
	 *
	 * @return the service config finder
	 */
	public ServiceConfigFinder getServiceConfigFinder() {
		return serviceConfigFinder;
	}

	/**
	 * Sets the service config finder.
	 *
	 * @param serviceConfigFinder the service config finder
	 */
	public void setServiceConfigFinder(ServiceConfigFinder serviceConfigFinder) {
		this.serviceConfigFinder = serviceConfigFinder;
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
	}

	public void destroy() {
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
		return DossierPart.class;
	}

	protected String getModelClassName() {
		return DossierPart.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = dossierPartPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = org.opencps.dossiermgt.service.DossierLocalService.class)
	protected org.opencps.dossiermgt.service.DossierLocalService dossierLocalService;
	@BeanReference(type = org.opencps.dossiermgt.service.DossierService.class)
	protected org.opencps.dossiermgt.service.DossierService dossierService;
	@BeanReference(type = DossierPersistence.class)
	protected DossierPersistence dossierPersistence;
	@BeanReference(type = DossierFinder.class)
	protected DossierFinder dossierFinder;
	@BeanReference(type = org.opencps.dossiermgt.service.DossierFileLocalService.class)
	protected org.opencps.dossiermgt.service.DossierFileLocalService dossierFileLocalService;
	@BeanReference(type = org.opencps.dossiermgt.service.DossierFileService.class)
	protected org.opencps.dossiermgt.service.DossierFileService dossierFileService;
	@BeanReference(type = DossierFilePersistence.class)
	protected DossierFilePersistence dossierFilePersistence;
	@BeanReference(type = DossierFileFinder.class)
	protected DossierFileFinder dossierFileFinder;
	@BeanReference(type = org.opencps.dossiermgt.service.DossierLogLocalService.class)
	protected org.opencps.dossiermgt.service.DossierLogLocalService dossierLogLocalService;
	@BeanReference(type = org.opencps.dossiermgt.service.DossierLogService.class)
	protected org.opencps.dossiermgt.service.DossierLogService dossierLogService;
	@BeanReference(type = DossierLogPersistence.class)
	protected DossierLogPersistence dossierLogPersistence;
	@BeanReference(type = DossierLogFinder.class)
	protected DossierLogFinder dossierLogFinder;
	@BeanReference(type = org.opencps.dossiermgt.service.DossierPartLocalService.class)
	protected org.opencps.dossiermgt.service.DossierPartLocalService dossierPartLocalService;
	@BeanReference(type = org.opencps.dossiermgt.service.DossierPartService.class)
	protected org.opencps.dossiermgt.service.DossierPartService dossierPartService;
	@BeanReference(type = DossierPartPersistence.class)
	protected DossierPartPersistence dossierPartPersistence;
	@BeanReference(type = org.opencps.dossiermgt.service.DossierStatusLocalService.class)
	protected org.opencps.dossiermgt.service.DossierStatusLocalService dossierStatusLocalService;
	@BeanReference(type = org.opencps.dossiermgt.service.DossierStatusService.class)
	protected org.opencps.dossiermgt.service.DossierStatusService dossierStatusService;
	@BeanReference(type = DossierStatusPersistence.class)
	protected DossierStatusPersistence dossierStatusPersistence;
	@BeanReference(type = org.opencps.dossiermgt.service.DossierTemplateLocalService.class)
	protected org.opencps.dossiermgt.service.DossierTemplateLocalService dossierTemplateLocalService;
	@BeanReference(type = org.opencps.dossiermgt.service.DossierTemplateService.class)
	protected org.opencps.dossiermgt.service.DossierTemplateService dossierTemplateService;
	@BeanReference(type = DossierTemplatePersistence.class)
	protected DossierTemplatePersistence dossierTemplatePersistence;
	@BeanReference(type = org.opencps.dossiermgt.service.FileGroupLocalService.class)
	protected org.opencps.dossiermgt.service.FileGroupLocalService fileGroupLocalService;
	@BeanReference(type = org.opencps.dossiermgt.service.FileGroupService.class)
	protected org.opencps.dossiermgt.service.FileGroupService fileGroupService;
	@BeanReference(type = FileGroupPersistence.class)
	protected FileGroupPersistence fileGroupPersistence;
	@BeanReference(type = org.opencps.dossiermgt.service.ServiceConfigLocalService.class)
	protected org.opencps.dossiermgt.service.ServiceConfigLocalService serviceConfigLocalService;
	@BeanReference(type = org.opencps.dossiermgt.service.ServiceConfigService.class)
	protected org.opencps.dossiermgt.service.ServiceConfigService serviceConfigService;
	@BeanReference(type = ServiceConfigPersistence.class)
	protected ServiceConfigPersistence serviceConfigPersistence;
	@BeanReference(type = ServiceConfigFinder.class)
	protected ServiceConfigFinder serviceConfigFinder;
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
	private DossierPartServiceClpInvoker _clpInvoker = new DossierPartServiceClpInvoker();
}