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

/**
 * @author khoavd
 */
public interface ProcessOrderFinder {
	public int countProcessOrder(long serviceInfoId, long processStepId,
		long loginUserId, long assignToUserId);

	public int countProcessOrderJustFinished(long serviceInfoId,
		long processStepId, long actionUserId);

	public java.util.List getProcessOrderServiceByUser(long loginUserId);

	public java.util.List getProcessOrderServiceJustFinishedByUser(
		long loginUserId);

	public java.util.List getUserProcessStep(long loginUserId,
		long serviceInfoId);

	public java.util.List getUserProcessStepJustFinished(long loginUserId,
		long serviceInfoId);

	public java.util.List searchProcessOrder(long serviceInfoId,
		long processStepId, long loginUserId, long assignToUserId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator);

	public java.util.List searchProcessOrderJustFinished(long serviceInfoId,
		long processStepId, long actionUserId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator);
}