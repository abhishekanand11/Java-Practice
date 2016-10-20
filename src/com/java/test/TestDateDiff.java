	package com.java.test;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.joda.time.DateTime;

public class TestDateDiff {

	public static SimpleDateFormat              dateViewFormat = new SimpleDateFormat("yyyy-MM-dd");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		try{
		Date dueDateFromBill = dateViewFormat.parse("2016-11-05");
		Timestamp dueDate = new Timestamp(dueDateFromBill.getTime());
		
		System.out.println(dueDate);
		if(dueDate.after(new Date())){
			System.out.println("Yes after now date");
		}
		
		DateTime dueDateJoda = new DateTime(dueDate).withHourOfDay(23).withMinuteOfHour(59).withSecondOfMinute(59);
		System.out.println(new Timestamp(dueDateJoda.getMillis()));				
		}catch(Exception e){
			
		}
	}

}
