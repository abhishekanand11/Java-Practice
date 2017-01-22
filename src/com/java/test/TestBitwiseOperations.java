package com.java.test;

import java.util.BitSet;
import java.util.Scanner;

public class TestBitwiseOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int ops = sc.nextInt();
		BitSet b1 = new BitSet(size);
		BitSet b2 = new BitSet(size);
		String s = null;
		int i, j;
		try {
			while (ops > 0) {
				s = sc.next();
				i = sc.nextInt();
				j = sc.nextInt();

				switch (s) {
				case ("AND"):
					if (i == 1) {
						b1.and(b2);
					} else {
						b2.and(b1);
					}
					break;
				case ("OR"):
					if (i == 1) {
						b1.or(b2);
					} else {
						b2.or(b1);
					}
					break;
				case ("XOR"):
					if (i == 1) {
						b1.xor(b2);
					} else {
						b2.xor(b1);
					}
					break;
				case ("FLIP"):
					if (i == 1) {
						b1.flip(j);
					} else {
						b2.flip(j);
					}
					break;
				case ("SET"):
					if (i == 1) {
						b1.set(j);
					} else {
						b2.set(j);
					}
					break;
				default:
					break;
				}
				System.out.println(b1.cardinality() + "  " + b2.cardinality());
			}
		} catch (Exception e) {
			// Doing nothing for now, just swallowing the exception
		} finally {
			sc.close();
		}
	}

}
