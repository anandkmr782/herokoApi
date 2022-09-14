package com.anand.herokoApi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping(method=RequestMethod.GET,path="/welcome")
	public String welcome()
	{
		return "WELCOME";
	}

}
