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
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import org.opencps.dossiermgt.service.ClpSerializer;
import org.opencps.dossiermgt.service.DossierLogLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author trungnt
 */
public class DossierLogClp extends BaseModelImpl<DossierLog>
	implements DossierLog {
	public DossierLogClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DossierLog.class;
	}

	@Override
	public String getModelClassName() {
		return DossierLog.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _dossierLogId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDossierLogId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _dossierLogId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("dossierLogId", getDossierLogId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("dossierId", getDossierId());
		attributes.put("fileGroupId", getFileGroupId());
		attributes.put("requestCommand", getRequestCommand());
		attributes.put("dossierStatus", getDossierStatus());
		attributes.put("actionInfo", getActionInfo());
		attributes.put("messageInfo", getMessageInfo());
		attributes.put("updateDatetime", getUpdateDatetime());
		attributes.put("level", getLevel());
		attributes.put("actor", getActor());
		attributes.put("actorId", getActorId());
		attributes.put("actorName", getActorName());
		attributes.put("syncStatus", getSyncStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long dossierLogId = (Long)attributes.get("dossierLogId");

		if (dossierLogId != null) {
			setDossierLogId(dossierLogId);
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

		Long dossierId = (Long)attributes.get("dossierId");

		if (dossierId != null) {
			setDossierId(dossierId);
		}

		Long fileGroupId = (Long)attributes.get("fileGroupId");

		if (fileGroupId != null) {
			setFileGroupId(fileGroupId);
		}

		String requestCommand = (String)attributes.get("requestCommand");

		if (requestCommand != null) {
			setRequestCommand(requestCommand);
		}

		String dossierStatus = (String)attributes.get("dossierStatus");

		if (dossierStatus != null) {
			setDossierStatus(dossierStatus);
		}

		String actionInfo = (String)attributes.get("actionInfo");

		if (actionInfo != null) {
			setActionInfo(actionInfo);
		}

		String messageInfo = (String)attributes.get("messageInfo");

		if (messageInfo != null) {
			setMessageInfo(messageInfo);
		}

		Date updateDatetime = (Date)attributes.get("updateDatetime");

		if (updateDatetime != null) {
			setUpdateDatetime(updateDatetime);
		}

		Integer level = (Integer)attributes.get("level");

		if (level != null) {
			setLevel(level);
		}

		Integer actor = (Integer)attributes.get("actor");

		if (actor != null) {
			setActor(actor);
		}

		Long actorId = (Long)attributes.get("actorId");

		if (actorId != null) {
			setActorId(actorId);
		}

		String actorName = (String)attributes.get("actorName");

		if (actorName != null) {
			setActorName(actorName);
		}

		Integer syncStatus = (Integer)attributes.get("syncStatus");

		if (syncStatus != null) {
			setSyncStatus(syncStatus);
		}
	}

	@Override
	public long getDossierLogId() {
		return _dossierLogId;
	}

	@Override
	public void setDossierLogId(long dossierLogId) {
		_dossierLogId = dossierLogId;

		if (_dossierLogRemoteModel != null) {
			try {
				Class<?> clazz = _dossierLogRemoteModel.getClass();

				Method method = clazz.getMethod("setDossierLogId", long.class);

				method.invoke(_dossierLogRemoteModel, dossierLogId);
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

		if (_dossierLogRemoteModel != null) {
			try {
				Class<?> clazz = _dossierLogRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_dossierLogRemoteModel, companyId);
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

		if (_dossierLogRemoteModel != null) {
			try {
				Class<?> clazz = _dossierLogRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_dossierLogRemoteModel, groupId);
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

		if (_dossierLogRemoteModel != null) {
			try {
				Class<?> clazz = _dossierLogRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_dossierLogRemoteModel, userId);
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

		if (_dossierLogRemoteModel != null) {
			try {
				Class<?> clazz = _dossierLogRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_dossierLogRemoteModel, createDate);
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

		if (_dossierLogRemoteModel != null) {
			try {
				Class<?> clazz = _dossierLogRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_dossierLogRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDossierId() {
		return _dossierId;
	}

	@Override
	public void setDossierId(long dossierId) {
		_dossierId = dossierId;

		if (_dossierLogRemoteModel != null) {
			try {
				Class<?> clazz = _dossierLogRemoteModel.getClass();

				Method method = clazz.getMethod("setDossierId", long.class);

				method.invoke(_dossierLogRemoteModel, dossierId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getFileGroupId() {
		return _fileGroupId;
	}

	@Override
	public void setFileGroupId(long fileGroupId) {
		_fileGroupId = fileGroupId;

		if (_dossierLogRemoteModel != null) {
			try {
				Class<?> clazz = _dossierLogRemoteModel.getClass();

				Method method = clazz.getMethod("setFileGroupId", long.class);

				method.invoke(_dossierLogRemoteModel, fileGroupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRequestCommand() {
		return _requestCommand;
	}

	@Override
	public void setRequestCommand(String requestCommand) {
		_requestCommand = requestCommand;

		if (_dossierLogRemoteModel != null) {
			try {
				Class<?> clazz = _dossierLogRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestCommand",
						String.class);

				method.invoke(_dossierLogRemoteModel, requestCommand);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDossierStatus() {
		return _dossierStatus;
	}

	@Override
	public void setDossierStatus(String dossierStatus) {
		_dossierStatus = dossierStatus;

		if (_dossierLogRemoteModel != null) {
			try {
				Class<?> clazz = _dossierLogRemoteModel.getClass();

				Method method = clazz.getMethod("setDossierStatus", String.class);

				method.invoke(_dossierLogRemoteModel, dossierStatus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getActionInfo() {
		return _actionInfo;
	}

	@Override
	public void setActionInfo(String actionInfo) {
		_actionInfo = actionInfo;

		if (_dossierLogRemoteModel != null) {
			try {
				Class<?> clazz = _dossierLogRemoteModel.getClass();

				Method method = clazz.getMethod("setActionInfo", String.class);

				method.invoke(_dossierLogRemoteModel, actionInfo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMessageInfo() {
		return _messageInfo;
	}

	@Override
	public void setMessageInfo(String messageInfo) {
		_messageInfo = messageInfo;

		if (_dossierLogRemoteModel != null) {
			try {
				Class<?> clazz = _dossierLogRemoteModel.getClass();

				Method method = clazz.getMethod("setMessageInfo", String.class);

				method.invoke(_dossierLogRemoteModel, messageInfo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getUpdateDatetime() {
		return _updateDatetime;
	}

	@Override
	public void setUpdateDatetime(Date updateDatetime) {
		_updateDatetime = updateDatetime;

		if (_dossierLogRemoteModel != null) {
			try {
				Class<?> clazz = _dossierLogRemoteModel.getClass();

				Method method = clazz.getMethod("setUpdateDatetime", Date.class);

				method.invoke(_dossierLogRemoteModel, updateDatetime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getLevel() {
		return _level;
	}

	@Override
	public void setLevel(int level) {
		_level = level;

		if (_dossierLogRemoteModel != null) {
			try {
				Class<?> clazz = _dossierLogRemoteModel.getClass();

				Method method = clazz.getMethod("setLevel", int.class);

				method.invoke(_dossierLogRemoteModel, level);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getActor() {
		return _actor;
	}

	@Override
	public void setActor(int actor) {
		_actor = actor;

		if (_dossierLogRemoteModel != null) {
			try {
				Class<?> clazz = _dossierLogRemoteModel.getClass();

				Method method = clazz.getMethod("setActor", int.class);

				method.invoke(_dossierLogRemoteModel, actor);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getActorId() {
		return _actorId;
	}

	@Override
	public void setActorId(long actorId) {
		_actorId = actorId;

		if (_dossierLogRemoteModel != null) {
			try {
				Class<?> clazz = _dossierLogRemoteModel.getClass();

				Method method = clazz.getMethod("setActorId", long.class);

				method.invoke(_dossierLogRemoteModel, actorId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getActorName() {
		return _actorName;
	}

	@Override
	public void setActorName(String actorName) {
		_actorName = actorName;

		if (_dossierLogRemoteModel != null) {
			try {
				Class<?> clazz = _dossierLogRemoteModel.getClass();

				Method method = clazz.getMethod("setActorName", String.class);

				method.invoke(_dossierLogRemoteModel, actorName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSyncStatus() {
		return _syncStatus;
	}

	@Override
	public void setSyncStatus(int syncStatus) {
		_syncStatus = syncStatus;

		if (_dossierLogRemoteModel != null) {
			try {
				Class<?> clazz = _dossierLogRemoteModel.getClass();

				Method method = clazz.getMethod("setSyncStatus", int.class);

				method.invoke(_dossierLogRemoteModel, syncStatus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDossierLogRemoteModel() {
		return _dossierLogRemoteModel;
	}

	public void setDossierLogRemoteModel(BaseModel<?> dossierLogRemoteModel) {
		_dossierLogRemoteModel = dossierLogRemoteModel;
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

		Class<?> remoteModelClass = _dossierLogRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dossierLogRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DossierLogLocalServiceUtil.addDossierLog(this);
		}
		else {
			DossierLogLocalServiceUtil.updateDossierLog(this);
		}
	}

	@Override
	public DossierLog toEscapedModel() {
		return (DossierLog)ProxyUtil.newProxyInstance(DossierLog.class.getClassLoader(),
			new Class[] { DossierLog.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DossierLogClp clone = new DossierLogClp();

		clone.setDossierLogId(getDossierLogId());
		clone.setCompanyId(getCompanyId());
		clone.setGroupId(getGroupId());
		clone.setUserId(getUserId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setDossierId(getDossierId());
		clone.setFileGroupId(getFileGroupId());
		clone.setRequestCommand(getRequestCommand());
		clone.setDossierStatus(getDossierStatus());
		clone.setActionInfo(getActionInfo());
		clone.setMessageInfo(getMessageInfo());
		clone.setUpdateDatetime(getUpdateDatetime());
		clone.setLevel(getLevel());
		clone.setActor(getActor());
		clone.setActorId(getActorId());
		clone.setActorName(getActorName());
		clone.setSyncStatus(getSyncStatus());

		return clone;
	}

	@Override
	public int compareTo(DossierLog dossierLog) {
		int value = 0;

		value = DateUtil.compareTo(getModifiedDate(),
				dossierLog.getModifiedDate());

		value = value * -1;

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

		if (!(obj instanceof DossierLogClp)) {
			return false;
		}

		DossierLogClp dossierLog = (DossierLogClp)obj;

		long primaryKey = dossierLog.getPrimaryKey();

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
		StringBundler sb = new StringBundler(37);

		sb.append("{dossierLogId=");
		sb.append(getDossierLogId());
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
		sb.append(", dossierId=");
		sb.append(getDossierId());
		sb.append(", fileGroupId=");
		sb.append(getFileGroupId());
		sb.append(", requestCommand=");
		sb.append(getRequestCommand());
		sb.append(", dossierStatus=");
		sb.append(getDossierStatus());
		sb.append(", actionInfo=");
		sb.append(getActionInfo());
		sb.append(", messageInfo=");
		sb.append(getMessageInfo());
		sb.append(", updateDatetime=");
		sb.append(getUpdateDatetime());
		sb.append(", level=");
		sb.append(getLevel());
		sb.append(", actor=");
		sb.append(getActor());
		sb.append(", actorId=");
		sb.append(getActorId());
		sb.append(", actorName=");
		sb.append(getActorName());
		sb.append(", syncStatus=");
		sb.append(getSyncStatus());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(58);

		sb.append("<model><model-name>");
		sb.append("org.opencps.dossiermgt.model.DossierLog");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>dossierLogId</column-name><column-value><![CDATA[");
		sb.append(getDossierLogId());
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
			"<column><column-name>dossierId</column-name><column-value><![CDATA[");
		sb.append(getDossierId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fileGroupId</column-name><column-value><![CDATA[");
		sb.append(getFileGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestCommand</column-name><column-value><![CDATA[");
		sb.append(getRequestCommand());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dossierStatus</column-name><column-value><![CDATA[");
		sb.append(getDossierStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>actionInfo</column-name><column-value><![CDATA[");
		sb.append(getActionInfo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>messageInfo</column-name><column-value><![CDATA[");
		sb.append(getMessageInfo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>updateDatetime</column-name><column-value><![CDATA[");
		sb.append(getUpdateDatetime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>level</column-name><column-value><![CDATA[");
		sb.append(getLevel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>actor</column-name><column-value><![CDATA[");
		sb.append(getActor());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>actorId</column-name><column-value><![CDATA[");
		sb.append(getActorId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>actorName</column-name><column-value><![CDATA[");
		sb.append(getActorName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>syncStatus</column-name><column-value><![CDATA[");
		sb.append(getSyncStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _dossierLogId;
	private long _companyId;
	private long _groupId;
	private long _userId;
	private String _userUuid;
	private Date _createDate;
	private Date _modifiedDate;
	private long _dossierId;
	private long _fileGroupId;
	private String _requestCommand;
	private String _dossierStatus;
	private String _actionInfo;
	private String _messageInfo;
	private Date _updateDatetime;
	private int _level;
	private int _actor;
	private long _actorId;
	private String _actorName;
	private int _syncStatus;
	private BaseModel<?> _dossierLogRemoteModel;
	private Class<?> _clpSerializerClass = org.opencps.dossiermgt.service.ClpSerializer.class;
}