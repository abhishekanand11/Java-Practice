package com.java.test;

/**
 * @author abhishek anand
 * 
 * This class is used to traverse from one end of a 2D matrix to another end and in the process print all the paths taken.
 * The only moves that are allowed are either one step right or one step down.
 *
 */
public class MatrixPathTraversal2D {
	public int rowCount;
	public int colCount;
	public int[][] arr;

	public MatrixPathTraversal2D(int[][] arr) {
		this.rowCount = arr.length;
		this.colCount = arr[0].length;
		this.arr = arr;

	}

	public void printAllPath(int currRow, int currCol, String path) {

		if (currRow == rowCount - 1) {
			for (int i = currCol; i < colCount; i++) {
				path = path + "-" + arr[currRow][i];
			}
			System.out.println(path);
			return;
		}

		if (currCol == colCount - 1) {
			for (int j = currRow; j < rowCount; j++) {
				path = path + "-" + arr[j][currCol];
			}
			System.out.println(path);
			return;
		}
		path = path + "-" + arr[currRow][currCol];

		printAllPath(currRow + 1, currCol, path);
		printAllPath(currRow, currCol + 1, path);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		MatrixPathTraversal2D cls = new MatrixPathTraversal2D(mat);
		cls.printAllPath(0, 0, "");

	}

}
