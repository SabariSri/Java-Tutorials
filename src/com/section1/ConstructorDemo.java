package com.section1;

public class ConstructorDemo {

	public static void main(String[] args) {
		
		Cars_ConstructorThis c1 = new Cars_ConstructorThis();
		
		c1.setMake("BMW");
		System.out.println(c1.getMake());
		
		System.out.println(c1.speed);
		System.out.println(c1.gear);
		
		System.out.println("*********************");
		
		Cars_ConstructorThis c2 = new Cars_ConstructorThis(10, 1);
		System.out.println(c2.speed);
		System.out.println(c2.gear);
	}
}