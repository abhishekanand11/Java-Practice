	package com.java.test;

import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;

public class TestDateDiff {

	public static String              dateViewFormat ="yyyy-MM-dd";
	private static final int ZERO_DAYS = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate billDate = LocalDate.parse("2017-01-30",
				DateTimeFormat.forPattern(dateViewFormat));
	System.out.println(addOneMonth(billDate));
	
	LocalDate now = LocalDate.parse("2017-01-30", DateTimeFormat.forPattern(dateViewFormat));
	
	 if (Days.daysBetween(now, billDate) == Days.days(ZERO_DAYS)) {
		System.out.println("hai");
	 }
	}
	
	private static LocalDate addOneMonth(LocalDate date) {
		LocalDate now = LocalDate.parse("2017-01-30", DateTimeFormat.forPattern(dateViewFormat));
		if (date.isAfter(now)) {
			date = date.plusMonths(1);
		} else {
			date = now.withDayOfMonth(date.getDayOfMonth());
			date = date.plusMonths(1);
		}
		return date;
	}

}
