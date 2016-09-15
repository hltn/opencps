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

import org.opencps.processmgt.model.ProcessWorkflow;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ProcessWorkflow in entity cache.
 *
 * @author khoavd
 * @see ProcessWorkflow
 * @generated
 */
public class ProcessWorkflowCacheModel implements CacheModel<ProcessWorkflow>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(47);

		sb.append("{processWorkflowId=");
		sb.append(processWorkflowId);
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
		sb.append(", serviceProcessId=");
		sb.append(serviceProcessId);
		sb.append(", preProcessStepId=");
		sb.append(preProcessStepId);
		sb.append(", postProcessStepId=");
		sb.append(postProcessStepId);
		sb.append(", autoEvent=");
		sb.append(autoEvent);
		sb.append(", actionName=");
		sb.append(actionName);
		sb.append(", assignUser=");
		sb.append(assignUser);
		sb.append(", actionUserId=");
		sb.append(actionUserId);
		sb.append(", requestPayment=");
		sb.append(requestPayment);
		sb.append(", paymentFee=");
		sb.append(paymentFee);
		sb.append(", generateReceptionNo=");
		sb.append(generateReceptionNo);
		sb.append(", receptionNoPattern=");
		sb.append(receptionNoPattern);
		sb.append(", generateDeadline=");
		sb.append(generateDeadline);
		sb.append(", deadlinePattern=");
		sb.append(deadlinePattern);
		sb.append(", isFinishStep=");
		sb.append(isFinishStep);
		sb.append(", preCondition=");
		sb.append(preCondition);
		sb.append(", isMultipled=");
		sb.append(isMultipled);
		sb.append(", actionCode=");
		sb.append(actionCode);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ProcessWorkflow toEntityModel() {
		ProcessWorkflowImpl processWorkflowImpl = new ProcessWorkflowImpl();

		processWorkflowImpl.setProcessWorkflowId(processWorkflowId);
		processWorkflowImpl.setCompanyId(companyId);
		processWorkflowImpl.setGroupId(groupId);
		processWorkflowImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			processWorkflowImpl.setCreateDate(null);
		}
		else {
			processWorkflowImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			processWorkflowImpl.setModifiedDate(null);
		}
		else {
			processWorkflowImpl.setModifiedDate(new Date(modifiedDate));
		}

		processWorkflowImpl.setServiceProcessId(serviceProcessId);
		processWorkflowImpl.setPreProcessStepId(preProcessStepId);
		processWorkflowImpl.setPostProcessStepId(postProcessStepId);

		if (autoEvent == null) {
			processWorkflowImpl.setAutoEvent(StringPool.BLANK);
		}
		else {
			processWorkflowImpl.setAutoEvent(autoEvent);
		}

		if (actionName == null) {
			processWorkflowImpl.setActionName(StringPool.BLANK);
		}
		else {
			processWorkflowImpl.setActionName(actionName);
		}

		processWorkflowImpl.setAssignUser(assignUser);
		processWorkflowImpl.setActionUserId(actionUserId);
		processWorkflowImpl.setRequestPayment(requestPayment);

		if (paymentFee == null) {
			processWorkflowImpl.setPaymentFee(StringPool.BLANK);
		}
		else {
			processWorkflowImpl.setPaymentFee(paymentFee);
		}

		processWorkflowImpl.setGenerateReceptionNo(generateReceptionNo);

		if (receptionNoPattern == null) {
			processWorkflowImpl.setReceptionNoPattern(StringPool.BLANK);
		}
		else {
			processWorkflowImpl.setReceptionNoPattern(receptionNoPattern);
		}

		processWorkflowImpl.setGenerateDeadline(generateDeadline);

		if (deadlinePattern == null) {
			processWorkflowImpl.setDeadlinePattern(StringPool.BLANK);
		}
		else {
			processWorkflowImpl.setDeadlinePattern(deadlinePattern);
		}

		processWorkflowImpl.setIsFinishStep(isFinishStep);

		if (preCondition == null) {
			processWorkflowImpl.setPreCondition(StringPool.BLANK);
		}
		else {
			processWorkflowImpl.setPreCondition(preCondition);
		}

		processWorkflowImpl.setIsMultipled(isMultipled);

		if (actionCode == null) {
			processWorkflowImpl.setActionCode(StringPool.BLANK);
		}
		else {
			processWorkflowImpl.setActionCode(actionCode);
		}

		processWorkflowImpl.resetOriginalValues();

		return processWorkflowImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		processWorkflowId = objectInput.readLong();
		companyId = objectInput.readLong();
		groupId = objectInput.readLong();
		userId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		serviceProcessId = objectInput.readLong();
		preProcessStepId = objectInput.readLong();
		postProcessStepId = objectInput.readLong();
		autoEvent = objectInput.readUTF();
		actionName = objectInput.readUTF();
		assignUser = objectInput.readBoolean();
		actionUserId = objectInput.readLong();
		requestPayment = objectInput.readBoolean();
		paymentFee = objectInput.readUTF();
		generateReceptionNo = objectInput.readBoolean();
		receptionNoPattern = objectInput.readUTF();
		generateDeadline = objectInput.readBoolean();
		deadlinePattern = objectInput.readUTF();
		isFinishStep = objectInput.readBoolean();
		preCondition = objectInput.readUTF();
		isMultipled = objectInput.readBoolean();
		actionCode = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(processWorkflowId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(serviceProcessId);
		objectOutput.writeLong(preProcessStepId);
		objectOutput.writeLong(postProcessStepId);

		if (autoEvent == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(autoEvent);
		}

		if (actionName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(actionName);
		}

		objectOutput.writeBoolean(assignUser);
		objectOutput.writeLong(actionUserId);
		objectOutput.writeBoolean(requestPayment);

		if (paymentFee == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(paymentFee);
		}

		objectOutput.writeBoolean(generateReceptionNo);

		if (receptionNoPattern == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(receptionNoPattern);
		}

		objectOutput.writeBoolean(generateDeadline);

		if (deadlinePattern == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(deadlinePattern);
		}

		objectOutput.writeBoolean(isFinishStep);

		if (preCondition == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(preCondition);
		}

		objectOutput.writeBoolean(isMultipled);

		if (actionCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(actionCode);
		}
	}

	public long processWorkflowId;
	public long companyId;
	public long groupId;
	public long userId;
	public long createDate;
	public long modifiedDate;
	public long serviceProcessId;
	public long preProcessStepId;
	public long postProcessStepId;
	public String autoEvent;
	public String actionName;
	public boolean assignUser;
	public long actionUserId;
	public boolean requestPayment;
	public String paymentFee;
	public boolean generateReceptionNo;
	public String receptionNoPattern;
	public boolean generateDeadline;
	public String deadlinePattern;
	public boolean isFinishStep;
	public String preCondition;
	public boolean isMultipled;
	public String actionCode;
}