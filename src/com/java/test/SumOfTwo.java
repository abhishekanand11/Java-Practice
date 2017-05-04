package com.java.test;

import java.util.HashSet;

/**
 * @author abhishek anand 
 * This class is used to find if a given number x can be
 * expressed as a sum of y and z where y and z are numbers from
 * different integer arrays
 *
 */
public class SumOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 2, 3 };
		int[] b = { 10, 20, 30, 40 };
		int v = 42;

		System.out.println(sumOfTwo(a, b, v));
	}

	static boolean sumOfTwo(int[] a, int[] b, int v) {
		HashSet<Integer> set1 = new HashSet<Integer>();

		for (int i = 0; i < a.length; i++) {
			set1.add(a[i]);
		}

		for (int i = 0; i < b.length; i++) {
			int rem = v - b[i];
			if (set1.contains(rem)) {
				return true;
			}
		}
		return false;

	}

}
