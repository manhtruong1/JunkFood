package com.shop.junkfood.controller.site;

import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shop.junkfood.entity.CartItem;
import com.shop.junkfood.entity.Category;
import com.shop.junkfood.entity.JunkFoodNutrient;
import com.shop.junkfood.entity.JunkFoodTaste;
import com.shop.junkfood.entity.JunkFood;
import com.shop.junkfood.service.CartService;
import com.shop.junkfood.service.CategoryService;
import com.shop.junkfood.service.JunkFoodService;
import com.shop.junkfood.untils.Commonconst;

@Controller
@RequestMapping("/junkfood/shopping")
public class ShoppingController {

	@Autowired
	private JunkFoodService junkFoodService;

	@Autowired
	private CartService cartService;

	@Autowired
	CategoryService categoryService;

	@Autowired
	HttpSession session;

	@Autowired
	HttpServletRequest request;

	@GetMapping("")
	public String findAll
	(
			ModelMap modelMap, 
			@RequestParam(name = "category", required = false)
			Category category,
			Pageable pageable
	) 
	{
		List<Category> lCategories = categoryService.findAll();
		modelMap.addAttribute("categories", lCategories);

		Page<JunkFood> products = junkFoodService.searchAndPage(category, pageable);
		modelMap.addAttribute("lProducts", products);

		return "site/junkfoods/junkfood";
	}

	@GetMapping("cart")
	public String getShoppingCart(ModelMap modelMap) {
		Collection<CartItem> cartItems = cartService.getCartItem();
		modelMap.addAttribute("cartDetails", cartItems);
		modelMap.addAttribute("total", cartService.getAmount());

		return "site/featues/shopping-cart";
	}

	@GetMapping("/addcart/{productid}")
	public String addToCart(Model model,
			@PathVariable(name = "productid") Long productid) {
		try {
			JunkFood product = junkFoodService.findbyId(productid);

			
			if (product != null) {
				if (product.getQuantity() > 0) {
					CartItem item = new CartItem();
//					BeanUtils.copyProperties(product, item);
					item.setProductid(product.getProductid());
					item.setName(product.getName());
					item.setPrice(product.getPrice());
					item.setQuantity(1);

					cartService.add(item);
				} else {
					session.setAttribute("error", "Số lượng không đủ trong sản phẩm");
				}
			}
		} catch (Exception e) {
			session.setAttribute("error", "Thêm Mới Giỏ Hàng Thất Bại");
			System.out.println(e.getMessage());
		}
		return "redirect:/junkfood/shopping/cart";
	}

//	@GetMapping("/addcart/{productid}")
//	public String addToCart(Model model, @PathVariable(name = "productid") Long productid,
//			@RequestParam(name = "quantity", required = false) Integer quantity) {
//		try {
//			JunkFood product = junkFoodService.findbyId(productid);
//			CartItem item = new CartItem();
//
//			if (product != null) {
//				BeanUtils.copyProperties(product, item);
//				System.out.println("add");
//				cartService.add(item, quantity);
//				session.setAttribute("message", "Thêm Mới Giỏ Hàng Thành Công");
//
//			} else {
//				session.setAttribute("error", "Số lượng không đủ trong sản phẩm");
//			}
//		} catch (Exception e) {
//			session.setAttribute("error", "Thêm Mới Giỏ Hàng Thất Bại");
//			System.out.println(e.getMessage());
//		}
//		return "redirect:/junkfood/shopping/cart";
//	}

	@PostMapping("updatecart")
	public String updateProduct(
			@RequestParam(name = "productid") Long productid,
			@RequestParam(name = "quantity") int quantity) {
		JunkFood product = junkFoodService.getById(productid);
		try {
			if(product != null) {
				if (product.getQuantity() >= quantity) {
					cartService.update(productid, quantity);

					session.setAttribute("message", "Cập Nhật Giỏ Hàng Thành Công");
				} else {
					session.setAttribute("error", "Số lượng không đủ trong sản phẩm");
				}
			}
		} catch (Exception e) {
			return "redirect:/junkfood/shopping/cart";
		}
		return "redirect:/junkfood/shopping/cart";
	}

	@GetMapping("/removecart/{productid}")
	public String removeToCart(Model model, @PathVariable(name = "productid") Long productid) {
		try {
			cartService.remove(productid);
			session.setAttribute("message", "Xóa Giỏ Hàng Thành Công");
			return "redirect:/junkfood/shopping/cart";
		} catch (Exception e) {
			session.setAttribute("error", "Xóa Giỏ Hàng Thất Bại");
			return "redirect:/junkfood/shopping/cart=" + productid;
		}
	}

}
