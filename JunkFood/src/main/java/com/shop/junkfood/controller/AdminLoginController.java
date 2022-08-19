package com.shop.junkfood.controller;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shop.junkfood.entity.Customer;
import com.shop.junkfood.model.AdminLoginDto;
import com.shop.junkfood.service.CustomerService;

@Controller
@RequestMapping("/junkfood/login")
public class AdminLoginController {

	@Autowired
	private CustomerService customerService;

	@Autowired
	private HttpSession session;
	
	@Autowired
	private HttpServletRequest request;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String login(ModelMap modelMap) {
		modelMap.addAttribute("accounts", new AdminLoginDto());
		return "admin/accounts/login";
	}

	@PostMapping("")
	public String dangnhap
	(
			ModelMap modelMap
	) {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		Customer customer = customerService.login(email, password);		
		if(customer == null) {
			modelMap.addAttribute("message", "invalid username or password");
			return "redirect:/junkfood";
		}		
			
		session.setAttribute("user", customer);
		
		return "redirect:/junkfood/shopping";
	}
}
