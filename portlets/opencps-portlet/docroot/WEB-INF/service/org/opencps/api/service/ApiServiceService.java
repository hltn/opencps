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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.security.ac.AccessControlled;
import com.liferay.portal.service.BaseService;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service interface for ApiService. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author trungdk
 * @see ApiServiceServiceUtil
 * @see org.opencps.api.service.base.ApiServiceServiceBaseImpl
 * @see org.opencps.api.service.impl.ApiServiceServiceImpl
 * @generated
 */
@AccessControlled
@JSONWebService
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface ApiServiceService extends BaseService, InvokableService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ApiServiceServiceUtil} to access the api service remote service. Add custom service methods to {@link org.opencps.api.service.impl.ApiServiceServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable;

	@com.liferay.portal.kernel.jsonwebservice.JSONWebService(value = "sms", method = "GET")
	public void receiveSMS(java.lang.String phone, java.lang.String message)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@com.liferay.portal.kernel.jsonwebservice.JSONWebService(value = "dossiers", method = "GET")
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.kernel.json.JSONObject searchDossierByUserAssignProcessOrder(
		java.lang.String username)
		throws com.liferay.portal.kernel.exception.SystemException;

	@com.liferay.portal.kernel.jsonwebservice.JSONWebService(value = "dossiers", method = "GET")
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.kernel.json.JSONObject searchDossierByProcessStepAndUser(
		java.lang.String processno, java.lang.String stepno,
		java.lang.String username);

	@com.liferay.portal.kernel.jsonwebservice.JSONWebService(value = "dossiers", method = "GET")
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.kernel.json.JSONObject getByoid(
		java.lang.String oid);

	@com.liferay.portal.kernel.jsonwebservice.JSONWebService(value = "dossierfile", method = "POST")
	public com.liferay.portal.kernel.json.JSONObject addDossierFile(
		java.lang.String oid, java.lang.String dossierfile);

	@com.liferay.portal.kernel.jsonwebservice.JSONWebService(value = "processorder", method = "POST")
	public com.liferay.portal.kernel.json.JSONObject nextStep(
		java.lang.String oid, java.lang.String actioncode,
		java.lang.String username);

	@com.liferay.portal.kernel.jsonwebservice.JSONWebService(value = "processorder", method = "POST")
	public com.liferay.portal.kernel.json.JSONObject nextStep(
		java.lang.String oid, java.lang.String actioncode,
		java.lang.String actionnote, java.lang.String username);

	@com.liferay.portal.kernel.jsonwebservice.JSONWebService(value = "dossiers", method = "GET")
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.kernel.json.JSONObject searchDossierByDS_RD_SN_U(
		java.lang.String dossierstatus, java.lang.String serviceno,
		java.lang.String fromdate, java.lang.String todate,
		java.lang.String username)
		throws com.liferay.portal.kernel.exception.SystemException;

	@com.liferay.portal.kernel.jsonwebservice.JSONWebService(value = "dossiers", method = "GET")
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.kernel.json.JSONObject getByoid(
		java.lang.String oid, java.lang.String filetype);
}