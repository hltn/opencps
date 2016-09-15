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
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import org.opencps.paymentmgt.service.ClpSerializer;
import org.opencps.paymentmgt.service.PaymentConfigLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author trungdk
 */
public class PaymentConfigClp extends BaseModelImpl<PaymentConfig>
	implements PaymentConfig {
	public PaymentConfigClp() {
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
	public long getPrimaryKey() {
		return _paymentConfigId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setPaymentConfigId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _paymentConfigId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getPaymentConfigId() {
		return _paymentConfigId;
	}

	@Override
	public void setPaymentConfigId(long paymentConfigId) {
		_paymentConfigId = paymentConfigId;

		if (_paymentConfigRemoteModel != null) {
			try {
				Class<?> clazz = _paymentConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setPaymentConfigId", long.class);

				method.invoke(_paymentConfigRemoteModel, paymentConfigId);
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

		if (_paymentConfigRemoteModel != null) {
			try {
				Class<?> clazz = _paymentConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_paymentConfigRemoteModel, companyId);
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

		if (_paymentConfigRemoteModel != null) {
			try {
				Class<?> clazz = _paymentConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_paymentConfigRemoteModel, groupId);
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

		if (_paymentConfigRemoteModel != null) {
			try {
				Class<?> clazz = _paymentConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_paymentConfigRemoteModel, userId);
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

		if (_paymentConfigRemoteModel != null) {
			try {
				Class<?> clazz = _paymentConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_paymentConfigRemoteModel, createDate);
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

		if (_paymentConfigRemoteModel != null) {
			try {
				Class<?> clazz = _paymentConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_paymentConfigRemoteModel, modifiedDate);
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

		if (_paymentConfigRemoteModel != null) {
			try {
				Class<?> clazz = _paymentConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setGovAgencyOrganizationId",
						long.class);

				method.invoke(_paymentConfigRemoteModel, govAgencyOrganizationId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGovAgencyName() {
		return _govAgencyName;
	}

	@Override
	public void setGovAgencyName(String govAgencyName) {
		_govAgencyName = govAgencyName;

		if (_paymentConfigRemoteModel != null) {
			try {
				Class<?> clazz = _paymentConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setGovAgencyName", String.class);

				method.invoke(_paymentConfigRemoteModel, govAgencyName);
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

		if (_paymentConfigRemoteModel != null) {
			try {
				Class<?> clazz = _paymentConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setGovAgencyTaxNo",
						String.class);

				method.invoke(_paymentConfigRemoteModel, govAgencyTaxNo);
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

		if (_paymentConfigRemoteModel != null) {
			try {
				Class<?> clazz = _paymentConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setInvoiceTemplateNo",
						String.class);

				method.invoke(_paymentConfigRemoteModel, invoiceTemplateNo);
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

		if (_paymentConfigRemoteModel != null) {
			try {
				Class<?> clazz = _paymentConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setInvoiceIssueNo",
						String.class);

				method.invoke(_paymentConfigRemoteModel, invoiceIssueNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInvoiceLastNo() {
		return _invoiceLastNo;
	}

	@Override
	public void setInvoiceLastNo(String invoiceLastNo) {
		_invoiceLastNo = invoiceLastNo;

		if (_paymentConfigRemoteModel != null) {
			try {
				Class<?> clazz = _paymentConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setInvoiceLastNo", String.class);

				method.invoke(_paymentConfigRemoteModel, invoiceLastNo);
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

		if (_paymentConfigRemoteModel != null) {
			try {
				Class<?> clazz = _paymentConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setBankInfo", String.class);

				method.invoke(_paymentConfigRemoteModel, bankInfo);
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

		if (_paymentConfigRemoteModel != null) {
			try {
				Class<?> clazz = _paymentConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setPlaceInfo", String.class);

				method.invoke(_paymentConfigRemoteModel, placeInfo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getKeypayDomain() {
		return _keypayDomain;
	}

	@Override
	public void setKeypayDomain(String keypayDomain) {
		_keypayDomain = keypayDomain;

		if (_paymentConfigRemoteModel != null) {
			try {
				Class<?> clazz = _paymentConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setKeypayDomain", String.class);

				method.invoke(_paymentConfigRemoteModel, keypayDomain);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getKeypayVersion() {
		return _keypayVersion;
	}

	@Override
	public void setKeypayVersion(String keypayVersion) {
		_keypayVersion = keypayVersion;

		if (_paymentConfigRemoteModel != null) {
			try {
				Class<?> clazz = _paymentConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setKeypayVersion", String.class);

				method.invoke(_paymentConfigRemoteModel, keypayVersion);
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

		if (_paymentConfigRemoteModel != null) {
			try {
				Class<?> clazz = _paymentConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setKeypayMerchantCode",
						String.class);

				method.invoke(_paymentConfigRemoteModel, keypayMerchantCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getKeypaySecureKey() {
		return _keypaySecureKey;
	}

	@Override
	public void setKeypaySecureKey(String keypaySecureKey) {
		_keypaySecureKey = keypaySecureKey;

		if (_paymentConfigRemoteModel != null) {
			try {
				Class<?> clazz = _paymentConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setKeypaySecureKey",
						String.class);

				method.invoke(_paymentConfigRemoteModel, keypaySecureKey);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getReportTemplate() {
		return _reportTemplate;
	}

	@Override
	public void setReportTemplate(String reportTemplate) {
		_reportTemplate = reportTemplate;

		if (_paymentConfigRemoteModel != null) {
			try {
				Class<?> clazz = _paymentConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setReportTemplate",
						String.class);

				method.invoke(_paymentConfigRemoteModel, reportTemplate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getPaymentConfigRemoteModel() {
		return _paymentConfigRemoteModel;
	}

	public void setPaymentConfigRemoteModel(
		BaseModel<?> paymentConfigRemoteModel) {
		_paymentConfigRemoteModel = paymentConfigRemoteModel;
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

		Class<?> remoteModelClass = _paymentConfigRemoteModel.getClass();

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

		Object returnValue = method.invoke(_paymentConfigRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PaymentConfigLocalServiceUtil.addPaymentConfig(this);
		}
		else {
			PaymentConfigLocalServiceUtil.updatePaymentConfig(this);
		}
	}

	@Override
	public PaymentConfig toEscapedModel() {
		return (PaymentConfig)ProxyUtil.newProxyInstance(PaymentConfig.class.getClassLoader(),
			new Class[] { PaymentConfig.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PaymentConfigClp clone = new PaymentConfigClp();

		clone.setPaymentConfigId(getPaymentConfigId());
		clone.setCompanyId(getCompanyId());
		clone.setGroupId(getGroupId());
		clone.setUserId(getUserId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setGovAgencyOrganizationId(getGovAgencyOrganizationId());
		clone.setGovAgencyName(getGovAgencyName());
		clone.setGovAgencyTaxNo(getGovAgencyTaxNo());
		clone.setInvoiceTemplateNo(getInvoiceTemplateNo());
		clone.setInvoiceIssueNo(getInvoiceIssueNo());
		clone.setInvoiceLastNo(getInvoiceLastNo());
		clone.setBankInfo(getBankInfo());
		clone.setPlaceInfo(getPlaceInfo());
		clone.setKeypayDomain(getKeypayDomain());
		clone.setKeypayVersion(getKeypayVersion());
		clone.setKeypayMerchantCode(getKeypayMerchantCode());
		clone.setKeypaySecureKey(getKeypaySecureKey());
		clone.setReportTemplate(getReportTemplate());

		return clone;
	}

	@Override
	public int compareTo(PaymentConfig paymentConfig) {
		long primaryKey = paymentConfig.getPrimaryKey();

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

		if (!(obj instanceof PaymentConfigClp)) {
			return false;
		}

		PaymentConfigClp paymentConfig = (PaymentConfigClp)obj;

		long primaryKey = paymentConfig.getPrimaryKey();

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
		StringBundler sb = new StringBundler(39);

		sb.append("{paymentConfigId=");
		sb.append(getPaymentConfigId());
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
		sb.append(", govAgencyOrganizationId=");
		sb.append(getGovAgencyOrganizationId());
		sb.append(", govAgencyName=");
		sb.append(getGovAgencyName());
		sb.append(", govAgencyTaxNo=");
		sb.append(getGovAgencyTaxNo());
		sb.append(", invoiceTemplateNo=");
		sb.append(getInvoiceTemplateNo());
		sb.append(", invoiceIssueNo=");
		sb.append(getInvoiceIssueNo());
		sb.append(", invoiceLastNo=");
		sb.append(getInvoiceLastNo());
		sb.append(", bankInfo=");
		sb.append(getBankInfo());
		sb.append(", placeInfo=");
		sb.append(getPlaceInfo());
		sb.append(", keypayDomain=");
		sb.append(getKeypayDomain());
		sb.append(", keypayVersion=");
		sb.append(getKeypayVersion());
		sb.append(", keypayMerchantCode=");
		sb.append(getKeypayMerchantCode());
		sb.append(", keypaySecureKey=");
		sb.append(getKeypaySecureKey());
		sb.append(", reportTemplate=");
		sb.append(getReportTemplate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(61);

		sb.append("<model><model-name>");
		sb.append("org.opencps.paymentmgt.model.PaymentConfig");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>paymentConfigId</column-name><column-value><![CDATA[");
		sb.append(getPaymentConfigId());
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
			"<column><column-name>govAgencyOrganizationId</column-name><column-value><![CDATA[");
		sb.append(getGovAgencyOrganizationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>govAgencyName</column-name><column-value><![CDATA[");
		sb.append(getGovAgencyName());
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
			"<column><column-name>invoiceLastNo</column-name><column-value><![CDATA[");
		sb.append(getInvoiceLastNo());
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
			"<column><column-name>keypayDomain</column-name><column-value><![CDATA[");
		sb.append(getKeypayDomain());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>keypayVersion</column-name><column-value><![CDATA[");
		sb.append(getKeypayVersion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>keypayMerchantCode</column-name><column-value><![CDATA[");
		sb.append(getKeypayMerchantCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>keypaySecureKey</column-name><column-value><![CDATA[");
		sb.append(getKeypaySecureKey());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reportTemplate</column-name><column-value><![CDATA[");
		sb.append(getReportTemplate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _paymentConfigId;
	private long _companyId;
	private long _groupId;
	private long _userId;
	private String _userUuid;
	private Date _createDate;
	private Date _modifiedDate;
	private long _govAgencyOrganizationId;
	private String _govAgencyName;
	private String _govAgencyTaxNo;
	private String _invoiceTemplateNo;
	private String _invoiceIssueNo;
	private String _invoiceLastNo;
	private String _bankInfo;
	private String _placeInfo;
	private String _keypayDomain;
	private String _keypayVersion;
	private String _keypayMerchantCode;
	private String _keypaySecureKey;
	private String _reportTemplate;
	private BaseModel<?> _paymentConfigRemoteModel;
	private Class<?> _clpSerializerClass = org.opencps.paymentmgt.service.ClpSerializer.class;
}