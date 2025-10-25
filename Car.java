package com.sans.association;

import java.util.Scanner;

public class Car {
	private String make;
	private String model;
	private int year;
	private Engine engine;
	
	Scanner sc=new Scanner(System.in);
	
	public Car(String make, String model, int year) {
		System.out.print("Enter the model of the engine :: ");
		String name=sc.nextLine();
		System.out.print("Enter the engineCapacity of the car :: ");
		int capacity=sc.nextInt();
		engine=new Engine(name,capacity);
		this.make=make;
		this.model=model;
		this.year=year;
		if(year<=0) {
			System.err.println("Error Invalid Input");
			System.exit(0);
		}
	}
	public String toString() {
		return "Car Make: "+"["+make+"],"+" Model: ["+model+"], Year: ["+year+"], Engine Model: ["+engine.getModel()+"], Engine Capacity: ["+engine.getEngineCapacity()+"]cc";
	}

}
