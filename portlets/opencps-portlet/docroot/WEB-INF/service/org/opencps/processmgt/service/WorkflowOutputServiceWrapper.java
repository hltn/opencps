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

package org.opencps.processmgt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link WorkflowOutputService}.
 *
 * @author khoavd
 * @see WorkflowOutputService
 * @generated
 */
public class WorkflowOutputServiceWrapper implements WorkflowOutputService,
	ServiceWrapper<WorkflowOutputService> {
	public WorkflowOutputServiceWrapper(
		WorkflowOutputService workflowOutputService) {
		_workflowOutputService = workflowOutputService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _workflowOutputService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_workflowOutputService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _workflowOutputService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public WorkflowOutputService getWrappedWorkflowOutputService() {
		return _workflowOutputService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedWorkflowOutputService(
		WorkflowOutputService workflowOutputService) {
		_workflowOutputService = workflowOutputService;
	}

	@Override
	public WorkflowOutputService getWrappedService() {
		return _workflowOutputService;
	}

	@Override
	public void setWrappedService(WorkflowOutputService workflowOutputService) {
		_workflowOutputService = workflowOutputService;
	}

	private WorkflowOutputService _workflowOutputService;
}