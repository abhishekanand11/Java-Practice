package com.java.zapr;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author abhishekanand
 *
 */
public class MinShiftOfApples {
	public static void main(String... arg) {
		Scanner sc = new Scanner(System.in);
		int noOfTestCases = sc.nextInt();
		try {
			for (int i = 0; i < noOfTestCases; i++) {
				int noOfHeaps = sc.nextInt();
				PriorityQueue<Integer> heap = new PriorityQueue<Integer>(noOfHeaps);
				int cost = 0;

				for (int j = 0; j < noOfHeaps; j++) {
					heap.add(sc.nextInt());
				}

				while (heap.size() != 1) {
					int min = heap.poll();
					int sec_min = heap.poll();

					int max = Math.max(min, sec_min);
					cost += max;
					heap.add(min + sec_min);
				}
				System.out.println("The Min val is " + cost);
			}
		} finally{
			sc.close();
		}

	}

}
