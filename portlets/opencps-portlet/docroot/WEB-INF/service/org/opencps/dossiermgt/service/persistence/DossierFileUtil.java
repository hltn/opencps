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

import org.opencps.dossiermgt.model.DossierFile;

import java.util.List;

/**
 * The persistence utility for the dossier file service. This utility wraps {@link DossierFilePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungnt
 * @see DossierFilePersistence
 * @see DossierFilePersistenceImpl
 * @generated
 */
public class DossierFileUtil {
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
	public static void clearCache(DossierFile dossierFile) {
		getPersistence().clearCache(dossierFile);
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
	public static List<DossierFile> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DossierFile> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DossierFile> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DossierFile update(DossierFile dossierFile)
		throws SystemException {
		return getPersistence().update(dossierFile);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DossierFile update(DossierFile dossierFile,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(dossierFile, serviceContext);
	}

	/**
	* Returns all the dossier files where dossierId = &#63; and dossierPartId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param dossierPartId the dossier part ID
	* @return the matching dossier files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.DossierFile> findByD_DP(
		long dossierId, long dossierPartId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByD_DP(dossierId, dossierPartId);
	}

	/**
	* Returns a range of all the dossier files where dossierId = &#63; and dossierPartId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param dossierPartId the dossier part ID
	* @param start the lower bound of the range of dossier files
	* @param end the upper bound of the range of dossier files (not inclusive)
	* @return the range of matching dossier files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.DossierFile> findByD_DP(
		long dossierId, long dossierPartId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByD_DP(dossierId, dossierPartId, start, end);
	}

	/**
	* Returns an ordered range of all the dossier files where dossierId = &#63; and dossierPartId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param dossierPartId the dossier part ID
	* @param start the lower bound of the range of dossier files
	* @param end the upper bound of the range of dossier files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.DossierFile> findByD_DP(
		long dossierId, long dossierPartId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByD_DP(dossierId, dossierPartId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dossier file in the ordered set where dossierId = &#63; and dossierPartId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param dossierPartId the dossier part ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier file
	* @throws org.opencps.dossiermgt.NoSuchDossierFileException if a matching dossier file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierFile findByD_DP_First(
		long dossierId, long dossierPartId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierFileException {
		return getPersistence()
				   .findByD_DP_First(dossierId, dossierPartId, orderByComparator);
	}

	/**
	* Returns the first dossier file in the ordered set where dossierId = &#63; and dossierPartId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param dossierPartId the dossier part ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier file, or <code>null</code> if a matching dossier file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierFile fetchByD_DP_First(
		long dossierId, long dossierPartId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByD_DP_First(dossierId, dossierPartId,
			orderByComparator);
	}

	/**
	* Returns the last dossier file in the ordered set where dossierId = &#63; and dossierPartId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param dossierPartId the dossier part ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier file
	* @throws org.opencps.dossiermgt.NoSuchDossierFileException if a matching dossier file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierFile findByD_DP_Last(
		long dossierId, long dossierPartId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierFileException {
		return getPersistence()
				   .findByD_DP_Last(dossierId, dossierPartId, orderByComparator);
	}

	/**
	* Returns the last dossier file in the ordered set where dossierId = &#63; and dossierPartId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param dossierPartId the dossier part ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier file, or <code>null</code> if a matching dossier file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierFile fetchByD_DP_Last(
		long dossierId, long dossierPartId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByD_DP_Last(dossierId, dossierPartId, orderByComparator);
	}

	/**
	* Returns the dossier files before and after the current dossier file in the ordered set where dossierId = &#63; and dossierPartId = &#63;.
	*
	* @param dossierFileId the primary key of the current dossier file
	* @param dossierId the dossier ID
	* @param dossierPartId the dossier part ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier file
	* @throws org.opencps.dossiermgt.NoSuchDossierFileException if a dossier file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierFile[] findByD_DP_PrevAndNext(
		long dossierFileId, long dossierId, long dossierPartId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierFileException {
		return getPersistence()
				   .findByD_DP_PrevAndNext(dossierFileId, dossierId,
			dossierPartId, orderByComparator);
	}

	/**
	* Removes all the dossier files where dossierId = &#63; and dossierPartId = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param dossierPartId the dossier part ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByD_DP(long dossierId, long dossierPartId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByD_DP(dossierId, dossierPartId);
	}

	/**
	* Returns the number of dossier files where dossierId = &#63; and dossierPartId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param dossierPartId the dossier part ID
	* @return the number of matching dossier files
	* @throws SystemException if a system exception occurred
	*/
	public static int countByD_DP(long dossierId, long dossierPartId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByD_DP(dossierId, dossierPartId);
	}

	/**
	* Returns all the dossier files where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the matching dossier files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.DossierFile> findByDossierId(
		long dossierId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDossierId(dossierId);
	}

	/**
	* Returns a range of all the dossier files where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of dossier files
	* @param end the upper bound of the range of dossier files (not inclusive)
	* @return the range of matching dossier files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.DossierFile> findByDossierId(
		long dossierId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDossierId(dossierId, start, end);
	}

	/**
	* Returns an ordered range of all the dossier files where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of dossier files
	* @param end the upper bound of the range of dossier files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.DossierFile> findByDossierId(
		long dossierId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDossierId(dossierId, start, end, orderByComparator);
	}

	/**
	* Returns the first dossier file in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier file
	* @throws org.opencps.dossiermgt.NoSuchDossierFileException if a matching dossier file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierFile findByDossierId_First(
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierFileException {
		return getPersistence()
				   .findByDossierId_First(dossierId, orderByComparator);
	}

	/**
	* Returns the first dossier file in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier file, or <code>null</code> if a matching dossier file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierFile fetchByDossierId_First(
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDossierId_First(dossierId, orderByComparator);
	}

	/**
	* Returns the last dossier file in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier file
	* @throws org.opencps.dossiermgt.NoSuchDossierFileException if a matching dossier file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierFile findByDossierId_Last(
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierFileException {
		return getPersistence()
				   .findByDossierId_Last(dossierId, orderByComparator);
	}

	/**
	* Returns the last dossier file in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier file, or <code>null</code> if a matching dossier file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierFile fetchByDossierId_Last(
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDossierId_Last(dossierId, orderByComparator);
	}

	/**
	* Returns the dossier files before and after the current dossier file in the ordered set where dossierId = &#63;.
	*
	* @param dossierFileId the primary key of the current dossier file
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier file
	* @throws org.opencps.dossiermgt.NoSuchDossierFileException if a dossier file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierFile[] findByDossierId_PrevAndNext(
		long dossierFileId, long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierFileException {
		return getPersistence()
				   .findByDossierId_PrevAndNext(dossierFileId, dossierId,
			orderByComparator);
	}

	/**
	* Removes all the dossier files where dossierId = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDossierId(long dossierId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDossierId(dossierId);
	}

	/**
	* Returns the number of dossier files where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the number of matching dossier files
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDossierId(long dossierId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDossierId(dossierId);
	}

	/**
	* Returns all the dossier files where dossierId = &#63; and groupFileId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param groupFileId the group file ID
	* @return the matching dossier files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.DossierFile> findByD_GF(
		long dossierId, long groupFileId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByD_GF(dossierId, groupFileId);
	}

	/**
	* Returns a range of all the dossier files where dossierId = &#63; and groupFileId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param groupFileId the group file ID
	* @param start the lower bound of the range of dossier files
	* @param end the upper bound of the range of dossier files (not inclusive)
	* @return the range of matching dossier files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.DossierFile> findByD_GF(
		long dossierId, long groupFileId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByD_GF(dossierId, groupFileId, start, end);
	}

	/**
	* Returns an ordered range of all the dossier files where dossierId = &#63; and groupFileId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param groupFileId the group file ID
	* @param start the lower bound of the range of dossier files
	* @param end the upper bound of the range of dossier files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.DossierFile> findByD_GF(
		long dossierId, long groupFileId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByD_GF(dossierId, groupFileId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dossier file in the ordered set where dossierId = &#63; and groupFileId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param groupFileId the group file ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier file
	* @throws org.opencps.dossiermgt.NoSuchDossierFileException if a matching dossier file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierFile findByD_GF_First(
		long dossierId, long groupFileId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierFileException {
		return getPersistence()
				   .findByD_GF_First(dossierId, groupFileId, orderByComparator);
	}

	/**
	* Returns the first dossier file in the ordered set where dossierId = &#63; and groupFileId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param groupFileId the group file ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier file, or <code>null</code> if a matching dossier file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierFile fetchByD_GF_First(
		long dossierId, long groupFileId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByD_GF_First(dossierId, groupFileId, orderByComparator);
	}

	/**
	* Returns the last dossier file in the ordered set where dossierId = &#63; and groupFileId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param groupFileId the group file ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier file
	* @throws org.opencps.dossiermgt.NoSuchDossierFileException if a matching dossier file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierFile findByD_GF_Last(
		long dossierId, long groupFileId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierFileException {
		return getPersistence()
				   .findByD_GF_Last(dossierId, groupFileId, orderByComparator);
	}

	/**
	* Returns the last dossier file in the ordered set where dossierId = &#63; and groupFileId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param groupFileId the group file ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier file, or <code>null</code> if a matching dossier file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierFile fetchByD_GF_Last(
		long dossierId, long groupFileId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByD_GF_Last(dossierId, groupFileId, orderByComparator);
	}

	/**
	* Returns the dossier files before and after the current dossier file in the ordered set where dossierId = &#63; and groupFileId = &#63;.
	*
	* @param dossierFileId the primary key of the current dossier file
	* @param dossierId the dossier ID
	* @param groupFileId the group file ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier file
	* @throws org.opencps.dossiermgt.NoSuchDossierFileException if a dossier file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierFile[] findByD_GF_PrevAndNext(
		long dossierFileId, long dossierId, long groupFileId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierFileException {
		return getPersistence()
				   .findByD_GF_PrevAndNext(dossierFileId, dossierId,
			groupFileId, orderByComparator);
	}

	/**
	* Removes all the dossier files where dossierId = &#63; and groupFileId = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param groupFileId the group file ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByD_GF(long dossierId, long groupFileId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByD_GF(dossierId, groupFileId);
	}

	/**
	* Returns the number of dossier files where dossierId = &#63; and groupFileId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param groupFileId the group file ID
	* @return the number of matching dossier files
	* @throws SystemException if a system exception occurred
	*/
	public static int countByD_GF(long dossierId, long groupFileId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByD_GF(dossierId, groupFileId);
	}

	/**
	* Returns the dossier file where dossierId = &#63; and dossierPartId = &#63; or throws a {@link org.opencps.dossiermgt.NoSuchDossierFileException} if it could not be found.
	*
	* @param dossierId the dossier ID
	* @param dossierPartId the dossier part ID
	* @return the matching dossier file
	* @throws org.opencps.dossiermgt.NoSuchDossierFileException if a matching dossier file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierFile findByDossierFileInUse(
		long dossierId, long dossierPartId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierFileException {
		return getPersistence().findByDossierFileInUse(dossierId, dossierPartId);
	}

	/**
	* Returns the dossier file where dossierId = &#63; and dossierPartId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param dossierId the dossier ID
	* @param dossierPartId the dossier part ID
	* @return the matching dossier file, or <code>null</code> if a matching dossier file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierFile fetchByDossierFileInUse(
		long dossierId, long dossierPartId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByDossierFileInUse(dossierId, dossierPartId);
	}

	/**
	* Returns the dossier file where dossierId = &#63; and dossierPartId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param dossierId the dossier ID
	* @param dossierPartId the dossier part ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dossier file, or <code>null</code> if a matching dossier file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierFile fetchByDossierFileInUse(
		long dossierId, long dossierPartId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDossierFileInUse(dossierId, dossierPartId,
			retrieveFromCache);
	}

	/**
	* Removes the dossier file where dossierId = &#63; and dossierPartId = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param dossierPartId the dossier part ID
	* @return the dossier file that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierFile removeByDossierFileInUse(
		long dossierId, long dossierPartId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierFileException {
		return getPersistence()
				   .removeByDossierFileInUse(dossierId, dossierPartId);
	}

	/**
	* Returns the number of dossier files where dossierId = &#63; and dossierPartId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param dossierPartId the dossier part ID
	* @return the number of matching dossier files
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDossierFileInUse(long dossierId, long dossierPartId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDossierFileInUse(dossierId, dossierPartId);
	}

	/**
	* Returns all the dossier files where dossierId = &#63; and dossierPartId = &#63; and groupFileId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param dossierPartId the dossier part ID
	* @param groupFileId the group file ID
	* @return the matching dossier files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.DossierFile> findByD_DP_GF(
		long dossierId, long dossierPartId, long groupFileId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByD_DP_GF(dossierId, dossierPartId, groupFileId);
	}

	/**
	* Returns a range of all the dossier files where dossierId = &#63; and dossierPartId = &#63; and groupFileId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param dossierPartId the dossier part ID
	* @param groupFileId the group file ID
	* @param start the lower bound of the range of dossier files
	* @param end the upper bound of the range of dossier files (not inclusive)
	* @return the range of matching dossier files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.DossierFile> findByD_DP_GF(
		long dossierId, long dossierPartId, long groupFileId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByD_DP_GF(dossierId, dossierPartId, groupFileId, start,
			end);
	}

	/**
	* Returns an ordered range of all the dossier files where dossierId = &#63; and dossierPartId = &#63; and groupFileId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param dossierPartId the dossier part ID
	* @param groupFileId the group file ID
	* @param start the lower bound of the range of dossier files
	* @param end the upper bound of the range of dossier files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.DossierFile> findByD_DP_GF(
		long dossierId, long dossierPartId, long groupFileId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByD_DP_GF(dossierId, dossierPartId, groupFileId, start,
			end, orderByComparator);
	}

	/**
	* Returns the first dossier file in the ordered set where dossierId = &#63; and dossierPartId = &#63; and groupFileId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param dossierPartId the dossier part ID
	* @param groupFileId the group file ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier file
	* @throws org.opencps.dossiermgt.NoSuchDossierFileException if a matching dossier file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierFile findByD_DP_GF_First(
		long dossierId, long dossierPartId, long groupFileId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierFileException {
		return getPersistence()
				   .findByD_DP_GF_First(dossierId, dossierPartId, groupFileId,
			orderByComparator);
	}

	/**
	* Returns the first dossier file in the ordered set where dossierId = &#63; and dossierPartId = &#63; and groupFileId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param dossierPartId the dossier part ID
	* @param groupFileId the group file ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier file, or <code>null</code> if a matching dossier file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierFile fetchByD_DP_GF_First(
		long dossierId, long dossierPartId, long groupFileId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByD_DP_GF_First(dossierId, dossierPartId, groupFileId,
			orderByComparator);
	}

	/**
	* Returns the last dossier file in the ordered set where dossierId = &#63; and dossierPartId = &#63; and groupFileId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param dossierPartId the dossier part ID
	* @param groupFileId the group file ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier file
	* @throws org.opencps.dossiermgt.NoSuchDossierFileException if a matching dossier file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierFile findByD_DP_GF_Last(
		long dossierId, long dossierPartId, long groupFileId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierFileException {
		return getPersistence()
				   .findByD_DP_GF_Last(dossierId, dossierPartId, groupFileId,
			orderByComparator);
	}

	/**
	* Returns the last dossier file in the ordered set where dossierId = &#63; and dossierPartId = &#63; and groupFileId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param dossierPartId the dossier part ID
	* @param groupFileId the group file ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier file, or <code>null</code> if a matching dossier file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierFile fetchByD_DP_GF_Last(
		long dossierId, long dossierPartId, long groupFileId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByD_DP_GF_Last(dossierId, dossierPartId, groupFileId,
			orderByComparator);
	}

	/**
	* Returns the dossier files before and after the current dossier file in the ordered set where dossierId = &#63; and dossierPartId = &#63; and groupFileId = &#63;.
	*
	* @param dossierFileId the primary key of the current dossier file
	* @param dossierId the dossier ID
	* @param dossierPartId the dossier part ID
	* @param groupFileId the group file ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier file
	* @throws org.opencps.dossiermgt.NoSuchDossierFileException if a dossier file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierFile[] findByD_DP_GF_PrevAndNext(
		long dossierFileId, long dossierId, long dossierPartId,
		long groupFileId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierFileException {
		return getPersistence()
				   .findByD_DP_GF_PrevAndNext(dossierFileId, dossierId,
			dossierPartId, groupFileId, orderByComparator);
	}

	/**
	* Removes all the dossier files where dossierId = &#63; and dossierPartId = &#63; and groupFileId = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param dossierPartId the dossier part ID
	* @param groupFileId the group file ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByD_DP_GF(long dossierId, long dossierPartId,
		long groupFileId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByD_DP_GF(dossierId, dossierPartId, groupFileId);
	}

	/**
	* Returns the number of dossier files where dossierId = &#63; and dossierPartId = &#63; and groupFileId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param dossierPartId the dossier part ID
	* @param groupFileId the group file ID
	* @return the number of matching dossier files
	* @throws SystemException if a system exception occurred
	*/
	public static int countByD_DP_GF(long dossierId, long dossierPartId,
		long groupFileId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByD_DP_GF(dossierId, dossierPartId, groupFileId);
	}

	/**
	* Returns the dossier file where dossierId = &#63; and dossierPartId = &#63; and groupFileId = &#63; or throws a {@link org.opencps.dossiermgt.NoSuchDossierFileException} if it could not be found.
	*
	* @param dossierId the dossier ID
	* @param dossierPartId the dossier part ID
	* @param groupFileId the group file ID
	* @return the matching dossier file
	* @throws org.opencps.dossiermgt.NoSuchDossierFileException if a matching dossier file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierFile findByDossierFileInUseByGroupFileId(
		long dossierId, long dossierPartId, long groupFileId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierFileException {
		return getPersistence()
				   .findByDossierFileInUseByGroupFileId(dossierId,
			dossierPartId, groupFileId);
	}

	/**
	* Returns the dossier file where dossierId = &#63; and dossierPartId = &#63; and groupFileId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param dossierId the dossier ID
	* @param dossierPartId the dossier part ID
	* @param groupFileId the group file ID
	* @return the matching dossier file, or <code>null</code> if a matching dossier file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierFile fetchByDossierFileInUseByGroupFileId(
		long dossierId, long dossierPartId, long groupFileId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDossierFileInUseByGroupFileId(dossierId,
			dossierPartId, groupFileId);
	}

	/**
	* Returns the dossier file where dossierId = &#63; and dossierPartId = &#63; and groupFileId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param dossierId the dossier ID
	* @param dossierPartId the dossier part ID
	* @param groupFileId the group file ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dossier file, or <code>null</code> if a matching dossier file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierFile fetchByDossierFileInUseByGroupFileId(
		long dossierId, long dossierPartId, long groupFileId,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDossierFileInUseByGroupFileId(dossierId,
			dossierPartId, groupFileId, retrieveFromCache);
	}

	/**
	* Removes the dossier file where dossierId = &#63; and dossierPartId = &#63; and groupFileId = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param dossierPartId the dossier part ID
	* @param groupFileId the group file ID
	* @return the dossier file that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierFile removeByDossierFileInUseByGroupFileId(
		long dossierId, long dossierPartId, long groupFileId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierFileException {
		return getPersistence()
				   .removeByDossierFileInUseByGroupFileId(dossierId,
			dossierPartId, groupFileId);
	}

	/**
	* Returns the number of dossier files where dossierId = &#63; and dossierPartId = &#63; and groupFileId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param dossierPartId the dossier part ID
	* @param groupFileId the group file ID
	* @return the number of matching dossier files
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDossierFileInUseByGroupFileId(long dossierId,
		long dossierPartId, long groupFileId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByDossierFileInUseByGroupFileId(dossierId,
			dossierPartId, groupFileId);
	}

	/**
	* Returns all the dossier files where dossierId = &#63; and templateFileNo = &#63;.
	*
	* @param dossierId the dossier ID
	* @param templateFileNo the template file no
	* @return the matching dossier files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.DossierFile> findByTemplateFileNoDossierId(
		long dossierId, java.lang.String templateFileNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTemplateFileNoDossierId(dossierId, templateFileNo);
	}

	/**
	* Returns a range of all the dossier files where dossierId = &#63; and templateFileNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param templateFileNo the template file no
	* @param start the lower bound of the range of dossier files
	* @param end the upper bound of the range of dossier files (not inclusive)
	* @return the range of matching dossier files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.DossierFile> findByTemplateFileNoDossierId(
		long dossierId, java.lang.String templateFileNo, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTemplateFileNoDossierId(dossierId, templateFileNo,
			start, end);
	}

	/**
	* Returns an ordered range of all the dossier files where dossierId = &#63; and templateFileNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param templateFileNo the template file no
	* @param start the lower bound of the range of dossier files
	* @param end the upper bound of the range of dossier files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.DossierFile> findByTemplateFileNoDossierId(
		long dossierId, java.lang.String templateFileNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTemplateFileNoDossierId(dossierId, templateFileNo,
			start, end, orderByComparator);
	}

	/**
	* Returns the first dossier file in the ordered set where dossierId = &#63; and templateFileNo = &#63;.
	*
	* @param dossierId the dossier ID
	* @param templateFileNo the template file no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier file
	* @throws org.opencps.dossiermgt.NoSuchDossierFileException if a matching dossier file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierFile findByTemplateFileNoDossierId_First(
		long dossierId, java.lang.String templateFileNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierFileException {
		return getPersistence()
				   .findByTemplateFileNoDossierId_First(dossierId,
			templateFileNo, orderByComparator);
	}

	/**
	* Returns the first dossier file in the ordered set where dossierId = &#63; and templateFileNo = &#63;.
	*
	* @param dossierId the dossier ID
	* @param templateFileNo the template file no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier file, or <code>null</code> if a matching dossier file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierFile fetchByTemplateFileNoDossierId_First(
		long dossierId, java.lang.String templateFileNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTemplateFileNoDossierId_First(dossierId,
			templateFileNo, orderByComparator);
	}

	/**
	* Returns the last dossier file in the ordered set where dossierId = &#63; and templateFileNo = &#63;.
	*
	* @param dossierId the dossier ID
	* @param templateFileNo the template file no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier file
	* @throws org.opencps.dossiermgt.NoSuchDossierFileException if a matching dossier file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierFile findByTemplateFileNoDossierId_Last(
		long dossierId, java.lang.String templateFileNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierFileException {
		return getPersistence()
				   .findByTemplateFileNoDossierId_Last(dossierId,
			templateFileNo, orderByComparator);
	}

	/**
	* Returns the last dossier file in the ordered set where dossierId = &#63; and templateFileNo = &#63;.
	*
	* @param dossierId the dossier ID
	* @param templateFileNo the template file no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier file, or <code>null</code> if a matching dossier file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierFile fetchByTemplateFileNoDossierId_Last(
		long dossierId, java.lang.String templateFileNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTemplateFileNoDossierId_Last(dossierId,
			templateFileNo, orderByComparator);
	}

	/**
	* Returns the dossier files before and after the current dossier file in the ordered set where dossierId = &#63; and templateFileNo = &#63;.
	*
	* @param dossierFileId the primary key of the current dossier file
	* @param dossierId the dossier ID
	* @param templateFileNo the template file no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier file
	* @throws org.opencps.dossiermgt.NoSuchDossierFileException if a dossier file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierFile[] findByTemplateFileNoDossierId_PrevAndNext(
		long dossierFileId, long dossierId, java.lang.String templateFileNo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierFileException {
		return getPersistence()
				   .findByTemplateFileNoDossierId_PrevAndNext(dossierFileId,
			dossierId, templateFileNo, orderByComparator);
	}

	/**
	* Removes all the dossier files where dossierId = &#63; and templateFileNo = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param templateFileNo the template file no
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByTemplateFileNoDossierId(long dossierId,
		java.lang.String templateFileNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByTemplateFileNoDossierId(dossierId, templateFileNo);
	}

	/**
	* Returns the number of dossier files where dossierId = &#63; and templateFileNo = &#63;.
	*
	* @param dossierId the dossier ID
	* @param templateFileNo the template file no
	* @return the number of matching dossier files
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTemplateFileNoDossierId(long dossierId,
		java.lang.String templateFileNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByTemplateFileNoDossierId(dossierId, templateFileNo);
	}

	/**
	* Returns the dossier file where oid = &#63; or throws a {@link org.opencps.dossiermgt.NoSuchDossierFileException} if it could not be found.
	*
	* @param oid the oid
	* @return the matching dossier file
	* @throws org.opencps.dossiermgt.NoSuchDossierFileException if a matching dossier file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierFile findByOid(
		java.lang.String oid)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierFileException {
		return getPersistence().findByOid(oid);
	}

	/**
	* Returns the dossier file where oid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param oid the oid
	* @return the matching dossier file, or <code>null</code> if a matching dossier file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierFile fetchByOid(
		java.lang.String oid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByOid(oid);
	}

	/**
	* Returns the dossier file where oid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param oid the oid
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dossier file, or <code>null</code> if a matching dossier file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierFile fetchByOid(
		java.lang.String oid, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByOid(oid, retrieveFromCache);
	}

	/**
	* Removes the dossier file where oid = &#63; from the database.
	*
	* @param oid the oid
	* @return the dossier file that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierFile removeByOid(
		java.lang.String oid)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierFileException {
		return getPersistence().removeByOid(oid);
	}

	/**
	* Returns the number of dossier files where oid = &#63;.
	*
	* @param oid the oid
	* @return the number of matching dossier files
	* @throws SystemException if a system exception occurred
	*/
	public static int countByOid(java.lang.String oid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByOid(oid);
	}

	/**
	* Returns all the dossier files where dossierId = &#63; and syncStatus = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param syncStatus the sync status
	* @param removed the removed
	* @return the matching dossier files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.DossierFile> findByD_S_R(
		long dossierId, int syncStatus, int removed)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByD_S_R(dossierId, syncStatus, removed);
	}

	/**
	* Returns a range of all the dossier files where dossierId = &#63; and syncStatus = &#63; and removed = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param syncStatus the sync status
	* @param removed the removed
	* @param start the lower bound of the range of dossier files
	* @param end the upper bound of the range of dossier files (not inclusive)
	* @return the range of matching dossier files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.DossierFile> findByD_S_R(
		long dossierId, int syncStatus, int removed, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByD_S_R(dossierId, syncStatus, removed, start, end);
	}

	/**
	* Returns an ordered range of all the dossier files where dossierId = &#63; and syncStatus = &#63; and removed = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param syncStatus the sync status
	* @param removed the removed
	* @param start the lower bound of the range of dossier files
	* @param end the upper bound of the range of dossier files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.DossierFile> findByD_S_R(
		long dossierId, int syncStatus, int removed, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByD_S_R(dossierId, syncStatus, removed, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dossier file in the ordered set where dossierId = &#63; and syncStatus = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param syncStatus the sync status
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier file
	* @throws org.opencps.dossiermgt.NoSuchDossierFileException if a matching dossier file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierFile findByD_S_R_First(
		long dossierId, int syncStatus, int removed,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierFileException {
		return getPersistence()
				   .findByD_S_R_First(dossierId, syncStatus, removed,
			orderByComparator);
	}

	/**
	* Returns the first dossier file in the ordered set where dossierId = &#63; and syncStatus = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param syncStatus the sync status
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier file, or <code>null</code> if a matching dossier file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierFile fetchByD_S_R_First(
		long dossierId, int syncStatus, int removed,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByD_S_R_First(dossierId, syncStatus, removed,
			orderByComparator);
	}

	/**
	* Returns the last dossier file in the ordered set where dossierId = &#63; and syncStatus = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param syncStatus the sync status
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier file
	* @throws org.opencps.dossiermgt.NoSuchDossierFileException if a matching dossier file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierFile findByD_S_R_Last(
		long dossierId, int syncStatus, int removed,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierFileException {
		return getPersistence()
				   .findByD_S_R_Last(dossierId, syncStatus, removed,
			orderByComparator);
	}

	/**
	* Returns the last dossier file in the ordered set where dossierId = &#63; and syncStatus = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param syncStatus the sync status
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier file, or <code>null</code> if a matching dossier file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierFile fetchByD_S_R_Last(
		long dossierId, int syncStatus, int removed,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByD_S_R_Last(dossierId, syncStatus, removed,
			orderByComparator);
	}

	/**
	* Returns the dossier files before and after the current dossier file in the ordered set where dossierId = &#63; and syncStatus = &#63; and removed = &#63;.
	*
	* @param dossierFileId the primary key of the current dossier file
	* @param dossierId the dossier ID
	* @param syncStatus the sync status
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier file
	* @throws org.opencps.dossiermgt.NoSuchDossierFileException if a dossier file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierFile[] findByD_S_R_PrevAndNext(
		long dossierFileId, long dossierId, int syncStatus, int removed,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierFileException {
		return getPersistence()
				   .findByD_S_R_PrevAndNext(dossierFileId, dossierId,
			syncStatus, removed, orderByComparator);
	}

	/**
	* Removes all the dossier files where dossierId = &#63; and syncStatus = &#63; and removed = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param syncStatus the sync status
	* @param removed the removed
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByD_S_R(long dossierId, int syncStatus, int removed)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByD_S_R(dossierId, syncStatus, removed);
	}

	/**
	* Returns the number of dossier files where dossierId = &#63; and syncStatus = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param syncStatus the sync status
	* @param removed the removed
	* @return the number of matching dossier files
	* @throws SystemException if a system exception occurred
	*/
	public static int countByD_S_R(long dossierId, int syncStatus, int removed)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByD_S_R(dossierId, syncStatus, removed);
	}

	/**
	* Returns all the dossier files where groupFileId = &#63; and dossierId = &#63; and syncStatus = &#63; and removed = &#63;.
	*
	* @param groupFileId the group file ID
	* @param dossierId the dossier ID
	* @param syncStatus the sync status
	* @param removed the removed
	* @return the matching dossier files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.DossierFile> findByF_D_S_R(
		long groupFileId, long dossierId, int syncStatus, int removed)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByF_D_S_R(groupFileId, dossierId, syncStatus, removed);
	}

	/**
	* Returns a range of all the dossier files where groupFileId = &#63; and dossierId = &#63; and syncStatus = &#63; and removed = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupFileId the group file ID
	* @param dossierId the dossier ID
	* @param syncStatus the sync status
	* @param removed the removed
	* @param start the lower bound of the range of dossier files
	* @param end the upper bound of the range of dossier files (not inclusive)
	* @return the range of matching dossier files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.DossierFile> findByF_D_S_R(
		long groupFileId, long dossierId, int syncStatus, int removed,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByF_D_S_R(groupFileId, dossierId, syncStatus, removed,
			start, end);
	}

	/**
	* Returns an ordered range of all the dossier files where groupFileId = &#63; and dossierId = &#63; and syncStatus = &#63; and removed = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupFileId the group file ID
	* @param dossierId the dossier ID
	* @param syncStatus the sync status
	* @param removed the removed
	* @param start the lower bound of the range of dossier files
	* @param end the upper bound of the range of dossier files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.DossierFile> findByF_D_S_R(
		long groupFileId, long dossierId, int syncStatus, int removed,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByF_D_S_R(groupFileId, dossierId, syncStatus, removed,
			start, end, orderByComparator);
	}

	/**
	* Returns the first dossier file in the ordered set where groupFileId = &#63; and dossierId = &#63; and syncStatus = &#63; and removed = &#63;.
	*
	* @param groupFileId the group file ID
	* @param dossierId the dossier ID
	* @param syncStatus the sync status
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier file
	* @throws org.opencps.dossiermgt.NoSuchDossierFileException if a matching dossier file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierFile findByF_D_S_R_First(
		long groupFileId, long dossierId, int syncStatus, int removed,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierFileException {
		return getPersistence()
				   .findByF_D_S_R_First(groupFileId, dossierId, syncStatus,
			removed, orderByComparator);
	}

	/**
	* Returns the first dossier file in the ordered set where groupFileId = &#63; and dossierId = &#63; and syncStatus = &#63; and removed = &#63;.
	*
	* @param groupFileId the group file ID
	* @param dossierId the dossier ID
	* @param syncStatus the sync status
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier file, or <code>null</code> if a matching dossier file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierFile fetchByF_D_S_R_First(
		long groupFileId, long dossierId, int syncStatus, int removed,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByF_D_S_R_First(groupFileId, dossierId, syncStatus,
			removed, orderByComparator);
	}

	/**
	* Returns the last dossier file in the ordered set where groupFileId = &#63; and dossierId = &#63; and syncStatus = &#63; and removed = &#63;.
	*
	* @param groupFileId the group file ID
	* @param dossierId the dossier ID
	* @param syncStatus the sync status
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier file
	* @throws org.opencps.dossiermgt.NoSuchDossierFileException if a matching dossier file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierFile findByF_D_S_R_Last(
		long groupFileId, long dossierId, int syncStatus, int removed,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierFileException {
		return getPersistence()
				   .findByF_D_S_R_Last(groupFileId, dossierId, syncStatus,
			removed, orderByComparator);
	}

	/**
	* Returns the last dossier file in the ordered set where groupFileId = &#63; and dossierId = &#63; and syncStatus = &#63; and removed = &#63;.
	*
	* @param groupFileId the group file ID
	* @param dossierId the dossier ID
	* @param syncStatus the sync status
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier file, or <code>null</code> if a matching dossier file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierFile fetchByF_D_S_R_Last(
		long groupFileId, long dossierId, int syncStatus, int removed,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByF_D_S_R_Last(groupFileId, dossierId, syncStatus,
			removed, orderByComparator);
	}

	/**
	* Returns the dossier files before and after the current dossier file in the ordered set where groupFileId = &#63; and dossierId = &#63; and syncStatus = &#63; and removed = &#63;.
	*
	* @param dossierFileId the primary key of the current dossier file
	* @param groupFileId the group file ID
	* @param dossierId the dossier ID
	* @param syncStatus the sync status
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier file
	* @throws org.opencps.dossiermgt.NoSuchDossierFileException if a dossier file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierFile[] findByF_D_S_R_PrevAndNext(
		long dossierFileId, long groupFileId, long dossierId, int syncStatus,
		int removed,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierFileException {
		return getPersistence()
				   .findByF_D_S_R_PrevAndNext(dossierFileId, groupFileId,
			dossierId, syncStatus, removed, orderByComparator);
	}

	/**
	* Removes all the dossier files where groupFileId = &#63; and dossierId = &#63; and syncStatus = &#63; and removed = &#63; from the database.
	*
	* @param groupFileId the group file ID
	* @param dossierId the dossier ID
	* @param syncStatus the sync status
	* @param removed the removed
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByF_D_S_R(long groupFileId, long dossierId,
		int syncStatus, int removed)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByF_D_S_R(groupFileId, dossierId, syncStatus, removed);
	}

	/**
	* Returns the number of dossier files where groupFileId = &#63; and dossierId = &#63; and syncStatus = &#63; and removed = &#63;.
	*
	* @param groupFileId the group file ID
	* @param dossierId the dossier ID
	* @param syncStatus the sync status
	* @param removed the removed
	* @return the number of matching dossier files
	* @throws SystemException if a system exception occurred
	*/
	public static int countByF_D_S_R(long groupFileId, long dossierId,
		int syncStatus, int removed)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByF_D_S_R(groupFileId, dossierId, syncStatus, removed);
	}

	/**
	* Caches the dossier file in the entity cache if it is enabled.
	*
	* @param dossierFile the dossier file
	*/
	public static void cacheResult(
		org.opencps.dossiermgt.model.DossierFile dossierFile) {
		getPersistence().cacheResult(dossierFile);
	}

	/**
	* Caches the dossier files in the entity cache if it is enabled.
	*
	* @param dossierFiles the dossier files
	*/
	public static void cacheResult(
		java.util.List<org.opencps.dossiermgt.model.DossierFile> dossierFiles) {
		getPersistence().cacheResult(dossierFiles);
	}

	/**
	* Creates a new dossier file with the primary key. Does not add the dossier file to the database.
	*
	* @param dossierFileId the primary key for the new dossier file
	* @return the new dossier file
	*/
	public static org.opencps.dossiermgt.model.DossierFile create(
		long dossierFileId) {
		return getPersistence().create(dossierFileId);
	}

	/**
	* Removes the dossier file with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierFileId the primary key of the dossier file
	* @return the dossier file that was removed
	* @throws org.opencps.dossiermgt.NoSuchDossierFileException if a dossier file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierFile remove(
		long dossierFileId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierFileException {
		return getPersistence().remove(dossierFileId);
	}

	public static org.opencps.dossiermgt.model.DossierFile updateImpl(
		org.opencps.dossiermgt.model.DossierFile dossierFile)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dossierFile);
	}

	/**
	* Returns the dossier file with the primary key or throws a {@link org.opencps.dossiermgt.NoSuchDossierFileException} if it could not be found.
	*
	* @param dossierFileId the primary key of the dossier file
	* @return the dossier file
	* @throws org.opencps.dossiermgt.NoSuchDossierFileException if a dossier file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierFile findByPrimaryKey(
		long dossierFileId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierFileException {
		return getPersistence().findByPrimaryKey(dossierFileId);
	}

	/**
	* Returns the dossier file with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param dossierFileId the primary key of the dossier file
	* @return the dossier file, or <code>null</code> if a dossier file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.DossierFile fetchByPrimaryKey(
		long dossierFileId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(dossierFileId);
	}

	/**
	* Returns all the dossier files.
	*
	* @return the dossier files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.DossierFile> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dossier files.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier files
	* @param end the upper bound of the range of dossier files (not inclusive)
	* @return the range of dossier files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.DossierFile> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dossier files.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier files
	* @param end the upper bound of the range of dossier files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dossier files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.dossiermgt.model.DossierFile> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dossier files from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dossier files.
	*
	* @return the number of dossier files
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DossierFilePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DossierFilePersistence)PortletBeanLocatorUtil.locate(org.opencps.dossiermgt.service.ClpSerializer.getServletContextName(),
					DossierFilePersistence.class.getName());

			ReferenceRegistry.registerReference(DossierFileUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DossierFilePersistence persistence) {
	}

	private static DossierFilePersistence _persistence;
}