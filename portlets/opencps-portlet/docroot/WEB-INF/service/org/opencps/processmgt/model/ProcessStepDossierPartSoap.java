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

import org.opencps.processmgt.service.persistence.ProcessStepDossierPartPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link org.opencps.processmgt.service.http.ProcessStepDossierPartServiceSoap}.
 *
 * @author khoavd
 * @see org.opencps.processmgt.service.http.ProcessStepDossierPartServiceSoap
 * @generated
 */
public class ProcessStepDossierPartSoap implements Serializable {
	public static ProcessStepDossierPartSoap toSoapModel(
		ProcessStepDossierPart model) {
		ProcessStepDossierPartSoap soapModel = new ProcessStepDossierPartSoap();

		soapModel.setProcessStepId(model.getProcessStepId());
		soapModel.setDossierPartId(model.getDossierPartId());

		return soapModel;
	}

	public static ProcessStepDossierPartSoap[] toSoapModels(
		ProcessStepDossierPart[] models) {
		ProcessStepDossierPartSoap[] soapModels = new ProcessStepDossierPartSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ProcessStepDossierPartSoap[][] toSoapModels(
		ProcessStepDossierPart[][] models) {
		ProcessStepDossierPartSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ProcessStepDossierPartSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ProcessStepDossierPartSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ProcessStepDossierPartSoap[] toSoapModels(
		List<ProcessStepDossierPart> models) {
		List<ProcessStepDossierPartSoap> soapModels = new ArrayList<ProcessStepDossierPartSoap>(models.size());

		for (ProcessStepDossierPart model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ProcessStepDossierPartSoap[soapModels.size()]);
	}

	public ProcessStepDossierPartSoap() {
	}

	public ProcessStepDossierPartPK getPrimaryKey() {
		return new ProcessStepDossierPartPK(_processStepId, _dossierPartId);
	}

	public void setPrimaryKey(ProcessStepDossierPartPK pk) {
		setProcessStepId(pk.processStepId);
		setDossierPartId(pk.dossierPartId);
	}

	public long getProcessStepId() {
		return _processStepId;
	}

	public void setProcessStepId(long processStepId) {
		_processStepId = processStepId;
	}

	public long getDossierPartId() {
		return _dossierPartId;
	}

	public void setDossierPartId(long dossierPartId) {
		_dossierPartId = dossierPartId;
	}

	private long _processStepId;
	private long _dossierPartId;
}