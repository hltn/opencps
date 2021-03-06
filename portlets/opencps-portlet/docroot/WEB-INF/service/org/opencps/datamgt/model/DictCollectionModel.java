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

package org.opencps.datamgt.model;

import com.liferay.portal.LocaleException;
import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;
import java.util.Locale;
import java.util.Map;

/**
 * The base model interface for the DictCollection service. Represents a row in the &quot;opencps_dictcollection&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.opencps.datamgt.model.impl.DictCollectionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.opencps.datamgt.model.impl.DictCollectionImpl}.
 * </p>
 *
 * @author khoavd
 * @see DictCollection
 * @see org.opencps.datamgt.model.impl.DictCollectionImpl
 * @see org.opencps.datamgt.model.impl.DictCollectionModelImpl
 * @generated
 */
public interface DictCollectionModel extends BaseModel<DictCollection> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a dict collection model instance should use the {@link DictCollection} interface instead.
	 */

	/**
	 * Returns the primary key of this dict collection.
	 *
	 * @return the primary key of this dict collection
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this dict collection.
	 *
	 * @param primaryKey the primary key of this dict collection
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the dict collection ID of this dict collection.
	 *
	 * @return the dict collection ID of this dict collection
	 */
	public long getDictCollectionId();

	/**
	 * Sets the dict collection ID of this dict collection.
	 *
	 * @param dictCollectionId the dict collection ID of this dict collection
	 */
	public void setDictCollectionId(long dictCollectionId);

	/**
	 * Returns the company ID of this dict collection.
	 *
	 * @return the company ID of this dict collection
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this dict collection.
	 *
	 * @param companyId the company ID of this dict collection
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this dict collection.
	 *
	 * @return the group ID of this dict collection
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this dict collection.
	 *
	 * @param groupId the group ID of this dict collection
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the user ID of this dict collection.
	 *
	 * @return the user ID of this dict collection
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this dict collection.
	 *
	 * @param userId the user ID of this dict collection
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this dict collection.
	 *
	 * @return the user uuid of this dict collection
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this dict collection.
	 *
	 * @param userUuid the user uuid of this dict collection
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the create date of this dict collection.
	 *
	 * @return the create date of this dict collection
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this dict collection.
	 *
	 * @param createDate the create date of this dict collection
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this dict collection.
	 *
	 * @return the modified date of this dict collection
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this dict collection.
	 *
	 * @param modifiedDate the modified date of this dict collection
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the collection code of this dict collection.
	 *
	 * @return the collection code of this dict collection
	 */
	@AutoEscape
	public String getCollectionCode();

	/**
	 * Sets the collection code of this dict collection.
	 *
	 * @param collectionCode the collection code of this dict collection
	 */
	public void setCollectionCode(String collectionCode);

	/**
	 * Returns the collection name of this dict collection.
	 *
	 * @return the collection name of this dict collection
	 */
	public String getCollectionName();

	/**
	 * Returns the localized collection name of this dict collection in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized collection name of this dict collection
	 */
	@AutoEscape
	public String getCollectionName(Locale locale);

	/**
	 * Returns the localized collection name of this dict collection in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized collection name of this dict collection. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	@AutoEscape
	public String getCollectionName(Locale locale, boolean useDefault);

	/**
	 * Returns the localized collection name of this dict collection in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized collection name of this dict collection
	 */
	@AutoEscape
	public String getCollectionName(String languageId);

	/**
	 * Returns the localized collection name of this dict collection in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized collection name of this dict collection
	 */
	@AutoEscape
	public String getCollectionName(String languageId, boolean useDefault);

	@AutoEscape
	public String getCollectionNameCurrentLanguageId();

	@AutoEscape
	public String getCollectionNameCurrentValue();

	/**
	 * Returns a map of the locales and localized collection names of this dict collection.
	 *
	 * @return the locales and localized collection names of this dict collection
	 */
	public Map<Locale, String> getCollectionNameMap();

	/**
	 * Sets the collection name of this dict collection.
	 *
	 * @param collectionName the collection name of this dict collection
	 */
	public void setCollectionName(String collectionName);

	/**
	 * Sets the localized collection name of this dict collection in the language.
	 *
	 * @param collectionName the localized collection name of this dict collection
	 * @param locale the locale of the language
	 */
	public void setCollectionName(String collectionName, Locale locale);

	/**
	 * Sets the localized collection name of this dict collection in the language, and sets the default locale.
	 *
	 * @param collectionName the localized collection name of this dict collection
	 * @param locale the locale of the language
	 * @param defaultLocale the default locale
	 */
	public void setCollectionName(String collectionName, Locale locale,
		Locale defaultLocale);

	public void setCollectionNameCurrentLanguageId(String languageId);

	/**
	 * Sets the localized collection names of this dict collection from the map of locales and localized collection names.
	 *
	 * @param collectionNameMap the locales and localized collection names of this dict collection
	 */
	public void setCollectionNameMap(Map<Locale, String> collectionNameMap);

	/**
	 * Sets the localized collection names of this dict collection from the map of locales and localized collection names, and sets the default locale.
	 *
	 * @param collectionNameMap the locales and localized collection names of this dict collection
	 * @param defaultLocale the default locale
	 */
	public void setCollectionNameMap(Map<Locale, String> collectionNameMap,
		Locale defaultLocale);

	/**
	 * Returns the description of this dict collection.
	 *
	 * @return the description of this dict collection
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this dict collection.
	 *
	 * @param description the description of this dict collection
	 */
	public void setDescription(String description);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public String[] getAvailableLanguageIds();

	public String getDefaultLanguageId();

	public void prepareLocalizedFieldsForImport() throws LocaleException;

	public void prepareLocalizedFieldsForImport(Locale defaultImportLocale)
		throws LocaleException;

	@Override
	public Object clone();

	@Override
	public int compareTo(
		org.opencps.datamgt.model.DictCollection dictCollection);

	@Override
	public int hashCode();

	@Override
	public CacheModel<org.opencps.datamgt.model.DictCollection> toCacheModel();

	@Override
	public org.opencps.datamgt.model.DictCollection toEscapedModel();

	@Override
	public org.opencps.datamgt.model.DictCollection toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}