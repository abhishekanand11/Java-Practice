package com.java.test;
import java.util.*;

public class PointsInACircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		System.out.println(findIntegerPoints(5));
		

	}
	
	
	static int findIntegerPoints(int radius){
		HashMap<Integer,Integer> map = getSquares(radius);
		int radS =  radius * radius;
		int counter = 1;
		for (int i= radius-1 ; i>= 1; i--){
			if (map.get(radS - (i * i)) != null){
				counter++ ;
			}
		}
		
		return 4 * (counter);
	}
	static HashMap<Integer,Integer> getSquares(int num){
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for (int i =1 ; i <= num; i++){
			map.put(i*i, i);
		}
		
		return map;
	}
}
