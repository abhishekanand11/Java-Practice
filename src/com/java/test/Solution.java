package com.java.test;

import java.util.Scanner;

class Solution {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			for (int j = 0; j < n; j++) {
				int localInt = a;
				for (int k = 0; k <= j; k++) {
					localInt = localInt + getPower(2,k) * b;
				}
				System.out.print(localInt);
				System.out.println(Short.MIN_VALUE);
				if( j < n-1){
				System.out.print(" ");
				}
			}
		}
		in.close();
	}

	static int getPower(int base, int exponent) {
		int local = 1;
		if (exponent > 0) {
			for (int i = 1; i <= exponent; i++) {
				local = local * base;
			}
		}
		return local;
	}
}
