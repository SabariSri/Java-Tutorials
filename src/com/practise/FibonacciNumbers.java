package com.practise;

public class FibonacciNumbers {

	public static void main(String[] args) {
		int input = 10;
		System.out.println("Fibonacci series upto " + input +" numbers : ");
		for(int i=0; i<=input; i++){ 
			System.out.print(findFibonacci(i) +" ");
			} 

	}

	public static int findFibonacci(int number) {
		if (number == 0)
			return 0;
		if (number == 1 || number == 2)
			return 1;
		int fibo1 = 1, fibo2 = 1, fibonacci = 1;
		for (int i = 3; i <= number; i++) {
			// Fibonacci number is sum of previous two Fibonacci number
			fibonacci = fibo1 + fibo2;
			fibo1 = fibo2;
			fibo2 = fibonacci;
		}
		return fibonacci; // Fibonacci number
	}
}
