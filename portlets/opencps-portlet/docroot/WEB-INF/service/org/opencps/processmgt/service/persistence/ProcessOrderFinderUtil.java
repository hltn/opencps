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
public class ProcessOrderFinderUtil {
	public static int countProcessOrder(long serviceInfoId, long processStepId,
		long loginUserId, long assignToUserId) {
		return getFinder()
				   .countProcessOrder(serviceInfoId, processStepId,
			loginUserId, assignToUserId);
	}

	public static int countProcessOrderJustFinished(long serviceInfoId,
		long processStepId, long actionUserId) {
		return getFinder()
				   .countProcessOrderJustFinished(serviceInfoId, processStepId,
			actionUserId);
	}

	public static java.util.List getProcessOrderServiceByUser(long loginUserId) {
		return getFinder().getProcessOrderServiceByUser(loginUserId);
	}

	public static java.util.List getProcessOrderServiceJustFinishedByUser(
		long loginUserId) {
		return getFinder().getProcessOrderServiceJustFinishedByUser(loginUserId);
	}

	public static java.util.List getUserProcessStep(long loginUserId,
		long serviceInfoId) {
		return getFinder().getUserProcessStep(loginUserId, serviceInfoId);
	}

	public static java.util.List getUserProcessStepJustFinished(
		long loginUserId, long serviceInfoId) {
		return getFinder()
				   .getUserProcessStepJustFinished(loginUserId, serviceInfoId);
	}

	public static java.util.List searchProcessOrder(long serviceInfoId,
		long processStepId, long loginUserId, long assignToUserId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator) {
		return getFinder()
				   .searchProcessOrder(serviceInfoId, processStepId,
			loginUserId, assignToUserId, start, end, orderByComparator);
	}

	public static java.util.List searchProcessOrderJustFinished(
		long serviceInfoId, long processStepId, long actionUserId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator) {
		return getFinder()
				   .searchProcessOrderJustFinished(serviceInfoId,
			processStepId, actionUserId, start, end, orderByComparator);
	}

	public static ProcessOrderFinder getFinder() {
		if (_finder == null) {
			_finder = (ProcessOrderFinder)PortletBeanLocatorUtil.locate(org.opencps.processmgt.service.ClpSerializer.getServletContextName(),
					ProcessOrderFinder.class.getName());

			ReferenceRegistry.registerReference(ProcessOrderFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(ProcessOrderFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(ProcessOrderFinderUtil.class,
			"_finder");
	}

	private static ProcessOrderFinder _finder;
}