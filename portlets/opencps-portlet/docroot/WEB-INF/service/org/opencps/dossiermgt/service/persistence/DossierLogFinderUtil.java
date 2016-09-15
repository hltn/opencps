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
public class DossierLogFinderUtil {
	public static int countAdminLog(java.util.Date fromUpdateDatetime,
		java.util.Date toUpdateDatetime, int level,
		java.lang.String dossierStatus) {
		return getFinder()
				   .countAdminLog(fromUpdateDatetime, toUpdateDatetime, level,
			dossierStatus);
	}

	public static java.util.List<org.opencps.dossiermgt.model.DossierLog> findRequiredProcessDossier(
		long dossierId, java.lang.String[] actors,
		java.lang.String[] requestCommands) {
		return getFinder()
				   .findRequiredProcessDossier(dossierId, actors,
			requestCommands);
	}

	public static java.util.List<org.opencps.dossiermgt.model.DossierLog> searchAdminLog(
		java.util.Date fromUpdateDatetime, java.util.Date toUpdateDatetime,
		int level, java.lang.String dossierStatus, int start, int end) {
		return getFinder()
				   .searchAdminLog(fromUpdateDatetime, toUpdateDatetime, level,
			dossierStatus, start, end);
	}

	public static DossierLogFinder getFinder() {
		if (_finder == null) {
			_finder = (DossierLogFinder)PortletBeanLocatorUtil.locate(org.opencps.dossiermgt.service.ClpSerializer.getServletContextName(),
					DossierLogFinder.class.getName());

			ReferenceRegistry.registerReference(DossierLogFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(DossierLogFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(DossierLogFinderUtil.class,
			"_finder");
	}

	private static DossierLogFinder _finder;
}