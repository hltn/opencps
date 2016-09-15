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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import org.opencps.processmgt.model.SchedulerJobs;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SchedulerJobs in entity cache.
 *
 * @author khoavd
 * @see SchedulerJobs
 * @generated
 */
public class SchedulerJobsCacheModel implements CacheModel<SchedulerJobs>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{schedulerJobsId=");
		sb.append(schedulerJobsId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", dossierId=");
		sb.append(dossierId);
		sb.append(", fileGroupId=");
		sb.append(fileGroupId);
		sb.append(", processWorkflowId=");
		sb.append(processWorkflowId);
		sb.append(", schedulerType=");
		sb.append(schedulerType);
		sb.append(", shedulerPattern=");
		sb.append(shedulerPattern);
		sb.append(", status=");
		sb.append(status);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SchedulerJobs toEntityModel() {
		SchedulerJobsImpl schedulerJobsImpl = new SchedulerJobsImpl();

		schedulerJobsImpl.setSchedulerJobsId(schedulerJobsId);

		if (createDate == Long.MIN_VALUE) {
			schedulerJobsImpl.setCreateDate(null);
		}
		else {
			schedulerJobsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			schedulerJobsImpl.setModifiedDate(null);
		}
		else {
			schedulerJobsImpl.setModifiedDate(new Date(modifiedDate));
		}

		schedulerJobsImpl.setDossierId(dossierId);
		schedulerJobsImpl.setFileGroupId(fileGroupId);
		schedulerJobsImpl.setProcessWorkflowId(processWorkflowId);
		schedulerJobsImpl.setSchedulerType(schedulerType);

		if (shedulerPattern == null) {
			schedulerJobsImpl.setShedulerPattern(StringPool.BLANK);
		}
		else {
			schedulerJobsImpl.setShedulerPattern(shedulerPattern);
		}

		schedulerJobsImpl.setStatus(status);

		schedulerJobsImpl.resetOriginalValues();

		return schedulerJobsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		schedulerJobsId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		dossierId = objectInput.readLong();
		fileGroupId = objectInput.readLong();
		processWorkflowId = objectInput.readLong();
		schedulerType = objectInput.readInt();
		shedulerPattern = objectInput.readUTF();
		status = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(schedulerJobsId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(dossierId);
		objectOutput.writeLong(fileGroupId);
		objectOutput.writeLong(processWorkflowId);
		objectOutput.writeInt(schedulerType);

		if (shedulerPattern == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(shedulerPattern);
		}

		objectOutput.writeInt(status);
	}

	public long schedulerJobsId;
	public long createDate;
	public long modifiedDate;
	public long dossierId;
	public long fileGroupId;
	public long processWorkflowId;
	public int schedulerType;
	public String shedulerPattern;
	public int status;
}