package com.shop.junkfood.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.shop.junkfood.entity.Order;

public interface OrderService {

	<S extends Order> List<S> findAll(Example<S> example, Sort sort);

	<S extends Order> List<S> findAll(Example<S> example);

	void delete(Order entity);

	void deleteById(Long id);

	Optional<Order> findById(Long id);

	List<Order> findAll(Sort sort);

	Page<Order> findAll(Pageable pageable);

	List<Order> findAll();

	Order add(Order order);

	

}
