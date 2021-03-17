package com.dao.ekart;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.model.ekart.Customer;
//import com.model.ekart.Customer;
import com.model.ekart.Product;

public class ProductDaoImpl implements IProductDao {

	private static Map<Integer, Product> products;

	public ProductDaoImpl() {

		if (null == products) {
			products = new HashMap<>();
		}

	}

	@Override
	public void add(Product product) {

		products.put(product.getId(), product);

	}

	@Override
	public void update(Product product) {
products.put(product.getId(),product);
	}

	@Override
	public Product getProduct(int productId) {

		return products.get(new Integer(productId));
	}

	@Override
	public List<Product> getAllProducts() {
		List<Product> list = new ArrayList<>();

		Collection<Product> productList = products.values();

		for (Product p : productList) {
			list.add(p);
		}

		return list;

	}

	
	}

