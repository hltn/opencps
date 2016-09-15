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

package org.opencps.accountmgt.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Citizen. This utility wraps
 * {@link org.opencps.accountmgt.service.impl.CitizenLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author khoavd
 * @see CitizenLocalService
 * @see org.opencps.accountmgt.service.base.CitizenLocalServiceBaseImpl
 * @see org.opencps.accountmgt.service.impl.CitizenLocalServiceImpl
 * @generated
 */
public class CitizenLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.opencps.accountmgt.service.impl.CitizenLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the citizen to the database. Also notifies the appropriate model listeners.
	*
	* @param citizen the citizen
	* @return the citizen that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.accountmgt.model.Citizen addCitizen(
		org.opencps.accountmgt.model.Citizen citizen)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addCitizen(citizen);
	}

	/**
	* Creates a new citizen with the primary key. Does not add the citizen to the database.
	*
	* @param citizenId the primary key for the new citizen
	* @return the new citizen
	*/
	public static org.opencps.accountmgt.model.Citizen createCitizen(
		long citizenId) {
		return getService().createCitizen(citizenId);
	}

	/**
	* Deletes the citizen with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param citizenId the primary key of the citizen
	* @return the citizen that was removed
	* @throws PortalException if a citizen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.accountmgt.model.Citizen deleteCitizen(
		long citizenId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteCitizen(citizenId);
	}

	/**
	* Deletes the citizen from the database. Also notifies the appropriate model listeners.
	*
	* @param citizen the citizen
	* @return the citizen that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.accountmgt.model.Citizen deleteCitizen(
		org.opencps.accountmgt.model.Citizen citizen)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteCitizen(citizen);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.accountmgt.model.impl.CitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.accountmgt.model.impl.CitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static org.opencps.accountmgt.model.Citizen fetchCitizen(
		long citizenId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchCitizen(citizenId);
	}

	/**
	* Returns the citizen with the primary key.
	*
	* @param citizenId the primary key of the citizen
	* @return the citizen
	* @throws PortalException if a citizen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	* @throws org.opencps.accountmgt.NoSuchCitizenException
	*/
	public static org.opencps.accountmgt.model.Citizen getCitizen(
		long citizenId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			org.opencps.accountmgt.NoSuchCitizenException {
		return getService().getCitizen(citizenId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the citizens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.accountmgt.model.impl.CitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of citizens
	* @param end the upper bound of the range of citizens (not inclusive)
	* @return the range of citizens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.accountmgt.model.Citizen> getCitizens(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCitizens(start, end);
	}

	/**
	* Returns the number of citizens.
	*
	* @return the number of citizens
	* @throws SystemException if a system exception occurred
	*/
	public static int getCitizensCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCitizensCount();
	}

	/**
	* Updates the citizen in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param citizen the citizen
	* @return the citizen that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.accountmgt.model.Citizen updateCitizen(
		org.opencps.accountmgt.model.Citizen citizen)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateCitizen(citizen);
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

	public static org.opencps.accountmgt.model.Citizen addCitizen(
		java.lang.String fullName, java.lang.String personalId, int gender,
		int birthDateDay, int birthDateMonth, int birthDateYear,
		java.lang.String address, java.lang.String cityCode,
		java.lang.String districtCode, java.lang.String wardCode,
		java.lang.String cityName, java.lang.String districtName,
		java.lang.String wardName, java.lang.String email,
		java.lang.String telNo, long repositoryId,
		java.lang.String sourceFileName, java.lang.String mimeType,
		java.lang.String title, java.io.InputStream inputStream, long size,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addCitizen(fullName, personalId, gender, birthDateDay,
			birthDateMonth, birthDateYear, address, cityCode, districtCode,
			wardCode, cityName, districtName, wardName, email, telNo,
			repositoryId, sourceFileName, mimeType, title, inputStream, size,
			serviceContext);
	}

	public static void deleteCitizenByCitizenId(long citizenId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteCitizenByCitizenId(citizenId);
	}

	public static org.opencps.accountmgt.model.Citizen getCitizen(
		java.lang.String email)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.accountmgt.NoSuchCitizenException {
		return getService().getCitizen(email);
	}

	public static org.opencps.accountmgt.model.Citizen getCitizenByUUID(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.accountmgt.NoSuchCitizenException {
		return getService().getCitizenByUUID(uuid);
	}

	public static org.opencps.accountmgt.model.Citizen updateCitizen(
		long citizenId, java.lang.String address, java.lang.String cityCode,
		java.lang.String districtCode, java.lang.String wardCode,
		java.lang.String cityName, java.lang.String districtName,
		java.lang.String wardName, java.lang.String telNo,
		boolean isChangePassWord, java.lang.String newPassword,
		java.lang.String reTypePassword, long repositoryId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateCitizen(citizenId, address, cityCode, districtCode,
			wardCode, cityName, districtName, wardName, telNo,
			isChangePassWord, newPassword, reTypePassword, repositoryId,
			serviceContext);
	}

	public static org.opencps.accountmgt.model.Citizen updateCitizen(
		long citizenId, java.lang.String fullName, java.lang.String personalId,
		int gender, int birthDateDay, int birthDateMonth, int birthDateYear,
		java.lang.String address, java.lang.String cityCode,
		java.lang.String districtCode, java.lang.String wardCode,
		java.lang.String cityName, java.lang.String districtName,
		java.lang.String wardName, java.lang.String telNo, long repositoryId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateCitizen(citizenId, fullName, personalId, gender,
			birthDateDay, birthDateMonth, birthDateYear, address, cityCode,
			districtCode, wardCode, cityName, districtName, wardName, telNo,
			repositoryId, serviceContext);
	}

	public static org.opencps.accountmgt.model.Citizen updateStatus(
		long citizenId, long userId, int accountStatus)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().updateStatus(citizenId, userId, accountStatus);
	}

	public static java.util.List<org.opencps.accountmgt.model.Citizen> getCitizens(
		int start, int end, com.liferay.portal.kernel.util.OrderByComparator odc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCitizens(start, end, odc);
	}

	public static java.util.List<org.opencps.accountmgt.model.Citizen> getCitizens(
		long groupId, int accountStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCitizens(groupId, accountStatus);
	}

	public static java.util.List<org.opencps.accountmgt.model.Citizen> getCitizens(
		long groupId, java.lang.String fullName, int accountStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCitizens(groupId, fullName, accountStatus);
	}

	public static java.util.List<org.opencps.accountmgt.model.Citizen> getCitizens(
		long groupId, java.lang.String fullName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCitizens(groupId, fullName);
	}

	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countAll();
	}

	public static int countByG_S(long groupId, int accountStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByG_S(groupId, accountStatus);
	}

	public static org.opencps.accountmgt.model.Citizen getByMappingUserId(
		long mappingUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getByMappingUserId(mappingUserId);
	}

	public static java.util.List<org.opencps.accountmgt.model.Citizen> searchCitizen(
		long groupId, java.lang.String keyword, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().searchCitizen(groupId, keyword, status, start, end);
	}

	public static int countCitizen(long groupId, java.lang.String keyword,
		int status) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countCitizen(groupId, keyword, status);
	}

	public static void clearService() {
		_service = null;
	}

	public static CitizenLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					CitizenLocalService.class.getName());

			if (invokableLocalService instanceof CitizenLocalService) {
				_service = (CitizenLocalService)invokableLocalService;
			}
			else {
				_service = new CitizenLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(CitizenLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(CitizenLocalService service) {
	}

	private static CitizenLocalService _service;
}