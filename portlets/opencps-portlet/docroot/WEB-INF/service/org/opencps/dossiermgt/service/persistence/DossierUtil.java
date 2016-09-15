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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import org.opencps.dossiermgt.model.Dossier;

import java.util.List;

/**
 * The persistence utility for the dossier service. This utility wraps {@link DossierPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungnt
 * @see DossierPersistence
 * @see DossierPersistenceImpl
 * @generated
 */
public class DossierUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Dossier dossier) {
		getPersistence().clearCache(dossier);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Dossier> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Dossier> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Dossier> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Dossier update(Dossier dossier) throws SystemException {
		return getPersistence().update(dossier);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Dossier update(Dossier dossier, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(dossier, serviceContext);
	}

	/**
	* Returns all the dossiers where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

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
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

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
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first dossier in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier
	* @throws org.opencps.dossiermgt.NoSuchDossierException if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.Dossier findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first dossier in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier, or <code>null</code> if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.Dossier fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last dossier in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier
	* @throws org.opencps.dossiermgt.NoSuchDossierException if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.Dossier findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last dossier in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier, or <code>null</code> if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.Dossier fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

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
	public static org.opencps.dossiermgt.model.Dossier[] findByGroupId_PrevAndNext(
		long dossierId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(dossierId, groupId,
			orderByComparator);
	}

	/**
	* Returns all the dossiers that the user has permission to view where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching dossiers that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> filterFindByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByGroupId(groupId);
	}

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
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> filterFindByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByGroupId(groupId, start, end);
	}

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
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> filterFindByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByGroupId(groupId, start, end, orderByComparator);
	}

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
	public static org.opencps.dossiermgt.model.Dossier[] filterFindByGroupId_PrevAndNext(
		long dossierId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException {
		return getPersistence()
				   .filterFindByGroupId_PrevAndNext(dossierId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the dossiers where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of dossiers where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns the number of dossiers that the user has permission to view where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching dossiers that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static int filterCountByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterCountByGroupId(groupId);
	}

	/**
	* Returns all the dossiers where serviceInfoId = &#63;.
	*
	* @param serviceInfoId the service info ID
	* @return the matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> findByServiceInfoId(
		long serviceInfoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByServiceInfoId(serviceInfoId);
	}

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
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> findByServiceInfoId(
		long serviceInfoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByServiceInfoId(serviceInfoId, start, end);
	}

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
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> findByServiceInfoId(
		long serviceInfoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByServiceInfoId(serviceInfoId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dossier in the ordered set where serviceInfoId = &#63;.
	*
	* @param serviceInfoId the service info ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier
	* @throws org.opencps.dossiermgt.NoSuchDossierException if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.Dossier findByServiceInfoId_First(
		long serviceInfoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException {
		return getPersistence()
				   .findByServiceInfoId_First(serviceInfoId, orderByComparator);
	}

	/**
	* Returns the first dossier in the ordered set where serviceInfoId = &#63;.
	*
	* @param serviceInfoId the service info ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier, or <code>null</code> if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.Dossier fetchByServiceInfoId_First(
		long serviceInfoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByServiceInfoId_First(serviceInfoId, orderByComparator);
	}

	/**
	* Returns the last dossier in the ordered set where serviceInfoId = &#63;.
	*
	* @param serviceInfoId the service info ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier
	* @throws org.opencps.dossiermgt.NoSuchDossierException if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.Dossier findByServiceInfoId_Last(
		long serviceInfoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException {
		return getPersistence()
				   .findByServiceInfoId_Last(serviceInfoId, orderByComparator);
	}

	/**
	* Returns the last dossier in the ordered set where serviceInfoId = &#63;.
	*
	* @param serviceInfoId the service info ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier, or <code>null</code> if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.Dossier fetchByServiceInfoId_Last(
		long serviceInfoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByServiceInfoId_Last(serviceInfoId, orderByComparator);
	}

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
	public static org.opencps.dossiermgt.model.Dossier[] findByServiceInfoId_PrevAndNext(
		long dossierId, long serviceInfoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException {
		return getPersistence()
				   .findByServiceInfoId_PrevAndNext(dossierId, serviceInfoId,
			orderByComparator);
	}

	/**
	* Removes all the dossiers where serviceInfoId = &#63; from the database.
	*
	* @param serviceInfoId the service info ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByServiceInfoId(long serviceInfoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByServiceInfoId(serviceInfoId);
	}

	/**
	* Returns the number of dossiers where serviceInfoId = &#63;.
	*
	* @param serviceInfoId the service info ID
	* @return the number of matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public static int countByServiceInfoId(long serviceInfoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByServiceInfoId(serviceInfoId);
	}

	/**
	* Returns all the dossiers where groupId = &#63; and dossierStatus = &#63;.
	*
	* @param groupId the group ID
	* @param dossierStatus the dossier status
	* @return the matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> findByG_DS(
		long groupId, java.lang.String dossierStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_DS(groupId, dossierStatus);
	}

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
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> findByG_DS(
		long groupId, java.lang.String dossierStatus, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_DS(groupId, dossierStatus, start, end);
	}

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
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> findByG_DS(
		long groupId, java.lang.String dossierStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_DS(groupId, dossierStatus, start, end,
			orderByComparator);
	}

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
	public static org.opencps.dossiermgt.model.Dossier findByG_DS_First(
		long groupId, java.lang.String dossierStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException {
		return getPersistence()
				   .findByG_DS_First(groupId, dossierStatus, orderByComparator);
	}

	/**
	* Returns the first dossier in the ordered set where groupId = &#63; and dossierStatus = &#63;.
	*
	* @param groupId the group ID
	* @param dossierStatus the dossier status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier, or <code>null</code> if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.Dossier fetchByG_DS_First(
		long groupId, java.lang.String dossierStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_DS_First(groupId, dossierStatus, orderByComparator);
	}

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
	public static org.opencps.dossiermgt.model.Dossier findByG_DS_Last(
		long groupId, java.lang.String dossierStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException {
		return getPersistence()
				   .findByG_DS_Last(groupId, dossierStatus, orderByComparator);
	}

	/**
	* Returns the last dossier in the ordered set where groupId = &#63; and dossierStatus = &#63;.
	*
	* @param groupId the group ID
	* @param dossierStatus the dossier status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier, or <code>null</code> if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.Dossier fetchByG_DS_Last(
		long groupId, java.lang.String dossierStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_DS_Last(groupId, dossierStatus, orderByComparator);
	}

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
	public static org.opencps.dossiermgt.model.Dossier[] findByG_DS_PrevAndNext(
		long dossierId, long groupId, java.lang.String dossierStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException {
		return getPersistence()
				   .findByG_DS_PrevAndNext(dossierId, groupId, dossierStatus,
			orderByComparator);
	}

	/**
	* Returns all the dossiers that the user has permission to view where groupId = &#63; and dossierStatus = &#63;.
	*
	* @param groupId the group ID
	* @param dossierStatus the dossier status
	* @return the matching dossiers that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> filterFindByG_DS(
		long groupId, java.lang.String dossierStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByG_DS(groupId, dossierStatus);
	}

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
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> filterFindByG_DS(
		long groupId, java.lang.String dossierStatus, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByG_DS(groupId, dossierStatus, start, end);
	}

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
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> filterFindByG_DS(
		long groupId, java.lang.String dossierStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByG_DS(groupId, dossierStatus, start, end,
			orderByComparator);
	}

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
	public static org.opencps.dossiermgt.model.Dossier[] filterFindByG_DS_PrevAndNext(
		long dossierId, long groupId, java.lang.String dossierStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException {
		return getPersistence()
				   .filterFindByG_DS_PrevAndNext(dossierId, groupId,
			dossierStatus, orderByComparator);
	}

	/**
	* Removes all the dossiers where groupId = &#63; and dossierStatus = &#63; from the database.
	*
	* @param groupId the group ID
	* @param dossierStatus the dossier status
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_DS(long groupId, java.lang.String dossierStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_DS(groupId, dossierStatus);
	}

	/**
	* Returns the number of dossiers where groupId = &#63; and dossierStatus = &#63;.
	*
	* @param groupId the group ID
	* @param dossierStatus the dossier status
	* @return the number of matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_DS(long groupId, java.lang.String dossierStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_DS(groupId, dossierStatus);
	}

	/**
	* Returns the number of dossiers that the user has permission to view where groupId = &#63; and dossierStatus = &#63;.
	*
	* @param groupId the group ID
	* @param dossierStatus the dossier status
	* @return the number of matching dossiers that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static int filterCountByG_DS(long groupId,
		java.lang.String dossierStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterCountByG_DS(groupId, dossierStatus);
	}

	/**
	* Returns all the dossiers where groupId = &#63; and dossierStatus = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param dossierStatus the dossier status
	* @param userId the user ID
	* @return the matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> findByG_DS_U(
		long groupId, java.lang.String dossierStatus, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_DS_U(groupId, dossierStatus, userId);
	}

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
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> findByG_DS_U(
		long groupId, java.lang.String dossierStatus, long userId, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_DS_U(groupId, dossierStatus, userId, start, end);
	}

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
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> findByG_DS_U(
		long groupId, java.lang.String dossierStatus, long userId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_DS_U(groupId, dossierStatus, userId, start, end,
			orderByComparator);
	}

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
	public static org.opencps.dossiermgt.model.Dossier findByG_DS_U_First(
		long groupId, java.lang.String dossierStatus, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException {
		return getPersistence()
				   .findByG_DS_U_First(groupId, dossierStatus, userId,
			orderByComparator);
	}

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
	public static org.opencps.dossiermgt.model.Dossier fetchByG_DS_U_First(
		long groupId, java.lang.String dossierStatus, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_DS_U_First(groupId, dossierStatus, userId,
			orderByComparator);
	}

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
	public static org.opencps.dossiermgt.model.Dossier findByG_DS_U_Last(
		long groupId, java.lang.String dossierStatus, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException {
		return getPersistence()
				   .findByG_DS_U_Last(groupId, dossierStatus, userId,
			orderByComparator);
	}

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
	public static org.opencps.dossiermgt.model.Dossier fetchByG_DS_U_Last(
		long groupId, java.lang.String dossierStatus, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_DS_U_Last(groupId, dossierStatus, userId,
			orderByComparator);
	}

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
	public static org.opencps.dossiermgt.model.Dossier[] findByG_DS_U_PrevAndNext(
		long dossierId, long groupId, java.lang.String dossierStatus,
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException {
		return getPersistence()
				   .findByG_DS_U_PrevAndNext(dossierId, groupId, dossierStatus,
			userId, orderByComparator);
	}

	/**
	* Returns all the dossiers that the user has permission to view where groupId = &#63; and dossierStatus = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param dossierStatus the dossier status
	* @param userId the user ID
	* @return the matching dossiers that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> filterFindByG_DS_U(
		long groupId, java.lang.String dossierStatus, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByG_DS_U(groupId, dossierStatus, userId);
	}

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
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> filterFindByG_DS_U(
		long groupId, java.lang.String dossierStatus, long userId, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByG_DS_U(groupId, dossierStatus, userId, start,
			end);
	}

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
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> filterFindByG_DS_U(
		long groupId, java.lang.String dossierStatus, long userId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByG_DS_U(groupId, dossierStatus, userId, start,
			end, orderByComparator);
	}

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
	public static org.opencps.dossiermgt.model.Dossier[] filterFindByG_DS_U_PrevAndNext(
		long dossierId, long groupId, java.lang.String dossierStatus,
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException {
		return getPersistence()
				   .filterFindByG_DS_U_PrevAndNext(dossierId, groupId,
			dossierStatus, userId, orderByComparator);
	}

	/**
	* Removes all the dossiers where groupId = &#63; and dossierStatus = &#63; and userId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param dossierStatus the dossier status
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_DS_U(long groupId,
		java.lang.String dossierStatus, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_DS_U(groupId, dossierStatus, userId);
	}

	/**
	* Returns the number of dossiers where groupId = &#63; and dossierStatus = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param dossierStatus the dossier status
	* @param userId the user ID
	* @return the number of matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_DS_U(long groupId,
		java.lang.String dossierStatus, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_DS_U(groupId, dossierStatus, userId);
	}

	/**
	* Returns the number of dossiers that the user has permission to view where groupId = &#63; and dossierStatus = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param dossierStatus the dossier status
	* @param userId the user ID
	* @return the number of matching dossiers that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static int filterCountByG_DS_U(long groupId,
		java.lang.String dossierStatus, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterCountByG_DS_U(groupId, dossierStatus, userId);
	}

	/**
	* Returns the dossier where receptionNo = &#63; or throws a {@link org.opencps.dossiermgt.NoSuchDossierException} if it could not be found.
	*
	* @param receptionNo the reception no
	* @return the matching dossier
	* @throws org.opencps.dossiermgt.NoSuchDossierException if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.Dossier findByReceptionNo(
		java.lang.String receptionNo)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException {
		return getPersistence().findByReceptionNo(receptionNo);
	}

	/**
	* Returns the dossier where receptionNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param receptionNo the reception no
	* @return the matching dossier, or <code>null</code> if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.Dossier fetchByReceptionNo(
		java.lang.String receptionNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByReceptionNo(receptionNo);
	}

	/**
	* Returns the dossier where receptionNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param receptionNo the reception no
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dossier, or <code>null</code> if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.Dossier fetchByReceptionNo(
		java.lang.String receptionNo, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByReceptionNo(receptionNo, retrieveFromCache);
	}

	/**
	* Removes the dossier where receptionNo = &#63; from the database.
	*
	* @param receptionNo the reception no
	* @return the dossier that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.Dossier removeByReceptionNo(
		java.lang.String receptionNo)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException {
		return getPersistence().removeByReceptionNo(receptionNo);
	}

	/**
	* Returns the number of dossiers where receptionNo = &#63;.
	*
	* @param receptionNo the reception no
	* @return the number of matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public static int countByReceptionNo(java.lang.String receptionNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByReceptionNo(receptionNo);
	}

	/**
	* Returns all the dossiers where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @return the matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> findByG_U(
		long groupId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_U(groupId, userId);
	}

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
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> findByG_U(
		long groupId, long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_U(groupId, userId, start, end);
	}

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
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> findByG_U(
		long groupId, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_U(groupId, userId, start, end, orderByComparator);
	}

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
	public static org.opencps.dossiermgt.model.Dossier findByG_U_First(
		long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException {
		return getPersistence()
				   .findByG_U_First(groupId, userId, orderByComparator);
	}

	/**
	* Returns the first dossier in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier, or <code>null</code> if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.Dossier fetchByG_U_First(
		long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_U_First(groupId, userId, orderByComparator);
	}

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
	public static org.opencps.dossiermgt.model.Dossier findByG_U_Last(
		long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException {
		return getPersistence()
				   .findByG_U_Last(groupId, userId, orderByComparator);
	}

	/**
	* Returns the last dossier in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier, or <code>null</code> if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.Dossier fetchByG_U_Last(
		long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_U_Last(groupId, userId, orderByComparator);
	}

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
	public static org.opencps.dossiermgt.model.Dossier[] findByG_U_PrevAndNext(
		long dossierId, long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException {
		return getPersistence()
				   .findByG_U_PrevAndNext(dossierId, groupId, userId,
			orderByComparator);
	}

	/**
	* Returns all the dossiers that the user has permission to view where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @return the matching dossiers that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> filterFindByG_U(
		long groupId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByG_U(groupId, userId);
	}

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
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> filterFindByG_U(
		long groupId, long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByG_U(groupId, userId, start, end);
	}

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
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> filterFindByG_U(
		long groupId, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByG_U(groupId, userId, start, end,
			orderByComparator);
	}

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
	public static org.opencps.dossiermgt.model.Dossier[] filterFindByG_U_PrevAndNext(
		long dossierId, long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException {
		return getPersistence()
				   .filterFindByG_U_PrevAndNext(dossierId, groupId, userId,
			orderByComparator);
	}

	/**
	* Removes all the dossiers where groupId = &#63; and userId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_U(long groupId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_U(groupId, userId);
	}

	/**
	* Returns the number of dossiers where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @return the number of matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_U(long groupId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_U(groupId, userId);
	}

	/**
	* Returns the number of dossiers that the user has permission to view where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @return the number of matching dossiers that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static int filterCountByG_U(long groupId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterCountByG_U(groupId, userId);
	}

	/**
	* Returns all the dossiers where delayStatus = &#63;.
	*
	* @param delayStatus the delay status
	* @return the matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> findByDelayStatus(
		int delayStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDelayStatus(delayStatus);
	}

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
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> findByDelayStatus(
		int delayStatus, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDelayStatus(delayStatus, start, end);
	}

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
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> findByDelayStatus(
		int delayStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDelayStatus(delayStatus, start, end, orderByComparator);
	}

	/**
	* Returns the first dossier in the ordered set where delayStatus = &#63;.
	*
	* @param delayStatus the delay status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier
	* @throws org.opencps.dossiermgt.NoSuchDossierException if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.Dossier findByDelayStatus_First(
		int delayStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException {
		return getPersistence()
				   .findByDelayStatus_First(delayStatus, orderByComparator);
	}

	/**
	* Returns the first dossier in the ordered set where delayStatus = &#63;.
	*
	* @param delayStatus the delay status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier, or <code>null</code> if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.Dossier fetchByDelayStatus_First(
		int delayStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDelayStatus_First(delayStatus, orderByComparator);
	}

	/**
	* Returns the last dossier in the ordered set where delayStatus = &#63;.
	*
	* @param delayStatus the delay status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier
	* @throws org.opencps.dossiermgt.NoSuchDossierException if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.Dossier findByDelayStatus_Last(
		int delayStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException {
		return getPersistence()
				   .findByDelayStatus_Last(delayStatus, orderByComparator);
	}

	/**
	* Returns the last dossier in the ordered set where delayStatus = &#63;.
	*
	* @param delayStatus the delay status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier, or <code>null</code> if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.Dossier fetchByDelayStatus_Last(
		int delayStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDelayStatus_Last(delayStatus, orderByComparator);
	}

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
	public static org.opencps.dossiermgt.model.Dossier[] findByDelayStatus_PrevAndNext(
		long dossierId, int delayStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException {
		return getPersistence()
				   .findByDelayStatus_PrevAndNext(dossierId, delayStatus,
			orderByComparator);
	}

	/**
	* Removes all the dossiers where delayStatus = &#63; from the database.
	*
	* @param delayStatus the delay status
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDelayStatus(int delayStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDelayStatus(delayStatus);
	}

	/**
	* Returns the number of dossiers where delayStatus = &#63;.
	*
	* @param delayStatus the delay status
	* @return the number of matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDelayStatus(int delayStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDelayStatus(delayStatus);
	}

	/**
	* Returns all the dossiers where delayStatus = &#63; and dossierStatus &ne; &#63;.
	*
	* @param delayStatus the delay status
	* @param dossierStatus the dossier status
	* @return the matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> findByDelayStatusAndNotDossierStatus(
		int delayStatus, java.lang.String dossierStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDelayStatusAndNotDossierStatus(delayStatus,
			dossierStatus);
	}

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
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> findByDelayStatusAndNotDossierStatus(
		int delayStatus, java.lang.String dossierStatus, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDelayStatusAndNotDossierStatus(delayStatus,
			dossierStatus, start, end);
	}

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
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> findByDelayStatusAndNotDossierStatus(
		int delayStatus, java.lang.String dossierStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDelayStatusAndNotDossierStatus(delayStatus,
			dossierStatus, start, end, orderByComparator);
	}

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
	public static org.opencps.dossiermgt.model.Dossier findByDelayStatusAndNotDossierStatus_First(
		int delayStatus, java.lang.String dossierStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException {
		return getPersistence()
				   .findByDelayStatusAndNotDossierStatus_First(delayStatus,
			dossierStatus, orderByComparator);
	}

	/**
	* Returns the first dossier in the ordered set where delayStatus = &#63; and dossierStatus &ne; &#63;.
	*
	* @param delayStatus the delay status
	* @param dossierStatus the dossier status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier, or <code>null</code> if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.Dossier fetchByDelayStatusAndNotDossierStatus_First(
		int delayStatus, java.lang.String dossierStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDelayStatusAndNotDossierStatus_First(delayStatus,
			dossierStatus, orderByComparator);
	}

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
	public static org.opencps.dossiermgt.model.Dossier findByDelayStatusAndNotDossierStatus_Last(
		int delayStatus, java.lang.String dossierStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException {
		return getPersistence()
				   .findByDelayStatusAndNotDossierStatus_Last(delayStatus,
			dossierStatus, orderByComparator);
	}

	/**
	* Returns the last dossier in the ordered set where delayStatus = &#63; and dossierStatus &ne; &#63;.
	*
	* @param delayStatus the delay status
	* @param dossierStatus the dossier status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier, or <code>null</code> if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.Dossier fetchByDelayStatusAndNotDossierStatus_Last(
		int delayStatus, java.lang.String dossierStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDelayStatusAndNotDossierStatus_Last(delayStatus,
			dossierStatus, orderByComparator);
	}

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
	public static org.opencps.dossiermgt.model.Dossier[] findByDelayStatusAndNotDossierStatus_PrevAndNext(
		long dossierId, int delayStatus, java.lang.String dossierStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException {
		return getPersistence()
				   .findByDelayStatusAndNotDossierStatus_PrevAndNext(dossierId,
			delayStatus, dossierStatus, orderByComparator);
	}

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
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> findByDelayStatusAndNotDossierStatus(
		int[] delayStatuses, java.lang.String[] dossierStatuses)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDelayStatusAndNotDossierStatus(delayStatuses,
			dossierStatuses);
	}

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
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> findByDelayStatusAndNotDossierStatus(
		int[] delayStatuses, java.lang.String[] dossierStatuses, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDelayStatusAndNotDossierStatus(delayStatuses,
			dossierStatuses, start, end);
	}

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
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> findByDelayStatusAndNotDossierStatus(
		int[] delayStatuses, java.lang.String[] dossierStatuses, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDelayStatusAndNotDossierStatus(delayStatuses,
			dossierStatuses, start, end, orderByComparator);
	}

	/**
	* Removes all the dossiers where delayStatus = &#63; and dossierStatus &ne; &#63; from the database.
	*
	* @param delayStatus the delay status
	* @param dossierStatus the dossier status
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDelayStatusAndNotDossierStatus(int delayStatus,
		java.lang.String dossierStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByDelayStatusAndNotDossierStatus(delayStatus, dossierStatus);
	}

	/**
	* Returns the number of dossiers where delayStatus = &#63; and dossierStatus &ne; &#63;.
	*
	* @param delayStatus the delay status
	* @param dossierStatus the dossier status
	* @return the number of matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDelayStatusAndNotDossierStatus(int delayStatus,
		java.lang.String dossierStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByDelayStatusAndNotDossierStatus(delayStatus,
			dossierStatus);
	}

	/**
	* Returns the number of dossiers where delayStatus = all &#63; and dossierStatus &ne; all &#63;.
	*
	* @param delayStatuses the delay statuses
	* @param dossierStatuses the dossier statuses
	* @return the number of matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDelayStatusAndNotDossierStatus(
		int[] delayStatuses, java.lang.String[] dossierStatuses)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByDelayStatusAndNotDossierStatus(delayStatuses,
			dossierStatuses);
	}

	/**
	* Returns the dossier where oid = &#63; or throws a {@link org.opencps.dossiermgt.NoSuchDossierException} if it could not be found.
	*
	* @param oid the oid
	* @return the matching dossier
	* @throws org.opencps.dossiermgt.NoSuchDossierException if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.Dossier findByOID(
		java.lang.String oid)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException {
		return getPersistence().findByOID(oid);
	}

	/**
	* Returns the dossier where oid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param oid the oid
	* @return the matching dossier, or <code>null</code> if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.Dossier fetchByOID(
		java.lang.String oid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByOID(oid);
	}

	/**
	* Returns the dossier where oid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param oid the oid
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dossier, or <code>null</code> if a matching dossier could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.Dossier fetchByOID(
		java.lang.String oid, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByOID(oid, retrieveFromCache);
	}

	/**
	* Removes the dossier where oid = &#63; from the database.
	*
	* @param oid the oid
	* @return the dossier that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.Dossier removeByOID(
		java.lang.String oid)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException {
		return getPersistence().removeByOID(oid);
	}

	/**
	* Returns the number of dossiers where oid = &#63;.
	*
	* @param oid the oid
	* @return the number of matching dossiers
	* @throws SystemException if a system exception occurred
	*/
	public static int countByOID(java.lang.String oid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByOID(oid);
	}

	/**
	* Caches the dossier in the entity cache if it is enabled.
	*
	* @param dossier the dossier
	*/
	public static void cacheResult(org.opencps.dossiermgt.model.Dossier dossier) {
		getPersistence().cacheResult(dossier);
	}

	/**
	* Caches the dossiers in the entity cache if it is enabled.
	*
	* @param dossiers the dossiers
	*/
	public static void cacheResult(
		java.util.List<org.opencps.dossiermgt.model.Dossier> dossiers) {
		getPersistence().cacheResult(dossiers);
	}

	/**
	* Creates a new dossier with the primary key. Does not add the dossier to the database.
	*
	* @param dossierId the primary key for the new dossier
	* @return the new dossier
	*/
	public static org.opencps.dossiermgt.model.Dossier create(long dossierId) {
		return getPersistence().create(dossierId);
	}

	/**
	* Removes the dossier with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierId the primary key of the dossier
	* @return the dossier that was removed
	* @throws org.opencps.dossiermgt.NoSuchDossierException if a dossier with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.Dossier remove(long dossierId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException {
		return getPersistence().remove(dossierId);
	}

	public static org.opencps.dossiermgt.model.Dossier updateImpl(
		org.opencps.dossiermgt.model.Dossier dossier)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dossier);
	}

	/**
	* Returns the dossier with the primary key or throws a {@link org.opencps.dossiermgt.NoSuchDossierException} if it could not be found.
	*
	* @param dossierId the primary key of the dossier
	* @return the dossier
	* @throws org.opencps.dossiermgt.NoSuchDossierException if a dossier with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.Dossier findByPrimaryKey(
		long dossierId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException {
		return getPersistence().findByPrimaryKey(dossierId);
	}

	/**
	* Returns the dossier with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param dossierId the primary key of the dossier
	* @return the dossier, or <code>null</code> if a dossier with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.Dossier fetchByPrimaryKey(
		long dossierId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(dossierId);
	}

	/**
	* Returns all the dossiers.
	*
	* @return the dossiers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dossiers from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dossiers.
	*
	* @return the number of dossiers
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DossierPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DossierPersistence)PortletBeanLocatorUtil.locate(org.opencps.dossiermgt.service.ClpSerializer.getServletContextName(),
					DossierPersistence.class.getName());

			ReferenceRegistry.registerReference(DossierUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DossierPersistence persistence) {
	}

	private static DossierPersistence _persistence;
}