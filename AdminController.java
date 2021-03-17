package com.controller.ekart;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.model.ekart.Customer;
import com.model.ekart.Product;
import com.service.ekart.CustomerService;
import com.service.ekart.ICustomerService;
import com.service.ekart.IProductService;
import com.service.ekart.ProductServiceImpl;



public class AdminController {

	private static IProductService productService;
private static ICustomerService customerService;
	public AdminController() {

		if (null == productService) {
			productService = new ProductServiceImpl();
		}
		else if(null==customerService) {
			customerService=new CustomerService();
		}
	}
	
	public void operations() {
		

		Scanner scanner = new Scanner(System.in);
		boolean status = true;
		while (status) {
			System.out.println("------Admin Operations----");

			System.out.println("1. Add Product \n 2.Update Product \n 3.View Product \n 4.View All Products \n 5.Exit\n 6. view customer");
			System.out.println("Enter the choice:");
			int choice = scanner.nextInt();

			switch (choice) {

			case 1:
				System.out.println("enter product id, name,price: ");
				int id = scanner.nextInt();
				String name = scanner.next();
				double price = scanner.nextDouble();
				int qty=scanner.nextInt();
				String dateOfExpiry=scanner.next();
				String dateOfManufacture=scanner.next();

				Product p = new Product();
				p.setId(id);
				p.setName(name);
				p.setPrice(price);
				p.setQuantity(qty);
				p.setDateOfExpiry(dateOfExpiry);
				p.setDateOfManufacture(dateOfManufacture);
				
				if (productService.add(p)) {
					System.out.println("Product added successfully.");
				} else {
					System.out.println("Product not added.");
				}
				break;

			case 2:
				System.out.println("enter product id ");
				int id1 = scanner.nextInt();
			
				String name1 = scanner.next();
				double price1 = scanner.nextDouble();
				int qty1=scanner.nextInt();
				String dateOfExpiry1=scanner.next();
				String dateOfManufacture1=scanner.next();

				Product p1 = new Product();
				p1.setId(id1);
				p1.setName(name1);
				p1.setPrice(price1);
				p1.setQuantity(qty1);
				p1.setDateOfExpiry(dateOfExpiry1);
				p1.setDateOfManufacture(dateOfManufacture1);

				if (productService.update(p1)) {
					System.out.println("Product updated successfully.");
				} else {
					System.out.println("Product not updated.");
				}
				break;

			case 3:
				System.out.println("enter product id:");
				id = scanner.nextInt();
				Product product = productService.getProduct(id);
				System.out.println(product);
				break;
			case 4:
				List<Product> allProducts = productService.getAllProducts();

				for (Product prod : allProducts) {
					System.out.println(prod);
				}
				break;

			case 5:
				System.out.println("Exiting admin operations..!");
				status = false;
			
			case 6:
				//System.out.println("enter customer name to view");
				List<Customer> allCustomers=customerService.viewCustomer();
				for (Customer cust : allCustomers) {
					System.out.println(cust);
				}
				break;
			}

		}

	}

}

