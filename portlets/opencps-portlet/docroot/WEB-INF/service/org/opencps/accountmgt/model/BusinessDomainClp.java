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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import org.opencps.accountmgt.service.BusinessDomainLocalServiceUtil;
import org.opencps.accountmgt.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author khoavd
 */
public class BusinessDomainClp extends BaseModelImpl<BusinessDomain>
	implements BusinessDomain {
	public BusinessDomainClp() {
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
	public long getPrimaryKey() {
		return _domainId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDomainId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _domainId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getDomainId() {
		return _domainId;
	}

	@Override
	public void setDomainId(long domainId) {
		_domainId = domainId;

		if (_businessDomainRemoteModel != null) {
			try {
				Class<?> clazz = _businessDomainRemoteModel.getClass();

				Method method = clazz.getMethod("setDomainId", long.class);

				method.invoke(_businessDomainRemoteModel, domainId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getBusinessId() {
		return _businessId;
	}

	@Override
	public void setBusinessId(long businessId) {
		_businessId = businessId;

		if (_businessDomainRemoteModel != null) {
			try {
				Class<?> clazz = _businessDomainRemoteModel.getClass();

				Method method = clazz.getMethod("setBusinessId", long.class);

				method.invoke(_businessDomainRemoteModel, businessId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBusinessDomainCode() {
		return _businessDomainCode;
	}

	@Override
	public void setBusinessDomainCode(String businessDomainCode) {
		_businessDomainCode = businessDomainCode;

		if (_businessDomainRemoteModel != null) {
			try {
				Class<?> clazz = _businessDomainRemoteModel.getClass();

				Method method = clazz.getMethod("setBusinessDomainCode",
						String.class);

				method.invoke(_businessDomainRemoteModel, businessDomainCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getBusinessDomainRemoteModel() {
		return _businessDomainRemoteModel;
	}

	public void setBusinessDomainRemoteModel(
		BaseModel<?> businessDomainRemoteModel) {
		_businessDomainRemoteModel = businessDomainRemoteModel;
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

		Class<?> remoteModelClass = _businessDomainRemoteModel.getClass();

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

		Object returnValue = method.invoke(_businessDomainRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			BusinessDomainLocalServiceUtil.addBusinessDomain(this);
		}
		else {
			BusinessDomainLocalServiceUtil.updateBusinessDomain(this);
		}
	}

	@Override
	public BusinessDomain toEscapedModel() {
		return (BusinessDomain)ProxyUtil.newProxyInstance(BusinessDomain.class.getClassLoader(),
			new Class[] { BusinessDomain.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		BusinessDomainClp clone = new BusinessDomainClp();

		clone.setDomainId(getDomainId());
		clone.setBusinessId(getBusinessId());
		clone.setBusinessDomainCode(getBusinessDomainCode());

		return clone;
	}

	@Override
	public int compareTo(BusinessDomain businessDomain) {
		long primaryKey = businessDomain.getPrimaryKey();

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

		if (!(obj instanceof BusinessDomainClp)) {
			return false;
		}

		BusinessDomainClp businessDomain = (BusinessDomainClp)obj;

		long primaryKey = businessDomain.getPrimaryKey();

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
		StringBundler sb = new StringBundler(7);

		sb.append("{domainId=");
		sb.append(getDomainId());
		sb.append(", businessId=");
		sb.append(getBusinessId());
		sb.append(", businessDomainCode=");
		sb.append(getBusinessDomainCode());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("org.opencps.accountmgt.model.BusinessDomain");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>domainId</column-name><column-value><![CDATA[");
		sb.append(getDomainId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>businessId</column-name><column-value><![CDATA[");
		sb.append(getBusinessId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>businessDomainCode</column-name><column-value><![CDATA[");
		sb.append(getBusinessDomainCode());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _domainId;
	private long _businessId;
	private String _businessDomainCode;
	private BaseModel<?> _businessDomainRemoteModel;
	private Class<?> _clpSerializerClass = org.opencps.accountmgt.service.ClpSerializer.class;
}