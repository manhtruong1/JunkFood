package com.shop.junkfood.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.shop.junkfood.entity.Customer;

public interface CustomerService {

	<S extends Customer> List<S> findAll(Example<S> example, Sort sort);

	<S extends Customer> List<S> findAll(Example<S> example);

	Customer getById(Long id);

	void delete(Customer entity);

	void deleteById(Long id);

	Optional<Customer> findById(Long id);

	List<Customer> findAll(Sort sort);

	Page<Customer> findAll(Pageable pageable);

	List<Customer> findAll();

	<S extends Customer> S save(S entity);

	Optional<Customer> findByEmail(String email);

	Customer create(Customer customer);

	Customer login(String email, String password);

	
}
