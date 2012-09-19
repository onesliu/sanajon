package com.sanajon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sanajon.service.UserManage;


@Controller
@RequestMapping("/user")
public class UserQueryController {

	@Autowired
	UserManage userManage;
	
	@Value("#{viewSettings['user.query.result']}")
	private String view;
	
	@RequestMapping("/name/{username}")
	public String getByName(@PathVariable String username, Model model)
	{
		model.addAttribute("user", userManage.getByName(username));
		return view;
	}

	@RequestMapping("/id/{userid}")
	public String getById(@PathVariable int userid, Model model)
	{
		model.addAttribute("user", userManage.getById(userid));
		return view;
	}
	
	@RequestMapping("/role/{roleid}")
	public String getByRoleId(@PathVariable int roleid, Model model)
	{
		model.addAttribute("users", userManage.getByRole(roleid));
		return view;
	}

	@RequestMapping("/group/{groupid}")
	public String getByGroupId(@PathVariable int groupid, Model model)
	{
		model.addAttribute("users", userManage.getByGroup(groupid));
		return view;
	}

	@RequestMapping("/privilege/{prid}")
	public String getByPrivilegeId(@PathVariable int prid, Model model)
	{
		model.addAttribute("users", userManage.getByPrivilege(prid));
		return view;
	}

	@RequestMapping("/all")
	public String getAllUser(Model model)
	{
		model.addAttribute("users", userManage.getAllUsers());
		return view;
	}
	
	@RequestMapping("/keyword/{word}")
	public String getByKeyword(@PathVariable String word, Model model)
	{
		model.addAttribute("users", userManage.getByKeyword(word));
		return view;
	}
}
