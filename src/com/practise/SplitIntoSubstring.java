package com.practise;

public class SplitIntoSubstring {
	   public static void main(String args[]) {
		      String str = "jan-feb-march";
		      String[] temp;
		      String delimeter = "-";
		      temp = str.split(delimeter);
		      
//		      for(int i = temp.length-1; i >=0 ; i--) {
		      
		      for(int i = 0; i < temp.length; i++) {
		         System.out.print(temp[i] + " ");
//		         str = "jan.feb.march";
//		         delimeter = "\\.";
//		         temp = str.split(delimeter);
		      }
//		      for(int i =0; i < temp.length; i++) {
//		         System.out.println(temp[i]);
//		         System.out.println("");
//		         temp = str.split(delimeter,2);
//		         
//		         for(int j = 0; j < temp.length; j++){
//		            System.out.println(temp[j]);
//		         }
//		      }
	   }
}
