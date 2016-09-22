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

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import org.opencps.dossiermgt.model.DossierTemplate;
import org.opencps.dossiermgt.service.DossierTemplateLocalServiceUtil;

/**
 * @author trungnt
 * @generated
 */
public abstract class DossierTemplateActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public DossierTemplateActionableDynamicQuery() throws SystemException {
		setBaseLocalService(DossierTemplateLocalServiceUtil.getService());
		setClass(DossierTemplate.class);

		setClassLoader(org.opencps.dossiermgt.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("dossierTemplateId");
	}
}