package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("/home")
	@ResponseBody
	public String home()
	{
		return "This is example of another SpringBoot example... Be Coder";
	}
}

