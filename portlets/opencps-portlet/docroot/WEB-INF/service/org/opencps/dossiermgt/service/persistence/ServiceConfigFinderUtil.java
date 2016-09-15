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
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author trungnt
 */
public class ServiceConfigFinderUtil {
	public static int countServiceConfig(long groupId,
		java.lang.String keywords, java.lang.String govAgencyCode,
		java.lang.String domainCode) {
		return getFinder()
				   .countServiceConfig(groupId, keywords, govAgencyCode,
			domainCode);
	}

	public static int countServiceConfigAdvance(long groupId,
		java.lang.String keyword, int servicePortal, int serviceOnegate,
		int serviceBackoffice, int serviceCitizen, int serviceBusinees,
		java.lang.String serviceDomainIndex, java.lang.String govAgencyIndex) {
		return getFinder()
				   .countServiceConfigAdvance(groupId, keyword, servicePortal,
			serviceOnegate, serviceBackoffice, serviceCitizen, serviceBusinees,
			serviceDomainIndex, govAgencyIndex);
	}

	public static int countServiceConfigByServiceMode(long groupId,
		int[] serviceModes) {
		return getFinder().countServiceConfigByServiceMode(groupId, serviceModes);
	}

	public static java.util.List<org.opencps.dossiermgt.model.ServiceConfig> searchServiceConfig(
		long groupId, java.lang.String keywords,
		java.lang.String govAgencyCode, java.lang.String domainCode, int start,
		int end) {
		return getFinder()
				   .searchServiceConfig(groupId, keywords, govAgencyCode,
			domainCode, start, end);
	}

	public static java.util.List searchServiceConfigAdvance(long groupId,
		java.lang.String keyword, int servicePortal, int serviceOnegate,
		int serviceBackoffice, int serviceCitizen, int serviceBusinees,
		java.lang.String serviceDomainIndex, java.lang.String govAgencyIndex,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator) {
		return getFinder()
				   .searchServiceConfigAdvance(groupId, keyword, servicePortal,
			serviceOnegate, serviceBackoffice, serviceCitizen, serviceBusinees,
			serviceDomainIndex, govAgencyIndex, start, end, orderByComparator);
	}

	public static java.util.List<org.opencps.dossiermgt.model.ServiceConfig> searchServiceConfigByServiceMode(
		long groupId, int[] serviceModes, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator) {
		return getFinder()
				   .searchServiceConfigByServiceMode(groupId, serviceModes,
			start, end, orderByComparator);
	}

	public static java.util.List getServiceConfigRecent(long groupId,
		long userId, int servicePortal, int serviceOnegate,
		int serviceBackoffice, int serviceCitizen, int serviceBusinees,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator) {
		return getFinder()
				   .getServiceConfigRecent(groupId, userId, servicePortal,
			serviceOnegate, serviceBackoffice, serviceCitizen, serviceBusinees,
			start, end, orderByComparator);
	}

	public static ServiceConfigFinder getFinder() {
		if (_finder == null) {
			_finder = (ServiceConfigFinder)PortletBeanLocatorUtil.locate(org.opencps.dossiermgt.service.ClpSerializer.getServletContextName(),
					ServiceConfigFinder.class.getName());

			ReferenceRegistry.registerReference(ServiceConfigFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(ServiceConfigFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(ServiceConfigFinderUtil.class,
			"_finder");
	}

	private static ServiceConfigFinder _finder;
}