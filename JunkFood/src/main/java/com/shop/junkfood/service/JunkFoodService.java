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
import com.shop.junkfood.entity.JunkFoodType;
import com.shop.junkfood.entity.JunkFood;

public interface JunkFoodService{

	<S extends JunkFood> List<S> findAll(Example<S> example, Sort sort);

	<S extends JunkFood> List<S> findAll(Example<S> example);

	JunkFood getReferenceById(Long id);

	JunkFood getById(Long id);

	void deleteAll();

	void deleteAll(Iterable<? extends JunkFood> entities);

	JunkFood getOne(Long id);

	void deleteAllInBatch();

	void deleteAllById(Iterable<? extends Long> ids);

	<S extends JunkFood, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

	void delete(JunkFood entity);

	void deleteAllByIdInBatch(Iterable<Long> ids);

	void deleteById(Long id);

	<S extends JunkFood> boolean exists(Example<S> example);

	long count();

	void deleteAllInBatch(Iterable<JunkFood> entities);

	<S extends JunkFood> long count(Example<S> example);

	void deleteInBatch(Iterable<JunkFood> entities);

	<S extends JunkFood> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends JunkFood> List<S> saveAllAndFlush(Iterable<S> entities);

	<S extends JunkFood> S saveAndFlush(S entity);

	boolean existsById(Long id);

	void flush();

	<S extends JunkFood> List<S> saveAll(Iterable<S> entities);

	Optional<JunkFood> findById(Long id);

	List<JunkFood> findAllById(Iterable<Long> ids);

	List<JunkFood> findAll(Sort sort);

	Page<JunkFood> findAll(Pageable pageable);

	List<JunkFood> findAll();

	<S extends JunkFood> Optional<S> findOne(Example<S> example);

	<S extends JunkFood> S save(S entity);

	List<JunkFood> findByNameLike(String name);

	Page<JunkFood> page(int pagePumber);

	JunkFood delete(Long id);

	JunkFood add(JunkFood product);

	JunkFood update(JunkFood product);

	Page<JunkFood> searchAndPage(Category category, Pageable pageable);

	Page<JunkFood> getByPage(int pageNumber, int maxRecord);

	JunkFood findbyId(Long productid);

	Page<JunkFood> searchName(String name, Pageable pageable);

	JunkFood updateQuantity(Long product,int quantity);

	
}
