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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link PaymentConfig}.
 * </p>
 *
 * @author trungdk
 * @see PaymentConfig
 * @generated
 */
public class PaymentConfigWrapper implements PaymentConfig,
	ModelWrapper<PaymentConfig> {
	public PaymentConfigWrapper(PaymentConfig paymentConfig) {
		_paymentConfig = paymentConfig;
	}

	@Override
	public Class<?> getModelClass() {
		return PaymentConfig.class;
	}

	@Override
	public String getModelClassName() {
		return PaymentConfig.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("paymentConfigId", getPaymentConfigId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("govAgencyOrganizationId", getGovAgencyOrganizationId());
		attributes.put("govAgencyName", getGovAgencyName());
		attributes.put("govAgencyTaxNo", getGovAgencyTaxNo());
		attributes.put("invoiceTemplateNo", getInvoiceTemplateNo());
		attributes.put("invoiceIssueNo", getInvoiceIssueNo());
		attributes.put("invoiceLastNo", getInvoiceLastNo());
		attributes.put("bankInfo", getBankInfo());
		attributes.put("placeInfo", getPlaceInfo());
		attributes.put("keypayDomain", getKeypayDomain());
		attributes.put("keypayVersion", getKeypayVersion());
		attributes.put("keypayMerchantCode", getKeypayMerchantCode());
		attributes.put("keypaySecureKey", getKeypaySecureKey());
		attributes.put("reportTemplate", getReportTemplate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long paymentConfigId = (Long)attributes.get("paymentConfigId");

		if (paymentConfigId != null) {
			setPaymentConfigId(paymentConfigId);
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

		Long govAgencyOrganizationId = (Long)attributes.get(
				"govAgencyOrganizationId");

		if (govAgencyOrganizationId != null) {
			setGovAgencyOrganizationId(govAgencyOrganizationId);
		}

		String govAgencyName = (String)attributes.get("govAgencyName");

		if (govAgencyName != null) {
			setGovAgencyName(govAgencyName);
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

		String invoiceLastNo = (String)attributes.get("invoiceLastNo");

		if (invoiceLastNo != null) {
			setInvoiceLastNo(invoiceLastNo);
		}

		String bankInfo = (String)attributes.get("bankInfo");

		if (bankInfo != null) {
			setBankInfo(bankInfo);
		}

		String placeInfo = (String)attributes.get("placeInfo");

		if (placeInfo != null) {
			setPlaceInfo(placeInfo);
		}

		String keypayDomain = (String)attributes.get("keypayDomain");

		if (keypayDomain != null) {
			setKeypayDomain(keypayDomain);
		}

		String keypayVersion = (String)attributes.get("keypayVersion");

		if (keypayVersion != null) {
			setKeypayVersion(keypayVersion);
		}

		String keypayMerchantCode = (String)attributes.get("keypayMerchantCode");

		if (keypayMerchantCode != null) {
			setKeypayMerchantCode(keypayMerchantCode);
		}

		String keypaySecureKey = (String)attributes.get("keypaySecureKey");

		if (keypaySecureKey != null) {
			setKeypaySecureKey(keypaySecureKey);
		}

		String reportTemplate = (String)attributes.get("reportTemplate");

		if (reportTemplate != null) {
			setReportTemplate(reportTemplate);
		}
	}

	/**
	* Returns the primary key of this Payment configuration.
	*
	* @return the primary key of this Payment configuration
	*/
	@Override
	public long getPrimaryKey() {
		return _paymentConfig.getPrimaryKey();
	}

	/**
	* Sets the primary key of this Payment configuration.
	*
	* @param primaryKey the primary key of this Payment configuration
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_paymentConfig.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the payment config ID of this Payment configuration.
	*
	* @return the payment config ID of this Payment configuration
	*/
	@Override
	public long getPaymentConfigId() {
		return _paymentConfig.getPaymentConfigId();
	}

	/**
	* Sets the payment config ID of this Payment configuration.
	*
	* @param paymentConfigId the payment config ID of this Payment configuration
	*/
	@Override
	public void setPaymentConfigId(long paymentConfigId) {
		_paymentConfig.setPaymentConfigId(paymentConfigId);
	}

	/**
	* Returns the company ID of this Payment configuration.
	*
	* @return the company ID of this Payment configuration
	*/
	@Override
	public long getCompanyId() {
		return _paymentConfig.getCompanyId();
	}

	/**
	* Sets the company ID of this Payment configuration.
	*
	* @param companyId the company ID of this Payment configuration
	*/
	@Override
	public void setCompanyId(long companyId) {
		_paymentConfig.setCompanyId(companyId);
	}

	/**
	* Returns the group ID of this Payment configuration.
	*
	* @return the group ID of this Payment configuration
	*/
	@Override
	public long getGroupId() {
		return _paymentConfig.getGroupId();
	}

	/**
	* Sets the group ID of this Payment configuration.
	*
	* @param groupId the group ID of this Payment configuration
	*/
	@Override
	public void setGroupId(long groupId) {
		_paymentConfig.setGroupId(groupId);
	}

	/**
	* Returns the user ID of this Payment configuration.
	*
	* @return the user ID of this Payment configuration
	*/
	@Override
	public long getUserId() {
		return _paymentConfig.getUserId();
	}

	/**
	* Sets the user ID of this Payment configuration.
	*
	* @param userId the user ID of this Payment configuration
	*/
	@Override
	public void setUserId(long userId) {
		_paymentConfig.setUserId(userId);
	}

	/**
	* Returns the user uuid of this Payment configuration.
	*
	* @return the user uuid of this Payment configuration
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentConfig.getUserUuid();
	}

	/**
	* Sets the user uuid of this Payment configuration.
	*
	* @param userUuid the user uuid of this Payment configuration
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_paymentConfig.setUserUuid(userUuid);
	}

	/**
	* Returns the create date of this Payment configuration.
	*
	* @return the create date of this Payment configuration
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _paymentConfig.getCreateDate();
	}

	/**
	* Sets the create date of this Payment configuration.
	*
	* @param createDate the create date of this Payment configuration
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_paymentConfig.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this Payment configuration.
	*
	* @return the modified date of this Payment configuration
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _paymentConfig.getModifiedDate();
	}

	/**
	* Sets the modified date of this Payment configuration.
	*
	* @param modifiedDate the modified date of this Payment configuration
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_paymentConfig.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the gov agency organization ID of this Payment configuration.
	*
	* @return the gov agency organization ID of this Payment configuration
	*/
	@Override
	public long getGovAgencyOrganizationId() {
		return _paymentConfig.getGovAgencyOrganizationId();
	}

	/**
	* Sets the gov agency organization ID of this Payment configuration.
	*
	* @param govAgencyOrganizationId the gov agency organization ID of this Payment configuration
	*/
	@Override
	public void setGovAgencyOrganizationId(long govAgencyOrganizationId) {
		_paymentConfig.setGovAgencyOrganizationId(govAgencyOrganizationId);
	}

	/**
	* Returns the gov agency name of this Payment configuration.
	*
	* @return the gov agency name of this Payment configuration
	*/
	@Override
	public java.lang.String getGovAgencyName() {
		return _paymentConfig.getGovAgencyName();
	}

	/**
	* Sets the gov agency name of this Payment configuration.
	*
	* @param govAgencyName the gov agency name of this Payment configuration
	*/
	@Override
	public void setGovAgencyName(java.lang.String govAgencyName) {
		_paymentConfig.setGovAgencyName(govAgencyName);
	}

	/**
	* Returns the gov agency tax no of this Payment configuration.
	*
	* @return the gov agency tax no of this Payment configuration
	*/
	@Override
	public java.lang.String getGovAgencyTaxNo() {
		return _paymentConfig.getGovAgencyTaxNo();
	}

	/**
	* Sets the gov agency tax no of this Payment configuration.
	*
	* @param govAgencyTaxNo the gov agency tax no of this Payment configuration
	*/
	@Override
	public void setGovAgencyTaxNo(java.lang.String govAgencyTaxNo) {
		_paymentConfig.setGovAgencyTaxNo(govAgencyTaxNo);
	}

	/**
	* Returns the invoice template no of this Payment configuration.
	*
	* @return the invoice template no of this Payment configuration
	*/
	@Override
	public java.lang.String getInvoiceTemplateNo() {
		return _paymentConfig.getInvoiceTemplateNo();
	}

	/**
	* Sets the invoice template no of this Payment configuration.
	*
	* @param invoiceTemplateNo the invoice template no of this Payment configuration
	*/
	@Override
	public void setInvoiceTemplateNo(java.lang.String invoiceTemplateNo) {
		_paymentConfig.setInvoiceTemplateNo(invoiceTemplateNo);
	}

	/**
	* Returns the invoice issue no of this Payment configuration.
	*
	* @return the invoice issue no of this Payment configuration
	*/
	@Override
	public java.lang.String getInvoiceIssueNo() {
		return _paymentConfig.getInvoiceIssueNo();
	}

	/**
	* Sets the invoice issue no of this Payment configuration.
	*
	* @param invoiceIssueNo the invoice issue no of this Payment configuration
	*/
	@Override
	public void setInvoiceIssueNo(java.lang.String invoiceIssueNo) {
		_paymentConfig.setInvoiceIssueNo(invoiceIssueNo);
	}

	/**
	* Returns the invoice last no of this Payment configuration.
	*
	* @return the invoice last no of this Payment configuration
	*/
	@Override
	public java.lang.String getInvoiceLastNo() {
		return _paymentConfig.getInvoiceLastNo();
	}

	/**
	* Sets the invoice last no of this Payment configuration.
	*
	* @param invoiceLastNo the invoice last no of this Payment configuration
	*/
	@Override
	public void setInvoiceLastNo(java.lang.String invoiceLastNo) {
		_paymentConfig.setInvoiceLastNo(invoiceLastNo);
	}

	/**
	* Returns the bank info of this Payment configuration.
	*
	* @return the bank info of this Payment configuration
	*/
	@Override
	public java.lang.String getBankInfo() {
		return _paymentConfig.getBankInfo();
	}

	/**
	* Sets the bank info of this Payment configuration.
	*
	* @param bankInfo the bank info of this Payment configuration
	*/
	@Override
	public void setBankInfo(java.lang.String bankInfo) {
		_paymentConfig.setBankInfo(bankInfo);
	}

	/**
	* Returns the place info of this Payment configuration.
	*
	* @return the place info of this Payment configuration
	*/
	@Override
	public java.lang.String getPlaceInfo() {
		return _paymentConfig.getPlaceInfo();
	}

	/**
	* Sets the place info of this Payment configuration.
	*
	* @param placeInfo the place info of this Payment configuration
	*/
	@Override
	public void setPlaceInfo(java.lang.String placeInfo) {
		_paymentConfig.setPlaceInfo(placeInfo);
	}

	/**
	* Returns the keypay domain of this Payment configuration.
	*
	* @return the keypay domain of this Payment configuration
	*/
	@Override
	public java.lang.String getKeypayDomain() {
		return _paymentConfig.getKeypayDomain();
	}

	/**
	* Sets the keypay domain of this Payment configuration.
	*
	* @param keypayDomain the keypay domain of this Payment configuration
	*/
	@Override
	public void setKeypayDomain(java.lang.String keypayDomain) {
		_paymentConfig.setKeypayDomain(keypayDomain);
	}

	/**
	* Returns the keypay version of this Payment configuration.
	*
	* @return the keypay version of this Payment configuration
	*/
	@Override
	public java.lang.String getKeypayVersion() {
		return _paymentConfig.getKeypayVersion();
	}

	/**
	* Sets the keypay version of this Payment configuration.
	*
	* @param keypayVersion the keypay version of this Payment configuration
	*/
	@Override
	public void setKeypayVersion(java.lang.String keypayVersion) {
		_paymentConfig.setKeypayVersion(keypayVersion);
	}

	/**
	* Returns the keypay merchant code of this Payment configuration.
	*
	* @return the keypay merchant code of this Payment configuration
	*/
	@Override
	public java.lang.String getKeypayMerchantCode() {
		return _paymentConfig.getKeypayMerchantCode();
	}

	/**
	* Sets the keypay merchant code of this Payment configuration.
	*
	* @param keypayMerchantCode the keypay merchant code of this Payment configuration
	*/
	@Override
	public void setKeypayMerchantCode(java.lang.String keypayMerchantCode) {
		_paymentConfig.setKeypayMerchantCode(keypayMerchantCode);
	}

	/**
	* Returns the keypay secure key of this Payment configuration.
	*
	* @return the keypay secure key of this Payment configuration
	*/
	@Override
	public java.lang.String getKeypaySecureKey() {
		return _paymentConfig.getKeypaySecureKey();
	}

	/**
	* Sets the keypay secure key of this Payment configuration.
	*
	* @param keypaySecureKey the keypay secure key of this Payment configuration
	*/
	@Override
	public void setKeypaySecureKey(java.lang.String keypaySecureKey) {
		_paymentConfig.setKeypaySecureKey(keypaySecureKey);
	}

	/**
	* Returns the report template of this Payment configuration.
	*
	* @return the report template of this Payment configuration
	*/
	@Override
	public java.lang.String getReportTemplate() {
		return _paymentConfig.getReportTemplate();
	}

	/**
	* Sets the report template of this Payment configuration.
	*
	* @param reportTemplate the report template of this Payment configuration
	*/
	@Override
	public void setReportTemplate(java.lang.String reportTemplate) {
		_paymentConfig.setReportTemplate(reportTemplate);
	}

	@Override
	public boolean isNew() {
		return _paymentConfig.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_paymentConfig.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _paymentConfig.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_paymentConfig.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _paymentConfig.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _paymentConfig.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_paymentConfig.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _paymentConfig.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_paymentConfig.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_paymentConfig.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_paymentConfig.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PaymentConfigWrapper((PaymentConfig)_paymentConfig.clone());
	}

	@Override
	public int compareTo(
		org.opencps.paymentmgt.model.PaymentConfig paymentConfig) {
		return _paymentConfig.compareTo(paymentConfig);
	}

	@Override
	public int hashCode() {
		return _paymentConfig.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.opencps.paymentmgt.model.PaymentConfig> toCacheModel() {
		return _paymentConfig.toCacheModel();
	}

	@Override
	public org.opencps.paymentmgt.model.PaymentConfig toEscapedModel() {
		return new PaymentConfigWrapper(_paymentConfig.toEscapedModel());
	}

	@Override
	public org.opencps.paymentmgt.model.PaymentConfig toUnescapedModel() {
		return new PaymentConfigWrapper(_paymentConfig.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _paymentConfig.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _paymentConfig.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_paymentConfig.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PaymentConfigWrapper)) {
			return false;
		}

		PaymentConfigWrapper paymentConfigWrapper = (PaymentConfigWrapper)obj;

		if (Validator.equals(_paymentConfig, paymentConfigWrapper._paymentConfig)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public PaymentConfig getWrappedPaymentConfig() {
		return _paymentConfig;
	}

	@Override
	public PaymentConfig getWrappedModel() {
		return _paymentConfig;
	}

	@Override
	public void resetOriginalValues() {
		_paymentConfig.resetOriginalValues();
	}

	private PaymentConfig _paymentConfig;
}