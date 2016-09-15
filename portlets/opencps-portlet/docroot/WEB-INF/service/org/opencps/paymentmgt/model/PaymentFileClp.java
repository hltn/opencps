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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import org.opencps.paymentmgt.service.ClpSerializer;
import org.opencps.paymentmgt.service.PaymentFileLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author trungdk
 */
public class PaymentFileClp extends BaseModelImpl<PaymentFile>
	implements PaymentFile {
	public PaymentFileClp() {
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
	public long getPrimaryKey() {
		return _paymentFileId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setPaymentFileId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _paymentFileId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public String getUuid() {
		return _uuid;
	}

	@Override
	public void setUuid(String uuid) {
		_uuid = uuid;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setUuid", String.class);

				method.invoke(_paymentFileRemoteModel, uuid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPaymentFileId() {
		return _paymentFileId;
	}

	@Override
	public void setPaymentFileId(long paymentFileId) {
		_paymentFileId = paymentFileId;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setPaymentFileId", long.class);

				method.invoke(_paymentFileRemoteModel, paymentFileId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_paymentFileRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_paymentFileRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_paymentFileRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_paymentFileRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_paymentFileRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDossierId() {
		return _dossierId;
	}

	@Override
	public void setDossierId(long dossierId) {
		_dossierId = dossierId;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setDossierId", long.class);

				method.invoke(_paymentFileRemoteModel, dossierId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getFileGroupId() {
		return _fileGroupId;
	}

	@Override
	public void setFileGroupId(long fileGroupId) {
		_fileGroupId = fileGroupId;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setFileGroupId", long.class);

				method.invoke(_paymentFileRemoteModel, fileGroupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getOwnerUserId() {
		return _ownerUserId;
	}

	@Override
	public void setOwnerUserId(long ownerUserId) {
		_ownerUserId = ownerUserId;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setOwnerUserId", long.class);

				method.invoke(_paymentFileRemoteModel, ownerUserId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getOwnerUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getOwnerUserId(), "uuid", _ownerUserUuid);
	}

	@Override
	public void setOwnerUserUuid(String ownerUserUuid) {
		_ownerUserUuid = ownerUserUuid;
	}

	@Override
	public long getOwnerOrganizationId() {
		return _ownerOrganizationId;
	}

	@Override
	public void setOwnerOrganizationId(long ownerOrganizationId) {
		_ownerOrganizationId = ownerOrganizationId;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setOwnerOrganizationId",
						long.class);

				method.invoke(_paymentFileRemoteModel, ownerOrganizationId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGovAgencyOrganizationId() {
		return _govAgencyOrganizationId;
	}

	@Override
	public void setGovAgencyOrganizationId(long govAgencyOrganizationId) {
		_govAgencyOrganizationId = govAgencyOrganizationId;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setGovAgencyOrganizationId",
						long.class);

				method.invoke(_paymentFileRemoteModel, govAgencyOrganizationId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPaymentName() {
		return _paymentName;
	}

	@Override
	public void setPaymentName(String paymentName) {
		_paymentName = paymentName;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setPaymentName", String.class);

				method.invoke(_paymentFileRemoteModel, paymentName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getRequestDatetime() {
		return _requestDatetime;
	}

	@Override
	public void setRequestDatetime(Date requestDatetime) {
		_requestDatetime = requestDatetime;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestDatetime", Date.class);

				method.invoke(_paymentFileRemoteModel, requestDatetime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getAmount() {
		return _amount;
	}

	@Override
	public void setAmount(double amount) {
		_amount = amount;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setAmount", double.class);

				method.invoke(_paymentFileRemoteModel, amount);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRequestNote() {
		return _requestNote;
	}

	@Override
	public void setRequestNote(String requestNote) {
		_requestNote = requestNote;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestNote", String.class);

				method.invoke(_paymentFileRemoteModel, requestNote);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPaymentOptions() {
		return _paymentOptions;
	}

	@Override
	public void setPaymentOptions(String paymentOptions) {
		_paymentOptions = paymentOptions;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setPaymentOptions",
						String.class);

				method.invoke(_paymentFileRemoteModel, paymentOptions);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getKeypayUrl() {
		return _keypayUrl;
	}

	@Override
	public void setKeypayUrl(String keypayUrl) {
		_keypayUrl = keypayUrl;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setKeypayUrl", String.class);

				method.invoke(_paymentFileRemoteModel, keypayUrl);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getKeypayTransactionId() {
		return _keypayTransactionId;
	}

	@Override
	public void setKeypayTransactionId(long keypayTransactionId) {
		_keypayTransactionId = keypayTransactionId;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setKeypayTransactionId",
						long.class);

				method.invoke(_paymentFileRemoteModel, keypayTransactionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getKeypayGoodCode() {
		return _keypayGoodCode;
	}

	@Override
	public void setKeypayGoodCode(String keypayGoodCode) {
		_keypayGoodCode = keypayGoodCode;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setKeypayGoodCode",
						String.class);

				method.invoke(_paymentFileRemoteModel, keypayGoodCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getKeypayMerchantCode() {
		return _keypayMerchantCode;
	}

	@Override
	public void setKeypayMerchantCode(String keypayMerchantCode) {
		_keypayMerchantCode = keypayMerchantCode;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setKeypayMerchantCode",
						String.class);

				method.invoke(_paymentFileRemoteModel, keypayMerchantCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBankInfo() {
		return _bankInfo;
	}

	@Override
	public void setBankInfo(String bankInfo) {
		_bankInfo = bankInfo;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setBankInfo", String.class);

				method.invoke(_paymentFileRemoteModel, bankInfo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPlaceInfo() {
		return _placeInfo;
	}

	@Override
	public void setPlaceInfo(String placeInfo) {
		_placeInfo = placeInfo;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setPlaceInfo", String.class);

				method.invoke(_paymentFileRemoteModel, placeInfo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getPaymentStatus() {
		return _paymentStatus;
	}

	@Override
	public void setPaymentStatus(int paymentStatus) {
		_paymentStatus = paymentStatus;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setPaymentStatus", int.class);

				method.invoke(_paymentFileRemoteModel, paymentStatus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getPaymentMethod() {
		return _paymentMethod;
	}

	@Override
	public void setPaymentMethod(int paymentMethod) {
		_paymentMethod = paymentMethod;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setPaymentMethod", int.class);

				method.invoke(_paymentFileRemoteModel, paymentMethod);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getConfirmDatetime() {
		return _confirmDatetime;
	}

	@Override
	public void setConfirmDatetime(Date confirmDatetime) {
		_confirmDatetime = confirmDatetime;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setConfirmDatetime", Date.class);

				method.invoke(_paymentFileRemoteModel, confirmDatetime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getConfirmFileEntryId() {
		return _confirmFileEntryId;
	}

	@Override
	public void setConfirmFileEntryId(long confirmFileEntryId) {
		_confirmFileEntryId = confirmFileEntryId;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setConfirmFileEntryId",
						long.class);

				method.invoke(_paymentFileRemoteModel, confirmFileEntryId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getApproveDatetime() {
		return _approveDatetime;
	}

	@Override
	public void setApproveDatetime(Date approveDatetime) {
		_approveDatetime = approveDatetime;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setApproveDatetime", Date.class);

				method.invoke(_paymentFileRemoteModel, approveDatetime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAccountUserName() {
		return _accountUserName;
	}

	@Override
	public void setAccountUserName(String accountUserName) {
		_accountUserName = accountUserName;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setAccountUserName",
						String.class);

				method.invoke(_paymentFileRemoteModel, accountUserName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getApproveNote() {
		return _approveNote;
	}

	@Override
	public void setApproveNote(String approveNote) {
		_approveNote = approveNote;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setApproveNote", String.class);

				method.invoke(_paymentFileRemoteModel, approveNote);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGovAgencyTaxNo() {
		return _govAgencyTaxNo;
	}

	@Override
	public void setGovAgencyTaxNo(String govAgencyTaxNo) {
		_govAgencyTaxNo = govAgencyTaxNo;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setGovAgencyTaxNo",
						String.class);

				method.invoke(_paymentFileRemoteModel, govAgencyTaxNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInvoiceTemplateNo() {
		return _invoiceTemplateNo;
	}

	@Override
	public void setInvoiceTemplateNo(String invoiceTemplateNo) {
		_invoiceTemplateNo = invoiceTemplateNo;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setInvoiceTemplateNo",
						String.class);

				method.invoke(_paymentFileRemoteModel, invoiceTemplateNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInvoiceIssueNo() {
		return _invoiceIssueNo;
	}

	@Override
	public void setInvoiceIssueNo(String invoiceIssueNo) {
		_invoiceIssueNo = invoiceIssueNo;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setInvoiceIssueNo",
						String.class);

				method.invoke(_paymentFileRemoteModel, invoiceIssueNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInvoiceNo() {
		return _invoiceNo;
	}

	@Override
	public void setInvoiceNo(String invoiceNo) {
		_invoiceNo = invoiceNo;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setInvoiceNo", String.class);

				method.invoke(_paymentFileRemoteModel, invoiceNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSyncStatus() {
		return _syncStatus;
	}

	@Override
	public void setSyncStatus(int syncStatus) {
		_syncStatus = syncStatus;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setSyncStatus", int.class);

				method.invoke(_paymentFileRemoteModel, syncStatus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getOid() {
		return _oid;
	}

	@Override
	public void setOid(String oid) {
		_oid = oid;

		if (_paymentFileRemoteModel != null) {
			try {
				Class<?> clazz = _paymentFileRemoteModel.getClass();

				Method method = clazz.getMethod("setOid", String.class);

				method.invoke(_paymentFileRemoteModel, oid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				PaymentFile.class.getName()));
	}

	public BaseModel<?> getPaymentFileRemoteModel() {
		return _paymentFileRemoteModel;
	}

	public void setPaymentFileRemoteModel(BaseModel<?> paymentFileRemoteModel) {
		_paymentFileRemoteModel = paymentFileRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _paymentFileRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_paymentFileRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PaymentFileLocalServiceUtil.addPaymentFile(this);
		}
		else {
			PaymentFileLocalServiceUtil.updatePaymentFile(this);
		}
	}

	@Override
	public PaymentFile toEscapedModel() {
		return (PaymentFile)ProxyUtil.newProxyInstance(PaymentFile.class.getClassLoader(),
			new Class[] { PaymentFile.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PaymentFileClp clone = new PaymentFileClp();

		clone.setUuid(getUuid());
		clone.setPaymentFileId(getPaymentFileId());
		clone.setCompanyId(getCompanyId());
		clone.setGroupId(getGroupId());
		clone.setUserId(getUserId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setDossierId(getDossierId());
		clone.setFileGroupId(getFileGroupId());
		clone.setOwnerUserId(getOwnerUserId());
		clone.setOwnerOrganizationId(getOwnerOrganizationId());
		clone.setGovAgencyOrganizationId(getGovAgencyOrganizationId());
		clone.setPaymentName(getPaymentName());
		clone.setRequestDatetime(getRequestDatetime());
		clone.setAmount(getAmount());
		clone.setRequestNote(getRequestNote());
		clone.setPaymentOptions(getPaymentOptions());
		clone.setKeypayUrl(getKeypayUrl());
		clone.setKeypayTransactionId(getKeypayTransactionId());
		clone.setKeypayGoodCode(getKeypayGoodCode());
		clone.setKeypayMerchantCode(getKeypayMerchantCode());
		clone.setBankInfo(getBankInfo());
		clone.setPlaceInfo(getPlaceInfo());
		clone.setPaymentStatus(getPaymentStatus());
		clone.setPaymentMethod(getPaymentMethod());
		clone.setConfirmDatetime(getConfirmDatetime());
		clone.setConfirmFileEntryId(getConfirmFileEntryId());
		clone.setApproveDatetime(getApproveDatetime());
		clone.setAccountUserName(getAccountUserName());
		clone.setApproveNote(getApproveNote());
		clone.setGovAgencyTaxNo(getGovAgencyTaxNo());
		clone.setInvoiceTemplateNo(getInvoiceTemplateNo());
		clone.setInvoiceIssueNo(getInvoiceIssueNo());
		clone.setInvoiceNo(getInvoiceNo());
		clone.setSyncStatus(getSyncStatus());
		clone.setOid(getOid());

		return clone;
	}

	@Override
	public int compareTo(PaymentFile paymentFile) {
		long primaryKey = paymentFile.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PaymentFileClp)) {
			return false;
		}

		PaymentFileClp paymentFile = (PaymentFileClp)obj;

		long primaryKey = paymentFile.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(73);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", paymentFileId=");
		sb.append(getPaymentFileId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", dossierId=");
		sb.append(getDossierId());
		sb.append(", fileGroupId=");
		sb.append(getFileGroupId());
		sb.append(", ownerUserId=");
		sb.append(getOwnerUserId());
		sb.append(", ownerOrganizationId=");
		sb.append(getOwnerOrganizationId());
		sb.append(", govAgencyOrganizationId=");
		sb.append(getGovAgencyOrganizationId());
		sb.append(", paymentName=");
		sb.append(getPaymentName());
		sb.append(", requestDatetime=");
		sb.append(getRequestDatetime());
		sb.append(", amount=");
		sb.append(getAmount());
		sb.append(", requestNote=");
		sb.append(getRequestNote());
		sb.append(", paymentOptions=");
		sb.append(getPaymentOptions());
		sb.append(", keypayUrl=");
		sb.append(getKeypayUrl());
		sb.append(", keypayTransactionId=");
		sb.append(getKeypayTransactionId());
		sb.append(", keypayGoodCode=");
		sb.append(getKeypayGoodCode());
		sb.append(", keypayMerchantCode=");
		sb.append(getKeypayMerchantCode());
		sb.append(", bankInfo=");
		sb.append(getBankInfo());
		sb.append(", placeInfo=");
		sb.append(getPlaceInfo());
		sb.append(", paymentStatus=");
		sb.append(getPaymentStatus());
		sb.append(", paymentMethod=");
		sb.append(getPaymentMethod());
		sb.append(", confirmDatetime=");
		sb.append(getConfirmDatetime());
		sb.append(", confirmFileEntryId=");
		sb.append(getConfirmFileEntryId());
		sb.append(", approveDatetime=");
		sb.append(getApproveDatetime());
		sb.append(", accountUserName=");
		sb.append(getAccountUserName());
		sb.append(", approveNote=");
		sb.append(getApproveNote());
		sb.append(", govAgencyTaxNo=");
		sb.append(getGovAgencyTaxNo());
		sb.append(", invoiceTemplateNo=");
		sb.append(getInvoiceTemplateNo());
		sb.append(", invoiceIssueNo=");
		sb.append(getInvoiceIssueNo());
		sb.append(", invoiceNo=");
		sb.append(getInvoiceNo());
		sb.append(", syncStatus=");
		sb.append(getSyncStatus());
		sb.append(", oid=");
		sb.append(getOid());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(112);

		sb.append("<model><model-name>");
		sb.append("org.opencps.paymentmgt.model.PaymentFile");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>paymentFileId</column-name><column-value><![CDATA[");
		sb.append(getPaymentFileId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dossierId</column-name><column-value><![CDATA[");
		sb.append(getDossierId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fileGroupId</column-name><column-value><![CDATA[");
		sb.append(getFileGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ownerUserId</column-name><column-value><![CDATA[");
		sb.append(getOwnerUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ownerOrganizationId</column-name><column-value><![CDATA[");
		sb.append(getOwnerOrganizationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>govAgencyOrganizationId</column-name><column-value><![CDATA[");
		sb.append(getGovAgencyOrganizationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>paymentName</column-name><column-value><![CDATA[");
		sb.append(getPaymentName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestDatetime</column-name><column-value><![CDATA[");
		sb.append(getRequestDatetime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>amount</column-name><column-value><![CDATA[");
		sb.append(getAmount());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestNote</column-name><column-value><![CDATA[");
		sb.append(getRequestNote());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>paymentOptions</column-name><column-value><![CDATA[");
		sb.append(getPaymentOptions());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>keypayUrl</column-name><column-value><![CDATA[");
		sb.append(getKeypayUrl());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>keypayTransactionId</column-name><column-value><![CDATA[");
		sb.append(getKeypayTransactionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>keypayGoodCode</column-name><column-value><![CDATA[");
		sb.append(getKeypayGoodCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>keypayMerchantCode</column-name><column-value><![CDATA[");
		sb.append(getKeypayMerchantCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>bankInfo</column-name><column-value><![CDATA[");
		sb.append(getBankInfo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>placeInfo</column-name><column-value><![CDATA[");
		sb.append(getPlaceInfo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>paymentStatus</column-name><column-value><![CDATA[");
		sb.append(getPaymentStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>paymentMethod</column-name><column-value><![CDATA[");
		sb.append(getPaymentMethod());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>confirmDatetime</column-name><column-value><![CDATA[");
		sb.append(getConfirmDatetime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>confirmFileEntryId</column-name><column-value><![CDATA[");
		sb.append(getConfirmFileEntryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approveDatetime</column-name><column-value><![CDATA[");
		sb.append(getApproveDatetime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>accountUserName</column-name><column-value><![CDATA[");
		sb.append(getAccountUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approveNote</column-name><column-value><![CDATA[");
		sb.append(getApproveNote());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>govAgencyTaxNo</column-name><column-value><![CDATA[");
		sb.append(getGovAgencyTaxNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>invoiceTemplateNo</column-name><column-value><![CDATA[");
		sb.append(getInvoiceTemplateNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>invoiceIssueNo</column-name><column-value><![CDATA[");
		sb.append(getInvoiceIssueNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>invoiceNo</column-name><column-value><![CDATA[");
		sb.append(getInvoiceNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>syncStatus</column-name><column-value><![CDATA[");
		sb.append(getSyncStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>oid</column-name><column-value><![CDATA[");
		sb.append(getOid());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _uuid;
	private long _paymentFileId;
	private long _companyId;
	private long _groupId;
	private long _userId;
	private String _userUuid;
	private Date _createDate;
	private Date _modifiedDate;
	private long _dossierId;
	private long _fileGroupId;
	private long _ownerUserId;
	private String _ownerUserUuid;
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
	private BaseModel<?> _paymentFileRemoteModel;
	private Class<?> _clpSerializerClass = org.opencps.paymentmgt.service.ClpSerializer.class;
}