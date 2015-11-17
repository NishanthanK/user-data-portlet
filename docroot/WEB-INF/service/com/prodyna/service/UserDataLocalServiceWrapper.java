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

package com.prodyna.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link UserDataLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see UserDataLocalService
 * @generated
 */
public class UserDataLocalServiceWrapper implements UserDataLocalService,
	ServiceWrapper<UserDataLocalService> {
	public UserDataLocalServiceWrapper(
		UserDataLocalService userDataLocalService) {
		_userDataLocalService = userDataLocalService;
	}

	/**
	* Adds the user data to the database. Also notifies the appropriate model listeners.
	*
	* @param userData the user data
	* @return the user data that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.prodyna.model.UserData addUserData(
		com.prodyna.model.UserData userData)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userDataLocalService.addUserData(userData);
	}

	/**
	* Creates a new user data with the primary key. Does not add the user data to the database.
	*
	* @param userDataId the primary key for the new user data
	* @return the new user data
	*/
	@Override
	public com.prodyna.model.UserData createUserData(long userDataId) {
		return _userDataLocalService.createUserData(userDataId);
	}

	/**
	* Deletes the user data with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param userDataId the primary key of the user data
	* @return the user data that was removed
	* @throws PortalException if a user data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.prodyna.model.UserData deleteUserData(long userDataId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userDataLocalService.deleteUserData(userDataId);
	}

	/**
	* Deletes the user data from the database. Also notifies the appropriate model listeners.
	*
	* @param userData the user data
	* @return the user data that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.prodyna.model.UserData deleteUserData(
		com.prodyna.model.UserData userData)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userDataLocalService.deleteUserData(userData);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _userDataLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userDataLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.prodyna.model.impl.UserDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _userDataLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.prodyna.model.impl.UserDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userDataLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userDataLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userDataLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.prodyna.model.UserData fetchUserData(long userDataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userDataLocalService.fetchUserData(userDataId);
	}

	/**
	* Returns the user data with the primary key.
	*
	* @param userDataId the primary key of the user data
	* @return the user data
	* @throws PortalException if a user data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.prodyna.model.UserData getUserData(long userDataId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userDataLocalService.getUserData(userDataId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userDataLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the user datas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.prodyna.model.impl.UserDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of user datas
	* @param end the upper bound of the range of user datas (not inclusive)
	* @return the range of user datas
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.prodyna.model.UserData> getUserDatas(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _userDataLocalService.getUserDatas(start, end);
	}

	/**
	* Returns the number of user datas.
	*
	* @return the number of user datas
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getUserDatasCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userDataLocalService.getUserDatasCount();
	}

	/**
	* Updates the user data in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param userData the user data
	* @return the user data that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.prodyna.model.UserData updateUserData(
		com.prodyna.model.UserData userData)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userDataLocalService.updateUserData(userData);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _userDataLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_userDataLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _userDataLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public com.prodyna.model.UserData addUserData(
		com.prodyna.model.UserData newUserData, long companyId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userDataLocalService.addUserData(newUserData, companyId, userId);
	}

	@Override
	public com.prodyna.model.UserData findByC_U(long companyId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userDataLocalService.findByC_U(companyId, userId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public UserDataLocalService getWrappedUserDataLocalService() {
		return _userDataLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedUserDataLocalService(
		UserDataLocalService userDataLocalService) {
		_userDataLocalService = userDataLocalService;
	}

	@Override
	public UserDataLocalService getWrappedService() {
		return _userDataLocalService;
	}

	@Override
	public void setWrappedService(UserDataLocalService userDataLocalService) {
		_userDataLocalService = userDataLocalService;
	}

	private UserDataLocalService _userDataLocalService;
}