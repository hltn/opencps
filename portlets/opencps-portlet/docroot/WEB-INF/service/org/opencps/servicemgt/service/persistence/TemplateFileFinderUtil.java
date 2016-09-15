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
public class TemplateFileFinderUtil {
	public static java.util.List<org.opencps.servicemgt.model.TemplateFile> finderByKeywords(
		long groupId, java.lang.String keywords, int start, int end) {
		return getFinder().finderByKeywords(groupId, keywords, start, end);
	}

	public static int countByKeywords(long groupId, java.lang.String keywords)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getFinder().countByKeywords(groupId, keywords);
	}

	public static TemplateFileFinder getFinder() {
		if (_finder == null) {
			_finder = (TemplateFileFinder)PortletBeanLocatorUtil.locate(org.opencps.servicemgt.service.ClpSerializer.getServletContextName(),
					TemplateFileFinder.class.getName());

			ReferenceRegistry.registerReference(TemplateFileFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(TemplateFileFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(TemplateFileFinderUtil.class,
			"_finder");
	}

	private static TemplateFileFinder _finder;
}