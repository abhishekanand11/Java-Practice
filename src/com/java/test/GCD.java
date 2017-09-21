package com.java.test;

import java.math.BigInteger;


/**
 * Used to find the GCD of two numbers
 * 
 * @author abhishek
 *
 */
public class GCD {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(gcd(5000,0));

	}
	public static long gcd(long a, long b){
		if(a == 0){
			return b;
		}else if (b == 0){
			return a;
		}
		while (a != 0 || b!= 0) {
			if(a== 0|| b==0){
				return 0;
			}
			if(a==b){
				return a;
			}
			
			if(a>b){
				a = a-b;
			} else{
				b = b-a;
			}
		}
		return 1;
	}
	/*
	public static long gcd(int a, int b) {
		BigInteger b1 = BigInteger.valueOf(a);
		BigInteger b2 = BigInteger.valueOf(b);
		BigInteger gcd = b1.gcd(b2);
		return gcd.intValue();
	}
	*/
}
