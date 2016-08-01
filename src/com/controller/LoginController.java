package com.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dao.LoginDAO;
import com.modelandview.Contact;
import com.modelandview.Login;

@Controller
public class LoginController {

	@Autowired
	private LoginDAO loginDAO;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView newUser(ModelAndView model) {
		Login newUser = new Login();
		model.addObject("login", newUser);
		model.setViewName("login");
		return model;
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView saveContact(@ModelAttribute Login login) {
		loginDAO.addUser(login);		
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping(value="/show")
	public ModelAndView listUser(ModelAndView model) throws IOException{
		List<Login> listUser = loginDAO.list();
		model.addObject("listUser", listUser);
		model.setViewName("show");
		
		return model;
	}
}
