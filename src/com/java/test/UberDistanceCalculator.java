package com.java.test;

public class UberDistanceCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] departure = { 0.4d, 1d };
		double[] destination = { 0.9d, 3d };
		System.out.println(perfectCity(departure, destination));

	}

	public static double perfectCity(double[] departure, double[] destination) {
		double minorVert = 0d;
		double minorHort = 0d;
		
		minorVert = getMinorDistance(departure[1], destination[1]);
		minorHort = getMinorDistance(departure[0], destination[0]);
		
		return minorVert + minorHort;
	}

	static double getMinorDistance(double a, double b) {
		if (a == b) {
			return 0;
		}

		if (!isInBetween(a, b)) {
			double left = floor(a);
			left = (a - left) + (b - left);
			double right = ceil(a);
			right = (right - a) + (right - b);
			return left < right ? left : right;
		} else {

			double min = min(a, b);
			double max = max(a, b);
			double minRight = ceil(min);
			return (minRight - min) + (max - minRight);

		}
	}

	static double min(double a, double b) {
		return a < b ? a : b;
	}

	static double max(double a, double b) {
		return a > b ? a : b;

	}

	static boolean isInBetween(double a, double b) {
		if (a < 0.0 && b > 0.0)
			return true;
		if (a > 0.0 && b < 0.0)
			return true;
		if (floor(a) != floor(b))
			return true;
		return false;
	}

	static double floor(double input) {
		double result = input - (input % 1.0);
		return result;
	}

	static double ceil(double input) {
		if (input % 1.0 == 0.0) {
			return input;
		}
		return floor(input) + 1;
	}

	static double abs(double input) {
	    if (input > 0.0) return input;
	    return 0.0 - input;
	}
}
