package com.practise;

public class PrimeNumbers {
	public static void main(String args[]) {
		System.out.println("Enter the number till which prime number to be printed: ");
		// int limit = new Scanner(System.in).nextInt();
		int limit = 100;
		System.out.println("Printing prime number from 1 to " + limit);
		for (int number = 2; number <= limit; number++) {
			if (isPrime(number)) {
				System.out.print(number + " ");
			}
		}
	}

	public static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
