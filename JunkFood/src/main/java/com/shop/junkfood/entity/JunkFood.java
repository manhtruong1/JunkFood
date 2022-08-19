package com.shop.junkfood.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="products")
public class JunkFood {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productid;
	
	@Column(name = "name",columnDefinition = "nvarchar(70)", nullable = false)
	private String name;
	
	@Column(name = "createdate", nullable = false)
	private Date createDate;
	
	@Column(name="quantity", nullable = false)
	private Integer quantity;
	
	@Column(name = "price", nullable = false)
	private BigDecimal price;
	
	@Column(name="description",columnDefinition = "nvarchar(70)", nullable = false)
	private String description;
	
	@Column(name="image", nullable = false)
	private String image;
	
	@Column(name = "nutrient" , nullable = false)
	@Enumerated(EnumType.STRING)
	private JunkFoodNutrient nutrient;
	
	@Column(name = "taste" , nullable = false)
	@Enumerated(EnumType.STRING)
	private JunkFoodTaste taste;
	
	@ManyToOne
	@JoinColumn(name = "categoryid")
	private Category category;
	
	@OneToMany(mappedBy = "product")
	private List<OrderDetail> orderDetails;
	
	
}