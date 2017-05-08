package com.java.test;

import java.util.HashMap;
import java.util.Map;

public class SumInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 3, 0, -2, 6, -3, 2 };
		int[][] queries = { { 0, 2 }, { 2, 5 }, { 0, 5 } ,{0,2}};

		System.out.println(sumInRange(nums, queries));
		System.out.println(sumS(nums, queries));
	}

	static int sumInRange(int[] nums, int[][] queries) {
		Map<String, Integer> resultMap = new HashMap<String, Integer>();
		int returnValue = 0;
		int[] resultArray = new int[queries.length];
		for (int i = 0; i < queries.length; i++) {
			int tempSum = 0;
			for (int j = queries[i][0]; j <= queries[i][1]; j++) {
				if (resultMap.get(String.valueOf(j) + String.valueOf(queries[i][1])) != null) {
					tempSum = tempSum + resultMap.get(String.valueOf(j) + String.valueOf(queries[i][1]));
					break;

				} else {
					tempSum = tempSum + nums[j];
				}
			}
			resultMap.put(String.valueOf(queries[i][0]) + String.valueOf(queries[i][1]), tempSum);
			resultArray[i] = tempSum;
		}

		for (int i = 0; i < resultArray.length; i++) {
			returnValue = returnValue + resultArray[i];
		}

		return mod(returnValue, 1000000007);
	}

	static int mod(int a, int b) {
		int r = a % b;
		return r < 0 ? r + b : r;
	}
	
	static int sumS(int[] nums, int[][] queries) {
		int returnValue = 0;
		int[] resultArray = new int[queries.length];
		int[] sumArray = new int[nums.length]; 
		
		for(int i=0; i < nums.length; i++){
			if(nums[i] > 0)
				nums[i] = mod(nums[i], 1000000007);
		}
		
		for(int i=0; i < nums.length; i++){
			if(i == 0){
				 sumArray[i] = nums[i];
			}else{
				sumArray[i] = sumArray[i-1]+nums[i];
			}
		}
		
		for (int i = 0; i < queries.length; i++) {
			int start = queries[i][0];
			int end = queries[i][1];
			if (start == 0) {
				resultArray[i] = sumArray[end];
			} else {
				resultArray[i] = sumArray[end] - sumArray[start - 1];
			}
		}

		for (int i = 0; i < resultArray.length; i++) {
			returnValue = returnValue + resultArray[i];
		}

		return mod(returnValue, 1000000007);
	}

}
