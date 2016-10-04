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

/**
 * @author trungdk
 */
public interface PaymentFileFinder {
	public java.util.List<org.opencps.paymentmgt.model.PaymentFile> searchPaymentFiles(
		long groupId, int paymentStatus, java.lang.String keywords, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	public int countPaymentFiles(long groupId, int paymentStatus,
		java.lang.String keywords)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countCustomerPaymentFile(long groupId, java.lang.String keyword,
		boolean isCitizen, long customerId, int paymentStatus);

	public java.util.List<org.opencps.paymentmgt.model.PaymentFile> searchCustomerPaymentFile(
		long groupId, java.lang.String keyword, boolean isCitizen,
		long customerId, int paymentStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc);

	public int countCustomerPaymentFileNewRequest(long groupId,
		java.lang.String keyword, boolean isCitizen, long customerId,
		int[] paymentStatus);

	public java.util.List<org.opencps.paymentmgt.model.PaymentFile> searchCustomerPaymentFileNewRequest(
		long groupId, java.lang.String keyword, boolean isCitizen,
		long customerId, int[] paymentStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc);
}