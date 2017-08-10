package com.java.test;

/**
 * @author fcaa17922
 * Used to find the max no of zeroes that can be obtained from an array using a single flip of a subarray
 *
 */
public class TestMaxZeroSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [] arr = {0, 1, 0, 1, 1, 0, 1, 1};
		//System.out.println(getMaxZeroCount(arr, arr.length));
		
		

	}
	
	public static int getMaxZeroCount(int[] arr , int n){
		// Initialize count of zeros and maximum difference
	    // between count of 1s and 0s in a subarray
	    int orig_zero_count = 0;
	    // Initiale overall max diff for any subarray
	    int max_diff = 0;
	 
	    // Initialize current diff
	    int curr_max = 0;
	 
	    for (int i=0; i<n; i++)
	    {
	        // Count of zeros in original array (Not related
	        // to Kadane's algorithm)
	        if (arr[i] == 0)
	           orig_zero_count++;
	 
	        // Value to be considered for finding maximum sum
	        int val = (arr[i] == 1)? 1 : -1;
	        // Update current max and max_diff
	        curr_max = Math.max(val, curr_max + val);
	        max_diff = Math.max(max_diff, curr_max);
	    }
	    max_diff = Math.max(0, max_diff);
	    return orig_zero_count + max_diff;
	}

}
