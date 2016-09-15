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

package org.opencps.servicemgt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ServiceFileTemplateService}.
 *
 * @author khoavd
 * @see ServiceFileTemplateService
 * @generated
 */
public class ServiceFileTemplateServiceWrapper
	implements ServiceFileTemplateService,
		ServiceWrapper<ServiceFileTemplateService> {
	public ServiceFileTemplateServiceWrapper(
		ServiceFileTemplateService serviceFileTemplateService) {
		_serviceFileTemplateService = serviceFileTemplateService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _serviceFileTemplateService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_serviceFileTemplateService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _serviceFileTemplateService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ServiceFileTemplateService getWrappedServiceFileTemplateService() {
		return _serviceFileTemplateService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedServiceFileTemplateService(
		ServiceFileTemplateService serviceFileTemplateService) {
		_serviceFileTemplateService = serviceFileTemplateService;
	}

	@Override
	public ServiceFileTemplateService getWrappedService() {
		return _serviceFileTemplateService;
	}

	@Override
	public void setWrappedService(
		ServiceFileTemplateService serviceFileTemplateService) {
		_serviceFileTemplateService = serviceFileTemplateService;
	}

	private ServiceFileTemplateService _serviceFileTemplateService;
}