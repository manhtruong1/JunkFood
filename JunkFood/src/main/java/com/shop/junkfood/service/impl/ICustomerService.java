package com.shop.junkfood.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.shop.junkfood.entity.Customer;
import com.shop.junkfood.reponsitory.ICustomerReponsitory;
import com.shop.junkfood.service.CustomerService;

@Service
public class ICustomerService implements CustomerService{

	private ICustomerReponsitory iCustomerReponsitory;
	
	
	public ICustomerService(ICustomerReponsitory iCustomerReponsitory) {
		super();
		this.iCustomerReponsitory = iCustomerReponsitory;
	}


	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	

	@Override
	public Customer login(String email, String password) {
		Optional<Customer> optExist = iCustomerReponsitory.findByEmail(email);
		if
		(
				optExist != null &&
				bCryptPasswordEncoder.matches(password, optExist.get().getPassword()));
		{
			return optExist.get();
		}
	}
	

	@Override
	public Customer create(Customer customer) {	
		if(customer.getCustomerid() == null) {		
			
			customer.setPassword(bCryptPasswordEncoder.encode(customer.getPassword()));
			customer.setStatus(true);
			customer.setRegisterdate(new Date());
			
			iCustomerReponsitory.save(customer);
		}		
		return customer;
	}


	@Override
	public Optional<Customer> findByEmail(String email) {
		return iCustomerReponsitory.findByEmail(email);
	}


	@Override
	public <S extends Customer> S save(S entity) {
		return iCustomerReponsitory.save(entity);
	}


	@Override
	public List<Customer> findAll() {
		return iCustomerReponsitory.findAll();
	}


	@Override
	public Page<Customer> findAll(Pageable pageable) {
		return iCustomerReponsitory.findAll(pageable);
	}


	@Override
	public List<Customer> findAll(Sort sort) {
		return iCustomerReponsitory.findAll(sort);
	}


	@Override
	public Optional<Customer> findById(Long id) {
		return iCustomerReponsitory.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		iCustomerReponsitory.deleteById(id);
	}

	@Override
	public void delete(Customer entity) {
		iCustomerReponsitory.delete(entity);
	}

	@Override
	public Customer getById(Long id) {
		return iCustomerReponsitory.getById(id);
	}

	@Override
	public <S extends Customer> List<S> findAll(Example<S> example) {
		return iCustomerReponsitory.findAll(example);
	}

	@Override
	public <S extends Customer> List<S> findAll(Example<S> example, Sort sort) {
		return iCustomerReponsitory.findAll(example, sort);
	}
	
	

		
}
