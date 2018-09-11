package com.date.dao;

import java.util.List;

import com.date.model.User;

public interface UserDao {
	
	public User selectUserById(String id);
	
	public int insertUser(User u);
	
	public int updateUser(User u);
	
	public List<User> queryUser(User u);
}
