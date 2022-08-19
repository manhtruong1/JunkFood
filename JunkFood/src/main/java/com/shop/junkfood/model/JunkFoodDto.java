package com.shop.junkfood.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.shop.junkfood.entity.JunkFoodNutrient;
import com.shop.junkfood.entity.JunkFoodType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JunkFoodDto {
	
	private Long productid;
	private String name;
	private Date createDate;
	private Integer quantity;
	private BigDecimal price;
	private String description;
	private String image;
	private JunkFoodType type;
	private JunkFoodNutrient nutrient;


}
