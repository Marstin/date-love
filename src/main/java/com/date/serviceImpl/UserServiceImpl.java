package com.date.serviceImpl;

import java.util.List;

import com.date.model.User;
import com.date.model.WXSession;

public interface UserServiceImpl {
	
	public int insertUser(User u);
	
	public User getUser(String id);
	
	public int updateUser(User u);
	
	public List<User> queryUser(User u);
	
	public WXSession getWXSession(String code);
}
