package com.shop.junkfood.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.shop.junkfood.entity.Category;
import com.shop.junkfood.entity.JunkFood;
import com.shop.junkfood.reponsitory.IJunkFoodReponsitory;
import com.shop.junkfood.service.JunkFoodService;

import org.springframework.util.StringUtils;

@Service
public class IJunkFoodService implements JunkFoodService {
	
	IJunkFoodReponsitory iProductReponsitory;

	public IJunkFoodService(IJunkFoodReponsitory iProductReponsitory) {
		super();
		this.iProductReponsitory = iProductReponsitory;
	}

	@Override
	public JunkFood update(JunkFood product) {
		Long id = product.getProductid();
		if (id != null) {
			Optional<JunkFood> optionalP = iProductReponsitory.findById(id);
			JunkFood oldProduct = optionalP.get();
			if (optionalP.isPresent()) {
				product.setCreateDate(oldProduct.getCreateDate());
				return iProductReponsitory.save(product);
			}
		}

		return null;
	}

	@Override
	public JunkFood updateQuantity(Long productid, int quantity) {
			Optional<JunkFood> jOptional = iProductReponsitory.findById(productid);
			JunkFood junkFood = jOptional.get();
			if(jOptional.isPresent()) {
				junkFood.setQuantity(quantity);
				return iProductReponsitory.save(junkFood);
			}
			return null;
	}

	@Override
	public Page<JunkFood> getByPage(int pageNumber, int maxRecord) {
		Pageable pageable = PageRequest.of(pageNumber, maxRecord);
		Page<JunkFood> page = iProductReponsitory.findAll(pageable);
		return page;
	}

	@Override
	public JunkFood add(JunkFood product) {

		product.setCreateDate(new Date());
		product.setProductid(null);

		return iProductReponsitory.save(product);
	}

	@Override
	public JunkFood findbyId(Long productid) {
		Optional<JunkFood> optional = iProductReponsitory.findById(productid);
		if (optional.isPresent()) {// tồn tại giá trị được trả về
			return optional.get();
		}
		return null;
	}

	@Override
	public JunkFood delete(Long id) {
		Optional<JunkFood> product = iProductReponsitory.findById(id);

		if (product.isPresent()) {
			iProductReponsitory.deleteById(id);
			return product.get();
		}
		return null;

	}

	@Override
	public Page<JunkFood> page(int pagePumber) {
		Pageable pageable = PageRequest.of(pagePumber, 10);
		Page<JunkFood> pageProduct = iProductReponsitory.findAll(pageable);

		return pageProduct;
	}

	@Override
	public Page<JunkFood> searchName(String name, Pageable pageable) {
		Page<JunkFood> pageProduct;

		if (StringUtils.hasText(name)) {
			System.out.println("tim thấy");
			pageProduct = iProductReponsitory.findByNameLike("%" + name + "%", pageable);
		} else {
			System.out.println("findall");
			pageProduct = iProductReponsitory.findAll(pageable);
		}

		return pageProduct;
	}

	@Override
	public Page<JunkFood> searchAndPage(Category category, Pageable pageable) {
		Page<JunkFood> pageProduct;

		if (category == null) {
			System.out.println("findall");
			pageProduct = iProductReponsitory.findAll(pageable);
		} else {
			System.out.println("tim thấy");
			pageProduct = iProductReponsitory.findByCategoryLike(category, pageable);
		}

		return pageProduct;
	}

	@Override
	public List<JunkFood> findByNameLike(String name) {
		return iProductReponsitory.findByNameLike(name);
	}

	@Override
	public <S extends JunkFood> S save(S entity) {
		return iProductReponsitory.save(entity);
	}

	@Override
	public <S extends JunkFood> Optional<S> findOne(Example<S> example) {
		return iProductReponsitory.findOne(example);
	}

	@Override
	public List<JunkFood> findAll() {
		return iProductReponsitory.findAll();
	}

	@Override
	public Page<JunkFood> findAll(Pageable pageable) {
		return iProductReponsitory.findAll(pageable);
	}

	@Override
	public List<JunkFood> findAll(Sort sort) {
		return iProductReponsitory.findAll(sort);
	}

	@Override
	public List<JunkFood> findAllById(Iterable<Long> ids) {
		return iProductReponsitory.findAllById(ids);
	}

	@Override
	public Optional<JunkFood> findById(Long id) {
		return iProductReponsitory.findById(id);
	}

	@Override
	public <S extends JunkFood> List<S> saveAll(Iterable<S> entities) {
		return iProductReponsitory.saveAll(entities);
	}

	@Override
	public void flush() {
		iProductReponsitory.flush();
	}

	@Override
	public boolean existsById(Long id) {
		return iProductReponsitory.existsById(id);
	}

	@Override
	public <S extends JunkFood> S saveAndFlush(S entity) {
		return iProductReponsitory.saveAndFlush(entity);
	}

	@Override
	public <S extends JunkFood> List<S> saveAllAndFlush(Iterable<S> entities) {
		return iProductReponsitory.saveAllAndFlush(entities);
	}

	@Override
	public <S extends JunkFood> Page<S> findAll(Example<S> example, Pageable pageable) {
		return iProductReponsitory.findAll(example, pageable);
	}

	@Override
	public void deleteInBatch(Iterable<JunkFood> entities) {
		iProductReponsitory.deleteInBatch(entities);
	}

	@Override
	public <S extends JunkFood> long count(Example<S> example) {
		return iProductReponsitory.count(example);
	}

	@Override
	public void deleteAllInBatch(Iterable<JunkFood> entities) {
		iProductReponsitory.deleteAllInBatch(entities);
	}

	@Override
	public long count() {
		return iProductReponsitory.count();
	}

	@Override
	public <S extends JunkFood> boolean exists(Example<S> example) {
		return iProductReponsitory.exists(example);
	}

	@Override
	public void deleteById(Long id) {
		iProductReponsitory.deleteById(id);
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		iProductReponsitory.deleteAllByIdInBatch(ids);
	}

	@Override
	public void delete(JunkFood entity) {
		iProductReponsitory.delete(entity);
	}

	@Override
	public <S extends JunkFood, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		return iProductReponsitory.findBy(example, queryFunction);
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		iProductReponsitory.deleteAllById(ids);
	}

	@Override
	public void deleteAllInBatch() {
		iProductReponsitory.deleteAllInBatch();
	}

	@Override
	public JunkFood getOne(Long id) {
		return iProductReponsitory.getOne(id);
	}

	@Override
	public void deleteAll(Iterable<? extends JunkFood> entities) {
		iProductReponsitory.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		iProductReponsitory.deleteAll();
	}

	@Override
	public JunkFood getById(Long id) {
		return iProductReponsitory.getById(id);
	}

	@Override
	public JunkFood getReferenceById(Long id) {
		return iProductReponsitory.getReferenceById(id);
	}

	@Override
	public <S extends JunkFood> List<S> findAll(Example<S> example) {
		return iProductReponsitory.findAll(example);
	}

	@Override
	public <S extends JunkFood> List<S> findAll(Example<S> example, Sort sort) {
		return iProductReponsitory.findAll(example, sort);
	}

}
