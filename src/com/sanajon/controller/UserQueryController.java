package com.sanajon.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sanajon.domain.User;
import com.sanajon.service.UserManage;


@Controller
@RequestMapping("/user_query.do")
public class UserQueryController {

	@Autowired
	UserManage userManage;
	
	@SuppressWarnings("rawtypes")
	public Map getByName(String username, ModelMap model)
	{
		User user = userManage.getByName(username);
		model.put("user", user);
		return model;
	}

	@SuppressWarnings("rawtypes")
	public Map getById(@RequestParam("userid") int id, ModelMap model)
	{
		User user = userManage.getById(id);
		model.put("user", user);
		return model;
	}
	
	@SuppressWarnings("rawtypes")
	@RequestMapping(method = RequestMethod.GET, params = "get=all")
	public Map getAllUser(ModelMap model)
	{
		List<User> users = userManage.getAllUsers();
		model.put("users", users);
		return model;
	}
}
