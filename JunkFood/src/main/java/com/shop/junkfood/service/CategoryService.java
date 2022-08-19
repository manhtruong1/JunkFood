package com.shop.junkfood.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.shop.junkfood.entity.Category;

public interface CategoryService {

	<S extends Category> List<S> findAll(Example<S> example, Sort sort);

	<S extends Category> List<S> findAll(Example<S> example);

	Category getReferenceById(Long id);

	void delete(Category entity);

	void deleteById(Long id);

	<S extends Category> Page<S> findAll(Example<S> example, Pageable pageable);

	Optional<Category> findById(Long id);

	List<Category> findAll(Sort sort);

	Page<Category> findAll(Pageable pageable);

	List<Category> findAll();

	<S extends Category> Optional<S> findOne(Example<S> example);

	<S extends Category> S save(S entity);

	Category delete(Long id);

	Category update(Category category);

	Category add(Category category);


}
