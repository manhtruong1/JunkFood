package com.shop.junkfood.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.shop.junkfood.entity.Category;
import com.shop.junkfood.reponsitory.ICategoryReponsitory;
import com.shop.junkfood.service.CategoryService;

@Service
public class ICategoryService implements CategoryService{

	ICategoryReponsitory iCategoryReponsitory;

	public ICategoryService(ICategoryReponsitory iCategoryReponsitory) {
		super();
		this.iCategoryReponsitory = iCategoryReponsitory;
	}

	@Override
	public Category add(Category category) {
		category.setCategoryid(null);
		return iCategoryReponsitory.save(category);
	}
	
	@Override
	public Category update(Category category) {
		Long id = category.getCategoryid();
		if(id != null) {
			Optional<Category> optional = iCategoryReponsitory.findById(id);
			if(optional.isPresent()) {
				return iCategoryReponsitory.save(category);
			}
		}
		return null;
	}
	
	@Override
	public Category delete(Long id) {
		Optional<Category> optional = iCategoryReponsitory.findById(id);
		if(optional.isPresent()) {
			iCategoryReponsitory.deleteById(id);
			return optional.get();
		}
		return null;
	}	
	
	@Override
	public <S extends Category> S save(S entity) {
		return iCategoryReponsitory.save(entity);
	}

	@Override
	public <S extends Category> Optional<S> findOne(Example<S> example) {
		return iCategoryReponsitory.findOne(example);
	}

	@Override
	public List<Category> findAll() {
		return iCategoryReponsitory.findAll();
	}

	@Override
	public Page<Category> findAll(Pageable pageable) {
		return iCategoryReponsitory.findAll(pageable);
	}

	@Override
	public List<Category> findAll(Sort sort) {
		return iCategoryReponsitory.findAll(sort);
	}

	@Override
	public Optional<Category> findById(Long id) {
		return iCategoryReponsitory.findById(id);
	}

	@Override
	public <S extends Category> Page<S> findAll(Example<S> example, Pageable pageable) {
		return iCategoryReponsitory.findAll(example, pageable);
	}

	@Override
	public void deleteById(Long id) {
		iCategoryReponsitory.deleteById(id);
	}

	@Override
	public void delete(Category entity) {
		iCategoryReponsitory.delete(entity);
	}

	@Override
	public Category getReferenceById(Long id) {
		return iCategoryReponsitory.getReferenceById(id);
	}

	@Override
	public <S extends Category> List<S> findAll(Example<S> example) {
		return iCategoryReponsitory.findAll(example);
	}

	@Override
	public <S extends Category> List<S> findAll(Example<S> example, Sort sort) {
		return iCategoryReponsitory.findAll(example, sort);
	}
	
	
	
	
	
}
