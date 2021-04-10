package com.practise;

public class ReverseString {

	public static void main(String[] args) {
		String input = "you   are a buffalow"; //""; 
		String output = reverse(input);
		System.out.println(output);
	}

	private static String reverse(String input) {
		String reverse = "";
		if (input.isEmpty() || input == null) {
			System.out.println("Empty & null strings are not accepted");
		} else if (input.length() <= 1){
			reverse = input; 
		}else {
			String[] originalArray = input.split(" "); // "+" -> its a regex (regular expression) removes the extra space from the input string
			for (String item : originalArray) { // this, is, a, test, string
				reverse = item + " " + reverse; // this + "", is + this, a + is this, test + a is this, string + test a is this
			}
		}
		return reverse.trim();
	}

}
