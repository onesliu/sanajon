package com.sanajon.test;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.annotation.AnnotationMethodHandlerAdapter;

import com.sanajon.controller.UserQueryController;

@ContextConfiguration(locations={"classpath:app-config.xml", "classpath:mvc-config.xml"})
public class TestUserQueryController extends
		AbstractTransactionalJUnit4SpringContextTests {

	@Autowired
	private UserQueryController userQueryController;
	
	@Autowired
	private AnnotationMethodHandlerAdapter handlerAdapter;
	
	private final MockHttpServletRequest request = new MockHttpServletRequest();
	private final MockHttpServletResponse response = new MockHttpServletResponse();
    
	@Test
	public void testGetAllUser() throws Exception {
		request.setRequestURI("/user/user_query.do?get=all");
		request.setMethod(HttpMethod.GET.name());

		ModelAndView mav = handlerAdapter.handle(request, response, userQueryController);
		Assert.assertEquals("/usr/user_query.jsp", mav.getView());
	}
}
