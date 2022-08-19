package com.shop.junkfood.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.junkfood.entity.OrderDetail;

public interface IOrderDetailReponsitory extends JpaRepository<OrderDetail, Long> {

}
