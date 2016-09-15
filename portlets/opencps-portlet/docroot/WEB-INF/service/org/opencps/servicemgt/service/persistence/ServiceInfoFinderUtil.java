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

package org.opencps.servicemgt.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author khoavd
 */
public class ServiceInfoFinderUtil {
	public static int countService(long groupId, java.lang.String keywords,
		java.lang.String administrationCode, java.lang.String domainCode) {
		return getFinder()
				   .countService(groupId, keywords, administrationCode,
			domainCode);
	}

	public static java.util.List<org.opencps.servicemgt.model.ServiceInfo> searchService(
		long groupId, java.lang.String keywords,
		java.lang.String administrationCode, java.lang.String domainCode,
		int start, int end) {
		return getFinder()
				   .searchService(groupId, keywords, administrationCode,
			domainCode, start, end);
	}

	public static ServiceInfoFinder getFinder() {
		if (_finder == null) {
			_finder = (ServiceInfoFinder)PortletBeanLocatorUtil.locate(org.opencps.servicemgt.service.ClpSerializer.getServletContextName(),
					ServiceInfoFinder.class.getName());

			ReferenceRegistry.registerReference(ServiceInfoFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(ServiceInfoFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(ServiceInfoFinderUtil.class,
			"_finder");
	}

	private static ServiceInfoFinder _finder;
}