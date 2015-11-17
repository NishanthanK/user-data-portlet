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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class UserDataSoap implements Serializable {
	public static UserDataSoap toSoapModel(UserData model) {
		UserDataSoap soapModel = new UserDataSoap();

		soapModel.setUserDataId(model.getUserDataId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCreationDate(model.getCreationDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setT_ShirtSize(model.getT_ShirtSize());
		soapModel.setDateOfBirth(model.getDateOfBirth());
		soapModel.setGlasses(model.getGlasses());
		soapModel.setCoffeesPerDay(model.getCoffeesPerDay());
		soapModel.setHeightCm(model.getHeightCm());

		return soapModel;
	}

	public static UserDataSoap[] toSoapModels(UserData[] models) {
		UserDataSoap[] soapModels = new UserDataSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static UserDataSoap[][] toSoapModels(UserData[][] models) {
		UserDataSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new UserDataSoap[models.length][models[0].length];
		}
		else {
			soapModels = new UserDataSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static UserDataSoap[] toSoapModels(List<UserData> models) {
		List<UserDataSoap> soapModels = new ArrayList<UserDataSoap>(models.size());

		for (UserData model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new UserDataSoap[soapModels.size()]);
	}

	public UserDataSoap() {
	}

	public long getPrimaryKey() {
		return _userDataId;
	}

	public void setPrimaryKey(long pk) {
		setUserDataId(pk);
	}

	public long getUserDataId() {
		return _userDataId;
	}

	public void setUserDataId(long userDataId) {
		_userDataId = userDataId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public Date getCreationDate() {
		return _creationDate;
	}

	public void setCreationDate(Date creationDate) {
		_creationDate = creationDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getT_ShirtSize() {
		return _t_ShirtSize;
	}

	public void setT_ShirtSize(String t_ShirtSize) {
		_t_ShirtSize = t_ShirtSize;
	}

	public Date getDateOfBirth() {
		return _dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		_dateOfBirth = dateOfBirth;
	}

	public boolean getGlasses() {
		return _glasses;
	}

	public boolean isGlasses() {
		return _glasses;
	}

	public void setGlasses(boolean glasses) {
		_glasses = glasses;
	}

	public int getCoffeesPerDay() {
		return _coffeesPerDay;
	}

	public void setCoffeesPerDay(int coffeesPerDay) {
		_coffeesPerDay = coffeesPerDay;
	}

	public int getHeightCm() {
		return _heightCm;
	}

	public void setHeightCm(int heightCm) {
		_heightCm = heightCm;
	}

	private long _userDataId;
	private long _companyId;
	private long _userId;
	private Date _creationDate;
	private Date _modifiedDate;
	private String _t_ShirtSize;
	private Date _dateOfBirth;
	private boolean _glasses;
	private int _coffeesPerDay;
	private int _heightCm;
}