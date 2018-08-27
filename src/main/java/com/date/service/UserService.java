package com.date.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.date.dao.UserDao;
import com.date.model.User;
import com.date.serviceImpl.UserServiceImpl;

@Service("userService")
public class UserService implements UserServiceImpl{
	
	private User u;

	@Autowired
	private UserDao userDao;
	
	public int insert(User u) {
		// TODO Auto-generated method stub
		System.out.println(u.toString());
		return 0;
	}
	
	public User getUser(String id) {
		return userDao.selectUserById(id);
	}
	
}
