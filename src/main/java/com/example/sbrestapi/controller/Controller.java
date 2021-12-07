package com.example.sbrestapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/")
	public String hello()
	{
		return "Hello... Welcome to my REST API";
	}
	
	@GetMapping("/next")
	public String next()
	{
		return "Great... you are accessing my REST API on /next URL endpoint";
	}

}
