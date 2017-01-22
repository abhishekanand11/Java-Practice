package com.java.test;

public class PrintTree {
	
	public  static void prints(int start, int repeat){
		for(int i = 1; i <= repeat; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(start);
			}
			System.out.println();
			if(i == repeat){break;}
			start++;
		}
		
		for(int i = repeat; i >= 1; i--){
			for(int j = 1; j <= i; j++){
				System.out.print(start);
			}
			System.out.println();
			start--;
		}
		
	}
	
	public static void main (String[] args) {
		//code
		PrintTree.prints(1, 4);
		
	}


}
