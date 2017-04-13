package com.ericho.fyp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ericho.fyp.dao.UserRepository;
@Controller    
@RequestMapping("/api")
public class ApiController {
	Logger log = LoggerFactory.getLogger(ApiController.class);
	@Autowired
	private UserRepository userRepository;
	
	
	//-----------------------------------------------------------------------------
	
	
	
	@RequestMapping("/register")
	
	public String registerUser(){
		
		return"";
	}
	
	@RequestMapping("/login")
	
	public String checkLogin(){
		
		return"";
	}
	
	@RequestMapping("/changePassword")
	
	public String changePassword(){
		
		return"";
	}
}
