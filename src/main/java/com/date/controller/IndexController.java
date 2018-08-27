package com.date.controller;

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
	
	@RequestMapping("/insertUser")
	@ResponseBody
	public String insertUser(HttpServletRequest request, HttpServletResponse response) {
		String userStr = request.getParameter("user");
		User u = new Gson().fromJson(userStr, User.class);
		int i = userService.insert(u);
		return new Gson().toJson(i);
		//return "ok";
	}
	
	@RequestMapping(value = "/getUser",produces = {"application/json;charset=UTF-8"})
	@ResponseBody
	public String getUser() {
		User u = userService.getUser("0");
		return new Gson().toJson(u);
	}
}
