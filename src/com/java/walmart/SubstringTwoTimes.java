package com.java.walmart;
/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility  classes
import java.util.*;
import java.util.Map.Entry;

public class SubstringTwoTimes {
	

	    public static void main(String args[] ) throws Exception {
	        /*
	         * Read input from stdin and provide input before running
	         * Use either of these methods for input
			*/
	    	
	        try{
	            Scanner s = new Scanner(System.in);
	 	       int noOfTestCases = s.nextInt();


	 	       for(int i =0; i < noOfTestCases; i++){
	 	    	   String inputString = s.next();
	 	    	   
	 	    	   Map<Character, Integer> countMap = new HashMap<Character, Integer>();
	 	    	   int len = inputString.length();
	 	    	   for(int j=0; j < len; j++){
	 	    		   char c = inputString.charAt(j);
	 	    		   if(countMap.get(inputString.charAt(j)) != null){
	 	    			   countMap.put(c, countMap.get(inputString.charAt(j))+1);
	 	    		   }else{
	 	    			   countMap.put(c, 1);
	 	    		   }
	 	    	   }
	 	    	   
	 	    	   String output = "-1";
	 	    	   for(Entry<Character, Integer> entry : countMap.entrySet()){
	 	    		   if(entry.getValue().equals(2)){
	 	    			   output = String.valueOf(entry.getKey());
	 	    			   break;
	 	    		   }
	 	    	   }
	 	    	   System.out.println(output);
	 	    	   
	 	       }
	         
	     }catch(Exception e){
	         
	     }
	    }
}
