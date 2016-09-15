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
public interface DossierFinder {
	public int countDossierByKeywordDomainAndStatus(long groupId,
		java.lang.String keyword, java.lang.String domainCode,
		java.util.List<java.lang.String> govAgencyCodes,
		java.lang.String dossierStatus);

	public int countDossierByUser(long groupId, long userId,
		java.lang.String keyword, java.lang.String serviceDomainTreeIndex,
		java.lang.String dossierStatus);

	public java.util.List<org.opencps.dossiermgt.model.Dossier> searchDossierByKeywordDomainAndStatus(
		long groupId, java.lang.String keyword, java.lang.String domainCode,
		java.util.List<java.lang.String> govAgencyCodes,
		java.lang.String dossierStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc);

	public java.util.List searchDossierByUser(long groupId, long userId,
		java.lang.String keyword, java.lang.String serviceDomainTreeIndex,
		java.lang.String dossierStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc);

	public int countDossierForRemoteService(java.lang.String dossiertype,
		java.lang.String organizationcode, java.lang.String processStepId,
		java.lang.String status, java.lang.String fromdate,
		java.lang.String todate, int documentyear, java.lang.String customername);

	public java.util.List<org.opencps.dossiermgt.model.Dossier> searchDossierForRemoteService(
		java.lang.String dossiertype, java.lang.String organizationcode,
		java.lang.String processStepId, java.lang.String status,
		java.lang.String fromdate, java.lang.String todate, int documentyear,
		java.lang.String customername, int start, int end);

	public int countDossierByUserAssignProcessOrder(long userId);

	public java.util.List<org.opencps.dossiermgt.model.Dossier> searchDossierByUserAssignByProcessOrder(
		long userId, int start, int end);

	public int countDossierByP_S_U(java.lang.String processNo,
		java.lang.String stepNo, long userId);

	public java.util.List<org.opencps.dossiermgt.model.Dossier> searchDossierByP_S_U(
		java.lang.String processNo, java.lang.String stepNo, long userId,
		int start, int end);

	public int countDossierByP_SN_U(java.lang.String processNo,
		java.lang.String stepName, long userId);

	public java.util.List<org.opencps.dossiermgt.model.Dossier> searchDossierByP_SN_U(
		java.lang.String processNo, java.lang.String stepName, long userId,
		int start, int end);

	public int countDossierByDS_RD_SN_U(long userId,
		java.lang.String dossierStatus, java.lang.String serviceNo,
		java.lang.String fromDate, java.lang.String toDate);

	public java.util.List<org.opencps.dossiermgt.model.Dossier> searchDossierByDS_RD_SN_U(
		java.lang.String dossierStatus, java.lang.String serviceNo,
		java.lang.String fromDate, java.lang.String toDate, long userId,
		int start, int end);

	public int countDossierByP_PS_U(java.lang.String processNo,
		java.lang.String processStepNo, long userId);

	public java.util.List<org.opencps.dossiermgt.model.Dossier> searchDossierByP_PS_U(
		java.lang.String processNo, java.lang.String processStepNo,
		long userId, int start, int end);

	public int countDossierByUserNewRequest(long groupId, long userId);

	public java.util.List searchDossierByUserNewRequest(long groupId,
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc);
}