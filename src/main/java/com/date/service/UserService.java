package com.date.service;

import java.util.List;

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
	
	public int insertUser(User u) {
		// TODO Auto-generated method stub
		return userDao.insertUser(u);
	}
	
	public User getUser(String id) {
		return userDao.selectUserById(id);
	}
	
	public int updateUser(User u) {
		return userDao.updateUser(u);
	}
	
	public List<User> queryUser(User u){
		return userDao.queryUser(u);
	}
}
