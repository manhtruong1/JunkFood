package com.shop.junkfood.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.shop.junkfood.entity.OrderDetail;
import com.shop.junkfood.entity.JunkFood;
import com.shop.junkfood.reponsitory.IOrderDetailReponsitory;
import com.shop.junkfood.service.OrderDetailService;
import com.shop.junkfood.service.JunkFoodService;

@Service
public class IOrderDetailService implements OrderDetailService {

	@Autowired
	JunkFoodService iProductService;
	
	@Autowired
	IOrderDetailReponsitory iOrderDetailReponsitory;

	public IOrderDetailService(IOrderDetailReponsitory iOrderDetailReponsitory) {
		super();
		this.iOrderDetailReponsitory = iOrderDetailReponsitory;
	}

	@Override
	public OrderDetail create(OrderDetail orderDetail) {
		return iOrderDetailReponsitory.save(orderDetail);
	}

	@Override
	public Optional<OrderDetail> findById(Long id) {
		return iOrderDetailReponsitory.findById(id);
	}

	@Override
	public OrderDetail updateStatus() {
		
		OrderDetail orderDetail = new OrderDetail();
		Long id = orderDetail.getProduct().getProductid();

		if (id != null) {
			Optional<OrderDetail> optionalD = iOrderDetailReponsitory.findById(id);
			if (optionalD.isPresent()) {
				orderDetail.setStatus(true);
				return iOrderDetailReponsitory.save(orderDetail);
			}
		}
		return null;
		
		
	}

//	@Override
//	public OrderDetail create(OrderDetail orderDetail) {			
//		Order order = new Order();
//		double total = cartService.getAmount();
//
//		Customer customer = (Customer) session.getAttribute("user");
//		
//		if (customer != null) {
//			order.setCustomer(customer);
//
//			order.setOderdate(new Date());
//			order.setStatus(false);
//			order.setAmount(BigDecimal.valueOf(total));
//
//			System.out.println("thêm order");
//			orderService.add(order);
//			
//			Collection<CartItem> lCartItems = cartService.getCartItem();
//			for (CartItem cartItem : lCartItems) {
//				orderDetail.setOrder(order);
//				orderDetail.setProduct(productService.getById(cartItem.getProductid()));
//				orderDetail.setPrice(cartItem.getPrice());
//				orderDetail.setQuantity(cartItem.getQuantity());
//						
//				System.out.println("thêm order detail");
//				orderDetailService.create(orderDetail);
//			}
//			
//			session.setAttribute("message", "Thanh Toán Thành Công");
//		}else {
//			session.setAttribute("error", "Bạn Chưa Đăng Nhập");
//		}
//		
//		return iOrderDetailReponsitory.save(orderDetail);
//	}

	@Override
	public <S extends OrderDetail> S save(S entity) {
		return iOrderDetailReponsitory.save(entity);
	}

	@Override
	public List<OrderDetail> findAll() {
		return iOrderDetailReponsitory.findAll();
	}

	@Override
	public Page<OrderDetail> findAll(Pageable pageable) {
		return iOrderDetailReponsitory.findAll(pageable);
	}

	@Override
	public void deleteById(Long id) {
		iOrderDetailReponsitory.deleteById(id);
	}

	@Override
	public void delete(OrderDetail entity) {
		iOrderDetailReponsitory.delete(entity);
	};

}
