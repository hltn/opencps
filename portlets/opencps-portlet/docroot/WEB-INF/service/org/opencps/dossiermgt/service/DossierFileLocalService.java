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
 * Provides the local service interface for DossierFile. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author trungnt
 * @see DossierFileLocalServiceUtil
 * @see org.opencps.dossiermgt.service.base.DossierFileLocalServiceBaseImpl
 * @see org.opencps.dossiermgt.service.impl.DossierFileLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface DossierFileLocalService extends BaseLocalService,
	InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DossierFileLocalServiceUtil} to access the dossier file local service. Add custom service methods to {@link org.opencps.dossiermgt.service.impl.DossierFileLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the dossier file to the database. Also notifies the appropriate model listeners.
	*
	* @param dossierFile the dossier file
	* @return the dossier file that was added
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.opencps.dossiermgt.model.DossierFile addDossierFile(
		org.opencps.dossiermgt.model.DossierFile dossierFile)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new dossier file with the primary key. Does not add the dossier file to the database.
	*
	* @param dossierFileId the primary key for the new dossier file
	* @return the new dossier file
	*/
	public org.opencps.dossiermgt.model.DossierFile createDossierFile(
		long dossierFileId);

	/**
	* Deletes the dossier file with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierFileId the primary key of the dossier file
	* @return the dossier file that was removed
	* @throws PortalException if a dossier file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
	public org.opencps.dossiermgt.model.DossierFile deleteDossierFile(
		long dossierFileId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the dossier file from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierFile the dossier file
	* @return the dossier file that was removed
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
	public org.opencps.dossiermgt.model.DossierFile deleteDossierFile(
		org.opencps.dossiermgt.model.DossierFile dossierFile)
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public org.opencps.dossiermgt.model.DossierFile fetchDossierFile(
		long dossierFileId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dossier file with the primary key.
	*
	* @param dossierFileId the primary key of the dossier file
	* @return the dossier file
	* @throws PortalException if a dossier file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.opencps.dossiermgt.model.DossierFile getDossierFile(
		long dossierFileId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.opencps.dossiermgt.model.DossierFile> getDossierFiles(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dossier files.
	*
	* @return the number of dossier files
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getDossierFilesCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the dossier file in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dossierFile the dossier file
	* @return the dossier file that was updated
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.opencps.dossiermgt.model.DossierFile updateDossierFile(
		org.opencps.dossiermgt.model.DossierFile dossierFile)
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
	* @param dossierId
	* @param dossierPartId
	* @param templateFileNo
	* @param groupName
	* @param fileGroupId
	* @param ownerUserId
	* @param ownerOrganizationId
	* @param displayName
	* @param formData
	* @param fileEntryId
	* @param dossierFileMark
	* @param dossierFileType
	* @param dossierFileNo
	* @param dossierFileDate
	* @param original
	* @param syncStatus
	* @param version
	* @param serviceContext
	* @return
	* @throws SystemException
	* @throws PortalException
	*/
	public org.opencps.dossiermgt.model.DossierFile addDossierFile(
		long userId, long dossierId, long dossierPartId,
		java.lang.String templateFileNo, java.lang.String groupName,
		long fileGroupId, long groupDossierPartId, long ownerUserId,
		long ownerOrganizationId, java.lang.String displayName,
		java.lang.String formData, long fileEntryId, int dossierFileMark,
		int dossierFileType, java.lang.String dossierFileNo,
		java.util.Date dossierFileDate, int original, int syncStatus,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* @param oldDossierFileId
	* @param folderId
	* @param sourceFileName
	* @param mimeType
	* @param title
	* @param description
	* @param changeLog
	* @param is
	* @param size
	* @param serviceContext
	* @return
	* @throws SystemException
	* @throws PortalException
	*/
	public org.opencps.dossiermgt.model.DossierFile addDossierFile(
		long oldDossierFileId, long folderId, java.lang.String sourceFileName,
		java.lang.String mimeType, java.lang.String title,
		java.lang.String description, java.lang.String changeLog,
		java.io.InputStream is, long size,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* @param oldDossierFileId
	* @param folderId
	* @param sourceFileName
	* @param mimeType
	* @param title
	* @param description
	* @param changeLog
	* @param bytes
	* @param serviceContext
	* @return
	* @throws SystemException
	* @throws PortalException
	*/
	public org.opencps.dossiermgt.model.DossierFile addDossierFile(
		long oldDossierFileId, long folderId, java.lang.String sourceFileName,
		java.lang.String mimeType, java.lang.String title,
		java.lang.String description, java.lang.String changeLog, byte[] bytes,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* @param userId
	* @param dossierId
	* @param dossierPartId
	* @param templateFileNo
	* @param groupName
	* @param fileGroupId
	* @param ownerUserId
	* @param ownerOrganizationId
	* @param displayName
	* @param formData
	* @param fileEntryId
	* @param dossierFileMark
	* @param dossierFileType
	* @param dossierFileNo
	* @param dossierFileDate
	* @param original
	* @param syncStatus
	* @param version
	* @param folderId
	* @param sourceFileName
	* @param mimeType
	* @param title
	* @param description
	* @param changeLog
	* @param is
	* @param size
	* @param serviceContext
	* @return
	* @throws SystemException
	* @throws PortalException
	*/
	public org.opencps.dossiermgt.model.DossierFile addDossierFile(
		long userId, long dossierId, long dossierPartId,
		java.lang.String templateFileNo, java.lang.String groupName,
		long fileGroupId, long groupDossierPartId, long ownerUserId,
		long ownerOrganizationId, java.lang.String displayName,
		java.lang.String formData, long fileEntryId, int dossierFileMark,
		int dossierFileType, java.lang.String dossierFileNo,
		java.util.Date dossierFileDate, int original, int syncStatus,
		long folderId, java.lang.String sourceFileName,
		java.lang.String mimeType, java.lang.String title,
		java.lang.String description, java.lang.String changeLog,
		java.io.InputStream is, long size,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* @param userId
	* @param dossierId
	* @param dossierPartId
	* @param templateFileNo
	* @param groupName
	* @param fileGroupId
	* @param groupDossierPartId
	* @param ownerUserId
	* @param ownerOrganizationId
	* @param displayName
	* @param formData
	* @param dossierFileMark
	* @param dossierFileType
	* @param dossierFileNo
	* @param dossierFileDate
	* @param original
	* @param syncStatus
	* @param folderId
	* @param sourceFileName
	* @param mimeType
	* @param title
	* @param description
	* @param changeLog
	* @param bytes
	* @param serviceContext
	* @return
	* @throws SystemException
	* @throws PortalException
	*/
	public org.opencps.dossiermgt.model.DossierFile addDossierFile(
		long userId, long dossierId, long dossierPartId,
		java.lang.String templateFileNo, java.lang.String groupName,
		long fileGroupId, long groupDossierPartId, long ownerUserId,
		long ownerOrganizationId, java.lang.String displayName,
		java.lang.String formData, int dossierFileMark, int dossierFileType,
		java.lang.String dossierFileNo, java.util.Date dossierFileDate,
		int original, int syncStatus, long folderId,
		java.lang.String sourceFileName, java.lang.String mimeType,
		java.lang.String title, java.lang.String description,
		java.lang.String changeLog, byte[] bytes,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* @param oldDossierFileId
	* @param isSigned
	* @param folderId
	* @param sourceFileName
	* @param mimeType
	* @param title
	* @param description
	* @param changeLog
	* @param is
	* @param size
	* @param serviceContext
	* @return
	* @throws SystemException
	* @throws PortalException
	*/
	public org.opencps.dossiermgt.model.DossierFile addSignDossierFile(
		long oldDossierFileId, boolean isSigned, long folderId,
		java.lang.String sourceFileName, java.lang.String mimeType,
		java.lang.String title, java.lang.String description,
		java.lang.String changeLog, java.io.InputStream is, long size,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* @param dossierId
	* @param dossierPartId
	* @return
	* @throws SystemException
	*/
	public int countDossierFile(long dossierId, long dossierPartId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @param dossierId
	* @param dossierPartId
	* @param groupFileId
	* @return
	* @throws SystemException
	*/
	public int countDossierFile(long dossierId, long dossierPartId,
		long groupFileId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @param groupId
	* @param keyword
	* @param templateFileNo
	* @param removed
	* @return
	* @throws SystemException
	*/
	public int countDossierFile(long groupId, long ownerUserId,
		long ownerOrganizationId, java.lang.String keyword,
		java.lang.String templateFileNo, int removed)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @param groupId
	* @param ownerUserId
	* @param ownerOrganizationId
	* @param keyword
	* @param templateFileNo
	* @param removed
	* @param partType
	* @param original
	* @return
	* @throws SystemException
	*/
	public int countDossierFileAdvance(long groupId, long ownerUserId,
		long ownerOrganizationId, java.lang.String keyword,
		java.lang.String templateFileNo, int removed, int partType, int original)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @param groupId
	* @param keyword
	* @param dossierTemplateId
	* @param fileEntryId
	* @param onlyViewFileResult
	* @return
	* @throws SystemException
	*/
	public int countDossierFile(long groupId, java.lang.String keyword,
		long dossierTemplateId, long fileEntryId, boolean onlyViewFileResult)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @param dossierFileId
	* @throws PortalException
	* @throws SystemException
	*/
	public void removeDossierFile(long dossierFileId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* @param dossierFileId
	* @param fileEntryId
	* @throws PortalException
	* @throws SystemException
	*/
	public void deleteDossierFile(long dossierFileId, long fileEntryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* @param dossierId
	* @param dossierPartId
	* @return List
	* @throws NoSuchDossierFileException
	* @throws SystemException
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.opencps.dossiermgt.model.DossierFile> getDossierFileByD_DP(
		long dossierId, long dossierPartId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierFileException;

	/**
	* @param fileGroupId
	* @param dossierId
	* @param syncStatus
	* @param removed
	* @return
	* @throws SystemException
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.opencps.dossiermgt.model.DossierFile> getDossierFileByGFID_DID_SS_R(
		long fileGroupId, long dossierId, int syncStatus, int removed)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @param dossierId
	* @param syncStatus
	* @param dossierPartId
	* @param removed
	* @return
	* @throws SystemException
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.opencps.dossiermgt.model.DossierFile> getDossierFileByDID_SS_DPID_R(
		long dossierId, int syncStatus, long dossierPartId, int removed)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Find all dossierFile in use(removed = 0)
	*
	* @param dossierId
	* @param groupFileId
	* @return
	* @throws SystemException
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.opencps.dossiermgt.model.DossierFile> getDossierFileByD_GF(
		long dossierId, long groupFileId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Find all dossierFile in use (removed = 0)
	*
	* @param dossierId
	* @return List<DossierFile>
	* @throws NoSuchDossierFileException
	* @throws SystemException
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.opencps.dossiermgt.model.DossierFile> getDossierFileByDossierId(
		long dossierId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @param dossierId
	* @param syncStatus
	* @param removed
	* @return
	* @throws SystemException
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.opencps.dossiermgt.model.DossierFile> getDossierFileByDID_SS_R(
		long dossierId, int syncStatus, int removed)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @param dossierId
	* @param dossierPartId
	* @return DossierFile
	* @throws NoSuchDossierFileException
	* @throws SystemException
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.opencps.dossiermgt.model.DossierFile getDossierFileInUse(
		long dossierId, long dossierPartId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierFileException;

	/**
	* @param dossierId
	* @param dossierPartId
	* @param groupFileId
	* @return
	* @throws NoSuchDossierFileException
	* @throws SystemException
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.opencps.dossiermgt.model.DossierFile getDossierFileInUseByGroupFileId(
		long dossierId, long dossierPartId, long groupFileId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierFileException;

	/**
	* @param groupId
	* @param keyword
	* @param templateFileNo
	* @param removed
	* @param start
	* @param end
	* @param obc
	* @return
	* @throws SystemException
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.opencps.dossiermgt.model.DossierFile> searchDossierFile(
		long groupId, long ownerUserId, long ownerOrganizationId,
		java.lang.String keyword, java.lang.String templateFileNo, int removed,
		int start, int end, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @param groupId
	* @param keyword
	* @param dossierTemplateId
	* @param fileEntryId
	* @param onlyViewFileResult
	* @param start
	* @param end
	* @param obc
	* @return
	* @throws SystemException
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.opencps.dossiermgt.model.DossierFile> searchDossierFile(
		long groupId, java.lang.String keyword, long dossierTemplateId,
		long fileEntryId, boolean onlyViewFileResult, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @param groupId
	* @param ownerUserId
	* @param ownerOrganizationId
	* @param keyword
	* @param templateFileNo
	* @param removed
	* @param partType
	* @param original
	* @param start
	* @param end
	* @param obc
	* @return
	* @throws SystemException
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List searchDossierFileAdvance(long groupId,
		long ownerUserId, long ownerOrganizationId, java.lang.String keyword,
		java.lang.String templateFileNo, int removed, int partType,
		int original, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @param dossierFileId
	* @param ownerUserId
	* @param ownerOrganizationId
	* @param fileEntryId
	* @param displayName
	* @return
	* @throws NoSuchDossierFileException
	* @throws SystemException
	* @throws PortalException
	*/
	public org.opencps.dossiermgt.model.DossierFile updateDossierFile(
		long dossierFileId, long ownerUserId, long ownerOrganizationId,
		long fileEntryId, java.lang.String displayName)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierFileException;

	/**
	* @param dossierFileId
	* @param userId
	* @param dossierId
	* @param dossierPartId
	* @param templateFileNo
	* @param groupFileId
	* @param ownerUserId
	* @param ownerOrganizationId
	* @param displayName
	* @param formData
	* @param fileEntryId
	* @param dossierFileMark
	* @param dossierFileType
	* @param dossierFileNo
	* @param dossierFileDate
	* @param original
	* @param syncStatus
	* @param serviceContext
	* @return
	* @throws NoSuchDossierFileException
	* @throws SystemException
	*/
	public org.opencps.dossiermgt.model.DossierFile updateDossierFile(
		long dossierFileId, long userId, long dossierId, long dossierPartId,
		java.lang.String templateFileNo, long groupFileId, long ownerUserId,
		long ownerOrganizationId, java.lang.String displayName,
		java.lang.String formData, long fileEntryId, int dossierFileMark,
		int dossierFileType, java.lang.String dossierFileNo,
		java.util.Date dossierFileDate, int original, int syncStatus,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierFileException;

	/**
	* @param dossierFileId
	* @param folderId
	* @param sourceFileName
	* @param mimeType
	* @param title
	* @param description
	* @param changeLog
	* @param is
	* @param size
	* @param serviceContext
	* @return
	* @throws SystemException
	* @throws PortalException
	*/
	public org.opencps.dossiermgt.model.DossierFile updateDossierFile(
		long dossierFileId, long folderId, java.lang.String sourceFileName,
		java.lang.String mimeType, java.lang.String title,
		java.lang.String description, java.lang.String changeLog,
		java.io.InputStream is, long size,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* @param userId
	* @param dossierId
	* @param syncStatus
	* @param worklows
	* @throws SystemException
	* @throws NoSuchDossierStatusException
	* @throws PortalException
	*/
	public void updateDossierFileSyncStatus(long userId, long dossierId,
		int syncStatus,
		java.util.List<org.opencps.processmgt.model.WorkflowOutput> worklows)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierStatusException;

	/**
	* @param userId
	* @param dossierId
	* @param syncStatus
	* @throws SystemException
	* @throws NoSuchDossierStatusException
	* @throws PortalException
	*/
	public void updateDossierFileSyncStatus(long userId, long dossierId,
		long fileGroupId, int syncStatus)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			org.opencps.dossiermgt.NoSuchDossierStatusException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.opencps.dossiermgt.model.DossierFile fetchByTemplateFileNoDossierId_First(
		long dossierId, java.lang.String templateFileNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.opencps.dossiermgt.model.DossierFile getByOid(
		java.lang.String oid)
		throws com.liferay.portal.kernel.exception.SystemException;
}