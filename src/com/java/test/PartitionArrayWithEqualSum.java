package com.java.test;

/**
 * @author abhishek anand
 * 
 * This class is used to partition a given array into two sub arrays with equal sums.
 *
 */
public class PartitionArrayWithEqualSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 5, 16 };
		// int [] arr = {83, 86, 77, 15, 93, 35, 86, 92, 49, 21, 62, 27, 90, 59,
		// 63, 26, 40, 26, 72, 36, 11, 68, 67, 29, 82, 30, 62, 23, 67, 35, 29,
		// 2, 22, 58, 69, 67, 93, 56, 11, 42, 29, 73, 21, 19, 84, 37, 98, 24,
		// 15, 70, 13, 26, 91, 80, 56, 73, 62, 70, 96, 81, 5, 25, 84, 27, 36, 5,
		// 46, 29, 13, 57, 24, 95, 82, 45, 14, 67, 34, 64, 43, 50, 87, 8, 76,
		// 78, 88, 84, 3, 51, 54, 99, 32, 60, 76, 68, 39, 12, 26, 86, 94, 39};
		long start = System.currentTimeMillis();
		System.out.println(isSubsetSum(arr) == 0);
		System.out.println("Time taken is : " + (System.currentTimeMillis() - start));
	}

	static int isSubsetSum(int[] arr) {
		int sumTotal = 0;
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			sumTotal = sumTotal + arr[i];
		}

		// Create an array to store results of subproblems
		boolean dp[][] = new boolean[len + 1][sumTotal + 1];

		// Initialize first column as true. 0 sum is possible
		// with all elements.
		for (int i = 0; i <= len; i++)
			dp[i][0] = true;

		// Initialize top row, except dp[0][0], as false. With
		// 0 elements, no other sum except 0 is possible
		for (int i = 1; i <= sumTotal; i++)
			dp[0][i] = false;

		// Fill the partition table in bottom up manner
		for (int i = 1; i <= len; i++) {
			for (int j = 1; j <= sumTotal; j++) {
				// If i'th element is excluded
				dp[i][j] = dp[i - 1][j];

				// If i'th element is included
				if (arr[i - 1] <= j)
					dp[i][j] |= dp[i - 1][j - arr[i - 1]];
			}
		}

		// Initialize difference of two sums.
		int diff = Integer.MAX_VALUE;

		// Find the largest j such that dp[n][j]
		// is true where j loops from sum/2 t0 0
		for (int j = sumTotal / 2; j >= 0; j--) {
			// Find the
			if (dp[len][j] == true) {
				diff = sumTotal - 2 * j;
				break;
			}
		}
		return diff;
	}

}
