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

package org.opencps.paymentmgt.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author trungdk
 */
public class PaymentFileFinderUtil {
	public static java.util.List<org.opencps.paymentmgt.model.PaymentFile> searchPaymentFiles(
		long groupId, int paymentStatus, java.lang.String keywords, int start,
		int end) {
		return getFinder()
				   .searchPaymentFiles(groupId, paymentStatus, keywords, start,
			end);
	}

	public static int countPaymentFiles(long groupId, int paymentStatus,
		java.lang.String keywords) {
		return getFinder().countPaymentFiles(groupId, paymentStatus, keywords);
	}

	public static int countCustomerPaymentFile(long groupId,
		java.lang.String keyword, boolean isCitizen, long customerId,
		int paymentStatus) {
		return getFinder()
				   .countCustomerPaymentFile(groupId, keyword, isCitizen,
			customerId, paymentStatus);
	}

	public static java.util.List<org.opencps.paymentmgt.model.PaymentFile> searchCustomerPaymentFile(
		long groupId, java.lang.String keyword, boolean isCitizen,
		long customerId, int paymentStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc) {
		return getFinder()
				   .searchCustomerPaymentFile(groupId, keyword, isCitizen,
			customerId, paymentStatus, start, end, obc);
	}

	public static int countCustomerPaymentFileNewRequest(long groupId,
		java.lang.String keyword, boolean isCitizen, long customerId,
		int[] paymentStatus) {
		return getFinder()
				   .countCustomerPaymentFileNewRequest(groupId, keyword,
			isCitizen, customerId, paymentStatus);
	}

	public static java.util.List<org.opencps.paymentmgt.model.PaymentFile> searchCustomerPaymentFileNewRequest(
		long groupId, java.lang.String keyword, boolean isCitizen,
		long customerId, int[] paymentStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc) {
		return getFinder()
				   .searchCustomerPaymentFileNewRequest(groupId, keyword,
			isCitizen, customerId, paymentStatus, start, end, obc);
	}

	public static PaymentFileFinder getFinder() {
		if (_finder == null) {
			_finder = (PaymentFileFinder)PortletBeanLocatorUtil.locate(org.opencps.paymentmgt.service.ClpSerializer.getServletContextName(),
					PaymentFileFinder.class.getName());

			ReferenceRegistry.registerReference(PaymentFileFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(PaymentFileFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(PaymentFileFinderUtil.class,
			"_finder");
	}

	private static PaymentFileFinder _finder;
}