package com.java.test;

/**
 * @author fcaa17922
 * 
 * Update the i'th row and j'th column if arr[i][j] is 1
 *
 */
public class UpdateRowColumnOfMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 0, 0, 0 }, { 0, 1, 0 } };
		modifyMatrix(arr);

	}

	static int[][] modifyMatrix(int[][] arr) {
		int[][] modifiedArray = copyArray(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == 1) {
					updateRowColumn(modifiedArray, i, j);
				}
			}
		}
		return modifiedArray;
	}

	static void updateRowColumn(int[][] arr, int i, int j) {
		for (int k = 0; k < arr[0].length; k++) {
			arr[i][k] = 1;
		}

		for (int l = 0; l < arr.length; l++) {
			arr[l][j] = 1;
		}
	}

	static int[][] copyArray(int[][] current) {
		int[][] old = new int[current.length][current[0].length];
		for (int i = 0; i < old.length; i++)
			for (int j = 0; j < old[i].length; j++)
				old[i][j] = current[i][j];
		return old;
	}
}
