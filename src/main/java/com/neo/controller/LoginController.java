package com.neo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.neo.controller.forms.LoginForm;
import com.neo.service.OrderService;

@Controller("loginController")
public class LoginController {
	
//	@Autowired
//	OrderService orderService;

	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public String doLogin(ModelMap model) {
		
		LoginForm f = new LoginForm();
		f.setCurretTokenNo("1");	//	TODO fetch from orderController
		
		return "login";
	}
}
