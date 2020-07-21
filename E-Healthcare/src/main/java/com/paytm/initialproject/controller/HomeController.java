package com.paytm.initialproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.paytm.initialproject.service.UserDaoService;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	
	@RequestMapping("/doctors")
	public void Doctors()
	{
		System.out.println("Here's the list of all the doctors :-  ");
		UserDaoService.getAllDoctors();
	}
	
}
