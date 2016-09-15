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

package org.opencps.dossiermgt.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import org.opencps.dossiermgt.model.ServiceConfig;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ServiceConfig in entity cache.
 *
 * @author trungnt
 * @see ServiceConfig
 * @generated
 */
public class ServiceConfigCacheModel implements CacheModel<ServiceConfig>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(51);

		sb.append("{serviceConfigId=");
		sb.append(serviceConfigId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", serviceInfoId=");
		sb.append(serviceInfoId);
		sb.append(", serviceDomainIndex=");
		sb.append(serviceDomainIndex);
		sb.append(", serviceAdministrationIndex=");
		sb.append(serviceAdministrationIndex);
		sb.append(", dossierTemplateId=");
		sb.append(dossierTemplateId);
		sb.append(", govAgencyCode=");
		sb.append(govAgencyCode);
		sb.append(", govAgencyName=");
		sb.append(govAgencyName);
		sb.append(", serviceInstruction=");
		sb.append(serviceInstruction);
		sb.append(", serviceLevel=");
		sb.append(serviceLevel);
		sb.append(", servicePortal=");
		sb.append(servicePortal);
		sb.append(", serviceOnegate=");
		sb.append(serviceOnegate);
		sb.append(", serviceBackoffice=");
		sb.append(serviceBackoffice);
		sb.append(", govAgencyOrganizationId=");
		sb.append(govAgencyOrganizationId);
		sb.append(", serviceCitizen=");
		sb.append(serviceCitizen);
		sb.append(", serviceBusinees=");
		sb.append(serviceBusinees);
		sb.append(", serviceProcessId=");
		sb.append(serviceProcessId);
		sb.append(", domainCode=");
		sb.append(domainCode);
		sb.append(", serviceMode=");
		sb.append(serviceMode);
		sb.append(", govAgencyIndex=");
		sb.append(govAgencyIndex);
		sb.append(", serviceUrl=");
		sb.append(serviceUrl);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ServiceConfig toEntityModel() {
		ServiceConfigImpl serviceConfigImpl = new ServiceConfigImpl();

		serviceConfigImpl.setServiceConfigId(serviceConfigId);
		serviceConfigImpl.setCompanyId(companyId);
		serviceConfigImpl.setGroupId(groupId);
		serviceConfigImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			serviceConfigImpl.setCreateDate(null);
		}
		else {
			serviceConfigImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			serviceConfigImpl.setModifiedDate(null);
		}
		else {
			serviceConfigImpl.setModifiedDate(new Date(modifiedDate));
		}

		serviceConfigImpl.setServiceInfoId(serviceInfoId);

		if (serviceDomainIndex == null) {
			serviceConfigImpl.setServiceDomainIndex(StringPool.BLANK);
		}
		else {
			serviceConfigImpl.setServiceDomainIndex(serviceDomainIndex);
		}

		if (serviceAdministrationIndex == null) {
			serviceConfigImpl.setServiceAdministrationIndex(StringPool.BLANK);
		}
		else {
			serviceConfigImpl.setServiceAdministrationIndex(serviceAdministrationIndex);
		}

		serviceConfigImpl.setDossierTemplateId(dossierTemplateId);

		if (govAgencyCode == null) {
			serviceConfigImpl.setGovAgencyCode(StringPool.BLANK);
		}
		else {
			serviceConfigImpl.setGovAgencyCode(govAgencyCode);
		}

		if (govAgencyName == null) {
			serviceConfigImpl.setGovAgencyName(StringPool.BLANK);
		}
		else {
			serviceConfigImpl.setGovAgencyName(govAgencyName);
		}

		if (serviceInstruction == null) {
			serviceConfigImpl.setServiceInstruction(StringPool.BLANK);
		}
		else {
			serviceConfigImpl.setServiceInstruction(serviceInstruction);
		}

		serviceConfigImpl.setServiceLevel(serviceLevel);
		serviceConfigImpl.setServicePortal(servicePortal);
		serviceConfigImpl.setServiceOnegate(serviceOnegate);
		serviceConfigImpl.setServiceBackoffice(serviceBackoffice);
		serviceConfigImpl.setGovAgencyOrganizationId(govAgencyOrganizationId);
		serviceConfigImpl.setServiceCitizen(serviceCitizen);
		serviceConfigImpl.setServiceBusinees(serviceBusinees);
		serviceConfigImpl.setServiceProcessId(serviceProcessId);

		if (domainCode == null) {
			serviceConfigImpl.setDomainCode(StringPool.BLANK);
		}
		else {
			serviceConfigImpl.setDomainCode(domainCode);
		}

		serviceConfigImpl.setServiceMode(serviceMode);

		if (govAgencyIndex == null) {
			serviceConfigImpl.setGovAgencyIndex(StringPool.BLANK);
		}
		else {
			serviceConfigImpl.setGovAgencyIndex(govAgencyIndex);
		}

		if (serviceUrl == null) {
			serviceConfigImpl.setServiceUrl(StringPool.BLANK);
		}
		else {
			serviceConfigImpl.setServiceUrl(serviceUrl);
		}

		serviceConfigImpl.resetOriginalValues();

		return serviceConfigImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		serviceConfigId = objectInput.readLong();
		companyId = objectInput.readLong();
		groupId = objectInput.readLong();
		userId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		serviceInfoId = objectInput.readLong();
		serviceDomainIndex = objectInput.readUTF();
		serviceAdministrationIndex = objectInput.readUTF();
		dossierTemplateId = objectInput.readLong();
		govAgencyCode = objectInput.readUTF();
		govAgencyName = objectInput.readUTF();
		serviceInstruction = objectInput.readUTF();
		serviceLevel = objectInput.readInt();
		servicePortal = objectInput.readBoolean();
		serviceOnegate = objectInput.readBoolean();
		serviceBackoffice = objectInput.readBoolean();
		govAgencyOrganizationId = objectInput.readLong();
		serviceCitizen = objectInput.readBoolean();
		serviceBusinees = objectInput.readBoolean();
		serviceProcessId = objectInput.readLong();
		domainCode = objectInput.readUTF();
		serviceMode = objectInput.readInt();
		govAgencyIndex = objectInput.readUTF();
		serviceUrl = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(serviceConfigId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(serviceInfoId);

		if (serviceDomainIndex == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(serviceDomainIndex);
		}

		if (serviceAdministrationIndex == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(serviceAdministrationIndex);
		}

		objectOutput.writeLong(dossierTemplateId);

		if (govAgencyCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(govAgencyCode);
		}

		if (govAgencyName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(govAgencyName);
		}

		if (serviceInstruction == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(serviceInstruction);
		}

		objectOutput.writeInt(serviceLevel);
		objectOutput.writeBoolean(servicePortal);
		objectOutput.writeBoolean(serviceOnegate);
		objectOutput.writeBoolean(serviceBackoffice);
		objectOutput.writeLong(govAgencyOrganizationId);
		objectOutput.writeBoolean(serviceCitizen);
		objectOutput.writeBoolean(serviceBusinees);
		objectOutput.writeLong(serviceProcessId);

		if (domainCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(domainCode);
		}

		objectOutput.writeInt(serviceMode);

		if (govAgencyIndex == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(govAgencyIndex);
		}

		if (serviceUrl == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(serviceUrl);
		}
	}

	public long serviceConfigId;
	public long companyId;
	public long groupId;
	public long userId;
	public long createDate;
	public long modifiedDate;
	public long serviceInfoId;
	public String serviceDomainIndex;
	public String serviceAdministrationIndex;
	public long dossierTemplateId;
	public String govAgencyCode;
	public String govAgencyName;
	public String serviceInstruction;
	public int serviceLevel;
	public boolean servicePortal;
	public boolean serviceOnegate;
	public boolean serviceBackoffice;
	public long govAgencyOrganizationId;
	public boolean serviceCitizen;
	public boolean serviceBusinees;
	public long serviceProcessId;
	public String domainCode;
	public int serviceMode;
	public String govAgencyIndex;
	public String serviceUrl;
}