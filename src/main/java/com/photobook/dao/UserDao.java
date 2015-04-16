/**
 * 
 */
package com.photobook.dao;

import com.photobook.model.User;

import java.util.List;


/**
 * @author katsi02
 *
 */
public interface UserDao {

	public List<User> findAll();
	
	public User create(User user);
	
	public User findUserById(Long id);

	public User login(String email);

    public void removeUser(Long userId);
	
}
