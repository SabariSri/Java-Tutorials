package com.section1;

public class PrimitiveDataTypes {
	
	// Gloabal variables are usable thru out the class
	int myGloabalInt;

	public static void main(String[] args) {
		byte myByte = 100;
		System.out.println("Byte value: " +myByte);
		int myInt = 10000;
		System.out.println("Int value: " +myInt);
		long myLong = 1000000;
		System.out.println("Long value: " +myLong);
		boolean myBoolean = true;
		System.out.println("Boolean value: " +myBoolean);
		float myFloat = 0.45f;
		System.out.println("Float value: " +myFloat); 
		double myDouble = 7.90;
		System.out.println("Double value: " +myDouble);

	}
	
	public void test () {
		myGloabalInt = 100;
		System.out.println("GlobalInt value: " +myGloabalInt);

	}
}
