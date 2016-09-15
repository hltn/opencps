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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link org.opencps.dossiermgt.service.http.DossierLogServiceSoap}.
 *
 * @author trungnt
 * @see org.opencps.dossiermgt.service.http.DossierLogServiceSoap
 * @generated
 */
public class DossierLogSoap implements Serializable {
	public static DossierLogSoap toSoapModel(DossierLog model) {
		DossierLogSoap soapModel = new DossierLogSoap();

		soapModel.setDossierLogId(model.getDossierLogId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setDossierId(model.getDossierId());
		soapModel.setFileGroupId(model.getFileGroupId());
		soapModel.setRequestCommand(model.getRequestCommand());
		soapModel.setDossierStatus(model.getDossierStatus());
		soapModel.setActionInfo(model.getActionInfo());
		soapModel.setMessageInfo(model.getMessageInfo());
		soapModel.setUpdateDatetime(model.getUpdateDatetime());
		soapModel.setLevel(model.getLevel());
		soapModel.setActor(model.getActor());
		soapModel.setActorId(model.getActorId());
		soapModel.setActorName(model.getActorName());
		soapModel.setSyncStatus(model.getSyncStatus());

		return soapModel;
	}

	public static DossierLogSoap[] toSoapModels(DossierLog[] models) {
		DossierLogSoap[] soapModels = new DossierLogSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DossierLogSoap[][] toSoapModels(DossierLog[][] models) {
		DossierLogSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DossierLogSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DossierLogSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DossierLogSoap[] toSoapModels(List<DossierLog> models) {
		List<DossierLogSoap> soapModels = new ArrayList<DossierLogSoap>(models.size());

		for (DossierLog model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DossierLogSoap[soapModels.size()]);
	}

	public DossierLogSoap() {
	}

	public long getPrimaryKey() {
		return _dossierLogId;
	}

	public void setPrimaryKey(long pk) {
		setDossierLogId(pk);
	}

	public long getDossierLogId() {
		return _dossierLogId;
	}

	public void setDossierLogId(long dossierLogId) {
		_dossierLogId = dossierLogId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
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

	public String getRequestCommand() {
		return _requestCommand;
	}

	public void setRequestCommand(String requestCommand) {
		_requestCommand = requestCommand;
	}

	public String getDossierStatus() {
		return _dossierStatus;
	}

	public void setDossierStatus(String dossierStatus) {
		_dossierStatus = dossierStatus;
	}

	public String getActionInfo() {
		return _actionInfo;
	}

	public void setActionInfo(String actionInfo) {
		_actionInfo = actionInfo;
	}

	public String getMessageInfo() {
		return _messageInfo;
	}

	public void setMessageInfo(String messageInfo) {
		_messageInfo = messageInfo;
	}

	public Date getUpdateDatetime() {
		return _updateDatetime;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		_updateDatetime = updateDatetime;
	}

	public int getLevel() {
		return _level;
	}

	public void setLevel(int level) {
		_level = level;
	}

	public int getActor() {
		return _actor;
	}

	public void setActor(int actor) {
		_actor = actor;
	}

	public long getActorId() {
		return _actorId;
	}

	public void setActorId(long actorId) {
		_actorId = actorId;
	}

	public String getActorName() {
		return _actorName;
	}

	public void setActorName(String actorName) {
		_actorName = actorName;
	}

	public int getSyncStatus() {
		return _syncStatus;
	}

	public void setSyncStatus(int syncStatus) {
		_syncStatus = syncStatus;
	}

	private long _dossierLogId;
	private long _companyId;
	private long _groupId;
	private long _userId;
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
}