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
 * This class is used by SOAP remote services, specifically {@link org.opencps.dossiermgt.service.http.FileGroupServiceSoap}.
 *
 * @author trungnt
 * @see org.opencps.dossiermgt.service.http.FileGroupServiceSoap
 * @generated
 */
public class FileGroupSoap implements Serializable {
	public static FileGroupSoap toSoapModel(FileGroup model) {
		FileGroupSoap soapModel = new FileGroupSoap();

		soapModel.setFileGroupId(model.getFileGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setOId(model.getOId());
		soapModel.setDossierId(model.getDossierId());
		soapModel.setDossierPartId(model.getDossierPartId());
		soapModel.setDisplayName(model.getDisplayName());
		soapModel.setRemoved(model.getRemoved());
		soapModel.setSyncStatus(model.getSyncStatus());

		return soapModel;
	}

	public static FileGroupSoap[] toSoapModels(FileGroup[] models) {
		FileGroupSoap[] soapModels = new FileGroupSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static FileGroupSoap[][] toSoapModels(FileGroup[][] models) {
		FileGroupSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new FileGroupSoap[models.length][models[0].length];
		}
		else {
			soapModels = new FileGroupSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static FileGroupSoap[] toSoapModels(List<FileGroup> models) {
		List<FileGroupSoap> soapModels = new ArrayList<FileGroupSoap>(models.size());

		for (FileGroup model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new FileGroupSoap[soapModels.size()]);
	}

	public FileGroupSoap() {
	}

	public long getPrimaryKey() {
		return _fileGroupId;
	}

	public void setPrimaryKey(long pk) {
		setFileGroupId(pk);
	}

	public long getFileGroupId() {
		return _fileGroupId;
	}

	public void setFileGroupId(long fileGroupId) {
		_fileGroupId = fileGroupId;
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

	public String getOId() {
		return _oId;
	}

	public void setOId(String oId) {
		_oId = oId;
	}

	public long getDossierId() {
		return _dossierId;
	}

	public void setDossierId(long dossierId) {
		_dossierId = dossierId;
	}

	public long getDossierPartId() {
		return _dossierPartId;
	}

	public void setDossierPartId(long dossierPartId) {
		_dossierPartId = dossierPartId;
	}

	public String getDisplayName() {
		return _displayName;
	}

	public void setDisplayName(String displayName) {
		_displayName = displayName;
	}

	public int getRemoved() {
		return _removed;
	}

	public void setRemoved(int removed) {
		_removed = removed;
	}

	public int getSyncStatus() {
		return _syncStatus;
	}

	public void setSyncStatus(int syncStatus) {
		_syncStatus = syncStatus;
	}

	private long _fileGroupId;
	private long _companyId;
	private long _groupId;
	private long _userId;
	private Date _createDate;
	private Date _modifiedDate;
	private String _oId;
	private long _dossierId;
	private long _dossierPartId;
	private String _displayName;
	private int _removed;
	private int _syncStatus;
}