package com.shop.junkfood.controller.admin;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shop.junkfood.entity.Category;
import com.shop.junkfood.entity.JunkFoodNutrient;
import com.shop.junkfood.entity.JunkFoodTaste;
import com.shop.junkfood.entity.JunkFood;
import com.shop.junkfood.service.CategoryService;
import com.shop.junkfood.service.JunkFoodService;


@Controller
@RequestMapping("/junkfood")
public class ManagermentJunkFoodController {
	@Autowired
	JunkFoodService junkFoodService;

	@Autowired
	CategoryService categoryService;

	@Autowired
	HttpServletRequest request;
	
	@Autowired
	HttpSession session;

		
	@GetMapping("")
	public String findAll(
			Model model, 
			@RequestParam(name = "pageNumber", defaultValue = "0") int pageNumber,
			@RequestParam(name = "category",required = false) Category category,
			@RequestParam(name = "name",required = false) String name,
			Pageable pageable
			) {
		model.addAttribute("product", new JunkFood());

		JunkFoodTaste[] junkFoodTastes = JunkFoodTaste.values();
		model.addAttribute("tastes", junkFoodTastes);

		JunkFoodNutrient[] junkFoodNutrient = JunkFoodNutrient.values();
		model.addAttribute("nutrients", junkFoodNutrient);
		
		List<Category> lCategories = categoryService.findAll();
		model.addAttribute("lCategory", lCategories);
		
		Page<JunkFood> pageProduct = null;
		Page<JunkFood> products = null;
		
		if(!StringUtils.hasText(name) && category == null) {
			pageProduct = junkFoodService.page(pageNumber);
			model.addAttribute("products", pageProduct);
		}else if(StringUtils.hasText(name) && category == null) {
			products = junkFoodService.searchName(name, pageable);
			model.addAttribute("products", products);
		}else {
			products = junkFoodService.searchAndPage(category, pageable);
			model.addAttribute("products", products);
		}

		return "admin/junkfoods/junkfood";
	}
	


	@PostMapping("/create")
	public String create(@ModelAttribute(name = "product") JunkFood product) {
		try {
			junkFoodService.add(product);
			session.setAttribute("message", "Thêm Mới Thành Công");
		} catch (Exception e) {
			session.setAttribute("error", "Thêm Mới Thất Bại");
			e.printStackTrace();
		}	
		
		return "redirect:/junkfood";
	}

	@GetMapping("/delete/{productid}")
	public String delete(@PathVariable(name = "productid") Long productid) {
		try {
			junkFoodService.delete(productid);
			session.setAttribute("message", "Xóa Thành Công");
		} catch (Exception e) {
			session.setAttribute("error", "Xóa Thất Bại");
			e.printStackTrace();
		}

		return "redirect:/junkfood";
	}

	@PostMapping("/update")
	public String update(@ModelAttribute(name = "product") JunkFood product,
			@RequestParam(name = "productid") Long productid) {
		try {
			if (productid != null) {
				junkFoodService.update(product);
			}		
			session.setAttribute("message", "Cập Nhập Thành Công");
			return "redirect:/junkfood";
		} catch (Exception e) {
			session.setAttribute("error", "Cập Nhập Thất Bại");
			return "redirect:/junkfood=" + productid;
		}
	
		
	}

//	@GetMapping("/search")
//	public String page(Model model,
//			@RequestParam(name = "category") Category category, 
//			Pageable pageable) {
//		model.addAttribute("product", new Product());
//
//		JunkFoodType[] junkFoodTypes = JunkFoodType.values();
//		model.addAttribute("categories", junkFoodTypes);
//		JunkFoodNutrient[] junkFoodNutrient = JunkFoodNutrient.values();
//		model.addAttribute("nutrients", junkFoodNutrient);
//
//		List<Category> lCategories = categoryService.findAll();
//		model.addAttribute("lCategory", lCategories);
//
//		Page<Product> products = junkFoodService.searchAndPage(category, pageable);
//		model.addAttribute("products", products);
//		
//		return "admin/products/product";
//	}

//	@GetMapping("/search")
//	public String page(Model model, 
	// @RequestParam(name = "type", required = false) JunkFoodType type,
//			Pageable pageable) {
//		model.addAttribute("product", new Product());
//
//		JunkFoodType[] junkFoodTypes = JunkFoodType.values();
//		model.addAttribute("categories", junkFoodTypes);
//		JunkFoodNutrient[] junkFoodNutrient = JunkFoodNutrient.values();
//		model.addAttribute("nutrients", junkFoodNutrient);
//		
//		Page<Product> products = junkFoodService.searchAndPage(type, pageable);
//		model.addAttribute("products", products);
//		
//		return "admin/products/product";
//	}
	
	/////////////////////////
//	@GetMapping("")
//	public String findAll(
//			Model model, 
//			@RequestParam(name = "pageNumber", defaultValue = "0") int pageNumber
//			) {
//		model.addAttribute("product", new JunkFood());
//
//		JunkFoodTaste[] junkFoodTastes = JunkFoodTaste.values();
//		model.addAttribute("tastes", junkFoodTastes);
//
//		JunkFoodNutrient[] junkFoodNutrient = JunkFoodNutrient.values();
//		model.addAttribute("nutrients", junkFoodNutrient);
//
//		List<Category> lCategories = categoryService.findAll();
//		model.addAttribute("lCategory", lCategories);
//
//		Page<JunkFood> pageProduct = junkFoodService.page(pageNumber);
//		model.addAttribute("products", pageProduct);
//		System.out.println("phân trang");
//
//		return "admin/junkfoods/junkfood";
//	}

//	
//	@GetMapping("/search")
//	public String serachName(Model model,
//			@RequestParam(name = "name") String name, 
//			Pageable pageable) {
//		model.addAttribute("product", new JunkFood());
//
//		JunkFoodTaste[] junkFoodTastes = JunkFoodTaste.values();
//		model.addAttribute("tastes", junkFoodTastes);
//
//		JunkFoodNutrient[] junkFoodNutrient = JunkFoodNutrient.values();
//		model.addAttribute("nutrients", junkFoodNutrient);
//
//		List<Category> lCategories = categoryService.findAll();
//		model.addAttribute("lCategory", lCategories);
//
//		Page<JunkFood> products = junkFoodService.searchName(name, pageable);
//		model.addAttribute("products", products);
//		
//		return "admin/junkfoods/junkfood";
//	}
//	
//	@GetMapping("/searchtype")
//	public String serachtype(Model model,
//			@RequestParam(name = "category",required = false) Category category, 
//			Pageable pageable) {
//		model.addAttribute("product", new JunkFood());
//
//		JunkFoodTaste[] junkFoodTastes = JunkFoodTaste.values();
//		model.addAttribute("tastes", junkFoodTastes);
//
//		JunkFoodNutrient[] junkFoodNutrient = JunkFoodNutrient.values();
//		model.addAttribute("nutrients", junkFoodNutrient);
//
//		List<Category> lCategories = categoryService.findAll();
//		model.addAttribute("lCategory", lCategories);
//
//		Page<JunkFood> products = junkFoodService.searchAndPage(category, pageable);
//		model.addAttribute("products", products);
//		
//		return "admin/junkfoods/junkfood";
//	}

}
