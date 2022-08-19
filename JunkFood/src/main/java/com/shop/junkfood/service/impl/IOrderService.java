package com.shop.junkfood.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.shop.junkfood.entity.Order;
import com.shop.junkfood.reponsitory.IOrderReponsitory;
import com.shop.junkfood.service.OrderService;

@Service
public class IOrderService implements OrderService{
	
	private IOrderReponsitory iOrderReponsitory;

	public IOrderService(IOrderReponsitory iOrderReponsitory) {
		super();
		this.iOrderReponsitory = iOrderReponsitory;
	}

	@Override
	public Order add(Order order) {

		return iOrderReponsitory.save(order);
	}
	
	@Override
	public List<Order> findAll() {
		return iOrderReponsitory.findAll();
	}

	@Override
	public Page<Order> findAll(Pageable pageable) {
		return iOrderReponsitory.findAll(pageable);
	}

	@Override
	public List<Order> findAll(Sort sort) {
		return iOrderReponsitory.findAll(sort);
	}


	@Override
	public Optional<Order> findById(Long id) {
		return iOrderReponsitory.findById(id);
	}
	
	@Override
	public void deleteById(Long id) {
		iOrderReponsitory.deleteById(id);
	}

	@Override
	public void delete(Order entity) {
		iOrderReponsitory.delete(entity);
	}

	@Override
	public <S extends Order> List<S> findAll(Example<S> example) {
		return iOrderReponsitory.findAll(example);
	}

	@Override
	public <S extends Order> List<S> findAll(Example<S> example, Sort sort) {
		return iOrderReponsitory.findAll(example, sort);
	}
	
	
	
	

}
