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

package org.opencps.accountmgt.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link BusinessDomain}.
 * </p>
 *
 * @author khoavd
 * @see BusinessDomain
 * @generated
 */
public class BusinessDomainWrapper implements BusinessDomain,
	ModelWrapper<BusinessDomain> {
	public BusinessDomainWrapper(BusinessDomain businessDomain) {
		_businessDomain = businessDomain;
	}

	@Override
	public Class<?> getModelClass() {
		return BusinessDomain.class;
	}

	@Override
	public String getModelClassName() {
		return BusinessDomain.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("domainId", getDomainId());
		attributes.put("businessId", getBusinessId());
		attributes.put("businessDomainCode", getBusinessDomainCode());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long domainId = (Long)attributes.get("domainId");

		if (domainId != null) {
			setDomainId(domainId);
		}

		Long businessId = (Long)attributes.get("businessId");

		if (businessId != null) {
			setBusinessId(businessId);
		}

		String businessDomainCode = (String)attributes.get("businessDomainCode");

		if (businessDomainCode != null) {
			setBusinessDomainCode(businessDomainCode);
		}
	}

	/**
	* Returns the primary key of this business domain.
	*
	* @return the primary key of this business domain
	*/
	@Override
	public long getPrimaryKey() {
		return _businessDomain.getPrimaryKey();
	}

	/**
	* Sets the primary key of this business domain.
	*
	* @param primaryKey the primary key of this business domain
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_businessDomain.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the domain ID of this business domain.
	*
	* @return the domain ID of this business domain
	*/
	@Override
	public long getDomainId() {
		return _businessDomain.getDomainId();
	}

	/**
	* Sets the domain ID of this business domain.
	*
	* @param domainId the domain ID of this business domain
	*/
	@Override
	public void setDomainId(long domainId) {
		_businessDomain.setDomainId(domainId);
	}

	/**
	* Returns the business ID of this business domain.
	*
	* @return the business ID of this business domain
	*/
	@Override
	public long getBusinessId() {
		return _businessDomain.getBusinessId();
	}

	/**
	* Sets the business ID of this business domain.
	*
	* @param businessId the business ID of this business domain
	*/
	@Override
	public void setBusinessId(long businessId) {
		_businessDomain.setBusinessId(businessId);
	}

	/**
	* Returns the business domain code of this business domain.
	*
	* @return the business domain code of this business domain
	*/
	@Override
	public java.lang.String getBusinessDomainCode() {
		return _businessDomain.getBusinessDomainCode();
	}

	/**
	* Sets the business domain code of this business domain.
	*
	* @param businessDomainCode the business domain code of this business domain
	*/
	@Override
	public void setBusinessDomainCode(java.lang.String businessDomainCode) {
		_businessDomain.setBusinessDomainCode(businessDomainCode);
	}

	@Override
	public boolean isNew() {
		return _businessDomain.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_businessDomain.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _businessDomain.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_businessDomain.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _businessDomain.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _businessDomain.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_businessDomain.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _businessDomain.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_businessDomain.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_businessDomain.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_businessDomain.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new BusinessDomainWrapper((BusinessDomain)_businessDomain.clone());
	}

	@Override
	public int compareTo(
		org.opencps.accountmgt.model.BusinessDomain businessDomain) {
		return _businessDomain.compareTo(businessDomain);
	}

	@Override
	public int hashCode() {
		return _businessDomain.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.opencps.accountmgt.model.BusinessDomain> toCacheModel() {
		return _businessDomain.toCacheModel();
	}

	@Override
	public org.opencps.accountmgt.model.BusinessDomain toEscapedModel() {
		return new BusinessDomainWrapper(_businessDomain.toEscapedModel());
	}

	@Override
	public org.opencps.accountmgt.model.BusinessDomain toUnescapedModel() {
		return new BusinessDomainWrapper(_businessDomain.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _businessDomain.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _businessDomain.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_businessDomain.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BusinessDomainWrapper)) {
			return false;
		}

		BusinessDomainWrapper businessDomainWrapper = (BusinessDomainWrapper)obj;

		if (Validator.equals(_businessDomain,
					businessDomainWrapper._businessDomain)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public BusinessDomain getWrappedBusinessDomain() {
		return _businessDomain;
	}

	@Override
	public BusinessDomain getWrappedModel() {
		return _businessDomain;
	}

	@Override
	public void resetOriginalValues() {
		_businessDomain.resetOriginalValues();
	}

	private BusinessDomain _businessDomain;
}