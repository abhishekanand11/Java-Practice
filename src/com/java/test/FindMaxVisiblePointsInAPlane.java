package com.java.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMaxVisiblePointsInAPlane {

	public static void main(String[] args) {
		int [][] points = {{1, 1}, {3, 1}, {3, 2}, {3, 3},
		            {1, 3}, {2, 5}, {1, 5}, {-1, -1},
		            {-1, -2}, {-2, -3}, {-4, -4}};
		
		int [][] points1 = {{3, 0}, {-2, -2}};
		//double [] angleArray = new double [points.length];
		List<Double> angleArray = new ArrayList<Double>();
		
		for(int i = 0; i < points.length; i++){
			double temp = calculateAbsoluteAngle(points[i]);
			if(temp < 0){
				temp = 360 + temp;
			}else if(temp <= 45){
				angleArray.add(360+temp);
			}
			angleArray.add(temp);
		}

		Collections.sort(angleArray);
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
	
	static int getMaxInRange(List<Double> angleArray, double diff){
		int maxCount = 1;
		int tempCount = 1;
		int startIndex = 0;
		for(int j = 1; j < angleArray.size(); j++){
			int k = startIndex + 1;
			if((double)angleArray.get(j) - (double)angleArray.get(startIndex) <= diff){
				tempCount++;
			} else {
				while (k < j && (double)angleArray.get(j) - (double)angleArray.get(k) > diff && angleArray.size() != 1) {
					k++;
					tempCount--;
				}
				startIndex = k;
			}
			if (tempCount > maxCount) {
				maxCount = tempCount;
			}
		}
		return maxCount;
	}

}
