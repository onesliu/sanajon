package com.sanajon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sanajon.domain.User;
import com.sanajon.service.UserManage;

@Controller
@RequestMapping(value="/user/user_edit.do")
public class UserEditController {

	@Autowired
	UserManage userManage;
	
	@RequestMapping
	@ModelAttribute
	public User getByName(String username, String passwd)
	{
		User user = new User();
		user.setName(username);
		user.setPassword(passwd);
		user.setDisabled(false);
		userManage.addUser(user);
		
		return user;
	}

}
