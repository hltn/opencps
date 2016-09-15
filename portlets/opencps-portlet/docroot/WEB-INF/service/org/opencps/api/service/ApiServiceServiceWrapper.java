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

package org.opencps.api.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ApiServiceService}.
 *
 * @author trungdk
 * @see ApiServiceService
 * @generated
 */
public class ApiServiceServiceWrapper implements ApiServiceService,
	ServiceWrapper<ApiServiceService> {
	public ApiServiceServiceWrapper(ApiServiceService apiServiceService) {
		_apiServiceService = apiServiceService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _apiServiceService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_apiServiceService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _apiServiceService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public void receiveSMS(java.lang.String phone, java.lang.String message)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_apiServiceService.receiveSMS(phone, message);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONObject searchDossierByUserAssignProcessOrder(
		java.lang.String username)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _apiServiceService.searchDossierByUserAssignProcessOrder(username);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONObject searchDossierByProcessStepAndUser(
		java.lang.String processno, java.lang.String stepno,
		java.lang.String username) {
		return _apiServiceService.searchDossierByProcessStepAndUser(processno,
			stepno, username);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONObject getByoid(
		java.lang.String oid) {
		return _apiServiceService.getByoid(oid);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONObject addDossierFile(
		java.lang.String oid, java.lang.String dossierfile) {
		return _apiServiceService.addDossierFile(oid, dossierfile);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONObject nextStep(
		java.lang.String oid, java.lang.String actioncode,
		java.lang.String username) {
		return _apiServiceService.nextStep(oid, actioncode, username);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONObject nextStep(
		java.lang.String oid, java.lang.String actioncode,
		java.lang.String actionnote, java.lang.String username) {
		return _apiServiceService.nextStep(oid, actioncode, actionnote, username);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONObject searchDossierByDS_RD_SN_U(
		java.lang.String dossierstatus, java.lang.String serviceno,
		java.lang.String fromdate, java.lang.String todate,
		java.lang.String username)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _apiServiceService.searchDossierByDS_RD_SN_U(dossierstatus,
			serviceno, fromdate, todate, username);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONObject getByoid(
		java.lang.String oid, java.lang.String filetype) {
		return _apiServiceService.getByoid(oid, filetype);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ApiServiceService getWrappedApiServiceService() {
		return _apiServiceService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedApiServiceService(ApiServiceService apiServiceService) {
		_apiServiceService = apiServiceService;
	}

	@Override
	public ApiServiceService getWrappedService() {
		return _apiServiceService;
	}

	@Override
	public void setWrappedService(ApiServiceService apiServiceService) {
		_apiServiceService = apiServiceService;
	}

	private ApiServiceService _apiServiceService;
}