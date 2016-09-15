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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import org.opencps.api.service.ApiServiceLocalServiceUtil;
import org.opencps.api.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author trungdk
 */
public class ApiServiceClp extends BaseModelImpl<ApiService>
	implements ApiService {
	public ApiServiceClp() {
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
	public long getPrimaryKey() {
		return _apiLogId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setApiLogId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _apiLogId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getApiLogId() {
		return _apiLogId;
	}

	@Override
	public void setApiLogId(long apiLogId) {
		_apiLogId = apiLogId;

		if (_apiServiceRemoteModel != null) {
			try {
				Class<?> clazz = _apiServiceRemoteModel.getClass();

				Method method = clazz.getMethod("setApiLogId", long.class);

				method.invoke(_apiServiceRemoteModel, apiLogId);
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

		if (_apiServiceRemoteModel != null) {
			try {
				Class<?> clazz = _apiServiceRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_apiServiceRemoteModel, companyId);
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

		if (_apiServiceRemoteModel != null) {
			try {
				Class<?> clazz = _apiServiceRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_apiServiceRemoteModel, groupId);
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

		if (_apiServiceRemoteModel != null) {
			try {
				Class<?> clazz = _apiServiceRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_apiServiceRemoteModel, userId);
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

		if (_apiServiceRemoteModel != null) {
			try {
				Class<?> clazz = _apiServiceRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_apiServiceRemoteModel, createDate);
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

		if (_apiServiceRemoteModel != null) {
			try {
				Class<?> clazz = _apiServiceRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_apiServiceRemoteModel, modifiedDate);
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

		if (_apiServiceRemoteModel != null) {
			try {
				Class<?> clazz = _apiServiceRemoteModel.getClass();

				Method method = clazz.getMethod("setOid", String.class);

				method.invoke(_apiServiceRemoteModel, oid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getApiCode() {
		return _apiCode;
	}

	@Override
	public void setApiCode(String apiCode) {
		_apiCode = apiCode;

		if (_apiServiceRemoteModel != null) {
			try {
				Class<?> clazz = _apiServiceRemoteModel.getClass();

				Method method = clazz.getMethod("setApiCode", String.class);

				method.invoke(_apiServiceRemoteModel, apiCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getIpAddress() {
		return _ipAddress;
	}

	@Override
	public void setIpAddress(String ipAddress) {
		_ipAddress = ipAddress;

		if (_apiServiceRemoteModel != null) {
			try {
				Class<?> clazz = _apiServiceRemoteModel.getClass();

				Method method = clazz.getMethod("setIpAddress", String.class);

				method.invoke(_apiServiceRemoteModel, ipAddress);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getHttpAgent() {
		return _httpAgent;
	}

	@Override
	public void setHttpAgent(String httpAgent) {
		_httpAgent = httpAgent;

		if (_apiServiceRemoteModel != null) {
			try {
				Class<?> clazz = _apiServiceRemoteModel.getClass();

				Method method = clazz.getMethod("setHttpAgent", String.class);

				method.invoke(_apiServiceRemoteModel, httpAgent);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getParams() {
		return _params;
	}

	@Override
	public void setParams(String params) {
		_params = params;

		if (_apiServiceRemoteModel != null) {
			try {
				Class<?> clazz = _apiServiceRemoteModel.getClass();

				Method method = clazz.getMethod("setParams", String.class);

				method.invoke(_apiServiceRemoteModel, params);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStatus() {
		return _status;
	}

	@Override
	public void setStatus(String status) {
		_status = status;

		if (_apiServiceRemoteModel != null) {
			try {
				Class<?> clazz = _apiServiceRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", String.class);

				method.invoke(_apiServiceRemoteModel, status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getApiServiceRemoteModel() {
		return _apiServiceRemoteModel;
	}

	public void setApiServiceRemoteModel(BaseModel<?> apiServiceRemoteModel) {
		_apiServiceRemoteModel = apiServiceRemoteModel;
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

		Class<?> remoteModelClass = _apiServiceRemoteModel.getClass();

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

		Object returnValue = method.invoke(_apiServiceRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ApiServiceLocalServiceUtil.addApiService(this);
		}
		else {
			ApiServiceLocalServiceUtil.updateApiService(this);
		}
	}

	@Override
	public ApiService toEscapedModel() {
		return (ApiService)ProxyUtil.newProxyInstance(ApiService.class.getClassLoader(),
			new Class[] { ApiService.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ApiServiceClp clone = new ApiServiceClp();

		clone.setApiLogId(getApiLogId());
		clone.setCompanyId(getCompanyId());
		clone.setGroupId(getGroupId());
		clone.setUserId(getUserId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setOid(getOid());
		clone.setApiCode(getApiCode());
		clone.setIpAddress(getIpAddress());
		clone.setHttpAgent(getHttpAgent());
		clone.setParams(getParams());
		clone.setStatus(getStatus());

		return clone;
	}

	@Override
	public int compareTo(ApiService apiService) {
		long primaryKey = apiService.getPrimaryKey();

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

		if (!(obj instanceof ApiServiceClp)) {
			return false;
		}

		ApiServiceClp apiService = (ApiServiceClp)obj;

		long primaryKey = apiService.getPrimaryKey();

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
		StringBundler sb = new StringBundler(25);

		sb.append("{apiLogId=");
		sb.append(getApiLogId());
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
		sb.append(", oid=");
		sb.append(getOid());
		sb.append(", apiCode=");
		sb.append(getApiCode());
		sb.append(", ipAddress=");
		sb.append(getIpAddress());
		sb.append(", httpAgent=");
		sb.append(getHttpAgent());
		sb.append(", params=");
		sb.append(getParams());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("org.opencps.api.model.ApiService");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>apiLogId</column-name><column-value><![CDATA[");
		sb.append(getApiLogId());
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
			"<column><column-name>oid</column-name><column-value><![CDATA[");
		sb.append(getOid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>apiCode</column-name><column-value><![CDATA[");
		sb.append(getApiCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ipAddress</column-name><column-value><![CDATA[");
		sb.append(getIpAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>httpAgent</column-name><column-value><![CDATA[");
		sb.append(getHttpAgent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>params</column-name><column-value><![CDATA[");
		sb.append(getParams());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _apiLogId;
	private long _companyId;
	private long _groupId;
	private long _userId;
	private String _userUuid;
	private Date _createDate;
	private Date _modifiedDate;
	private String _oid;
	private String _apiCode;
	private String _ipAddress;
	private String _httpAgent;
	private String _params;
	private String _status;
	private BaseModel<?> _apiServiceRemoteModel;
	private Class<?> _clpSerializerClass = org.opencps.api.service.ClpSerializer.class;
}