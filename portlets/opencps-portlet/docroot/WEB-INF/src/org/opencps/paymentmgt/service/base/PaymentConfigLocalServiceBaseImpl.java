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

package org.opencps.paymentmgt.service.base;

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

import org.opencps.paymentmgt.model.PaymentConfig;
import org.opencps.paymentmgt.service.PaymentConfigLocalService;
import org.opencps.paymentmgt.service.persistence.PaymentConfigPersistence;
import org.opencps.paymentmgt.service.persistence.PaymentFileFinder;
import org.opencps.paymentmgt.service.persistence.PaymentFilePersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the Payment configuration local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link org.opencps.paymentmgt.service.impl.PaymentConfigLocalServiceImpl}.
 * </p>
 *
 * @author trungdk
 * @see org.opencps.paymentmgt.service.impl.PaymentConfigLocalServiceImpl
 * @see org.opencps.paymentmgt.service.PaymentConfigLocalServiceUtil
 * @generated
 */
public abstract class PaymentConfigLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements PaymentConfigLocalService,
		IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link org.opencps.paymentmgt.service.PaymentConfigLocalServiceUtil} to access the Payment configuration local service.
	 */

	/**
	 * Adds the Payment configuration to the database. Also notifies the appropriate model listeners.
	 *
	 * @param paymentConfig the Payment configuration
	 * @return the Payment configuration that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public PaymentConfig addPaymentConfig(PaymentConfig paymentConfig)
		throws SystemException {
		paymentConfig.setNew(true);

		return paymentConfigPersistence.update(paymentConfig);
	}

	/**
	 * Creates a new Payment configuration with the primary key. Does not add the Payment configuration to the database.
	 *
	 * @param paymentConfigId the primary key for the new Payment configuration
	 * @return the new Payment configuration
	 */
	@Override
	public PaymentConfig createPaymentConfig(long paymentConfigId) {
		return paymentConfigPersistence.create(paymentConfigId);
	}

	/**
	 * Deletes the Payment configuration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param paymentConfigId the primary key of the Payment configuration
	 * @return the Payment configuration that was removed
	 * @throws PortalException if a Payment configuration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public PaymentConfig deletePaymentConfig(long paymentConfigId)
		throws PortalException, SystemException {
		return paymentConfigPersistence.remove(paymentConfigId);
	}

	/**
	 * Deletes the Payment configuration from the database. Also notifies the appropriate model listeners.
	 *
	 * @param paymentConfig the Payment configuration
	 * @return the Payment configuration that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public PaymentConfig deletePaymentConfig(PaymentConfig paymentConfig)
		throws SystemException {
		return paymentConfigPersistence.remove(paymentConfig);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(PaymentConfig.class,
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
		return paymentConfigPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.paymentmgt.model.impl.PaymentConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return paymentConfigPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.paymentmgt.model.impl.PaymentConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return paymentConfigPersistence.findWithDynamicQuery(dynamicQuery,
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
		return paymentConfigPersistence.countWithDynamicQuery(dynamicQuery);
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
		return paymentConfigPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public PaymentConfig fetchPaymentConfig(long paymentConfigId)
		throws SystemException {
		return paymentConfigPersistence.fetchByPrimaryKey(paymentConfigId);
	}

	/**
	 * Returns the Payment configuration with the primary key.
	 *
	 * @param paymentConfigId the primary key of the Payment configuration
	 * @return the Payment configuration
	 * @throws PortalException if a Payment configuration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PaymentConfig getPaymentConfig(long paymentConfigId)
		throws PortalException, SystemException {
		return paymentConfigPersistence.findByPrimaryKey(paymentConfigId);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return paymentConfigPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the Payment configurations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.paymentmgt.model.impl.PaymentConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Payment configurations
	 * @param end the upper bound of the range of Payment configurations (not inclusive)
	 * @return the range of Payment configurations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PaymentConfig> getPaymentConfigs(int start, int end)
		throws SystemException {
		return paymentConfigPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of Payment configurations.
	 *
	 * @return the number of Payment configurations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getPaymentConfigsCount() throws SystemException {
		return paymentConfigPersistence.countAll();
	}

	/**
	 * Updates the Payment configuration in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param paymentConfig the Payment configuration
	 * @return the Payment configuration that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public PaymentConfig updatePaymentConfig(PaymentConfig paymentConfig)
		throws SystemException {
		return paymentConfigPersistence.update(paymentConfig);
	}

	/**
	 * Returns the Payment configuration local service.
	 *
	 * @return the Payment configuration local service
	 */
	public org.opencps.paymentmgt.service.PaymentConfigLocalService getPaymentConfigLocalService() {
		return paymentConfigLocalService;
	}

	/**
	 * Sets the Payment configuration local service.
	 *
	 * @param paymentConfigLocalService the Payment configuration local service
	 */
	public void setPaymentConfigLocalService(
		org.opencps.paymentmgt.service.PaymentConfigLocalService paymentConfigLocalService) {
		this.paymentConfigLocalService = paymentConfigLocalService;
	}

	/**
	 * Returns the Payment configuration remote service.
	 *
	 * @return the Payment configuration remote service
	 */
	public org.opencps.paymentmgt.service.PaymentConfigService getPaymentConfigService() {
		return paymentConfigService;
	}

	/**
	 * Sets the Payment configuration remote service.
	 *
	 * @param paymentConfigService the Payment configuration remote service
	 */
	public void setPaymentConfigService(
		org.opencps.paymentmgt.service.PaymentConfigService paymentConfigService) {
		this.paymentConfigService = paymentConfigService;
	}

	/**
	 * Returns the Payment configuration persistence.
	 *
	 * @return the Payment configuration persistence
	 */
	public PaymentConfigPersistence getPaymentConfigPersistence() {
		return paymentConfigPersistence;
	}

	/**
	 * Sets the Payment configuration persistence.
	 *
	 * @param paymentConfigPersistence the Payment configuration persistence
	 */
	public void setPaymentConfigPersistence(
		PaymentConfigPersistence paymentConfigPersistence) {
		this.paymentConfigPersistence = paymentConfigPersistence;
	}

	/**
	 * Returns the Payment file local service.
	 *
	 * @return the Payment file local service
	 */
	public org.opencps.paymentmgt.service.PaymentFileLocalService getPaymentFileLocalService() {
		return paymentFileLocalService;
	}

	/**
	 * Sets the Payment file local service.
	 *
	 * @param paymentFileLocalService the Payment file local service
	 */
	public void setPaymentFileLocalService(
		org.opencps.paymentmgt.service.PaymentFileLocalService paymentFileLocalService) {
		this.paymentFileLocalService = paymentFileLocalService;
	}

	/**
	 * Returns the Payment file remote service.
	 *
	 * @return the Payment file remote service
	 */
	public org.opencps.paymentmgt.service.PaymentFileService getPaymentFileService() {
		return paymentFileService;
	}

	/**
	 * Sets the Payment file remote service.
	 *
	 * @param paymentFileService the Payment file remote service
	 */
	public void setPaymentFileService(
		org.opencps.paymentmgt.service.PaymentFileService paymentFileService) {
		this.paymentFileService = paymentFileService;
	}

	/**
	 * Returns the Payment file persistence.
	 *
	 * @return the Payment file persistence
	 */
	public PaymentFilePersistence getPaymentFilePersistence() {
		return paymentFilePersistence;
	}

	/**
	 * Sets the Payment file persistence.
	 *
	 * @param paymentFilePersistence the Payment file persistence
	 */
	public void setPaymentFilePersistence(
		PaymentFilePersistence paymentFilePersistence) {
		this.paymentFilePersistence = paymentFilePersistence;
	}

	/**
	 * Returns the Payment file finder.
	 *
	 * @return the Payment file finder
	 */
	public PaymentFileFinder getPaymentFileFinder() {
		return paymentFileFinder;
	}

	/**
	 * Sets the Payment file finder.
	 *
	 * @param paymentFileFinder the Payment file finder
	 */
	public void setPaymentFileFinder(PaymentFileFinder paymentFileFinder) {
		this.paymentFileFinder = paymentFileFinder;
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

		PersistedModelLocalServiceRegistryUtil.register("org.opencps.paymentmgt.model.PaymentConfig",
			paymentConfigLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"org.opencps.paymentmgt.model.PaymentConfig");
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
		return PaymentConfig.class;
	}

	protected String getModelClassName() {
		return PaymentConfig.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = paymentConfigPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = org.opencps.paymentmgt.service.PaymentConfigLocalService.class)
	protected org.opencps.paymentmgt.service.PaymentConfigLocalService paymentConfigLocalService;
	@BeanReference(type = org.opencps.paymentmgt.service.PaymentConfigService.class)
	protected org.opencps.paymentmgt.service.PaymentConfigService paymentConfigService;
	@BeanReference(type = PaymentConfigPersistence.class)
	protected PaymentConfigPersistence paymentConfigPersistence;
	@BeanReference(type = org.opencps.paymentmgt.service.PaymentFileLocalService.class)
	protected org.opencps.paymentmgt.service.PaymentFileLocalService paymentFileLocalService;
	@BeanReference(type = org.opencps.paymentmgt.service.PaymentFileService.class)
	protected org.opencps.paymentmgt.service.PaymentFileService paymentFileService;
	@BeanReference(type = PaymentFilePersistence.class)
	protected PaymentFilePersistence paymentFilePersistence;
	@BeanReference(type = PaymentFileFinder.class)
	protected PaymentFileFinder paymentFileFinder;
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
	private PaymentConfigLocalServiceClpInvoker _clpInvoker = new PaymentConfigLocalServiceClpInvoker();
}