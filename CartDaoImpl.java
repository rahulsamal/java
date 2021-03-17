package com.dao.ekart;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.model.ekart.Cart;

public class CartDaoImpl implements ICartDao {
private static Map<Integer,Cart> carts;

public CartDaoImpl() {
	if(null==carts) {
		carts=new HashMap<>();
	}
}
	@Override
	public void viewProducts(Cart cart) {
		
		carts.put(cart.getCustId(), cart);
	}

	@Override
	public Cart viewCart(int custId) {
		
		return carts.get(new Integer(custId));
	}
	
	@Override
	public List<Cart> viewProduct() {
		List<Cart> list = new ArrayList<>();

		Collection<Cart> cartList = carts.values();

		for (Cart ca : cartList) {
			list.add(ca);
		}

		return list;
	}

	
}
