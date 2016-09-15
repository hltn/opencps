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

package org.opencps.api.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import org.opencps.api.model.ApiService;

import java.util.List;

/**
 * The persistence utility for the api service service. This utility wraps {@link ApiServicePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see ApiServicePersistence
 * @see ApiServicePersistenceImpl
 * @generated
 */
public class ApiServiceUtil {
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
	public static void clearCache(ApiService apiService) {
		getPersistence().clearCache(apiService);
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
	public static List<ApiService> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ApiService> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ApiService> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static ApiService update(ApiService apiService)
		throws SystemException {
		return getPersistence().update(apiService);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static ApiService update(ApiService apiService,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(apiService, serviceContext);
	}

	/**
	* Returns all the api services where apiCode = &#63;.
	*
	* @param apiCode the api code
	* @return the matching api services
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.api.model.ApiService> findByApiCode(
		java.lang.String apiCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByApiCode(apiCode);
	}

	/**
	* Returns a range of all the api services where apiCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.api.model.impl.ApiServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param apiCode the api code
	* @param start the lower bound of the range of api services
	* @param end the upper bound of the range of api services (not inclusive)
	* @return the range of matching api services
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.api.model.ApiService> findByApiCode(
		java.lang.String apiCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByApiCode(apiCode, start, end);
	}

	/**
	* Returns an ordered range of all the api services where apiCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.api.model.impl.ApiServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param apiCode the api code
	* @param start the lower bound of the range of api services
	* @param end the upper bound of the range of api services (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching api services
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.api.model.ApiService> findByApiCode(
		java.lang.String apiCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByApiCode(apiCode, start, end, orderByComparator);
	}

	/**
	* Returns the first api service in the ordered set where apiCode = &#63;.
	*
	* @param apiCode the api code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching api service
	* @throws org.opencps.api.NoSuchApiServiceException if a matching api service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.api.model.ApiService findByApiCode_First(
		java.lang.String apiCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.api.NoSuchApiServiceException {
		return getPersistence().findByApiCode_First(apiCode, orderByComparator);
	}

	/**
	* Returns the first api service in the ordered set where apiCode = &#63;.
	*
	* @param apiCode the api code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching api service, or <code>null</code> if a matching api service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.api.model.ApiService fetchByApiCode_First(
		java.lang.String apiCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByApiCode_First(apiCode, orderByComparator);
	}

	/**
	* Returns the last api service in the ordered set where apiCode = &#63;.
	*
	* @param apiCode the api code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching api service
	* @throws org.opencps.api.NoSuchApiServiceException if a matching api service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.api.model.ApiService findByApiCode_Last(
		java.lang.String apiCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.api.NoSuchApiServiceException {
		return getPersistence().findByApiCode_Last(apiCode, orderByComparator);
	}

	/**
	* Returns the last api service in the ordered set where apiCode = &#63;.
	*
	* @param apiCode the api code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching api service, or <code>null</code> if a matching api service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.api.model.ApiService fetchByApiCode_Last(
		java.lang.String apiCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByApiCode_Last(apiCode, orderByComparator);
	}

	/**
	* Returns the api services before and after the current api service in the ordered set where apiCode = &#63;.
	*
	* @param apiLogId the primary key of the current api service
	* @param apiCode the api code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next api service
	* @throws org.opencps.api.NoSuchApiServiceException if a api service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.api.model.ApiService[] findByApiCode_PrevAndNext(
		long apiLogId, java.lang.String apiCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.api.NoSuchApiServiceException {
		return getPersistence()
				   .findByApiCode_PrevAndNext(apiLogId, apiCode,
			orderByComparator);
	}

	/**
	* Removes all the api services where apiCode = &#63; from the database.
	*
	* @param apiCode the api code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByApiCode(java.lang.String apiCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByApiCode(apiCode);
	}

	/**
	* Returns the number of api services where apiCode = &#63;.
	*
	* @param apiCode the api code
	* @return the number of matching api services
	* @throws SystemException if a system exception occurred
	*/
	public static int countByApiCode(java.lang.String apiCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByApiCode(apiCode);
	}

	/**
	* Returns all the api services where oid = &#63;.
	*
	* @param oid the oid
	* @return the matching api services
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.api.model.ApiService> findByOid(
		java.lang.String oid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByOid(oid);
	}

	/**
	* Returns a range of all the api services where oid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.api.model.impl.ApiServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param oid the oid
	* @param start the lower bound of the range of api services
	* @param end the upper bound of the range of api services (not inclusive)
	* @return the range of matching api services
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.api.model.ApiService> findByOid(
		java.lang.String oid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByOid(oid, start, end);
	}

	/**
	* Returns an ordered range of all the api services where oid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.api.model.impl.ApiServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param oid the oid
	* @param start the lower bound of the range of api services
	* @param end the upper bound of the range of api services (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching api services
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.api.model.ApiService> findByOid(
		java.lang.String oid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByOid(oid, start, end, orderByComparator);
	}

	/**
	* Returns the first api service in the ordered set where oid = &#63;.
	*
	* @param oid the oid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching api service
	* @throws org.opencps.api.NoSuchApiServiceException if a matching api service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.api.model.ApiService findByOid_First(
		java.lang.String oid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.api.NoSuchApiServiceException {
		return getPersistence().findByOid_First(oid, orderByComparator);
	}

	/**
	* Returns the first api service in the ordered set where oid = &#63;.
	*
	* @param oid the oid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching api service, or <code>null</code> if a matching api service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.api.model.ApiService fetchByOid_First(
		java.lang.String oid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByOid_First(oid, orderByComparator);
	}

	/**
	* Returns the last api service in the ordered set where oid = &#63;.
	*
	* @param oid the oid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching api service
	* @throws org.opencps.api.NoSuchApiServiceException if a matching api service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.api.model.ApiService findByOid_Last(
		java.lang.String oid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.api.NoSuchApiServiceException {
		return getPersistence().findByOid_Last(oid, orderByComparator);
	}

	/**
	* Returns the last api service in the ordered set where oid = &#63;.
	*
	* @param oid the oid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching api service, or <code>null</code> if a matching api service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.api.model.ApiService fetchByOid_Last(
		java.lang.String oid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByOid_Last(oid, orderByComparator);
	}

	/**
	* Returns the api services before and after the current api service in the ordered set where oid = &#63;.
	*
	* @param apiLogId the primary key of the current api service
	* @param oid the oid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next api service
	* @throws org.opencps.api.NoSuchApiServiceException if a api service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.api.model.ApiService[] findByOid_PrevAndNext(
		long apiLogId, java.lang.String oid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.api.NoSuchApiServiceException {
		return getPersistence()
				   .findByOid_PrevAndNext(apiLogId, oid, orderByComparator);
	}

	/**
	* Removes all the api services where oid = &#63; from the database.
	*
	* @param oid the oid
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByOid(java.lang.String oid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByOid(oid);
	}

	/**
	* Returns the number of api services where oid = &#63;.
	*
	* @param oid the oid
	* @return the number of matching api services
	* @throws SystemException if a system exception occurred
	*/
	public static int countByOid(java.lang.String oid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByOid(oid);
	}

	/**
	* Returns all the api services where apiCode = &#63; and oid = &#63;.
	*
	* @param apiCode the api code
	* @param oid the oid
	* @return the matching api services
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.api.model.ApiService> findByA_O(
		java.lang.String apiCode, java.lang.String oid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByA_O(apiCode, oid);
	}

	/**
	* Returns a range of all the api services where apiCode = &#63; and oid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.api.model.impl.ApiServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param apiCode the api code
	* @param oid the oid
	* @param start the lower bound of the range of api services
	* @param end the upper bound of the range of api services (not inclusive)
	* @return the range of matching api services
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.api.model.ApiService> findByA_O(
		java.lang.String apiCode, java.lang.String oid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByA_O(apiCode, oid, start, end);
	}

	/**
	* Returns an ordered range of all the api services where apiCode = &#63; and oid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.api.model.impl.ApiServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param apiCode the api code
	* @param oid the oid
	* @param start the lower bound of the range of api services
	* @param end the upper bound of the range of api services (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching api services
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.api.model.ApiService> findByA_O(
		java.lang.String apiCode, java.lang.String oid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByA_O(apiCode, oid, start, end, orderByComparator);
	}

	/**
	* Returns the first api service in the ordered set where apiCode = &#63; and oid = &#63;.
	*
	* @param apiCode the api code
	* @param oid the oid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching api service
	* @throws org.opencps.api.NoSuchApiServiceException if a matching api service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.api.model.ApiService findByA_O_First(
		java.lang.String apiCode, java.lang.String oid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.api.NoSuchApiServiceException {
		return getPersistence().findByA_O_First(apiCode, oid, orderByComparator);
	}

	/**
	* Returns the first api service in the ordered set where apiCode = &#63; and oid = &#63;.
	*
	* @param apiCode the api code
	* @param oid the oid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching api service, or <code>null</code> if a matching api service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.api.model.ApiService fetchByA_O_First(
		java.lang.String apiCode, java.lang.String oid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByA_O_First(apiCode, oid, orderByComparator);
	}

	/**
	* Returns the last api service in the ordered set where apiCode = &#63; and oid = &#63;.
	*
	* @param apiCode the api code
	* @param oid the oid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching api service
	* @throws org.opencps.api.NoSuchApiServiceException if a matching api service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.api.model.ApiService findByA_O_Last(
		java.lang.String apiCode, java.lang.String oid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.api.NoSuchApiServiceException {
		return getPersistence().findByA_O_Last(apiCode, oid, orderByComparator);
	}

	/**
	* Returns the last api service in the ordered set where apiCode = &#63; and oid = &#63;.
	*
	* @param apiCode the api code
	* @param oid the oid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching api service, or <code>null</code> if a matching api service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.api.model.ApiService fetchByA_O_Last(
		java.lang.String apiCode, java.lang.String oid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByA_O_Last(apiCode, oid, orderByComparator);
	}

	/**
	* Returns the api services before and after the current api service in the ordered set where apiCode = &#63; and oid = &#63;.
	*
	* @param apiLogId the primary key of the current api service
	* @param apiCode the api code
	* @param oid the oid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next api service
	* @throws org.opencps.api.NoSuchApiServiceException if a api service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.api.model.ApiService[] findByA_O_PrevAndNext(
		long apiLogId, java.lang.String apiCode, java.lang.String oid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.api.NoSuchApiServiceException {
		return getPersistence()
				   .findByA_O_PrevAndNext(apiLogId, apiCode, oid,
			orderByComparator);
	}

	/**
	* Removes all the api services where apiCode = &#63; and oid = &#63; from the database.
	*
	* @param apiCode the api code
	* @param oid the oid
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByA_O(java.lang.String apiCode,
		java.lang.String oid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByA_O(apiCode, oid);
	}

	/**
	* Returns the number of api services where apiCode = &#63; and oid = &#63;.
	*
	* @param apiCode the api code
	* @param oid the oid
	* @return the number of matching api services
	* @throws SystemException if a system exception occurred
	*/
	public static int countByA_O(java.lang.String apiCode, java.lang.String oid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByA_O(apiCode, oid);
	}

	/**
	* Caches the api service in the entity cache if it is enabled.
	*
	* @param apiService the api service
	*/
	public static void cacheResult(org.opencps.api.model.ApiService apiService) {
		getPersistence().cacheResult(apiService);
	}

	/**
	* Caches the api services in the entity cache if it is enabled.
	*
	* @param apiServices the api services
	*/
	public static void cacheResult(
		java.util.List<org.opencps.api.model.ApiService> apiServices) {
		getPersistence().cacheResult(apiServices);
	}

	/**
	* Creates a new api service with the primary key. Does not add the api service to the database.
	*
	* @param apiLogId the primary key for the new api service
	* @return the new api service
	*/
	public static org.opencps.api.model.ApiService create(long apiLogId) {
		return getPersistence().create(apiLogId);
	}

	/**
	* Removes the api service with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param apiLogId the primary key of the api service
	* @return the api service that was removed
	* @throws org.opencps.api.NoSuchApiServiceException if a api service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.api.model.ApiService remove(long apiLogId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.api.NoSuchApiServiceException {
		return getPersistence().remove(apiLogId);
	}

	public static org.opencps.api.model.ApiService updateImpl(
		org.opencps.api.model.ApiService apiService)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(apiService);
	}

	/**
	* Returns the api service with the primary key or throws a {@link org.opencps.api.NoSuchApiServiceException} if it could not be found.
	*
	* @param apiLogId the primary key of the api service
	* @return the api service
	* @throws org.opencps.api.NoSuchApiServiceException if a api service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.api.model.ApiService findByPrimaryKey(
		long apiLogId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.opencps.api.NoSuchApiServiceException {
		return getPersistence().findByPrimaryKey(apiLogId);
	}

	/**
	* Returns the api service with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param apiLogId the primary key of the api service
	* @return the api service, or <code>null</code> if a api service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.opencps.api.model.ApiService fetchByPrimaryKey(
		long apiLogId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(apiLogId);
	}

	/**
	* Returns all the api services.
	*
	* @return the api services
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.api.model.ApiService> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<org.opencps.api.model.ApiService> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the api services.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.api.model.impl.ApiServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of api services
	* @param end the upper bound of the range of api services (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of api services
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.opencps.api.model.ApiService> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the api services from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of api services.
	*
	* @return the number of api services
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ApiServicePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ApiServicePersistence)PortletBeanLocatorUtil.locate(org.opencps.api.service.ClpSerializer.getServletContextName(),
					ApiServicePersistence.class.getName());

			ReferenceRegistry.registerReference(ApiServiceUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ApiServicePersistence persistence) {
	}

	private static ApiServicePersistence _persistence;
}