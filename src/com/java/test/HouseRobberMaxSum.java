package com.java.test;

/**
 * This class is used to find the maximum sum from the integer array with the
 * condition that no two elements should be adjacent
 * 
 * @author fcaa17922
 *
 */
public class HouseRobberMaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 55, 72, 209, 143, 216, 220, 122, 115, 87, 227, 220, 161, 79, 230, 55, 56, 56, 178, 124, 88, 202,
				65, 102 };
		System.out.println(findMaxSum(nums));
	}

	static int findMaxSum(int nums[]) {
		int incl = nums[0];
		int excl = 0;
		int excl_new;
		int i;

		for (i = 1; i < nums.length; i++) {
			/* current max excluding i */
			excl_new = (incl > excl) ? incl : excl;

			/* current max including i */
			incl = excl + nums[i];
			excl = excl_new;
		}

		/* return max of incl and excl */
		return ((incl > excl) ? incl : excl);
	}
}
