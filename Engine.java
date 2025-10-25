package com.sans.association;

public class Engine {
	private String model;
	private int engineCapacity;
	
	public Engine(String model,int engineCapacity) {
		this.model=model;
		this.engineCapacity=engineCapacity;
		if(engineCapacity<=0) {
			System.err.println("Error Invalid Input");
			System.exit(0);
		}
	}
		 public String getModel(){
			return this.model;
			
		}
		 public int getEngineCapacity() {
			 return this.engineCapacity;
		 }
		 
		 @Override 
		 public String toString() {
			 return "Engine Model: "+"["+model+"],"+ "Engine Capacity:  "+"["+engineCapacity+"]cc";
		 }
		
	}

