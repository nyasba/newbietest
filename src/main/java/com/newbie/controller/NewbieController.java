package com.newbie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.newbie.service.NewbieService;

/**
 * 
 * @author k.soga
 *
 */
@RestController
public class NewbieController {

	/** NewbieService */
	@Autowired
	private NewbieService newbieService;
	
	/**
	 * Hello WorldÇñﬂÇ∑ÇæÇØÇÃÉÅÉ\ÉbÉh
	 * @return
	 */
	@RequestMapping(value="/message", method=RequestMethod.GET)
	public String getHelloMessage(){
		return "Hello World";
	}

	@GetMapping(value="/message1")
	public String getHelloMessage1(){
		return "Hello World";
	}
	
	@RequestMapping(value="/echo", method=RequestMethod.GET)
	public String getEchoMessage(@RequestParam(name="mes", required=true)String message){
		return message;
	}
	
	@RequestMapping(value="/echo1", method=RequestMethod.GET)
	public String getEchoMessage1(@RequestParam(value="mes", required=true)String message){
		String anwser = newbieService.getMessage(message);
		return anwser;
	}
	
}
