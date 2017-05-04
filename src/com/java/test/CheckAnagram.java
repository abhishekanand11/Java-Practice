package com.java.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fcaa17922
 * This class is used to find the mimimum no of swaps required to make one string an anagram of other.
 * For checking the strings it uses i'th strings of the respective arrays to check for the anagram difference.
 *
 */
public class CheckAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] a = { "a", "jk", "abb", "mn", "abc" };
		String[] b = { "bb", "kj", "bbc", "op", "def" };
		int[] out = getMinimumDifference(a, b);
		for (int i : out) {
			System.out.println(i);
		}
	}

	static int[] getMinimumDifference(String[] a, String[] b) {
		int firstArrLen = a.length;
		int[] outputArr = new int[firstArrLen];

		for (int i = 0; i < firstArrLen; i++) {
			Map<Character, Integer> tempMap = new HashMap<Character, Integer>();
			if (a[i].length() != b[i].length()) {
				outputArr[i] = -1;
			} else {
				int tempMax = 0;
				for (int j = 0; j < a[i].length(); j++) {
					if (tempMap.get(a[i].charAt(j)) == null) {
						tempMap.put(a[i].charAt(j), 1);
					} else {
						tempMap.put(a[i].charAt(j), 1 + tempMap.get(a[i].charAt(j)));
					}
				}

				for (int k = 0; k < b[i].length(); k++) {
					if (tempMap.get(b[i].charAt(k)) != null && tempMap.get(b[i].charAt(k)) > 0) {
						tempMap.put(b[i].charAt(k), tempMap.get(b[i].charAt(k)) - 1);
					} else {
						tempMax++;
					}
				}
				outputArr[i] = tempMax;
			}

		}
		return outputArr;
	}
}
