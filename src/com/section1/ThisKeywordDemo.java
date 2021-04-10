package com.section1;

public class ThisKeywordDemo {

	public static void main(String[] args) {
		
		Cars_ConstructorThis c1 = new Cars_ConstructorThis();
		Cars_ConstructorThis c2 = new Cars_ConstructorThis();
		
		c1.setMake("BMW");
		System.out.println(c1.getMake());
		
		c2.setMake("Benz");
		System.out.println(c2.getMake());
	}
}