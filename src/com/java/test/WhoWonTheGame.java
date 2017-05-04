package com.java.test;

import java.math.BigInteger;

public class WhoWonTheGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] tests = {"184467440737091516"};

		for (int i = 0; i < tests.length; i++) {
			int moveCount = 0;
			BigInteger temp = new BigInteger(tests[i]);
			BigInteger one = new BigInteger("1");
			BigInteger two = new BigInteger("2");
			if(temp.compareTo(one) == 0 && moveCount == 0){
				System.out.println("Clark");
			}  else{
				while(temp.compareTo(one) == 1){
					if (temp.compareTo(highestPowerOf2(temp)) == 0){
						temp = temp.divide(two);
					}else{
						temp = temp.subtract(highestPowerOf2(temp));
					}
					moveCount++;
				}
				if(moveCount%2 == 0){
					System.out.println("Clark");
				}else{
					System.out.println("Bruce");
				}
			}
			
		}
	}
	
	
	static BigInteger highestPowerOf2(BigInteger n){
		BigInteger fact= new BigInteger(String.valueOf(2));
		BigInteger two = new BigInteger(String.valueOf(2));
		while(fact.compareTo(n) == -1){
			fact = fact.multiply(two);
		}
		return fact.divide(two);
	}
}
