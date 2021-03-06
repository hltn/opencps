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

package org.opencps.processmgt.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import org.opencps.processmgt.model.ServiceProcess;
import org.opencps.processmgt.model.ServiceProcessModel;
import org.opencps.processmgt.model.ServiceProcessSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the ServiceProcess service. Represents a row in the &quot;opencps_serviceprocess&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.opencps.processmgt.model.ServiceProcessModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ServiceProcessImpl}.
 * </p>
 *
 * @author khoavd
 * @see ServiceProcessImpl
 * @see org.opencps.processmgt.model.ServiceProcess
 * @see org.opencps.processmgt.model.ServiceProcessModel
 * @generated
 */
@JSON(strict = true)
public class ServiceProcessModelImpl extends BaseModelImpl<ServiceProcess>
	implements ServiceProcessModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a service process model instance should use the {@link org.opencps.processmgt.model.ServiceProcess} interface instead.
	 */
	public static final String TABLE_NAME = "opencps_serviceprocess";
	public static final Object[][] TABLE_COLUMNS = {
			{ "serviceProcessId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "processNo", Types.VARCHAR },
			{ "processName", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "dossierTemplateId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table opencps_serviceprocess (serviceProcessId LONG not null primary key,companyId LONG,groupId LONG,userId LONG,createDate DATE null,modifiedDate DATE null,processNo VARCHAR(75) null,processName VARCHAR(75) null,description VARCHAR(75) null,dossierTemplateId LONG)";
	public static final String TABLE_SQL_DROP = "drop table opencps_serviceprocess";
	public static final String ORDER_BY_JPQL = " ORDER BY serviceProcess.processNo ASC";
	public static final String ORDER_BY_SQL = " ORDER BY opencps_serviceprocess.processNo ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.opencps.processmgt.model.ServiceProcess"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.opencps.processmgt.model.ServiceProcess"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.org.opencps.processmgt.model.ServiceProcess"),
			true);
	public static long DOSSIERTEMPLATEID_COLUMN_BITMASK = 1L;
	public static long GROUPID_COLUMN_BITMASK = 2L;
	public static long PROCESSNO_COLUMN_BITMASK = 4L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static ServiceProcess toModel(ServiceProcessSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		ServiceProcess model = new ServiceProcessImpl();

		model.setServiceProcessId(soapModel.getServiceProcessId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setGroupId(soapModel.getGroupId());
		model.setUserId(soapModel.getUserId());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setProcessNo(soapModel.getProcessNo());
		model.setProcessName(soapModel.getProcessName());
		model.setDescription(soapModel.getDescription());
		model.setDossierTemplateId(soapModel.getDossierTemplateId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<ServiceProcess> toModels(ServiceProcessSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<ServiceProcess> models = new ArrayList<ServiceProcess>(soapModels.length);

		for (ServiceProcessSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.opencps.processmgt.model.ServiceProcess"));

	public ServiceProcessModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _serviceProcessId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setServiceProcessId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _serviceProcessId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return ServiceProcess.class;
	}

	@Override
	public String getModelClassName() {
		return ServiceProcess.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("serviceProcessId", getServiceProcessId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("processNo", getProcessNo());
		attributes.put("processName", getProcessName());
		attributes.put("description", getDescription());
		attributes.put("dossierTemplateId", getDossierTemplateId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long serviceProcessId = (Long)attributes.get("serviceProcessId");

		if (serviceProcessId != null) {
			setServiceProcessId(serviceProcessId);
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

		String processNo = (String)attributes.get("processNo");

		if (processNo != null) {
			setProcessNo(processNo);
		}

		String processName = (String)attributes.get("processName");

		if (processName != null) {
			setProcessName(processName);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Long dossierTemplateId = (Long)attributes.get("dossierTemplateId");

		if (dossierTemplateId != null) {
			setDossierTemplateId(dossierTemplateId);
		}
	}

	@JSON
	@Override
	public long getServiceProcessId() {
		return _serviceProcessId;
	}

	@Override
	public void setServiceProcessId(long serviceProcessId) {
		_serviceProcessId = serviceProcessId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public String getProcessNo() {
		if (_processNo == null) {
			return StringPool.BLANK;
		}
		else {
			return _processNo;
		}
	}

	@Override
	public void setProcessNo(String processNo) {
		_columnBitmask = -1L;

		_processNo = processNo;
	}

	@JSON
	@Override
	public String getProcessName() {
		if (_processName == null) {
			return StringPool.BLANK;
		}
		else {
			return _processName;
		}
	}

	@Override
	public void setProcessName(String processName) {
		_processName = processName;
	}

	@JSON
	@Override
	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		_description = description;
	}

	@JSON
	@Override
	public long getDossierTemplateId() {
		return _dossierTemplateId;
	}

	@Override
	public void setDossierTemplateId(long dossierTemplateId) {
		_columnBitmask |= DOSSIERTEMPLATEID_COLUMN_BITMASK;

		if (!_setOriginalDossierTemplateId) {
			_setOriginalDossierTemplateId = true;

			_originalDossierTemplateId = _dossierTemplateId;
		}

		_dossierTemplateId = dossierTemplateId;
	}

	public long getOriginalDossierTemplateId() {
		return _originalDossierTemplateId;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			ServiceProcess.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public ServiceProcess toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (ServiceProcess)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ServiceProcessImpl serviceProcessImpl = new ServiceProcessImpl();

		serviceProcessImpl.setServiceProcessId(getServiceProcessId());
		serviceProcessImpl.setCompanyId(getCompanyId());
		serviceProcessImpl.setGroupId(getGroupId());
		serviceProcessImpl.setUserId(getUserId());
		serviceProcessImpl.setCreateDate(getCreateDate());
		serviceProcessImpl.setModifiedDate(getModifiedDate());
		serviceProcessImpl.setProcessNo(getProcessNo());
		serviceProcessImpl.setProcessName(getProcessName());
		serviceProcessImpl.setDescription(getDescription());
		serviceProcessImpl.setDossierTemplateId(getDossierTemplateId());

		serviceProcessImpl.resetOriginalValues();

		return serviceProcessImpl;
	}

	@Override
	public int compareTo(ServiceProcess serviceProcess) {
		int value = 0;

		value = getProcessNo().compareTo(serviceProcess.getProcessNo());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ServiceProcess)) {
			return false;
		}

		ServiceProcess serviceProcess = (ServiceProcess)obj;

		long primaryKey = serviceProcess.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		ServiceProcessModelImpl serviceProcessModelImpl = this;

		serviceProcessModelImpl._originalGroupId = serviceProcessModelImpl._groupId;

		serviceProcessModelImpl._setOriginalGroupId = false;

		serviceProcessModelImpl._originalDossierTemplateId = serviceProcessModelImpl._dossierTemplateId;

		serviceProcessModelImpl._setOriginalDossierTemplateId = false;

		serviceProcessModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<ServiceProcess> toCacheModel() {
		ServiceProcessCacheModel serviceProcessCacheModel = new ServiceProcessCacheModel();

		serviceProcessCacheModel.serviceProcessId = getServiceProcessId();

		serviceProcessCacheModel.companyId = getCompanyId();

		serviceProcessCacheModel.groupId = getGroupId();

		serviceProcessCacheModel.userId = getUserId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			serviceProcessCacheModel.createDate = createDate.getTime();
		}
		else {
			serviceProcessCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			serviceProcessCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			serviceProcessCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		serviceProcessCacheModel.processNo = getProcessNo();

		String processNo = serviceProcessCacheModel.processNo;

		if ((processNo != null) && (processNo.length() == 0)) {
			serviceProcessCacheModel.processNo = null;
		}

		serviceProcessCacheModel.processName = getProcessName();

		String processName = serviceProcessCacheModel.processName;

		if ((processName != null) && (processName.length() == 0)) {
			serviceProcessCacheModel.processName = null;
		}

		serviceProcessCacheModel.description = getDescription();

		String description = serviceProcessCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			serviceProcessCacheModel.description = null;
		}

		serviceProcessCacheModel.dossierTemplateId = getDossierTemplateId();

		return serviceProcessCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{serviceProcessId=");
		sb.append(getServiceProcessId());
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
		sb.append(", processNo=");
		sb.append(getProcessNo());
		sb.append(", processName=");
		sb.append(getProcessName());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", dossierTemplateId=");
		sb.append(getDossierTemplateId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("org.opencps.processmgt.model.ServiceProcess");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>serviceProcessId</column-name><column-value><![CDATA[");
		sb.append(getServiceProcessId());
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
			"<column><column-name>processNo</column-name><column-value><![CDATA[");
		sb.append(getProcessNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>processName</column-name><column-value><![CDATA[");
		sb.append(getProcessName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dossierTemplateId</column-name><column-value><![CDATA[");
		sb.append(getDossierTemplateId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = ServiceProcess.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			ServiceProcess.class
		};
	private long _serviceProcessId;
	private long _companyId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _userId;
	private String _userUuid;
	private Date _createDate;
	private Date _modifiedDate;
	private String _processNo;
	private String _processName;
	private String _description;
	private long _dossierTemplateId;
	private long _originalDossierTemplateId;
	private boolean _setOriginalDossierTemplateId;
	private long _columnBitmask;
	private ServiceProcess _escapedModel;
}