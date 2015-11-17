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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.prodyna.service.ClpSerializer;
import com.prodyna.service.UserDataLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Brian Wing Shun Chan
 */
public class UserDataClp extends BaseModelImpl<UserData> implements UserData {
	public UserDataClp() {
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
	public long getPrimaryKey() {
		return _userDataId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setUserDataId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _userDataId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getUserDataId() {
		return _userDataId;
	}

	@Override
	public void setUserDataId(long userDataId) {
		_userDataId = userDataId;

		if (_userDataRemoteModel != null) {
			try {
				Class<?> clazz = _userDataRemoteModel.getClass();

				Method method = clazz.getMethod("setUserDataId", long.class);

				method.invoke(_userDataRemoteModel, userDataId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_userDataRemoteModel != null) {
			try {
				Class<?> clazz = _userDataRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_userDataRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_userDataRemoteModel != null) {
			try {
				Class<?> clazz = _userDataRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_userDataRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public Date getCreationDate() {
		return _creationDate;
	}

	@Override
	public void setCreationDate(Date creationDate) {
		_creationDate = creationDate;

		if (_userDataRemoteModel != null) {
			try {
				Class<?> clazz = _userDataRemoteModel.getClass();

				Method method = clazz.getMethod("setCreationDate", Date.class);

				method.invoke(_userDataRemoteModel, creationDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_userDataRemoteModel != null) {
			try {
				Class<?> clazz = _userDataRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_userDataRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getT_ShirtSize() {
		return _t_ShirtSize;
	}

	@Override
	public void setT_ShirtSize(String t_ShirtSize) {
		_t_ShirtSize = t_ShirtSize;

		if (_userDataRemoteModel != null) {
			try {
				Class<?> clazz = _userDataRemoteModel.getClass();

				Method method = clazz.getMethod("setT_ShirtSize", String.class);

				method.invoke(_userDataRemoteModel, t_ShirtSize);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getDateOfBirth() {
		return _dateOfBirth;
	}

	@Override
	public void setDateOfBirth(Date dateOfBirth) {
		_dateOfBirth = dateOfBirth;

		if (_userDataRemoteModel != null) {
			try {
				Class<?> clazz = _userDataRemoteModel.getClass();

				Method method = clazz.getMethod("setDateOfBirth", Date.class);

				method.invoke(_userDataRemoteModel, dateOfBirth);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getGlasses() {
		return _glasses;
	}

	@Override
	public boolean isGlasses() {
		return _glasses;
	}

	@Override
	public void setGlasses(boolean glasses) {
		_glasses = glasses;

		if (_userDataRemoteModel != null) {
			try {
				Class<?> clazz = _userDataRemoteModel.getClass();

				Method method = clazz.getMethod("setGlasses", boolean.class);

				method.invoke(_userDataRemoteModel, glasses);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCoffeesPerDay() {
		return _coffeesPerDay;
	}

	@Override
	public void setCoffeesPerDay(int coffeesPerDay) {
		_coffeesPerDay = coffeesPerDay;

		if (_userDataRemoteModel != null) {
			try {
				Class<?> clazz = _userDataRemoteModel.getClass();

				Method method = clazz.getMethod("setCoffeesPerDay", int.class);

				method.invoke(_userDataRemoteModel, coffeesPerDay);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getHeightCm() {
		return _heightCm;
	}

	@Override
	public void setHeightCm(int heightCm) {
		_heightCm = heightCm;

		if (_userDataRemoteModel != null) {
			try {
				Class<?> clazz = _userDataRemoteModel.getClass();

				Method method = clazz.getMethod("setHeightCm", int.class);

				method.invoke(_userDataRemoteModel, heightCm);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getUserDataRemoteModel() {
		return _userDataRemoteModel;
	}

	public void setUserDataRemoteModel(BaseModel<?> userDataRemoteModel) {
		_userDataRemoteModel = userDataRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _userDataRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_userDataRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			UserDataLocalServiceUtil.addUserData(this);
		}
		else {
			UserDataLocalServiceUtil.updateUserData(this);
		}
	}

	@Override
	public UserData toEscapedModel() {
		return (UserData)ProxyUtil.newProxyInstance(UserData.class.getClassLoader(),
			new Class[] { UserData.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		UserDataClp clone = new UserDataClp();

		clone.setUserDataId(getUserDataId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setCreationDate(getCreationDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setT_ShirtSize(getT_ShirtSize());
		clone.setDateOfBirth(getDateOfBirth());
		clone.setGlasses(getGlasses());
		clone.setCoffeesPerDay(getCoffeesPerDay());
		clone.setHeightCm(getHeightCm());

		return clone;
	}

	@Override
	public int compareTo(UserData userData) {
		int value = 0;

		if (getUserDataId() < userData.getUserDataId()) {
			value = -1;
		}
		else if (getUserDataId() > userData.getUserDataId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UserDataClp)) {
			return false;
		}

		UserDataClp userData = (UserDataClp)obj;

		long primaryKey = userData.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{userDataId=");
		sb.append(getUserDataId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", creationDate=");
		sb.append(getCreationDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", t_ShirtSize=");
		sb.append(getT_ShirtSize());
		sb.append(", dateOfBirth=");
		sb.append(getDateOfBirth());
		sb.append(", glasses=");
		sb.append(getGlasses());
		sb.append(", coffeesPerDay=");
		sb.append(getCoffeesPerDay());
		sb.append(", heightCm=");
		sb.append(getHeightCm());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.prodyna.model.UserData");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>userDataId</column-name><column-value><![CDATA[");
		sb.append(getUserDataId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>creationDate</column-name><column-value><![CDATA[");
		sb.append(getCreationDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>t_ShirtSize</column-name><column-value><![CDATA[");
		sb.append(getT_ShirtSize());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateOfBirth</column-name><column-value><![CDATA[");
		sb.append(getDateOfBirth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>glasses</column-name><column-value><![CDATA[");
		sb.append(getGlasses());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>coffeesPerDay</column-name><column-value><![CDATA[");
		sb.append(getCoffeesPerDay());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>heightCm</column-name><column-value><![CDATA[");
		sb.append(getHeightCm());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _userDataId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private Date _creationDate;
	private Date _modifiedDate;
	private String _t_ShirtSize;
	private Date _dateOfBirth;
	private boolean _glasses;
	private int _coffeesPerDay;
	private int _heightCm;
	private BaseModel<?> _userDataRemoteModel;
	private Class<?> _clpSerializerClass = com.prodyna.service.ClpSerializer.class;
}