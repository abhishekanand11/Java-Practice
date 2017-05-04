package com.java.test;
import static java.lang.Math.floor;
import static java.lang.Math.log;

/**
 * @author abhishekanand
 * This class is used to generate character sequences like abc..z aaab..az till n
 *
 */
public class CharacterSequenceGeneration {

	private static char[] alphArr;//= new int[26];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getString(10000040));
		System.out.println(getSequence(10000039));
		
	}
	
	private static String getString(int n) {
	    char[] buf = new char[(int) floor(log(25 * (n + 1)) / log(26))];
	    for (int i = buf.length - 1; i >= 0; i--) {
	        n--;
	        buf[i] = (char) ('A' + n % 26);
	        n /= 26;
	    }
	    return new String(buf);
	}
	
	private static String getSequence(int i) {
	    return i < 0 ? "" : getSequence((i / 26) - 1) + (char)(65 + i % 26);
	}

}
