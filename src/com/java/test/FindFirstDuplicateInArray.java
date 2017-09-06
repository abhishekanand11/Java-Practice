package com.java.test;

/**
 * Given an array a that contains only numbers in the range from 1 to a.length,
 * find the first duplicate number for which the second occurrence has the
 * minimal index. In other words, if there are more than 1 duplicated numbers,
 * return the number for which the second occurrence has a smaller index than
 * the second occurrence of the other number does. If there are no such
 * elements, return -1.
 * 
 * @author abhishek
 *
 */
public class FindFirstDuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [] arr = {2, 4, 3, 5, 1};
		int [] arr = {2, 4, 4, 5, 1};
		System.out.println(firstDuplicate(arr));

	}
	
	
	static int firstDuplicate(int[] a) {
	    for(int i = 0; i < a.length; i++){
	        if(a[i] > 0){
	        	int temp = a[i];
				if (a[temp - 1] > 0) {
					a[temp - 1] = -a[temp - 1];
				}else{
					return temp;
				}
	        }else{
	        	int temp = -a[i];
	        	if (a[temp - 1] > 0) {
					a[temp - 1] = -a[temp - 1];
				}else{
					return temp;
				}
	        	
	        }
	    }
	    return -1;
	}

}
