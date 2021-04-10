package com.practise;

public class PrimeCheck {
	  public boolean isPrimeNumber(int number){
	         
	        for(int i=2; i<number; i++){
	            if(number % i == 0){
	                return false;
	            }
	        }
	        return true;
	    }
	     
	    public static void main(String a[]){
	    	PrimeCheck mpc = new PrimeCheck();
	        System.out.println("Is 2 prime number? "+mpc.isPrimeNumber(2));
	        System.out.println("Is 19 prime number? "+mpc.isPrimeNumber(19));
	        System.out.println("Is 15 prime number? "+mpc.isPrimeNumber(15));
	    }

}
