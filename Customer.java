package com.sans.association;

public class Customer {
	private String name;
	private String email;
	private String address;
	private long mobileNo;
	 private Order order;
	 
	 public Customer(String name,String email,String address,long mobileNo,Order order) {
		 this.name=name;
		 this.email=email;
		 this.address=address;
		 this.mobileNo=mobileNo;
		 this.order=order;
		 
	 }
	 @Override
	 public String toString() {
		 return "Customer name :: [" +this.name+"]\nCustomer emailId :: ["+this.email+"]\nCoustomer address :: ["+this.address+"]\nCoustomer mobile number :: ["+this.mobileNo+"]\n"+order.toString();
	 }
}
