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

package org.opencps.dossiermgt.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * Provides the local service interface for Dossier. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author trungnt
 * @see DossierLocalServiceUtil
 * @see org.opencps.dossiermgt.service.base.DossierLocalServiceBaseImpl
 * @see org.opencps.dossiermgt.service.impl.DossierLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface DossierLocalService extends BaseLocalService,
	InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DossierLocalServiceUtil} to access the dossier local service. Add custom service methods to {@link org.opencps.dossiermgt.service.impl.DossierLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the dossier to the database. Also notifies the appropriate model listeners.
	*
	* @param dossier the dossier
	* @return the dossier that was added
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.opencps.dossiermgt.model.Dossier addDossier(
		org.opencps.dossiermgt.model.Dossier dossier)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new dossier with the primary key. Does not add the dossier to the database.
	*
	* @param dossierId the primary key for the new dossier
	* @return the new dossier
	*/
	public org.opencps.dossiermgt.model.Dossier createDossier(long dossierId);

	/**
	* Deletes the dossier with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierId the primary key of the dossier
	* @return the dossier that was removed
	* @throws PortalException if a dossier with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
	public org.opencps.dossiermgt.model.Dossier deleteDossier(long dossierId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the dossier from the database. Also notifies the appropriate model listeners.
	*
	* @param dossier the dossier
	* @return the dossier that was removed
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
	public org.opencps.dossiermgt.model.Dossier deleteDossier(
		org.opencps.dossiermgt.model.Dossier dossier)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.opencps.dossiermgt.model.Dossier fetchDossier(long dossierId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossier with the primary key.
	*
	* @param dossierId the primary key of the dossier
	* @return the dossier
	* @throws PortalException if a dossier with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.opencps.dossiermgt.model.Dossier getDossier(long dossierId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.opencps.dossiermgt.model.Dossier> getDossiers(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dossiers.
	*
	* @return the number of dossiers
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getDossiersCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the dossier in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dossier the dossier
	* @return the dossier that was updated
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.opencps.dossiermgt.model.Dossier updateDossier(
		org.opencps.dossiermgt.model.Dossier dossier)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable;

	/**
	* @param userId
	* @param ownerOrganizationId
	* @param dossierTemplateId
	* @param templateFileNo
	* @param serviceConfigId
	* @param serviceInfoId
	* @param serviceDomainIndex
	* @param govAgencyOrganizationId
	* @param govAgencyCode
	* @param govAgencyName
	* @param serviceMode
	* @param serviceAdministrationIndex
	* @param cityCode
	* @param cityName
	* @param districtCode
	* @param districtName
	* @param wardName
	* @param wardCode
	* @param subjectName
	* @param subjectId
	* @param address
	* @param contactName
	* @param contactTelNo
	* @param contactEmail
	* @param note
	* @param dossierSource
	* @param dossierStatus
	* @param parentFolderId
	* @param serviceContext
	* @return
	* @throws SystemException
	* @throws PortalException
	*/
	public org.opencps.dossiermgt.model.Dossier addDossier(long userId,
		long ownerOrganizationId, long dossierTemplateId,
		java.lang.String templateFileNo, long serviceConfigId,
		long serviceInfoId, java.lang.String serviceDomainIndex,
		long govAgencyOrganizationId, java.lang.String govAgencyCode,
		java.lang.String govAgencyName, int serviceMode,
		java.lang.String serviceAdministrationIndex, java.lang.String cityCode,
		java.lang.String cityName, java.lang.String districtCode,
		java.lang.String districtName, java.lang.String wardName,
		java.lang.String wardCode, java.lang.String subjectName,
		java.lang.String subjectId, java.lang.String address,
		java.lang.String contactName, java.lang.String contactTelNo,
		java.lang.String contactEmail, java.lang.String note,
		int dossierSource, java.lang.String dossierStatus, long parentFolderId,
		java.lang.String redirectPaymentURL,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* @param groupId
	* @return
	* @throws SystemException
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @param dossierStatus
	* @param serviceNo
	* @param fromDate
	* @param toDate
	* @param username
	* @return
	*/
	public int countDossierByDS_RD_SN_U(java.lang.String dossierStatus,
		java.lang.String serviceNo, java.lang.String fromDate,
		java.lang.String toDate, java.lang.String username);

	/**
	* @param groupId
	* @param keyword
	* @param domainCode
	* @param dossierStatus
	* @return
	*/
	public int countDossierByKeywordDomainAndStatus(long groupId,
		java.lang.String keyword, java.lang.String domainCode,
		java.util.List<java.lang.String> govAgencyCodes,
		java.lang.String dossierStatus);

	/**
	* @param processNo
	* @param processStepNo
	* @param username
	* @return
	*/
	public int countDossierByP_PS_U(java.lang.String processNo,
		java.lang.String processStepNo, java.lang.String username)
		throws com.liferay.portal.NoSuchUserException;

	/**
	* @param processNo
	* @param stepNo
	* @param username
	* @return
	*/
	public int countDossierByP_S_U(java.lang.String processNo,
		java.lang.String stepNo, java.lang.String username);

	/**
	* @param processNo
	* @param stepName
	* @param username
	* @return
	*/
	public int countDossierByP_SN_U(java.lang.String processNo,
		java.lang.String stepName, java.lang.String username);

	/**
	* @param groupId
	* @param dossierStatus
	* @return
	* @throws SystemException
	*/
	public int countDossierByStatus(long groupId, java.lang.String dossierStatus)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @param groupId
	* @param userId
	* @param keyword
	* @param serviceDomainTreeIndex
	* @param dossierStatus
	* @return
	*/
	public int countDossierByUser(long groupId, long userId,
		java.lang.String keyword, java.lang.String serviceDomainTreeIndex,
		java.lang.String dossierStatus);

	/**
	* @param username
	* @return
	*/
	public int countDossierByUserAssignProcessOrder(java.lang.String username)
		throws com.liferay.portal.NoSuchUserException;

	/**
	* @param dossiertype
	* @param organizationcode
	* @param status
	* @param fromdate
	* @param todate
	* @param documentyear
	* @param customername
	* @return
	*/
	public int countDossierForRemoteService(java.lang.String dossiertype,
		java.lang.String organizationcode, java.lang.String processStepId,
		java.lang.String status, java.lang.String fromdate,
		java.lang.String todate, int documentyear, java.lang.String customername);

	/**
	* @param dossierId
	* @param accountFolder
	* @throws NoSuchDossierException
	* @throws SystemException
	* @throws PortalException
	*/
	public void deleteDossierByDossierId(long dossierId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException;

	/**
	* @param dossierId
	* @param accountFolder
	* @throws NoSuchDossierException
	* @throws SystemException
	* @throws PortalException
	*/
	public void deleteDossierByDossierId(long dossierId,
		com.liferay.portlet.documentlibrary.model.DLFolder accountFolder)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException;

	/**
	* @param userId
	* @param dossierId
	* @throws NoSuchDossierException
	* @throws SystemException
	* @throws PortalException
	*/
	public void deleteDossierByDossierId(long userId, long dossierId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.opencps.dossiermgt.model.Dossier getByoid(java.lang.String oid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @param delayStatus
	* @return
	* @throws SystemException
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.opencps.dossiermgt.model.Dossier> getDossierByDelayStatus(
		int delayStatus)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @param delayStatus
	* @param dossierStatus
	* @return
	* @throws SystemException
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.opencps.dossiermgt.model.Dossier> getDossierByDelayStatusAndNotDossierStatus(
		int delayStatus, java.lang.String dossierStatus)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @param groupId
	* @return
	* @throws SystemException
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.opencps.dossiermgt.model.Dossier> getDossierByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @param receptionNo
	* @return
	* @throws SystemException
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.opencps.dossiermgt.model.Dossier getDossierByReceptionNo(
		java.lang.String receptionNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @param groupId
	* @param dossierStatus
	* @param start
	* @param end
	* @param obc
	* @return
	* @throws SystemException
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.opencps.dossiermgt.model.Dossier> getDossierByStatus(
		long groupId, java.lang.String dossierStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.opencps.dossiermgt.model.Dossier> getDossierByStatus(
		long groupId, java.lang.String dossierStatus)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @param groupId
	* @param userId
	* @param keyword
	* @param serviceDomainTreeIndex
	* @param dossierStatus
	* @param start
	* @param end
	* @param obc
	* @return
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getDossierByUser(long groupId, long userId,
		java.lang.String keyword, java.lang.String serviceDomainTreeIndex,
		java.lang.String dossierStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc);

	/**
	* @param dossierStatus
	* @param serviceNo
	* @param fromDate
	* @param toDate
	* @param username
	* @return
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.opencps.dossiermgt.model.Dossier> searchDossierByDS_RD_SN_U(
		java.lang.String dossierStatus, java.lang.String serviceNo,
		java.lang.String fromDate, java.lang.String toDate,
		java.lang.String username, int start, int end);

	/**
	* @param groupId
	* @param keyword
	* @param domainCode
	* @param dossierStatus
	* @param start
	* @param end
	* @param obc
	* @return
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.opencps.dossiermgt.model.Dossier> searchDossierByKeywordDomainAndStatus(
		long groupId, java.lang.String keyword, java.lang.String domainCode,
		java.util.List<java.lang.String> govAgencyCodes,
		java.lang.String dossierStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc);

	/**
	* @param processNo
	* @param processStepNo
	* @param username
	* @return
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.opencps.dossiermgt.model.Dossier> searchDossierByP_PS_U(
		java.lang.String processNo, java.lang.String processStepNo,
		java.lang.String username, int start, int end)
		throws com.liferay.portal.NoSuchUserException;

	/**
	* @param processNo
	* @param stepNo
	* @param username
	* @return
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.opencps.dossiermgt.model.Dossier> searchDossierByP_S_U(
		java.lang.String processNo, java.lang.String stepNo,
		java.lang.String username, int start, int end);

	/**
	* @param processNo
	* @param stepName
	* @param username
	* @return
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.opencps.dossiermgt.model.Dossier> searchDossierByP_SN_U(
		java.lang.String processNo, java.lang.String stepName,
		java.lang.String username, int start, int end);

	/**
	* @param username
	* @return
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.opencps.dossiermgt.model.Dossier> searchDossierByUserAssignProcessOrder(
		java.lang.String username, int start, int end)
		throws com.liferay.portal.NoSuchUserException;

	/**
	* @param dossiertype
	* @param organizationcode
	* @param status
	* @param fromdate
	* @param todate
	* @param documentyear
	* @param customername
	* @return
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.opencps.dossiermgt.model.Dossier> searchDossierForRemoteService(
		java.lang.String dossiertype, java.lang.String organizationcode,
		java.lang.String processStepId, java.lang.String status,
		java.lang.String fromdate, java.lang.String todate, int documentyear,
		java.lang.String customername, int start, int end);

	/**
	* @param syncDossier
	* @param syncDossierFiles
	* @param syncFileGroups
	* @param syncFileGroupDossierPaths
	* @param syncDLFileEntries
	* @param data
	* @param syncDossierTemplate
	* @param serviceContext
	* @return
	* @throws SystemException
	* @throws PortalException
	* @throws Exception
	*/
	public org.opencps.dossiermgt.model.Dossier syncDossier(
		org.opencps.dossiermgt.model.Dossier syncDossier,
		java.util.LinkedHashMap<org.opencps.dossiermgt.model.DossierFile, org.opencps.dossiermgt.model.DossierPart> syncDossierFiles,
		java.util.LinkedHashMap<java.lang.String, org.opencps.dossiermgt.model.FileGroup> syncFileGroups,
		java.util.LinkedHashMap<java.lang.Long, org.opencps.dossiermgt.model.DossierPart> syncFileGroupDossierParts,
		java.util.LinkedHashMap<java.lang.String, com.liferay.portlet.documentlibrary.model.DLFileEntry> syncDLFileEntries,
		java.util.LinkedHashMap<java.lang.String, byte[]> data,
		org.opencps.dossiermgt.model.DossierTemplate syncDossierTemplate,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* @param oid
	* @param fileGroupId
	* @param dossierStatus
	* @param receptionNo
	* @param estimateDatetime
	* @param receiveDatetime
	* @param finishDatetime
	* @param actor
	* @param requestCommand
	* @param actionInfo
	* @param messageInfo
	* @param syncDossierFiles
	* @param syncFileGroups
	* @param syncFileGroupDossierParts
	* @param syncDLFileEntries
	* @param data
	* @param paymentFile
	* @param serviceContext
	* @return
	* @throws SystemException
	* @throws PortalException
	*/
	public org.opencps.dossiermgt.model.Dossier syncDossierStatus(
		java.lang.String oid, long fileGroupId, java.lang.String dossierStatus,
		java.lang.String receptionNo, java.util.Date estimateDatetime,
		java.util.Date receiveDatetime, java.util.Date finishDatetime,
		int actor, long actorId, java.lang.String actorName,
		java.lang.String requestCommand, java.lang.String actionInfo,
		java.lang.String messageInfo,
		java.util.LinkedHashMap<org.opencps.dossiermgt.model.DossierFile, org.opencps.dossiermgt.model.DossierPart> syncDossierFiles,
		java.util.LinkedHashMap<java.lang.String, org.opencps.dossiermgt.model.FileGroup> syncFileGroups,
		java.util.LinkedHashMap<java.lang.Long, org.opencps.dossiermgt.model.DossierPart> syncFileGroupDossierParts,
		java.util.LinkedHashMap<java.lang.String, com.liferay.portlet.documentlibrary.model.DLFileEntry> syncDLFileEntries,
		java.util.LinkedHashMap<java.lang.String, byte[]> data,
		org.opencps.paymentmgt.model.PaymentFile paymentFile,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* @param syncDossier
	* @param syncDossierFiles
	* @param syncFileGroups
	* @param syncFileGroupDossierParts
	* @param syncDLFileEntries
	* @param data
	* @param syncDossierTemplate
	* @param serviceContext
	* @return
	* @throws SystemException
	* @throws PortalException
	*/
	public org.opencps.dossiermgt.model.Dossier syncReSubmitDossier(
		org.opencps.dossiermgt.model.Dossier syncDossier,
		java.util.LinkedHashMap<org.opencps.dossiermgt.model.DossierFile, org.opencps.dossiermgt.model.DossierPart> syncDossierFiles,
		java.util.LinkedHashMap<java.lang.String, org.opencps.dossiermgt.model.FileGroup> syncFileGroups,
		java.util.LinkedHashMap<java.lang.Long, org.opencps.dossiermgt.model.DossierPart> syncFileGroupDossierParts,
		java.util.LinkedHashMap<java.lang.String, com.liferay.portlet.documentlibrary.model.DLFileEntry> syncDLFileEntries,
		java.util.LinkedHashMap<java.lang.String, byte[]> data,
		org.opencps.dossiermgt.model.DossierTemplate syncDossierTemplate,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* @param dossierId
	* @param userId
	* @param ownerOrganizationId
	* @param dossierTemplateId
	* @param templateFileNo
	* @param serviceConfigId
	* @param serviceInfoId
	* @param serviceDomainIndex
	* @param govAgencyOrganizationId
	* @param govAgencyCode
	* @param govAgencyName
	* @param serviceMode
	* @param serviceAdministrationIndex
	* @param cityCode
	* @param cityName
	* @param districtCode
	* @param districtName
	* @param wardName
	* @param wardCode
	* @param subjectName
	* @param subjectId
	* @param address
	* @param contactName
	* @param contactTelNo
	* @param contactEmail
	* @param note
	* @param dossierFolderId
	* @param serviceContext
	* @return
	* @throws SystemException
	* @throws PortalException
	*/
	public org.opencps.dossiermgt.model.Dossier updateDossier(long dossierId,
		long userId, long ownerOrganizationId, long dossierTemplateId,
		java.lang.String templateFileNo, long serviceConfigId,
		long serviceInfoId, java.lang.String serviceDomainIndex,
		long govAgencyOrganizationId, java.lang.String govAgencyCode,
		java.lang.String govAgencyName, int serviceMode,
		java.lang.String serviceAdministrationIndex, java.lang.String cityCode,
		java.lang.String cityName, java.lang.String districtCode,
		java.lang.String districtName, java.lang.String wardName,
		java.lang.String wardCode, java.lang.String subjectName,
		java.lang.String subjectId, java.lang.String address,
		java.lang.String contactName, java.lang.String contactTelNo,
		java.lang.String contactEmail, java.lang.String note,
		long dossierFolderId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* @param userId
	* @param groupId
	* @param companyId
	* @param dossierId
	* @param fileGroupId
	* @param receptionNo
	* @param estimateDatetime
	* @param receiveDatetime
	* @param finishDatetime
	* @param dossierStatus
	* @param actionInfo
	* @param messageInfo
	* @throws PortalException
	* @throws SystemException
	*/
	public void updateDossierStatus(long userId, long groupId, long companyId,
		long dossierId, long fileGroupId, java.lang.String receptionNo,
		java.util.Date estimateDatetime, java.util.Date receiveDatetime,
		java.util.Date finishDatetime, java.lang.String dossierStatus,
		java.lang.String actionInfo, java.lang.String messageInfo)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* @param userId
	* @param dossierId
	* @param govAgencyOrganizationId
	* @param status
	* @param syncStatus
	* @param fileGroupId
	* @param level
	* @param locale
	* @return
	* @throws SystemException
	* @throws NoSuchDossierStatusException
	* @throws PortalException
	*/
	public org.opencps.dossiermgt.model.Dossier updateDossierStatus(
		long userId, long dossierId, long govAgencyOrganizationId,
		java.lang.String status, int syncStatus, long fileGroupId, int level,
		java.util.Locale locale)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierStatusException;

	public org.opencps.dossiermgt.model.Dossier updateDossierStatus(
		long userId, long dossierId, long govAgencyOrganizationId,
		java.lang.String status, int syncStatus, long fileGroupId, int level,
		java.util.Locale locale, int actor, long actorId,
		java.lang.String actorName)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierStatusException;

	/**
	* @param dossierId
	* @param fileGroupId
	* @param dossierStatus
	* @param receptionNo
	* @param estimateDatetime
	* @param receiveDatetime
	* @param finishDatetime
	* @param actor
	* @param requestCommand
	* @param actionInfo
	* @param messageInfo
	* @return
	*/
	public boolean updateDossierStatus(long dossierId, long fileGroupId,
		java.lang.String dossierStatus, java.lang.String receptionNo,
		java.util.Date submitDatetime, java.util.Date estimateDatetime,
		java.util.Date receiveDatetime, java.util.Date finishDatetime,
		int actor, long actorId, java.lang.String actorName,
		java.lang.String requestCommand, java.lang.String actionInfo,
		java.lang.String messageInfo);

	/**
	* @param dossierId
	* @param fileGroupId
	* @param dossierStatus
	* @param actor
	* @param requestCommand
	* @param actionInfo
	* @param messageInfo
	* @param syncStatus
	* @param level
	* @throws SystemException
	* @throws PortalException
	*/
	public void updateDossierStatus(long dossierId, long fileGroupId,
		java.lang.String dossierStatus, int actor, long actorId,
		java.lang.String actorName, java.lang.String requestCommand,
		java.lang.String actionInfo, java.lang.String messageInfo,
		int syncStatus, int level)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* @param oId
	* @param fileGroupIds
	* @param syncStatus
	* @throws SystemException
	* @throws NoSuchDossierStatusException
	* @throws PortalException
	*/
	public void updateSyncStatus(java.lang.String oId,
		java.util.List<java.lang.Long> fileGroupIds, int syncStatus)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierStatusException;

	/**
	* @param serviceinfoId
	* @return
	* @throws SystemException
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.opencps.dossiermgt.model.Dossier> getDossiersByServiceInfo(
		long serviceinfoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.opencps.dossiermgt.model.Dossier> getDossierByG_DS_U(
		long groupId, java.lang.String dossierStatus, long userId, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	public int countDossierByG_DS_U(long groupId,
		java.lang.String dossierStatus, long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @param groupId
	* @param userId
	* @return
	*/
	public int countDossierByUserNewRequest(long groupId, long userId);

	/**
	* @param groupId
	* @param userId
	* @param start
	* @param end
	* @param obc
	* @return
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getDossierByUserNewRequest(long groupId, long userId,
		int start, int end, com.liferay.portal.kernel.util.OrderByComparator obc);
}