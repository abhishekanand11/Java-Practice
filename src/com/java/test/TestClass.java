package com.java.test;

public class TestClass implements TestInterface{

	public static final String success = "0";
	@Override
	public int testInt() throws AnException, Exception {
		// TODO Auto-generated method stub
		if(success == getInt()){
			System.out.println("True");
		}
		return 0;
	}
	
	private static String getInt(){
		return "0";
	}

}
