package com.practise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class DuplicateCharInString {
	public void findDuplicateChars(String str){
        
		LinkedHashMap<Character, Integer> dupMap = new LinkedHashMap<Character, Integer>(); 
        char[] chrs = str.toCharArray();
        for(Character ch:chrs){
            if(!dupMap.containsKey(ch)){
                dupMap.put(ch, 1);
            } else {
                dupMap.put(ch, dupMap.get(ch)+1);
            }
        }
        Set<Character> keys = dupMap.keySet();
        for(Character ch:keys){
        	if(dupMap.get(ch) > 1)
                System.out.println(ch+"--->"+dupMap.get(ch));
            
        }
        System.out.println(dupMap);
    }
     
	public void removeDuplicateChar(String input) {
		Set<Character> lhs = new LinkedHashSet<>();
		for(int i=0;i<input.length();i++)
			lhs.add(input.charAt(i));
		
		// print string after deleting duplicate elements - Set will not store duplicate chars.
		for(Character ch : lhs)
			System.out.print(ch);
		}
		
    public static void main(String a[]){
    	DuplicateCharInString dcs = new DuplicateCharInString();
        dcs.removeDuplicateChar("Sabariaarrr naathh" + "\n");
        dcs.findDuplicateChars("Sabariaarrr naathh");

    }
}
