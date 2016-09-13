package com.java.test;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

import com.google.common.collect.ImmutableList;

public class TestMain {
	
	//static List<String> successList = Arrays.asList("rch","recharge","recharged","rchrg");
	
	static List<String> successList = ImmutableList.of("rch","recharge","recharged","rchrg");
	
	public static SimpleDateFormat   dateViewFormat = new SimpleDateFormat("yyyy-MM-dd");
	
	static List<String> acceptedOperatorTypeList = Arrays.asList(
			"BESCOM", "DishTV", "EASPAY", "AIRDTH", "SUNDTH", "MyTsky", "VIDDTH", "AIRTEL", "AIREXP", "BSNLCare", "DOCOMO", "IdeaApp", "IDEA",
			"VFCARE", "VODAFO", "VDFONE", "Reliance", "indane", "BHARAT", "MSEDCL", "RINFRA", "TANGED", "HPGASc", "HPGASa", "HGPDBTL", "HPGASe", "HPCGAS", "BPCLMS", "BPLPGa", "DELJAL", "TTNNET",
			"121", "Unknown", "UNKNOWN sender", "MOBIKW", "760090", "SERVCE", "MVIDEO", "BSESRP", "BSESYP", "DHBVNL", "MGAGEX", "MTNLCB", "IGLDEL", "AIRMTA", "Etopup", "140"
            );
	
	static String message = "Dear Customer, your data usage has reached 95% of available data bundles. "
			+ "The applicable tariff after exhaustion of existing data bundles is @3p/10KB. "
			+ "Pls recharge with data STV to continue to enjoy low rates on data usage. Dial *112# to know usage.";
	
	
	private  static final List<Integer> gujratElectricityBillers = ImmutableList.of(225,226,227,228);
	
	public static void main(String[] args) {
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		
		String s = "10.0";
		System.out.println("int value ");
		//Float f = Float.valueOf(s);
		//System.out.println(Double.valueOf(s));
		
	}
	
	public static boolean isEmpty(String s){
		return s == null || "".equals(s);
	}
	
	private static int checkDateDifference(){
		int returnValue = 0;
		Date dueDate = null;
		try{
		 dueDate = dateViewFormat.parse("2016-08-24");
		}
		catch(Exception e){
			
		}
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DAY_OF_YEAR, 1);
        Date oneDayBeforeDate = c.getTime();
        
        Date currentDate = getStartOfDay(new Date());
        
        if(currentDate.after(dueDate)){
        	System.out.println("After due date");
        }
        else if(oneDayBeforeDate.compareTo(dueDate) > 0){
            System.out.println("One day before or same day as due date");
        }
        
		return returnValue;
		
	}
	
	private static Date getStartOfDay(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}
	
	public static String getString(boolean set){
		if(set){
			return "y";
		}
		return null;
	}
	static class MobileNumber {
		private String mobile;

		public String getMobile() {
			return mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		
		
	}
	
	private static void parseString(){
		String date = "12/3/16";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try{
			Date parsedDate = sdf.parse(date);
			System.out.println(parsedDate);
		}
		catch(Exception e){
			System.out.println("Exception occurred in parsing");
		}
	}
	
	public static String getCurrentTimeISTFormat(){
		String timeZone = "GMT";
		String pattern = "yyyyMMddHHz";
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		dateFormat.setTimeZone(TimeZone.getTimeZone(timeZone));
		String date = dateFormat.format(new Date());
		return date;
	}
	
	private static boolean checkBoolean(){
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		//boolean isInvalid = true;
		
		String isInvalid = "Y";
		
		map.put("isInvalid", isInvalid);
		
		System.out.println("String value of Boolean : "+Boolean.valueOf("Y").toString());
		
		Object obj = map.get("isInvalid");
		
		System.out.println("The Map object is : "+obj);
		
		//System.out.println((String) obj);
		
		Boolean returnValue = Boolean.valueOf((String)obj);
		
		splitString();
		
		return returnValue;
	}
	
	private static void splitString(){
		String plan = "54|6|699.30|1|N";
		String[] split = plan.split("\\|");
		
		Integer operatorId = null;
		Integer circleId = null;
		Double amount = null;
		Integer productId = null;
		boolean isInvalid = false;
		
		int size = split.length;
		
		if (size > 0) {
			operatorId = (Integer.parseInt(split[0]));
		}

		if (size > 1) {
			circleId = (Integer.parseInt(split[1]));
		}
		
		if (size > 2) {
			amount = (Double.parseDouble(split[2]));
		}

		if (size > 3) {
			productId = (Integer.parseInt(split[3]));
		}
		
		if (size > 4) {
			isInvalid = Boolean.valueOf(split[4]);
		}
		
		System.out.println(operatorId+"|"+circleId+"|"+amount+"|"+productId+"|"+isInvalid);
		System.out.println(isInvalid);
		/**for(String s : split){
			System.out.println("The String is : "+s);
		}*/
		
	}
	
	private boolean testSuccessStringAndOperator(){
		boolean isSuccesMessage = false;
		String biller = "225";
		
		if(gujratElectricityBillers.contains(biller)){
			System.out.println("Biller present");
		}
		
		
		for(String s : successList){
			if(message.contains(s)){
				isSuccesMessage = true;
				break;
			}
		}
		System.out.println("Genuine Message : " + isSuccesMessage);
		
		boolean isSuccesOperator = false;
		
		for(String s : acceptedOperatorTypeList){
			if(s.equalsIgnoreCase("care")){
				isSuccesOperator = true;
				System.out.println("Return value : " + isSuccesOperator);
				return true;
			}
		}
		
		return false;
	}
	
	
	private static Timestamp getMonthEndDayTimestamp(){
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DATE, Calendar.getInstance().getActualMaximum(Calendar.DAY_OF_MONTH));
		cal.set(Calendar.HOUR_OF_DAY, 23); 
	    cal.set(Calendar.MINUTE, 59);    
	    cal.set(Calendar.SECOND, 59);
		return new Timestamp(cal.getTimeInMillis());
	}
	
	private static String setErrorMessage(){
		String msg = "Only one payment is allowed in a calendar month. Kindly pay after %s";
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DATE, Calendar.getInstance().getActualMaximum(Calendar.DAY_OF_MONTH));
		String displayMonth = cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault());
		String displayDate = String.valueOf(cal.get(Calendar.DAY_OF_MONTH))+getDateSuffix(cal.get(Calendar.DAY_OF_MONTH));
		msg = String.format(msg, displayDate+" "+displayMonth);
		return msg;
		
	}

	public static String getDateSuffix( int day) { 
        switch (day) {
            case 1: case 21: case 31:
                   return ("st");

            case 2: case 22: 
                   return ("nd");

            case 3: case 23:
                   return ("rd");

            default:
                   return ("th");
        }
}
	
	public static int testInt(int value){
		switch (value){
		case 1 :
			return 1;
		case 0 :
			return 0;
		default:
			return -1;
		}
	}
	
	public static int getInt(int value){
		if(value == 10){
			return value;
		}
		return 0;
	}
	
}
