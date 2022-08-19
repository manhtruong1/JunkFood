package com.shop.junkfood.controller.site;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.junkfood.entity.CartItem;
import com.shop.junkfood.entity.Customer;
import com.shop.junkfood.entity.JunkFood;
import com.shop.junkfood.entity.Order;
import com.shop.junkfood.entity.OrderDetail;
import com.shop.junkfood.service.CartService;
import com.shop.junkfood.service.OrderDetailService;
import com.shop.junkfood.service.OrderService;
import com.shop.junkfood.service.JunkFoodService;

@Controller
@RequestMapping("/junkfood/pay")
public class PayController {

	@Autowired
	OrderService orderService;

	@Autowired
	CartService cartService;

	@Autowired
	JunkFoodService junkFoodService;

	@Autowired
	HttpSession session;

	@Autowired
	OrderDetailService orderDetailService;

	@PostMapping("create")
	public String pay() {
		try {
			Order order = new Order();
			double total = cartService.getAmount();

			Customer customer = (Customer) session.getAttribute("user");

			if (customer != null) {
				order.setCustomer(customer);
				order.setOderdate(new Date());
				order.setStatus(false);
				order.setAmount(BigDecimal.valueOf(total));

				System.out.println("thêm order");
				orderService.add(order);
				session.setAttribute("message", "Thanh Toán Thành Công");
			}

			Collection<CartItem> lCartItems = cartService.getCartItem();
			for (CartItem cartItem : lCartItems) {
				OrderDetail orderDetail = new OrderDetail();

				orderDetail.setOrder(order);
				orderDetail.setProduct(junkFoodService.getById(cartItem.getProductid()));
				orderDetail.setStatus(false);
				orderDetail.setPrice(cartItem.getPrice());
				orderDetail.setQuantity(cartItem.getQuantity());

				System.out.println("thêm order detail");
				orderDetailService.create(orderDetail);
				
				// trừ số lượng
				JunkFood junkFood = junkFoodService.getById(cartItem.getProductid());
				int qtyO = orderDetail.getQuantity();
				int qtyP = junkFood.getQuantity();
				
				int updateQuantity = qtyP - qtyO;
				
				junkFoodService.updateQuantity(junkFood.getProductid(), updateQuantity);
			}			
			
			cartService.clear();
		} catch (Exception e) {
			session.setAttribute("error", "Bạn Chưa Đăng Nhập");
			e.printStackTrace();
		}
		return "redirect:/junkfood/shopping/cart";
	}

}
