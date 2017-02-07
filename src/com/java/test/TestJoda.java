package com.java.test;

import java.util.Calendar;

import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;

public class TestJoda {
	
	public static final String BILL_DATE_FORMAT = "yyyy-MM-dd";
	
	
	public static void main(String [] args){
		System.out.println(getDays());
	}
	
	public static LocalDate getDays(){
		  LocalDate   nextTriggerDate =  LocalDate.fromCalendarFields(Calendar.getInstance());
		  //nextTriggerDate = nextTriggerDate.minusDays(6);
			LocalDate now = LocalDate.now();
			
					LocalDate dueDate = LocalDate.parse("2017-02-05",
							DateTimeFormat.forPattern(BILL_DATE_FORMAT));
					
					if(Days.daysBetween(now,dueDate).isGreaterThan(Days.days(5))){
						nextTriggerDate = nextTriggerDate.minusDays(5);
						
					} else if(Days.daysBetween(now,dueDate).isGreaterThan(Days.days(0)) && 
							Days.daysBetween(now,dueDate).isLessThan(Days.days(5))){
						nextTriggerDate = now.plusDays(1);
					
					} else if(Days.daysBetween(now,dueDate) == Days.days(0)){
						nextTriggerDate = now;
						
					} else{
						dueDate = addOneMonth(dueDate);
						nextTriggerDate = dueDate;
					}
			return nextTriggerDate;
	}
	
	private static LocalDate addOneMonth(LocalDate date) {
		LocalDate now = LocalDate.now();
		if(date.isAfter(now)){
			date = date.plusMonths(1);
			return date;
		}
		if(date.getDayOfMonth()<now.getDayOfMonth()){
			now = now.plusMonths(1);
		}
		now = now.withDayOfMonth(date.getDayOfMonth());    	
		now = now.plusMonths(1);	
		
		return now;
	}

}
