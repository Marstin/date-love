package com.date.serviceImpl;

import com.date.model.User;

public interface UserServiceImpl {
	
	public int insert(User u);
	
	public User getUser(String id);
	
}
