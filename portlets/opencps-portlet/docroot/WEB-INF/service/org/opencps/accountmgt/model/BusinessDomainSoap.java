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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link org.opencps.accountmgt.service.http.BusinessDomainServiceSoap}.
 *
 * @author khoavd
 * @see org.opencps.accountmgt.service.http.BusinessDomainServiceSoap
 * @generated
 */
public class BusinessDomainSoap implements Serializable {
	public static BusinessDomainSoap toSoapModel(BusinessDomain model) {
		BusinessDomainSoap soapModel = new BusinessDomainSoap();

		soapModel.setDomainId(model.getDomainId());
		soapModel.setBusinessId(model.getBusinessId());
		soapModel.setBusinessDomainCode(model.getBusinessDomainCode());

		return soapModel;
	}

	public static BusinessDomainSoap[] toSoapModels(BusinessDomain[] models) {
		BusinessDomainSoap[] soapModels = new BusinessDomainSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static BusinessDomainSoap[][] toSoapModels(BusinessDomain[][] models) {
		BusinessDomainSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new BusinessDomainSoap[models.length][models[0].length];
		}
		else {
			soapModels = new BusinessDomainSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static BusinessDomainSoap[] toSoapModels(List<BusinessDomain> models) {
		List<BusinessDomainSoap> soapModels = new ArrayList<BusinessDomainSoap>(models.size());

		for (BusinessDomain model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new BusinessDomainSoap[soapModels.size()]);
	}

	public BusinessDomainSoap() {
	}

	public long getPrimaryKey() {
		return _domainId;
	}

	public void setPrimaryKey(long pk) {
		setDomainId(pk);
	}

	public long getDomainId() {
		return _domainId;
	}

	public void setDomainId(long domainId) {
		_domainId = domainId;
	}

	public long getBusinessId() {
		return _businessId;
	}

	public void setBusinessId(long businessId) {
		_businessId = businessId;
	}

	public String getBusinessDomainCode() {
		return _businessDomainCode;
	}

	public void setBusinessDomainCode(String businessDomainCode) {
		_businessDomainCode = businessDomainCode;
	}

	private long _domainId;
	private long _businessId;
	private String _businessDomainCode;
}