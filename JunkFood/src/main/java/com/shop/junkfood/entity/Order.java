package com.shop.junkfood.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "oders")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderid;
	
	@Temporal(TemporalType.DATE)
	private Date oderdate;
	
	@Column(name = "amount",nullable = false)
	private BigDecimal amount;
	
	@Column(name = "status", nullable = false)
	private Boolean status;
	
	@OneToMany(mappedBy = "order",cascade = CascadeType.ALL)
	private List<OrderDetail> orderDetails;
	
	@ManyToOne
	@JoinColumn(name = "customerid")
	private Customer customer;
	
}
