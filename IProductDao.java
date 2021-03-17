package com.dao.ekart;

import java.util.List;

import com.model.ekart.Customer;
import com.model.ekart.Product;

public interface IProductDao {
	void add(Product product);

	void update(Product product);

	Product getProduct(int productId);

	List<Product> getAllProducts();
	
}
