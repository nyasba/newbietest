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
public class NewbieService2Test {

	@Autowired
	private NewbieService2 newbieService2;

	@Test
	public void _1のときは1を返す() {

		String actual = newbieService2.getMessage(1);

		assertThat(actual, is("1"));

	}

	@Test
	public void _2のときは2を返す() {

		String actual = newbieService2.getMessage(2);

		assertThat(actual, is("2"));

	}

	@Test
	public void _3のときはFizzを返す() {

		String actual = newbieService2.getMessage(3);

		assertThat(actual, is("Fizz"));

	}

	@Test
	public void _6のときはFizzを返す() {

		String actual = newbieService2.getMessage(6);

		assertThat(actual, is("Fizz"));

	}

	@Test
	public void _5のときはBuzzを返す() {

		String actual = newbieService2.getMessage(5);

		assertThat(actual, is("Buzz"));

	}

	@Test
	public void _15のときはFizzBuzzを返す() {

		String actual = newbieService2.getMessage(15);

		assertThat(actual, is("FizzBuzz"));

	}

}
