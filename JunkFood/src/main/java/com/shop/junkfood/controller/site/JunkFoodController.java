package com.shop.junkfood.controller.site;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shop.junkfood.entity.Category;
import com.shop.junkfood.entity.JunkFood;
import com.shop.junkfood.service.CategoryService;
import com.shop.junkfood.service.JunkFoodService;

@Controller
@RequestMapping("/junkfood/product-shop")
public class JunkFoodController {
	
	@Autowired
	JunkFoodService productService;
	
	@Autowired
	CategoryService categoryService;

	@GetMapping("")
	public String findAll(ModelMap modelMap, 
	@RequestParam(name = "category",required = false) Category category,
	Pageable pageable) {
		List<Category> lCategories = categoryService.findAll();
		modelMap.addAttribute("categories", lCategories);
				
		Page<JunkFood> products = productService.searchAndPage(category, pageable);
		modelMap.addAttribute("lProducts", products);
		
		
		return "site/products/product";
	}
}
