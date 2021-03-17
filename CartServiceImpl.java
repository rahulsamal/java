package com.service.ekart;

import java.util.List;

import com.dao.ekart.CartDaoImpl;
import com.dao.ekart.ICartDao;
import com.model.ekart.Cart;

public class CartServiceImpl implements ICartService {
private static ICartDao cartDao;

public CartServiceImpl() {
	if(null==cartDao) {
		cartDao=new CartDaoImpl();
	}
}

	@Override
	public boolean viewProducts(Cart cart) {
		cartDao.viewProducts(cart);
		
		Cart savedCart=cartDao.viewCart(cart.getCustId());
		if(savedCart!=null)
			return true;
		return false;
	}

	@Override
	public Cart viewCart(int custId) {
		
		return cartDao.viewCart(custId);
	}

	@Override
	public List<Cart> viewProduct() {
		
		return cartDao.viewProduct();
	}

}
