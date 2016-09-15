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

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DossierLogLocalService}.
 *
 * @author trungnt
 * @see DossierLogLocalService
 * @generated
 */
public class DossierLogLocalServiceWrapper implements DossierLogLocalService,
	ServiceWrapper<DossierLogLocalService> {
	public DossierLogLocalServiceWrapper(
		DossierLogLocalService dossierLogLocalService) {
		_dossierLogLocalService = dossierLogLocalService;
	}

	/**
	* Adds the dossier log to the database. Also notifies the appropriate model listeners.
	*
	* @param dossierLog the dossier log
	* @return the dossier log that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.opencps.dossiermgt.model.DossierLog addDossierLog(
		org.opencps.dossiermgt.model.DossierLog dossierLog)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierLogLocalService.addDossierLog(dossierLog);
	}

	/**
	* Creates a new dossier log with the primary key. Does not add the dossier log to the database.
	*
	* @param dossierLogId the primary key for the new dossier log
	* @return the new dossier log
	*/
	@Override
	public org.opencps.dossiermgt.model.DossierLog createDossierLog(
		long dossierLogId) {
		return _dossierLogLocalService.createDossierLog(dossierLogId);
	}

	/**
	* Deletes the dossier log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierLogId the primary key of the dossier log
	* @return the dossier log that was removed
	* @throws PortalException if a dossier log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.opencps.dossiermgt.model.DossierLog deleteDossierLog(
		long dossierLogId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierLogLocalService.deleteDossierLog(dossierLogId);
	}

	/**
	* Deletes the dossier log from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierLog the dossier log
	* @return the dossier log that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.opencps.dossiermgt.model.DossierLog deleteDossierLog(
		org.opencps.dossiermgt.model.DossierLog dossierLog)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierLogLocalService.deleteDossierLog(dossierLog);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dossierLogLocalService.dynamicQuery();
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
		return _dossierLogLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dossierLogLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dossierLogLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _dossierLogLocalService.dynamicQueryCount(dynamicQuery);
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
		return _dossierLogLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.opencps.dossiermgt.model.DossierLog fetchDossierLog(
		long dossierLogId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierLogLocalService.fetchDossierLog(dossierLogId);
	}

	/**
	* Returns the dossier log with the primary key.
	*
	* @param dossierLogId the primary key of the dossier log
	* @return the dossier log
	* @throws PortalException if a dossier log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.opencps.dossiermgt.model.DossierLog getDossierLog(
		long dossierLogId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierLogLocalService.getDossierLog(dossierLogId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierLogLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<org.opencps.dossiermgt.model.DossierLog> getDossierLogs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierLogLocalService.getDossierLogs(start, end);
	}

	/**
	* Returns the number of dossier logs.
	*
	* @return the number of dossier logs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDossierLogsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierLogLocalService.getDossierLogsCount();
	}

	/**
	* Updates the dossier log in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dossierLog the dossier log
	* @return the dossier log that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.opencps.dossiermgt.model.DossierLog updateDossierLog(
		org.opencps.dossiermgt.model.DossierLog dossierLog)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierLogLocalService.updateDossierLog(dossierLog);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dossierLogLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dossierLogLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dossierLogLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* @param userId
	* @param groupId
	* @param companyId
	* @param dossierId
	* @param fileGroupId
	* @param status
	* @param actionInfo
	* @param messageInfo
	* @param updateDatetime
	* @param level
	* @return
	* @throws SystemException
	*/
	@Override
	public org.opencps.dossiermgt.model.DossierLog addDossierLog(long userId,
		long groupId, long companyId, long dossierId, long fileGroupId,
		java.lang.String status, java.lang.String actionInfo,
		java.lang.String messageInfo, java.util.Date updateDatetime, int level)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierLogLocalService.addDossierLog(userId, groupId,
			companyId, dossierId, fileGroupId, status, actionInfo, messageInfo,
			updateDatetime, level);
	}

	@Override
	public org.opencps.dossiermgt.model.DossierLog addDossierLog(long userId,
		long groupId, long companyId, long dossierId, long fileGroupId,
		java.lang.String status, java.lang.String actionInfo,
		java.lang.String messageInfo, java.util.Date updateDatetime, int level,
		int actor, long actorId, java.lang.String actorName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierLogLocalService.addDossierLog(userId, groupId,
			companyId, dossierId, fileGroupId, status, actionInfo, messageInfo,
			updateDatetime, level, actor, actorId, actorName);
	}

	/**
	* @param userId
	* @param dossierId
	* @param fileGroupId
	* @param status
	* @param actionInfo
	* @param messageInfo
	* @param updateDatetime
	* @param level
	* @param serviceContext
	* @return
	* @throws SystemException
	*/
	@Override
	public org.opencps.dossiermgt.model.DossierLog addDossierLog(long userId,
		long dossierId, long fileGroupId, java.lang.String status,
		java.lang.String actor, java.lang.String actionInfo,
		java.lang.String messageInfo, java.util.Date updateDatetime, int level,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierLogLocalService.addDossierLog(userId, dossierId,
			fileGroupId, status, actor, actionInfo, messageInfo,
			updateDatetime, level, serviceContext);
	}

	@Override
	public org.opencps.dossiermgt.model.DossierLog addDossierLog(long userId,
		long dossierId, long fileGroupId, java.lang.String status, int actor,
		long actorId, java.lang.String actorName, java.lang.String actionInfo,
		java.lang.String messageInfo, java.util.Date updateDatetime, int level,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierLogLocalService.addDossierLog(userId, dossierId,
			fileGroupId, status, actor, actorId, actorName, actionInfo,
			messageInfo, updateDatetime, level, serviceContext);
	}

	/**
	* @param userId
	* @param groupId
	* @param companyId
	* @param dossierId
	* @param fileGroupId
	* @param dossierStatus
	* @param actor
	* @param requestCommand
	* @param actionInfo
	* @param messageInfo
	* @param level
	* @return
	* @throws SystemException
	*/
	@Override
	public org.opencps.dossiermgt.model.DossierLog addDossierLog(long userId,
		long groupId, long companyId, long dossierId, long fileGroupId,
		java.lang.String dossierStatus, int actor, long actorId,
		java.lang.String actorName, java.lang.String requestCommand,
		java.lang.String actionInfo, java.lang.String messageInfo, int level)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierLogLocalService.addDossierLog(userId, groupId,
			companyId, dossierId, fileGroupId, dossierStatus, actor, actorId,
			actorName, requestCommand, actionInfo, messageInfo, level);
	}

	/**
	* @param dossierId
	* @return
	* @throws SystemException
	*/
	@Override
	public int countDossierLogByDossierId(long dossierId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierLogLocalService.countDossierLogByDossierId(dossierId);
	}

	/**
	* @param dossierId
	* @param actors
	* @param requestCommands
	* @return
	* @throws SystemException
	*/
	@Override
	public java.util.List<org.opencps.dossiermgt.model.DossierLog> findRequiredProcessDossier(
		long dossierId, java.lang.String[] actors,
		java.lang.String[] requestCommands)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierLogLocalService.findRequiredProcessDossier(dossierId,
			actors, requestCommands);
	}

	/**
	* @param doosierId
	* @return
	* @throws SystemException
	*/
	@Override
	public java.util.List<org.opencps.dossiermgt.model.DossierLog> getDossierLogByDossierId(
		long doosierId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierLogLocalService.getDossierLogByDossierId(doosierId);
	}

	/**
	* @param doosierId
	* @param syncStatus
	* @return
	* @throws SystemException
	*/
	@Override
	public java.util.List<org.opencps.dossiermgt.model.DossierLog> getDossierLogByDossierId(
		long dossierId, int[] syncStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierLogLocalService.getDossierLogByDossierId(dossierId,
			syncStatus);
	}

	/**
	* @param dossierId
	* @param start
	* @param end
	* @return
	* @throws SystemException
	*/
	@Override
	public java.util.List<org.opencps.dossiermgt.model.DossierLog> getDossierLogByDossierId(
		long dossierId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierLogLocalService.getDossierLogByDossierId(dossierId,
			start, end);
	}

	/**
	* @param dossierId
	* @param start
	* @param end
	* @param obc
	* @return
	* @throws SystemException
	*/
	@Override
	public java.util.List<org.opencps.dossiermgt.model.DossierLog> getDossierLogByDossierId(
		long dossierId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierLogLocalService.getDossierLogByDossierId(dossierId,
			start, end, obc);
	}

	/**
	* @param dossierId
	* @param requestCommand
	* @return
	* @throws PortalException
	* @throws SystemException
	*/
	@Override
	public int countDossierByRequestCommand(long dossierId,
		java.lang.String requestCommand)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dossierLogLocalService.countDossierByRequestCommand(dossierId,
			requestCommand);
	}

	/**
	* @param start
	* @param end
	* @return
	* @throws SystemException
	*/
	@Override
	public java.util.List<org.opencps.dossiermgt.model.DossierLog> getAllDossierLog(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierLogLocalService.getAllDossierLog(start, end);
	}

	/**
	* @return
	* @throws SystemException
	*/
	@Override
	public int CountAllDossierLog()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dossierLogLocalService.CountAllDossierLog();
	}

	/**
	* @param fromUpdateDatetime
	* @param toUpdateDatetime
	* @param level
	* @param dossierStatus
	* @param start
	* @param end
	* @return
	*/
	@Override
	public java.util.List<org.opencps.dossiermgt.model.DossierLog> searchAdminLog(
		java.util.Date fromUpdateDatetime, java.util.Date toUpdateDatetime,
		int level, java.lang.String dossierStatus, int start, int end) {
		return _dossierLogLocalService.searchAdminLog(fromUpdateDatetime,
			toUpdateDatetime, level, dossierStatus, start, end);
	}

	/**
	* @param fromUpdateDatetime
	* @param toUpdateDatetime
	* @param level
	* @param dossierStatus
	* @return
	*/
	@Override
	public int countAnminLog(java.util.Date fromUpdateDatetime,
		java.util.Date toUpdateDatetime, int level,
		java.lang.String dossierStatus) {
		return _dossierLogLocalService.countAnminLog(fromUpdateDatetime,
			toUpdateDatetime, level, dossierStatus);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DossierLogLocalService getWrappedDossierLogLocalService() {
		return _dossierLogLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDossierLogLocalService(
		DossierLogLocalService dossierLogLocalService) {
		_dossierLogLocalService = dossierLogLocalService;
	}

	@Override
	public DossierLogLocalService getWrappedService() {
		return _dossierLogLocalService;
	}

	@Override
	public void setWrappedService(DossierLogLocalService dossierLogLocalService) {
		_dossierLogLocalService = dossierLogLocalService;
	}

	private DossierLogLocalService _dossierLogLocalService;
}