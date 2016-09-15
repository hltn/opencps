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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for SchedulerJobs. This utility wraps
 * {@link org.opencps.processmgt.service.impl.SchedulerJobsLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author khoavd
 * @see SchedulerJobsLocalService
 * @see org.opencps.processmgt.service.base.SchedulerJobsLocalServiceBaseImpl
 * @see org.opencps.processmgt.service.impl.SchedulerJobsLocalServiceImpl
 * @generated
 */
public class SchedulerJobsLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.opencps.processmgt.service.impl.SchedulerJobsLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the scheduler jobs to the database. Also notifies the appropriate model listeners.
	*
	* @param schedulerJobs the scheduler jobs
	* @return the scheduler jobs that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.processmgt.model.SchedulerJobs addSchedulerJobs(
		org.opencps.processmgt.model.SchedulerJobs schedulerJobs)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addSchedulerJobs(schedulerJobs);
	}

	/**
	* Creates a new scheduler jobs with the primary key. Does not add the scheduler jobs to the database.
	*
	* @param schedulerJobsId the primary key for the new scheduler jobs
	* @return the new scheduler jobs
	*/
	public static org.opencps.processmgt.model.SchedulerJobs createSchedulerJobs(
		long schedulerJobsId) {
		return getService().createSchedulerJobs(schedulerJobsId);
	}

	/**
	* Deletes the scheduler jobs with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param schedulerJobsId the primary key of the scheduler jobs
	* @return the scheduler jobs that was removed
	* @throws PortalException if a scheduler jobs with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.processmgt.model.SchedulerJobs deleteSchedulerJobs(
		long schedulerJobsId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteSchedulerJobs(schedulerJobsId);
	}

	/**
	* Deletes the scheduler jobs from the database. Also notifies the appropriate model listeners.
	*
	* @param schedulerJobs the scheduler jobs
	* @return the scheduler jobs that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.processmgt.model.SchedulerJobs deleteSchedulerJobs(
		org.opencps.processmgt.model.SchedulerJobs schedulerJobs)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteSchedulerJobs(schedulerJobs);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.processmgt.model.impl.SchedulerJobsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.processmgt.model.impl.SchedulerJobsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static org.opencps.processmgt.model.SchedulerJobs fetchSchedulerJobs(
		long schedulerJobsId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchSchedulerJobs(schedulerJobsId);
	}

	/**
	* Returns the scheduler jobs with the primary key.
	*
	* @param schedulerJobsId the primary key of the scheduler jobs
	* @return the scheduler jobs
	* @throws PortalException if a scheduler jobs with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.processmgt.model.SchedulerJobs getSchedulerJobs(
		long schedulerJobsId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getSchedulerJobs(schedulerJobsId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the scheduler jobses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.processmgt.model.impl.SchedulerJobsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of scheduler jobses
	* @param end the upper bound of the range of scheduler jobses (not inclusive)
	* @return the range of scheduler jobses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.processmgt.model.SchedulerJobs> getSchedulerJobses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSchedulerJobses(start, end);
	}

	/**
	* Returns the number of scheduler jobses.
	*
	* @return the number of scheduler jobses
	* @throws SystemException if a system exception occurred
	*/
	public static int getSchedulerJobsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSchedulerJobsesCount();
	}

	/**
	* Updates the scheduler jobs in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param schedulerJobs the scheduler jobs
	* @return the scheduler jobs that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.processmgt.model.SchedulerJobs updateSchedulerJobs(
		org.opencps.processmgt.model.SchedulerJobs schedulerJobs)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateSchedulerJobs(schedulerJobs);
	}

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

	/**
	* @param dossierId
	* @param fileGroupId
	* @param processWorkflowId
	* @param schedulerType
	* @param status
	* @return
	* @throws PortalException
	* @throws SystemException
	*/
	public static org.opencps.processmgt.model.SchedulerJobs addScheduler(
		long dossierId, long fileGroupId, long processWorkflowId,
		int schedulerType, int status, java.lang.String schedulerPattern)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addScheduler(dossierId, fileGroupId, processWorkflowId,
			schedulerType, status, schedulerPattern);
	}

	/**
	* @param schedulerJobId
	* @param status
	* @return
	* @throws PortalException
	* @throws SystemException
	*/
	public static org.opencps.processmgt.model.SchedulerJobs updateScheduler(
		long schedulerJobId, int status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().updateScheduler(schedulerJobId, status);
	}

	/**
	* @param schedulerType
	* @return
	* @throws PortalException
	* @throws SystemException
	*/
	public static java.util.List<org.opencps.processmgt.model.SchedulerJobs> getSchedulerJobs(
		int schedulerType)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getSchedulerJobs(schedulerType);
	}

	public static void clearService() {
		_service = null;
	}

	public static SchedulerJobsLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					SchedulerJobsLocalService.class.getName());

			if (invokableLocalService instanceof SchedulerJobsLocalService) {
				_service = (SchedulerJobsLocalService)invokableLocalService;
			}
			else {
				_service = new SchedulerJobsLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(SchedulerJobsLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(SchedulerJobsLocalService service) {
	}

	private static SchedulerJobsLocalService _service;
}