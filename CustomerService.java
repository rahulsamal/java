package com.service.ekart;

import java.util.List;

import com.dao.ekart.CustomerDaoImpl;
import com.dao.ekart.ICustomerDao;
import com.model.ekart.Customer;
import com.model.ekart.Product;


public class CustomerService implements ICustomerService {
	private static ICustomerDao customerDao;
	
	public CustomerService() {
		if(null==customerDao) {
			customerDao=new CustomerDaoImpl();
		}
	}
	/*@Override
	public boolean addProducts(Product product) {
		
		customerDao.addProducts(product);
	
		Customer customer1=customerDao.viewCart(Customer.getCustomerId());
		
		if(customer1!=null)
			return true;
		else
			return false;
	}*/

	@Override
	public boolean selfRegister(Customer customer) {
		customerDao.selfRegister(customer);
		Customer cust=customerDao.viewCart(customer.getCustomerId());
		if(cust!=null) {
			return true;
		}
		else
			return false;
		
	}

	@Override
	public boolean viewNonExpiredProducts(Customer customer) {
		
		return false;
	}
	@Override
	public Customer viewCart(int customerId) {
		
		return customerDao.viewCart(customerId);
	}
	
	public List<Customer> viewCustomer() {
		
		return customerDao.viewCustomer();
	}

	
	

}
