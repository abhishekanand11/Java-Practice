package com.java.test;

public class TestAllPossibleStrings {

	static final int MAX_P = 10000;
	
	static final int MAX = 10;
	
	static int cP;
	
	/** The permutations. */
	static String[][] permutations = new String[MAX_P][MAX];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] array = {"a","b","c"};
		permuteVertex(array, 0, 2);

	}
	
	public static void permuteVertex(String[] array, int l, int h) {
		String temp;
		boolean skip;
		if (l == h) {
			System.arraycopy(array, 0, permutations[cP++], 0, l);
		} else {
			for (int i = l; i < h; i++) {
				skip = false;
				for (int j = l; j < i; j++) {
					if (array[j] == array[i]) {
						skip = true;
						break;
					}
				}
				
				if (!skip) {
					temp = array[l];
					array[l] = array[i];
					array[i] = temp;
					permuteVertex(array, l + 1, h);
					temp = array[l];
					array[l] = array[i];
					array[i] = temp;
				}
			}
		}
		for(int i=0;i<array.length;i++){
		System.out.println(array[i]);
		}
	}

}
