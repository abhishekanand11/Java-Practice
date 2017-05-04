package com.java.test;

/**
 * Used to find the triplets in an array whose sum is equal to a given number
 * @author fcaa17922
 *
 */
public class FindingTriplets {

	public static void main (String[] args) {
		int arr[] = {1, 4, 45, 6, 10, 8};
        int sum = 22;
        int arr_size = arr.length;
        findTriplets(arr, arr_size, sum);
	}
	
	static boolean findTriplets(int arr[], int arr_size, int sum)
	{
		for(int i=0; i < arr_size-2; i++){
			for (int j = i+1; j < arr_size-1; j++){
				for(int k= j+1; k < arr_size; k++){
					if(arr[i]+arr[j]+arr[k] == sum){
						System.out.println("Triplet sum found. Triplets with given sum : " + sum + " are " + arr[i] + "," + arr[j]+ "," +arr[k]);
						return true;
					}
				}
			}
		}
		return false;
	}
}
