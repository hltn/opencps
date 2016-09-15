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
public interface DossierFileFinder {
	public int countDossierFile(long groupId, long ownerUserId,
		long ownerOrganizationId, java.lang.String keyword,
		java.lang.String templateFileNo, int removed);

	public int countDossierFile(long groupId, java.lang.String keyword,
		long dossierTemplateId, long fileEntryId, boolean onlyViewFileResult);

	public int countDossierFileAdvance(long groupId, long ownerUserId,
		long ownerOrganizationId, java.lang.String keyword,
		java.lang.String templateFileNo, int removed, int partType, int original);

	public java.util.List<org.opencps.dossiermgt.model.DossierFile> searchDossierFile(
		long groupId, long ownerUserId, long ownerOrganizationId,
		java.lang.String keyword, java.lang.String templateFileNo, int removed,
		int start, int end, com.liferay.portal.kernel.util.OrderByComparator obc);

	public java.util.List<org.opencps.dossiermgt.model.DossierFile> searchDossierFile(
		long groupId, java.lang.String keyword, long dossierTemplateId,
		long fileEntryId, boolean onlyViewFileResult, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc);

	public java.util.List searchDossierFileAdvance(long groupId,
		long ownerUserId, long ownerOrganizationId, java.lang.String keyword,
		java.lang.String templateFileNo, int removed, int partType,
		int original, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc);
}