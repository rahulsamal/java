package com.dao.ekart;

import java.util.List;

import com.model.ekart.Customer;
import com.model.ekart.Product;

public interface ICustomerDao {

	//void addProducts(Product product);
	
	void selfRegister(Customer customer);
	
	boolean viewNonExpiredProducts(Customer customer);
	
	Customer viewCart(int customerId);
	
	List<Customer> viewCustomer();

}
