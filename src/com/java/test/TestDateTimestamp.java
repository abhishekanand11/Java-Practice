package com.java.test;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.joda.time.DateTime;

public class TestDateTimestamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timestamp ts = getData();
		System.out.println(ts);
		
		 if(ts !=null){
             Date dueDate = new java.util.Date(ts.getTime());
             System.out.println(dueDate);
             if(daysBetween(new Date(), dueDate) == 0){
             	System.out.println("hai diff");
             }
		 
		 System.out.println(daysBetween(dueDate, new DateTime().withHourOfDay(00).withMinuteOfHour(00).withSecondOfMinute(00).withMillisOfSecond(00).toDate()));
		 }
	}

	public static int daysBetween(Date d1, Date d2){
        return (int)( (d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
    }
	
	public static Timestamp getData() {
		String billDueDateStr = "2017-02-26 00:00:00";

		Timestamp billDueDateTs = null;
		if (billDueDateStr != null) {
			billDueDateTs = convertStrToTimeStamp(billDueDateStr);
		}
		return billDueDateTs;
	}

	private static Timestamp convertStrToTimeStamp(String dateTime) {
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		try {

			Date dateBeforeConversion = formatter.parse(dateTime);
			return new Timestamp(dateBeforeConversion.getTime());
		} catch (Exception e) {
			return null;
		}

	}

}
