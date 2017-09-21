package com.java.test;

public class MatrixZigZagTraversal {

	/**
	 * @param args
	 */
	public static int startRow=0;
	public static int startCol=1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] mat = { { 1, 2, 3, 4 }, {5, 6, 7, 8 }, {9, 10, 11, 12}};
		int totalRows = mat.length;
		int totalCols = mat[0].length;
		int sum =1;
		
		System.out.println(mat[0][0]);
		
		while(sum<=totalRows+totalCols-2){
			if(sum%2==0){
				printUpwards(mat, totalRows-1, totalCols-1);
			}
			else{
				printDownWards(mat, totalRows-1, totalCols-1);
				
			}
			if(startRow==0 || startRow==totalRows-1)
				if(startCol == totalCols-1){
					startRow++;
				}else{
					startCol++;
				}
				
			else if(startCol==0 || startCol==totalCols-1)
				if(startRow == totalRows -1){
					startCol++;
				}else{
					startRow++;
				}
				
			sum++;
		}
		
		
	}
	
//	for(int sum=0; sum < row+col; sum++){
//		if(sum%2 == 0){
//			printUpwards(arr, startRow, startCol, row, col)
//		}else{
//			printDownWards(arr, startRow, startCol, row, col)
//		}
//	}
	
	public static void printDownWards(int[][] arr, int row, int col){
		
		int i, j=0;
		for(i=startRow,j=startCol; j>= 0 && i<= row; i++,j--){
			System.out.print(arr[i][j]+ " ");
		}
		startRow=i-1;
		startCol=j+1;
		System.out.println();
	}
	
	public static void printUpwards(int[][] arr, int row, int col){
		
		int i, j=0;
		for( i=startRow,j=startCol; i>= 0 && j <= col; i--,j++){
			System.out.print(arr[i][j]+ " ");
		}
		startRow=i+1;
		startCol=j-1;
		System.out.println();
	}

}
