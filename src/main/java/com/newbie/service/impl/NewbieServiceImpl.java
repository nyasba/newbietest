package com.newbie.service.impl;

import org.springframework.stereotype.Service;

import com.newbie.service.NewbieService;

@Service
public class NewbieServiceImpl implements NewbieService {

	@Override
	public String getMessage(String message) {
		// TODO Auto-generated method stub
		return "bot : "+message;
	}

}
