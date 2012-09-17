package com.sanajon.test;

import static org.springframework.test.web.server.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.server.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.server.setup.MockMvcBuilders.xmlConfigSetup;
import static org.springframework.test.web.server.result.MockMvcResultMatchers.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.server.MockMvc;
import org.springframework.transaction.annotation.Transactional;

@ContextConfiguration(locations={"classpath:app-config.xml","classpath:mvc-config.xml"})
public class TestUserQueryController {

	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		mockMvc = xmlConfigSetup("classpath:app-config.xml","classpath:mvc-config.xml").build();
	}
	
	@Test
	@Transactional
	public void testGetAllUser() throws Exception {
		mockMvc.perform(get("/user/getall"))
				.andExpect(status().isOk())
				.andExpect(forwardedUrl("/WEB-INF/jsp/user/user_query.jsp"))
				.andExpect(model().attributeExists("users"));
	}
}
