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
 * Provides a wrapper for {@link SchedulerJobsService}.
 *
 * @author khoavd
 * @see SchedulerJobsService
 * @generated
 */
public class SchedulerJobsServiceWrapper implements SchedulerJobsService,
	ServiceWrapper<SchedulerJobsService> {
	public SchedulerJobsServiceWrapper(
		SchedulerJobsService schedulerJobsService) {
		_schedulerJobsService = schedulerJobsService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _schedulerJobsService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_schedulerJobsService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _schedulerJobsService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public SchedulerJobsService getWrappedSchedulerJobsService() {
		return _schedulerJobsService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedSchedulerJobsService(
		SchedulerJobsService schedulerJobsService) {
		_schedulerJobsService = schedulerJobsService;
	}

	@Override
	public SchedulerJobsService getWrappedService() {
		return _schedulerJobsService;
	}

	@Override
	public void setWrappedService(SchedulerJobsService schedulerJobsService) {
		_schedulerJobsService = schedulerJobsService;
	}

	private SchedulerJobsService _schedulerJobsService;
}