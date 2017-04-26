package com.integrella.refdata;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.integrella.refdata.repository.rest.RestDataRepository;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class IntegrellaRefDataApiApplicationTests {
	
	/*
	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private RestDataRepository dataRepository;

	
	@Before
	public void deleteAllBeforeTests() throws Exception {
		dataRepository.deleteAll();
	}
*/
	
	@Test
	public void contextLoads() {
	}

}
