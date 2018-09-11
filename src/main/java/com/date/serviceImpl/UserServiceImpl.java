package com.date.serviceImpl;

import java.util.List;

import com.date.model.User;

public interface UserServiceImpl {
	
	public int insertUser(User u);
	
	public User getUser(String id);
	
	public int updateUser(User u);
	
	public List<User> queryUser(User u);
}
