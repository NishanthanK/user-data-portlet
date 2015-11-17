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

package com.prodyna.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link UserData}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserData
 * @generated
 */
public class UserDataWrapper implements UserData, ModelWrapper<UserData> {
	public UserDataWrapper(UserData userData) {
		_userData = userData;
	}

	@Override
	public Class<?> getModelClass() {
		return UserData.class;
	}

	@Override
	public String getModelClassName() {
		return UserData.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("userDataId", getUserDataId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("creationDate", getCreationDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("t_ShirtSize", getT_ShirtSize());
		attributes.put("dateOfBirth", getDateOfBirth());
		attributes.put("glasses", getGlasses());
		attributes.put("coffeesPerDay", getCoffeesPerDay());
		attributes.put("heightCm", getHeightCm());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long userDataId = (Long)attributes.get("userDataId");

		if (userDataId != null) {
			setUserDataId(userDataId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date creationDate = (Date)attributes.get("creationDate");

		if (creationDate != null) {
			setCreationDate(creationDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String t_ShirtSize = (String)attributes.get("t_ShirtSize");

		if (t_ShirtSize != null) {
			setT_ShirtSize(t_ShirtSize);
		}

		Date dateOfBirth = (Date)attributes.get("dateOfBirth");

		if (dateOfBirth != null) {
			setDateOfBirth(dateOfBirth);
		}

		Boolean glasses = (Boolean)attributes.get("glasses");

		if (glasses != null) {
			setGlasses(glasses);
		}

		Integer coffeesPerDay = (Integer)attributes.get("coffeesPerDay");

		if (coffeesPerDay != null) {
			setCoffeesPerDay(coffeesPerDay);
		}

		Integer heightCm = (Integer)attributes.get("heightCm");

		if (heightCm != null) {
			setHeightCm(heightCm);
		}
	}

	/**
	* Returns the primary key of this user data.
	*
	* @return the primary key of this user data
	*/
	@Override
	public long getPrimaryKey() {
		return _userData.getPrimaryKey();
	}

	/**
	* Sets the primary key of this user data.
	*
	* @param primaryKey the primary key of this user data
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_userData.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the user data ID of this user data.
	*
	* @return the user data ID of this user data
	*/
	@Override
	public long getUserDataId() {
		return _userData.getUserDataId();
	}

	/**
	* Sets the user data ID of this user data.
	*
	* @param userDataId the user data ID of this user data
	*/
	@Override
	public void setUserDataId(long userDataId) {
		_userData.setUserDataId(userDataId);
	}

	/**
	* Returns the company ID of this user data.
	*
	* @return the company ID of this user data
	*/
	@Override
	public long getCompanyId() {
		return _userData.getCompanyId();
	}

	/**
	* Sets the company ID of this user data.
	*
	* @param companyId the company ID of this user data
	*/
	@Override
	public void setCompanyId(long companyId) {
		_userData.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this user data.
	*
	* @return the user ID of this user data
	*/
	@Override
	public long getUserId() {
		return _userData.getUserId();
	}

	/**
	* Sets the user ID of this user data.
	*
	* @param userId the user ID of this user data
	*/
	@Override
	public void setUserId(long userId) {
		_userData.setUserId(userId);
	}

	/**
	* Returns the user uuid of this user data.
	*
	* @return the user uuid of this user data
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userData.getUserUuid();
	}

	/**
	* Sets the user uuid of this user data.
	*
	* @param userUuid the user uuid of this user data
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_userData.setUserUuid(userUuid);
	}

	/**
	* Returns the creation date of this user data.
	*
	* @return the creation date of this user data
	*/
	@Override
	public java.util.Date getCreationDate() {
		return _userData.getCreationDate();
	}

	/**
	* Sets the creation date of this user data.
	*
	* @param creationDate the creation date of this user data
	*/
	@Override
	public void setCreationDate(java.util.Date creationDate) {
		_userData.setCreationDate(creationDate);
	}

	/**
	* Returns the modified date of this user data.
	*
	* @return the modified date of this user data
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _userData.getModifiedDate();
	}

	/**
	* Sets the modified date of this user data.
	*
	* @param modifiedDate the modified date of this user data
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_userData.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the t_ shirt size of this user data.
	*
	* @return the t_ shirt size of this user data
	*/
	@Override
	public java.lang.String getT_ShirtSize() {
		return _userData.getT_ShirtSize();
	}

	/**
	* Sets the t_ shirt size of this user data.
	*
	* @param t_ShirtSize the t_ shirt size of this user data
	*/
	@Override
	public void setT_ShirtSize(java.lang.String t_ShirtSize) {
		_userData.setT_ShirtSize(t_ShirtSize);
	}

	/**
	* Returns the date of birth of this user data.
	*
	* @return the date of birth of this user data
	*/
	@Override
	public java.util.Date getDateOfBirth() {
		return _userData.getDateOfBirth();
	}

	/**
	* Sets the date of birth of this user data.
	*
	* @param dateOfBirth the date of birth of this user data
	*/
	@Override
	public void setDateOfBirth(java.util.Date dateOfBirth) {
		_userData.setDateOfBirth(dateOfBirth);
	}

	/**
	* Returns the glasses of this user data.
	*
	* @return the glasses of this user data
	*/
	@Override
	public boolean getGlasses() {
		return _userData.getGlasses();
	}

	/**
	* Returns <code>true</code> if this user data is glasses.
	*
	* @return <code>true</code> if this user data is glasses; <code>false</code> otherwise
	*/
	@Override
	public boolean isGlasses() {
		return _userData.isGlasses();
	}

	/**
	* Sets whether this user data is glasses.
	*
	* @param glasses the glasses of this user data
	*/
	@Override
	public void setGlasses(boolean glasses) {
		_userData.setGlasses(glasses);
	}

	/**
	* Returns the coffees per day of this user data.
	*
	* @return the coffees per day of this user data
	*/
	@Override
	public int getCoffeesPerDay() {
		return _userData.getCoffeesPerDay();
	}

	/**
	* Sets the coffees per day of this user data.
	*
	* @param coffeesPerDay the coffees per day of this user data
	*/
	@Override
	public void setCoffeesPerDay(int coffeesPerDay) {
		_userData.setCoffeesPerDay(coffeesPerDay);
	}

	/**
	* Returns the height cm of this user data.
	*
	* @return the height cm of this user data
	*/
	@Override
	public int getHeightCm() {
		return _userData.getHeightCm();
	}

	/**
	* Sets the height cm of this user data.
	*
	* @param heightCm the height cm of this user data
	*/
	@Override
	public void setHeightCm(int heightCm) {
		_userData.setHeightCm(heightCm);
	}

	@Override
	public boolean isNew() {
		return _userData.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_userData.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _userData.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_userData.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _userData.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _userData.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_userData.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _userData.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_userData.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_userData.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_userData.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new UserDataWrapper((UserData)_userData.clone());
	}

	@Override
	public int compareTo(com.prodyna.model.UserData userData) {
		return _userData.compareTo(userData);
	}

	@Override
	public int hashCode() {
		return _userData.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.prodyna.model.UserData> toCacheModel() {
		return _userData.toCacheModel();
	}

	@Override
	public com.prodyna.model.UserData toEscapedModel() {
		return new UserDataWrapper(_userData.toEscapedModel());
	}

	@Override
	public com.prodyna.model.UserData toUnescapedModel() {
		return new UserDataWrapper(_userData.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _userData.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _userData.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_userData.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UserDataWrapper)) {
			return false;
		}

		UserDataWrapper userDataWrapper = (UserDataWrapper)obj;

		if (Validator.equals(_userData, userDataWrapper._userData)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public UserData getWrappedUserData() {
		return _userData;
	}

	@Override
	public UserData getWrappedModel() {
		return _userData;
	}

	@Override
	public void resetOriginalValues() {
		_userData.resetOriginalValues();
	}

	private UserData _userData;
}