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

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PaymentFileLocalService}.
 *
 * @author trungdk
 * @see PaymentFileLocalService
 * @generated
 */
public class PaymentFileLocalServiceWrapper implements PaymentFileLocalService,
	ServiceWrapper<PaymentFileLocalService> {
	public PaymentFileLocalServiceWrapper(
		PaymentFileLocalService paymentFileLocalService) {
		_paymentFileLocalService = paymentFileLocalService;
	}

	/**
	* Adds the Payment file to the database. Also notifies the appropriate model listeners.
	*
	* @param paymentFile the Payment file
	* @return the Payment file that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.opencps.paymentmgt.model.PaymentFile addPaymentFile(
		org.opencps.paymentmgt.model.PaymentFile paymentFile)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentFileLocalService.addPaymentFile(paymentFile);
	}

	/**
	* Creates a new Payment file with the primary key. Does not add the Payment file to the database.
	*
	* @param paymentFileId the primary key for the new Payment file
	* @return the new Payment file
	*/
	@Override
	public org.opencps.paymentmgt.model.PaymentFile createPaymentFile(
		long paymentFileId) {
		return _paymentFileLocalService.createPaymentFile(paymentFileId);
	}

	/**
	* Deletes the Payment file with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param paymentFileId the primary key of the Payment file
	* @return the Payment file that was removed
	* @throws PortalException if a Payment file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.opencps.paymentmgt.model.PaymentFile deletePaymentFile(
		long paymentFileId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _paymentFileLocalService.deletePaymentFile(paymentFileId);
	}

	/**
	* Deletes the Payment file from the database. Also notifies the appropriate model listeners.
	*
	* @param paymentFile the Payment file
	* @return the Payment file that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.opencps.paymentmgt.model.PaymentFile deletePaymentFile(
		org.opencps.paymentmgt.model.PaymentFile paymentFile)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentFileLocalService.deletePaymentFile(paymentFile);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _paymentFileLocalService.dynamicQuery();
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
		return _paymentFileLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.paymentmgt.model.impl.PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _paymentFileLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.paymentmgt.model.impl.PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _paymentFileLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
		return _paymentFileLocalService.dynamicQueryCount(dynamicQuery);
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
		return _paymentFileLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.opencps.paymentmgt.model.PaymentFile fetchPaymentFile(
		long paymentFileId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentFileLocalService.fetchPaymentFile(paymentFileId);
	}

	/**
	* Returns the Payment file with the matching UUID and company.
	*
	* @param uuid the Payment file's UUID
	* @param companyId the primary key of the company
	* @return the matching Payment file, or <code>null</code> if a matching Payment file could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.opencps.paymentmgt.model.PaymentFile fetchPaymentFileByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentFileLocalService.fetchPaymentFileByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the Payment file matching the UUID and group.
	*
	* @param uuid the Payment file's UUID
	* @param groupId the primary key of the group
	* @return the matching Payment file, or <code>null</code> if a matching Payment file could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.opencps.paymentmgt.model.PaymentFile fetchPaymentFileByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentFileLocalService.fetchPaymentFileByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns the Payment file with the primary key.
	*
	* @param paymentFileId the primary key of the Payment file
	* @return the Payment file
	* @throws PortalException if a Payment file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.opencps.paymentmgt.model.PaymentFile getPaymentFile(
		long paymentFileId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _paymentFileLocalService.getPaymentFile(paymentFileId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _paymentFileLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the Payment file with the matching UUID and company.
	*
	* @param uuid the Payment file's UUID
	* @param companyId the primary key of the company
	* @return the matching Payment file
	* @throws PortalException if a matching Payment file could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.opencps.paymentmgt.model.PaymentFile getPaymentFileByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _paymentFileLocalService.getPaymentFileByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the Payment file matching the UUID and group.
	*
	* @param uuid the Payment file's UUID
	* @param groupId the primary key of the group
	* @return the matching Payment file
	* @throws PortalException if a matching Payment file could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.opencps.paymentmgt.model.PaymentFile getPaymentFileByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _paymentFileLocalService.getPaymentFileByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns a range of all the Payment files.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.paymentmgt.model.impl.PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Payment files
	* @param end the upper bound of the range of Payment files (not inclusive)
	* @return the range of Payment files
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.opencps.paymentmgt.model.PaymentFile> getPaymentFiles(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentFileLocalService.getPaymentFiles(start, end);
	}

	/**
	* Returns the number of Payment files.
	*
	* @return the number of Payment files
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getPaymentFilesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentFileLocalService.getPaymentFilesCount();
	}

	/**
	* Updates the Payment file in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param paymentFile the Payment file
	* @return the Payment file that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.opencps.paymentmgt.model.PaymentFile updatePaymentFile(
		org.opencps.paymentmgt.model.PaymentFile paymentFile)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentFileLocalService.updatePaymentFile(paymentFile);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _paymentFileLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_paymentFileLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _paymentFileLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* @param keypayTransactionId
	* @return
	* @throws PortalException
	* @throws SystemException
	*/
	@Override
	public org.opencps.paymentmgt.model.PaymentFile getByTransactionId(
		long keypayTransactionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _paymentFileLocalService.getByTransactionId(keypayTransactionId);
	}

	/**
	* @param keypayGoodCode
	* @return
	* @throws PortalException
	* @throws SystemException
	*/
	@Override
	public org.opencps.paymentmgt.model.PaymentFile getByGoodCode(
		java.lang.String keypayGoodCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _paymentFileLocalService.getByGoodCode(keypayGoodCode);
	}

	/**
	* @param dossierId
	* @return
	* @throws PortalException
	* @throws SystemException
	*/
	@Override
	public int countAllPaymentFile(long dossierId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _paymentFileLocalService.countAllPaymentFile(dossierId);
	}

	/**
	* @param dossierId
	* @param paymentStatus
	* @return
	* @throws PortalException
	* @throws SystemException
	*/
	@Override
	public int countPaymentFile(long dossierId, int paymentStatus)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _paymentFileLocalService.countPaymentFile(dossierId,
			paymentStatus);
	}

	@Override
	public org.opencps.paymentmgt.model.PaymentFile addPaymentFile(
		long userId, long dossierId, long fileGroupId, long ownerUserId,
		long ownerOrganizationId, long govAgencyOrganizationId,
		java.lang.String paymentName, java.util.Date requestDatetime,
		java.lang.Double amount, java.lang.String requestNote,
		java.lang.String placeInfo,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentFileLocalService.addPaymentFile(userId, dossierId,
			fileGroupId, ownerUserId, ownerOrganizationId,
			govAgencyOrganizationId, paymentName, requestDatetime, amount,
			requestNote, placeInfo, serviceContext);
	}

	@Override
	public java.util.List<org.opencps.paymentmgt.model.PaymentFile> searchPaymentFiles(
		long groupId, java.lang.String paymentStatus,
		java.lang.String keywords, int start, int end) {
		return _paymentFileLocalService.searchPaymentFiles(groupId,
			paymentStatus, keywords, start, end);
	}

	@Override
	public int countPaymentFiles(long groupId, java.lang.String paymentStatus,
		java.lang.String keywords) {
		return _paymentFileLocalService.countPaymentFiles(groupId,
			paymentStatus, keywords);
	}

	@Override
	public int countCustomerPaymentFile(long groupId, java.lang.String keyword,
		boolean isCitizen, long customerId, int paymentStatus) {
		return _paymentFileLocalService.countCustomerPaymentFile(groupId,
			keyword, isCitizen, customerId, paymentStatus);
	}

	@Override
	public java.util.List<org.opencps.paymentmgt.model.PaymentFile> searchCustomerPaymentFile(
		long groupId, java.lang.String keyword, boolean isCitizen,
		long customerId, int paymentStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc) {
		return _paymentFileLocalService.searchCustomerPaymentFile(groupId,
			keyword, isCitizen, customerId, paymentStatus, start, end, obc);
	}

	@Override
	public int countCustomerPaymentFileNewRequest(long groupId,
		java.lang.String keyword, boolean isCitizen, long customerId,
		int[] paymentStatus) {
		return _paymentFileLocalService.countCustomerPaymentFileNewRequest(groupId,
			keyword, isCitizen, customerId, paymentStatus);
	}

	@Override
	public java.util.List<org.opencps.paymentmgt.model.PaymentFile> searchCustomerPaymentFileNewRequest(
		long groupId, java.lang.String keyword, boolean isCitizen,
		long customerId, int[] paymentStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc) {
		return _paymentFileLocalService.searchCustomerPaymentFileNewRequest(groupId,
			keyword, isCitizen, customerId, paymentStatus, start, end, obc);
	}

	@Override
	public org.opencps.paymentmgt.model.PaymentFile getPaymentFileByGoodCode(
		long groupId, java.lang.String keypayGoodCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentFileLocalService.getPaymentFileByGoodCode(groupId,
			keypayGoodCode);
	}

	@Override
	public org.opencps.paymentmgt.model.PaymentFile getPaymentFileByMerchantResponse(
		long keypayTransactionId, java.lang.String keypayGoodCode, double amount)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentFileLocalService.getPaymentFileByMerchantResponse(keypayTransactionId,
			keypayGoodCode, amount);
	}

	/**
	* @param dossierId
	* @param fileGroupId
	* @param ownerUserId
	* @param ownerOrganizationId
	* @param govAgencyOrganizationId
	* @param paymentName
	* @param requestDatetime
	* @param amount
	* @param requestNote
	* @param placeInfo
	* @return
	* @throws SystemException
	*/
	@Override
	public org.opencps.paymentmgt.model.PaymentFile addPaymentFile(
		long dossierId, long fileGroupId, long ownerUserId,
		long ownerOrganizationId, long govAgencyOrganizationId,
		java.lang.String paymentName, java.util.Date requestDatetime,
		java.lang.Double amount, java.lang.String requestNote,
		java.lang.String placeInfo, java.lang.String paymentOptions)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentFileLocalService.addPaymentFile(dossierId, fileGroupId,
			ownerUserId, ownerOrganizationId, govAgencyOrganizationId,
			paymentName, requestDatetime, amount, requestNote, placeInfo,
			paymentOptions);
	}

	/**
	* @param paymentFileId
	* @param keypayUrl
	* @param keypayTransactionId
	* @param keypayGoodCode
	* @param keypayMerchantCode
	* @return
	* @throws PortalException
	* @throws SystemException
	*/
	@Override
	public org.opencps.paymentmgt.model.PaymentFile updatePaymentFile(
		long paymentFileId, java.lang.String keypayUrl,
		long keypayTransactionId, java.lang.String keypayGoodCode,
		java.lang.String keypayMerchantCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _paymentFileLocalService.updatePaymentFile(paymentFileId,
			keypayUrl, keypayTransactionId, keypayGoodCode, keypayMerchantCode);
	}

	@Override
	public java.util.List<org.opencps.paymentmgt.model.PaymentFile> getPaymentFileByD_(
		long dossierId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentFileLocalService.getPaymentFileByD_(dossierId);
	}

	@Override
	public org.opencps.paymentmgt.model.PaymentFile syncPaymentFile(
		java.lang.String oid, java.lang.String typeUpdate, int paymentStatus,
		int paymentMethod, java.lang.String approveNote, byte[] bytes,
		long folderId, java.lang.String sourceFileName,
		java.lang.String mimeType, java.lang.String title,
		java.lang.String description, java.lang.String changeLog,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _paymentFileLocalService.syncPaymentFile(oid, typeUpdate,
			paymentStatus, paymentMethod, approveNote, bytes, folderId,
			sourceFileName, mimeType, title, description, changeLog,
			serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public PaymentFileLocalService getWrappedPaymentFileLocalService() {
		return _paymentFileLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedPaymentFileLocalService(
		PaymentFileLocalService paymentFileLocalService) {
		_paymentFileLocalService = paymentFileLocalService;
	}

	@Override
	public PaymentFileLocalService getWrappedService() {
		return _paymentFileLocalService;
	}

	@Override
	public void setWrappedService(
		PaymentFileLocalService paymentFileLocalService) {
		_paymentFileLocalService = paymentFileLocalService;
	}

	private PaymentFileLocalService _paymentFileLocalService;
}