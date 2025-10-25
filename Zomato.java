package com.sans.association;
import java.util.*;

public class Zomato {
	public static void main(String args[] ) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter product name :: ");
		String name=sc.next();
		System.out.print("Enter coustomer name :: ");
		String name1=sc.next();
		System.out.print("Enter email :: ");
		String email=sc.next();
		System.out.print("Enter address :: ");
		String address=sc.next();
		System.out.print("Enter mobile number :: ");
		long mobileNumber=sc.nextLong();
		
		
		Order order=new Order("101",name,2000);
		Customer c1=new Customer(name1,email,address,mobileNumber,order);
		System.out.println("\nCustomer and order details are as follows ::   \n"+c1.toString());
		
		
	}

}
