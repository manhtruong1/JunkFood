package com.shop.junkfood.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.junkfood.entity.Category;

public interface ICategoryReponsitory extends JpaRepository<Category, Long> {

}
