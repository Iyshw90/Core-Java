package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	//when dispatcherServlet encounters "/aboutUs" with the help of 
	@RequestMapping("/aboutUs")
	public String getAboutUs()
	{
		return "aboutUs";
	}

}
