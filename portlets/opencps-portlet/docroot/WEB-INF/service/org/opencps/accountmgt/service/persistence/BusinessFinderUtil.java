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

package org.opencps.accountmgt.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author khoavd
 */
public class BusinessFinderUtil {
	public static java.util.List<org.opencps.accountmgt.model.Business> searchBusiness(
		long groupId, java.lang.String keywords, int accountStatus,
		java.lang.String businessDomain, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .searchBusiness(groupId, keywords, accountStatus,
			businessDomain, start, end);
	}

	public static int countBussiness(long groupId, java.lang.String keywords,
		int accountStatus, java.lang.String businessDomain)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countBussiness(groupId, keywords, accountStatus,
			businessDomain);
	}

	public static BusinessFinder getFinder() {
		if (_finder == null) {
			_finder = (BusinessFinder)PortletBeanLocatorUtil.locate(org.opencps.accountmgt.service.ClpSerializer.getServletContextName(),
					BusinessFinder.class.getName());

			ReferenceRegistry.registerReference(BusinessFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(BusinessFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(BusinessFinderUtil.class, "_finder");
	}

	private static BusinessFinder _finder;
}