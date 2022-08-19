package com.shop.junkfood.reponsitory;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.junkfood.entity.Category;
import com.shop.junkfood.entity.JunkFood;

public interface IJunkFoodReponsitory extends JpaRepository<JunkFood, Long> {
	List<JunkFood> findByNameLike(String name);
	Page<JunkFood> findByCategoryLike(Category category ,Pageable pageable);
	Page<JunkFood> findByNameLike(String name ,Pageable pageable);
//	Page<Product> findByCategoryLike(String category ,Pageable pageable);
	
//	SELECT * FROM `products` p 
//	INNER JOIN `categories` c on p.categoryid = c.categoryid 
//	WHERE c.name LIKE	
}
