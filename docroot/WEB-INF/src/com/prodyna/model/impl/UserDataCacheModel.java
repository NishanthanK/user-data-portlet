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

package com.prodyna.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.prodyna.model.UserData;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing UserData in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see UserData
 * @generated
 */
public class UserDataCacheModel implements CacheModel<UserData>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{userDataId=");
		sb.append(userDataId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", creationDate=");
		sb.append(creationDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", t_ShirtSize=");
		sb.append(t_ShirtSize);
		sb.append(", dateOfBirth=");
		sb.append(dateOfBirth);
		sb.append(", glasses=");
		sb.append(glasses);
		sb.append(", coffeesPerDay=");
		sb.append(coffeesPerDay);
		sb.append(", heightCm=");
		sb.append(heightCm);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public UserData toEntityModel() {
		UserDataImpl userDataImpl = new UserDataImpl();

		userDataImpl.setUserDataId(userDataId);
		userDataImpl.setCompanyId(companyId);
		userDataImpl.setUserId(userId);

		if (creationDate == Long.MIN_VALUE) {
			userDataImpl.setCreationDate(null);
		}
		else {
			userDataImpl.setCreationDate(new Date(creationDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			userDataImpl.setModifiedDate(null);
		}
		else {
			userDataImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (t_ShirtSize == null) {
			userDataImpl.setT_ShirtSize(StringPool.BLANK);
		}
		else {
			userDataImpl.setT_ShirtSize(t_ShirtSize);
		}

		if (dateOfBirth == Long.MIN_VALUE) {
			userDataImpl.setDateOfBirth(null);
		}
		else {
			userDataImpl.setDateOfBirth(new Date(dateOfBirth));
		}

		userDataImpl.setGlasses(glasses);
		userDataImpl.setCoffeesPerDay(coffeesPerDay);
		userDataImpl.setHeightCm(heightCm);

		userDataImpl.resetOriginalValues();

		return userDataImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		userDataId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		creationDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		t_ShirtSize = objectInput.readUTF();
		dateOfBirth = objectInput.readLong();
		glasses = objectInput.readBoolean();
		coffeesPerDay = objectInput.readInt();
		heightCm = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(userDataId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(creationDate);
		objectOutput.writeLong(modifiedDate);

		if (t_ShirtSize == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(t_ShirtSize);
		}

		objectOutput.writeLong(dateOfBirth);
		objectOutput.writeBoolean(glasses);
		objectOutput.writeInt(coffeesPerDay);
		objectOutput.writeInt(heightCm);
	}

	public long userDataId;
	public long companyId;
	public long userId;
	public long creationDate;
	public long modifiedDate;
	public String t_ShirtSize;
	public long dateOfBirth;
	public boolean glasses;
	public int coffeesPerDay;
	public int heightCm;
}