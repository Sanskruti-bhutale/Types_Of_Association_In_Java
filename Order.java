package com.sans.association;

public class Order {
	private String orderId; 	
	private String itemName; 	
	private double price;
	
	public Order(String orderId, String itemName, double price) {
		this.orderId=orderId;
		this.itemName=itemName;
		this.price=price;
	}
	
	public String getOrderId() {
		return this.orderId;
	}
	public String getProductName() {
		return this.itemName;
	}
	public double getPrice() {
		return this.price;
	}
	@Override
	public String toString() {
		return "orderId :: ["+this.orderId+"]\nItem Name :: ["+this.itemName+"]\nprice :: ["+this.price+"]";
	}
}
