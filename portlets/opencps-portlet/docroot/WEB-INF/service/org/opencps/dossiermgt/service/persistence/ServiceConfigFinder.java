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

/**
 * @author trungnt
 */
public interface ServiceConfigFinder {
	public int countServiceConfig(long groupId, java.lang.String keywords,
		java.lang.String govAgencyCode, java.lang.String domainCode);

	public int countServiceConfigAdvance(long groupId,
		java.lang.String keyword, int servicePortal, int serviceOnegate,
		int serviceBackoffice, int serviceCitizen, int serviceBusinees,
		java.lang.String serviceDomainIndex, java.lang.String govAgencyIndex);

	public int countServiceConfigByServiceMode(long groupId, int[] serviceModes);

	public java.util.List<org.opencps.dossiermgt.model.ServiceConfig> searchServiceConfig(
		long groupId, java.lang.String keywords,
		java.lang.String govAgencyCode, java.lang.String domainCode, int start,
		int end);

	public java.util.List searchServiceConfigAdvance(long groupId,
		java.lang.String keyword, int servicePortal, int serviceOnegate,
		int serviceBackoffice, int serviceCitizen, int serviceBusinees,
		java.lang.String serviceDomainIndex, java.lang.String govAgencyIndex,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator);

	public java.util.List<org.opencps.dossiermgt.model.ServiceConfig> searchServiceConfigByServiceMode(
		long groupId, int[] serviceModes, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator);

	public java.util.List getServiceConfigRecent(long groupId, long userId,
		int servicePortal, int serviceOnegate, int serviceBackoffice,
		int serviceCitizen, int serviceBusinees, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator);
}