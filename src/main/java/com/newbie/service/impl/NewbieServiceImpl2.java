package com.newbie.service.impl;

import org.springframework.stereotype.Service;

import com.newbie.service.NewbieService2;

@Service
public class NewbieServiceImpl2 implements NewbieService2 {

	@Override
	public String getMessage(int value) {
		// TODO Auto-generated method stub
		if(value%15==0){
			return "FizzBuzz";
		}
		else if(value%5==0){
			return "Buzz";
		}
		else if(value%3==0){
			return "Fizz";
		}



		return String.valueOf(value);
	}


}
