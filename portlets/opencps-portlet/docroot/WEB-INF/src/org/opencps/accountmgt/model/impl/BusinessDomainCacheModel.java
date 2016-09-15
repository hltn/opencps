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

package org.opencps.accountmgt.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import org.opencps.accountmgt.model.BusinessDomain;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing BusinessDomain in entity cache.
 *
 * @author khoavd
 * @see BusinessDomain
 * @generated
 */
public class BusinessDomainCacheModel implements CacheModel<BusinessDomain>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{domainId=");
		sb.append(domainId);
		sb.append(", businessId=");
		sb.append(businessId);
		sb.append(", businessDomainCode=");
		sb.append(businessDomainCode);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public BusinessDomain toEntityModel() {
		BusinessDomainImpl businessDomainImpl = new BusinessDomainImpl();

		businessDomainImpl.setDomainId(domainId);
		businessDomainImpl.setBusinessId(businessId);

		if (businessDomainCode == null) {
			businessDomainImpl.setBusinessDomainCode(StringPool.BLANK);
		}
		else {
			businessDomainImpl.setBusinessDomainCode(businessDomainCode);
		}

		businessDomainImpl.resetOriginalValues();

		return businessDomainImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		domainId = objectInput.readLong();
		businessId = objectInput.readLong();
		businessDomainCode = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(domainId);
		objectOutput.writeLong(businessId);

		if (businessDomainCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(businessDomainCode);
		}
	}

	public long domainId;
	public long businessId;
	public String businessDomainCode;
}