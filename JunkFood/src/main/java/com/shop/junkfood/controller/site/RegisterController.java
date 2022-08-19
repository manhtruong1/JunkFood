package com.shop.junkfood.controller.site;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shop.junkfood.entity.Customer;
import com.shop.junkfood.service.CustomerService;

@Controller
@RequestMapping("junkfood/register")
public class RegisterController {
	
	@Autowired
	CustomerService customerService;
	
	@GetMapping()
	public String getAll(ModelMap modelMap) {
		
		modelMap.addAttribute("customer", new Customer());
		
		return "site/user/register";
	}
	
	@PostMapping("/create")
	public String createCustomer(
			
			@ModelAttribute(name = "customer") Customer customer
			
			) {
		customerService.create(customer);	
		return "redirect:/junkfood/register";
	}
	
	

}
