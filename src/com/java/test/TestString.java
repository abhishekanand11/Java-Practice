package com.java.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s = "Wwe promptly judged antique ivory buckles for the next prize ";
		//System.out.println(isAnagram(s) ? "pangram" : "not pangram");
		//System.out.println(permutation("ab"));
		
	    final SimpleDateFormat				dueDateDisplayFormat = new SimpleDateFormat("dd/MM/yy");
		Date date = new Date();
		System.out.println(date);
		String dueDateDisplay = dueDateDisplayFormat.format(date);
		System.out.println(dueDateDisplay);
		
		String str = "ab";
		System.out.println(str.toString());
		
	}
	
	public static String getReducedString(String inputString){
		 StringBuilder builderString = new StringBuilder();
	        char lastChar = '\0';
	        Map<Character, Integer> map = new HashMap<Character, Integer>();
	        int length = inputString.length();
	        for(int i = 0; i < length; i++){
	            String st = builderString.toString();
	            map.put(inputString.charAt(i), map.get(inputString.charAt(i)) == null ? 1 : map.get(inputString.charAt(i)) + 1);
	            if(!st.equals("") && st.charAt(st.length()-1) == inputString.charAt(i)){
	            	builderString.deleteCharAt(st.length()-1);
	            }
	            else if(inputString.charAt(i) != lastChar || map.get(inputString.charAt(i)) % 2 != 0){
	                builderString.append(inputString.charAt(i));
	            }
	            lastChar = inputString.charAt(i);
	        }
	       return builderString.toString();
	    }
	
	
	public static boolean isAnagram(String s){
        int diffCount = 0;
        Map<Character, Integer> m = new HashMap<Character, Integer>();
        
        for (int i = 0; i < s.length(); i++){
            char c = Character.toLowerCase(s.charAt(i));
            if(c != ' ' && m.get(c) == null){
                diffCount = diffCount + 1;
                m.put(c,1);
            }
        }
        return (diffCount == 26);
    }
	
	
	public static void permutation(String str) { 
	    permutation("", str); 
	}

	private static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) System.out.println(prefix);
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}
		
	}



