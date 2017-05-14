package com.java.test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author fcaa17922
 * This method is used to find the no of ways trucks can cater from source to destination.
 * Source is starting from 1 and destination is 5. Each truck has their start and end points and no stoppage in between.
 * Multiple trucks can take a good from source to destination and it will be counted as one.
 *
 */
public class DeliveryTruck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int noOfTrucks = sc.nextInt();
		int[][] pointArr = new int[noOfTrucks][2];

		for (int i = 0; i < noOfTrucks; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			pointArr[i][0] = start;
			pointArr[i][1] = end;
		}

		System.out.println(countTrucks(pointArr));

	}

	static int checkIfPathExists(int[][] pointArr, Queue queue, int count) {
		while (!queue.isEmpty()) {
			Integer index = (int) queue.remove();
			int endDest = pointArr[index][1];
			if (endDest == 5) {
				count++;
			}
			for (int i = index; i < pointArr.length; i++) {
				if (pointArr[i][0] == endDest && pointArr[i][0] != pointArr[i][1]) {
					queue.add(i);
				}
			}
			count = checkIfPathExists(pointArr, queue, count);
			return count;
		}
		return count;
	}

	static int countTrucks(int[][] pointArr) {
		Queue<Integer> queue = new LinkedList<Integer>();
		int count = 0;
		for (int i = 0; i < pointArr.length; i++) {
			if (pointArr[i][0] == 1 && pointArr[i][1] == 5) {
				count++;
			} else if (pointArr[i][0] == 1) {
				queue.add(i);
				count = count + checkIfPathExists(pointArr, queue, count);
			}
		}
		return count;
	}
}
