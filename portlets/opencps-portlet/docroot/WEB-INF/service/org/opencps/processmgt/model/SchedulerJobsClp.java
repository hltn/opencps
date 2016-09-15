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

package org.opencps.processmgt.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import org.opencps.processmgt.service.ClpSerializer;
import org.opencps.processmgt.service.SchedulerJobsLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author khoavd
 */
public class SchedulerJobsClp extends BaseModelImpl<SchedulerJobs>
	implements SchedulerJobs {
	public SchedulerJobsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return SchedulerJobs.class;
	}

	@Override
	public String getModelClassName() {
		return SchedulerJobs.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _schedulerJobsId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSchedulerJobsId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _schedulerJobsId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("schedulerJobsId", getSchedulerJobsId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("dossierId", getDossierId());
		attributes.put("fileGroupId", getFileGroupId());
		attributes.put("processWorkflowId", getProcessWorkflowId());
		attributes.put("schedulerType", getSchedulerType());
		attributes.put("shedulerPattern", getShedulerPattern());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long schedulerJobsId = (Long)attributes.get("schedulerJobsId");

		if (schedulerJobsId != null) {
			setSchedulerJobsId(schedulerJobsId);
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

		Long processWorkflowId = (Long)attributes.get("processWorkflowId");

		if (processWorkflowId != null) {
			setProcessWorkflowId(processWorkflowId);
		}

		Integer schedulerType = (Integer)attributes.get("schedulerType");

		if (schedulerType != null) {
			setSchedulerType(schedulerType);
		}

		String shedulerPattern = (String)attributes.get("shedulerPattern");

		if (shedulerPattern != null) {
			setShedulerPattern(shedulerPattern);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	@Override
	public long getSchedulerJobsId() {
		return _schedulerJobsId;
	}

	@Override
	public void setSchedulerJobsId(long schedulerJobsId) {
		_schedulerJobsId = schedulerJobsId;

		if (_schedulerJobsRemoteModel != null) {
			try {
				Class<?> clazz = _schedulerJobsRemoteModel.getClass();

				Method method = clazz.getMethod("setSchedulerJobsId", long.class);

				method.invoke(_schedulerJobsRemoteModel, schedulerJobsId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_schedulerJobsRemoteModel != null) {
			try {
				Class<?> clazz = _schedulerJobsRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_schedulerJobsRemoteModel, createDate);
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

		if (_schedulerJobsRemoteModel != null) {
			try {
				Class<?> clazz = _schedulerJobsRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_schedulerJobsRemoteModel, modifiedDate);
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

		if (_schedulerJobsRemoteModel != null) {
			try {
				Class<?> clazz = _schedulerJobsRemoteModel.getClass();

				Method method = clazz.getMethod("setDossierId", long.class);

				method.invoke(_schedulerJobsRemoteModel, dossierId);
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

		if (_schedulerJobsRemoteModel != null) {
			try {
				Class<?> clazz = _schedulerJobsRemoteModel.getClass();

				Method method = clazz.getMethod("setFileGroupId", long.class);

				method.invoke(_schedulerJobsRemoteModel, fileGroupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getProcessWorkflowId() {
		return _processWorkflowId;
	}

	@Override
	public void setProcessWorkflowId(long processWorkflowId) {
		_processWorkflowId = processWorkflowId;

		if (_schedulerJobsRemoteModel != null) {
			try {
				Class<?> clazz = _schedulerJobsRemoteModel.getClass();

				Method method = clazz.getMethod("setProcessWorkflowId",
						long.class);

				method.invoke(_schedulerJobsRemoteModel, processWorkflowId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSchedulerType() {
		return _schedulerType;
	}

	@Override
	public void setSchedulerType(int schedulerType) {
		_schedulerType = schedulerType;

		if (_schedulerJobsRemoteModel != null) {
			try {
				Class<?> clazz = _schedulerJobsRemoteModel.getClass();

				Method method = clazz.getMethod("setSchedulerType", int.class);

				method.invoke(_schedulerJobsRemoteModel, schedulerType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getShedulerPattern() {
		return _shedulerPattern;
	}

	@Override
	public void setShedulerPattern(String shedulerPattern) {
		_shedulerPattern = shedulerPattern;

		if (_schedulerJobsRemoteModel != null) {
			try {
				Class<?> clazz = _schedulerJobsRemoteModel.getClass();

				Method method = clazz.getMethod("setShedulerPattern",
						String.class);

				method.invoke(_schedulerJobsRemoteModel, shedulerPattern);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getStatus() {
		return _status;
	}

	@Override
	public void setStatus(int status) {
		_status = status;

		if (_schedulerJobsRemoteModel != null) {
			try {
				Class<?> clazz = _schedulerJobsRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", int.class);

				method.invoke(_schedulerJobsRemoteModel, status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getSchedulerJobsRemoteModel() {
		return _schedulerJobsRemoteModel;
	}

	public void setSchedulerJobsRemoteModel(
		BaseModel<?> schedulerJobsRemoteModel) {
		_schedulerJobsRemoteModel = schedulerJobsRemoteModel;
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

		Class<?> remoteModelClass = _schedulerJobsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_schedulerJobsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			SchedulerJobsLocalServiceUtil.addSchedulerJobs(this);
		}
		else {
			SchedulerJobsLocalServiceUtil.updateSchedulerJobs(this);
		}
	}

	@Override
	public SchedulerJobs toEscapedModel() {
		return (SchedulerJobs)ProxyUtil.newProxyInstance(SchedulerJobs.class.getClassLoader(),
			new Class[] { SchedulerJobs.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		SchedulerJobsClp clone = new SchedulerJobsClp();

		clone.setSchedulerJobsId(getSchedulerJobsId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setDossierId(getDossierId());
		clone.setFileGroupId(getFileGroupId());
		clone.setProcessWorkflowId(getProcessWorkflowId());
		clone.setSchedulerType(getSchedulerType());
		clone.setShedulerPattern(getShedulerPattern());
		clone.setStatus(getStatus());

		return clone;
	}

	@Override
	public int compareTo(SchedulerJobs schedulerJobs) {
		long primaryKey = schedulerJobs.getPrimaryKey();

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

		if (!(obj instanceof SchedulerJobsClp)) {
			return false;
		}

		SchedulerJobsClp schedulerJobs = (SchedulerJobsClp)obj;

		long primaryKey = schedulerJobs.getPrimaryKey();

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
		StringBundler sb = new StringBundler(19);

		sb.append("{schedulerJobsId=");
		sb.append(getSchedulerJobsId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", dossierId=");
		sb.append(getDossierId());
		sb.append(", fileGroupId=");
		sb.append(getFileGroupId());
		sb.append(", processWorkflowId=");
		sb.append(getProcessWorkflowId());
		sb.append(", schedulerType=");
		sb.append(getSchedulerType());
		sb.append(", shedulerPattern=");
		sb.append(getShedulerPattern());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("org.opencps.processmgt.model.SchedulerJobs");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>schedulerJobsId</column-name><column-value><![CDATA[");
		sb.append(getSchedulerJobsId());
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
			"<column><column-name>processWorkflowId</column-name><column-value><![CDATA[");
		sb.append(getProcessWorkflowId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>schedulerType</column-name><column-value><![CDATA[");
		sb.append(getSchedulerType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shedulerPattern</column-name><column-value><![CDATA[");
		sb.append(getShedulerPattern());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _schedulerJobsId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _dossierId;
	private long _fileGroupId;
	private long _processWorkflowId;
	private int _schedulerType;
	private String _shedulerPattern;
	private int _status;
	private BaseModel<?> _schedulerJobsRemoteModel;
	private Class<?> _clpSerializerClass = org.opencps.processmgt.service.ClpSerializer.class;
}