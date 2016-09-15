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

package org.opencps.processmgt.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author khoavd
 */
public class ActionHistoryFinderUtil {
	public static java.util.List<org.opencps.processmgt.model.ActionHistory> searchActionHistoryByDossierId(
		long groupId, long dossierId) {
		return getFinder().searchActionHistoryByDossierId(groupId, dossierId);
	}

	public static ActionHistoryFinder getFinder() {
		if (_finder == null) {
			_finder = (ActionHistoryFinder)PortletBeanLocatorUtil.locate(org.opencps.processmgt.service.ClpSerializer.getServletContextName(),
					ActionHistoryFinder.class.getName());

			ReferenceRegistry.registerReference(ActionHistoryFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(ActionHistoryFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(ActionHistoryFinderUtil.class,
			"_finder");
	}

	private static ActionHistoryFinder _finder;
}