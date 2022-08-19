package com.shop.junkfood.entity;

import java.util.Map;

public class Cart {	
	// key:msp   value:SL SP

	private Map<Long, CartItem> cartDetail;

	public Map<Long, CartItem> getCartDetail() {
		return cartDetail;
	}

	public void setCartDetail(Map<Long, CartItem> cartDetail) {
		this.cartDetail = cartDetail;
	}
	
}
