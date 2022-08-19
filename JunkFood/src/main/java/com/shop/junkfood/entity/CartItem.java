package com.shop.junkfood.entity;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartItem {
		
	private Long productid;
	private String name;
	private Integer quantity;
	private BigDecimal price;
	
}
