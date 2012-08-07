package com.sanajon.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/user_query.do")
public class UserQueryController {

	@SuppressWarnings("rawtypes")
	@RequestMapping(method = RequestMethod.GET)
	public Map userQuery(String username, ModelMap model)
	{
		return model;
	}

}
