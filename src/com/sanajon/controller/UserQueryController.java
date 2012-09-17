package com.sanajon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sanajon.domain.User;
import com.sanajon.service.UserManage;


@Controller
@RequestMapping("/user")
public class UserQueryController {

	@Autowired
	UserManage userManage;
	
	private final String viewjsp = "user/user_query";
	
	@RequestMapping("/name/{username}")
	public String getByName(@PathVariable String username, Model model)
	{
		model.addAttribute("user", userManage.getByName(username));
		return viewjsp;
	}

	@RequestMapping("/id/{userid}")
	public String getById(@PathVariable int userid, Model model)
	{
		model.addAttribute("user", userManage.getById(userid));
		return viewjsp;
	}
	
	@RequestMapping("/getall")
	public String getAllUser(Model model)
	{
		List<User> users = userManage.getAllUsers();
		model.addAttribute("users", users);
		return viewjsp;
	}
}
