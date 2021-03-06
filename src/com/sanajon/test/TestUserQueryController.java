package com.sanajon.test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasProperty;
import static org.springframework.test.web.server.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.server.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.server.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.server.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.server.setup.MockMvcBuilders.xmlConfigSetup;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.web.server.MockMvc;
import org.springframework.transaction.annotation.Transactional;

import com.sanajon.dao.UserDao;
import com.sanajon.domain.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:app-config.xml","classpath:mvc-config.xml"})
@TransactionConfiguration(defaultRollback=true)
@Transactional
public class TestUserQueryController {

	private MockMvc mockMvc;
	
	@Autowired
	private UserDao userDao;
	
	User user = new User();
	
	@Before
	public void setup() {
		mockMvc = xmlConfigSetup("classpath:app-config.xml","classpath:mvc-config.xml").build();
	}
	
	@Test
	public void testGetAllUser() throws Exception {
		mockMvc.perform(get("/user"))
				.andExpect(status().isOk())
				.andExpect(forwardedUrl("/WEB-INF/jsp/user/user_query.jsp"))
				.andExpect(model().attributeExists("users"));
	}
	
	@Test
	public void testGetbyName() throws Exception {
		user.setName("testuser");
		user.setPassword("testpwd");
		user.setDisabled(true);
		user.setGroupid(15);
		user.setRoleid(5);
		userDao.insertUser(user);
		mockMvc.perform(get("/user/name/testuser"))
			.andExpect(status().isOk())
			.andExpect(forwardedUrl("/WEB-INF/jsp/user/user_query.jsp"))
			.andExpect(model().attributeExists("user"))
			.andExpect(model().attribute("user", hasProperty("name", equalTo("testuser"))))
			.andExpect(model().attribute("user", hasProperty("password", equalTo("testpwd"))))
			.andExpect(model().attribute("user", hasProperty("diabled", equalTo(1))))
			.andExpect(model().attribute("user", hasProperty("groupid", equalTo(15))))
			.andExpect(model().attribute("user", hasProperty("roleid", equalTo(5))));
	}
}
