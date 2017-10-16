package com.java.hotstar;
/* IMPORTANT: Multiple classes and nested static classes are supported 

Used to find the no of d
*/
import java.util.Scanner;

class WholeWordCount {
	public static void main(String args[]) throws Exception {
		Scanner s = new Scanner(System.in);
		int noOfTestCases = s.nextInt();

		for (int i = 0; i < noOfTestCases; i++) {
			int a = s.nextInt();
			int b = s.nextInt();

			System.out.print("First No is :" + a + " ");
			System.out.print("Second No is :" + b + " ");
			System.out.println();
			getNumberCountAfterDecimal(a, b);
		}

	}

	public static int getNumberCountAfterDecimal(long a, long b) {
		int returnVal = 0;
		long first = a;
		long second = b;
		if (a > b) {
			if (a % b == 0) {
				System.out.println(0);
				return 0;
			} else {
				first = a % b;
			}
		}

		first = first * powerOf10(second);
		long integral = first/second;
		long mentissa = first % second;
		if (mentissa != 0) {
			System.out.println("inf");
		} else {
			int count = Integer.valueOf(String.valueOf(integral));
			while (String.valueOf(integral).charAt(count - 1) == '0') {
				count--;
			}
			System.out.println(count);
		}
		return returnVal;
	}

	static long powerOf10(long n) {
		long returnVal = 1;
		for (int i = 1; i <= n; i++) {
			returnVal = returnVal * 10;
		}

		return returnVal;
	}
}
