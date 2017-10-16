package com.java.test;

import java.util.Scanner;

public class Factorial {

	/* IMPORTANT: Multiple classes and nested static classes are supported */

	/*
	 * uncomment this if you want to read input.
	//imports for BufferedReader
	import java.io.BufferedReader;
	import java.io.InputStreamReader;

	//import for Scanner and other utility  classes
	import java.util.*;
	*/

	    public static void main(String args[] ) throws Exception {
	        /*
	         * Read input from stdin and provide input before running
	         * Use either of these methods for input

	        //BufferedReader
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String line = br.readLine();
	        int N = Integer.parseInt(line);
	        */
	        Scanner s = new Scanner(System.in);
	        int N = s.nextInt();

	        System.out.println(factorial(N));
	    }
	    
	    static long factorial(int n){
	        long fact = 1;
	        for(int i =1; i <= n; i++){
	            fact *= i;
	        }
	        return fact;
	    }


}
