package com.sanajon.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserQueryController {

	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		
		UserQueryForm form = (UserQueryForm) command;
		if ( form.getUsername().equals("admin") == true )
			return new ModelAndView(getSuccessView());
		else
			return new ModelAndView(getFormView());
	}

}
