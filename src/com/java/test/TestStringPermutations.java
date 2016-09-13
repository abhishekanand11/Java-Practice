package com.java.test;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class TestStringPermutations {

	  List<String> lst = new ArrayList<String>();
	  
      String str = "abc";
      public void func()
      {

          subset(0, "");
          lst.sort(null);
          lst = lst.Distinct().ToList();
          

          foreach (String item in lst)
          {
              Console.WriteLine(item);
          }
      }
      void subset(int n, String s)
      {
          for (int i = n; i < str.Length; i++)
          {
              lst.Add(s + str[i].ToString());
              subset(i + 1, s + str[i].ToString());
          }
      }
	
	public static void main(String[] args) {
		permutation("aba");
	}
	
}
