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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for ApiService. This utility wraps
 * {@link org.opencps.api.service.impl.ApiServiceServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author trungdk
 * @see ApiServiceService
 * @see org.opencps.api.service.base.ApiServiceServiceBaseImpl
 * @see org.opencps.api.service.impl.ApiServiceServiceImpl
 * @generated
 */
public class ApiServiceServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.opencps.api.service.impl.ApiServiceServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static void receiveSMS(java.lang.String phone,
		java.lang.String message)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().receiveSMS(phone, message);
	}

	public static com.liferay.portal.kernel.json.JSONObject searchDossierByUserAssignProcessOrder(
		java.lang.String username)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().searchDossierByUserAssignProcessOrder(username);
	}

	public static com.liferay.portal.kernel.json.JSONObject searchDossierByProcessStepAndUser(
		java.lang.String processno, java.lang.String stepno,
		java.lang.String username) {
		return getService()
				   .searchDossierByProcessStepAndUser(processno, stepno,
			username);
	}

	public static com.liferay.portal.kernel.json.JSONObject getByoid(
		java.lang.String oid) {
		return getService().getByoid(oid);
	}

	public static com.liferay.portal.kernel.json.JSONObject addDossierFile(
		java.lang.String oid, java.lang.String dossierfile) {
		return getService().addDossierFile(oid, dossierfile);
	}

	public static com.liferay.portal.kernel.json.JSONObject nextStep(
		java.lang.String oid, java.lang.String actioncode,
		java.lang.String username) {
		return getService().nextStep(oid, actioncode, username);
	}

	public static com.liferay.portal.kernel.json.JSONObject nextStep(
		java.lang.String oid, java.lang.String actioncode,
		java.lang.String actionnote, java.lang.String username) {
		return getService().nextStep(oid, actioncode, actionnote, username);
	}

	public static com.liferay.portal.kernel.json.JSONObject searchDossierByDS_RD_SN_U(
		java.lang.String dossierstatus, java.lang.String serviceno,
		java.lang.String fromdate, java.lang.String todate,
		java.lang.String username)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .searchDossierByDS_RD_SN_U(dossierstatus, serviceno,
			fromdate, todate, username);
	}

	public static com.liferay.portal.kernel.json.JSONObject getByoid(
		java.lang.String oid, java.lang.String filetype) {
		return getService().getByoid(oid, filetype);
	}

	public static void clearService() {
		_service = null;
	}

	public static ApiServiceService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					ApiServiceService.class.getName());

			if (invokableService instanceof ApiServiceService) {
				_service = (ApiServiceService)invokableService;
			}
			else {
				_service = new ApiServiceServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(ApiServiceServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(ApiServiceService service) {
	}

	private static ApiServiceService _service;
}