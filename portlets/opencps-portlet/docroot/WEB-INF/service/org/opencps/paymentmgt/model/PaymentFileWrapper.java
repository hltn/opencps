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

package org.opencps.paymentmgt.model;

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link PaymentFile}.
 * </p>
 *
 * @author trungdk
 * @see PaymentFile
 * @generated
 */
public class PaymentFileWrapper implements PaymentFile,
	ModelWrapper<PaymentFile> {
	public PaymentFileWrapper(PaymentFile paymentFile) {
		_paymentFile = paymentFile;
	}

	@Override
	public Class<?> getModelClass() {
		return PaymentFile.class;
	}

	@Override
	public String getModelClassName() {
		return PaymentFile.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("paymentFileId", getPaymentFileId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("dossierId", getDossierId());
		attributes.put("fileGroupId", getFileGroupId());
		attributes.put("ownerUserId", getOwnerUserId());
		attributes.put("ownerOrganizationId", getOwnerOrganizationId());
		attributes.put("govAgencyOrganizationId", getGovAgencyOrganizationId());
		attributes.put("paymentName", getPaymentName());
		attributes.put("requestDatetime", getRequestDatetime());
		attributes.put("amount", getAmount());
		attributes.put("requestNote", getRequestNote());
		attributes.put("paymentOptions", getPaymentOptions());
		attributes.put("keypayUrl", getKeypayUrl());
		attributes.put("keypayTransactionId", getKeypayTransactionId());
		attributes.put("keypayGoodCode", getKeypayGoodCode());
		attributes.put("keypayMerchantCode", getKeypayMerchantCode());
		attributes.put("bankInfo", getBankInfo());
		attributes.put("placeInfo", getPlaceInfo());
		attributes.put("paymentStatus", getPaymentStatus());
		attributes.put("paymentMethod", getPaymentMethod());
		attributes.put("confirmDatetime", getConfirmDatetime());
		attributes.put("confirmFileEntryId", getConfirmFileEntryId());
		attributes.put("approveDatetime", getApproveDatetime());
		attributes.put("accountUserName", getAccountUserName());
		attributes.put("approveNote", getApproveNote());
		attributes.put("govAgencyTaxNo", getGovAgencyTaxNo());
		attributes.put("invoiceTemplateNo", getInvoiceTemplateNo());
		attributes.put("invoiceIssueNo", getInvoiceIssueNo());
		attributes.put("invoiceNo", getInvoiceNo());
		attributes.put("syncStatus", getSyncStatus());
		attributes.put("oid", getOid());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long paymentFileId = (Long)attributes.get("paymentFileId");

		if (paymentFileId != null) {
			setPaymentFileId(paymentFileId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long dossierId = (Long)attributes.get("dossierId");

		if (dossierId != null) {
			setDossierId(dossierId);
		}

		Long fileGroupId = (Long)attributes.get("fileGroupId");

		if (fileGroupId != null) {
			setFileGroupId(fileGroupId);
		}

		Long ownerUserId = (Long)attributes.get("ownerUserId");

		if (ownerUserId != null) {
			setOwnerUserId(ownerUserId);
		}

		Long ownerOrganizationId = (Long)attributes.get("ownerOrganizationId");

		if (ownerOrganizationId != null) {
			setOwnerOrganizationId(ownerOrganizationId);
		}

		Long govAgencyOrganizationId = (Long)attributes.get(
				"govAgencyOrganizationId");

		if (govAgencyOrganizationId != null) {
			setGovAgencyOrganizationId(govAgencyOrganizationId);
		}

		String paymentName = (String)attributes.get("paymentName");

		if (paymentName != null) {
			setPaymentName(paymentName);
		}

		Date requestDatetime = (Date)attributes.get("requestDatetime");

		if (requestDatetime != null) {
			setRequestDatetime(requestDatetime);
		}

		Double amount = (Double)attributes.get("amount");

		if (amount != null) {
			setAmount(amount);
		}

		String requestNote = (String)attributes.get("requestNote");

		if (requestNote != null) {
			setRequestNote(requestNote);
		}

		String paymentOptions = (String)attributes.get("paymentOptions");

		if (paymentOptions != null) {
			setPaymentOptions(paymentOptions);
		}

		String keypayUrl = (String)attributes.get("keypayUrl");

		if (keypayUrl != null) {
			setKeypayUrl(keypayUrl);
		}

		Long keypayTransactionId = (Long)attributes.get("keypayTransactionId");

		if (keypayTransactionId != null) {
			setKeypayTransactionId(keypayTransactionId);
		}

		String keypayGoodCode = (String)attributes.get("keypayGoodCode");

		if (keypayGoodCode != null) {
			setKeypayGoodCode(keypayGoodCode);
		}

		String keypayMerchantCode = (String)attributes.get("keypayMerchantCode");

		if (keypayMerchantCode != null) {
			setKeypayMerchantCode(keypayMerchantCode);
		}

		String bankInfo = (String)attributes.get("bankInfo");

		if (bankInfo != null) {
			setBankInfo(bankInfo);
		}

		String placeInfo = (String)attributes.get("placeInfo");

		if (placeInfo != null) {
			setPlaceInfo(placeInfo);
		}

		Integer paymentStatus = (Integer)attributes.get("paymentStatus");

		if (paymentStatus != null) {
			setPaymentStatus(paymentStatus);
		}

		Integer paymentMethod = (Integer)attributes.get("paymentMethod");

		if (paymentMethod != null) {
			setPaymentMethod(paymentMethod);
		}

		Date confirmDatetime = (Date)attributes.get("confirmDatetime");

		if (confirmDatetime != null) {
			setConfirmDatetime(confirmDatetime);
		}

		Long confirmFileEntryId = (Long)attributes.get("confirmFileEntryId");

		if (confirmFileEntryId != null) {
			setConfirmFileEntryId(confirmFileEntryId);
		}

		Date approveDatetime = (Date)attributes.get("approveDatetime");

		if (approveDatetime != null) {
			setApproveDatetime(approveDatetime);
		}

		String accountUserName = (String)attributes.get("accountUserName");

		if (accountUserName != null) {
			setAccountUserName(accountUserName);
		}

		String approveNote = (String)attributes.get("approveNote");

		if (approveNote != null) {
			setApproveNote(approveNote);
		}

		String govAgencyTaxNo = (String)attributes.get("govAgencyTaxNo");

		if (govAgencyTaxNo != null) {
			setGovAgencyTaxNo(govAgencyTaxNo);
		}

		String invoiceTemplateNo = (String)attributes.get("invoiceTemplateNo");

		if (invoiceTemplateNo != null) {
			setInvoiceTemplateNo(invoiceTemplateNo);
		}

		String invoiceIssueNo = (String)attributes.get("invoiceIssueNo");

		if (invoiceIssueNo != null) {
			setInvoiceIssueNo(invoiceIssueNo);
		}

		String invoiceNo = (String)attributes.get("invoiceNo");

		if (invoiceNo != null) {
			setInvoiceNo(invoiceNo);
		}

		Integer syncStatus = (Integer)attributes.get("syncStatus");

		if (syncStatus != null) {
			setSyncStatus(syncStatus);
		}

		String oid = (String)attributes.get("oid");

		if (oid != null) {
			setOid(oid);
		}
	}

	/**
	* Returns the primary key of this Payment file.
	*
	* @return the primary key of this Payment file
	*/
	@Override
	public long getPrimaryKey() {
		return _paymentFile.getPrimaryKey();
	}

	/**
	* Sets the primary key of this Payment file.
	*
	* @param primaryKey the primary key of this Payment file
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_paymentFile.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this Payment file.
	*
	* @return the uuid of this Payment file
	*/
	@Override
	public java.lang.String getUuid() {
		return _paymentFile.getUuid();
	}

	/**
	* Sets the uuid of this Payment file.
	*
	* @param uuid the uuid of this Payment file
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_paymentFile.setUuid(uuid);
	}

	/**
	* Returns the payment file ID of this Payment file.
	*
	* @return the payment file ID of this Payment file
	*/
	@Override
	public long getPaymentFileId() {
		return _paymentFile.getPaymentFileId();
	}

	/**
	* Sets the payment file ID of this Payment file.
	*
	* @param paymentFileId the payment file ID of this Payment file
	*/
	@Override
	public void setPaymentFileId(long paymentFileId) {
		_paymentFile.setPaymentFileId(paymentFileId);
	}

	/**
	* Returns the company ID of this Payment file.
	*
	* @return the company ID of this Payment file
	*/
	@Override
	public long getCompanyId() {
		return _paymentFile.getCompanyId();
	}

	/**
	* Sets the company ID of this Payment file.
	*
	* @param companyId the company ID of this Payment file
	*/
	@Override
	public void setCompanyId(long companyId) {
		_paymentFile.setCompanyId(companyId);
	}

	/**
	* Returns the group ID of this Payment file.
	*
	* @return the group ID of this Payment file
	*/
	@Override
	public long getGroupId() {
		return _paymentFile.getGroupId();
	}

	/**
	* Sets the group ID of this Payment file.
	*
	* @param groupId the group ID of this Payment file
	*/
	@Override
	public void setGroupId(long groupId) {
		_paymentFile.setGroupId(groupId);
	}

	/**
	* Returns the user ID of this Payment file.
	*
	* @return the user ID of this Payment file
	*/
	@Override
	public long getUserId() {
		return _paymentFile.getUserId();
	}

	/**
	* Sets the user ID of this Payment file.
	*
	* @param userId the user ID of this Payment file
	*/
	@Override
	public void setUserId(long userId) {
		_paymentFile.setUserId(userId);
	}

	/**
	* Returns the user uuid of this Payment file.
	*
	* @return the user uuid of this Payment file
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentFile.getUserUuid();
	}

	/**
	* Sets the user uuid of this Payment file.
	*
	* @param userUuid the user uuid of this Payment file
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_paymentFile.setUserUuid(userUuid);
	}

	/**
	* Returns the create date of this Payment file.
	*
	* @return the create date of this Payment file
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _paymentFile.getCreateDate();
	}

	/**
	* Sets the create date of this Payment file.
	*
	* @param createDate the create date of this Payment file
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_paymentFile.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this Payment file.
	*
	* @return the modified date of this Payment file
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _paymentFile.getModifiedDate();
	}

	/**
	* Sets the modified date of this Payment file.
	*
	* @param modifiedDate the modified date of this Payment file
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_paymentFile.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the dossier ID of this Payment file.
	*
	* @return the dossier ID of this Payment file
	*/
	@Override
	public long getDossierId() {
		return _paymentFile.getDossierId();
	}

	/**
	* Sets the dossier ID of this Payment file.
	*
	* @param dossierId the dossier ID of this Payment file
	*/
	@Override
	public void setDossierId(long dossierId) {
		_paymentFile.setDossierId(dossierId);
	}

	/**
	* Returns the file group ID of this Payment file.
	*
	* @return the file group ID of this Payment file
	*/
	@Override
	public long getFileGroupId() {
		return _paymentFile.getFileGroupId();
	}

	/**
	* Sets the file group ID of this Payment file.
	*
	* @param fileGroupId the file group ID of this Payment file
	*/
	@Override
	public void setFileGroupId(long fileGroupId) {
		_paymentFile.setFileGroupId(fileGroupId);
	}

	/**
	* Returns the owner user ID of this Payment file.
	*
	* @return the owner user ID of this Payment file
	*/
	@Override
	public long getOwnerUserId() {
		return _paymentFile.getOwnerUserId();
	}

	/**
	* Sets the owner user ID of this Payment file.
	*
	* @param ownerUserId the owner user ID of this Payment file
	*/
	@Override
	public void setOwnerUserId(long ownerUserId) {
		_paymentFile.setOwnerUserId(ownerUserId);
	}

	/**
	* Returns the owner user uuid of this Payment file.
	*
	* @return the owner user uuid of this Payment file
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getOwnerUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentFile.getOwnerUserUuid();
	}

	/**
	* Sets the owner user uuid of this Payment file.
	*
	* @param ownerUserUuid the owner user uuid of this Payment file
	*/
	@Override
	public void setOwnerUserUuid(java.lang.String ownerUserUuid) {
		_paymentFile.setOwnerUserUuid(ownerUserUuid);
	}

	/**
	* Returns the owner organization ID of this Payment file.
	*
	* @return the owner organization ID of this Payment file
	*/
	@Override
	public long getOwnerOrganizationId() {
		return _paymentFile.getOwnerOrganizationId();
	}

	/**
	* Sets the owner organization ID of this Payment file.
	*
	* @param ownerOrganizationId the owner organization ID of this Payment file
	*/
	@Override
	public void setOwnerOrganizationId(long ownerOrganizationId) {
		_paymentFile.setOwnerOrganizationId(ownerOrganizationId);
	}

	/**
	* Returns the gov agency organization ID of this Payment file.
	*
	* @return the gov agency organization ID of this Payment file
	*/
	@Override
	public long getGovAgencyOrganizationId() {
		return _paymentFile.getGovAgencyOrganizationId();
	}

	/**
	* Sets the gov agency organization ID of this Payment file.
	*
	* @param govAgencyOrganizationId the gov agency organization ID of this Payment file
	*/
	@Override
	public void setGovAgencyOrganizationId(long govAgencyOrganizationId) {
		_paymentFile.setGovAgencyOrganizationId(govAgencyOrganizationId);
	}

	/**
	* Returns the payment name of this Payment file.
	*
	* @return the payment name of this Payment file
	*/
	@Override
	public java.lang.String getPaymentName() {
		return _paymentFile.getPaymentName();
	}

	/**
	* Sets the payment name of this Payment file.
	*
	* @param paymentName the payment name of this Payment file
	*/
	@Override
	public void setPaymentName(java.lang.String paymentName) {
		_paymentFile.setPaymentName(paymentName);
	}

	/**
	* Returns the request datetime of this Payment file.
	*
	* @return the request datetime of this Payment file
	*/
	@Override
	public java.util.Date getRequestDatetime() {
		return _paymentFile.getRequestDatetime();
	}

	/**
	* Sets the request datetime of this Payment file.
	*
	* @param requestDatetime the request datetime of this Payment file
	*/
	@Override
	public void setRequestDatetime(java.util.Date requestDatetime) {
		_paymentFile.setRequestDatetime(requestDatetime);
	}

	/**
	* Returns the amount of this Payment file.
	*
	* @return the amount of this Payment file
	*/
	@Override
	public double getAmount() {
		return _paymentFile.getAmount();
	}

	/**
	* Sets the amount of this Payment file.
	*
	* @param amount the amount of this Payment file
	*/
	@Override
	public void setAmount(double amount) {
		_paymentFile.setAmount(amount);
	}

	/**
	* Returns the request note of this Payment file.
	*
	* @return the request note of this Payment file
	*/
	@Override
	public java.lang.String getRequestNote() {
		return _paymentFile.getRequestNote();
	}

	/**
	* Sets the request note of this Payment file.
	*
	* @param requestNote the request note of this Payment file
	*/
	@Override
	public void setRequestNote(java.lang.String requestNote) {
		_paymentFile.setRequestNote(requestNote);
	}

	/**
	* Returns the payment options of this Payment file.
	*
	* @return the payment options of this Payment file
	*/
	@Override
	public java.lang.String getPaymentOptions() {
		return _paymentFile.getPaymentOptions();
	}

	/**
	* Sets the payment options of this Payment file.
	*
	* @param paymentOptions the payment options of this Payment file
	*/
	@Override
	public void setPaymentOptions(java.lang.String paymentOptions) {
		_paymentFile.setPaymentOptions(paymentOptions);
	}

	/**
	* Returns the keypay url of this Payment file.
	*
	* @return the keypay url of this Payment file
	*/
	@Override
	public java.lang.String getKeypayUrl() {
		return _paymentFile.getKeypayUrl();
	}

	/**
	* Sets the keypay url of this Payment file.
	*
	* @param keypayUrl the keypay url of this Payment file
	*/
	@Override
	public void setKeypayUrl(java.lang.String keypayUrl) {
		_paymentFile.setKeypayUrl(keypayUrl);
	}

	/**
	* Returns the keypay transaction ID of this Payment file.
	*
	* @return the keypay transaction ID of this Payment file
	*/
	@Override
	public long getKeypayTransactionId() {
		return _paymentFile.getKeypayTransactionId();
	}

	/**
	* Sets the keypay transaction ID of this Payment file.
	*
	* @param keypayTransactionId the keypay transaction ID of this Payment file
	*/
	@Override
	public void setKeypayTransactionId(long keypayTransactionId) {
		_paymentFile.setKeypayTransactionId(keypayTransactionId);
	}

	/**
	* Returns the keypay good code of this Payment file.
	*
	* @return the keypay good code of this Payment file
	*/
	@Override
	public java.lang.String getKeypayGoodCode() {
		return _paymentFile.getKeypayGoodCode();
	}

	/**
	* Sets the keypay good code of this Payment file.
	*
	* @param keypayGoodCode the keypay good code of this Payment file
	*/
	@Override
	public void setKeypayGoodCode(java.lang.String keypayGoodCode) {
		_paymentFile.setKeypayGoodCode(keypayGoodCode);
	}

	/**
	* Returns the keypay merchant code of this Payment file.
	*
	* @return the keypay merchant code of this Payment file
	*/
	@Override
	public java.lang.String getKeypayMerchantCode() {
		return _paymentFile.getKeypayMerchantCode();
	}

	/**
	* Sets the keypay merchant code of this Payment file.
	*
	* @param keypayMerchantCode the keypay merchant code of this Payment file
	*/
	@Override
	public void setKeypayMerchantCode(java.lang.String keypayMerchantCode) {
		_paymentFile.setKeypayMerchantCode(keypayMerchantCode);
	}

	/**
	* Returns the bank info of this Payment file.
	*
	* @return the bank info of this Payment file
	*/
	@Override
	public java.lang.String getBankInfo() {
		return _paymentFile.getBankInfo();
	}

	/**
	* Sets the bank info of this Payment file.
	*
	* @param bankInfo the bank info of this Payment file
	*/
	@Override
	public void setBankInfo(java.lang.String bankInfo) {
		_paymentFile.setBankInfo(bankInfo);
	}

	/**
	* Returns the place info of this Payment file.
	*
	* @return the place info of this Payment file
	*/
	@Override
	public java.lang.String getPlaceInfo() {
		return _paymentFile.getPlaceInfo();
	}

	/**
	* Sets the place info of this Payment file.
	*
	* @param placeInfo the place info of this Payment file
	*/
	@Override
	public void setPlaceInfo(java.lang.String placeInfo) {
		_paymentFile.setPlaceInfo(placeInfo);
	}

	/**
	* Returns the payment status of this Payment file.
	*
	* @return the payment status of this Payment file
	*/
	@Override
	public int getPaymentStatus() {
		return _paymentFile.getPaymentStatus();
	}

	/**
	* Sets the payment status of this Payment file.
	*
	* @param paymentStatus the payment status of this Payment file
	*/
	@Override
	public void setPaymentStatus(int paymentStatus) {
		_paymentFile.setPaymentStatus(paymentStatus);
	}

	/**
	* Returns the payment method of this Payment file.
	*
	* @return the payment method of this Payment file
	*/
	@Override
	public int getPaymentMethod() {
		return _paymentFile.getPaymentMethod();
	}

	/**
	* Sets the payment method of this Payment file.
	*
	* @param paymentMethod the payment method of this Payment file
	*/
	@Override
	public void setPaymentMethod(int paymentMethod) {
		_paymentFile.setPaymentMethod(paymentMethod);
	}

	/**
	* Returns the confirm datetime of this Payment file.
	*
	* @return the confirm datetime of this Payment file
	*/
	@Override
	public java.util.Date getConfirmDatetime() {
		return _paymentFile.getConfirmDatetime();
	}

	/**
	* Sets the confirm datetime of this Payment file.
	*
	* @param confirmDatetime the confirm datetime of this Payment file
	*/
	@Override
	public void setConfirmDatetime(java.util.Date confirmDatetime) {
		_paymentFile.setConfirmDatetime(confirmDatetime);
	}

	/**
	* Returns the confirm file entry ID of this Payment file.
	*
	* @return the confirm file entry ID of this Payment file
	*/
	@Override
	public long getConfirmFileEntryId() {
		return _paymentFile.getConfirmFileEntryId();
	}

	/**
	* Sets the confirm file entry ID of this Payment file.
	*
	* @param confirmFileEntryId the confirm file entry ID of this Payment file
	*/
	@Override
	public void setConfirmFileEntryId(long confirmFileEntryId) {
		_paymentFile.setConfirmFileEntryId(confirmFileEntryId);
	}

	/**
	* Returns the approve datetime of this Payment file.
	*
	* @return the approve datetime of this Payment file
	*/
	@Override
	public java.util.Date getApproveDatetime() {
		return _paymentFile.getApproveDatetime();
	}

	/**
	* Sets the approve datetime of this Payment file.
	*
	* @param approveDatetime the approve datetime of this Payment file
	*/
	@Override
	public void setApproveDatetime(java.util.Date approveDatetime) {
		_paymentFile.setApproveDatetime(approveDatetime);
	}

	/**
	* Returns the account user name of this Payment file.
	*
	* @return the account user name of this Payment file
	*/
	@Override
	public java.lang.String getAccountUserName() {
		return _paymentFile.getAccountUserName();
	}

	/**
	* Sets the account user name of this Payment file.
	*
	* @param accountUserName the account user name of this Payment file
	*/
	@Override
	public void setAccountUserName(java.lang.String accountUserName) {
		_paymentFile.setAccountUserName(accountUserName);
	}

	/**
	* Returns the approve note of this Payment file.
	*
	* @return the approve note of this Payment file
	*/
	@Override
	public java.lang.String getApproveNote() {
		return _paymentFile.getApproveNote();
	}

	/**
	* Sets the approve note of this Payment file.
	*
	* @param approveNote the approve note of this Payment file
	*/
	@Override
	public void setApproveNote(java.lang.String approveNote) {
		_paymentFile.setApproveNote(approveNote);
	}

	/**
	* Returns the gov agency tax no of this Payment file.
	*
	* @return the gov agency tax no of this Payment file
	*/
	@Override
	public java.lang.String getGovAgencyTaxNo() {
		return _paymentFile.getGovAgencyTaxNo();
	}

	/**
	* Sets the gov agency tax no of this Payment file.
	*
	* @param govAgencyTaxNo the gov agency tax no of this Payment file
	*/
	@Override
	public void setGovAgencyTaxNo(java.lang.String govAgencyTaxNo) {
		_paymentFile.setGovAgencyTaxNo(govAgencyTaxNo);
	}

	/**
	* Returns the invoice template no of this Payment file.
	*
	* @return the invoice template no of this Payment file
	*/
	@Override
	public java.lang.String getInvoiceTemplateNo() {
		return _paymentFile.getInvoiceTemplateNo();
	}

	/**
	* Sets the invoice template no of this Payment file.
	*
	* @param invoiceTemplateNo the invoice template no of this Payment file
	*/
	@Override
	public void setInvoiceTemplateNo(java.lang.String invoiceTemplateNo) {
		_paymentFile.setInvoiceTemplateNo(invoiceTemplateNo);
	}

	/**
	* Returns the invoice issue no of this Payment file.
	*
	* @return the invoice issue no of this Payment file
	*/
	@Override
	public java.lang.String getInvoiceIssueNo() {
		return _paymentFile.getInvoiceIssueNo();
	}

	/**
	* Sets the invoice issue no of this Payment file.
	*
	* @param invoiceIssueNo the invoice issue no of this Payment file
	*/
	@Override
	public void setInvoiceIssueNo(java.lang.String invoiceIssueNo) {
		_paymentFile.setInvoiceIssueNo(invoiceIssueNo);
	}

	/**
	* Returns the invoice no of this Payment file.
	*
	* @return the invoice no of this Payment file
	*/
	@Override
	public java.lang.String getInvoiceNo() {
		return _paymentFile.getInvoiceNo();
	}

	/**
	* Sets the invoice no of this Payment file.
	*
	* @param invoiceNo the invoice no of this Payment file
	*/
	@Override
	public void setInvoiceNo(java.lang.String invoiceNo) {
		_paymentFile.setInvoiceNo(invoiceNo);
	}

	/**
	* Returns the sync status of this Payment file.
	*
	* @return the sync status of this Payment file
	*/
	@Override
	public int getSyncStatus() {
		return _paymentFile.getSyncStatus();
	}

	/**
	* Sets the sync status of this Payment file.
	*
	* @param syncStatus the sync status of this Payment file
	*/
	@Override
	public void setSyncStatus(int syncStatus) {
		_paymentFile.setSyncStatus(syncStatus);
	}

	/**
	* Returns the oid of this Payment file.
	*
	* @return the oid of this Payment file
	*/
	@Override
	public java.lang.String getOid() {
		return _paymentFile.getOid();
	}

	/**
	* Sets the oid of this Payment file.
	*
	* @param oid the oid of this Payment file
	*/
	@Override
	public void setOid(java.lang.String oid) {
		_paymentFile.setOid(oid);
	}

	@Override
	public boolean isNew() {
		return _paymentFile.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_paymentFile.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _paymentFile.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_paymentFile.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _paymentFile.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _paymentFile.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_paymentFile.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _paymentFile.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_paymentFile.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_paymentFile.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_paymentFile.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PaymentFileWrapper((PaymentFile)_paymentFile.clone());
	}

	@Override
	public int compareTo(org.opencps.paymentmgt.model.PaymentFile paymentFile) {
		return _paymentFile.compareTo(paymentFile);
	}

	@Override
	public int hashCode() {
		return _paymentFile.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.opencps.paymentmgt.model.PaymentFile> toCacheModel() {
		return _paymentFile.toCacheModel();
	}

	@Override
	public org.opencps.paymentmgt.model.PaymentFile toEscapedModel() {
		return new PaymentFileWrapper(_paymentFile.toEscapedModel());
	}

	@Override
	public org.opencps.paymentmgt.model.PaymentFile toUnescapedModel() {
		return new PaymentFileWrapper(_paymentFile.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _paymentFile.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _paymentFile.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_paymentFile.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PaymentFileWrapper)) {
			return false;
		}

		PaymentFileWrapper paymentFileWrapper = (PaymentFileWrapper)obj;

		if (Validator.equals(_paymentFile, paymentFileWrapper._paymentFile)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _paymentFile.getStagedModelType();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public PaymentFile getWrappedPaymentFile() {
		return _paymentFile;
	}

	@Override
	public PaymentFile getWrappedModel() {
		return _paymentFile;
	}

	@Override
	public void resetOriginalValues() {
		_paymentFile.resetOriginalValues();
	}

	private PaymentFile _paymentFile;
}