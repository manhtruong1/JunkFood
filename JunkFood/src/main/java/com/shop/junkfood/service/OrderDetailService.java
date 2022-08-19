package com.shop.junkfood.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.shop.junkfood.entity.OrderDetail;
import com.shop.junkfood.reponsitory.IOrderDetailReponsitory;

public interface OrderDetailService {

	void delete(OrderDetail entity);

	void deleteById(Long id);

	Page<OrderDetail> findAll(Pageable pageable);

	List<OrderDetail> findAll();

	<S extends OrderDetail> S save(S entity);

	OrderDetail updateStatus();

	Optional<OrderDetail> findById(Long id);

	OrderDetail create(OrderDetail orderDetail);


}
