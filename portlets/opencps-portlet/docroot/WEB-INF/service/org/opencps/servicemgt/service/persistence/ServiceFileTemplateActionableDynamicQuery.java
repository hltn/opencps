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

package org.opencps.servicemgt.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import org.opencps.servicemgt.model.ServiceFileTemplate;
import org.opencps.servicemgt.service.ServiceFileTemplateLocalServiceUtil;

/**
 * @author khoavd
 * @generated
 */
public abstract class ServiceFileTemplateActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public ServiceFileTemplateActionableDynamicQuery()
		throws SystemException {
		setBaseLocalService(ServiceFileTemplateLocalServiceUtil.getService());
		setClass(ServiceFileTemplate.class);

		setClassLoader(org.opencps.servicemgt.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("primaryKey.serviceinfoId");
	}
}