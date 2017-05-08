package com.java.test;

public class TestUniqueWaysToRepresentANumber {
	static int[] print = new int[200];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printTillOne(8, 8, 0);

	}

	static void printTillOne(int n, int k, int idx) {
		if (n == 0) {
			for (int i = 0; i < idx; i++) {
				System.out.print(print[i]);
				System.out.print(" ");
			}
			System.out.println();
			return;
		}

		for (int i = k; i > 0; i--) {
			if (i > n)
				continue;// use i as the first number,since decreasing sequence
			print[idx] = i; // i loops from k to 1
			printTillOne(n - i, i, idx + 1);// since i used the rest of
											// partition can't have any number
											// greater than i hence second
											// parameter is i

		}

	}
}
