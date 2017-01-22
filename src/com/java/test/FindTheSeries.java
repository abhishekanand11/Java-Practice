package com.java.test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class FindTheSeries {
	static int [] i = new int[10];
	static String name;
	
		// The series is 2,2,4,8,16.512.....
		public static void main (String[] args) {
			//code
			FindTheSeries s = new FindTheSeries();
			System.out.println(FindTheSeries.i + FindTheSeries.name);
			int a[] = {1,2,3};
			int i[] = {1,2,3};
			 a[1] = i[1] = 10;
			 System.out.println(a[1] +","+ i[1]);
			/**
			Scanner sc=new Scanner(System.in);  
			int n = sc.nextInt();
			for(int i = 1; i <= n; i++){
			    Long output;
			    BigInteger out=BigInteger.valueOf(0);
			    int input = sc.nextInt();
			    
			    if(input%2 == 0){
			    	out = BigInteger.valueOf(2).pow((int)Math.pow(3, (input/2 - 1)));
			        //output = (Long)Math.pow(2,(Long)Math.pow(3,n/2-1));
			    }
			    else{
			    	//output = (BigDecimal) Math.pow(2, (BigDecimal) Math.pow(2, (input/2)));
			    	out = BigInteger.valueOf(2).pow((int)Math.pow(2, (input/2)));
			    }
			    System.out.println(out);
			}*/
		}

}
