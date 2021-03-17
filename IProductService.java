package com.service.ekart;

import java.util.List;

import com.model.ekart.Customer;
import com.model.ekart.Product;

public interface IProductService {
	
	boolean add(Product product);

	boolean update(Product product);

	Product getProduct(int productId);
	
	List<Product> getAllProducts();
}
