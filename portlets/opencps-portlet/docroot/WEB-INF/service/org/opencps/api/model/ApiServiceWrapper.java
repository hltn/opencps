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

package org.opencps.api.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ApiService}.
 * </p>
 *
 * @author trungdk
 * @see ApiService
 * @generated
 */
public class ApiServiceWrapper implements ApiService, ModelWrapper<ApiService> {
	public ApiServiceWrapper(ApiService apiService) {
		_apiService = apiService;
	}

	@Override
	public Class<?> getModelClass() {
		return ApiService.class;
	}

	@Override
	public String getModelClassName() {
		return ApiService.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("apiLogId", getApiLogId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("oid", getOid());
		attributes.put("apiCode", getApiCode());
		attributes.put("ipAddress", getIpAddress());
		attributes.put("httpAgent", getHttpAgent());
		attributes.put("params", getParams());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long apiLogId = (Long)attributes.get("apiLogId");

		if (apiLogId != null) {
			setApiLogId(apiLogId);
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

		String oid = (String)attributes.get("oid");

		if (oid != null) {
			setOid(oid);
		}

		String apiCode = (String)attributes.get("apiCode");

		if (apiCode != null) {
			setApiCode(apiCode);
		}

		String ipAddress = (String)attributes.get("ipAddress");

		if (ipAddress != null) {
			setIpAddress(ipAddress);
		}

		String httpAgent = (String)attributes.get("httpAgent");

		if (httpAgent != null) {
			setHttpAgent(httpAgent);
		}

		String params = (String)attributes.get("params");

		if (params != null) {
			setParams(params);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	/**
	* Returns the primary key of this api service.
	*
	* @return the primary key of this api service
	*/
	@Override
	public long getPrimaryKey() {
		return _apiService.getPrimaryKey();
	}

	/**
	* Sets the primary key of this api service.
	*
	* @param primaryKey the primary key of this api service
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_apiService.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the api log ID of this api service.
	*
	* @return the api log ID of this api service
	*/
	@Override
	public long getApiLogId() {
		return _apiService.getApiLogId();
	}

	/**
	* Sets the api log ID of this api service.
	*
	* @param apiLogId the api log ID of this api service
	*/
	@Override
	public void setApiLogId(long apiLogId) {
		_apiService.setApiLogId(apiLogId);
	}

	/**
	* Returns the company ID of this api service.
	*
	* @return the company ID of this api service
	*/
	@Override
	public long getCompanyId() {
		return _apiService.getCompanyId();
	}

	/**
	* Sets the company ID of this api service.
	*
	* @param companyId the company ID of this api service
	*/
	@Override
	public void setCompanyId(long companyId) {
		_apiService.setCompanyId(companyId);
	}

	/**
	* Returns the group ID of this api service.
	*
	* @return the group ID of this api service
	*/
	@Override
	public long getGroupId() {
		return _apiService.getGroupId();
	}

	/**
	* Sets the group ID of this api service.
	*
	* @param groupId the group ID of this api service
	*/
	@Override
	public void setGroupId(long groupId) {
		_apiService.setGroupId(groupId);
	}

	/**
	* Returns the user ID of this api service.
	*
	* @return the user ID of this api service
	*/
	@Override
	public long getUserId() {
		return _apiService.getUserId();
	}

	/**
	* Sets the user ID of this api service.
	*
	* @param userId the user ID of this api service
	*/
	@Override
	public void setUserId(long userId) {
		_apiService.setUserId(userId);
	}

	/**
	* Returns the user uuid of this api service.
	*
	* @return the user uuid of this api service
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _apiService.getUserUuid();
	}

	/**
	* Sets the user uuid of this api service.
	*
	* @param userUuid the user uuid of this api service
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_apiService.setUserUuid(userUuid);
	}

	/**
	* Returns the create date of this api service.
	*
	* @return the create date of this api service
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _apiService.getCreateDate();
	}

	/**
	* Sets the create date of this api service.
	*
	* @param createDate the create date of this api service
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_apiService.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this api service.
	*
	* @return the modified date of this api service
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _apiService.getModifiedDate();
	}

	/**
	* Sets the modified date of this api service.
	*
	* @param modifiedDate the modified date of this api service
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_apiService.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the oid of this api service.
	*
	* @return the oid of this api service
	*/
	@Override
	public java.lang.String getOid() {
		return _apiService.getOid();
	}

	/**
	* Sets the oid of this api service.
	*
	* @param oid the oid of this api service
	*/
	@Override
	public void setOid(java.lang.String oid) {
		_apiService.setOid(oid);
	}

	/**
	* Returns the api code of this api service.
	*
	* @return the api code of this api service
	*/
	@Override
	public java.lang.String getApiCode() {
		return _apiService.getApiCode();
	}

	/**
	* Sets the api code of this api service.
	*
	* @param apiCode the api code of this api service
	*/
	@Override
	public void setApiCode(java.lang.String apiCode) {
		_apiService.setApiCode(apiCode);
	}

	/**
	* Returns the ip address of this api service.
	*
	* @return the ip address of this api service
	*/
	@Override
	public java.lang.String getIpAddress() {
		return _apiService.getIpAddress();
	}

	/**
	* Sets the ip address of this api service.
	*
	* @param ipAddress the ip address of this api service
	*/
	@Override
	public void setIpAddress(java.lang.String ipAddress) {
		_apiService.setIpAddress(ipAddress);
	}

	/**
	* Returns the http agent of this api service.
	*
	* @return the http agent of this api service
	*/
	@Override
	public java.lang.String getHttpAgent() {
		return _apiService.getHttpAgent();
	}

	/**
	* Sets the http agent of this api service.
	*
	* @param httpAgent the http agent of this api service
	*/
	@Override
	public void setHttpAgent(java.lang.String httpAgent) {
		_apiService.setHttpAgent(httpAgent);
	}

	/**
	* Returns the params of this api service.
	*
	* @return the params of this api service
	*/
	@Override
	public java.lang.String getParams() {
		return _apiService.getParams();
	}

	/**
	* Sets the params of this api service.
	*
	* @param params the params of this api service
	*/
	@Override
	public void setParams(java.lang.String params) {
		_apiService.setParams(params);
	}

	/**
	* Returns the status of this api service.
	*
	* @return the status of this api service
	*/
	@Override
	public java.lang.String getStatus() {
		return _apiService.getStatus();
	}

	/**
	* Sets the status of this api service.
	*
	* @param status the status of this api service
	*/
	@Override
	public void setStatus(java.lang.String status) {
		_apiService.setStatus(status);
	}

	@Override
	public boolean isNew() {
		return _apiService.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_apiService.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _apiService.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_apiService.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _apiService.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _apiService.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_apiService.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _apiService.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_apiService.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_apiService.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_apiService.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ApiServiceWrapper((ApiService)_apiService.clone());
	}

	@Override
	public int compareTo(org.opencps.api.model.ApiService apiService) {
		return _apiService.compareTo(apiService);
	}

	@Override
	public int hashCode() {
		return _apiService.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.opencps.api.model.ApiService> toCacheModel() {
		return _apiService.toCacheModel();
	}

	@Override
	public org.opencps.api.model.ApiService toEscapedModel() {
		return new ApiServiceWrapper(_apiService.toEscapedModel());
	}

	@Override
	public org.opencps.api.model.ApiService toUnescapedModel() {
		return new ApiServiceWrapper(_apiService.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _apiService.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _apiService.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_apiService.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ApiServiceWrapper)) {
			return false;
		}

		ApiServiceWrapper apiServiceWrapper = (ApiServiceWrapper)obj;

		if (Validator.equals(_apiService, apiServiceWrapper._apiService)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ApiService getWrappedApiService() {
		return _apiService;
	}

	@Override
	public ApiService getWrappedModel() {
		return _apiService;
	}

	@Override
	public void resetOriginalValues() {
		_apiService.resetOriginalValues();
	}

	private ApiService _apiService;
}