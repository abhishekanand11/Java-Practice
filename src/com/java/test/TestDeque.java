package com.java.test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TestDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Deque<Integer> deque = new ArrayDeque<Integer>();
		Set<Integer> set = new HashSet<>();
		int n = in.nextInt();
		int m = in.nextInt();

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			deque.add(num);
			set.add(num);

			if (deque.size() == m) {
				if (set.size() > max)
					max = set.size();
				int first = deque.remove();
				if (!deque.contains(first))
					set.remove(first);
			}
		}
		System.out.println(max);
		in.close();

	}
}
