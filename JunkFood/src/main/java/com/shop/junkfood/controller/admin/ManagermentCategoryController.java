package com.shop.junkfood.controller.admin;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shop.junkfood.entity.Category;
import com.shop.junkfood.service.CategoryService;

@Controller
@RequestMapping("/junkfood/category")
public class ManagermentCategoryController {

	@Autowired
	CategoryService categoryService;

	@GetMapping()
	public String getAll(Model model) {
		model.addAttribute("category", new Category());

		List<Category> categories = categoryService.findAll();
		model.addAttribute("categories", categories);

		return "admin/categories/category";
	}

	@PostMapping("/create")
	public String createCategory(@ModelAttribute(name = "category") Category category) {
		categoryService.add(category);
		return "redirect:/junkfood/category";
	}

	@PostMapping("/update")
	public String updateCategory(@ModelAttribute(name = "category") Category category,
			@RequestParam(name = "categoryid") Long categoryid) {
		if (categoryid != null) {
			categoryService.update(category);
		}
		return "redirect:/junkfood/category";
	}

	@GetMapping("/delete/{categoryid}")
	public String deleteCategory(@PathVariable(name = "categoryid") Long categoryid) {	
		categoryService.delete(categoryid);
		return "redirect:/junkfood/category";
	}

}
