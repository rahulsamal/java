package com.dao.ekart;

import java.util.List;

import com.model.ekart.Cart;

public interface ICartDao {

	void viewProducts(Cart cart);
	
	Cart viewCart(int custId);
	
	List<Cart> viewProduct();
}
