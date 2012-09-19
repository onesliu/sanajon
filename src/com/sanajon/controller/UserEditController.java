package com.sanajon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@Value("#{viewSettings['user.edit.result']}")
	private String view;

	@RequestMapping(method=RequestMethod.POST)
	public String addUser(@RequestParam String username, @RequestParam String passwd, Model model)
	{
		User user = new User();
		user.setName(username);
		user.setPassword(passwd);
		user.setDisabled(0);
		boolean ret = userManage.addUser(user);
		model.addAttribute("result", ret);
		
		return view;
	}

	@RequestMapping(value="/{userid}", method=RequestMethod.PUT)
	public String editUser(@PathVariable int userid,
			@RequestParam String username, @RequestParam String passwd, Model model)
	{
		return view;
	}
	
	@RequestMapping(value="/{userid}", method=RequestMethod.DELETE)
	public String delUser(@PathVariable int userid, Model model)
	{
		return view;
	}
}
