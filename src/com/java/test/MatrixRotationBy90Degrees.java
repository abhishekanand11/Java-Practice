package com.java.test;

/**
 * You are given an n x n 2D matrix that represents an image. Rotate the image
 * by 90 degrees (clockwise).
 * 
 * Note: Try to solve this task in-place (with O(1) additional memory), since
 * this is what you'll be asked to do during an interview.
 * 
 * @author abhishek
 * 1 2 3					7 4 1
 * 4 5 6		becomes 	8 5 2
 * 7 8 9					9 6 3
 * 
 *
 */
public class MatrixRotationBy90Degrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int mat[][] =
	        {
	            {1, 2, 3, 4},
	            {5, 6, 7, 8},
	            {9, 10, 11, 12},
	            {13, 14, 15, 16}
	        };
		
		 // Tese Case 2
         int mat1[][] = {
                            {1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}
                        };
         
		rotateMatrix(mat1);
		displayMatrix(n, mat1);
		

	}

	//logic to rotate is first row becomes first column and second row becomes second column and so on
	static int[][] rotateMatrix(int[][] a) {
		int columns = a[0].length;
		for(int i = 0; i < columns/2; i++){
			for(int j =i; j < columns - i-1; j++){
				int temp = a[i][j];
				//tuples which will come in loop (0,0),(0,1),(0,2),(1,1)
				//0,0 becomes 0,2		1,0 becomes 0,1			2,0 becomes 0,0
				//0,1 becomes 1,2		1,1 becomes 1,1			2,1 becomes 1,0
				//0,2 becomes 2,2		1,2 becomes 2,1			2,2 becomes 2,0
				
				a[i][j] = a[columns-1-j][i];
				a[columns-1-j][i] = a[columns-1-i][columns-1-j];
				a[columns-1-i][columns-1-j] = a[j][columns-1-i];
				a[j][columns-1-i] = temp;
				
			}
		}
		return a;

	}
	
	static void displayMatrix(int N, int mat[][])
    {
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
                System.out.print(" " + mat[i][j]);
      
            System.out.print("\n");
        }
        System.out.print("\n");
    }

}
