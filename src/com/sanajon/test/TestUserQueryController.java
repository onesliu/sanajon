package com.sanajon.test;

import static org.springframework.test.web.server.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.server.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.server.MockMvc;
import org.springframework.test.web.server.setup.MockMvcBuilders;

import com.sanajon.controller.UserQueryController;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:app-config.xml", "classpath:mvc-config.xml"})
public class TestUserQueryController {

	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.standaloneSetup(new UserQueryController()).build();
	}
	
	@Test
	public void testGetAllUser() throws Exception {
		mockMvc.perform(get("/user/user_query.do"))
				.andExpect(status().isOk());
	}
}
