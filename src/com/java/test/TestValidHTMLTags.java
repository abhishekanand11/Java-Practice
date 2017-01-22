package com.java.test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Used to print all the contents between valid HTML tags Like for <h>Admin</h>
 * <h1>I</h> will print only Admin and not the I because the html tags need to
 * start and end with same tags
 * 
 * @author fcaa17922
 *
 */
public class TestValidHTMLTags {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String i = sc.nextLine();
		int count = 0;
		try {
			Pattern p = Pattern.compile("<(.+)>([^<>]+)</\\1>");

			Matcher m = p.matcher(i);
			while (m.find()) {
				if (m.group(2).length() != 0) {
					System.out.println(m.group(2));
					count++;
				}
			}
			if (count == 0)
				System.out.println("None");
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			sc.close();
		}
	}

}
