package com.newbie.service;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NewbieServiceTest {

	@Autowired
	private NewbieService newbieService;

	@Test
	public void getMessageTest() {

		String actual = newbieService.getMessage("test");

		assertThat(actual, is("bot : test"));

	}

}
