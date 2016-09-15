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

import org.opencps.processmgt.model.ActionHistory;

/**
 * The persistence interface for the action history service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author khoavd
 * @see ActionHistoryPersistenceImpl
 * @see ActionHistoryUtil
 * @generated
 */
public interface ActionHistoryPersistence extends BasePersistence<ActionHistory> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ActionHistoryUtil} to access the action history persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the action histories where processOrderId = &#63; and processWorkflowId = &#63;.
	*
	* @param processOrderId the process order ID
	* @param processWorkflowId the process workflow ID
	* @return the matching action histories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.processmgt.model.ActionHistory> findByPOID_PWID(
		long processOrderId, long processWorkflowId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the action histories where processOrderId = &#63; and processWorkflowId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.processmgt.model.impl.ActionHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param processOrderId the process order ID
	* @param processWorkflowId the process workflow ID
	* @param start the lower bound of the range of action histories
	* @param end the upper bound of the range of action histories (not inclusive)
	* @return the range of matching action histories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.processmgt.model.ActionHistory> findByPOID_PWID(
		long processOrderId, long processWorkflowId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the action histories where processOrderId = &#63; and processWorkflowId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.processmgt.model.impl.ActionHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param processOrderId the process order ID
	* @param processWorkflowId the process workflow ID
	* @param start the lower bound of the range of action histories
	* @param end the upper bound of the range of action histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching action histories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.processmgt.model.ActionHistory> findByPOID_PWID(
		long processOrderId, long processWorkflowId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first action history in the ordered set where processOrderId = &#63; and processWorkflowId = &#63;.
	*
	* @param processOrderId the process order ID
	* @param processWorkflowId the process workflow ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching action history
	* @throws org.opencps.processmgt.NoSuchActionHistoryException if a matching action history could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.processmgt.model.ActionHistory findByPOID_PWID_First(
		long processOrderId, long processWorkflowId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.processmgt.NoSuchActionHistoryException;

	/**
	* Returns the first action history in the ordered set where processOrderId = &#63; and processWorkflowId = &#63;.
	*
	* @param processOrderId the process order ID
	* @param processWorkflowId the process workflow ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching action history, or <code>null</code> if a matching action history could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.processmgt.model.ActionHistory fetchByPOID_PWID_First(
		long processOrderId, long processWorkflowId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last action history in the ordered set where processOrderId = &#63; and processWorkflowId = &#63;.
	*
	* @param processOrderId the process order ID
	* @param processWorkflowId the process workflow ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching action history
	* @throws org.opencps.processmgt.NoSuchActionHistoryException if a matching action history could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.processmgt.model.ActionHistory findByPOID_PWID_Last(
		long processOrderId, long processWorkflowId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.processmgt.NoSuchActionHistoryException;

	/**
	* Returns the last action history in the ordered set where processOrderId = &#63; and processWorkflowId = &#63;.
	*
	* @param processOrderId the process order ID
	* @param processWorkflowId the process workflow ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching action history, or <code>null</code> if a matching action history could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.processmgt.model.ActionHistory fetchByPOID_PWID_Last(
		long processOrderId, long processWorkflowId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the action histories before and after the current action history in the ordered set where processOrderId = &#63; and processWorkflowId = &#63;.
	*
	* @param actionHistoryId the primary key of the current action history
	* @param processOrderId the process order ID
	* @param processWorkflowId the process workflow ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next action history
	* @throws org.opencps.processmgt.NoSuchActionHistoryException if a action history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.processmgt.model.ActionHistory[] findByPOID_PWID_PrevAndNext(
		long actionHistoryId, long processOrderId, long processWorkflowId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.processmgt.NoSuchActionHistoryException;

	/**
	* Removes all the action histories where processOrderId = &#63; and processWorkflowId = &#63; from the database.
	*
	* @param processOrderId the process order ID
	* @param processWorkflowId the process workflow ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPOID_PWID(long processOrderId, long processWorkflowId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of action histories where processOrderId = &#63; and processWorkflowId = &#63;.
	*
	* @param processOrderId the process order ID
	* @param processWorkflowId the process workflow ID
	* @return the number of matching action histories
	* @throws SystemException if a system exception occurred
	*/
	public int countByPOID_PWID(long processOrderId, long processWorkflowId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the action histories where groupId = &#63; and processOrderId = &#63;.
	*
	* @param groupId the group ID
	* @param processOrderId the process order ID
	* @return the matching action histories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.processmgt.model.ActionHistory> findByF_ProcessOrderId(
		long groupId, long processOrderId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the action histories where groupId = &#63; and processOrderId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.processmgt.model.impl.ActionHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param processOrderId the process order ID
	* @param start the lower bound of the range of action histories
	* @param end the upper bound of the range of action histories (not inclusive)
	* @return the range of matching action histories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.processmgt.model.ActionHistory> findByF_ProcessOrderId(
		long groupId, long processOrderId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the action histories where groupId = &#63; and processOrderId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.processmgt.model.impl.ActionHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param processOrderId the process order ID
	* @param start the lower bound of the range of action histories
	* @param end the upper bound of the range of action histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching action histories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.processmgt.model.ActionHistory> findByF_ProcessOrderId(
		long groupId, long processOrderId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first action history in the ordered set where groupId = &#63; and processOrderId = &#63;.
	*
	* @param groupId the group ID
	* @param processOrderId the process order ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching action history
	* @throws org.opencps.processmgt.NoSuchActionHistoryException if a matching action history could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.processmgt.model.ActionHistory findByF_ProcessOrderId_First(
		long groupId, long processOrderId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.processmgt.NoSuchActionHistoryException;

	/**
	* Returns the first action history in the ordered set where groupId = &#63; and processOrderId = &#63;.
	*
	* @param groupId the group ID
	* @param processOrderId the process order ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching action history, or <code>null</code> if a matching action history could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.processmgt.model.ActionHistory fetchByF_ProcessOrderId_First(
		long groupId, long processOrderId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last action history in the ordered set where groupId = &#63; and processOrderId = &#63;.
	*
	* @param groupId the group ID
	* @param processOrderId the process order ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching action history
	* @throws org.opencps.processmgt.NoSuchActionHistoryException if a matching action history could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.processmgt.model.ActionHistory findByF_ProcessOrderId_Last(
		long groupId, long processOrderId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.processmgt.NoSuchActionHistoryException;

	/**
	* Returns the last action history in the ordered set where groupId = &#63; and processOrderId = &#63;.
	*
	* @param groupId the group ID
	* @param processOrderId the process order ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching action history, or <code>null</code> if a matching action history could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.processmgt.model.ActionHistory fetchByF_ProcessOrderId_Last(
		long groupId, long processOrderId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the action histories before and after the current action history in the ordered set where groupId = &#63; and processOrderId = &#63;.
	*
	* @param actionHistoryId the primary key of the current action history
	* @param groupId the group ID
	* @param processOrderId the process order ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next action history
	* @throws org.opencps.processmgt.NoSuchActionHistoryException if a action history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.processmgt.model.ActionHistory[] findByF_ProcessOrderId_PrevAndNext(
		long actionHistoryId, long groupId, long processOrderId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.processmgt.NoSuchActionHistoryException;

	/**
	* Removes all the action histories where groupId = &#63; and processOrderId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param processOrderId the process order ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByF_ProcessOrderId(long groupId, long processOrderId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of action histories where groupId = &#63; and processOrderId = &#63;.
	*
	* @param groupId the group ID
	* @param processOrderId the process order ID
	* @return the number of matching action histories
	* @throws SystemException if a system exception occurred
	*/
	public int countByF_ProcessOrderId(long groupId, long processOrderId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the action histories where processOrderId = &#63;.
	*
	* @param processOrderId the process order ID
	* @return the matching action histories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.processmgt.model.ActionHistory> findByProcessOrderId(
		long processOrderId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the action histories where processOrderId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.processmgt.model.impl.ActionHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param processOrderId the process order ID
	* @param start the lower bound of the range of action histories
	* @param end the upper bound of the range of action histories (not inclusive)
	* @return the range of matching action histories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.processmgt.model.ActionHistory> findByProcessOrderId(
		long processOrderId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the action histories where processOrderId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.processmgt.model.impl.ActionHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param processOrderId the process order ID
	* @param start the lower bound of the range of action histories
	* @param end the upper bound of the range of action histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching action histories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.processmgt.model.ActionHistory> findByProcessOrderId(
		long processOrderId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first action history in the ordered set where processOrderId = &#63;.
	*
	* @param processOrderId the process order ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching action history
	* @throws org.opencps.processmgt.NoSuchActionHistoryException if a matching action history could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.processmgt.model.ActionHistory findByProcessOrderId_First(
		long processOrderId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.processmgt.NoSuchActionHistoryException;

	/**
	* Returns the first action history in the ordered set where processOrderId = &#63;.
	*
	* @param processOrderId the process order ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching action history, or <code>null</code> if a matching action history could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.processmgt.model.ActionHistory fetchByProcessOrderId_First(
		long processOrderId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last action history in the ordered set where processOrderId = &#63;.
	*
	* @param processOrderId the process order ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching action history
	* @throws org.opencps.processmgt.NoSuchActionHistoryException if a matching action history could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.processmgt.model.ActionHistory findByProcessOrderId_Last(
		long processOrderId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.processmgt.NoSuchActionHistoryException;

	/**
	* Returns the last action history in the ordered set where processOrderId = &#63;.
	*
	* @param processOrderId the process order ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching action history, or <code>null</code> if a matching action history could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.processmgt.model.ActionHistory fetchByProcessOrderId_Last(
		long processOrderId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the action histories before and after the current action history in the ordered set where processOrderId = &#63;.
	*
	* @param actionHistoryId the primary key of the current action history
	* @param processOrderId the process order ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next action history
	* @throws org.opencps.processmgt.NoSuchActionHistoryException if a action history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.processmgt.model.ActionHistory[] findByProcessOrderId_PrevAndNext(
		long actionHistoryId, long processOrderId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.processmgt.NoSuchActionHistoryException;

	/**
	* Removes all the action histories where processOrderId = &#63; from the database.
	*
	* @param processOrderId the process order ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByProcessOrderId(long processOrderId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of action histories where processOrderId = &#63;.
	*
	* @param processOrderId the process order ID
	* @return the number of matching action histories
	* @throws SystemException if a system exception occurred
	*/
	public int countByProcessOrderId(long processOrderId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the action history in the entity cache if it is enabled.
	*
	* @param actionHistory the action history
	*/
	public void cacheResult(
		org.opencps.processmgt.model.ActionHistory actionHistory);

	/**
	* Caches the action histories in the entity cache if it is enabled.
	*
	* @param actionHistories the action histories
	*/
	public void cacheResult(
		java.util.List<org.opencps.processmgt.model.ActionHistory> actionHistories);

	/**
	* Creates a new action history with the primary key. Does not add the action history to the database.
	*
	* @param actionHistoryId the primary key for the new action history
	* @return the new action history
	*/
	public org.opencps.processmgt.model.ActionHistory create(
		long actionHistoryId);

	/**
	* Removes the action history with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param actionHistoryId the primary key of the action history
	* @return the action history that was removed
	* @throws org.opencps.processmgt.NoSuchActionHistoryException if a action history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.processmgt.model.ActionHistory remove(
		long actionHistoryId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.processmgt.NoSuchActionHistoryException;

	public org.opencps.processmgt.model.ActionHistory updateImpl(
		org.opencps.processmgt.model.ActionHistory actionHistory)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the action history with the primary key or throws a {@link org.opencps.processmgt.NoSuchActionHistoryException} if it could not be found.
	*
	* @param actionHistoryId the primary key of the action history
	* @return the action history
	* @throws org.opencps.processmgt.NoSuchActionHistoryException if a action history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.processmgt.model.ActionHistory findByPrimaryKey(
		long actionHistoryId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.processmgt.NoSuchActionHistoryException;

	/**
	* Returns the action history with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param actionHistoryId the primary key of the action history
	* @return the action history, or <code>null</code> if a action history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.processmgt.model.ActionHistory fetchByPrimaryKey(
		long actionHistoryId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the action histories.
	*
	* @return the action histories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.processmgt.model.ActionHistory> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the action histories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.processmgt.model.impl.ActionHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of action histories
	* @param end the upper bound of the range of action histories (not inclusive)
	* @return the range of action histories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.processmgt.model.ActionHistory> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the action histories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.processmgt.model.impl.ActionHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of action histories
	* @param end the upper bound of the range of action histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of action histories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.processmgt.model.ActionHistory> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the action histories from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of action histories.
	*
	* @return the number of action histories
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}