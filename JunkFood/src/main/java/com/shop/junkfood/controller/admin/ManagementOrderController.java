package com.shop.junkfood.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.junkfood.entity.Order;
import com.shop.junkfood.service.OrderService;

@Controller
@RequestMapping("/junkfood/order")
public class ManagementOrderController {

	@Autowired
	OrderService orderService;
	
	@GetMapping
	public String getAll(Model model) {
		
		List<Order> orders = orderService.findAll();
		model.addAttribute("lOrder", orders);
		
		return "admin/orders/order";
	}
	
}
