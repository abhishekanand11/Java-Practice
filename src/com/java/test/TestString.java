package com.java.test;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String validRequestId = "2_123456";
		String requestIdWithRequestCounter = validRequestId;
		validRequestId = validRequestId.substring(validRequestId.indexOf("_") + 1);
		System.out.println(validRequestId);
		System.out.println(requestIdWithRequestCounter);
		
		
		 String requestCounter = requestIdWithRequestCounter.indexOf("_") != -1 ? requestIdWithRequestCounter.substring(0,requestIdWithRequestCounter.indexOf("_")) : null;
		 System.out.println(requestCounter);
		 
		 if(requestCounter != null){
			 System.out.println("True");
			 Integer i = 2;
			 if(i.equals(Integer.valueOf(requestCounter))){
				 System.out.println("Equal Hai");
			 }
		 }else{
			 System.out.println("False");
		 }
		 

	}

}
