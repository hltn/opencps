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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link org.opencps.paymentmgt.service.http.PaymentFileServiceSoap}.
 *
 * @author trungdk
 * @see org.opencps.paymentmgt.service.http.PaymentFileServiceSoap
 * @generated
 */
public class PaymentFileSoap implements Serializable {
	public static PaymentFileSoap toSoapModel(PaymentFile model) {
		PaymentFileSoap soapModel = new PaymentFileSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setPaymentFileId(model.getPaymentFileId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setDossierId(model.getDossierId());
		soapModel.setFileGroupId(model.getFileGroupId());
		soapModel.setOwnerUserId(model.getOwnerUserId());
		soapModel.setOwnerOrganizationId(model.getOwnerOrganizationId());
		soapModel.setGovAgencyOrganizationId(model.getGovAgencyOrganizationId());
		soapModel.setPaymentName(model.getPaymentName());
		soapModel.setRequestDatetime(model.getRequestDatetime());
		soapModel.setAmount(model.getAmount());
		soapModel.setRequestNote(model.getRequestNote());
		soapModel.setPaymentOptions(model.getPaymentOptions());
		soapModel.setKeypayUrl(model.getKeypayUrl());
		soapModel.setKeypayTransactionId(model.getKeypayTransactionId());
		soapModel.setKeypayGoodCode(model.getKeypayGoodCode());
		soapModel.setKeypayMerchantCode(model.getKeypayMerchantCode());
		soapModel.setBankInfo(model.getBankInfo());
		soapModel.setPlaceInfo(model.getPlaceInfo());
		soapModel.setPaymentStatus(model.getPaymentStatus());
		soapModel.setPaymentMethod(model.getPaymentMethod());
		soapModel.setConfirmDatetime(model.getConfirmDatetime());
		soapModel.setConfirmFileEntryId(model.getConfirmFileEntryId());
		soapModel.setApproveDatetime(model.getApproveDatetime());
		soapModel.setAccountUserName(model.getAccountUserName());
		soapModel.setApproveNote(model.getApproveNote());
		soapModel.setGovAgencyTaxNo(model.getGovAgencyTaxNo());
		soapModel.setInvoiceTemplateNo(model.getInvoiceTemplateNo());
		soapModel.setInvoiceIssueNo(model.getInvoiceIssueNo());
		soapModel.setInvoiceNo(model.getInvoiceNo());
		soapModel.setSyncStatus(model.getSyncStatus());
		soapModel.setOid(model.getOid());

		return soapModel;
	}

	public static PaymentFileSoap[] toSoapModels(PaymentFile[] models) {
		PaymentFileSoap[] soapModels = new PaymentFileSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PaymentFileSoap[][] toSoapModels(PaymentFile[][] models) {
		PaymentFileSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PaymentFileSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PaymentFileSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PaymentFileSoap[] toSoapModels(List<PaymentFile> models) {
		List<PaymentFileSoap> soapModels = new ArrayList<PaymentFileSoap>(models.size());

		for (PaymentFile model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PaymentFileSoap[soapModels.size()]);
	}

	public PaymentFileSoap() {
	}

	public long getPrimaryKey() {
		return _paymentFileId;
	}

	public void setPrimaryKey(long pk) {
		setPaymentFileId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getPaymentFileId() {
		return _paymentFileId;
	}

	public void setPaymentFileId(long paymentFileId) {
		_paymentFileId = paymentFileId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getDossierId() {
		return _dossierId;
	}

	public void setDossierId(long dossierId) {
		_dossierId = dossierId;
	}

	public long getFileGroupId() {
		return _fileGroupId;
	}

	public void setFileGroupId(long fileGroupId) {
		_fileGroupId = fileGroupId;
	}

	public long getOwnerUserId() {
		return _ownerUserId;
	}

	public void setOwnerUserId(long ownerUserId) {
		_ownerUserId = ownerUserId;
	}

	public long getOwnerOrganizationId() {
		return _ownerOrganizationId;
	}

	public void setOwnerOrganizationId(long ownerOrganizationId) {
		_ownerOrganizationId = ownerOrganizationId;
	}

	public long getGovAgencyOrganizationId() {
		return _govAgencyOrganizationId;
	}

	public void setGovAgencyOrganizationId(long govAgencyOrganizationId) {
		_govAgencyOrganizationId = govAgencyOrganizationId;
	}

	public String getPaymentName() {
		return _paymentName;
	}

	public void setPaymentName(String paymentName) {
		_paymentName = paymentName;
	}

	public Date getRequestDatetime() {
		return _requestDatetime;
	}

	public void setRequestDatetime(Date requestDatetime) {
		_requestDatetime = requestDatetime;
	}

	public double getAmount() {
		return _amount;
	}

	public void setAmount(double amount) {
		_amount = amount;
	}

	public String getRequestNote() {
		return _requestNote;
	}

	public void setRequestNote(String requestNote) {
		_requestNote = requestNote;
	}

	public String getPaymentOptions() {
		return _paymentOptions;
	}

	public void setPaymentOptions(String paymentOptions) {
		_paymentOptions = paymentOptions;
	}

	public String getKeypayUrl() {
		return _keypayUrl;
	}

	public void setKeypayUrl(String keypayUrl) {
		_keypayUrl = keypayUrl;
	}

	public long getKeypayTransactionId() {
		return _keypayTransactionId;
	}

	public void setKeypayTransactionId(long keypayTransactionId) {
		_keypayTransactionId = keypayTransactionId;
	}

	public String getKeypayGoodCode() {
		return _keypayGoodCode;
	}

	public void setKeypayGoodCode(String keypayGoodCode) {
		_keypayGoodCode = keypayGoodCode;
	}

	public String getKeypayMerchantCode() {
		return _keypayMerchantCode;
	}

	public void setKeypayMerchantCode(String keypayMerchantCode) {
		_keypayMerchantCode = keypayMerchantCode;
	}

	public String getBankInfo() {
		return _bankInfo;
	}

	public void setBankInfo(String bankInfo) {
		_bankInfo = bankInfo;
	}

	public String getPlaceInfo() {
		return _placeInfo;
	}

	public void setPlaceInfo(String placeInfo) {
		_placeInfo = placeInfo;
	}

	public int getPaymentStatus() {
		return _paymentStatus;
	}

	public void setPaymentStatus(int paymentStatus) {
		_paymentStatus = paymentStatus;
	}

	public int getPaymentMethod() {
		return _paymentMethod;
	}

	public void setPaymentMethod(int paymentMethod) {
		_paymentMethod = paymentMethod;
	}

	public Date getConfirmDatetime() {
		return _confirmDatetime;
	}

	public void setConfirmDatetime(Date confirmDatetime) {
		_confirmDatetime = confirmDatetime;
	}

	public long getConfirmFileEntryId() {
		return _confirmFileEntryId;
	}

	public void setConfirmFileEntryId(long confirmFileEntryId) {
		_confirmFileEntryId = confirmFileEntryId;
	}

	public Date getApproveDatetime() {
		return _approveDatetime;
	}

	public void setApproveDatetime(Date approveDatetime) {
		_approveDatetime = approveDatetime;
	}

	public String getAccountUserName() {
		return _accountUserName;
	}

	public void setAccountUserName(String accountUserName) {
		_accountUserName = accountUserName;
	}

	public String getApproveNote() {
		return _approveNote;
	}

	public void setApproveNote(String approveNote) {
		_approveNote = approveNote;
	}

	public String getGovAgencyTaxNo() {
		return _govAgencyTaxNo;
	}

	public void setGovAgencyTaxNo(String govAgencyTaxNo) {
		_govAgencyTaxNo = govAgencyTaxNo;
	}

	public String getInvoiceTemplateNo() {
		return _invoiceTemplateNo;
	}

	public void setInvoiceTemplateNo(String invoiceTemplateNo) {
		_invoiceTemplateNo = invoiceTemplateNo;
	}

	public String getInvoiceIssueNo() {
		return _invoiceIssueNo;
	}

	public void setInvoiceIssueNo(String invoiceIssueNo) {
		_invoiceIssueNo = invoiceIssueNo;
	}

	public String getInvoiceNo() {
		return _invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		_invoiceNo = invoiceNo;
	}

	public int getSyncStatus() {
		return _syncStatus;
	}

	public void setSyncStatus(int syncStatus) {
		_syncStatus = syncStatus;
	}

	public String getOid() {
		return _oid;
	}

	public void setOid(String oid) {
		_oid = oid;
	}

	private String _uuid;
	private long _paymentFileId;
	private long _companyId;
	private long _groupId;
	private long _userId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _dossierId;
	private long _fileGroupId;
	private long _ownerUserId;
	private long _ownerOrganizationId;
	private long _govAgencyOrganizationId;
	private String _paymentName;
	private Date _requestDatetime;
	private double _amount;
	private String _requestNote;
	private String _paymentOptions;
	private String _keypayUrl;
	private long _keypayTransactionId;
	private String _keypayGoodCode;
	private String _keypayMerchantCode;
	private String _bankInfo;
	private String _placeInfo;
	private int _paymentStatus;
	private int _paymentMethod;
	private Date _confirmDatetime;
	private long _confirmFileEntryId;
	private Date _approveDatetime;
	private String _accountUserName;
	private String _approveNote;
	private String _govAgencyTaxNo;
	private String _invoiceTemplateNo;
	private String _invoiceIssueNo;
	private String _invoiceNo;
	private int _syncStatus;
	private String _oid;
}