package com.healogics.pretx.dao;

import com.healogics.pretx.domain.Auth;

public interface AuthDAO {

	/**
	 * Authenticate user by username and password
	 * 
	 * @param username
	 * @param password
	 * @return {@link Auth}
	 */
	public Auth getAuthByUsernamePassword(String username, String password);

	/**
	 * Save user credential detail
	 * 
	 * @param auth
	 */
	void save(Auth auth);

	Auth getAuthByUserName(String userName);

	void updatePassword(String userName, String password);

	void updatePinCode(String userName, String pinCode);

	Auth getAuthByHealLogicId(Long id);

	Auth getAuthByUsernamePinCode(String username, String pinCode);

	Auth validateUserName(String userName);

}
