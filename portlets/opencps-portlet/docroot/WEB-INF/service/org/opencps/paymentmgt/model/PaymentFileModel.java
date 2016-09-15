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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.StagedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the PaymentFile service. Represents a row in the &quot;opencps_payment_file&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.opencps.paymentmgt.model.impl.PaymentFileModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.opencps.paymentmgt.model.impl.PaymentFileImpl}.
 * </p>
 *
 * @author trungdk
 * @see PaymentFile
 * @see org.opencps.paymentmgt.model.impl.PaymentFileImpl
 * @see org.opencps.paymentmgt.model.impl.PaymentFileModelImpl
 * @generated
 */
public interface PaymentFileModel extends BaseModel<PaymentFile>, StagedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a Payment file model instance should use the {@link PaymentFile} interface instead.
	 */

	/**
	 * Returns the primary key of this Payment file.
	 *
	 * @return the primary key of this Payment file
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this Payment file.
	 *
	 * @param primaryKey the primary key of this Payment file
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this Payment file.
	 *
	 * @return the uuid of this Payment file
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this Payment file.
	 *
	 * @param uuid the uuid of this Payment file
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the payment file ID of this Payment file.
	 *
	 * @return the payment file ID of this Payment file
	 */
	public long getPaymentFileId();

	/**
	 * Sets the payment file ID of this Payment file.
	 *
	 * @param paymentFileId the payment file ID of this Payment file
	 */
	public void setPaymentFileId(long paymentFileId);

	/**
	 * Returns the company ID of this Payment file.
	 *
	 * @return the company ID of this Payment file
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this Payment file.
	 *
	 * @param companyId the company ID of this Payment file
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this Payment file.
	 *
	 * @return the group ID of this Payment file
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this Payment file.
	 *
	 * @param groupId the group ID of this Payment file
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the user ID of this Payment file.
	 *
	 * @return the user ID of this Payment file
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this Payment file.
	 *
	 * @param userId the user ID of this Payment file
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this Payment file.
	 *
	 * @return the user uuid of this Payment file
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this Payment file.
	 *
	 * @param userUuid the user uuid of this Payment file
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the create date of this Payment file.
	 *
	 * @return the create date of this Payment file
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this Payment file.
	 *
	 * @param createDate the create date of this Payment file
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this Payment file.
	 *
	 * @return the modified date of this Payment file
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this Payment file.
	 *
	 * @param modifiedDate the modified date of this Payment file
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the dossier ID of this Payment file.
	 *
	 * @return the dossier ID of this Payment file
	 */
	public long getDossierId();

	/**
	 * Sets the dossier ID of this Payment file.
	 *
	 * @param dossierId the dossier ID of this Payment file
	 */
	public void setDossierId(long dossierId);

	/**
	 * Returns the file group ID of this Payment file.
	 *
	 * @return the file group ID of this Payment file
	 */
	public long getFileGroupId();

	/**
	 * Sets the file group ID of this Payment file.
	 *
	 * @param fileGroupId the file group ID of this Payment file
	 */
	public void setFileGroupId(long fileGroupId);

	/**
	 * Returns the owner user ID of this Payment file.
	 *
	 * @return the owner user ID of this Payment file
	 */
	public long getOwnerUserId();

	/**
	 * Sets the owner user ID of this Payment file.
	 *
	 * @param ownerUserId the owner user ID of this Payment file
	 */
	public void setOwnerUserId(long ownerUserId);

	/**
	 * Returns the owner user uuid of this Payment file.
	 *
	 * @return the owner user uuid of this Payment file
	 * @throws SystemException if a system exception occurred
	 */
	public String getOwnerUserUuid() throws SystemException;

	/**
	 * Sets the owner user uuid of this Payment file.
	 *
	 * @param ownerUserUuid the owner user uuid of this Payment file
	 */
	public void setOwnerUserUuid(String ownerUserUuid);

	/**
	 * Returns the owner organization ID of this Payment file.
	 *
	 * @return the owner organization ID of this Payment file
	 */
	public long getOwnerOrganizationId();

	/**
	 * Sets the owner organization ID of this Payment file.
	 *
	 * @param ownerOrganizationId the owner organization ID of this Payment file
	 */
	public void setOwnerOrganizationId(long ownerOrganizationId);

	/**
	 * Returns the gov agency organization ID of this Payment file.
	 *
	 * @return the gov agency organization ID of this Payment file
	 */
	public long getGovAgencyOrganizationId();

	/**
	 * Sets the gov agency organization ID of this Payment file.
	 *
	 * @param govAgencyOrganizationId the gov agency organization ID of this Payment file
	 */
	public void setGovAgencyOrganizationId(long govAgencyOrganizationId);

	/**
	 * Returns the payment name of this Payment file.
	 *
	 * @return the payment name of this Payment file
	 */
	@AutoEscape
	public String getPaymentName();

	/**
	 * Sets the payment name of this Payment file.
	 *
	 * @param paymentName the payment name of this Payment file
	 */
	public void setPaymentName(String paymentName);

	/**
	 * Returns the request datetime of this Payment file.
	 *
	 * @return the request datetime of this Payment file
	 */
	public Date getRequestDatetime();

	/**
	 * Sets the request datetime of this Payment file.
	 *
	 * @param requestDatetime the request datetime of this Payment file
	 */
	public void setRequestDatetime(Date requestDatetime);

	/**
	 * Returns the amount of this Payment file.
	 *
	 * @return the amount of this Payment file
	 */
	public double getAmount();

	/**
	 * Sets the amount of this Payment file.
	 *
	 * @param amount the amount of this Payment file
	 */
	public void setAmount(double amount);

	/**
	 * Returns the request note of this Payment file.
	 *
	 * @return the request note of this Payment file
	 */
	@AutoEscape
	public String getRequestNote();

	/**
	 * Sets the request note of this Payment file.
	 *
	 * @param requestNote the request note of this Payment file
	 */
	public void setRequestNote(String requestNote);

	/**
	 * Returns the payment options of this Payment file.
	 *
	 * @return the payment options of this Payment file
	 */
	@AutoEscape
	public String getPaymentOptions();

	/**
	 * Sets the payment options of this Payment file.
	 *
	 * @param paymentOptions the payment options of this Payment file
	 */
	public void setPaymentOptions(String paymentOptions);

	/**
	 * Returns the keypay url of this Payment file.
	 *
	 * @return the keypay url of this Payment file
	 */
	@AutoEscape
	public String getKeypayUrl();

	/**
	 * Sets the keypay url of this Payment file.
	 *
	 * @param keypayUrl the keypay url of this Payment file
	 */
	public void setKeypayUrl(String keypayUrl);

	/**
	 * Returns the keypay transaction ID of this Payment file.
	 *
	 * @return the keypay transaction ID of this Payment file
	 */
	public long getKeypayTransactionId();

	/**
	 * Sets the keypay transaction ID of this Payment file.
	 *
	 * @param keypayTransactionId the keypay transaction ID of this Payment file
	 */
	public void setKeypayTransactionId(long keypayTransactionId);

	/**
	 * Returns the keypay good code of this Payment file.
	 *
	 * @return the keypay good code of this Payment file
	 */
	@AutoEscape
	public String getKeypayGoodCode();

	/**
	 * Sets the keypay good code of this Payment file.
	 *
	 * @param keypayGoodCode the keypay good code of this Payment file
	 */
	public void setKeypayGoodCode(String keypayGoodCode);

	/**
	 * Returns the keypay merchant code of this Payment file.
	 *
	 * @return the keypay merchant code of this Payment file
	 */
	@AutoEscape
	public String getKeypayMerchantCode();

	/**
	 * Sets the keypay merchant code of this Payment file.
	 *
	 * @param keypayMerchantCode the keypay merchant code of this Payment file
	 */
	public void setKeypayMerchantCode(String keypayMerchantCode);

	/**
	 * Returns the bank info of this Payment file.
	 *
	 * @return the bank info of this Payment file
	 */
	@AutoEscape
	public String getBankInfo();

	/**
	 * Sets the bank info of this Payment file.
	 *
	 * @param bankInfo the bank info of this Payment file
	 */
	public void setBankInfo(String bankInfo);

	/**
	 * Returns the place info of this Payment file.
	 *
	 * @return the place info of this Payment file
	 */
	@AutoEscape
	public String getPlaceInfo();

	/**
	 * Sets the place info of this Payment file.
	 *
	 * @param placeInfo the place info of this Payment file
	 */
	public void setPlaceInfo(String placeInfo);

	/**
	 * Returns the payment status of this Payment file.
	 *
	 * @return the payment status of this Payment file
	 */
	public int getPaymentStatus();

	/**
	 * Sets the payment status of this Payment file.
	 *
	 * @param paymentStatus the payment status of this Payment file
	 */
	public void setPaymentStatus(int paymentStatus);

	/**
	 * Returns the payment method of this Payment file.
	 *
	 * @return the payment method of this Payment file
	 */
	public int getPaymentMethod();

	/**
	 * Sets the payment method of this Payment file.
	 *
	 * @param paymentMethod the payment method of this Payment file
	 */
	public void setPaymentMethod(int paymentMethod);

	/**
	 * Returns the confirm datetime of this Payment file.
	 *
	 * @return the confirm datetime of this Payment file
	 */
	public Date getConfirmDatetime();

	/**
	 * Sets the confirm datetime of this Payment file.
	 *
	 * @param confirmDatetime the confirm datetime of this Payment file
	 */
	public void setConfirmDatetime(Date confirmDatetime);

	/**
	 * Returns the confirm file entry ID of this Payment file.
	 *
	 * @return the confirm file entry ID of this Payment file
	 */
	public long getConfirmFileEntryId();

	/**
	 * Sets the confirm file entry ID of this Payment file.
	 *
	 * @param confirmFileEntryId the confirm file entry ID of this Payment file
	 */
	public void setConfirmFileEntryId(long confirmFileEntryId);

	/**
	 * Returns the approve datetime of this Payment file.
	 *
	 * @return the approve datetime of this Payment file
	 */
	public Date getApproveDatetime();

	/**
	 * Sets the approve datetime of this Payment file.
	 *
	 * @param approveDatetime the approve datetime of this Payment file
	 */
	public void setApproveDatetime(Date approveDatetime);

	/**
	 * Returns the account user name of this Payment file.
	 *
	 * @return the account user name of this Payment file
	 */
	@AutoEscape
	public String getAccountUserName();

	/**
	 * Sets the account user name of this Payment file.
	 *
	 * @param accountUserName the account user name of this Payment file
	 */
	public void setAccountUserName(String accountUserName);

	/**
	 * Returns the approve note of this Payment file.
	 *
	 * @return the approve note of this Payment file
	 */
	@AutoEscape
	public String getApproveNote();

	/**
	 * Sets the approve note of this Payment file.
	 *
	 * @param approveNote the approve note of this Payment file
	 */
	public void setApproveNote(String approveNote);

	/**
	 * Returns the gov agency tax no of this Payment file.
	 *
	 * @return the gov agency tax no of this Payment file
	 */
	@AutoEscape
	public String getGovAgencyTaxNo();

	/**
	 * Sets the gov agency tax no of this Payment file.
	 *
	 * @param govAgencyTaxNo the gov agency tax no of this Payment file
	 */
	public void setGovAgencyTaxNo(String govAgencyTaxNo);

	/**
	 * Returns the invoice template no of this Payment file.
	 *
	 * @return the invoice template no of this Payment file
	 */
	@AutoEscape
	public String getInvoiceTemplateNo();

	/**
	 * Sets the invoice template no of this Payment file.
	 *
	 * @param invoiceTemplateNo the invoice template no of this Payment file
	 */
	public void setInvoiceTemplateNo(String invoiceTemplateNo);

	/**
	 * Returns the invoice issue no of this Payment file.
	 *
	 * @return the invoice issue no of this Payment file
	 */
	@AutoEscape
	public String getInvoiceIssueNo();

	/**
	 * Sets the invoice issue no of this Payment file.
	 *
	 * @param invoiceIssueNo the invoice issue no of this Payment file
	 */
	public void setInvoiceIssueNo(String invoiceIssueNo);

	/**
	 * Returns the invoice no of this Payment file.
	 *
	 * @return the invoice no of this Payment file
	 */
	@AutoEscape
	public String getInvoiceNo();

	/**
	 * Sets the invoice no of this Payment file.
	 *
	 * @param invoiceNo the invoice no of this Payment file
	 */
	public void setInvoiceNo(String invoiceNo);

	/**
	 * Returns the sync status of this Payment file.
	 *
	 * @return the sync status of this Payment file
	 */
	public int getSyncStatus();

	/**
	 * Sets the sync status of this Payment file.
	 *
	 * @param syncStatus the sync status of this Payment file
	 */
	public void setSyncStatus(int syncStatus);

	/**
	 * Returns the oid of this Payment file.
	 *
	 * @return the oid of this Payment file
	 */
	@AutoEscape
	public String getOid();

	/**
	 * Sets the oid of this Payment file.
	 *
	 * @param oid the oid of this Payment file
	 */
	public void setOid(String oid);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(org.opencps.paymentmgt.model.PaymentFile paymentFile);

	@Override
	public int hashCode();

	@Override
	public CacheModel<org.opencps.paymentmgt.model.PaymentFile> toCacheModel();

	@Override
	public org.opencps.paymentmgt.model.PaymentFile toEscapedModel();

	@Override
	public org.opencps.paymentmgt.model.PaymentFile toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}