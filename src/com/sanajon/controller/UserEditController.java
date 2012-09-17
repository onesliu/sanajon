package com.sanajon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sanajon.domain.User;
import com.sanajon.service.UserManage;

@Controller
@RequestMapping("/user")
public class UserEditController {

	@Autowired
	UserManage userManage;
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String addUser(@RequestParam String username, @RequestParam String passwd, Model model)
	{
		User user = new User();
		user.setName(username);
		user.setPassword(passwd);
		user.setDisabled(false);
		boolean ret = userManage.addUser(user);
		model.addAttribute("result", ret);
		
		return "user/user_edit";
	}

}
