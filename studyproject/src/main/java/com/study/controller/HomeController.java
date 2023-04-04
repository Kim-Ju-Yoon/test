package com.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.study.Service.LoginService;
import com.study.model.LoginVO;


@Controller
public class HomeController {
	@Autowired
	LoginService ls;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String MainPage() {
		
		return "MainPage";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage() {
		
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String MemberPage(LoginVO member) {
		ls.memreg(member);
		return "redirect:login";
	}
	
}
