package com.java.test;

public class TestUniqueWaysToRepresentANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//uniqueSums(4);
		//printTillOne(4,3,1);
		uniqueSums(4);

	}
	
	static void uniqueSums(int n){
		int temp = n;
		while(temp > 1){
			int steps = n/temp;
			for(int i= steps; i >= 1; i--){
				printTillOne(n, temp, i);
			}
			temp--;
		}
	}
	
	static void printTillOne(int number, int start, int diff){
		int temp = start;
		int leftover = number - start;
		System.out.print(temp);
		System.out.print(" ");
		while(leftover > 0 && leftover - diff >= 0){
			System.out.print(leftover);
			System.out.print(" ");
			leftover= leftover-diff;
		}
		System.out.println();
	}
	
}
