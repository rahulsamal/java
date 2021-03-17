package com.service.ekart;

import java.util.List;

import com.model.ekart.Customer;
import com.model.ekart.Product;

public interface ICustomerService {

	//boolean addProducts(Product product);
	
	boolean selfRegister(Customer customer);
	
	boolean viewNonExpiredProducts(Customer customer);
	
	Customer viewCart(int customerId);

	List<Customer> viewCustomer();
}
