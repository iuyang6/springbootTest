package com.example.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.entity.Login;
import com.example.test.service.ILoginService;

@RestController
@RequestMapping(value = "/login")
public class LoginController {
	
	@Autowired
	private ILoginService iLoginService;
	
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	private Login login(@RequestBody Login login) {
		return iLoginService.login(login.getUsername(), login.getPassword());
	}
}
