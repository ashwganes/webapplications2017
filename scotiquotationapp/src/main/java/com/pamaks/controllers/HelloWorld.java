package com.pamaks.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloWorld {
	@RequestMapping(value="/perform/test")
	public String testSpring() {
		System.out.println("Testing spring");
		return "";
	}
	
}
