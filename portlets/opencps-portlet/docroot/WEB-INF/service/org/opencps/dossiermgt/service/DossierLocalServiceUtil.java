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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Dossier. This utility wraps
 * {@link org.opencps.dossiermgt.service.impl.DossierLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author trungnt
 * @see DossierLocalService
 * @see org.opencps.dossiermgt.service.base.DossierLocalServiceBaseImpl
 * @see org.opencps.dossiermgt.service.impl.DossierLocalServiceImpl
 * @generated
 */
public class DossierLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.opencps.dossiermgt.service.impl.DossierLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the dossier to the database. Also notifies the appropriate model listeners.
	*
	* @param dossier the dossier
	* @return the dossier that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.Dossier addDossier(
		org.opencps.dossiermgt.model.Dossier dossier)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDossier(dossier);
	}

	/**
	* Creates a new dossier with the primary key. Does not add the dossier to the database.
	*
	* @param dossierId the primary key for the new dossier
	* @return the new dossier
	*/
	public static org.opencps.dossiermgt.model.Dossier createDossier(
		long dossierId) {
		return getService().createDossier(dossierId);
	}

	/**
	* Deletes the dossier with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierId the primary key of the dossier
	* @return the dossier that was removed
	* @throws PortalException if a dossier with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.Dossier deleteDossier(
		long dossierId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDossier(dossierId);
	}

	/**
	* Deletes the dossier from the database. Also notifies the appropriate model listeners.
	*
	* @param dossier the dossier
	* @return the dossier that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.Dossier deleteDossier(
		org.opencps.dossiermgt.model.Dossier dossier)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDossier(dossier);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

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

	public static org.opencps.dossiermgt.model.Dossier fetchDossier(
		long dossierId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDossier(dossierId);
	}

	/**
	* Returns the dossier with the primary key.
	*
	* @param dossierId the primary key of the dossier
	* @return the dossier
	* @throws PortalException if a dossier with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.Dossier getDossier(
		long dossierId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDossier(dossierId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> getDossiers(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDossiers(start, end);
	}

	/**
	* Returns the number of dossiers.
	*
	* @return the number of dossiers
	* @throws SystemException if a system exception occurred
	*/
	public static int getDossiersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDossiersCount();
	}

	/**
	* Updates the dossier in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dossier the dossier
	* @return the dossier that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.dossiermgt.model.Dossier updateDossier(
		org.opencps.dossiermgt.model.Dossier dossier)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDossier(dossier);
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
	public static org.opencps.dossiermgt.model.Dossier addDossier(long userId,
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
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addDossier(userId, ownerOrganizationId, dossierTemplateId,
			templateFileNo, serviceConfigId, serviceInfoId, serviceDomainIndex,
			govAgencyOrganizationId, govAgencyCode, govAgencyName, serviceMode,
			serviceAdministrationIndex, cityCode, cityName, districtCode,
			districtName, wardName, wardCode, subjectName, subjectId, address,
			contactName, contactTelNo, contactEmail, note, dossierSource,
			dossierStatus, parentFolderId, redirectPaymentURL, serviceContext);
	}

	/**
	* @param groupId
	* @return
	* @throws SystemException
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByGroupId(groupId);
	}

	/**
	* @param dossierStatus
	* @param serviceNo
	* @param fromDate
	* @param toDate
	* @param username
	* @return
	*/
	public static int countDossierByDS_RD_SN_U(java.lang.String dossierStatus,
		java.lang.String serviceNo, java.lang.String fromDate,
		java.lang.String toDate, java.lang.String username) {
		return getService()
				   .countDossierByDS_RD_SN_U(dossierStatus, serviceNo,
			fromDate, toDate, username);
	}

	/**
	* @param groupId
	* @param keyword
	* @param domainCode
	* @param dossierStatus
	* @return
	*/
	public static int countDossierByKeywordDomainAndStatus(long groupId,
		java.lang.String keyword, java.lang.String domainCode,
		java.util.List<java.lang.String> govAgencyCodes,
		java.lang.String dossierStatus) {
		return getService()
				   .countDossierByKeywordDomainAndStatus(groupId, keyword,
			domainCode, govAgencyCodes, dossierStatus);
	}

	/**
	* @param processNo
	* @param processStepNo
	* @param username
	* @return
	*/
	public static int countDossierByP_PS_U(java.lang.String processNo,
		java.lang.String processStepNo, java.lang.String username)
		throws com.liferay.portal.NoSuchUserException {
		return getService()
				   .countDossierByP_PS_U(processNo, processStepNo, username);
	}

	/**
	* @param processNo
	* @param stepNo
	* @param username
	* @return
	*/
	public static int countDossierByP_S_U(java.lang.String processNo,
		java.lang.String stepNo, java.lang.String username) {
		return getService().countDossierByP_S_U(processNo, stepNo, username);
	}

	/**
	* @param processNo
	* @param stepName
	* @param username
	* @return
	*/
	public static int countDossierByP_SN_U(java.lang.String processNo,
		java.lang.String stepName, java.lang.String username) {
		return getService().countDossierByP_SN_U(processNo, stepName, username);
	}

	/**
	* @param groupId
	* @param dossierStatus
	* @return
	* @throws SystemException
	*/
	public static int countDossierByStatus(long groupId,
		java.lang.String dossierStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countDossierByStatus(groupId, dossierStatus);
	}

	/**
	* @param groupId
	* @param userId
	* @param keyword
	* @param serviceDomainTreeIndex
	* @param dossierStatus
	* @return
	*/
	public static int countDossierByUser(long groupId, long userId,
		java.lang.String keyword, java.lang.String serviceDomainTreeIndex,
		java.lang.String dossierStatus) {
		return getService()
				   .countDossierByUser(groupId, userId, keyword,
			serviceDomainTreeIndex, dossierStatus);
	}

	/**
	* @param username
	* @return
	*/
	public static int countDossierByUserAssignProcessOrder(
		java.lang.String username)
		throws com.liferay.portal.NoSuchUserException {
		return getService().countDossierByUserAssignProcessOrder(username);
	}

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
	public static int countDossierForRemoteService(
		java.lang.String dossiertype, java.lang.String organizationcode,
		java.lang.String processStepId, java.lang.String status,
		java.lang.String fromdate, java.lang.String todate, int documentyear,
		java.lang.String customername) {
		return getService()
				   .countDossierForRemoteService(dossiertype, organizationcode,
			processStepId, status, fromdate, todate, documentyear, customername);
	}

	/**
	* @param dossierId
	* @param accountFolder
	* @throws NoSuchDossierException
	* @throws SystemException
	* @throws PortalException
	*/
	public static void deleteDossierByDossierId(long dossierId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException {
		getService().deleteDossierByDossierId(dossierId);
	}

	/**
	* @param dossierId
	* @param accountFolder
	* @throws NoSuchDossierException
	* @throws SystemException
	* @throws PortalException
	*/
	public static void deleteDossierByDossierId(long dossierId,
		com.liferay.portlet.documentlibrary.model.DLFolder accountFolder)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException {
		getService().deleteDossierByDossierId(dossierId, accountFolder);
	}

	/**
	* @param userId
	* @param dossierId
	* @throws NoSuchDossierException
	* @throws SystemException
	* @throws PortalException
	*/
	public static void deleteDossierByDossierId(long userId, long dossierId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierException {
		getService().deleteDossierByDossierId(userId, dossierId);
	}

	public static org.opencps.dossiermgt.model.Dossier getByoid(
		java.lang.String oid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getByoid(oid);
	}

	/**
	* @param delayStatus
	* @return
	* @throws SystemException
	*/
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> getDossierByDelayStatus(
		int delayStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDossierByDelayStatus(delayStatus);
	}

	/**
	* @param delayStatus
	* @param dossierStatus
	* @return
	* @throws SystemException
	*/
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> getDossierByDelayStatusAndNotDossierStatus(
		int delayStatus, java.lang.String dossierStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getDossierByDelayStatusAndNotDossierStatus(delayStatus,
			dossierStatus);
	}

	/**
	* @param groupId
	* @return
	* @throws SystemException
	*/
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> getDossierByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDossierByGroupId(groupId);
	}

	/**
	* @param receptionNo
	* @return
	* @throws SystemException
	*/
	public static org.opencps.dossiermgt.model.Dossier getDossierByReceptionNo(
		java.lang.String receptionNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDossierByReceptionNo(receptionNo);
	}

	/**
	* @param groupId
	* @param dossierStatus
	* @param start
	* @param end
	* @param obc
	* @return
	* @throws SystemException
	*/
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> getDossierByStatus(
		long groupId, java.lang.String dossierStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getDossierByStatus(groupId, dossierStatus, start, end, obc);
	}

	public static java.util.List<org.opencps.dossiermgt.model.Dossier> getDossierByStatus(
		long groupId, java.lang.String dossierStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDossierByStatus(groupId, dossierStatus);
	}

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
	public static java.util.List getDossierByUser(long groupId, long userId,
		java.lang.String keyword, java.lang.String serviceDomainTreeIndex,
		java.lang.String dossierStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc) {
		return getService()
				   .getDossierByUser(groupId, userId, keyword,
			serviceDomainTreeIndex, dossierStatus, start, end, obc);
	}

	/**
	* @param dossierStatus
	* @param serviceNo
	* @param fromDate
	* @param toDate
	* @param username
	* @return
	*/
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> searchDossierByDS_RD_SN_U(
		java.lang.String dossierStatus, java.lang.String serviceNo,
		java.lang.String fromDate, java.lang.String toDate,
		java.lang.String username, int start, int end) {
		return getService()
				   .searchDossierByDS_RD_SN_U(dossierStatus, serviceNo,
			fromDate, toDate, username, start, end);
	}

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
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> searchDossierByKeywordDomainAndStatus(
		long groupId, java.lang.String keyword, java.lang.String domainCode,
		java.util.List<java.lang.String> govAgencyCodes,
		java.lang.String dossierStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc) {
		return getService()
				   .searchDossierByKeywordDomainAndStatus(groupId, keyword,
			domainCode, govAgencyCodes, dossierStatus, start, end, obc);
	}

	/**
	* @param processNo
	* @param processStepNo
	* @param username
	* @return
	*/
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> searchDossierByP_PS_U(
		java.lang.String processNo, java.lang.String processStepNo,
		java.lang.String username, int start, int end)
		throws com.liferay.portal.NoSuchUserException {
		return getService()
				   .searchDossierByP_PS_U(processNo, processStepNo, username,
			start, end);
	}

	/**
	* @param processNo
	* @param stepNo
	* @param username
	* @return
	*/
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> searchDossierByP_S_U(
		java.lang.String processNo, java.lang.String stepNo,
		java.lang.String username, int start, int end) {
		return getService()
				   .searchDossierByP_S_U(processNo, stepNo, username, start, end);
	}

	/**
	* @param processNo
	* @param stepName
	* @param username
	* @return
	*/
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> searchDossierByP_SN_U(
		java.lang.String processNo, java.lang.String stepName,
		java.lang.String username, int start, int end) {
		return getService()
				   .searchDossierByP_SN_U(processNo, stepName, username, start,
			end);
	}

	/**
	* @param username
	* @return
	*/
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> searchDossierByUserAssignProcessOrder(
		java.lang.String username, int start, int end)
		throws com.liferay.portal.NoSuchUserException {
		return getService()
				   .searchDossierByUserAssignProcessOrder(username, start, end);
	}

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
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> searchDossierForRemoteService(
		java.lang.String dossiertype, java.lang.String organizationcode,
		java.lang.String processStepId, java.lang.String status,
		java.lang.String fromdate, java.lang.String todate, int documentyear,
		java.lang.String customername, int start, int end) {
		return getService()
				   .searchDossierForRemoteService(dossiertype,
			organizationcode, processStepId, status, fromdate, todate,
			documentyear, customername, start, end);
	}

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
	public static org.opencps.dossiermgt.model.Dossier syncDossier(
		org.opencps.dossiermgt.model.Dossier syncDossier,
		java.util.LinkedHashMap<org.opencps.dossiermgt.model.DossierFile, org.opencps.dossiermgt.model.DossierPart> syncDossierFiles,
		java.util.LinkedHashMap<java.lang.String, org.opencps.dossiermgt.model.FileGroup> syncFileGroups,
		java.util.LinkedHashMap<java.lang.Long, org.opencps.dossiermgt.model.DossierPart> syncFileGroupDossierParts,
		java.util.LinkedHashMap<java.lang.String, com.liferay.portlet.documentlibrary.model.DLFileEntry> syncDLFileEntries,
		java.util.LinkedHashMap<java.lang.String, byte[]> data,
		org.opencps.dossiermgt.model.DossierTemplate syncDossierTemplate,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .syncDossier(syncDossier, syncDossierFiles, syncFileGroups,
			syncFileGroupDossierParts, syncDLFileEntries, data,
			syncDossierTemplate, serviceContext);
	}

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
	public static org.opencps.dossiermgt.model.Dossier syncDossierStatus(
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
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .syncDossierStatus(oid, fileGroupId, dossierStatus,
			receptionNo, estimateDatetime, receiveDatetime, finishDatetime,
			actor, actorId, actorName, requestCommand, actionInfo, messageInfo,
			syncDossierFiles, syncFileGroups, syncFileGroupDossierParts,
			syncDLFileEntries, data, paymentFile, serviceContext);
	}

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
	public static org.opencps.dossiermgt.model.Dossier syncReSubmitDossier(
		org.opencps.dossiermgt.model.Dossier syncDossier,
		java.util.LinkedHashMap<org.opencps.dossiermgt.model.DossierFile, org.opencps.dossiermgt.model.DossierPart> syncDossierFiles,
		java.util.LinkedHashMap<java.lang.String, org.opencps.dossiermgt.model.FileGroup> syncFileGroups,
		java.util.LinkedHashMap<java.lang.Long, org.opencps.dossiermgt.model.DossierPart> syncFileGroupDossierParts,
		java.util.LinkedHashMap<java.lang.String, com.liferay.portlet.documentlibrary.model.DLFileEntry> syncDLFileEntries,
		java.util.LinkedHashMap<java.lang.String, byte[]> data,
		org.opencps.dossiermgt.model.DossierTemplate syncDossierTemplate,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .syncReSubmitDossier(syncDossier, syncDossierFiles,
			syncFileGroups, syncFileGroupDossierParts, syncDLFileEntries, data,
			syncDossierTemplate, serviceContext);
	}

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
	public static org.opencps.dossiermgt.model.Dossier updateDossier(
		long dossierId, long userId, long ownerOrganizationId,
		long dossierTemplateId, java.lang.String templateFileNo,
		long serviceConfigId, long serviceInfoId,
		java.lang.String serviceDomainIndex, long govAgencyOrganizationId,
		java.lang.String govAgencyCode, java.lang.String govAgencyName,
		int serviceMode, java.lang.String serviceAdministrationIndex,
		java.lang.String cityCode, java.lang.String cityName,
		java.lang.String districtCode, java.lang.String districtName,
		java.lang.String wardName, java.lang.String wardCode,
		java.lang.String subjectName, java.lang.String subjectId,
		java.lang.String address, java.lang.String contactName,
		java.lang.String contactTelNo, java.lang.String contactEmail,
		java.lang.String note, long dossierFolderId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateDossier(dossierId, userId, ownerOrganizationId,
			dossierTemplateId, templateFileNo, serviceConfigId, serviceInfoId,
			serviceDomainIndex, govAgencyOrganizationId, govAgencyCode,
			govAgencyName, serviceMode, serviceAdministrationIndex, cityCode,
			cityName, districtCode, districtName, wardName, wardCode,
			subjectName, subjectId, address, contactName, contactTelNo,
			contactEmail, note, dossierFolderId, serviceContext);
	}

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
	public static void updateDossierStatus(long userId, long groupId,
		long companyId, long dossierId, long fileGroupId,
		java.lang.String receptionNo, java.util.Date estimateDatetime,
		java.util.Date receiveDatetime, java.util.Date finishDatetime,
		java.lang.String dossierStatus, java.lang.String actionInfo,
		java.lang.String messageInfo)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.updateDossierStatus(userId, groupId, companyId, dossierId,
			fileGroupId, receptionNo, estimateDatetime, receiveDatetime,
			finishDatetime, dossierStatus, actionInfo, messageInfo);
	}

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
	public static org.opencps.dossiermgt.model.Dossier updateDossierStatus(
		long userId, long dossierId, long govAgencyOrganizationId,
		java.lang.String status, int syncStatus, long fileGroupId, int level,
		java.util.Locale locale)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierStatusException {
		return getService()
				   .updateDossierStatus(userId, dossierId,
			govAgencyOrganizationId, status, syncStatus, fileGroupId, level,
			locale);
	}

	public static org.opencps.dossiermgt.model.Dossier updateDossierStatus(
		long userId, long dossierId, long govAgencyOrganizationId,
		java.lang.String status, int syncStatus, long fileGroupId, int level,
		java.util.Locale locale, int actor, long actorId,
		java.lang.String actorName)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierStatusException {
		return getService()
				   .updateDossierStatus(userId, dossierId,
			govAgencyOrganizationId, status, syncStatus, fileGroupId, level,
			locale, actor, actorId, actorName);
	}

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
	public static boolean updateDossierStatus(long dossierId, long fileGroupId,
		java.lang.String dossierStatus, java.lang.String receptionNo,
		java.util.Date submitDatetime, java.util.Date estimateDatetime,
		java.util.Date receiveDatetime, java.util.Date finishDatetime,
		int actor, long actorId, java.lang.String actorName,
		java.lang.String requestCommand, java.lang.String actionInfo,
		java.lang.String messageInfo) {
		return getService()
				   .updateDossierStatus(dossierId, fileGroupId, dossierStatus,
			receptionNo, submitDatetime, estimateDatetime, receiveDatetime,
			finishDatetime, actor, actorId, actorName, requestCommand,
			actionInfo, messageInfo);
	}

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
	public static void updateDossierStatus(long dossierId, long fileGroupId,
		java.lang.String dossierStatus, int actor, long actorId,
		java.lang.String actorName, java.lang.String requestCommand,
		java.lang.String actionInfo, java.lang.String messageInfo,
		int syncStatus, int level)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.updateDossierStatus(dossierId, fileGroupId, dossierStatus, actor,
			actorId, actorName, requestCommand, actionInfo, messageInfo,
			syncStatus, level);
	}

	/**
	* @param oId
	* @param fileGroupIds
	* @param syncStatus
	* @throws SystemException
	* @throws NoSuchDossierStatusException
	* @throws PortalException
	*/
	public static void updateSyncStatus(java.lang.String oId,
		java.util.List<java.lang.Long> fileGroupIds, int syncStatus)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierStatusException {
		getService().updateSyncStatus(oId, fileGroupIds, syncStatus);
	}

	/**
	* @param serviceinfoId
	* @return
	* @throws SystemException
	*/
	public static java.util.List<org.opencps.dossiermgt.model.Dossier> getDossiersByServiceInfo(
		long serviceinfoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDossiersByServiceInfo(serviceinfoId);
	}

	public static java.util.List<org.opencps.dossiermgt.model.Dossier> getDossierByG_DS_U(
		long groupId, java.lang.String dossierStatus, long userId, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getDossierByG_DS_U(groupId, dossierStatus, userId, start,
			end);
	}

	public static int countDossierByG_DS_U(long groupId,
		java.lang.String dossierStatus, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countDossierByG_DS_U(groupId, dossierStatus, userId);
	}

	/**
	* @param groupId
	* @param userId
	* @return
	*/
	public static int countDossierByUserNewRequest(long groupId, long userId) {
		return getService().countDossierByUserNewRequest(groupId, userId);
	}

	/**
	* @param groupId
	* @param userId
	* @param start
	* @param end
	* @param obc
	* @return
	*/
	public static java.util.List getDossierByUserNewRequest(long groupId,
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc) {
		return getService()
				   .getDossierByUserNewRequest(groupId, userId, start, end, obc);
	}

	public static void clearService() {
		_service = null;
	}

	public static DossierLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DossierLocalService.class.getName());

			if (invokableLocalService instanceof DossierLocalService) {
				_service = (DossierLocalService)invokableLocalService;
			}
			else {
				_service = new DossierLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(DossierLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(DossierLocalService service) {
	}

	private static DossierLocalService _service;
}