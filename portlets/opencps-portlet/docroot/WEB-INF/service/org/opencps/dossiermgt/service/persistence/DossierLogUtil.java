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

import org.opencps.dossiermgt.model.DossierLog;

import java.util.List;

/**
 * The persistence utility for the dossier log service. This utility wraps {@link DossierLogPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungnt
 * @see DossierLogPersistence
 * @see DossierLogPersistenceImpl
 * @generated
 */
public class DossierLogUtil {
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
	public static void clearCache(DossierLog dossierLog) {
		getPersistence().clearCache(dossierLog);
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
	public static List<DossierLog> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DossierLog> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DossierLog> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DossierLog update(DossierLog dossierLog)
		throws SystemException {
		return getPersistence().update(dossierLog);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DossierLog update(DossierLog dossierLog,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(dossierLog, serviceContext);
	}

	/**
	* Returns all the dossier logs where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the matching dossier logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.DossierLog> findByDossierId(
		long dossierId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDossierId(dossierId);
	}

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
	public static java.util.List<org.opencps.dossiermgt.model.DossierLog> findByDossierId(
		long dossierId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDossierId(dossierId, start, end);
	}

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
	public static java.util.List<org.opencps.dossiermgt.model.DossierLog> findByDossierId(
		long dossierId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDossierId(dossierId, start, end, orderByComparator);
	}

	/**
	* Returns the first dossier log in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier log
	* @throws org.opencps.dossiermgt.NoSuchDossierLogException if a matching dossier log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierLog findByDossierId_First(
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierLogException {
		return getPersistence()
				   .findByDossierId_First(dossierId, orderByComparator);
	}

	/**
	* Returns the first dossier log in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier log, or <code>null</code> if a matching dossier log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierLog fetchByDossierId_First(
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDossierId_First(dossierId, orderByComparator);
	}

	/**
	* Returns the last dossier log in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier log
	* @throws org.opencps.dossiermgt.NoSuchDossierLogException if a matching dossier log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierLog findByDossierId_Last(
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierLogException {
		return getPersistence()
				   .findByDossierId_Last(dossierId, orderByComparator);
	}

	/**
	* Returns the last dossier log in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier log, or <code>null</code> if a matching dossier log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierLog fetchByDossierId_Last(
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDossierId_Last(dossierId, orderByComparator);
	}

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
	public static org.opencps.dossiermgt.model.DossierLog[] findByDossierId_PrevAndNext(
		long dossierLogId, long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierLogException {
		return getPersistence()
				   .findByDossierId_PrevAndNext(dossierLogId, dossierId,
			orderByComparator);
	}

	/**
	* Removes all the dossier logs where dossierId = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDossierId(long dossierId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDossierId(dossierId);
	}

	/**
	* Returns the number of dossier logs where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the number of matching dossier logs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDossierId(long dossierId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDossierId(dossierId);
	}

	/**
	* Returns all the dossier logs where dossierId = &#63; and syncStatus = &#63;.
	*
	* @param dossierId the dossier ID
	* @param syncStatus the sync status
	* @return the matching dossier logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.DossierLog> findByDossierIdSync(
		long dossierId, int syncStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDossierIdSync(dossierId, syncStatus);
	}

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
	public static java.util.List<org.opencps.dossiermgt.model.DossierLog> findByDossierIdSync(
		long dossierId, int syncStatus, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDossierIdSync(dossierId, syncStatus, start, end);
	}

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
	public static java.util.List<org.opencps.dossiermgt.model.DossierLog> findByDossierIdSync(
		long dossierId, int syncStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDossierIdSync(dossierId, syncStatus, start, end,
			orderByComparator);
	}

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
	public static org.opencps.dossiermgt.model.DossierLog findByDossierIdSync_First(
		long dossierId, int syncStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierLogException {
		return getPersistence()
				   .findByDossierIdSync_First(dossierId, syncStatus,
			orderByComparator);
	}

	/**
	* Returns the first dossier log in the ordered set where dossierId = &#63; and syncStatus = &#63;.
	*
	* @param dossierId the dossier ID
	* @param syncStatus the sync status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier log, or <code>null</code> if a matching dossier log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierLog fetchByDossierIdSync_First(
		long dossierId, int syncStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDossierIdSync_First(dossierId, syncStatus,
			orderByComparator);
	}

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
	public static org.opencps.dossiermgt.model.DossierLog findByDossierIdSync_Last(
		long dossierId, int syncStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierLogException {
		return getPersistence()
				   .findByDossierIdSync_Last(dossierId, syncStatus,
			orderByComparator);
	}

	/**
	* Returns the last dossier log in the ordered set where dossierId = &#63; and syncStatus = &#63;.
	*
	* @param dossierId the dossier ID
	* @param syncStatus the sync status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier log, or <code>null</code> if a matching dossier log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierLog fetchByDossierIdSync_Last(
		long dossierId, int syncStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDossierIdSync_Last(dossierId, syncStatus,
			orderByComparator);
	}

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
	public static org.opencps.dossiermgt.model.DossierLog[] findByDossierIdSync_PrevAndNext(
		long dossierLogId, long dossierId, int syncStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierLogException {
		return getPersistence()
				   .findByDossierIdSync_PrevAndNext(dossierLogId, dossierId,
			syncStatus, orderByComparator);
	}

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
	public static java.util.List<org.opencps.dossiermgt.model.DossierLog> findByDossierIdSync(
		long dossierId, int[] syncStatuses)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDossierIdSync(dossierId, syncStatuses);
	}

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
	public static java.util.List<org.opencps.dossiermgt.model.DossierLog> findByDossierIdSync(
		long dossierId, int[] syncStatuses, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDossierIdSync(dossierId, syncStatuses, start, end);
	}

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
	public static java.util.List<org.opencps.dossiermgt.model.DossierLog> findByDossierIdSync(
		long dossierId, int[] syncStatuses, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDossierIdSync(dossierId, syncStatuses, start, end,
			orderByComparator);
	}

	/**
	* Removes all the dossier logs where dossierId = &#63; and syncStatus = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param syncStatus the sync status
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDossierIdSync(long dossierId, int syncStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDossierIdSync(dossierId, syncStatus);
	}

	/**
	* Returns the number of dossier logs where dossierId = &#63; and syncStatus = &#63;.
	*
	* @param dossierId the dossier ID
	* @param syncStatus the sync status
	* @return the number of matching dossier logs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDossierIdSync(long dossierId, int syncStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDossierIdSync(dossierId, syncStatus);
	}

	/**
	* Returns the number of dossier logs where dossierId = &#63; and syncStatus = any &#63;.
	*
	* @param dossierId the dossier ID
	* @param syncStatuses the sync statuses
	* @return the number of matching dossier logs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDossierIdSync(long dossierId, int[] syncStatuses)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDossierIdSync(dossierId, syncStatuses);
	}

	/**
	* Returns all the dossier logs where dossierId = &#63; and requestCommand = &#63;.
	*
	* @param dossierId the dossier ID
	* @param requestCommand the request command
	* @return the matching dossier logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.DossierLog> findByD_RC(
		long dossierId, java.lang.String requestCommand)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByD_RC(dossierId, requestCommand);
	}

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
	public static java.util.List<org.opencps.dossiermgt.model.DossierLog> findByD_RC(
		long dossierId, java.lang.String requestCommand, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByD_RC(dossierId, requestCommand, start, end);
	}

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
	public static java.util.List<org.opencps.dossiermgt.model.DossierLog> findByD_RC(
		long dossierId, java.lang.String requestCommand, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByD_RC(dossierId, requestCommand, start, end,
			orderByComparator);
	}

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
	public static org.opencps.dossiermgt.model.DossierLog findByD_RC_First(
		long dossierId, java.lang.String requestCommand,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierLogException {
		return getPersistence()
				   .findByD_RC_First(dossierId, requestCommand,
			orderByComparator);
	}

	/**
	* Returns the first dossier log in the ordered set where dossierId = &#63; and requestCommand = &#63;.
	*
	* @param dossierId the dossier ID
	* @param requestCommand the request command
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier log, or <code>null</code> if a matching dossier log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierLog fetchByD_RC_First(
		long dossierId, java.lang.String requestCommand,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByD_RC_First(dossierId, requestCommand,
			orderByComparator);
	}

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
	public static org.opencps.dossiermgt.model.DossierLog findByD_RC_Last(
		long dossierId, java.lang.String requestCommand,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierLogException {
		return getPersistence()
				   .findByD_RC_Last(dossierId, requestCommand, orderByComparator);
	}

	/**
	* Returns the last dossier log in the ordered set where dossierId = &#63; and requestCommand = &#63;.
	*
	* @param dossierId the dossier ID
	* @param requestCommand the request command
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier log, or <code>null</code> if a matching dossier log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierLog fetchByD_RC_Last(
		long dossierId, java.lang.String requestCommand,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByD_RC_Last(dossierId, requestCommand,
			orderByComparator);
	}

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
	public static org.opencps.dossiermgt.model.DossierLog[] findByD_RC_PrevAndNext(
		long dossierLogId, long dossierId, java.lang.String requestCommand,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierLogException {
		return getPersistence()
				   .findByD_RC_PrevAndNext(dossierLogId, dossierId,
			requestCommand, orderByComparator);
	}

	/**
	* Removes all the dossier logs where dossierId = &#63; and requestCommand = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param requestCommand the request command
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByD_RC(long dossierId,
		java.lang.String requestCommand)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByD_RC(dossierId, requestCommand);
	}

	/**
	* Returns the number of dossier logs where dossierId = &#63; and requestCommand = &#63;.
	*
	* @param dossierId the dossier ID
	* @param requestCommand the request command
	* @return the number of matching dossier logs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByD_RC(long dossierId,
		java.lang.String requestCommand)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByD_RC(dossierId, requestCommand);
	}

	/**
	* Returns all the dossier logs where dossierId = &#63; and actor = &#63;.
	*
	* @param dossierId the dossier ID
	* @param actor the actor
	* @return the matching dossier logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.DossierLog> findByD_A(
		long dossierId, int actor)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByD_A(dossierId, actor);
	}

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
	public static java.util.List<org.opencps.dossiermgt.model.DossierLog> findByD_A(
		long dossierId, int actor, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByD_A(dossierId, actor, start, end);
	}

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
	public static java.util.List<org.opencps.dossiermgt.model.DossierLog> findByD_A(
		long dossierId, int actor, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByD_A(dossierId, actor, start, end, orderByComparator);
	}

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
	public static org.opencps.dossiermgt.model.DossierLog findByD_A_First(
		long dossierId, int actor,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierLogException {
		return getPersistence()
				   .findByD_A_First(dossierId, actor, orderByComparator);
	}

	/**
	* Returns the first dossier log in the ordered set where dossierId = &#63; and actor = &#63;.
	*
	* @param dossierId the dossier ID
	* @param actor the actor
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier log, or <code>null</code> if a matching dossier log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierLog fetchByD_A_First(
		long dossierId, int actor,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByD_A_First(dossierId, actor, orderByComparator);
	}

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
	public static org.opencps.dossiermgt.model.DossierLog findByD_A_Last(
		long dossierId, int actor,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierLogException {
		return getPersistence()
				   .findByD_A_Last(dossierId, actor, orderByComparator);
	}

	/**
	* Returns the last dossier log in the ordered set where dossierId = &#63; and actor = &#63;.
	*
	* @param dossierId the dossier ID
	* @param actor the actor
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier log, or <code>null</code> if a matching dossier log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierLog fetchByD_A_Last(
		long dossierId, int actor,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByD_A_Last(dossierId, actor, orderByComparator);
	}

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
	public static org.opencps.dossiermgt.model.DossierLog[] findByD_A_PrevAndNext(
		long dossierLogId, long dossierId, int actor,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierLogException {
		return getPersistence()
				   .findByD_A_PrevAndNext(dossierLogId, dossierId, actor,
			orderByComparator);
	}

	/**
	* Removes all the dossier logs where dossierId = &#63; and actor = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param actor the actor
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByD_A(long dossierId, int actor)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByD_A(dossierId, actor);
	}

	/**
	* Returns the number of dossier logs where dossierId = &#63; and actor = &#63;.
	*
	* @param dossierId the dossier ID
	* @param actor the actor
	* @return the number of matching dossier logs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByD_A(long dossierId, int actor)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByD_A(dossierId, actor);
	}

	/**
	* Caches the dossier log in the entity cache if it is enabled.
	*
	* @param dossierLog the dossier log
	*/
	public static void cacheResult(
		org.opencps.dossiermgt.model.DossierLog dossierLog) {
		getPersistence().cacheResult(dossierLog);
	}

	/**
	* Caches the dossier logs in the entity cache if it is enabled.
	*
	* @param dossierLogs the dossier logs
	*/
	public static void cacheResult(
		java.util.List<org.opencps.dossiermgt.model.DossierLog> dossierLogs) {
		getPersistence().cacheResult(dossierLogs);
	}

	/**
	* Creates a new dossier log with the primary key. Does not add the dossier log to the database.
	*
	* @param dossierLogId the primary key for the new dossier log
	* @return the new dossier log
	*/
	public static org.opencps.dossiermgt.model.DossierLog create(
		long dossierLogId) {
		return getPersistence().create(dossierLogId);
	}

	/**
	* Removes the dossier log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierLogId the primary key of the dossier log
	* @return the dossier log that was removed
	* @throws org.opencps.dossiermgt.NoSuchDossierLogException if a dossier log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierLog remove(
		long dossierLogId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierLogException {
		return getPersistence().remove(dossierLogId);
	}

	public static org.opencps.dossiermgt.model.DossierLog updateImpl(
		org.opencps.dossiermgt.model.DossierLog dossierLog)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dossierLog);
	}

	/**
	* Returns the dossier log with the primary key or throws a {@link org.opencps.dossiermgt.NoSuchDossierLogException} if it could not be found.
	*
	* @param dossierLogId the primary key of the dossier log
	* @return the dossier log
	* @throws org.opencps.dossiermgt.NoSuchDossierLogException if a dossier log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierLog findByPrimaryKey(
		long dossierLogId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierLogException {
		return getPersistence().findByPrimaryKey(dossierLogId);
	}

	/**
	* Returns the dossier log with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param dossierLogId the primary key of the dossier log
	* @return the dossier log, or <code>null</code> if a dossier log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierLog fetchByPrimaryKey(
		long dossierLogId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(dossierLogId);
	}

	/**
	* Returns all the dossier logs.
	*
	* @return the dossier logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.DossierLog> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<org.opencps.dossiermgt.model.DossierLog> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<org.opencps.dossiermgt.model.DossierLog> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dossier logs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dossier logs.
	*
	* @return the number of dossier logs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DossierLogPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DossierLogPersistence)PortletBeanLocatorUtil.locate(org.opencps.dossiermgt.service.ClpSerializer.getServletContextName(),
					DossierLogPersistence.class.getName());

			ReferenceRegistry.registerReference(DossierLogUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DossierLogPersistence persistence) {
	}

	private static DossierLogPersistence _persistence;
}