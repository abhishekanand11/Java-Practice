package com.java.test;

import java.util.Arrays;

public class FindMaxVisiblePointsInAPlane {

	public static void main(String[] args) {
		int [][] points = {{1, 1}, {3, 1}, {3, 2}, {3, 3},
		            {1, 3}, {2, 5}, {1, 5}, {-1, -1},
		            {-1, -2}, {-2, -3}, {-4, -4}};
		
		int [][] points1 = {{3, 0}, {-2, -2}};
		double [] angleArray = new double [points.length];
		
		for(int i = 0; i < points.length; i++){
			double temp = calculateAbsoluteAngle(points[i]);
			if(temp < 0){
				temp = 360 + temp;
			}
			angleArray[i] = temp;
		}

		Arrays.sort(angleArray);
		for(double d: angleArray){
			System.out.println(d);
		}
		
		System.out.println(getMaxInRange(angleArray, 45.0));
		
		
		
	}
	
	static double calculateAbsoluteAngle(int [] arrOfPoints){
		double x = (double) arrOfPoints[0];
		double y = (double) arrOfPoints[1];
		return Math.atan2(y - 0.0, x - 0.0) * 180/Math.PI;
	}
	
	static int getMaxInRange(double[] angleArray, double diff){
		int maxCount = 1;
		for(int j = 0; j < angleArray.length; j++){
			int tempCount = 0;
			int k = j;
			double range = 0.0;
			 range = angleArray[j] + diff;
			while(k < angleArray.length && angleArray[k]<=range && angleArray.length != 1){
				k++;
				tempCount++;
			}
			if(tempCount > maxCount){
				maxCount = tempCount;
			}
		}
		return maxCount;
	}

}
