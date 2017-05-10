package com.newbie.service.impl;

import org.springframework.stereotype.Service;

import com.newbie.service.NewbieService2;

@Service
public class NewbieServiceImpl2 implements NewbieService2 {

	@Override
	public String getMessage(int value) {

		String s = "";
		s += (value % 3 == 0) ? "Fizz" : "";
		s += (value % 5 == 0) ? "Buzz" : "";
		if( s.isEmpty()){
			return String.valueOf(value);
		}
		return s;
	}

}
