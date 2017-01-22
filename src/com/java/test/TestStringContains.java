package com.java.test;

import java.util.ArrayList;
import java.util.List;

public class TestStringContains {

	public static void main(String[] args) {
		String operatorString = "105017,  105112,  105447,  105492,  106168,  107968,  108831,  108833,  108870,  108906,  108907,  109330,  110279,  110738,  154,  16739,  16979,  17011,  17064,  17478,  17964,  1799,  18164,  18344,  1845,  18588,  1889,  1970,  2,  204,  237,  3306,  3325,  33849,  3498,  35013,  3503,  3509,  3536,  3582,  3601,  3609,  36365,  3652,  3681,  37517,  3785,  38727,  3925,  39500,  417,  43127,  4495,  484,  4917,  50,  5284,  62031,  71365,  71385,  71417,  99634,  AI,  CI,  EAI,  ECI,  ECL,  EF,  EG,  EI,  ES,  ESM,  ETI";	
		final List<String> errorCodeList =	getListFromCommaSeparatedString(operatorString);
		if (errorCodeList.contains("5284")){
			System.out.println(true);
			
		}else{
			System.out.println(false);
		}
		System.out.println(errorCodeList);
}
	
	public static List<String> getListFromCommaSeparatedString(String operatorString){
		List<String> operatorsList = new ArrayList<String>();
		String [] opArray = operatorString.split(",");
		
		for(String operator : opArray){
			operatorsList.add(operator.trim());
		}
		return operatorsList;
	}
}
