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

package org.opencps.paymentmgt.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for PaymentConfig. This utility wraps
 * {@link org.opencps.paymentmgt.service.impl.PaymentConfigLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author trungdk
 * @see PaymentConfigLocalService
 * @see org.opencps.paymentmgt.service.base.PaymentConfigLocalServiceBaseImpl
 * @see org.opencps.paymentmgt.service.impl.PaymentConfigLocalServiceImpl
 * @generated
 */
public class PaymentConfigLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.opencps.paymentmgt.service.impl.PaymentConfigLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the Payment configuration to the database. Also notifies the appropriate model listeners.
	*
	* @param paymentConfig the Payment configuration
	* @return the Payment configuration that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.paymentmgt.model.PaymentConfig addPaymentConfig(
		org.opencps.paymentmgt.model.PaymentConfig paymentConfig)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addPaymentConfig(paymentConfig);
	}

	/**
	* Creates a new Payment configuration with the primary key. Does not add the Payment configuration to the database.
	*
	* @param paymentConfigId the primary key for the new Payment configuration
	* @return the new Payment configuration
	*/
	public static org.opencps.paymentmgt.model.PaymentConfig createPaymentConfig(
		long paymentConfigId) {
		return getService().createPaymentConfig(paymentConfigId);
	}

	/**
	* Deletes the Payment configuration with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param paymentConfigId the primary key of the Payment configuration
	* @return the Payment configuration that was removed
	* @throws PortalException if a Payment configuration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.paymentmgt.model.PaymentConfig deletePaymentConfig(
		long paymentConfigId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deletePaymentConfig(paymentConfigId);
	}

	/**
	* Deletes the Payment configuration from the database. Also notifies the appropriate model listeners.
	*
	* @param paymentConfig the Payment configuration
	* @return the Payment configuration that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.paymentmgt.model.PaymentConfig deletePaymentConfig(
		org.opencps.paymentmgt.model.PaymentConfig paymentConfig)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deletePaymentConfig(paymentConfig);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.paymentmgt.model.impl.PaymentConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static org.opencps.paymentmgt.model.PaymentConfig fetchPaymentConfig(
		long paymentConfigId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchPaymentConfig(paymentConfigId);
	}

	/**
	* Returns the Payment configuration with the primary key.
	*
	* @param paymentConfigId the primary key of the Payment configuration
	* @return the Payment configuration
	* @throws PortalException if a Payment configuration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.paymentmgt.model.PaymentConfig getPaymentConfig(
		long paymentConfigId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPaymentConfig(paymentConfigId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<org.opencps.paymentmgt.model.PaymentConfig> getPaymentConfigs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPaymentConfigs(start, end);
	}

	/**
	* Returns the number of Payment configurations.
	*
	* @return the number of Payment configurations
	* @throws SystemException if a system exception occurred
	*/
	public static int getPaymentConfigsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPaymentConfigsCount();
	}

	/**
	* Updates the Payment configuration in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param paymentConfig the Payment configuration
	* @return the Payment configuration that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.paymentmgt.model.PaymentConfig updatePaymentConfig(
		org.opencps.paymentmgt.model.PaymentConfig paymentConfig)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatePaymentConfig(paymentConfig);
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

	public static org.opencps.paymentmgt.model.PaymentConfig addPaymentConfig(
		long govAgencyOrganizationId, java.lang.String govAgencyName,
		java.lang.String govAgencyTaxNo, java.lang.String invoiceTemplateNo,
		java.lang.String invoiceIssueNo, java.lang.String invoiceLastNo,
		java.lang.String bankInfo, java.lang.String placeInfo,
		java.lang.String keypayDomain, java.lang.String keypayVersion,
		java.lang.String keypayMerchantCode, java.lang.String keypaySecureKey,
		java.lang.String reportTemplate, long userId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addPaymentConfig(govAgencyOrganizationId, govAgencyName,
			govAgencyTaxNo, invoiceTemplateNo, invoiceIssueNo, invoiceLastNo,
			bankInfo, placeInfo, keypayDomain, keypayVersion,
			keypayMerchantCode, keypaySecureKey, reportTemplate, userId,
			serviceContext);
	}

	public static org.opencps.paymentmgt.model.PaymentConfig updatePaymentConfig(
		long paymentConfigId, long govAgencyOrganizationId,
		java.lang.String govAgencyName, java.lang.String govAgencyTaxNo,
		java.lang.String invoiceTemplateNo, java.lang.String invoiceIssueNo,
		java.lang.String invoiceLastNo, java.lang.String bankInfo,
		java.lang.String placeInfo, java.lang.String keypayDomain,
		java.lang.String keypayVersion, java.lang.String keypayMerchantCode,
		java.lang.String keypaySecureKey, java.lang.String reportTemplate,
		long userId, com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updatePaymentConfig(paymentConfigId,
			govAgencyOrganizationId, govAgencyName, govAgencyTaxNo,
			invoiceTemplateNo, invoiceIssueNo, invoiceLastNo, bankInfo,
			placeInfo, keypayDomain, keypayVersion, keypayMerchantCode,
			keypaySecureKey, reportTemplate, userId, serviceContext);
	}

	public static org.opencps.paymentmgt.model.PaymentConfig getPaymentConfigByGovAgency(
		long groupId, long govAgencyOrganizationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getPaymentConfigByGovAgency(groupId, govAgencyOrganizationId);
	}

	public static void clearService() {
		_service = null;
	}

	public static PaymentConfigLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					PaymentConfigLocalService.class.getName());

			if (invokableLocalService instanceof PaymentConfigLocalService) {
				_service = (PaymentConfigLocalService)invokableLocalService;
			}
			else {
				_service = new PaymentConfigLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(PaymentConfigLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(PaymentConfigLocalService service) {
	}

	private static PaymentConfigLocalService _service;
}