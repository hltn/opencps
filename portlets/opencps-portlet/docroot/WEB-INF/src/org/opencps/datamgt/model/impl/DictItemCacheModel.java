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

package org.opencps.datamgt.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import org.opencps.datamgt.model.DictItem;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DictItem in entity cache.
 *
 * @author khoavd
 * @see DictItem
 * @generated
 */
public class DictItemCacheModel implements CacheModel<DictItem>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{dictItemId=");
		sb.append(dictItemId);
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
		sb.append(", dictCollectionId=");
		sb.append(dictCollectionId);
		sb.append(", itemCode=");
		sb.append(itemCode);
		sb.append(", itemName=");
		sb.append(itemName);
		sb.append(", itemDescription=");
		sb.append(itemDescription);
		sb.append(", parentItemId=");
		sb.append(parentItemId);
		sb.append(", treeIndex=");
		sb.append(treeIndex);
		sb.append(", issueStatus=");
		sb.append(issueStatus);
		sb.append(", dictVersionId=");
		sb.append(dictVersionId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DictItem toEntityModel() {
		DictItemImpl dictItemImpl = new DictItemImpl();

		dictItemImpl.setDictItemId(dictItemId);
		dictItemImpl.setCompanyId(companyId);
		dictItemImpl.setGroupId(groupId);
		dictItemImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			dictItemImpl.setCreateDate(null);
		}
		else {
			dictItemImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			dictItemImpl.setModifiedDate(null);
		}
		else {
			dictItemImpl.setModifiedDate(new Date(modifiedDate));
		}

		dictItemImpl.setDictCollectionId(dictCollectionId);

		if (itemCode == null) {
			dictItemImpl.setItemCode(StringPool.BLANK);
		}
		else {
			dictItemImpl.setItemCode(itemCode);
		}

		if (itemName == null) {
			dictItemImpl.setItemName(StringPool.BLANK);
		}
		else {
			dictItemImpl.setItemName(itemName);
		}

		if (itemDescription == null) {
			dictItemImpl.setItemDescription(StringPool.BLANK);
		}
		else {
			dictItemImpl.setItemDescription(itemDescription);
		}

		dictItemImpl.setParentItemId(parentItemId);

		if (treeIndex == null) {
			dictItemImpl.setTreeIndex(StringPool.BLANK);
		}
		else {
			dictItemImpl.setTreeIndex(treeIndex);
		}

		dictItemImpl.setIssueStatus(issueStatus);
		dictItemImpl.setDictVersionId(dictVersionId);

		dictItemImpl.resetOriginalValues();

		return dictItemImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		dictItemId = objectInput.readLong();
		companyId = objectInput.readLong();
		groupId = objectInput.readLong();
		userId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		dictCollectionId = objectInput.readLong();
		itemCode = objectInput.readUTF();
		itemName = objectInput.readUTF();
		itemDescription = objectInput.readUTF();
		parentItemId = objectInput.readLong();
		treeIndex = objectInput.readUTF();
		issueStatus = objectInput.readInt();
		dictVersionId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(dictItemId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(dictCollectionId);

		if (itemCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(itemCode);
		}

		if (itemName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(itemName);
		}

		if (itemDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(itemDescription);
		}

		objectOutput.writeLong(parentItemId);

		if (treeIndex == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(treeIndex);
		}

		objectOutput.writeInt(issueStatus);
		objectOutput.writeLong(dictVersionId);
	}

	public long dictItemId;
	public long companyId;
	public long groupId;
	public long userId;
	public long createDate;
	public long modifiedDate;
	public long dictCollectionId;
	public String itemCode;
	public String itemName;
	public String itemDescription;
	public long parentItemId;
	public String treeIndex;
	public int issueStatus;
	public long dictVersionId;
}