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
public class NewbieServiceTest2 {

	@Autowired
	private NewbieService2 newbieService2;

	@Test
	public void _1のとき1を返す() {
		String actual = newbieService2.getNum(1);

		assertThat(actual, is("1"));
	}

	@Test
	public void _2のとき2を返す() {
		String actual = newbieService2.getNum(2);

		assertThat(actual, is("2"));
	}

	@Test
	public void _3のときFizzを返す() {
		String actual = newbieService2.getNum(3);

		assertThat(actual, is("Fizz"));
	}

	@Test
	public void _4のとき4を返す() {
		String actual = newbieService2.getNum(4);

		assertThat(actual, is("4"));
	}

	@Test
	public void _5のときBuzzを返す() {
		String actual = newbieService2.getNum(5);

		assertThat(actual, is("Buzz"));
	}

	@Test
	public void _6のときFizzを返す() {
		String actual = newbieService2.getNum(6);

		assertThat(actual, is("Fizz"));
	}

	@Test
	public void _7のとき7を返す() {
		String actual = newbieService2.getNum(7);

		assertThat(actual, is("7"));
	}

	@Test
	public void _8のとき8を返す() {
		String actual = newbieService2.getNum(8);

		assertThat(actual, is("8"));
	}

	@Test
	public void _9のときFizzを返す() {
		String actual = newbieService2.getNum(9);

		assertThat(actual, is("Fizz"));
	}

	@Test
	public void _10のときBuzzを返す() {
		String actual = newbieService2.getNum(10);

		assertThat(actual, is("Buzz"));
	}

	@Test
	public void _11のとき11を返す() {
		String actual = newbieService2.getNum(11);

		assertThat(actual, is("11"));
	}

	@Test
	public void _12のときFizzを返す() {
		String actual = newbieService2.getNum(12);

		assertThat(actual, is("Fizz"));
	}

	@Test
	public void _13のとき13を返す() {
		String actual = newbieService2.getNum(13);

		assertThat(actual, is("13"));
	}

	@Test
	public void _14のとき14を返す() {
		String actual = newbieService2.getNum(14);

		assertThat(actual, is("14"));
	}

	@Test
	public void _15のときFizzBuzzを返す() {
		String actual = newbieService2.getNum(15);

		assertThat(actual, is("FizzBuzz"));
	}

	@Test
	public void _16のとき16を返す() {
		String actual = newbieService2.getNum(16);

		assertThat(actual, is("16"));
	}

	@Test
	public void _17のとき17を返す() {
		String actual = newbieService2.getNum(17);

		assertThat(actual, is("17"));
	}

	@Test
	public void _18のときFizzを返す() {
		String actual = newbieService2.getNum(18);

		assertThat(actual, is("Fizz"));
	}

	@Test
	public void _19のとき19を返す() {
		String actual = newbieService2.getNum(19);

		assertThat(actual, is("19"));
	}

	@Test
	public void _20のときBuzzを返す() {
		String actual = newbieService2.getNum(20);

		assertThat(actual, is("Buzz"));
	}

	@Test
	public void _21のときFizzを返す() {
		String actual = newbieService2.getNum(21);

		assertThat(actual, is("Fizz"));
	}
}
