package com.sg.leo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class restPractice {	
	@RequestMapping("/hello")
	public String hello()
	{
		return "/hello Response, from spring RestPractice 11월 14일";
	
	}
	
	@GetMapping("/get")
	public String get()
	{
		return "/get Response, from spring RestPractice 11월 14일";
	}
	
	@GetMapping("/getchk/{variable}")
	public String getchk(@PathVariable String variable)
	{
		return "/getchk Response, 11월 14일" + " variable=" + variable; 
	}
	
	@GetMapping("/getparam")
	public String getparam(String name, String email)
	{
		return "/getparam name = " + name + "," + "email=" + email;
	}
}
