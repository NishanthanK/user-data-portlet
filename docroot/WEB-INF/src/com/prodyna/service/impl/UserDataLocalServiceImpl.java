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

package com.prodyna.service.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import com.liferay.portal.kernel.exception.SystemException;
import com.prodyna.model.UserData;
import com.prodyna.service.base.UserDataLocalServiceBaseImpl;

/**
 * The implementation of the user data local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.prodyna.service.UserDataLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.prodyna.service.base.UserDataLocalServiceBaseImpl
 * @see com.prodyna.service.UserDataLocalServiceUtil
 */
public class UserDataLocalServiceImpl extends UserDataLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.prodyna.service.UserDataLocalServiceUtil} to access the user data local service.
	 */
	
	
	public UserData addUserData(UserData newUserData, long companyId , long userId) throws SystemException{
		Calendar c = Calendar.getInstance(Locale.GERMANY);
		Date now = c.getTime();
		

		
		UserData userData = userDataPersistence.create(counterLocalService.increment(UserData.class.getName()));
		userData.setCompanyId(companyId);
		userData.setUserId(userId);
		
		userData.setCreationDate(now);
		userData.setModifiedDate(now);
		
		userData.setT_ShirtSize(newUserData.getT_ShirtSize());
		userData.setDateOfBirth(newUserData.getDateOfBirth());
		userData.setGlasses(newUserData.getGlasses());
		userData.setCoffeesPerDay(newUserData.getCoffeesPerDay());
		userData.setHeightCm(newUserData.getHeightCm());
		userData = userDataPersistence.update(userData);
		return userData;
	}
	
	public UserData findByC_U(long companyId , long userId) throws SystemException {
		UserData userData = userDataPersistence.fetchByC_U(companyId, userId);
		return userData;
	}
	
}