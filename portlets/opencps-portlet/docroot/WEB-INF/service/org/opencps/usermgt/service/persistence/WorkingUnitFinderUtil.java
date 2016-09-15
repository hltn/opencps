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

package org.opencps.usermgt.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author khoavd
 */
public class WorkingUnitFinderUtil {
	public static int findMaxSibling(long groupId) {
		return getFinder().findMaxSibling(groupId);
	}

	public static WorkingUnitFinder getFinder() {
		if (_finder == null) {
			_finder = (WorkingUnitFinder)PortletBeanLocatorUtil.locate(org.opencps.usermgt.service.ClpSerializer.getServletContextName(),
					WorkingUnitFinder.class.getName());

			ReferenceRegistry.registerReference(WorkingUnitFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(WorkingUnitFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(WorkingUnitFinderUtil.class,
			"_finder");
	}

	private static WorkingUnitFinder _finder;
}