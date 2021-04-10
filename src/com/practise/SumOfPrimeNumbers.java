package com.practise;

public class SumOfPrimeNumbers {
	public static void main(String args[]) {

		int number = 2;
		int count = 0;
		long sum = 0;
		int limit = 10;
		while (count < limit) {
			if (isPrimeNumber(number)) {
				sum += number;
				count++;
			}
			number++;
		}
		System.out.println(sum);
	}

	private static boolean isPrimeNumber(int number) {

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
