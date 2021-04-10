package com.section1;

public class ReferenceDataType {

	public static void main(String[] args) {
		// String Literal - String Constant Pool
		String str1 = "Hello";
		
		@SuppressWarnings("unused")
		String str3 = "Hello";
		
		// String Object - Heap
		String str2 = new String("Welcome");
		
		@SuppressWarnings("unused")
		String str4 = new String("Welcome");
		
		// Strings
		
		str1 = "More Hello";
		
		@SuppressWarnings("unused")
		String stradd = str1 + str2;

	}

}
