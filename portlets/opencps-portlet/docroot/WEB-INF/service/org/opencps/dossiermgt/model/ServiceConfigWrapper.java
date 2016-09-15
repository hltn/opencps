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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ServiceConfig}.
 * </p>
 *
 * @author trungnt
 * @see ServiceConfig
 * @generated
 */
public class ServiceConfigWrapper implements ServiceConfig,
	ModelWrapper<ServiceConfig> {
	public ServiceConfigWrapper(ServiceConfig serviceConfig) {
		_serviceConfig = serviceConfig;
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

	/**
	* Returns the primary key of this service config.
	*
	* @return the primary key of this service config
	*/
	@Override
	public long getPrimaryKey() {
		return _serviceConfig.getPrimaryKey();
	}

	/**
	* Sets the primary key of this service config.
	*
	* @param primaryKey the primary key of this service config
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_serviceConfig.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the service config ID of this service config.
	*
	* @return the service config ID of this service config
	*/
	@Override
	public long getServiceConfigId() {
		return _serviceConfig.getServiceConfigId();
	}

	/**
	* Sets the service config ID of this service config.
	*
	* @param serviceConfigId the service config ID of this service config
	*/
	@Override
	public void setServiceConfigId(long serviceConfigId) {
		_serviceConfig.setServiceConfigId(serviceConfigId);
	}

	/**
	* Returns the company ID of this service config.
	*
	* @return the company ID of this service config
	*/
	@Override
	public long getCompanyId() {
		return _serviceConfig.getCompanyId();
	}

	/**
	* Sets the company ID of this service config.
	*
	* @param companyId the company ID of this service config
	*/
	@Override
	public void setCompanyId(long companyId) {
		_serviceConfig.setCompanyId(companyId);
	}

	/**
	* Returns the group ID of this service config.
	*
	* @return the group ID of this service config
	*/
	@Override
	public long getGroupId() {
		return _serviceConfig.getGroupId();
	}

	/**
	* Sets the group ID of this service config.
	*
	* @param groupId the group ID of this service config
	*/
	@Override
	public void setGroupId(long groupId) {
		_serviceConfig.setGroupId(groupId);
	}

	/**
	* Returns the user ID of this service config.
	*
	* @return the user ID of this service config
	*/
	@Override
	public long getUserId() {
		return _serviceConfig.getUserId();
	}

	/**
	* Sets the user ID of this service config.
	*
	* @param userId the user ID of this service config
	*/
	@Override
	public void setUserId(long userId) {
		_serviceConfig.setUserId(userId);
	}

	/**
	* Returns the user uuid of this service config.
	*
	* @return the user uuid of this service config
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceConfig.getUserUuid();
	}

	/**
	* Sets the user uuid of this service config.
	*
	* @param userUuid the user uuid of this service config
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_serviceConfig.setUserUuid(userUuid);
	}

	/**
	* Returns the create date of this service config.
	*
	* @return the create date of this service config
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _serviceConfig.getCreateDate();
	}

	/**
	* Sets the create date of this service config.
	*
	* @param createDate the create date of this service config
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_serviceConfig.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this service config.
	*
	* @return the modified date of this service config
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _serviceConfig.getModifiedDate();
	}

	/**
	* Sets the modified date of this service config.
	*
	* @param modifiedDate the modified date of this service config
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_serviceConfig.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the service info ID of this service config.
	*
	* @return the service info ID of this service config
	*/
	@Override
	public long getServiceInfoId() {
		return _serviceConfig.getServiceInfoId();
	}

	/**
	* Sets the service info ID of this service config.
	*
	* @param serviceInfoId the service info ID of this service config
	*/
	@Override
	public void setServiceInfoId(long serviceInfoId) {
		_serviceConfig.setServiceInfoId(serviceInfoId);
	}

	/**
	* Returns the service domain index of this service config.
	*
	* @return the service domain index of this service config
	*/
	@Override
	public java.lang.String getServiceDomainIndex() {
		return _serviceConfig.getServiceDomainIndex();
	}

	/**
	* Sets the service domain index of this service config.
	*
	* @param serviceDomainIndex the service domain index of this service config
	*/
	@Override
	public void setServiceDomainIndex(java.lang.String serviceDomainIndex) {
		_serviceConfig.setServiceDomainIndex(serviceDomainIndex);
	}

	/**
	* Returns the service administration index of this service config.
	*
	* @return the service administration index of this service config
	*/
	@Override
	public java.lang.String getServiceAdministrationIndex() {
		return _serviceConfig.getServiceAdministrationIndex();
	}

	/**
	* Sets the service administration index of this service config.
	*
	* @param serviceAdministrationIndex the service administration index of this service config
	*/
	@Override
	public void setServiceAdministrationIndex(
		java.lang.String serviceAdministrationIndex) {
		_serviceConfig.setServiceAdministrationIndex(serviceAdministrationIndex);
	}

	/**
	* Returns the dossier template ID of this service config.
	*
	* @return the dossier template ID of this service config
	*/
	@Override
	public long getDossierTemplateId() {
		return _serviceConfig.getDossierTemplateId();
	}

	/**
	* Sets the dossier template ID of this service config.
	*
	* @param dossierTemplateId the dossier template ID of this service config
	*/
	@Override
	public void setDossierTemplateId(long dossierTemplateId) {
		_serviceConfig.setDossierTemplateId(dossierTemplateId);
	}

	/**
	* Returns the gov agency code of this service config.
	*
	* @return the gov agency code of this service config
	*/
	@Override
	public java.lang.String getGovAgencyCode() {
		return _serviceConfig.getGovAgencyCode();
	}

	/**
	* Sets the gov agency code of this service config.
	*
	* @param govAgencyCode the gov agency code of this service config
	*/
	@Override
	public void setGovAgencyCode(java.lang.String govAgencyCode) {
		_serviceConfig.setGovAgencyCode(govAgencyCode);
	}

	/**
	* Returns the gov agency name of this service config.
	*
	* @return the gov agency name of this service config
	*/
	@Override
	public java.lang.String getGovAgencyName() {
		return _serviceConfig.getGovAgencyName();
	}

	/**
	* Sets the gov agency name of this service config.
	*
	* @param govAgencyName the gov agency name of this service config
	*/
	@Override
	public void setGovAgencyName(java.lang.String govAgencyName) {
		_serviceConfig.setGovAgencyName(govAgencyName);
	}

	/**
	* Returns the service instruction of this service config.
	*
	* @return the service instruction of this service config
	*/
	@Override
	public java.lang.String getServiceInstruction() {
		return _serviceConfig.getServiceInstruction();
	}

	/**
	* Sets the service instruction of this service config.
	*
	* @param serviceInstruction the service instruction of this service config
	*/
	@Override
	public void setServiceInstruction(java.lang.String serviceInstruction) {
		_serviceConfig.setServiceInstruction(serviceInstruction);
	}

	/**
	* Returns the service level of this service config.
	*
	* @return the service level of this service config
	*/
	@Override
	public int getServiceLevel() {
		return _serviceConfig.getServiceLevel();
	}

	/**
	* Sets the service level of this service config.
	*
	* @param serviceLevel the service level of this service config
	*/
	@Override
	public void setServiceLevel(int serviceLevel) {
		_serviceConfig.setServiceLevel(serviceLevel);
	}

	/**
	* Returns the service portal of this service config.
	*
	* @return the service portal of this service config
	*/
	@Override
	public boolean getServicePortal() {
		return _serviceConfig.getServicePortal();
	}

	/**
	* Returns <code>true</code> if this service config is service portal.
	*
	* @return <code>true</code> if this service config is service portal; <code>false</code> otherwise
	*/
	@Override
	public boolean isServicePortal() {
		return _serviceConfig.isServicePortal();
	}

	/**
	* Sets whether this service config is service portal.
	*
	* @param servicePortal the service portal of this service config
	*/
	@Override
	public void setServicePortal(boolean servicePortal) {
		_serviceConfig.setServicePortal(servicePortal);
	}

	/**
	* Returns the service onegate of this service config.
	*
	* @return the service onegate of this service config
	*/
	@Override
	public boolean getServiceOnegate() {
		return _serviceConfig.getServiceOnegate();
	}

	/**
	* Returns <code>true</code> if this service config is service onegate.
	*
	* @return <code>true</code> if this service config is service onegate; <code>false</code> otherwise
	*/
	@Override
	public boolean isServiceOnegate() {
		return _serviceConfig.isServiceOnegate();
	}

	/**
	* Sets whether this service config is service onegate.
	*
	* @param serviceOnegate the service onegate of this service config
	*/
	@Override
	public void setServiceOnegate(boolean serviceOnegate) {
		_serviceConfig.setServiceOnegate(serviceOnegate);
	}

	/**
	* Returns the service backoffice of this service config.
	*
	* @return the service backoffice of this service config
	*/
	@Override
	public boolean getServiceBackoffice() {
		return _serviceConfig.getServiceBackoffice();
	}

	/**
	* Returns <code>true</code> if this service config is service backoffice.
	*
	* @return <code>true</code> if this service config is service backoffice; <code>false</code> otherwise
	*/
	@Override
	public boolean isServiceBackoffice() {
		return _serviceConfig.isServiceBackoffice();
	}

	/**
	* Sets whether this service config is service backoffice.
	*
	* @param serviceBackoffice the service backoffice of this service config
	*/
	@Override
	public void setServiceBackoffice(boolean serviceBackoffice) {
		_serviceConfig.setServiceBackoffice(serviceBackoffice);
	}

	/**
	* Returns the gov agency organization ID of this service config.
	*
	* @return the gov agency organization ID of this service config
	*/
	@Override
	public long getGovAgencyOrganizationId() {
		return _serviceConfig.getGovAgencyOrganizationId();
	}

	/**
	* Sets the gov agency organization ID of this service config.
	*
	* @param govAgencyOrganizationId the gov agency organization ID of this service config
	*/
	@Override
	public void setGovAgencyOrganizationId(long govAgencyOrganizationId) {
		_serviceConfig.setGovAgencyOrganizationId(govAgencyOrganizationId);
	}

	/**
	* Returns the service citizen of this service config.
	*
	* @return the service citizen of this service config
	*/
	@Override
	public boolean getServiceCitizen() {
		return _serviceConfig.getServiceCitizen();
	}

	/**
	* Returns <code>true</code> if this service config is service citizen.
	*
	* @return <code>true</code> if this service config is service citizen; <code>false</code> otherwise
	*/
	@Override
	public boolean isServiceCitizen() {
		return _serviceConfig.isServiceCitizen();
	}

	/**
	* Sets whether this service config is service citizen.
	*
	* @param serviceCitizen the service citizen of this service config
	*/
	@Override
	public void setServiceCitizen(boolean serviceCitizen) {
		_serviceConfig.setServiceCitizen(serviceCitizen);
	}

	/**
	* Returns the service businees of this service config.
	*
	* @return the service businees of this service config
	*/
	@Override
	public boolean getServiceBusinees() {
		return _serviceConfig.getServiceBusinees();
	}

	/**
	* Returns <code>true</code> if this service config is service businees.
	*
	* @return <code>true</code> if this service config is service businees; <code>false</code> otherwise
	*/
	@Override
	public boolean isServiceBusinees() {
		return _serviceConfig.isServiceBusinees();
	}

	/**
	* Sets whether this service config is service businees.
	*
	* @param serviceBusinees the service businees of this service config
	*/
	@Override
	public void setServiceBusinees(boolean serviceBusinees) {
		_serviceConfig.setServiceBusinees(serviceBusinees);
	}

	/**
	* Returns the service process ID of this service config.
	*
	* @return the service process ID of this service config
	*/
	@Override
	public long getServiceProcessId() {
		return _serviceConfig.getServiceProcessId();
	}

	/**
	* Sets the service process ID of this service config.
	*
	* @param serviceProcessId the service process ID of this service config
	*/
	@Override
	public void setServiceProcessId(long serviceProcessId) {
		_serviceConfig.setServiceProcessId(serviceProcessId);
	}

	/**
	* Returns the domain code of this service config.
	*
	* @return the domain code of this service config
	*/
	@Override
	public java.lang.String getDomainCode() {
		return _serviceConfig.getDomainCode();
	}

	/**
	* Sets the domain code of this service config.
	*
	* @param domainCode the domain code of this service config
	*/
	@Override
	public void setDomainCode(java.lang.String domainCode) {
		_serviceConfig.setDomainCode(domainCode);
	}

	/**
	* Returns the service mode of this service config.
	*
	* @return the service mode of this service config
	*/
	@Override
	public int getServiceMode() {
		return _serviceConfig.getServiceMode();
	}

	/**
	* Sets the service mode of this service config.
	*
	* @param serviceMode the service mode of this service config
	*/
	@Override
	public void setServiceMode(int serviceMode) {
		_serviceConfig.setServiceMode(serviceMode);
	}

	/**
	* Returns the gov agency index of this service config.
	*
	* @return the gov agency index of this service config
	*/
	@Override
	public java.lang.String getGovAgencyIndex() {
		return _serviceConfig.getGovAgencyIndex();
	}

	/**
	* Sets the gov agency index of this service config.
	*
	* @param govAgencyIndex the gov agency index of this service config
	*/
	@Override
	public void setGovAgencyIndex(java.lang.String govAgencyIndex) {
		_serviceConfig.setGovAgencyIndex(govAgencyIndex);
	}

	/**
	* Returns the service url of this service config.
	*
	* @return the service url of this service config
	*/
	@Override
	public java.lang.String getServiceUrl() {
		return _serviceConfig.getServiceUrl();
	}

	/**
	* Sets the service url of this service config.
	*
	* @param serviceUrl the service url of this service config
	*/
	@Override
	public void setServiceUrl(java.lang.String serviceUrl) {
		_serviceConfig.setServiceUrl(serviceUrl);
	}

	@Override
	public boolean isNew() {
		return _serviceConfig.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_serviceConfig.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _serviceConfig.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_serviceConfig.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _serviceConfig.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _serviceConfig.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_serviceConfig.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _serviceConfig.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_serviceConfig.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_serviceConfig.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_serviceConfig.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ServiceConfigWrapper((ServiceConfig)_serviceConfig.clone());
	}

	@Override
	public int compareTo(
		org.opencps.dossiermgt.model.ServiceConfig serviceConfig) {
		return _serviceConfig.compareTo(serviceConfig);
	}

	@Override
	public int hashCode() {
		return _serviceConfig.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.opencps.dossiermgt.model.ServiceConfig> toCacheModel() {
		return _serviceConfig.toCacheModel();
	}

	@Override
	public org.opencps.dossiermgt.model.ServiceConfig toEscapedModel() {
		return new ServiceConfigWrapper(_serviceConfig.toEscapedModel());
	}

	@Override
	public org.opencps.dossiermgt.model.ServiceConfig toUnescapedModel() {
		return new ServiceConfigWrapper(_serviceConfig.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _serviceConfig.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _serviceConfig.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_serviceConfig.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ServiceConfigWrapper)) {
			return false;
		}

		ServiceConfigWrapper serviceConfigWrapper = (ServiceConfigWrapper)obj;

		if (Validator.equals(_serviceConfig, serviceConfigWrapper._serviceConfig)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ServiceConfig getWrappedServiceConfig() {
		return _serviceConfig;
	}

	@Override
	public ServiceConfig getWrappedModel() {
		return _serviceConfig;
	}

	@Override
	public void resetOriginalValues() {
		_serviceConfig.resetOriginalValues();
	}

	private ServiceConfig _serviceConfig;
}