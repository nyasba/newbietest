package com.newbie.service.impl;

import org.springframework.stereotype.Service;

import com.newbie.service.NewbieService2;

@Service
public class NewbieServiceImpl2 implements NewbieService2{

	@Override
	public String getNum(int num){

		String result = "";

		if(num % 15 == 0){
			result = "FizzBuzz";
		}else if(num % 5 == 0){
			result = "Buzz";
		}else if(num % 3 == 0){
			result = "Fizz";
		}else{
			result = String.valueOf(num);
		}

		return result;
	}

}
