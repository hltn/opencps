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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import org.opencps.dossiermgt.model.DossierPart;
import org.opencps.dossiermgt.model.DossierPartModel;
import org.opencps.dossiermgt.model.DossierPartSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the DossierPart service. Represents a row in the &quot;opencps_dossierpart&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.opencps.dossiermgt.model.DossierPartModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DossierPartImpl}.
 * </p>
 *
 * @author trungnt
 * @see DossierPartImpl
 * @see org.opencps.dossiermgt.model.DossierPart
 * @see org.opencps.dossiermgt.model.DossierPartModel
 * @generated
 */
@JSON(strict = true)
public class DossierPartModelImpl extends BaseModelImpl<DossierPart>
	implements DossierPartModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dossier part model instance should use the {@link org.opencps.dossiermgt.model.DossierPart} interface instead.
	 */
	public static final String TABLE_NAME = "opencps_dossierpart";
	public static final Object[][] TABLE_COLUMNS = {
			{ "dossierpartId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "dossierTemplateId", Types.BIGINT },
			{ "partNo", Types.VARCHAR },
			{ "partName", Types.VARCHAR },
			{ "partTip", Types.VARCHAR },
			{ "partType", Types.INTEGER },
			{ "parentId", Types.BIGINT },
			{ "sibling", Types.DOUBLE },
			{ "treeIndex", Types.VARCHAR },
			{ "formScript", Types.VARCHAR },
			{ "formReport", Types.VARCHAR },
			{ "sampleData", Types.VARCHAR },
			{ "required", Types.BOOLEAN },
			{ "templateFileNo", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table opencps_dossierpart (dossierpartId LONG not null primary key,companyId LONG,groupId LONG,userId LONG,createDate DATE null,modifiedDate DATE null,dossierTemplateId LONG,partNo VARCHAR(100) null,partName VARCHAR(500) null,partTip STRING null,partType INTEGER,parentId LONG,sibling DOUBLE,treeIndex VARCHAR(1000) null,formScript STRING null,formReport STRING null,sampleData STRING null,required BOOLEAN,templateFileNo VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table opencps_dossierpart";
	public static final String ORDER_BY_JPQL = " ORDER BY dossierPart.sibling ASC";
	public static final String ORDER_BY_SQL = " ORDER BY opencps_dossierpart.sibling ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.opencps.dossiermgt.model.DossierPart"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.opencps.dossiermgt.model.DossierPart"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.org.opencps.dossiermgt.model.DossierPart"),
			true);
	public static long DOSSIERTEMPLATEID_COLUMN_BITMASK = 1L;
	public static long GROUPID_COLUMN_BITMASK = 2L;
	public static long PARENTID_COLUMN_BITMASK = 4L;
	public static long PARTNAME_COLUMN_BITMASK = 8L;
	public static long PARTNO_COLUMN_BITMASK = 16L;
	public static long PARTTYPE_COLUMN_BITMASK = 32L;
	public static long SIBLING_COLUMN_BITMASK = 64L;
	public static long TEMPLATEFILENO_COLUMN_BITMASK = 128L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static DossierPart toModel(DossierPartSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		DossierPart model = new DossierPartImpl();

		model.setDossierpartId(soapModel.getDossierpartId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setGroupId(soapModel.getGroupId());
		model.setUserId(soapModel.getUserId());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setDossierTemplateId(soapModel.getDossierTemplateId());
		model.setPartNo(soapModel.getPartNo());
		model.setPartName(soapModel.getPartName());
		model.setPartTip(soapModel.getPartTip());
		model.setPartType(soapModel.getPartType());
		model.setParentId(soapModel.getParentId());
		model.setSibling(soapModel.getSibling());
		model.setTreeIndex(soapModel.getTreeIndex());
		model.setFormScript(soapModel.getFormScript());
		model.setFormReport(soapModel.getFormReport());
		model.setSampleData(soapModel.getSampleData());
		model.setRequired(soapModel.getRequired());
		model.setTemplateFileNo(soapModel.getTemplateFileNo());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<DossierPart> toModels(DossierPartSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<DossierPart> models = new ArrayList<DossierPart>(soapModels.length);

		for (DossierPartSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.opencps.dossiermgt.model.DossierPart"));

	public DossierPartModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _dossierpartId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDossierpartId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _dossierpartId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return DossierPart.class;
	}

	@Override
	public String getModelClassName() {
		return DossierPart.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("dossierpartId", getDossierpartId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("dossierTemplateId", getDossierTemplateId());
		attributes.put("partNo", getPartNo());
		attributes.put("partName", getPartName());
		attributes.put("partTip", getPartTip());
		attributes.put("partType", getPartType());
		attributes.put("parentId", getParentId());
		attributes.put("sibling", getSibling());
		attributes.put("treeIndex", getTreeIndex());
		attributes.put("formScript", getFormScript());
		attributes.put("formReport", getFormReport());
		attributes.put("sampleData", getSampleData());
		attributes.put("required", getRequired());
		attributes.put("templateFileNo", getTemplateFileNo());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long dossierpartId = (Long)attributes.get("dossierpartId");

		if (dossierpartId != null) {
			setDossierpartId(dossierpartId);
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

		Long dossierTemplateId = (Long)attributes.get("dossierTemplateId");

		if (dossierTemplateId != null) {
			setDossierTemplateId(dossierTemplateId);
		}

		String partNo = (String)attributes.get("partNo");

		if (partNo != null) {
			setPartNo(partNo);
		}

		String partName = (String)attributes.get("partName");

		if (partName != null) {
			setPartName(partName);
		}

		String partTip = (String)attributes.get("partTip");

		if (partTip != null) {
			setPartTip(partTip);
		}

		Integer partType = (Integer)attributes.get("partType");

		if (partType != null) {
			setPartType(partType);
		}

		Long parentId = (Long)attributes.get("parentId");

		if (parentId != null) {
			setParentId(parentId);
		}

		Double sibling = (Double)attributes.get("sibling");

		if (sibling != null) {
			setSibling(sibling);
		}

		String treeIndex = (String)attributes.get("treeIndex");

		if (treeIndex != null) {
			setTreeIndex(treeIndex);
		}

		String formScript = (String)attributes.get("formScript");

		if (formScript != null) {
			setFormScript(formScript);
		}

		String formReport = (String)attributes.get("formReport");

		if (formReport != null) {
			setFormReport(formReport);
		}

		String sampleData = (String)attributes.get("sampleData");

		if (sampleData != null) {
			setSampleData(sampleData);
		}

		Boolean required = (Boolean)attributes.get("required");

		if (required != null) {
			setRequired(required);
		}

		String templateFileNo = (String)attributes.get("templateFileNo");

		if (templateFileNo != null) {
			setTemplateFileNo(templateFileNo);
		}
	}

	@JSON
	@Override
	public long getDossierpartId() {
		return _dossierpartId;
	}

	@Override
	public void setDossierpartId(long dossierpartId) {
		_dossierpartId = dossierpartId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public long getDossierTemplateId() {
		return _dossierTemplateId;
	}

	@Override
	public void setDossierTemplateId(long dossierTemplateId) {
		_columnBitmask |= DOSSIERTEMPLATEID_COLUMN_BITMASK;

		if (!_setOriginalDossierTemplateId) {
			_setOriginalDossierTemplateId = true;

			_originalDossierTemplateId = _dossierTemplateId;
		}

		_dossierTemplateId = dossierTemplateId;
	}

	public long getOriginalDossierTemplateId() {
		return _originalDossierTemplateId;
	}

	@JSON
	@Override
	public String getPartNo() {
		if (_partNo == null) {
			return StringPool.BLANK;
		}
		else {
			return _partNo;
		}
	}

	@Override
	public void setPartNo(String partNo) {
		_columnBitmask |= PARTNO_COLUMN_BITMASK;

		if (_originalPartNo == null) {
			_originalPartNo = _partNo;
		}

		_partNo = partNo;
	}

	public String getOriginalPartNo() {
		return GetterUtil.getString(_originalPartNo);
	}

	@JSON
	@Override
	public String getPartName() {
		if (_partName == null) {
			return StringPool.BLANK;
		}
		else {
			return _partName;
		}
	}

	@Override
	public void setPartName(String partName) {
		_columnBitmask |= PARTNAME_COLUMN_BITMASK;

		if (_originalPartName == null) {
			_originalPartName = _partName;
		}

		_partName = partName;
	}

	public String getOriginalPartName() {
		return GetterUtil.getString(_originalPartName);
	}

	@JSON
	@Override
	public String getPartTip() {
		if (_partTip == null) {
			return StringPool.BLANK;
		}
		else {
			return _partTip;
		}
	}

	@Override
	public void setPartTip(String partTip) {
		_partTip = partTip;
	}

	@JSON
	@Override
	public int getPartType() {
		return _partType;
	}

	@Override
	public void setPartType(int partType) {
		_columnBitmask |= PARTTYPE_COLUMN_BITMASK;

		if (!_setOriginalPartType) {
			_setOriginalPartType = true;

			_originalPartType = _partType;
		}

		_partType = partType;
	}

	public int getOriginalPartType() {
		return _originalPartType;
	}

	@JSON
	@Override
	public long getParentId() {
		return _parentId;
	}

	@Override
	public void setParentId(long parentId) {
		_columnBitmask |= PARENTID_COLUMN_BITMASK;

		if (!_setOriginalParentId) {
			_setOriginalParentId = true;

			_originalParentId = _parentId;
		}

		_parentId = parentId;
	}

	public long getOriginalParentId() {
		return _originalParentId;
	}

	@JSON
	@Override
	public double getSibling() {
		return _sibling;
	}

	@Override
	public void setSibling(double sibling) {
		_columnBitmask = -1L;

		if (!_setOriginalSibling) {
			_setOriginalSibling = true;

			_originalSibling = _sibling;
		}

		_sibling = sibling;
	}

	public double getOriginalSibling() {
		return _originalSibling;
	}

	@JSON
	@Override
	public String getTreeIndex() {
		if (_treeIndex == null) {
			return StringPool.BLANK;
		}
		else {
			return _treeIndex;
		}
	}

	@Override
	public void setTreeIndex(String treeIndex) {
		_treeIndex = treeIndex;
	}

	@JSON
	@Override
	public String getFormScript() {
		if (_formScript == null) {
			return StringPool.BLANK;
		}
		else {
			return _formScript;
		}
	}

	@Override
	public void setFormScript(String formScript) {
		_formScript = formScript;
	}

	@JSON
	@Override
	public String getFormReport() {
		if (_formReport == null) {
			return StringPool.BLANK;
		}
		else {
			return _formReport;
		}
	}

	@Override
	public void setFormReport(String formReport) {
		_formReport = formReport;
	}

	@JSON
	@Override
	public String getSampleData() {
		if (_sampleData == null) {
			return StringPool.BLANK;
		}
		else {
			return _sampleData;
		}
	}

	@Override
	public void setSampleData(String sampleData) {
		_sampleData = sampleData;
	}

	@JSON
	@Override
	public boolean getRequired() {
		return _required;
	}

	@Override
	public boolean isRequired() {
		return _required;
	}

	@Override
	public void setRequired(boolean required) {
		_required = required;
	}

	@JSON
	@Override
	public String getTemplateFileNo() {
		if (_templateFileNo == null) {
			return StringPool.BLANK;
		}
		else {
			return _templateFileNo;
		}
	}

	@Override
	public void setTemplateFileNo(String templateFileNo) {
		_columnBitmask |= TEMPLATEFILENO_COLUMN_BITMASK;

		if (_originalTemplateFileNo == null) {
			_originalTemplateFileNo = _templateFileNo;
		}

		_templateFileNo = templateFileNo;
	}

	public String getOriginalTemplateFileNo() {
		return GetterUtil.getString(_originalTemplateFileNo);
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			DossierPart.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public DossierPart toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (DossierPart)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DossierPartImpl dossierPartImpl = new DossierPartImpl();

		dossierPartImpl.setDossierpartId(getDossierpartId());
		dossierPartImpl.setCompanyId(getCompanyId());
		dossierPartImpl.setGroupId(getGroupId());
		dossierPartImpl.setUserId(getUserId());
		dossierPartImpl.setCreateDate(getCreateDate());
		dossierPartImpl.setModifiedDate(getModifiedDate());
		dossierPartImpl.setDossierTemplateId(getDossierTemplateId());
		dossierPartImpl.setPartNo(getPartNo());
		dossierPartImpl.setPartName(getPartName());
		dossierPartImpl.setPartTip(getPartTip());
		dossierPartImpl.setPartType(getPartType());
		dossierPartImpl.setParentId(getParentId());
		dossierPartImpl.setSibling(getSibling());
		dossierPartImpl.setTreeIndex(getTreeIndex());
		dossierPartImpl.setFormScript(getFormScript());
		dossierPartImpl.setFormReport(getFormReport());
		dossierPartImpl.setSampleData(getSampleData());
		dossierPartImpl.setRequired(getRequired());
		dossierPartImpl.setTemplateFileNo(getTemplateFileNo());

		dossierPartImpl.resetOriginalValues();

		return dossierPartImpl;
	}

	@Override
	public int compareTo(DossierPart dossierPart) {
		int value = 0;

		if (getSibling() < dossierPart.getSibling()) {
			value = -1;
		}
		else if (getSibling() > dossierPart.getSibling()) {
			value = 1;
		}
		else {
			value = 0;
		}

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

		if (!(obj instanceof DossierPart)) {
			return false;
		}

		DossierPart dossierPart = (DossierPart)obj;

		long primaryKey = dossierPart.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		DossierPartModelImpl dossierPartModelImpl = this;

		dossierPartModelImpl._originalGroupId = dossierPartModelImpl._groupId;

		dossierPartModelImpl._setOriginalGroupId = false;

		dossierPartModelImpl._originalDossierTemplateId = dossierPartModelImpl._dossierTemplateId;

		dossierPartModelImpl._setOriginalDossierTemplateId = false;

		dossierPartModelImpl._originalPartNo = dossierPartModelImpl._partNo;

		dossierPartModelImpl._originalPartName = dossierPartModelImpl._partName;

		dossierPartModelImpl._originalPartType = dossierPartModelImpl._partType;

		dossierPartModelImpl._setOriginalPartType = false;

		dossierPartModelImpl._originalParentId = dossierPartModelImpl._parentId;

		dossierPartModelImpl._setOriginalParentId = false;

		dossierPartModelImpl._originalSibling = dossierPartModelImpl._sibling;

		dossierPartModelImpl._setOriginalSibling = false;

		dossierPartModelImpl._originalTemplateFileNo = dossierPartModelImpl._templateFileNo;

		dossierPartModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<DossierPart> toCacheModel() {
		DossierPartCacheModel dossierPartCacheModel = new DossierPartCacheModel();

		dossierPartCacheModel.dossierpartId = getDossierpartId();

		dossierPartCacheModel.companyId = getCompanyId();

		dossierPartCacheModel.groupId = getGroupId();

		dossierPartCacheModel.userId = getUserId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			dossierPartCacheModel.createDate = createDate.getTime();
		}
		else {
			dossierPartCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			dossierPartCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			dossierPartCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		dossierPartCacheModel.dossierTemplateId = getDossierTemplateId();

		dossierPartCacheModel.partNo = getPartNo();

		String partNo = dossierPartCacheModel.partNo;

		if ((partNo != null) && (partNo.length() == 0)) {
			dossierPartCacheModel.partNo = null;
		}

		dossierPartCacheModel.partName = getPartName();

		String partName = dossierPartCacheModel.partName;

		if ((partName != null) && (partName.length() == 0)) {
			dossierPartCacheModel.partName = null;
		}

		dossierPartCacheModel.partTip = getPartTip();

		String partTip = dossierPartCacheModel.partTip;

		if ((partTip != null) && (partTip.length() == 0)) {
			dossierPartCacheModel.partTip = null;
		}

		dossierPartCacheModel.partType = getPartType();

		dossierPartCacheModel.parentId = getParentId();

		dossierPartCacheModel.sibling = getSibling();

		dossierPartCacheModel.treeIndex = getTreeIndex();

		String treeIndex = dossierPartCacheModel.treeIndex;

		if ((treeIndex != null) && (treeIndex.length() == 0)) {
			dossierPartCacheModel.treeIndex = null;
		}

		dossierPartCacheModel.formScript = getFormScript();

		String formScript = dossierPartCacheModel.formScript;

		if ((formScript != null) && (formScript.length() == 0)) {
			dossierPartCacheModel.formScript = null;
		}

		dossierPartCacheModel.formReport = getFormReport();

		String formReport = dossierPartCacheModel.formReport;

		if ((formReport != null) && (formReport.length() == 0)) {
			dossierPartCacheModel.formReport = null;
		}

		dossierPartCacheModel.sampleData = getSampleData();

		String sampleData = dossierPartCacheModel.sampleData;

		if ((sampleData != null) && (sampleData.length() == 0)) {
			dossierPartCacheModel.sampleData = null;
		}

		dossierPartCacheModel.required = getRequired();

		dossierPartCacheModel.templateFileNo = getTemplateFileNo();

		String templateFileNo = dossierPartCacheModel.templateFileNo;

		if ((templateFileNo != null) && (templateFileNo.length() == 0)) {
			dossierPartCacheModel.templateFileNo = null;
		}

		return dossierPartCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{dossierpartId=");
		sb.append(getDossierpartId());
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
		sb.append(", dossierTemplateId=");
		sb.append(getDossierTemplateId());
		sb.append(", partNo=");
		sb.append(getPartNo());
		sb.append(", partName=");
		sb.append(getPartName());
		sb.append(", partTip=");
		sb.append(getPartTip());
		sb.append(", partType=");
		sb.append(getPartType());
		sb.append(", parentId=");
		sb.append(getParentId());
		sb.append(", sibling=");
		sb.append(getSibling());
		sb.append(", treeIndex=");
		sb.append(getTreeIndex());
		sb.append(", formScript=");
		sb.append(getFormScript());
		sb.append(", formReport=");
		sb.append(getFormReport());
		sb.append(", sampleData=");
		sb.append(getSampleData());
		sb.append(", required=");
		sb.append(getRequired());
		sb.append(", templateFileNo=");
		sb.append(getTemplateFileNo());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(61);

		sb.append("<model><model-name>");
		sb.append("org.opencps.dossiermgt.model.DossierPart");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>dossierpartId</column-name><column-value><![CDATA[");
		sb.append(getDossierpartId());
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
			"<column><column-name>dossierTemplateId</column-name><column-value><![CDATA[");
		sb.append(getDossierTemplateId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>partNo</column-name><column-value><![CDATA[");
		sb.append(getPartNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>partName</column-name><column-value><![CDATA[");
		sb.append(getPartName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>partTip</column-name><column-value><![CDATA[");
		sb.append(getPartTip());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>partType</column-name><column-value><![CDATA[");
		sb.append(getPartType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>parentId</column-name><column-value><![CDATA[");
		sb.append(getParentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sibling</column-name><column-value><![CDATA[");
		sb.append(getSibling());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>treeIndex</column-name><column-value><![CDATA[");
		sb.append(getTreeIndex());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>formScript</column-name><column-value><![CDATA[");
		sb.append(getFormScript());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>formReport</column-name><column-value><![CDATA[");
		sb.append(getFormReport());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sampleData</column-name><column-value><![CDATA[");
		sb.append(getSampleData());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>required</column-name><column-value><![CDATA[");
		sb.append(getRequired());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>templateFileNo</column-name><column-value><![CDATA[");
		sb.append(getTemplateFileNo());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = DossierPart.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			DossierPart.class
		};
	private long _dossierpartId;
	private long _companyId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _userId;
	private String _userUuid;
	private Date _createDate;
	private Date _modifiedDate;
	private long _dossierTemplateId;
	private long _originalDossierTemplateId;
	private boolean _setOriginalDossierTemplateId;
	private String _partNo;
	private String _originalPartNo;
	private String _partName;
	private String _originalPartName;
	private String _partTip;
	private int _partType;
	private int _originalPartType;
	private boolean _setOriginalPartType;
	private long _parentId;
	private long _originalParentId;
	private boolean _setOriginalParentId;
	private double _sibling;
	private double _originalSibling;
	private boolean _setOriginalSibling;
	private String _treeIndex;
	private String _formScript;
	private String _formReport;
	private String _sampleData;
	private boolean _required;
	private String _templateFileNo;
	private String _originalTemplateFileNo;
	private long _columnBitmask;
	private DossierPart _escapedModel;
}