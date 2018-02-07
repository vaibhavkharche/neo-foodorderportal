package com.neo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	public String getForm(ModelMap model, Model m) {
		System.out.println("-----------in GET ------------");
		LoginForm f = new LoginForm();
		f.setCurretTokenNo("1");	//	TODO fetch from orderController
		f.setUserName("abc");
		m.addAttribute("loginForm", f);
		return "login";
	}
	
	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public String doLogin(@ModelAttribute LoginForm data) {
		//	TODO check credentials
		System.out.println("username: " + data.getUserName() + " passwd: " + data.getPassword());
		return "welcome";
	}
}
