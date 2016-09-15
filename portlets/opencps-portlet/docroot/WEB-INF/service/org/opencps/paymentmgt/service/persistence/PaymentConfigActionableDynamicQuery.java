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

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import org.opencps.paymentmgt.model.PaymentConfig;
import org.opencps.paymentmgt.service.PaymentConfigLocalServiceUtil;

/**
 * @author trungdk
 * @generated
 */
public abstract class PaymentConfigActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public PaymentConfigActionableDynamicQuery() throws SystemException {
		setBaseLocalService(PaymentConfigLocalServiceUtil.getService());
		setClass(PaymentConfig.class);

		setClassLoader(org.opencps.paymentmgt.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("paymentConfigId");
	}
}