package com.section1;

public class Cars_ConstructorThis {
	private String make;
	int speed;
	int gear;
	
	public Cars_ConstructorThis() {
		this(10, 2);
		this.speed = 0;
		this.gear = 0;
		System.out.println("Executing constructor without arguments");
	}
	
	public 	Cars_ConstructorThis(int speed, int gear) {
		this.speed = speed;
		this.gear = gear;
		System.out.println("Executing constructor with arguments");
	}
	
	// "this" refers to the instance of the class (object)
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getMake() {
		return make;
	}
}
