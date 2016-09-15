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

package org.opencps.processmgt.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import org.opencps.processmgt.model.SchedulerJobs;

/**
 * The persistence interface for the scheduler jobs service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author khoavd
 * @see SchedulerJobsPersistenceImpl
 * @see SchedulerJobsUtil
 * @generated
 */
public interface SchedulerJobsPersistence extends BasePersistence<SchedulerJobs> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SchedulerJobsUtil} to access the scheduler jobs persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the scheduler jobses where schedulerType = &#63;.
	*
	* @param schedulerType the scheduler type
	* @return the matching scheduler jobses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.processmgt.model.SchedulerJobs> findByS_T(
		int schedulerType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the scheduler jobses where schedulerType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.processmgt.model.impl.SchedulerJobsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param schedulerType the scheduler type
	* @param start the lower bound of the range of scheduler jobses
	* @param end the upper bound of the range of scheduler jobses (not inclusive)
	* @return the range of matching scheduler jobses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.processmgt.model.SchedulerJobs> findByS_T(
		int schedulerType, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the scheduler jobses where schedulerType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.processmgt.model.impl.SchedulerJobsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param schedulerType the scheduler type
	* @param start the lower bound of the range of scheduler jobses
	* @param end the upper bound of the range of scheduler jobses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching scheduler jobses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.processmgt.model.SchedulerJobs> findByS_T(
		int schedulerType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first scheduler jobs in the ordered set where schedulerType = &#63;.
	*
	* @param schedulerType the scheduler type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching scheduler jobs
	* @throws org.opencps.processmgt.NoSuchSchedulerJobsException if a matching scheduler jobs could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.processmgt.model.SchedulerJobs findByS_T_First(
		int schedulerType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.processmgt.NoSuchSchedulerJobsException;

	/**
	* Returns the first scheduler jobs in the ordered set where schedulerType = &#63;.
	*
	* @param schedulerType the scheduler type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching scheduler jobs, or <code>null</code> if a matching scheduler jobs could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.processmgt.model.SchedulerJobs fetchByS_T_First(
		int schedulerType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last scheduler jobs in the ordered set where schedulerType = &#63;.
	*
	* @param schedulerType the scheduler type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching scheduler jobs
	* @throws org.opencps.processmgt.NoSuchSchedulerJobsException if a matching scheduler jobs could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.processmgt.model.SchedulerJobs findByS_T_Last(
		int schedulerType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.processmgt.NoSuchSchedulerJobsException;

	/**
	* Returns the last scheduler jobs in the ordered set where schedulerType = &#63;.
	*
	* @param schedulerType the scheduler type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching scheduler jobs, or <code>null</code> if a matching scheduler jobs could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.processmgt.model.SchedulerJobs fetchByS_T_Last(
		int schedulerType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the scheduler jobses before and after the current scheduler jobs in the ordered set where schedulerType = &#63;.
	*
	* @param schedulerJobsId the primary key of the current scheduler jobs
	* @param schedulerType the scheduler type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next scheduler jobs
	* @throws org.opencps.processmgt.NoSuchSchedulerJobsException if a scheduler jobs with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.processmgt.model.SchedulerJobs[] findByS_T_PrevAndNext(
		long schedulerJobsId, int schedulerType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.processmgt.NoSuchSchedulerJobsException;

	/**
	* Removes all the scheduler jobses where schedulerType = &#63; from the database.
	*
	* @param schedulerType the scheduler type
	* @throws SystemException if a system exception occurred
	*/
	public void removeByS_T(int schedulerType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of scheduler jobses where schedulerType = &#63;.
	*
	* @param schedulerType the scheduler type
	* @return the number of matching scheduler jobses
	* @throws SystemException if a system exception occurred
	*/
	public int countByS_T(int schedulerType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the scheduler jobs in the entity cache if it is enabled.
	*
	* @param schedulerJobs the scheduler jobs
	*/
	public void cacheResult(
		org.opencps.processmgt.model.SchedulerJobs schedulerJobs);

	/**
	* Caches the scheduler jobses in the entity cache if it is enabled.
	*
	* @param schedulerJobses the scheduler jobses
	*/
	public void cacheResult(
		java.util.List<org.opencps.processmgt.model.SchedulerJobs> schedulerJobses);

	/**
	* Creates a new scheduler jobs with the primary key. Does not add the scheduler jobs to the database.
	*
	* @param schedulerJobsId the primary key for the new scheduler jobs
	* @return the new scheduler jobs
	*/
	public org.opencps.processmgt.model.SchedulerJobs create(
		long schedulerJobsId);

	/**
	* Removes the scheduler jobs with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param schedulerJobsId the primary key of the scheduler jobs
	* @return the scheduler jobs that was removed
	* @throws org.opencps.processmgt.NoSuchSchedulerJobsException if a scheduler jobs with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.processmgt.model.SchedulerJobs remove(
		long schedulerJobsId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.processmgt.NoSuchSchedulerJobsException;

	public org.opencps.processmgt.model.SchedulerJobs updateImpl(
		org.opencps.processmgt.model.SchedulerJobs schedulerJobs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the scheduler jobs with the primary key or throws a {@link org.opencps.processmgt.NoSuchSchedulerJobsException} if it could not be found.
	*
	* @param schedulerJobsId the primary key of the scheduler jobs
	* @return the scheduler jobs
	* @throws org.opencps.processmgt.NoSuchSchedulerJobsException if a scheduler jobs with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.processmgt.model.SchedulerJobs findByPrimaryKey(
		long schedulerJobsId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.processmgt.NoSuchSchedulerJobsException;

	/**
	* Returns the scheduler jobs with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param schedulerJobsId the primary key of the scheduler jobs
	* @return the scheduler jobs, or <code>null</code> if a scheduler jobs with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.processmgt.model.SchedulerJobs fetchByPrimaryKey(
		long schedulerJobsId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the scheduler jobses.
	*
	* @return the scheduler jobses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.processmgt.model.SchedulerJobs> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.opencps.processmgt.model.SchedulerJobs> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the scheduler jobses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.processmgt.model.impl.SchedulerJobsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of scheduler jobses
	* @param end the upper bound of the range of scheduler jobses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of scheduler jobses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.processmgt.model.SchedulerJobs> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the scheduler jobses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of scheduler jobses.
	*
	* @return the number of scheduler jobses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}