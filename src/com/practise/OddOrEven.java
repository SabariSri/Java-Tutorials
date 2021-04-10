package com.practise;

public class OddOrEven {

	public static void main(String[] args) {
		int num = 3;
		if (findType2(num))
			System.out.println("The number is even");
		else
			System.out.println("The number is odd");

	}

	public static boolean findType2(int n) {
		if (n % 2 == 0)
			return true;
		else
			return false;
	}

//	public static void main(String[] args) {
//		int limit = 10;
//		char evenArr;
//		int[] oddArr;
//		String limit2 = Integer.toString(limit);
//		int[] newLimit = new int[limit2.length()];
//		for(int i=0;i<limit2.length();i++) {
//			if(i%2 == 0)
//				evenArr = limit2.charAt(i);
//				System.out.println(newLimit + " - Even numbers");
//			else
//				System.out.println(y[i] + " - Odd number");
//		}
//		
//		public static findType(int n) {
//			
//		}
//	}
}
