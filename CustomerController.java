package com.controller.ekart;



import java.util.Scanner;

import com.model.ekart.Cart;
import com.model.ekart.Customer;
import com.service.ekart.CartServiceImpl;
import com.service.ekart.CustomerService;
import com.service.ekart.ICartService;
import com.service.ekart.ICustomerService;

public class CustomerController {
private static ICustomerService customerService;
private static ICartService cartService;

public CustomerController() {
	if(null==customerService) 
		customerService=new CustomerService();
	else if(null==cartService)
		cartService=new CartServiceImpl();
}

void operation() {
	
	Scanner sc= new Scanner(System.in);
	boolean statu=true;
	while(statu) {
	System.out.println("------Customer Operations------");
	System.out.println("choose the operation you want to perform");
	System.out.println("1. self-register \n 2. view non-expired products\n 3.Add products\n 4. view cart\n 5. exit");
	int choice=sc.nextInt();
	
	switch(choice) {
	
	case 1:
		System.out.println("Enter id,Name,email,phone-no,address ");
		int customerid=sc.nextInt();
		String name=sc.next();
		String email=sc.next();
		int phone=sc.nextInt();
		String address=sc.next();
		
		Customer c=new Customer();
		c.setCustomerId(customerid);
		c.setName(name);
		c.setEmail(email);
		c.setPhone(phone);
		c.setAddress(address);
		
		if(customerService.selfRegister(c)) {
			System.out.println("details saved successfully!");
		}
		else {
			System.out.println("details could not saved!");
		}
		break;
		
	case 2:
		//view product list		
				
				System.out.println("Cart [Serial number= 1 , ProductName=fan, Price=670 Qty=1]");
				System.out.println("Cart [Serial number= 2 , ProductName=table, Price=870 Qty=1]");
				System.out.println("Cart [Serial number= 3 , ProductName=toy, Price=270 Qty=1]");
				break;
		
	case 3:
		
		
		//add to cart
		System.out.println("enter serial number to add the product....");
		int pick=sc.nextInt();
		if(pick==1) {
			System.out.println("enter customer id");
			int custId=sc.nextInt();
			Cart cart=new Cart();
			cart.setCustId(custId);
			cart.setProductName("fan");
			cart.setPrice(670);
			cart.setQty(1);
			
			if(cartService.viewProducts(cart)) {
				System.out.println("product added successfully!");
			}
			else {
				System.out.println("Product could not added!");
			}
		}
		else if(pick==2) {
			System.out.println("enter customer id");
			int custId=sc.nextInt();
			Cart c1=new Cart();
			c1.setCustId(custId);
			c1.setProductName("table");
			c1.setPrice(870);
			c1.setQty(1);
			if(cartService.viewProducts(c1)) {
				System.out.println("product added successfully!");
			}
			else {
				System.out.println("product could not added!");
			}
		}
		else if(pick==3) {
			System.out.println("enter customer id");
			int custId=sc.nextInt();
			Cart c2=new Cart();
			c2.setCustId(custId);
			c2.setProductName("toy");
			c2.setPrice(270);
			c2.setQty(1);
			if(cartService.viewProducts(c2)) {
				System.out.println("product added successfully!");
			}
			else {
				System.out.println("product could not added!");
			}
		}
		else
			System.out.println("wrong choice...!");
		break;
		
		
		
	case 4:
		//view cart
		System.out.println("enter customer id");
		int customerId=sc.nextInt();
		Cart cartz=cartService.viewCart(customerId);
		System.out.println(cartz);
		break;
		
	case 5:
		System.out.println("exiting.....");
		statu=false;
		break;
	}
}}
}
