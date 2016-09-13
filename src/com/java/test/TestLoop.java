package com.java.test;

import java.util.HashMap;
import java.util.Map;
import java.math.*;

public class TestLoop {
	public static final String success = "0";
	public static final String failure = "1";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				if(success == getInt()){
					System.out.println("True");
				}
				else if(failure == getInt()) {
					System.out.println("False");
				}
				else{
					System.out.println("Nothing");
				}
	}
	
	private static String getInt(){
		return "2";
	}
	
}
