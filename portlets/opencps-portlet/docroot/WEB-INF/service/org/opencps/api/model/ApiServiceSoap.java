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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link org.opencps.api.service.http.ApiServiceServiceSoap}.
 *
 * @author trungdk
 * @see org.opencps.api.service.http.ApiServiceServiceSoap
 * @generated
 */
public class ApiServiceSoap implements Serializable {
	public static ApiServiceSoap toSoapModel(ApiService model) {
		ApiServiceSoap soapModel = new ApiServiceSoap();

		soapModel.setApiLogId(model.getApiLogId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setOid(model.getOid());
		soapModel.setApiCode(model.getApiCode());
		soapModel.setIpAddress(model.getIpAddress());
		soapModel.setHttpAgent(model.getHttpAgent());
		soapModel.setParams(model.getParams());
		soapModel.setStatus(model.getStatus());

		return soapModel;
	}

	public static ApiServiceSoap[] toSoapModels(ApiService[] models) {
		ApiServiceSoap[] soapModels = new ApiServiceSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ApiServiceSoap[][] toSoapModels(ApiService[][] models) {
		ApiServiceSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ApiServiceSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ApiServiceSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ApiServiceSoap[] toSoapModels(List<ApiService> models) {
		List<ApiServiceSoap> soapModels = new ArrayList<ApiServiceSoap>(models.size());

		for (ApiService model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ApiServiceSoap[soapModels.size()]);
	}

	public ApiServiceSoap() {
	}

	public long getPrimaryKey() {
		return _apiLogId;
	}

	public void setPrimaryKey(long pk) {
		setApiLogId(pk);
	}

	public long getApiLogId() {
		return _apiLogId;
	}

	public void setApiLogId(long apiLogId) {
		_apiLogId = apiLogId;
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

	public String getOid() {
		return _oid;
	}

	public void setOid(String oid) {
		_oid = oid;
	}

	public String getApiCode() {
		return _apiCode;
	}

	public void setApiCode(String apiCode) {
		_apiCode = apiCode;
	}

	public String getIpAddress() {
		return _ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		_ipAddress = ipAddress;
	}

	public String getHttpAgent() {
		return _httpAgent;
	}

	public void setHttpAgent(String httpAgent) {
		_httpAgent = httpAgent;
	}

	public String getParams() {
		return _params;
	}

	public void setParams(String params) {
		_params = params;
	}

	public String getStatus() {
		return _status;
	}

	public void setStatus(String status) {
		_status = status;
	}

	private long _apiLogId;
	private long _companyId;
	private long _groupId;
	private long _userId;
	private Date _createDate;
	private Date _modifiedDate;
	private String _oid;
	private String _apiCode;
	private String _ipAddress;
	private String _httpAgent;
	private String _params;
	private String _status;
}