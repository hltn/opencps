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
public interface DossierLogFinder {
	public int countAdminLog(java.util.Date fromUpdateDatetime,
		java.util.Date toUpdateDatetime, int level,
		java.lang.String dossierStatus);

	public java.util.List<org.opencps.dossiermgt.model.DossierLog> findRequiredProcessDossier(
		long dossierId, java.lang.String[] actors,
		java.lang.String[] requestCommands);

	public java.util.List<org.opencps.dossiermgt.model.DossierLog> searchAdminLog(
		java.util.Date fromUpdateDatetime, java.util.Date toUpdateDatetime,
		int level, java.lang.String dossierStatus, int start, int end);
}