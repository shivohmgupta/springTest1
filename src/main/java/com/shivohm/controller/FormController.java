package com.shivohm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.shivohm.model.User;
import com.shivohm.repository.*;

@Controller
public class FormController {

	@Autowired
	private UserRepository userRepository;

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String addUser(@ModelAttribute User user, @RequestParam("name") String name,
			@RequestParam("emailid") String emailid, @RequestParam("confirmemailid") String confirmemailid,
			@RequestParam("password") String password, @RequestParam("confirmpassword") String confirmpassword) {
		
		user.setName(name);
		user.setEmailid(confirmemailid);
		user.setConfirmemailid(confirmemailid);
		user.setPassword(confirmpassword);
		user.setConfirmpassword(confirmpassword);
		
		userRepository.save(user);
		return "redirect:home";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model) {
		/*
		 * model.addAttribute("customerList", customerRepository.findAll());
		 * return "home";
		 */

		return "login";
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(Model model) {
		/*
		 * model.addAttribute("customerList", customerRepository.findAll());
		 * return "home";
		 */

		return "register";
	}
	

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Model model) {
		
		 model.addAttribute("userList", userRepository.findAll());
		 return "home";
		 
	}

}