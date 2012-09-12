package com.sanajon.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sanajon.domain.User;
import com.sanajon.service.UserManage;

@Controller
@RequestMapping(value="/user/user_edit.do")
public class UserEditController {

	@Autowired
	UserManage userManage;
	
	@SuppressWarnings("rawtypes")
	@RequestMapping
	public Map getByName(String username, String passwd, ModelMap model)
	{
		User user = new User();
		user.setName(username);
		user.setPassword(passwd);
		user.setDisabled(false);
		userManage.addUser(user);
		
		model.put("user", user);
		return model;
	}

}
