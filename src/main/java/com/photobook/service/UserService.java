package com.photobook.service;

import java.util.List;

import com.photobook.dao.UserDao;
import com.photobook.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 *
 */
@Service
@Transactional
public class UserService 
{
	@Autowired
	private UserDao userDao;
	
	public List<User> findAll() {
		return userDao.findAll();
	}

	public User create(User user) {
		return userDao.create(user);
	}

	public User findUserById(Long id) {
		return userDao.findUserById(id);
	}

	public User login(String email) {
		return userDao.login(email);
	}

	public User update(User user) {
        return userDao.create(user);
	}

	public void deleteUser(Long id) {
        userDao.removeUser(id);
	}

}

