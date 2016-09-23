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

package org.opencps.datamgt.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author khoavd
 */
public class DictItemFinderUtil {
	public static java.util.List<org.opencps.datamgt.model.DictItem> searchDictItemByName_like(
		java.lang.String collectionCode, java.lang.String itemCode,
		java.lang.String keyword, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .searchDictItemByName_like(collectionCode, itemCode,
			keyword, groupId, start, end, obc);
	}

	public static DictItemFinder getFinder() {
		if (_finder == null) {
			_finder = (DictItemFinder)PortletBeanLocatorUtil.locate(org.opencps.datamgt.service.ClpSerializer.getServletContextName(),
					DictItemFinder.class.getName());

			ReferenceRegistry.registerReference(DictItemFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(DictItemFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(DictItemFinderUtil.class, "_finder");
	}

	private static DictItemFinder _finder;
}