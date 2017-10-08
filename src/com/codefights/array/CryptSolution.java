package com.codefights.array;

import java.util.HashMap;
import java.util.Map;

public class CryptSolution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] crypt = {"SEND", "MORE", "MONEY"};
		char [][] solution = {{'O', '0'},
	            {'M', '1'},
	            {'Y', '2'},
	            {'E', '5'},
	            {'N', '6'},
	            {'D', '7'},
	            {'R', '8'},
	            {'S', '9'}};
		
		String [] crypt1 = {"TEN", "TWO", "ONE"};
		char [][] solution1 = {{'O', '1'},
	            {'T', '0'},
	            {'W', '9'},
	            {'E', '5'},
	            {'N', '4'}};
		
		String [] crypt2 = {"AAAAAAAAAAAAAA", 
				 "BBBBBBBBBBBBBB", 
				 "CCCCCCCCCCCCCC"};
		char [][] solution2 = {{'A','1'}, 
				 {'B','2'}, 
				 {'C','3'}};
		
		System.out.println(isCryptSolution(crypt2, solution2));

	}
	
	
	static boolean isCryptSolution(String[] crypt, char[][] solution) {
		Map<Character, Integer> cryptMap = new HashMap<Character, Integer>();
		for(int i=0; i < solution.length; i++){
			cryptMap.put(solution[i][0], Character.getNumericValue(solution[i][1]));
		}
		for(int count=0; count <3; count++){
			StringBuilder s = new StringBuilder(crypt[count]);
			for(int i = 0; i < crypt[count].length(); i++){
				int cryptVal = cryptMap.get(s.charAt(i));
				if(i==0 && cryptVal == 0 && crypt[count].length() != 1){
					return false;
				}
				s.setCharAt(i, (char)(cryptVal + '0'));
			}
			crypt[count] = s.toString();
		}
		
		if((Long.valueOf(crypt[0]) + Long.valueOf(crypt[1])) == Long.valueOf(crypt[2]))
			return true;
		return false;

	}

}
