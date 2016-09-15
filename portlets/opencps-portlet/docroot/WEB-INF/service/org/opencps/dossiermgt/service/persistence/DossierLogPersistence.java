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

package org.opencps.dossiermgt.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import org.opencps.dossiermgt.model.DossierLog;

/**
 * The persistence interface for the dossier log service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungnt
 * @see DossierLogPersistenceImpl
 * @see DossierLogUtil
 * @generated
 */
public interface DossierLogPersistence extends BasePersistence<DossierLog> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DossierLogUtil} to access the dossier log persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the dossier logs where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the matching dossier logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.DossierLog> findByDossierId(
		long dossierId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dossier logs where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of dossier logs
	* @param end the upper bound of the range of dossier logs (not inclusive)
	* @return the range of matching dossier logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.DossierLog> findByDossierId(
		long dossierId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dossier logs where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of dossier logs
	* @param end the upper bound of the range of dossier logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.DossierLog> findByDossierId(
		long dossierId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dossier log in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier log
	* @throws org.opencps.dossiermgt.NoSuchDossierLogException if a matching dossier log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.DossierLog findByDossierId_First(
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierLogException;

	/**
	* Returns the first dossier log in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier log, or <code>null</code> if a matching dossier log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.DossierLog fetchByDossierId_First(
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dossier log in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier log
	* @throws org.opencps.dossiermgt.NoSuchDossierLogException if a matching dossier log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.DossierLog findByDossierId_Last(
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierLogException;

	/**
	* Returns the last dossier log in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier log, or <code>null</code> if a matching dossier log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.DossierLog fetchByDossierId_Last(
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossier logs before and after the current dossier log in the ordered set where dossierId = &#63;.
	*
	* @param dossierLogId the primary key of the current dossier log
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier log
	* @throws org.opencps.dossiermgt.NoSuchDossierLogException if a dossier log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.DossierLog[] findByDossierId_PrevAndNext(
		long dossierLogId, long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierLogException;

	/**
	* Removes all the dossier logs where dossierId = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDossierId(long dossierId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dossier logs where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the number of matching dossier logs
	* @throws SystemException if a system exception occurred
	*/
	public int countByDossierId(long dossierId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dossier logs where dossierId = &#63; and syncStatus = &#63;.
	*
	* @param dossierId the dossier ID
	* @param syncStatus the sync status
	* @return the matching dossier logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.DossierLog> findByDossierIdSync(
		long dossierId, int syncStatus)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dossier logs where dossierId = &#63; and syncStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param syncStatus the sync status
	* @param start the lower bound of the range of dossier logs
	* @param end the upper bound of the range of dossier logs (not inclusive)
	* @return the range of matching dossier logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.DossierLog> findByDossierIdSync(
		long dossierId, int syncStatus, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dossier logs where dossierId = &#63; and syncStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param syncStatus the sync status
	* @param start the lower bound of the range of dossier logs
	* @param end the upper bound of the range of dossier logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.DossierLog> findByDossierIdSync(
		long dossierId, int syncStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dossier log in the ordered set where dossierId = &#63; and syncStatus = &#63;.
	*
	* @param dossierId the dossier ID
	* @param syncStatus the sync status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier log
	* @throws org.opencps.dossiermgt.NoSuchDossierLogException if a matching dossier log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.DossierLog findByDossierIdSync_First(
		long dossierId, int syncStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierLogException;

	/**
	* Returns the first dossier log in the ordered set where dossierId = &#63; and syncStatus = &#63;.
	*
	* @param dossierId the dossier ID
	* @param syncStatus the sync status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier log, or <code>null</code> if a matching dossier log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.DossierLog fetchByDossierIdSync_First(
		long dossierId, int syncStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dossier log in the ordered set where dossierId = &#63; and syncStatus = &#63;.
	*
	* @param dossierId the dossier ID
	* @param syncStatus the sync status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier log
	* @throws org.opencps.dossiermgt.NoSuchDossierLogException if a matching dossier log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.DossierLog findByDossierIdSync_Last(
		long dossierId, int syncStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierLogException;

	/**
	* Returns the last dossier log in the ordered set where dossierId = &#63; and syncStatus = &#63;.
	*
	* @param dossierId the dossier ID
	* @param syncStatus the sync status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier log, or <code>null</code> if a matching dossier log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.DossierLog fetchByDossierIdSync_Last(
		long dossierId, int syncStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossier logs before and after the current dossier log in the ordered set where dossierId = &#63; and syncStatus = &#63;.
	*
	* @param dossierLogId the primary key of the current dossier log
	* @param dossierId the dossier ID
	* @param syncStatus the sync status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier log
	* @throws org.opencps.dossiermgt.NoSuchDossierLogException if a dossier log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.DossierLog[] findByDossierIdSync_PrevAndNext(
		long dossierLogId, long dossierId, int syncStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierLogException;

	/**
	* Returns all the dossier logs where dossierId = &#63; and syncStatus = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param syncStatuses the sync statuses
	* @return the matching dossier logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.DossierLog> findByDossierIdSync(
		long dossierId, int[] syncStatuses)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dossier logs where dossierId = &#63; and syncStatus = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param syncStatuses the sync statuses
	* @param start the lower bound of the range of dossier logs
	* @param end the upper bound of the range of dossier logs (not inclusive)
	* @return the range of matching dossier logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.DossierLog> findByDossierIdSync(
		long dossierId, int[] syncStatuses, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dossier logs where dossierId = &#63; and syncStatus = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param syncStatuses the sync statuses
	* @param start the lower bound of the range of dossier logs
	* @param end the upper bound of the range of dossier logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.DossierLog> findByDossierIdSync(
		long dossierId, int[] syncStatuses, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dossier logs where dossierId = &#63; and syncStatus = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param syncStatus the sync status
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDossierIdSync(long dossierId, int syncStatus)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dossier logs where dossierId = &#63; and syncStatus = &#63;.
	*
	* @param dossierId the dossier ID
	* @param syncStatus the sync status
	* @return the number of matching dossier logs
	* @throws SystemException if a system exception occurred
	*/
	public int countByDossierIdSync(long dossierId, int syncStatus)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dossier logs where dossierId = &#63; and syncStatus = any &#63;.
	*
	* @param dossierId the dossier ID
	* @param syncStatuses the sync statuses
	* @return the number of matching dossier logs
	* @throws SystemException if a system exception occurred
	*/
	public int countByDossierIdSync(long dossierId, int[] syncStatuses)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dossier logs where dossierId = &#63; and requestCommand = &#63;.
	*
	* @param dossierId the dossier ID
	* @param requestCommand the request command
	* @return the matching dossier logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.DossierLog> findByD_RC(
		long dossierId, java.lang.String requestCommand)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dossier logs where dossierId = &#63; and requestCommand = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param requestCommand the request command
	* @param start the lower bound of the range of dossier logs
	* @param end the upper bound of the range of dossier logs (not inclusive)
	* @return the range of matching dossier logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.DossierLog> findByD_RC(
		long dossierId, java.lang.String requestCommand, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dossier logs where dossierId = &#63; and requestCommand = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param requestCommand the request command
	* @param start the lower bound of the range of dossier logs
	* @param end the upper bound of the range of dossier logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.DossierLog> findByD_RC(
		long dossierId, java.lang.String requestCommand, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dossier log in the ordered set where dossierId = &#63; and requestCommand = &#63;.
	*
	* @param dossierId the dossier ID
	* @param requestCommand the request command
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier log
	* @throws org.opencps.dossiermgt.NoSuchDossierLogException if a matching dossier log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.DossierLog findByD_RC_First(
		long dossierId, java.lang.String requestCommand,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierLogException;

	/**
	* Returns the first dossier log in the ordered set where dossierId = &#63; and requestCommand = &#63;.
	*
	* @param dossierId the dossier ID
	* @param requestCommand the request command
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier log, or <code>null</code> if a matching dossier log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.DossierLog fetchByD_RC_First(
		long dossierId, java.lang.String requestCommand,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dossier log in the ordered set where dossierId = &#63; and requestCommand = &#63;.
	*
	* @param dossierId the dossier ID
	* @param requestCommand the request command
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier log
	* @throws org.opencps.dossiermgt.NoSuchDossierLogException if a matching dossier log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.DossierLog findByD_RC_Last(
		long dossierId, java.lang.String requestCommand,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierLogException;

	/**
	* Returns the last dossier log in the ordered set where dossierId = &#63; and requestCommand = &#63;.
	*
	* @param dossierId the dossier ID
	* @param requestCommand the request command
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier log, or <code>null</code> if a matching dossier log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.DossierLog fetchByD_RC_Last(
		long dossierId, java.lang.String requestCommand,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossier logs before and after the current dossier log in the ordered set where dossierId = &#63; and requestCommand = &#63;.
	*
	* @param dossierLogId the primary key of the current dossier log
	* @param dossierId the dossier ID
	* @param requestCommand the request command
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier log
	* @throws org.opencps.dossiermgt.NoSuchDossierLogException if a dossier log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.DossierLog[] findByD_RC_PrevAndNext(
		long dossierLogId, long dossierId, java.lang.String requestCommand,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierLogException;

	/**
	* Removes all the dossier logs where dossierId = &#63; and requestCommand = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param requestCommand the request command
	* @throws SystemException if a system exception occurred
	*/
	public void removeByD_RC(long dossierId, java.lang.String requestCommand)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dossier logs where dossierId = &#63; and requestCommand = &#63;.
	*
	* @param dossierId the dossier ID
	* @param requestCommand the request command
	* @return the number of matching dossier logs
	* @throws SystemException if a system exception occurred
	*/
	public int countByD_RC(long dossierId, java.lang.String requestCommand)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dossier logs where dossierId = &#63; and actor = &#63;.
	*
	* @param dossierId the dossier ID
	* @param actor the actor
	* @return the matching dossier logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.DossierLog> findByD_A(
		long dossierId, int actor)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dossier logs where dossierId = &#63; and actor = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param actor the actor
	* @param start the lower bound of the range of dossier logs
	* @param end the upper bound of the range of dossier logs (not inclusive)
	* @return the range of matching dossier logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.DossierLog> findByD_A(
		long dossierId, int actor, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dossier logs where dossierId = &#63; and actor = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param actor the actor
	* @param start the lower bound of the range of dossier logs
	* @param end the upper bound of the range of dossier logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.DossierLog> findByD_A(
		long dossierId, int actor, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dossier log in the ordered set where dossierId = &#63; and actor = &#63;.
	*
	* @param dossierId the dossier ID
	* @param actor the actor
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier log
	* @throws org.opencps.dossiermgt.NoSuchDossierLogException if a matching dossier log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.DossierLog findByD_A_First(
		long dossierId, int actor,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierLogException;

	/**
	* Returns the first dossier log in the ordered set where dossierId = &#63; and actor = &#63;.
	*
	* @param dossierId the dossier ID
	* @param actor the actor
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier log, or <code>null</code> if a matching dossier log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.DossierLog fetchByD_A_First(
		long dossierId, int actor,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dossier log in the ordered set where dossierId = &#63; and actor = &#63;.
	*
	* @param dossierId the dossier ID
	* @param actor the actor
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier log
	* @throws org.opencps.dossiermgt.NoSuchDossierLogException if a matching dossier log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.DossierLog findByD_A_Last(
		long dossierId, int actor,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierLogException;

	/**
	* Returns the last dossier log in the ordered set where dossierId = &#63; and actor = &#63;.
	*
	* @param dossierId the dossier ID
	* @param actor the actor
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier log, or <code>null</code> if a matching dossier log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.DossierLog fetchByD_A_Last(
		long dossierId, int actor,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossier logs before and after the current dossier log in the ordered set where dossierId = &#63; and actor = &#63;.
	*
	* @param dossierLogId the primary key of the current dossier log
	* @param dossierId the dossier ID
	* @param actor the actor
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier log
	* @throws org.opencps.dossiermgt.NoSuchDossierLogException if a dossier log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.DossierLog[] findByD_A_PrevAndNext(
		long dossierLogId, long dossierId, int actor,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierLogException;

	/**
	* Removes all the dossier logs where dossierId = &#63; and actor = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param actor the actor
	* @throws SystemException if a system exception occurred
	*/
	public void removeByD_A(long dossierId, int actor)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dossier logs where dossierId = &#63; and actor = &#63;.
	*
	* @param dossierId the dossier ID
	* @param actor the actor
	* @return the number of matching dossier logs
	* @throws SystemException if a system exception occurred
	*/
	public int countByD_A(long dossierId, int actor)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the dossier log in the entity cache if it is enabled.
	*
	* @param dossierLog the dossier log
	*/
	public void cacheResult(org.opencps.dossiermgt.model.DossierLog dossierLog);

	/**
	* Caches the dossier logs in the entity cache if it is enabled.
	*
	* @param dossierLogs the dossier logs
	*/
	public void cacheResult(
		java.util.List<org.opencps.dossiermgt.model.DossierLog> dossierLogs);

	/**
	* Creates a new dossier log with the primary key. Does not add the dossier log to the database.
	*
	* @param dossierLogId the primary key for the new dossier log
	* @return the new dossier log
	*/
	public org.opencps.dossiermgt.model.DossierLog create(long dossierLogId);

	/**
	* Removes the dossier log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierLogId the primary key of the dossier log
	* @return the dossier log that was removed
	* @throws org.opencps.dossiermgt.NoSuchDossierLogException if a dossier log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.DossierLog remove(long dossierLogId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierLogException;

	public org.opencps.dossiermgt.model.DossierLog updateImpl(
		org.opencps.dossiermgt.model.DossierLog dossierLog)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossier log with the primary key or throws a {@link org.opencps.dossiermgt.NoSuchDossierLogException} if it could not be found.
	*
	* @param dossierLogId the primary key of the dossier log
	* @return the dossier log
	* @throws org.opencps.dossiermgt.NoSuchDossierLogException if a dossier log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.DossierLog findByPrimaryKey(
		long dossierLogId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierLogException;

	/**
	* Returns the dossier log with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param dossierLogId the primary key of the dossier log
	* @return the dossier log, or <code>null</code> if a dossier log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.DossierLog fetchByPrimaryKey(
		long dossierLogId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dossier logs.
	*
	* @return the dossier logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.DossierLog> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dossier logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier logs
	* @param end the upper bound of the range of dossier logs (not inclusive)
	* @return the range of dossier logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.DossierLog> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dossier logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier logs
	* @param end the upper bound of the range of dossier logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dossier logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.DossierLog> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dossier logs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dossier logs.
	*
	* @return the number of dossier logs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}