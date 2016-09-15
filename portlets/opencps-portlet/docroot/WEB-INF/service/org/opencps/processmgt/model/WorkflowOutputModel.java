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

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the WorkflowOutput service. Represents a row in the &quot;opencps_workflowoutput&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.opencps.processmgt.model.impl.WorkflowOutputModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.opencps.processmgt.model.impl.WorkflowOutputImpl}.
 * </p>
 *
 * @author khoavd
 * @see WorkflowOutput
 * @see org.opencps.processmgt.model.impl.WorkflowOutputImpl
 * @see org.opencps.processmgt.model.impl.WorkflowOutputModelImpl
 * @generated
 */
public interface WorkflowOutputModel extends BaseModel<WorkflowOutput> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a workflow output model instance should use the {@link WorkflowOutput} interface instead.
	 */

	/**
	 * Returns the primary key of this workflow output.
	 *
	 * @return the primary key of this workflow output
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this workflow output.
	 *
	 * @param primaryKey the primary key of this workflow output
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the workflow output ID of this workflow output.
	 *
	 * @return the workflow output ID of this workflow output
	 */
	public long getWorkflowOutputId();

	/**
	 * Sets the workflow output ID of this workflow output.
	 *
	 * @param workflowOutputId the workflow output ID of this workflow output
	 */
	public void setWorkflowOutputId(long workflowOutputId);

	/**
	 * Returns the process workflow ID of this workflow output.
	 *
	 * @return the process workflow ID of this workflow output
	 */
	public long getProcessWorkflowId();

	/**
	 * Sets the process workflow ID of this workflow output.
	 *
	 * @param processWorkflowId the process workflow ID of this workflow output
	 */
	public void setProcessWorkflowId(long processWorkflowId);

	/**
	 * Returns the dossier part ID of this workflow output.
	 *
	 * @return the dossier part ID of this workflow output
	 */
	public long getDossierPartId();

	/**
	 * Sets the dossier part ID of this workflow output.
	 *
	 * @param dossierPartId the dossier part ID of this workflow output
	 */
	public void setDossierPartId(long dossierPartId);

	/**
	 * Returns the required of this workflow output.
	 *
	 * @return the required of this workflow output
	 */
	public boolean getRequired();

	/**
	 * Returns <code>true</code> if this workflow output is required.
	 *
	 * @return <code>true</code> if this workflow output is required; <code>false</code> otherwise
	 */
	public boolean isRequired();

	/**
	 * Sets whether this workflow output is required.
	 *
	 * @param required the required of this workflow output
	 */
	public void setRequired(boolean required);

	/**
	 * Returns the esign of this workflow output.
	 *
	 * @return the esign of this workflow output
	 */
	public boolean getEsign();

	/**
	 * Returns <code>true</code> if this workflow output is esign.
	 *
	 * @return <code>true</code> if this workflow output is esign; <code>false</code> otherwise
	 */
	public boolean isEsign();

	/**
	 * Sets whether this workflow output is esign.
	 *
	 * @param esign the esign of this workflow output
	 */
	public void setEsign(boolean esign);

	/**
	 * Returns the postback of this workflow output.
	 *
	 * @return the postback of this workflow output
	 */
	public boolean getPostback();

	/**
	 * Returns <code>true</code> if this workflow output is postback.
	 *
	 * @return <code>true</code> if this workflow output is postback; <code>false</code> otherwise
	 */
	public boolean isPostback();

	/**
	 * Sets whether this workflow output is postback.
	 *
	 * @param postback the postback of this workflow output
	 */
	public void setPostback(boolean postback);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		org.opencps.processmgt.model.WorkflowOutput workflowOutput);

	@Override
	public int hashCode();

	@Override
	public CacheModel<org.opencps.processmgt.model.WorkflowOutput> toCacheModel();

	@Override
	public org.opencps.processmgt.model.WorkflowOutput toEscapedModel();

	@Override
	public org.opencps.processmgt.model.WorkflowOutput toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}