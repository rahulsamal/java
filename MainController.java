package com.controller.ekart;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainController {

	public static void main(String[] args) {

		runApplication();

	}

	private static void runApplication() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		AdminController adminController = new AdminController();
CustomerController cc=new CustomerController();
		boolean action = true;

		while (action) {

			System.out.println("***Welcome to PKart*****");
			System.out.println("1.Admin \n 2.Customer \n 3.Exit");

			try {
				char ch = br.readLine().charAt(0);
				switch (ch) {
				case '1':
					adminController.operations();
					break;
				case '2':
					cc.operation();
				case '3':
					System.out.println("-----------EXIT------------");
					System.out.println("Exiting From The System \nThankyou.");
					action = false;
					break;
				default:
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}

	}
}

