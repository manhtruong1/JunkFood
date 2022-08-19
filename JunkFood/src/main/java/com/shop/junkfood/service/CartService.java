package com.shop.junkfood.service;

import java.util.Collection;

import com.shop.junkfood.entity.Cart;
import com.shop.junkfood.entity.CartItem;

public interface CartService {

	Collection<CartItem> getCartItem();

	void update(Long productid, int quantity);

	void remove(Long productid);

	void add(CartItem cartItem);

	double getAmount();

	CartItem findByid(CartItem cartItem);

	void clear();

	CartItem get(Long IdCart);

	void add(CartItem cartItem, Integer quantity);
	

}
