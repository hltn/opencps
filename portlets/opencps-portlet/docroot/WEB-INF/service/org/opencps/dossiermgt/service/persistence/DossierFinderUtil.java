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
public class DossierFinderUtil {
	public static int countDossierByKeywordDomainAndStatus(long groupId,
		java.lang.String keyword, java.lang.String domainCode,
		java.util.List<java.lang.String> govAgencyCodes,
		java.lang.String dossierStatus) {
		return getFinder()
				   .countDossierByKeywordDomainAndStatus(groupId, keyword,
			domainCode, govAgencyCodes, dossierStatus);
	}

	public static int countDossierByUser(long groupId, long userId,
		java.lang.String keyword, java.lang.String serviceDomainTreeIndex,
		java.lang.String dossierStatus) {
		return getFinder()
				   .countDossierByUser(groupId, userId, keyword,
			serviceDomainTreeIndex, dossierStatus);
	}

	public static java.util.List<org.opencps.dossiermgt.model.Dossier> searchDossierByKeywordDomainAndStatus(
		long groupId, java.lang.String keyword, java.lang.String domainCode,
		java.util.List<java.lang.String> govAgencyCodes,
		java.lang.String dossierStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc) {
		return getFinder()
				   .searchDossierByKeywordDomainAndStatus(groupId, keyword,
			domainCode, govAgencyCodes, dossierStatus, start, end, obc);
	}

	public static java.util.List searchDossierByUser(long groupId, long userId,
		java.lang.String keyword, java.lang.String serviceDomainTreeIndex,
		java.lang.String dossierStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc) {
		return getFinder()
				   .searchDossierByUser(groupId, userId, keyword,
			serviceDomainTreeIndex, dossierStatus, start, end, obc);
	}

	public static int countDossierForRemoteService(
		java.lang.String dossiertype, java.lang.String organizationcode,
		java.lang.String processStepId, java.lang.String status,
		java.lang.String fromdate, java.lang.String todate, int documentyear,
		java.lang.String customername) {
		return getFinder()
				   .countDossierForRemoteService(dossiertype, organizationcode,
			processStepId, status, fromdate, todate, documentyear, customername);
	}

	public static java.util.List<org.opencps.dossiermgt.model.Dossier> searchDossierForRemoteService(
		java.lang.String dossiertype, java.lang.String organizationcode,
		java.lang.String processStepId, java.lang.String status,
		java.lang.String fromdate, java.lang.String todate, int documentyear,
		java.lang.String customername, int start, int end) {
		return getFinder()
				   .searchDossierForRemoteService(dossiertype,
			organizationcode, processStepId, status, fromdate, todate,
			documentyear, customername, start, end);
	}

	public static int countDossierByUserAssignProcessOrder(long userId) {
		return getFinder().countDossierByUserAssignProcessOrder(userId);
	}

	public static java.util.List<org.opencps.dossiermgt.model.Dossier> searchDossierByUserAssignByProcessOrder(
		long userId, int start, int end) {
		return getFinder()
				   .searchDossierByUserAssignByProcessOrder(userId, start, end);
	}

	public static int countDossierByP_S_U(java.lang.String processNo,
		java.lang.String stepNo, long userId) {
		return getFinder().countDossierByP_S_U(processNo, stepNo, userId);
	}

	public static java.util.List<org.opencps.dossiermgt.model.Dossier> searchDossierByP_S_U(
		java.lang.String processNo, java.lang.String stepNo, long userId,
		int start, int end) {
		return getFinder()
				   .searchDossierByP_S_U(processNo, stepNo, userId, start, end);
	}

	public static int countDossierByP_SN_U(java.lang.String processNo,
		java.lang.String stepName, long userId) {
		return getFinder().countDossierByP_SN_U(processNo, stepName, userId);
	}

	public static java.util.List<org.opencps.dossiermgt.model.Dossier> searchDossierByP_SN_U(
		java.lang.String processNo, java.lang.String stepName, long userId,
		int start, int end) {
		return getFinder()
				   .searchDossierByP_SN_U(processNo, stepName, userId, start,
			end);
	}

	public static int countDossierByDS_RD_SN_U(long userId,
		java.lang.String dossierStatus, java.lang.String serviceNo,
		java.lang.String fromDate, java.lang.String toDate) {
		return getFinder()
				   .countDossierByDS_RD_SN_U(userId, dossierStatus, serviceNo,
			fromDate, toDate);
	}

	public static java.util.List<org.opencps.dossiermgt.model.Dossier> searchDossierByDS_RD_SN_U(
		java.lang.String dossierStatus, java.lang.String serviceNo,
		java.lang.String fromDate, java.lang.String toDate, long userId,
		int start, int end) {
		return getFinder()
				   .searchDossierByDS_RD_SN_U(dossierStatus, serviceNo,
			fromDate, toDate, userId, start, end);
	}

	public static int countDossierByP_PS_U(java.lang.String processNo,
		java.lang.String processStepNo, long userId) {
		return getFinder().countDossierByP_PS_U(processNo, processStepNo, userId);
	}

	public static java.util.List<org.opencps.dossiermgt.model.Dossier> searchDossierByP_PS_U(
		java.lang.String processNo, java.lang.String processStepNo,
		long userId, int start, int end) {
		return getFinder()
				   .searchDossierByP_PS_U(processNo, processStepNo, userId,
			start, end);
	}

	public static int countDossierByUserNewRequest(long groupId, long userId) {
		return getFinder().countDossierByUserNewRequest(groupId, userId);
	}

	public static java.util.List searchDossierByUserNewRequest(long groupId,
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc) {
		return getFinder()
				   .searchDossierByUserNewRequest(groupId, userId, start, end,
			obc);
	}

	public static DossierFinder getFinder() {
		if (_finder == null) {
			_finder = (DossierFinder)PortletBeanLocatorUtil.locate(org.opencps.dossiermgt.service.ClpSerializer.getServletContextName(),
					DossierFinder.class.getName());

			ReferenceRegistry.registerReference(DossierFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(DossierFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(DossierFinderUtil.class, "_finder");
	}

	private static DossierFinder _finder;
}