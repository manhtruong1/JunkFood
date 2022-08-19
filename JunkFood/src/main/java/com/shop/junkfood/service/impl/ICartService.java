package com.shop.junkfood.service.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import com.shop.junkfood.entity.CartItem;
import com.shop.junkfood.entity.JunkFood;
import com.shop.junkfood.service.CartService;
import com.shop.junkfood.service.JunkFoodService;

@Service
@SessionScope
public class ICartService implements CartService {

	@Autowired
	JunkFoodService junkFoodService;
	
	@Autowired
	HttpSession session;
	
	private Map<Long, CartItem> map = new HashMap<Long, CartItem>();

	@Override
	public void add(CartItem cartItem) {
		CartItem findById = map.get(cartItem.getProductid());
		JunkFood junkFood = junkFoodService.findbyId(cartItem.getProductid());
		
		if (findById != null) {
			if(findById.getQuantity() >= junkFood.getQuantity() ) {
				findById.setQuantity(junkFood.getQuantity());
				session.setAttribute("error", "Số lượng không đủ trong sản phẩm");
			}else {
				System.out.println("set quantity");
				findById.setQuantity(findById.getQuantity() + 1);
				session.setAttribute("message", "Thêm Mới Giỏ Hàng Thành Công");
				System.out.println("a");
			}
		} else {
			cartItem.setQuantity(1);
			map.put(cartItem.getProductid(), cartItem);
			System.out.println(cartItem.getQuantity());
		}
	}
	
	@Override
	public void add(CartItem cartItem,Integer quantity) {
		CartItem findById = map.get(cartItem.getProductid());
		if (findById != null) {
			System.out.println("set quantity");
			findById.setQuantity(findById.getQuantity() + 1);
		} else {
			cartItem.setQuantity(quantity);
			System.out.println("service add");
			map.put(cartItem.getProductid(), cartItem);
		}
	}	

	@Override
	public CartItem findByid(CartItem cartItem) {
		return map.get(cartItem.getProductid());
	}

	@Override
	public void remove(Long productid) {
		map.remove(productid);
	}

	@Override
	public void update(Long productid, int quantity) {
		CartItem item = map.get(productid);
		item.setQuantity(quantity);
	}
	
	@Override
	public CartItem get(Long IdCart) {
		
		return map.get(IdCart);
	}
	
	@Override
	public void clear() {
	     map.clear();
	}

	@Override
	public Collection<CartItem> getCartItem() {
		for (Map.Entry<Long, CartItem> entry : map.entrySet()) {
			CartItem val = entry.getValue();
			
			JunkFood findById = junkFoodService.findbyId(entry.getKey());
			val.setPrice(findById.getPrice());
			val.setName(findById.getName());
		
		}
		return map.values();
	}

	@Override
	public double getAmount() {
		double sum = 0;
		for (Map.Entry<Long, CartItem> entry : map.entrySet()) {
			CartItem val = entry.getValue();

			double price = Double.parseDouble(val.getPrice() + "");
			sum += price * val.getQuantity();
		}
		return sum;
	}
}
