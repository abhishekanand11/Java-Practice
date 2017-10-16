package com.java.test;

import java.util.PriorityQueue;
import java.util.Scanner;

import com.java.zapr.MinShiftOfApples;

public class HeapUsingPriorityQueue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfTestCases = sc.nextInt();
		for(int i=0; i<noOfTestCases; i++){
			int noOfHeaps = sc.nextInt();
			PriorityQueue<Integer> heap = new PriorityQueue<Integer>(noOfHeaps);
			int cost = 0;
			
			for(int j=0; j<noOfHeaps; j++){
				heap.add(sc.nextInt());
			}
			
			 while (heap.size() != 1)
			    {
			        // Extract two minimum length ropes from min heap
			        int min     = heap.poll();
			        int sec_min = heap.poll();
			        System.out.println("min : " + min + ", sec_min : " +sec_min);
			 
			        int max = Math.max(min, sec_min);
			        cost += max;
			 
			        // Insert a new rope in min heap with length equal to sum
			        // of two extracted minimum lengths
			        heap.add(min+sec_min);
			    }
			
			System.out.println("The Min val is " + cost);
		}
	

	}

}
