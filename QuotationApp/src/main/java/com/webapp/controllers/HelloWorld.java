package com.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/perform")
public class HelloWorld {
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView studentRegistration() {
		ModelAndView mav= new ModelAndView();
		mav.addObject("studentReg", "Student Registration");
		mav.setViewName("studentRegistration");
		return mav;
	}
}
