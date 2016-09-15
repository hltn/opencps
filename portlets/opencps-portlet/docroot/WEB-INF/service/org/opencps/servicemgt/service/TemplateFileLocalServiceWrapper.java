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

package org.opencps.servicemgt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TemplateFileLocalService}.
 *
 * @author khoavd
 * @see TemplateFileLocalService
 * @generated
 */
public class TemplateFileLocalServiceWrapper implements TemplateFileLocalService,
	ServiceWrapper<TemplateFileLocalService> {
	public TemplateFileLocalServiceWrapper(
		TemplateFileLocalService templateFileLocalService) {
		_templateFileLocalService = templateFileLocalService;
	}

	/**
	* Adds the template file to the database. Also notifies the appropriate model listeners.
	*
	* @param templateFile the template file
	* @return the template file that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.opencps.servicemgt.model.TemplateFile addTemplateFile(
		org.opencps.servicemgt.model.TemplateFile templateFile)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _templateFileLocalService.addTemplateFile(templateFile);
	}

	/**
	* Creates a new template file with the primary key. Does not add the template file to the database.
	*
	* @param templatefileId the primary key for the new template file
	* @return the new template file
	*/
	@Override
	public org.opencps.servicemgt.model.TemplateFile createTemplateFile(
		long templatefileId) {
		return _templateFileLocalService.createTemplateFile(templatefileId);
	}

	/**
	* Deletes the template file with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param templatefileId the primary key of the template file
	* @return the template file that was removed
	* @throws PortalException if a template file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.opencps.servicemgt.model.TemplateFile deleteTemplateFile(
		long templatefileId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _templateFileLocalService.deleteTemplateFile(templatefileId);
	}

	/**
	* Deletes the template file from the database. Also notifies the appropriate model listeners.
	*
	* @param templateFile the template file
	* @return the template file that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.opencps.servicemgt.model.TemplateFile deleteTemplateFile(
		org.opencps.servicemgt.model.TemplateFile templateFile)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _templateFileLocalService.deleteTemplateFile(templateFile);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _templateFileLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _templateFileLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.servicemgt.model.impl.TemplateFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _templateFileLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.servicemgt.model.impl.TemplateFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _templateFileLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _templateFileLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _templateFileLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.opencps.servicemgt.model.TemplateFile fetchTemplateFile(
		long templatefileId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _templateFileLocalService.fetchTemplateFile(templatefileId);
	}

	/**
	* Returns the template file with the primary key.
	*
	* @param templatefileId the primary key of the template file
	* @return the template file
	* @throws PortalException if a template file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.opencps.servicemgt.model.TemplateFile getTemplateFile(
		long templatefileId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _templateFileLocalService.getTemplateFile(templatefileId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _templateFileLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the template files.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.servicemgt.model.impl.TemplateFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of template files
	* @param end the upper bound of the range of template files (not inclusive)
	* @return the range of template files
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.opencps.servicemgt.model.TemplateFile> getTemplateFiles(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _templateFileLocalService.getTemplateFiles(start, end);
	}

	/**
	* Returns the number of template files.
	*
	* @return the number of template files
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getTemplateFilesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _templateFileLocalService.getTemplateFilesCount();
	}

	/**
	* Updates the template file in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param templateFile the template file
	* @return the template file that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.opencps.servicemgt.model.TemplateFile updateTemplateFile(
		org.opencps.servicemgt.model.TemplateFile templateFile)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _templateFileLocalService.updateTemplateFile(templateFile);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _templateFileLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_templateFileLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _templateFileLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<org.opencps.servicemgt.model.TemplateFile> searchTemplateFiles(
		long groupId, java.lang.String keywords, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _templateFileLocalService.searchTemplateFiles(groupId, keywords,
			start, end);
	}

	@Override
	public int countTemplateFiles(long groupId, java.lang.String keywords)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _templateFileLocalService.countTemplateFiles(groupId, keywords);
	}

	/**
	* Update TemplateFile
	*
	* @param fileEntryId
	* @param fileNo
	* @param fileName
	* @param serviceContext
	* @return
	* @throws PortalException
	* @throws SystemException
	*/
	@Override
	public org.opencps.servicemgt.model.TemplateFile addServiceTemplateFile(
		java.lang.String fileNo, java.lang.String fileName,
		javax.portlet.ActionRequest actionRequest,
		javax.portlet.ActionResponse actionResponse,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _templateFileLocalService.addServiceTemplateFile(fileNo,
			fileName, actionRequest, actionResponse, serviceContext);
	}

	/**
	* Check douplicate FileName
	*
	* @param groupId
	* @param fileName
	* @return
	* @throws PortalException
	* @throws SystemException
	*/
	@Override
	public boolean isDuplicateFileName(long templateFileId, long groupId,
		java.lang.String fileName)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _templateFileLocalService.isDuplicateFileName(templateFileId,
			groupId, fileName);
	}

	/**
	* Check douplicate FileNo
	*
	* @param groupId
	* @param fileName
	* @return
	* @throws PortalException
	* @throws SystemException
	*/
	@Override
	public boolean isDuplicateFileNo(long templateFileId, long groupId,
		java.lang.String fileNo) {
		return _templateFileLocalService.isDuplicateFileNo(templateFileId,
			groupId, fileNo);
	}

	/**
	* Update TemplateFile
	*
	* @param templatefileId
	* @param fileEntryId
	* @param fileNo
	* @param fileName
	* @param serviceContext
	* @param serviceInfoIds
	* @return
	* @throws PortalException
	* @throws SystemException
	*/
	@Override
	public org.opencps.servicemgt.model.TemplateFile updateServiceTemplateFile(
		long templatefileId, java.lang.String fileNo,
		java.lang.String fileName, javax.portlet.ActionRequest actionRequest,
		javax.portlet.ActionResponse actionResponse,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _templateFileLocalService.updateServiceTemplateFile(templatefileId,
			fileNo, fileName, actionRequest, actionResponse, serviceContext);
	}

	@Override
	public void addChooseServceInfo(long templatefileId, long[] serviceInfoIds)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_templateFileLocalService.addChooseServceInfo(templatefileId,
			serviceInfoIds);
	}

	@Override
	public void deleteServiceTemplateFile(long templatefileId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_templateFileLocalService.deleteServiceTemplateFile(templatefileId);
	}

	/**
	* Get TemplateFile of ServiceInfo
	*
	* @param serviceInfoId
	* @return
	* @throws PortalException
	* @throws SystemException
	*/
	@Override
	public java.util.List<org.opencps.servicemgt.model.TemplateFile> getServiceTemplateFiles(
		long serviceInfoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _templateFileLocalService.getServiceTemplateFiles(serviceInfoId);
	}

	/**
	* Count TemplateFile in ServiceInfo
	*
	* @param serviceInfoId
	* @return
	* @throws PortalException
	* @throws SystemException
	*/
	@Override
	public int countServiceTemplateFile(long serviceInfoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _templateFileLocalService.countServiceTemplateFile(serviceInfoId);
	}

	/**
	* Create tree folder. Return folder contains template files
	*
	* @param actionRequest
	* @param themeDisplay
	* @return
	*/
	@Override
	public com.liferay.portal.kernel.repository.model.Folder initFolderService(
		javax.portlet.ActionRequest actionRequest,
		com.liferay.portal.theme.ThemeDisplay themeDisplay) {
		return _templateFileLocalService.initFolderService(actionRequest,
			themeDisplay);
	}

	/**
	* Check folder exist
	*
	* @param scopeGroupId
	* @param parentFolderId
	* @param folderName
	* @return
	*/
	@Override
	public boolean isFolderExist(long scopeGroupId, long parentFolderId,
		java.lang.String folderName) {
		return _templateFileLocalService.isFolderExist(scopeGroupId,
			parentFolderId, folderName);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TemplateFileLocalService getWrappedTemplateFileLocalService() {
		return _templateFileLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTemplateFileLocalService(
		TemplateFileLocalService templateFileLocalService) {
		_templateFileLocalService = templateFileLocalService;
	}

	@Override
	public TemplateFileLocalService getWrappedService() {
		return _templateFileLocalService;
	}

	@Override
	public void setWrappedService(
		TemplateFileLocalService templateFileLocalService) {
		_templateFileLocalService = templateFileLocalService;
	}

	private TemplateFileLocalService _templateFileLocalService;
}