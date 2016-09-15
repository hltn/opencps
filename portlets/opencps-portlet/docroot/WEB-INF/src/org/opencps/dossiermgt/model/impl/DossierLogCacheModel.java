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

import org.opencps.dossiermgt.model.DossierLog;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DossierLog in entity cache.
 *
 * @author trungnt
 * @see DossierLog
 * @generated
 */
public class DossierLogCacheModel implements CacheModel<DossierLog>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{dossierLogId=");
		sb.append(dossierLogId);
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
		sb.append(", dossierId=");
		sb.append(dossierId);
		sb.append(", fileGroupId=");
		sb.append(fileGroupId);
		sb.append(", requestCommand=");
		sb.append(requestCommand);
		sb.append(", dossierStatus=");
		sb.append(dossierStatus);
		sb.append(", actionInfo=");
		sb.append(actionInfo);
		sb.append(", messageInfo=");
		sb.append(messageInfo);
		sb.append(", updateDatetime=");
		sb.append(updateDatetime);
		sb.append(", level=");
		sb.append(level);
		sb.append(", actor=");
		sb.append(actor);
		sb.append(", actorId=");
		sb.append(actorId);
		sb.append(", actorName=");
		sb.append(actorName);
		sb.append(", syncStatus=");
		sb.append(syncStatus);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DossierLog toEntityModel() {
		DossierLogImpl dossierLogImpl = new DossierLogImpl();

		dossierLogImpl.setDossierLogId(dossierLogId);
		dossierLogImpl.setCompanyId(companyId);
		dossierLogImpl.setGroupId(groupId);
		dossierLogImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			dossierLogImpl.setCreateDate(null);
		}
		else {
			dossierLogImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			dossierLogImpl.setModifiedDate(null);
		}
		else {
			dossierLogImpl.setModifiedDate(new Date(modifiedDate));
		}

		dossierLogImpl.setDossierId(dossierId);
		dossierLogImpl.setFileGroupId(fileGroupId);

		if (requestCommand == null) {
			dossierLogImpl.setRequestCommand(StringPool.BLANK);
		}
		else {
			dossierLogImpl.setRequestCommand(requestCommand);
		}

		if (dossierStatus == null) {
			dossierLogImpl.setDossierStatus(StringPool.BLANK);
		}
		else {
			dossierLogImpl.setDossierStatus(dossierStatus);
		}

		if (actionInfo == null) {
			dossierLogImpl.setActionInfo(StringPool.BLANK);
		}
		else {
			dossierLogImpl.setActionInfo(actionInfo);
		}

		if (messageInfo == null) {
			dossierLogImpl.setMessageInfo(StringPool.BLANK);
		}
		else {
			dossierLogImpl.setMessageInfo(messageInfo);
		}

		if (updateDatetime == Long.MIN_VALUE) {
			dossierLogImpl.setUpdateDatetime(null);
		}
		else {
			dossierLogImpl.setUpdateDatetime(new Date(updateDatetime));
		}

		dossierLogImpl.setLevel(level);
		dossierLogImpl.setActor(actor);
		dossierLogImpl.setActorId(actorId);

		if (actorName == null) {
			dossierLogImpl.setActorName(StringPool.BLANK);
		}
		else {
			dossierLogImpl.setActorName(actorName);
		}

		dossierLogImpl.setSyncStatus(syncStatus);

		dossierLogImpl.resetOriginalValues();

		return dossierLogImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		dossierLogId = objectInput.readLong();
		companyId = objectInput.readLong();
		groupId = objectInput.readLong();
		userId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		dossierId = objectInput.readLong();
		fileGroupId = objectInput.readLong();
		requestCommand = objectInput.readUTF();
		dossierStatus = objectInput.readUTF();
		actionInfo = objectInput.readUTF();
		messageInfo = objectInput.readUTF();
		updateDatetime = objectInput.readLong();
		level = objectInput.readInt();
		actor = objectInput.readInt();
		actorId = objectInput.readLong();
		actorName = objectInput.readUTF();
		syncStatus = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(dossierLogId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(dossierId);
		objectOutput.writeLong(fileGroupId);

		if (requestCommand == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(requestCommand);
		}

		if (dossierStatus == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dossierStatus);
		}

		if (actionInfo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(actionInfo);
		}

		if (messageInfo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(messageInfo);
		}

		objectOutput.writeLong(updateDatetime);
		objectOutput.writeInt(level);
		objectOutput.writeInt(actor);
		objectOutput.writeLong(actorId);

		if (actorName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(actorName);
		}

		objectOutput.writeInt(syncStatus);
	}

	public long dossierLogId;
	public long companyId;
	public long groupId;
	public long userId;
	public long createDate;
	public long modifiedDate;
	public long dossierId;
	public long fileGroupId;
	public String requestCommand;
	public String dossierStatus;
	public String actionInfo;
	public String messageInfo;
	public long updateDatetime;
	public int level;
	public int actor;
	public long actorId;
	public String actorName;
	public int syncStatus;
}