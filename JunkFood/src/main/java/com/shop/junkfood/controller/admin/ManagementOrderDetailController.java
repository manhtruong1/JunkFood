package com.shop.junkfood.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.junkfood.entity.OrderDetail;
import com.shop.junkfood.service.OrderDetailService;

@Controller
@RequestMapping("/junkfood/orderdetail")
public class ManagementOrderDetailController {
	
	@Autowired
	OrderDetailService orderDetailService;

	@GetMapping()
	public String getAll(Model model) {
		
		List<OrderDetail> lDetails = orderDetailService.findAll();
		model.addAttribute("lOrderDetail", lDetails);
		
		return "admin/orderdetails/order-detail";
	}
	
	@PostMapping("/comfirm")
	public String confirm() {
		orderDetailService.updateStatus();
		return "redirect:/junkfood/orderdetail";
	}
	
}
