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

package org.opencps.dossiermgt.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import org.opencps.dossiermgt.service.ClpSerializer;
import org.opencps.dossiermgt.service.ServiceConfigLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author trungnt
 */
public class ServiceConfigClp extends BaseModelImpl<ServiceConfig>
	implements ServiceConfig {
	public ServiceConfigClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ServiceConfig.class;
	}

	@Override
	public String getModelClassName() {
		return ServiceConfig.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _serviceConfigId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setServiceConfigId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _serviceConfigId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("serviceConfigId", getServiceConfigId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("serviceInfoId", getServiceInfoId());
		attributes.put("serviceDomainIndex", getServiceDomainIndex());
		attributes.put("serviceAdministrationIndex",
			getServiceAdministrationIndex());
		attributes.put("dossierTemplateId", getDossierTemplateId());
		attributes.put("govAgencyCode", getGovAgencyCode());
		attributes.put("govAgencyName", getGovAgencyName());
		attributes.put("serviceInstruction", getServiceInstruction());
		attributes.put("serviceLevel", getServiceLevel());
		attributes.put("servicePortal", getServicePortal());
		attributes.put("serviceOnegate", getServiceOnegate());
		attributes.put("serviceBackoffice", getServiceBackoffice());
		attributes.put("govAgencyOrganizationId", getGovAgencyOrganizationId());
		attributes.put("serviceCitizen", getServiceCitizen());
		attributes.put("serviceBusinees", getServiceBusinees());
		attributes.put("serviceProcessId", getServiceProcessId());
		attributes.put("domainCode", getDomainCode());
		attributes.put("serviceMode", getServiceMode());
		attributes.put("govAgencyIndex", getGovAgencyIndex());
		attributes.put("serviceUrl", getServiceUrl());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long serviceConfigId = (Long)attributes.get("serviceConfigId");

		if (serviceConfigId != null) {
			setServiceConfigId(serviceConfigId);
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

		Long serviceInfoId = (Long)attributes.get("serviceInfoId");

		if (serviceInfoId != null) {
			setServiceInfoId(serviceInfoId);
		}

		String serviceDomainIndex = (String)attributes.get("serviceDomainIndex");

		if (serviceDomainIndex != null) {
			setServiceDomainIndex(serviceDomainIndex);
		}

		String serviceAdministrationIndex = (String)attributes.get(
				"serviceAdministrationIndex");

		if (serviceAdministrationIndex != null) {
			setServiceAdministrationIndex(serviceAdministrationIndex);
		}

		Long dossierTemplateId = (Long)attributes.get("dossierTemplateId");

		if (dossierTemplateId != null) {
			setDossierTemplateId(dossierTemplateId);
		}

		String govAgencyCode = (String)attributes.get("govAgencyCode");

		if (govAgencyCode != null) {
			setGovAgencyCode(govAgencyCode);
		}

		String govAgencyName = (String)attributes.get("govAgencyName");

		if (govAgencyName != null) {
			setGovAgencyName(govAgencyName);
		}

		String serviceInstruction = (String)attributes.get("serviceInstruction");

		if (serviceInstruction != null) {
			setServiceInstruction(serviceInstruction);
		}

		Integer serviceLevel = (Integer)attributes.get("serviceLevel");

		if (serviceLevel != null) {
			setServiceLevel(serviceLevel);
		}

		Boolean servicePortal = (Boolean)attributes.get("servicePortal");

		if (servicePortal != null) {
			setServicePortal(servicePortal);
		}

		Boolean serviceOnegate = (Boolean)attributes.get("serviceOnegate");

		if (serviceOnegate != null) {
			setServiceOnegate(serviceOnegate);
		}

		Boolean serviceBackoffice = (Boolean)attributes.get("serviceBackoffice");

		if (serviceBackoffice != null) {
			setServiceBackoffice(serviceBackoffice);
		}

		Long govAgencyOrganizationId = (Long)attributes.get(
				"govAgencyOrganizationId");

		if (govAgencyOrganizationId != null) {
			setGovAgencyOrganizationId(govAgencyOrganizationId);
		}

		Boolean serviceCitizen = (Boolean)attributes.get("serviceCitizen");

		if (serviceCitizen != null) {
			setServiceCitizen(serviceCitizen);
		}

		Boolean serviceBusinees = (Boolean)attributes.get("serviceBusinees");

		if (serviceBusinees != null) {
			setServiceBusinees(serviceBusinees);
		}

		Long serviceProcessId = (Long)attributes.get("serviceProcessId");

		if (serviceProcessId != null) {
			setServiceProcessId(serviceProcessId);
		}

		String domainCode = (String)attributes.get("domainCode");

		if (domainCode != null) {
			setDomainCode(domainCode);
		}

		Integer serviceMode = (Integer)attributes.get("serviceMode");

		if (serviceMode != null) {
			setServiceMode(serviceMode);
		}

		String govAgencyIndex = (String)attributes.get("govAgencyIndex");

		if (govAgencyIndex != null) {
			setGovAgencyIndex(govAgencyIndex);
		}

		String serviceUrl = (String)attributes.get("serviceUrl");

		if (serviceUrl != null) {
			setServiceUrl(serviceUrl);
		}
	}

	@Override
	public long getServiceConfigId() {
		return _serviceConfigId;
	}

	@Override
	public void setServiceConfigId(long serviceConfigId) {
		_serviceConfigId = serviceConfigId;

		if (_serviceConfigRemoteModel != null) {
			try {
				Class<?> clazz = _serviceConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setServiceConfigId", long.class);

				method.invoke(_serviceConfigRemoteModel, serviceConfigId);
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

		if (_serviceConfigRemoteModel != null) {
			try {
				Class<?> clazz = _serviceConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_serviceConfigRemoteModel, companyId);
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

		if (_serviceConfigRemoteModel != null) {
			try {
				Class<?> clazz = _serviceConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_serviceConfigRemoteModel, groupId);
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

		if (_serviceConfigRemoteModel != null) {
			try {
				Class<?> clazz = _serviceConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_serviceConfigRemoteModel, userId);
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

		if (_serviceConfigRemoteModel != null) {
			try {
				Class<?> clazz = _serviceConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_serviceConfigRemoteModel, createDate);
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

		if (_serviceConfigRemoteModel != null) {
			try {
				Class<?> clazz = _serviceConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_serviceConfigRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getServiceInfoId() {
		return _serviceInfoId;
	}

	@Override
	public void setServiceInfoId(long serviceInfoId) {
		_serviceInfoId = serviceInfoId;

		if (_serviceConfigRemoteModel != null) {
			try {
				Class<?> clazz = _serviceConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setServiceInfoId", long.class);

				method.invoke(_serviceConfigRemoteModel, serviceInfoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getServiceDomainIndex() {
		return _serviceDomainIndex;
	}

	@Override
	public void setServiceDomainIndex(String serviceDomainIndex) {
		_serviceDomainIndex = serviceDomainIndex;

		if (_serviceConfigRemoteModel != null) {
			try {
				Class<?> clazz = _serviceConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setServiceDomainIndex",
						String.class);

				method.invoke(_serviceConfigRemoteModel, serviceDomainIndex);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getServiceAdministrationIndex() {
		return _serviceAdministrationIndex;
	}

	@Override
	public void setServiceAdministrationIndex(String serviceAdministrationIndex) {
		_serviceAdministrationIndex = serviceAdministrationIndex;

		if (_serviceConfigRemoteModel != null) {
			try {
				Class<?> clazz = _serviceConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setServiceAdministrationIndex",
						String.class);

				method.invoke(_serviceConfigRemoteModel,
					serviceAdministrationIndex);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDossierTemplateId() {
		return _dossierTemplateId;
	}

	@Override
	public void setDossierTemplateId(long dossierTemplateId) {
		_dossierTemplateId = dossierTemplateId;

		if (_serviceConfigRemoteModel != null) {
			try {
				Class<?> clazz = _serviceConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setDossierTemplateId",
						long.class);

				method.invoke(_serviceConfigRemoteModel, dossierTemplateId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGovAgencyCode() {
		return _govAgencyCode;
	}

	@Override
	public void setGovAgencyCode(String govAgencyCode) {
		_govAgencyCode = govAgencyCode;

		if (_serviceConfigRemoteModel != null) {
			try {
				Class<?> clazz = _serviceConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setGovAgencyCode", String.class);

				method.invoke(_serviceConfigRemoteModel, govAgencyCode);
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

		if (_serviceConfigRemoteModel != null) {
			try {
				Class<?> clazz = _serviceConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setGovAgencyName", String.class);

				method.invoke(_serviceConfigRemoteModel, govAgencyName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getServiceInstruction() {
		return _serviceInstruction;
	}

	@Override
	public void setServiceInstruction(String serviceInstruction) {
		_serviceInstruction = serviceInstruction;

		if (_serviceConfigRemoteModel != null) {
			try {
				Class<?> clazz = _serviceConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setServiceInstruction",
						String.class);

				method.invoke(_serviceConfigRemoteModel, serviceInstruction);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getServiceLevel() {
		return _serviceLevel;
	}

	@Override
	public void setServiceLevel(int serviceLevel) {
		_serviceLevel = serviceLevel;

		if (_serviceConfigRemoteModel != null) {
			try {
				Class<?> clazz = _serviceConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setServiceLevel", int.class);

				method.invoke(_serviceConfigRemoteModel, serviceLevel);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getServicePortal() {
		return _servicePortal;
	}

	@Override
	public boolean isServicePortal() {
		return _servicePortal;
	}

	@Override
	public void setServicePortal(boolean servicePortal) {
		_servicePortal = servicePortal;

		if (_serviceConfigRemoteModel != null) {
			try {
				Class<?> clazz = _serviceConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setServicePortal",
						boolean.class);

				method.invoke(_serviceConfigRemoteModel, servicePortal);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getServiceOnegate() {
		return _serviceOnegate;
	}

	@Override
	public boolean isServiceOnegate() {
		return _serviceOnegate;
	}

	@Override
	public void setServiceOnegate(boolean serviceOnegate) {
		_serviceOnegate = serviceOnegate;

		if (_serviceConfigRemoteModel != null) {
			try {
				Class<?> clazz = _serviceConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setServiceOnegate",
						boolean.class);

				method.invoke(_serviceConfigRemoteModel, serviceOnegate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getServiceBackoffice() {
		return _serviceBackoffice;
	}

	@Override
	public boolean isServiceBackoffice() {
		return _serviceBackoffice;
	}

	@Override
	public void setServiceBackoffice(boolean serviceBackoffice) {
		_serviceBackoffice = serviceBackoffice;

		if (_serviceConfigRemoteModel != null) {
			try {
				Class<?> clazz = _serviceConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setServiceBackoffice",
						boolean.class);

				method.invoke(_serviceConfigRemoteModel, serviceBackoffice);
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

		if (_serviceConfigRemoteModel != null) {
			try {
				Class<?> clazz = _serviceConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setGovAgencyOrganizationId",
						long.class);

				method.invoke(_serviceConfigRemoteModel, govAgencyOrganizationId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getServiceCitizen() {
		return _serviceCitizen;
	}

	@Override
	public boolean isServiceCitizen() {
		return _serviceCitizen;
	}

	@Override
	public void setServiceCitizen(boolean serviceCitizen) {
		_serviceCitizen = serviceCitizen;

		if (_serviceConfigRemoteModel != null) {
			try {
				Class<?> clazz = _serviceConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setServiceCitizen",
						boolean.class);

				method.invoke(_serviceConfigRemoteModel, serviceCitizen);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getServiceBusinees() {
		return _serviceBusinees;
	}

	@Override
	public boolean isServiceBusinees() {
		return _serviceBusinees;
	}

	@Override
	public void setServiceBusinees(boolean serviceBusinees) {
		_serviceBusinees = serviceBusinees;

		if (_serviceConfigRemoteModel != null) {
			try {
				Class<?> clazz = _serviceConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setServiceBusinees",
						boolean.class);

				method.invoke(_serviceConfigRemoteModel, serviceBusinees);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getServiceProcessId() {
		return _serviceProcessId;
	}

	@Override
	public void setServiceProcessId(long serviceProcessId) {
		_serviceProcessId = serviceProcessId;

		if (_serviceConfigRemoteModel != null) {
			try {
				Class<?> clazz = _serviceConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setServiceProcessId",
						long.class);

				method.invoke(_serviceConfigRemoteModel, serviceProcessId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDomainCode() {
		return _domainCode;
	}

	@Override
	public void setDomainCode(String domainCode) {
		_domainCode = domainCode;

		if (_serviceConfigRemoteModel != null) {
			try {
				Class<?> clazz = _serviceConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setDomainCode", String.class);

				method.invoke(_serviceConfigRemoteModel, domainCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getServiceMode() {
		return _serviceMode;
	}

	@Override
	public void setServiceMode(int serviceMode) {
		_serviceMode = serviceMode;

		if (_serviceConfigRemoteModel != null) {
			try {
				Class<?> clazz = _serviceConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setServiceMode", int.class);

				method.invoke(_serviceConfigRemoteModel, serviceMode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGovAgencyIndex() {
		return _govAgencyIndex;
	}

	@Override
	public void setGovAgencyIndex(String govAgencyIndex) {
		_govAgencyIndex = govAgencyIndex;

		if (_serviceConfigRemoteModel != null) {
			try {
				Class<?> clazz = _serviceConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setGovAgencyIndex",
						String.class);

				method.invoke(_serviceConfigRemoteModel, govAgencyIndex);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getServiceUrl() {
		return _serviceUrl;
	}

	@Override
	public void setServiceUrl(String serviceUrl) {
		_serviceUrl = serviceUrl;

		if (_serviceConfigRemoteModel != null) {
			try {
				Class<?> clazz = _serviceConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setServiceUrl", String.class);

				method.invoke(_serviceConfigRemoteModel, serviceUrl);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getServiceConfigRemoteModel() {
		return _serviceConfigRemoteModel;
	}

	public void setServiceConfigRemoteModel(
		BaseModel<?> serviceConfigRemoteModel) {
		_serviceConfigRemoteModel = serviceConfigRemoteModel;
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

		Class<?> remoteModelClass = _serviceConfigRemoteModel.getClass();

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

		Object returnValue = method.invoke(_serviceConfigRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ServiceConfigLocalServiceUtil.addServiceConfig(this);
		}
		else {
			ServiceConfigLocalServiceUtil.updateServiceConfig(this);
		}
	}

	@Override
	public ServiceConfig toEscapedModel() {
		return (ServiceConfig)ProxyUtil.newProxyInstance(ServiceConfig.class.getClassLoader(),
			new Class[] { ServiceConfig.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ServiceConfigClp clone = new ServiceConfigClp();

		clone.setServiceConfigId(getServiceConfigId());
		clone.setCompanyId(getCompanyId());
		clone.setGroupId(getGroupId());
		clone.setUserId(getUserId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setServiceInfoId(getServiceInfoId());
		clone.setServiceDomainIndex(getServiceDomainIndex());
		clone.setServiceAdministrationIndex(getServiceAdministrationIndex());
		clone.setDossierTemplateId(getDossierTemplateId());
		clone.setGovAgencyCode(getGovAgencyCode());
		clone.setGovAgencyName(getGovAgencyName());
		clone.setServiceInstruction(getServiceInstruction());
		clone.setServiceLevel(getServiceLevel());
		clone.setServicePortal(getServicePortal());
		clone.setServiceOnegate(getServiceOnegate());
		clone.setServiceBackoffice(getServiceBackoffice());
		clone.setGovAgencyOrganizationId(getGovAgencyOrganizationId());
		clone.setServiceCitizen(getServiceCitizen());
		clone.setServiceBusinees(getServiceBusinees());
		clone.setServiceProcessId(getServiceProcessId());
		clone.setDomainCode(getDomainCode());
		clone.setServiceMode(getServiceMode());
		clone.setGovAgencyIndex(getGovAgencyIndex());
		clone.setServiceUrl(getServiceUrl());

		return clone;
	}

	@Override
	public int compareTo(ServiceConfig serviceConfig) {
		long primaryKey = serviceConfig.getPrimaryKey();

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

		if (!(obj instanceof ServiceConfigClp)) {
			return false;
		}

		ServiceConfigClp serviceConfig = (ServiceConfigClp)obj;

		long primaryKey = serviceConfig.getPrimaryKey();

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
		StringBundler sb = new StringBundler(51);

		sb.append("{serviceConfigId=");
		sb.append(getServiceConfigId());
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
		sb.append(", serviceInfoId=");
		sb.append(getServiceInfoId());
		sb.append(", serviceDomainIndex=");
		sb.append(getServiceDomainIndex());
		sb.append(", serviceAdministrationIndex=");
		sb.append(getServiceAdministrationIndex());
		sb.append(", dossierTemplateId=");
		sb.append(getDossierTemplateId());
		sb.append(", govAgencyCode=");
		sb.append(getGovAgencyCode());
		sb.append(", govAgencyName=");
		sb.append(getGovAgencyName());
		sb.append(", serviceInstruction=");
		sb.append(getServiceInstruction());
		sb.append(", serviceLevel=");
		sb.append(getServiceLevel());
		sb.append(", servicePortal=");
		sb.append(getServicePortal());
		sb.append(", serviceOnegate=");
		sb.append(getServiceOnegate());
		sb.append(", serviceBackoffice=");
		sb.append(getServiceBackoffice());
		sb.append(", govAgencyOrganizationId=");
		sb.append(getGovAgencyOrganizationId());
		sb.append(", serviceCitizen=");
		sb.append(getServiceCitizen());
		sb.append(", serviceBusinees=");
		sb.append(getServiceBusinees());
		sb.append(", serviceProcessId=");
		sb.append(getServiceProcessId());
		sb.append(", domainCode=");
		sb.append(getDomainCode());
		sb.append(", serviceMode=");
		sb.append(getServiceMode());
		sb.append(", govAgencyIndex=");
		sb.append(getGovAgencyIndex());
		sb.append(", serviceUrl=");
		sb.append(getServiceUrl());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(79);

		sb.append("<model><model-name>");
		sb.append("org.opencps.dossiermgt.model.ServiceConfig");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>serviceConfigId</column-name><column-value><![CDATA[");
		sb.append(getServiceConfigId());
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
			"<column><column-name>serviceInfoId</column-name><column-value><![CDATA[");
		sb.append(getServiceInfoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>serviceDomainIndex</column-name><column-value><![CDATA[");
		sb.append(getServiceDomainIndex());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>serviceAdministrationIndex</column-name><column-value><![CDATA[");
		sb.append(getServiceAdministrationIndex());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dossierTemplateId</column-name><column-value><![CDATA[");
		sb.append(getDossierTemplateId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>govAgencyCode</column-name><column-value><![CDATA[");
		sb.append(getGovAgencyCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>govAgencyName</column-name><column-value><![CDATA[");
		sb.append(getGovAgencyName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>serviceInstruction</column-name><column-value><![CDATA[");
		sb.append(getServiceInstruction());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>serviceLevel</column-name><column-value><![CDATA[");
		sb.append(getServiceLevel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>servicePortal</column-name><column-value><![CDATA[");
		sb.append(getServicePortal());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>serviceOnegate</column-name><column-value><![CDATA[");
		sb.append(getServiceOnegate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>serviceBackoffice</column-name><column-value><![CDATA[");
		sb.append(getServiceBackoffice());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>govAgencyOrganizationId</column-name><column-value><![CDATA[");
		sb.append(getGovAgencyOrganizationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>serviceCitizen</column-name><column-value><![CDATA[");
		sb.append(getServiceCitizen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>serviceBusinees</column-name><column-value><![CDATA[");
		sb.append(getServiceBusinees());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>serviceProcessId</column-name><column-value><![CDATA[");
		sb.append(getServiceProcessId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>domainCode</column-name><column-value><![CDATA[");
		sb.append(getDomainCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>serviceMode</column-name><column-value><![CDATA[");
		sb.append(getServiceMode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>govAgencyIndex</column-name><column-value><![CDATA[");
		sb.append(getGovAgencyIndex());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>serviceUrl</column-name><column-value><![CDATA[");
		sb.append(getServiceUrl());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _serviceConfigId;
	private long _companyId;
	private long _groupId;
	private long _userId;
	private String _userUuid;
	private Date _createDate;
	private Date _modifiedDate;
	private long _serviceInfoId;
	private String _serviceDomainIndex;
	private String _serviceAdministrationIndex;
	private long _dossierTemplateId;
	private String _govAgencyCode;
	private String _govAgencyName;
	private String _serviceInstruction;
	private int _serviceLevel;
	private boolean _servicePortal;
	private boolean _serviceOnegate;
	private boolean _serviceBackoffice;
	private long _govAgencyOrganizationId;
	private boolean _serviceCitizen;
	private boolean _serviceBusinees;
	private long _serviceProcessId;
	private String _domainCode;
	private int _serviceMode;
	private String _govAgencyIndex;
	private String _serviceUrl;
	private BaseModel<?> _serviceConfigRemoteModel;
	private Class<?> _clpSerializerClass = org.opencps.dossiermgt.service.ClpSerializer.class;
}