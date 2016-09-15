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

import org.opencps.dossiermgt.model.Dossier;

/**
 * The persistence interface for the dossier service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungnt
 * @see DossierPersistenceImpl
 * @see DossierUtil
 * @generated
 */
public interface DossierPersistence extends BasePersistence<Dossier> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DossierUtil} to access the dossier persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the dossiers where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.Dossier> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dossiers where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @return the range of matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.Dossier> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dossiers where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.Dossier> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dossier in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier
	* @throws org.opencps.dossiermgt.NoSuchDossierException if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.Dossier findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException;

	/**
	* Returns the first dossier in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier, or <code>null</code> if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.Dossier fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dossier in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier
	* @throws org.opencps.dossiermgt.NoSuchDossierException if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.Dossier findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException;

	/**
	* Returns the last dossier in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier, or <code>null</code> if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.Dossier fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossiers before and after the current dossier in the ordered set where groupId = &#63;.
	*
	* @param dossierId the primary key of the current dossier
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier
	* @throws org.opencps.dossiermgt.NoSuchDossierException if a dossier with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.Dossier[] findByGroupId_PrevAndNext(
		long dossierId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException;

	/**
	* Returns all the dossiers that the user has permission to view where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching dossiers that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.Dossier> filterFindByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dossiers that the user has permission to view where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @return the range of matching dossiers that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.Dossier> filterFindByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dossiers that the user has permissions to view where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossiers that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.Dossier> filterFindByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossiers before and after the current dossier in the ordered set of dossiers that the user has permission to view where groupId = &#63;.
	*
	* @param dossierId the primary key of the current dossier
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier
	* @throws org.opencps.dossiermgt.NoSuchDossierException if a dossier with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.Dossier[] filterFindByGroupId_PrevAndNext(
		long dossierId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException;

	/**
	* Removes all the dossiers where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dossiers where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dossiers that the user has permission to view where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching dossiers that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dossiers where serviceInfoId = &#63;.
	*
	* @param serviceInfoId the service info ID
	* @return the matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.Dossier> findByServiceInfoId(
		long serviceInfoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dossiers where serviceInfoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param serviceInfoId the service info ID
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @return the range of matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.Dossier> findByServiceInfoId(
		long serviceInfoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dossiers where serviceInfoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param serviceInfoId the service info ID
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.Dossier> findByServiceInfoId(
		long serviceInfoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dossier in the ordered set where serviceInfoId = &#63;.
	*
	* @param serviceInfoId the service info ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier
	* @throws org.opencps.dossiermgt.NoSuchDossierException if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.Dossier findByServiceInfoId_First(
		long serviceInfoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException;

	/**
	* Returns the first dossier in the ordered set where serviceInfoId = &#63;.
	*
	* @param serviceInfoId the service info ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier, or <code>null</code> if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.Dossier fetchByServiceInfoId_First(
		long serviceInfoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dossier in the ordered set where serviceInfoId = &#63;.
	*
	* @param serviceInfoId the service info ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier
	* @throws org.opencps.dossiermgt.NoSuchDossierException if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.Dossier findByServiceInfoId_Last(
		long serviceInfoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException;

	/**
	* Returns the last dossier in the ordered set where serviceInfoId = &#63;.
	*
	* @param serviceInfoId the service info ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier, or <code>null</code> if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.Dossier fetchByServiceInfoId_Last(
		long serviceInfoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossiers before and after the current dossier in the ordered set where serviceInfoId = &#63;.
	*
	* @param dossierId the primary key of the current dossier
	* @param serviceInfoId the service info ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier
	* @throws org.opencps.dossiermgt.NoSuchDossierException if a dossier with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.Dossier[] findByServiceInfoId_PrevAndNext(
		long dossierId, long serviceInfoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException;

	/**
	* Removes all the dossiers where serviceInfoId = &#63; from the database.
	*
	* @param serviceInfoId the service info ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByServiceInfoId(long serviceInfoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dossiers where serviceInfoId = &#63;.
	*
	* @param serviceInfoId the service info ID
	* @return the number of matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public int countByServiceInfoId(long serviceInfoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dossiers where groupId = &#63; and dossierStatus = &#63;.
	*
	* @param groupId the group ID
	* @param dossierStatus the dossier status
	* @return the matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.Dossier> findByG_DS(
		long groupId, java.lang.String dossierStatus)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dossiers where groupId = &#63; and dossierStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dossierStatus the dossier status
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @return the range of matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.Dossier> findByG_DS(
		long groupId, java.lang.String dossierStatus, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dossiers where groupId = &#63; and dossierStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dossierStatus the dossier status
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.Dossier> findByG_DS(
		long groupId, java.lang.String dossierStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dossier in the ordered set where groupId = &#63; and dossierStatus = &#63;.
	*
	* @param groupId the group ID
	* @param dossierStatus the dossier status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier
	* @throws org.opencps.dossiermgt.NoSuchDossierException if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.Dossier findByG_DS_First(long groupId,
		java.lang.String dossierStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException;

	/**
	* Returns the first dossier in the ordered set where groupId = &#63; and dossierStatus = &#63;.
	*
	* @param groupId the group ID
	* @param dossierStatus the dossier status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier, or <code>null</code> if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.Dossier fetchByG_DS_First(
		long groupId, java.lang.String dossierStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dossier in the ordered set where groupId = &#63; and dossierStatus = &#63;.
	*
	* @param groupId the group ID
	* @param dossierStatus the dossier status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier
	* @throws org.opencps.dossiermgt.NoSuchDossierException if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.Dossier findByG_DS_Last(long groupId,
		java.lang.String dossierStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException;

	/**
	* Returns the last dossier in the ordered set where groupId = &#63; and dossierStatus = &#63;.
	*
	* @param groupId the group ID
	* @param dossierStatus the dossier status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier, or <code>null</code> if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.Dossier fetchByG_DS_Last(long groupId,
		java.lang.String dossierStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossiers before and after the current dossier in the ordered set where groupId = &#63; and dossierStatus = &#63;.
	*
	* @param dossierId the primary key of the current dossier
	* @param groupId the group ID
	* @param dossierStatus the dossier status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier
	* @throws org.opencps.dossiermgt.NoSuchDossierException if a dossier with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.Dossier[] findByG_DS_PrevAndNext(
		long dossierId, long groupId, java.lang.String dossierStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException;

	/**
	* Returns all the dossiers that the user has permission to view where groupId = &#63; and dossierStatus = &#63;.
	*
	* @param groupId the group ID
	* @param dossierStatus the dossier status
	* @return the matching dossiers that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.Dossier> filterFindByG_DS(
		long groupId, java.lang.String dossierStatus)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dossiers that the user has permission to view where groupId = &#63; and dossierStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dossierStatus the dossier status
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @return the range of matching dossiers that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.Dossier> filterFindByG_DS(
		long groupId, java.lang.String dossierStatus, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dossiers that the user has permissions to view where groupId = &#63; and dossierStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dossierStatus the dossier status
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossiers that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.Dossier> filterFindByG_DS(
		long groupId, java.lang.String dossierStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossiers before and after the current dossier in the ordered set of dossiers that the user has permission to view where groupId = &#63; and dossierStatus = &#63;.
	*
	* @param dossierId the primary key of the current dossier
	* @param groupId the group ID
	* @param dossierStatus the dossier status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier
	* @throws org.opencps.dossiermgt.NoSuchDossierException if a dossier with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.Dossier[] filterFindByG_DS_PrevAndNext(
		long dossierId, long groupId, java.lang.String dossierStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException;

	/**
	* Removes all the dossiers where groupId = &#63; and dossierStatus = &#63; from the database.
	*
	* @param groupId the group ID
	* @param dossierStatus the dossier status
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_DS(long groupId, java.lang.String dossierStatus)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dossiers where groupId = &#63; and dossierStatus = &#63;.
	*
	* @param groupId the group ID
	* @param dossierStatus the dossier status
	* @return the number of matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_DS(long groupId, java.lang.String dossierStatus)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dossiers that the user has permission to view where groupId = &#63; and dossierStatus = &#63;.
	*
	* @param groupId the group ID
	* @param dossierStatus the dossier status
	* @return the number of matching dossiers that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByG_DS(long groupId, java.lang.String dossierStatus)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dossiers where groupId = &#63; and dossierStatus = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param dossierStatus the dossier status
	* @param userId the user ID
	* @return the matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.Dossier> findByG_DS_U(
		long groupId, java.lang.String dossierStatus, long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dossiers where groupId = &#63; and dossierStatus = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dossierStatus the dossier status
	* @param userId the user ID
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @return the range of matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.Dossier> findByG_DS_U(
		long groupId, java.lang.String dossierStatus, long userId, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dossiers where groupId = &#63; and dossierStatus = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dossierStatus the dossier status
	* @param userId the user ID
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.Dossier> findByG_DS_U(
		long groupId, java.lang.String dossierStatus, long userId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dossier in the ordered set where groupId = &#63; and dossierStatus = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param dossierStatus the dossier status
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier
	* @throws org.opencps.dossiermgt.NoSuchDossierException if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.Dossier findByG_DS_U_First(
		long groupId, java.lang.String dossierStatus, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException;

	/**
	* Returns the first dossier in the ordered set where groupId = &#63; and dossierStatus = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param dossierStatus the dossier status
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier, or <code>null</code> if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.Dossier fetchByG_DS_U_First(
		long groupId, java.lang.String dossierStatus, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dossier in the ordered set where groupId = &#63; and dossierStatus = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param dossierStatus the dossier status
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier
	* @throws org.opencps.dossiermgt.NoSuchDossierException if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.Dossier findByG_DS_U_Last(
		long groupId, java.lang.String dossierStatus, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException;

	/**
	* Returns the last dossier in the ordered set where groupId = &#63; and dossierStatus = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param dossierStatus the dossier status
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier, or <code>null</code> if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.Dossier fetchByG_DS_U_Last(
		long groupId, java.lang.String dossierStatus, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossiers before and after the current dossier in the ordered set where groupId = &#63; and dossierStatus = &#63; and userId = &#63;.
	*
	* @param dossierId the primary key of the current dossier
	* @param groupId the group ID
	* @param dossierStatus the dossier status
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier
	* @throws org.opencps.dossiermgt.NoSuchDossierException if a dossier with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.Dossier[] findByG_DS_U_PrevAndNext(
		long dossierId, long groupId, java.lang.String dossierStatus,
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException;

	/**
	* Returns all the dossiers that the user has permission to view where groupId = &#63; and dossierStatus = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param dossierStatus the dossier status
	* @param userId the user ID
	* @return the matching dossiers that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.Dossier> filterFindByG_DS_U(
		long groupId, java.lang.String dossierStatus, long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dossiers that the user has permission to view where groupId = &#63; and dossierStatus = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dossierStatus the dossier status
	* @param userId the user ID
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @return the range of matching dossiers that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.Dossier> filterFindByG_DS_U(
		long groupId, java.lang.String dossierStatus, long userId, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dossiers that the user has permissions to view where groupId = &#63; and dossierStatus = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dossierStatus the dossier status
	* @param userId the user ID
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossiers that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.Dossier> filterFindByG_DS_U(
		long groupId, java.lang.String dossierStatus, long userId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossiers before and after the current dossier in the ordered set of dossiers that the user has permission to view where groupId = &#63; and dossierStatus = &#63; and userId = &#63;.
	*
	* @param dossierId the primary key of the current dossier
	* @param groupId the group ID
	* @param dossierStatus the dossier status
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier
	* @throws org.opencps.dossiermgt.NoSuchDossierException if a dossier with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.Dossier[] filterFindByG_DS_U_PrevAndNext(
		long dossierId, long groupId, java.lang.String dossierStatus,
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException;

	/**
	* Removes all the dossiers where groupId = &#63; and dossierStatus = &#63; and userId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param dossierStatus the dossier status
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_DS_U(long groupId, java.lang.String dossierStatus,
		long userId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dossiers where groupId = &#63; and dossierStatus = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param dossierStatus the dossier status
	* @param userId the user ID
	* @return the number of matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_DS_U(long groupId, java.lang.String dossierStatus,
		long userId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dossiers that the user has permission to view where groupId = &#63; and dossierStatus = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param dossierStatus the dossier status
	* @param userId the user ID
	* @return the number of matching dossiers that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByG_DS_U(long groupId,
		java.lang.String dossierStatus, long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossier where receptionNo = &#63; or throws a {@link org.opencps.dossiermgt.NoSuchDossierException} if it could not be found.
	*
	* @param receptionNo the reception no
	* @return the matching dossier
	* @throws org.opencps.dossiermgt.NoSuchDossierException if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.Dossier findByReceptionNo(
		java.lang.String receptionNo)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException;

	/**
	* Returns the dossier where receptionNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param receptionNo the reception no
	* @return the matching dossier, or <code>null</code> if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.Dossier fetchByReceptionNo(
		java.lang.String receptionNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossier where receptionNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param receptionNo the reception no
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dossier, or <code>null</code> if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.Dossier fetchByReceptionNo(
		java.lang.String receptionNo, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the dossier where receptionNo = &#63; from the database.
	*
	* @param receptionNo the reception no
	* @return the dossier that was removed
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.Dossier removeByReceptionNo(
		java.lang.String receptionNo)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException;

	/**
	* Returns the number of dossiers where receptionNo = &#63;.
	*
	* @param receptionNo the reception no
	* @return the number of matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public int countByReceptionNo(java.lang.String receptionNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dossiers where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @return the matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.Dossier> findByG_U(
		long groupId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dossiers where groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @return the range of matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.Dossier> findByG_U(
		long groupId, long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dossiers where groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.Dossier> findByG_U(
		long groupId, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dossier in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier
	* @throws org.opencps.dossiermgt.NoSuchDossierException if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.Dossier findByG_U_First(long groupId,
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException;

	/**
	* Returns the first dossier in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier, or <code>null</code> if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.Dossier fetchByG_U_First(long groupId,
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dossier in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier
	* @throws org.opencps.dossiermgt.NoSuchDossierException if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.Dossier findByG_U_Last(long groupId,
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException;

	/**
	* Returns the last dossier in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier, or <code>null</code> if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.Dossier fetchByG_U_Last(long groupId,
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossiers before and after the current dossier in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param dossierId the primary key of the current dossier
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier
	* @throws org.opencps.dossiermgt.NoSuchDossierException if a dossier with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.Dossier[] findByG_U_PrevAndNext(
		long dossierId, long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException;

	/**
	* Returns all the dossiers that the user has permission to view where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @return the matching dossiers that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.Dossier> filterFindByG_U(
		long groupId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dossiers that the user has permission to view where groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @return the range of matching dossiers that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.Dossier> filterFindByG_U(
		long groupId, long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dossiers that the user has permissions to view where groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossiers that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.Dossier> filterFindByG_U(
		long groupId, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossiers before and after the current dossier in the ordered set of dossiers that the user has permission to view where groupId = &#63; and userId = &#63;.
	*
	* @param dossierId the primary key of the current dossier
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier
	* @throws org.opencps.dossiermgt.NoSuchDossierException if a dossier with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.Dossier[] filterFindByG_U_PrevAndNext(
		long dossierId, long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException;

	/**
	* Removes all the dossiers where groupId = &#63; and userId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_U(long groupId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dossiers where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @return the number of matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_U(long groupId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dossiers that the user has permission to view where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @return the number of matching dossiers that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByG_U(long groupId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dossiers where delayStatus = &#63;.
	*
	* @param delayStatus the delay status
	* @return the matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.Dossier> findByDelayStatus(
		int delayStatus)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dossiers where delayStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param delayStatus the delay status
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @return the range of matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.Dossier> findByDelayStatus(
		int delayStatus, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dossiers where delayStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param delayStatus the delay status
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.Dossier> findByDelayStatus(
		int delayStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dossier in the ordered set where delayStatus = &#63;.
	*
	* @param delayStatus the delay status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier
	* @throws org.opencps.dossiermgt.NoSuchDossierException if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.Dossier findByDelayStatus_First(
		int delayStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException;

	/**
	* Returns the first dossier in the ordered set where delayStatus = &#63;.
	*
	* @param delayStatus the delay status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier, or <code>null</code> if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.Dossier fetchByDelayStatus_First(
		int delayStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dossier in the ordered set where delayStatus = &#63;.
	*
	* @param delayStatus the delay status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier
	* @throws org.opencps.dossiermgt.NoSuchDossierException if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.Dossier findByDelayStatus_Last(
		int delayStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException;

	/**
	* Returns the last dossier in the ordered set where delayStatus = &#63;.
	*
	* @param delayStatus the delay status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier, or <code>null</code> if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.Dossier fetchByDelayStatus_Last(
		int delayStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossiers before and after the current dossier in the ordered set where delayStatus = &#63;.
	*
	* @param dossierId the primary key of the current dossier
	* @param delayStatus the delay status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier
	* @throws org.opencps.dossiermgt.NoSuchDossierException if a dossier with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.Dossier[] findByDelayStatus_PrevAndNext(
		long dossierId, int delayStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException;

	/**
	* Removes all the dossiers where delayStatus = &#63; from the database.
	*
	* @param delayStatus the delay status
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDelayStatus(int delayStatus)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dossiers where delayStatus = &#63;.
	*
	* @param delayStatus the delay status
	* @return the number of matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public int countByDelayStatus(int delayStatus)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dossiers where delayStatus = &#63; and dossierStatus &ne; &#63;.
	*
	* @param delayStatus the delay status
	* @param dossierStatus the dossier status
	* @return the matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.Dossier> findByDelayStatusAndNotDossierStatus(
		int delayStatus, java.lang.String dossierStatus)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dossiers where delayStatus = &#63; and dossierStatus &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param delayStatus the delay status
	* @param dossierStatus the dossier status
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @return the range of matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.Dossier> findByDelayStatusAndNotDossierStatus(
		int delayStatus, java.lang.String dossierStatus, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dossiers where delayStatus = &#63; and dossierStatus &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param delayStatus the delay status
	* @param dossierStatus the dossier status
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.Dossier> findByDelayStatusAndNotDossierStatus(
		int delayStatus, java.lang.String dossierStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dossier in the ordered set where delayStatus = &#63; and dossierStatus &ne; &#63;.
	*
	* @param delayStatus the delay status
	* @param dossierStatus the dossier status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier
	* @throws org.opencps.dossiermgt.NoSuchDossierException if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.Dossier findByDelayStatusAndNotDossierStatus_First(
		int delayStatus, java.lang.String dossierStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException;

	/**
	* Returns the first dossier in the ordered set where delayStatus = &#63; and dossierStatus &ne; &#63;.
	*
	* @param delayStatus the delay status
	* @param dossierStatus the dossier status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier, or <code>null</code> if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.Dossier fetchByDelayStatusAndNotDossierStatus_First(
		int delayStatus, java.lang.String dossierStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dossier in the ordered set where delayStatus = &#63; and dossierStatus &ne; &#63;.
	*
	* @param delayStatus the delay status
	* @param dossierStatus the dossier status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier
	* @throws org.opencps.dossiermgt.NoSuchDossierException if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.Dossier findByDelayStatusAndNotDossierStatus_Last(
		int delayStatus, java.lang.String dossierStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException;

	/**
	* Returns the last dossier in the ordered set where delayStatus = &#63; and dossierStatus &ne; &#63;.
	*
	* @param delayStatus the delay status
	* @param dossierStatus the dossier status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier, or <code>null</code> if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.Dossier fetchByDelayStatusAndNotDossierStatus_Last(
		int delayStatus, java.lang.String dossierStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossiers before and after the current dossier in the ordered set where delayStatus = &#63; and dossierStatus &ne; &#63;.
	*
	* @param dossierId the primary key of the current dossier
	* @param delayStatus the delay status
	* @param dossierStatus the dossier status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier
	* @throws org.opencps.dossiermgt.NoSuchDossierException if a dossier with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.Dossier[] findByDelayStatusAndNotDossierStatus_PrevAndNext(
		long dossierId, int delayStatus, java.lang.String dossierStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException;

	/**
	* Returns all the dossiers where delayStatus = all &#63; and dossierStatus &ne; all &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param delayStatuses the delay statuses
	* @param dossierStatuses the dossier statuses
	* @return the matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.Dossier> findByDelayStatusAndNotDossierStatus(
		int[] delayStatuses, java.lang.String[] dossierStatuses)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dossiers where delayStatus = all &#63; and dossierStatus &ne; all &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param delayStatuses the delay statuses
	* @param dossierStatuses the dossier statuses
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @return the range of matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.Dossier> findByDelayStatusAndNotDossierStatus(
		int[] delayStatuses, java.lang.String[] dossierStatuses, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dossiers where delayStatus = all &#63; and dossierStatus &ne; all &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param delayStatuses the delay statuses
	* @param dossierStatuses the dossier statuses
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.Dossier> findByDelayStatusAndNotDossierStatus(
		int[] delayStatuses, java.lang.String[] dossierStatuses, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dossiers where delayStatus = &#63; and dossierStatus &ne; &#63; from the database.
	*
	* @param delayStatus the delay status
	* @param dossierStatus the dossier status
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDelayStatusAndNotDossierStatus(int delayStatus,
		java.lang.String dossierStatus)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dossiers where delayStatus = &#63; and dossierStatus &ne; &#63;.
	*
	* @param delayStatus the delay status
	* @param dossierStatus the dossier status
	* @return the number of matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public int countByDelayStatusAndNotDossierStatus(int delayStatus,
		java.lang.String dossierStatus)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dossiers where delayStatus = all &#63; and dossierStatus &ne; all &#63;.
	*
	* @param delayStatuses the delay statuses
	* @param dossierStatuses the dossier statuses
	* @return the number of matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public int countByDelayStatusAndNotDossierStatus(int[] delayStatuses,
		java.lang.String[] dossierStatuses)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossier where oid = &#63; or throws a {@link org.opencps.dossiermgt.NoSuchDossierException} if it could not be found.
	*
	* @param oid the oid
	* @return the matching dossier
	* @throws org.opencps.dossiermgt.NoSuchDossierException if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.Dossier findByOID(java.lang.String oid)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException;

	/**
	* Returns the dossier where oid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param oid the oid
	* @return the matching dossier, or <code>null</code> if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.Dossier fetchByOID(java.lang.String oid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossier where oid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param oid the oid
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dossier, or <code>null</code> if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.Dossier fetchByOID(
		java.lang.String oid, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the dossier where oid = &#63; from the database.
	*
	* @param oid the oid
	* @return the dossier that was removed
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.Dossier removeByOID(
		java.lang.String oid)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException;

	/**
	* Returns the number of dossiers where oid = &#63;.
	*
	* @param oid the oid
	* @return the number of matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public int countByOID(java.lang.String oid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the dossier in the entity cache if it is enabled.
	*
	* @param dossier the dossier
	*/
	public void cacheResult(org.opencps.dossiermgt.model.Dossier dossier);

	/**
	* Caches the dossiers in the entity cache if it is enabled.
	*
	* @param dossiers the dossiers
	*/
	public void cacheResult(
		java.util.List<org.opencps.dossiermgt.model.Dossier> dossiers);

	/**
	* Creates a new dossier with the primary key. Does not add the dossier to the database.
	*
	* @param dossierId the primary key for the new dossier
	* @return the new dossier
	*/
	public org.opencps.dossiermgt.model.Dossier create(long dossierId);

	/**
	* Removes the dossier with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierId the primary key of the dossier
	* @return the dossier that was removed
	* @throws org.opencps.dossiermgt.NoSuchDossierException if a dossier with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.Dossier remove(long dossierId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException;

	public org.opencps.dossiermgt.model.Dossier updateImpl(
		org.opencps.dossiermgt.model.Dossier dossier)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossier with the primary key or throws a {@link org.opencps.dossiermgt.NoSuchDossierException} if it could not be found.
	*
	* @param dossierId the primary key of the dossier
	* @return the dossier
	* @throws org.opencps.dossiermgt.NoSuchDossierException if a dossier with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.Dossier findByPrimaryKey(long dossierId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException;

	/**
	* Returns the dossier with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param dossierId the primary key of the dossier
	* @return the dossier, or <code>null</code> if a dossier with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.opencps.dossiermgt.model.Dossier fetchByPrimaryKey(
		long dossierId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dossiers.
	*
	* @return the dossiers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.Dossier> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dossiers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @return the range of dossiers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.Dossier> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dossiers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dossiers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.opencps.dossiermgt.model.Dossier> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dossiers from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dossiers.
	*
	* @return the number of dossiers
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}