package com.codefights.array;

public class CheckSudoku {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[][] grid = 
				{ { '.', '.', '.', '1', '4', '.', '.', '2', '.' },
				{ '.', '.', '6', '.', '.', '.', '.', '.', '.' },
				{ '.', '.', '.', '.', '.', '.', '.', '.', '.' },
				{ '.', '.', '1', '.', '.', '.', '.', '.', '.' },
				{ '.', '6', '7', '.', '.', '.', '.', '.', '9' },
				{ '.', '.', '.', '.', '.', '.', '8', '1', '.' },
				{ '.', '3', '.', '.', '.', '.', '.', '.', '6' },
				{ '.', '.', '.', '.', '.', '7', '.', '.', '.' },
				{ '.', '.', '.', '5', '.', '.', '.', '7', '.' } };
		
		char [][] grid1 = {{'.', '.', '.', '.', '2', '.', '.', '9', '.'},
		        {'.', '.', '.', '.', '6', '.', '.', '.', '.'},
		        {'7', '1', '.', '.', '7', '5', '.', '.', '.'},
		        {'.', '7', '.', '.', '.', '.', '.', '.', '.'},
		        {'.', '.', '.', '.', '8', '3', '.', '.', '.'},
		        {'.', '.', '8', '.', '.', '7', '.', '6', '.'},
		        {'.', '.', '.', '.', '.', '2', '.', '.', '.'},
		        {'.', '1', '.', '2', '.', '.', '.', '.', '.'},
		        {'.', '2', '.', '.', '3', '.', '.', '.', '.'}};
		
		char [][] grid3 = {{'.','.','.','.','.','.','5','.','.'}, 
				 {'.','.','.','.','.','.','.','.','.'}, 
				 {'.','.','.','.','.','.','.','.','.'}, 
				 {'9','3','.','.','2','.','4','.','.'}, 
				 {'.','.','7','.','.','.','3','.','.'}, 
				 {'.','.','.','.','.','.','.','.','.'}, 
				 {'.','.','.','3','4','.','.','.','.'}, 
				 {'.','.','.','.','.','3','.','.','.'}, 
				 {'.','.','.','.','.','5','2','.','.'}};
		
		System.out.println(checkSudoku(grid3));

	}

	static boolean checkSudoku(char[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (i == j) {
					if (!(checkRow(arr, i, 9) && checkColumn(arr, i, 9))) {
						return false;
					}
				}

				if (i %3 == 0 && j % 3 == 0) {
					if(!checkSubMatrix(arr, i, j)){
						return false;
					}
				}
			}
		}
		return true;
	}

	static boolean checkRow(char[][] arr, int rowNum, int colSize) {
		boolean[] barr = new boolean[9];
		for (int i = 0; i < colSize; i++) {
			int rowVal = Character.getNumericValue(arr[rowNum][i]);
			if (rowVal > 0) {
				if (!barr[rowVal - 1]) {
					barr[rowVal - 1] = true;
				} else {
					return false;
				}
			}
		}
		return true;
	}

	static boolean checkColumn(char[][] arr, int colNum, int rowSize) {
		boolean[] barr = new boolean[9];
		for (int i = 0; i < rowSize; i++) {
			int colVal = Character.getNumericValue(arr[i][colNum]);
			if (colVal > 0) {
				if (!barr[colVal - 1]) {
					barr[colVal - 1] = true;
				} else {
					return false;
				}
			}
		}
		return true;
	}

	static boolean checkSubMatrix(char[][] arr, int startRow, int startCol) {
		boolean[] barr = new boolean[9];
		for (int i = startRow; i < startRow + 3; i++) {
			for (int j = startCol; j < startCol + 3; j++) {
				int value = Character.getNumericValue(arr[i][j]);
				if (value > 0) {
					if (!barr[value - 1]) {
						barr[value - 1] = true;
					} else {
						return false;
					}
				}
			}
		}
		return true;
	}

}
