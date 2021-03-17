package com.model.ekart;

public class Cart {
	
 int custId;
 String productName;
 float price;
 int qty;
 
 public Cart() {
	 
 }
public Cart(int custId, String productName, float price, int qty) {
	super();
	this.custId = custId;
	this.productName = productName;
	this.price = price;
	this.qty = qty;
}
public int getCustId() {
	return custId;
}
public void setCustId(int custId) {
	this.custId = custId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
@Override
public String toString() {
	return "Cart [CustId=" + getCustId() + ", ProductName=" + getProductName() + ", Price=" + getPrice()
			+ ", Qty=" + getQty() + "]";
}


}
