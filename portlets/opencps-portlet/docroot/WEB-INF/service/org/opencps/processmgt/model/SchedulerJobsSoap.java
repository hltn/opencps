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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link org.opencps.processmgt.service.http.SchedulerJobsServiceSoap}.
 *
 * @author khoavd
 * @see org.opencps.processmgt.service.http.SchedulerJobsServiceSoap
 * @generated
 */
public class SchedulerJobsSoap implements Serializable {
	public static SchedulerJobsSoap toSoapModel(SchedulerJobs model) {
		SchedulerJobsSoap soapModel = new SchedulerJobsSoap();

		soapModel.setSchedulerJobsId(model.getSchedulerJobsId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setDossierId(model.getDossierId());
		soapModel.setFileGroupId(model.getFileGroupId());
		soapModel.setProcessWorkflowId(model.getProcessWorkflowId());
		soapModel.setSchedulerType(model.getSchedulerType());
		soapModel.setShedulerPattern(model.getShedulerPattern());
		soapModel.setStatus(model.getStatus());

		return soapModel;
	}

	public static SchedulerJobsSoap[] toSoapModels(SchedulerJobs[] models) {
		SchedulerJobsSoap[] soapModels = new SchedulerJobsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SchedulerJobsSoap[][] toSoapModels(SchedulerJobs[][] models) {
		SchedulerJobsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SchedulerJobsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SchedulerJobsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SchedulerJobsSoap[] toSoapModels(List<SchedulerJobs> models) {
		List<SchedulerJobsSoap> soapModels = new ArrayList<SchedulerJobsSoap>(models.size());

		for (SchedulerJobs model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SchedulerJobsSoap[soapModels.size()]);
	}

	public SchedulerJobsSoap() {
	}

	public long getPrimaryKey() {
		return _schedulerJobsId;
	}

	public void setPrimaryKey(long pk) {
		setSchedulerJobsId(pk);
	}

	public long getSchedulerJobsId() {
		return _schedulerJobsId;
	}

	public void setSchedulerJobsId(long schedulerJobsId) {
		_schedulerJobsId = schedulerJobsId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getDossierId() {
		return _dossierId;
	}

	public void setDossierId(long dossierId) {
		_dossierId = dossierId;
	}

	public long getFileGroupId() {
		return _fileGroupId;
	}

	public void setFileGroupId(long fileGroupId) {
		_fileGroupId = fileGroupId;
	}

	public long getProcessWorkflowId() {
		return _processWorkflowId;
	}

	public void setProcessWorkflowId(long processWorkflowId) {
		_processWorkflowId = processWorkflowId;
	}

	public int getSchedulerType() {
		return _schedulerType;
	}

	public void setSchedulerType(int schedulerType) {
		_schedulerType = schedulerType;
	}

	public String getShedulerPattern() {
		return _shedulerPattern;
	}

	public void setShedulerPattern(String shedulerPattern) {
		_shedulerPattern = shedulerPattern;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
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
}