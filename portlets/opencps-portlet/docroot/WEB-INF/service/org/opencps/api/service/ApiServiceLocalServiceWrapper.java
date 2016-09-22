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

package org.opencps.api.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ApiServiceLocalService}.
 *
 * @author trungdk
 * @see ApiServiceLocalService
 * @generated
 */
public class ApiServiceLocalServiceWrapper implements ApiServiceLocalService,
	ServiceWrapper<ApiServiceLocalService> {
	public ApiServiceLocalServiceWrapper(
		ApiServiceLocalService apiServiceLocalService) {
		_apiServiceLocalService = apiServiceLocalService;
	}

	/**
	* Adds the api service to the database. Also notifies the appropriate model listeners.
	*
	* @param apiService the api service
	* @return the api service that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.opencps.api.model.ApiService addApiService(
		org.opencps.api.model.ApiService apiService)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _apiServiceLocalService.addApiService(apiService);
	}

	/**
	* Creates a new api service with the primary key. Does not add the api service to the database.
	*
	* @param apiLogId the primary key for the new api service
	* @return the new api service
	*/
	@Override
	public org.opencps.api.model.ApiService createApiService(long apiLogId) {
		return _apiServiceLocalService.createApiService(apiLogId);
	}

	/**
	* Deletes the api service with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param apiLogId the primary key of the api service
	* @return the api service that was removed
	* @throws PortalException if a api service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.opencps.api.model.ApiService deleteApiService(long apiLogId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _apiServiceLocalService.deleteApiService(apiLogId);
	}

	/**
	* Deletes the api service from the database. Also notifies the appropriate model listeners.
	*
	* @param apiService the api service
	* @return the api service that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.opencps.api.model.ApiService deleteApiService(
		org.opencps.api.model.ApiService apiService)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _apiServiceLocalService.deleteApiService(apiService);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _apiServiceLocalService.dynamicQuery();
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
		return _apiServiceLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.api.model.impl.ApiServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _apiServiceLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.api.model.impl.ApiServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _apiServiceLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _apiServiceLocalService.dynamicQueryCount(dynamicQuery);
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
		return _apiServiceLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.opencps.api.model.ApiService fetchApiService(long apiLogId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _apiServiceLocalService.fetchApiService(apiLogId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _apiServiceLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the api services.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.api.model.impl.ApiServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of api services
	* @param end the upper bound of the range of api services (not inclusive)
	* @return the range of api services
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.opencps.api.model.ApiService> getApiServices(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _apiServiceLocalService.getApiServices(start, end);
	}

	/**
	* Returns the number of api services.
	*
	* @return the number of api services
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getApiServicesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _apiServiceLocalService.getApiServicesCount();
	}

	/**
	* Updates the api service in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param apiService the api service
	* @return the api service that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.opencps.api.model.ApiService updateApiService(
		org.opencps.api.model.ApiService apiService)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _apiServiceLocalService.updateApiService(apiService);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _apiServiceLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_apiServiceLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _apiServiceLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public org.opencps.api.model.ApiService addLog(long userId,
		java.lang.String apiCode, java.lang.String ipAddress,
		java.lang.String oid, java.lang.String params, java.lang.String status,
		com.liferay.portal.service.ServiceContext serviceContext) {
		return _apiServiceLocalService.addLog(userId, apiCode, ipAddress, oid,
			params, status, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ApiServiceLocalService getWrappedApiServiceLocalService() {
		return _apiServiceLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedApiServiceLocalService(
		ApiServiceLocalService apiServiceLocalService) {
		_apiServiceLocalService = apiServiceLocalService;
	}

	@Override
	public ApiServiceLocalService getWrappedService() {
		return _apiServiceLocalService;
	}

	@Override
	public void setWrappedService(ApiServiceLocalService apiServiceLocalService) {
		_apiServiceLocalService = apiServiceLocalService;
	}

	private ApiServiceLocalService _apiServiceLocalService;
}