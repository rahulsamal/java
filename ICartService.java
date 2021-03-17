package com.service.ekart;

import java.util.List;

import com.model.ekart.Cart;

public interface ICartService {

	boolean viewProducts(Cart cart);
	
	Cart viewCart(int custId);
	
	List<Cart> viewProduct();
}
