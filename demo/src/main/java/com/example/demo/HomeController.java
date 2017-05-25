package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String index()
	{
		return "hello world";
		
	}
	
	@RequestMapping("/a")
	public String indaex()
	{
		return "hello world Gyan";
		
	}

}
