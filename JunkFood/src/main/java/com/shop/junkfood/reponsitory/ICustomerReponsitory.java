package com.shop.junkfood.reponsitory;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.shop.junkfood.entity.Customer;

public interface ICustomerReponsitory extends JpaRepository<Customer, Long>{

	Optional<Customer> findByEmail(String email);

}
