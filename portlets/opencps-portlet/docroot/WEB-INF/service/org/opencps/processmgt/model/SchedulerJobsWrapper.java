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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link SchedulerJobs}.
 * </p>
 *
 * @author khoavd
 * @see SchedulerJobs
 * @generated
 */
public class SchedulerJobsWrapper implements SchedulerJobs,
	ModelWrapper<SchedulerJobs> {
	public SchedulerJobsWrapper(SchedulerJobs schedulerJobs) {
		_schedulerJobs = schedulerJobs;
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

	/**
	* Returns the primary key of this scheduler jobs.
	*
	* @return the primary key of this scheduler jobs
	*/
	@Override
	public long getPrimaryKey() {
		return _schedulerJobs.getPrimaryKey();
	}

	/**
	* Sets the primary key of this scheduler jobs.
	*
	* @param primaryKey the primary key of this scheduler jobs
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_schedulerJobs.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the scheduler jobs ID of this scheduler jobs.
	*
	* @return the scheduler jobs ID of this scheduler jobs
	*/
	@Override
	public long getSchedulerJobsId() {
		return _schedulerJobs.getSchedulerJobsId();
	}

	/**
	* Sets the scheduler jobs ID of this scheduler jobs.
	*
	* @param schedulerJobsId the scheduler jobs ID of this scheduler jobs
	*/
	@Override
	public void setSchedulerJobsId(long schedulerJobsId) {
		_schedulerJobs.setSchedulerJobsId(schedulerJobsId);
	}

	/**
	* Returns the create date of this scheduler jobs.
	*
	* @return the create date of this scheduler jobs
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _schedulerJobs.getCreateDate();
	}

	/**
	* Sets the create date of this scheduler jobs.
	*
	* @param createDate the create date of this scheduler jobs
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_schedulerJobs.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this scheduler jobs.
	*
	* @return the modified date of this scheduler jobs
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _schedulerJobs.getModifiedDate();
	}

	/**
	* Sets the modified date of this scheduler jobs.
	*
	* @param modifiedDate the modified date of this scheduler jobs
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_schedulerJobs.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the dossier ID of this scheduler jobs.
	*
	* @return the dossier ID of this scheduler jobs
	*/
	@Override
	public long getDossierId() {
		return _schedulerJobs.getDossierId();
	}

	/**
	* Sets the dossier ID of this scheduler jobs.
	*
	* @param dossierId the dossier ID of this scheduler jobs
	*/
	@Override
	public void setDossierId(long dossierId) {
		_schedulerJobs.setDossierId(dossierId);
	}

	/**
	* Returns the file group ID of this scheduler jobs.
	*
	* @return the file group ID of this scheduler jobs
	*/
	@Override
	public long getFileGroupId() {
		return _schedulerJobs.getFileGroupId();
	}

	/**
	* Sets the file group ID of this scheduler jobs.
	*
	* @param fileGroupId the file group ID of this scheduler jobs
	*/
	@Override
	public void setFileGroupId(long fileGroupId) {
		_schedulerJobs.setFileGroupId(fileGroupId);
	}

	/**
	* Returns the process workflow ID of this scheduler jobs.
	*
	* @return the process workflow ID of this scheduler jobs
	*/
	@Override
	public long getProcessWorkflowId() {
		return _schedulerJobs.getProcessWorkflowId();
	}

	/**
	* Sets the process workflow ID of this scheduler jobs.
	*
	* @param processWorkflowId the process workflow ID of this scheduler jobs
	*/
	@Override
	public void setProcessWorkflowId(long processWorkflowId) {
		_schedulerJobs.setProcessWorkflowId(processWorkflowId);
	}

	/**
	* Returns the scheduler type of this scheduler jobs.
	*
	* @return the scheduler type of this scheduler jobs
	*/
	@Override
	public int getSchedulerType() {
		return _schedulerJobs.getSchedulerType();
	}

	/**
	* Sets the scheduler type of this scheduler jobs.
	*
	* @param schedulerType the scheduler type of this scheduler jobs
	*/
	@Override
	public void setSchedulerType(int schedulerType) {
		_schedulerJobs.setSchedulerType(schedulerType);
	}

	/**
	* Returns the sheduler pattern of this scheduler jobs.
	*
	* @return the sheduler pattern of this scheduler jobs
	*/
	@Override
	public java.lang.String getShedulerPattern() {
		return _schedulerJobs.getShedulerPattern();
	}

	/**
	* Sets the sheduler pattern of this scheduler jobs.
	*
	* @param shedulerPattern the sheduler pattern of this scheduler jobs
	*/
	@Override
	public void setShedulerPattern(java.lang.String shedulerPattern) {
		_schedulerJobs.setShedulerPattern(shedulerPattern);
	}

	/**
	* Returns the status of this scheduler jobs.
	*
	* @return the status of this scheduler jobs
	*/
	@Override
	public int getStatus() {
		return _schedulerJobs.getStatus();
	}

	/**
	* Sets the status of this scheduler jobs.
	*
	* @param status the status of this scheduler jobs
	*/
	@Override
	public void setStatus(int status) {
		_schedulerJobs.setStatus(status);
	}

	@Override
	public boolean isNew() {
		return _schedulerJobs.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_schedulerJobs.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _schedulerJobs.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_schedulerJobs.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _schedulerJobs.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _schedulerJobs.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_schedulerJobs.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _schedulerJobs.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_schedulerJobs.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_schedulerJobs.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_schedulerJobs.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SchedulerJobsWrapper((SchedulerJobs)_schedulerJobs.clone());
	}

	@Override
	public int compareTo(
		org.opencps.processmgt.model.SchedulerJobs schedulerJobs) {
		return _schedulerJobs.compareTo(schedulerJobs);
	}

	@Override
	public int hashCode() {
		return _schedulerJobs.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.opencps.processmgt.model.SchedulerJobs> toCacheModel() {
		return _schedulerJobs.toCacheModel();
	}

	@Override
	public org.opencps.processmgt.model.SchedulerJobs toEscapedModel() {
		return new SchedulerJobsWrapper(_schedulerJobs.toEscapedModel());
	}

	@Override
	public org.opencps.processmgt.model.SchedulerJobs toUnescapedModel() {
		return new SchedulerJobsWrapper(_schedulerJobs.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _schedulerJobs.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _schedulerJobs.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_schedulerJobs.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SchedulerJobsWrapper)) {
			return false;
		}

		SchedulerJobsWrapper schedulerJobsWrapper = (SchedulerJobsWrapper)obj;

		if (Validator.equals(_schedulerJobs, schedulerJobsWrapper._schedulerJobs)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public SchedulerJobs getWrappedSchedulerJobs() {
		return _schedulerJobs;
	}

	@Override
	public SchedulerJobs getWrappedModel() {
		return _schedulerJobs;
	}

	@Override
	public void resetOriginalValues() {
		_schedulerJobs.resetOriginalValues();
	}

	private SchedulerJobs _schedulerJobs;
}