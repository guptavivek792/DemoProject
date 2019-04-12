package com.healogics.pretx.dao;

import java.util.List;

import com.healogics.pretx.domain.User;

public interface UserDAO {

	/**
	 * This method is using to create user
	 * 
	 * @param user is having user's input detail.
	 * @return user's primary key
	 */
	 Long save(User user);

	/**
	 * This method is using to get user by id
	 * 
	 * @param id is user's primary key
	 * @return will return user's object
	 */
	User getUserById(Long id);

	/**
	 * This method is using to get user by ids
	 * 
	 * @param id is user's primary key
	 * @return will return user's object list
	 */

	User getUserByHealLogicId(Long healLogicId);

	Long getIhealUserIdById(Long id);
	
	void updateUserRole(User user);

	List<User> getUsersByType(Short userType);

	Long getUserIdByHealLogicId(Long healLogicId);
}
