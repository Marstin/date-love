package com.date.dao;

import com.date.model.User;

public interface UserDao {
	
	public User selectUserById(String id);
	
	public int insertUser(User u);

}
