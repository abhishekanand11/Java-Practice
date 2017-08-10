package com.java.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class AllPossiblePermutationOfAString {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcd";
		Set s = getAllPossiblePermutations(str);
		
		
		Iterator<String> si = s.iterator();
		List<String> nList = new ArrayList<String>();
		
		while(si.hasNext()){
			//System.out.println(si.next());
			nList.add(si.next());
		}
		Collections.sort(nList);
		for(String sa: nList){
			System.out.println(sa);
		}

	}
	
	public static Set<String>  getAllPossiblePermutations(String s){
		Set<String> returnList = new HashSet<String>();
		getAllPossiblePermutations(s, returnList);
		return returnList;
	}
	
	public static void getAllPossiblePermutations(String s, Set<String> returnList) {
		if (!returnList.contains(s)) {
			if (s.length() == 1) {
				returnList.add(s);
			} else {
				for (int i = 0; i < s.length(); i++) {
					if (i == 0) {
						getAllPossiblePermutations(s.substring(i + 1, s.length()), returnList);
					} else if (i == (s.length() - 1)) {
						getAllPossiblePermutations(s.substring(0, i), returnList);
					} else {
						getAllPossiblePermutations(s.substring(0, i) + s.substring(i + 1, s.length()), returnList);
					}
				}
				returnList.add(s);
			}
		}
	}

}
