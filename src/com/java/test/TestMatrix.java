package com.java.test;

public class TestMatrix {

	public static int[][] transposrMultMatrix(int initialValue, int rows, int columns) {
		int start = initialValue;
		int[][] oMatrix = new int[rows][columns];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				oMatrix[i][j] = start;
				start++;
			}
		}

		int[][] tMatrix = new int[columns][rows];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				tMatrix[j][i] = oMatrix[i][j];
			}
		}

		return tMatrix;
	}

	public static void main(String[] args) {
		int[][] returnMatrix = transposrMultMatrix(1, 3, 4);

		for (int i = 0; i < returnMatrix.length; i++) {
			for (int j = 0; j < returnMatrix[0].length; j++) {
				System.out.println(returnMatrix[i][j]);
			}
		}

	}

}
