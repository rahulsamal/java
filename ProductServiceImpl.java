package com.service.ekart;

import java.util.List;

import com.dao.ekart.IProductDao;
import com.dao.ekart.ProductDaoImpl;
import com.model.ekart.Product;

public class ProductServiceImpl implements IProductService {

	private static IProductDao productDao;

	public ProductServiceImpl() {

		if (null == productDao)
			productDao = new ProductDaoImpl();

	}

	@Override
	public boolean add(Product product) {

		productDao.add(product);

		Product savedProduct = productDao.getProduct(product.getId());

		if (savedProduct != null)
			return true;
		else
			return false;

	}

	@Override
	public boolean update(Product product) {
		
		productDao.update(product);

		Product savedProduct = productDao.getProduct(product.getId());

		if (savedProduct != null)
			return true;
		else
			return false;
	}

	@Override
	public Product getProduct(int productId) {
		return productDao.getProduct(productId);
	}

	@Override
	public List<Product> getAllProducts() {
		return productDao.getAllProducts();
	}


}
