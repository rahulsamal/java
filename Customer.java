package com.model.ekart;



public class Customer {
	
	int customerId;
	String name;
	String email;
	int phone;
	String address;
	public Customer() {
		
	}
	public Customer(int customerId, String name, String email, int phone, String address) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void selfRegister(int customerId,String name,String email,int phone,String address) {
		
		this.customerId = customerId;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [CustomerId=" + getCustomerId() + ", Name=" + getName() + ", Email="
				+ getEmail() + ", Phone=" + getPhone() + ", Address=" + getAddress() + "]";
	}
	
	
}
