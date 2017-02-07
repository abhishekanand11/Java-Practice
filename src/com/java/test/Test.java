package com.java.test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Test {

	public static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public static void main(String[] args) {
		System.out.println(getMonthlyDatesInGivenRange(16, 60));
	}
	
	public static final List<String> getMonthlyDatesInGivenRange(Integer inputDate, Integer monthLimit) {
		List<String> datesList = new ArrayList<String>();
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DATE, inputDate);
		cal.set(Calendar.HOUR_OF_DAY, 00);
		cal.set(Calendar.MINUTE, 00);
		cal.set(Calendar.SECOND, 00);
		while (monthLimit > 0) {
			datesList.add(dateFormat.format(cal.getTime()));
			cal.add(Calendar.MONTH, -1);
			monthLimit--;
		}
		return datesList; // getCommaSeparatedStringFromList(datesList);
	}
	
	private static final String getCommaSeparatedStringFromList(List<String> inputList){
		StringBuffer returnString = new StringBuffer();
		for(int i = 0; i < inputList.size(); i++){
			
			returnString = returnString.append("'").append(inputList.get(i).trim()).append("'");
			returnString.append(",");
		}
		return returnString.substring(0, returnString.length()-1).toString();
	}


}
