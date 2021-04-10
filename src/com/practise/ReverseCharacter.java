package com.practise;
import java.util.Scanner;

public class ReverseCharacter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a string:");
		String original = scan.nextLine(); 
		
		while (original.isEmpty() || original == null) {
			System.out.println("Null & Empty strings are not acceptes. Please enter the valid String: ");
			original = scan.nextLine();
			}
		scan.close();
		ReverseCharacter output = new ReverseCharacter();
		String reverseCharacters = output.reverseChars(original);
		System.out.print("Reversed numbers/String: " + reverseCharacters);	
		if(reverseCharacters.equals(original))
			System.out.print(" - Its a palindrome");
		else
			System.out.print(" - Its not a palindrome");
		}
	private String reverseChars(String originalString) {
		String reverse = "";
		for (int i = originalString.length()-1; i >= 0; i--) {
			reverse = reverse + originalString.charAt(i);
		}
		return reverse;
		
	}
	
//	   public static void main(String[] args) {
//		      String input = "tutorialspoint";
//		      char[] split = input.toCharArray();
//		      for (int i = split.length-1;i>=0;i--) 
//		    	  System.out.print(split[i]);
//		   }

}
