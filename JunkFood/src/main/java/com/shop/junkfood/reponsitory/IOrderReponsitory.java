package com.shop.junkfood.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.junkfood.entity.Order;

public interface IOrderReponsitory extends JpaRepository<Order, Long>{

}
