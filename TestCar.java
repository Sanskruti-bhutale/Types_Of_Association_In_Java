package com.sans.association;
import java.util.*;
public class TestCar {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the cars making :: ");
		String make=sc.next();
		System.out.print("Enter the model of the car :: ");
		String model=sc.next();
		System.out.print("Enter car's manufacturing year :: ");
		int year=sc.nextInt();
		Car c1=new Car(make,model,year);
		System.out.println(c1.toString());

	}

}
