package com.java.test;

import java.util.HashMap;
import java.util.Map;

public class FindPairEqualToAGivenNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int A[] = {-1, 4, 45, 6, 10, 1};
        int n = 16;
        findPairEqualToGivenSum(A, 0);

	}
	
	public static void findPairEqualToGivenSum(int [] arr, int sum){
		Map<Integer, Boolean> pairMap = new HashMap<Integer, Boolean>();
		
		for(int i = 0; i < arr.length; i++){
			int temp = sum - arr[i];
			if(pairMap.containsKey(temp)){
				System.out.println("The pair equal to given sum [" + sum + "] is : " + temp + " and " + arr[i]);
			} else {
				pairMap.put(arr[i], Boolean.TRUE);
			}
		}
	}

}
