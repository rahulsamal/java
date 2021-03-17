package com.dao.ekart;

import java.util.ArrayList;
import java.util.Collection;
//import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
//import java.util.List;
import java.util.Map;


import com.model.ekart.Customer;
//import com.model.ekart.Product;
import com.model.ekart.Product;

public class CustomerDaoImpl implements ICustomerDao{

	private static Map<Integer,Customer> customers;
	//private static Map<Integer,Product> addProducts;
	
	public CustomerDaoImpl() {
		if(null==customers) {
			customers=new HashMap<>();
		}
	}
/*	
	@Override
	public void addProducts(Product product) { 
		addProducts.put(Customer.getCustomerId(),product);
	}
*/
	@Override
	public void selfRegister(Customer customer) {
		customers.put(customer.getCustomerId(),customer);
		
	}

	@Override
	public boolean viewNonExpiredProducts(Customer customer) {
		
		return false;
	}
	@Override
	public Customer viewCart(int customerId) {
		
		return customers.get(new Integer(customerId));
	}
	@Override
	public List<Customer> viewCustomer() {
		ArrayList<Customer> list = new ArrayList<>();

		Collection<Customer> customertList = customers.values();

		for (Customer c : customertList) {
			list.add(c);
		}
		return list;
	}

	
	
	

}
