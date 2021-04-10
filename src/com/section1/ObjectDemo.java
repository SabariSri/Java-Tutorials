package com.section1;

public class ObjectDemo {
	
	String str2 = "Hi There !!!";
	
	/***
	 * [][][][CarClass - c1][CarClass - c2][][][][][]
	 * @param args
	 */

	public static void main(String[] args) {
		String str1 = "Hello Java";
		
		System.out.println(str1);
		
//		for (int i=0; i < args.length; i++) {
//			System.out.println(args[i]);
//			
//		}
		
		System.out.println("*************************************");
		
		CarClass c1 = new CarClass();
		@SuppressWarnings("unused")
		CarClass c2 = new CarClass();
		
//		c1.model = "BMW";
//		c1.year = 2015;
		
		System.out.println(c1.year);
		System.out.println(c1.getYear());
	}
}

class CarClass {
	
	int year = 2000;
	String model;
	
	public int getYear() {
		return this.year;
	}
	
}