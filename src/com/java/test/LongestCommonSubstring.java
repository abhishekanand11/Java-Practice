package com.java.test;

public class LongestCommonSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String y = "This";
		String x = "Thin";
		int xlen = x.length();
		int ylen = y.length();
		System.out.println(LCSubString(x.toCharArray(), y.toCharArray(), xlen, ylen));

	}
	
	
	static int LCSubString(char[] X, char[] Y, int xlen, int ylen){
		int result = 0;
		int LCStuff[][] = new int[xlen+1][ylen+1];
		
		for(int i=0; i <=xlen; i++){
			for(int j=0; j <=ylen; j++){
				if(i==0 || j==0){
					LCStuff[i][j] = 0;
				}else if(X[i-1] == Y[j-1]){
					LCStuff[i][j] = LCStuff[i-1][j-1] + 1;
					result = Integer.max(result, LCStuff[i][j]);
				}else{
					LCStuff[i][j] = 0;
				}
			}
		}
		return result;
	}

}
