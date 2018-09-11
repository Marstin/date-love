package com.date.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.date.model.User;
import com.date.serviceImpl.UserServiceImpl;
import com.google.gson.Gson;

@Controller
@RequestMapping("/index")
public class IndexController {
	
	@Autowired
	private UserServiceImpl userService;
	 
	@RequestMapping("/index")
	//@ResponseBody
	public String index() {
		return "demo";
	}
	
	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		return "123";
	}
	
	@RequestMapping(value = "/insertUser",produces = {"application/json;charset=UTF-8"})
	@ResponseBody
	public String insertUser(HttpServletRequest request, HttpServletResponse response) {
		String userStr = request.getParameter("user");
		User u = new Gson().fromJson(userStr, User.class);
		int id = userService.insertUser(u);
		return new Gson().toJson(true);
	}
	
	@RequestMapping(value = "/getUser",produces = {"application/json;charset=UTF-8"})
	@ResponseBody
	public String getUser(HttpServletRequest request, HttpServletResponse response) {
		String userId = request.getParameter("openid");
		User u = userService.getUser(userId);
		return new Gson().toJson(u);
	}
	
	@RequestMapping(value = "/updateUser",produces = {"application/json;charset=UTF-8"})
	@ResponseBody
	public String updateUser(HttpServletRequest request, HttpServletResponse response) {
		String userStr = request.getParameter("user");
		User u = new Gson().fromJson(userStr, User.class);
		userService.updateUser(u);
		return new Gson().toJson(true);
	}
	
	@RequestMapping(value = "/queryUser",produces = {"application/json;charset=UTF-8"})
	@ResponseBody
	public String queryUser(HttpServletRequest request, HttpServletResponse response) {
		String userStr = request.getParameter("user");
		User u = new Gson().fromJson(userStr, User.class);
		int pageNo = Integer.parseInt(request.getParameter("pageNo"));
		int pageSize = Integer.parseInt(request.getParameter("pageSize"));
		u.setLimitMin((pageNo - 1) * pageSize);
		u.setPageSize(pageSize);
		List<User> lstUser = userService.queryUser(u);
		return new Gson().toJson(lstUser);
	}
	
}
