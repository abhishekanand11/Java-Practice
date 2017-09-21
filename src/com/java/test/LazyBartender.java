package com.java.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LazyBartender {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int noOfCockTailTypes = s.nextInt();
        int noOfCustomers = s.nextInt();
        
        Map<Integer, Integer> cockTailCountMap = new HashMap<>();
        boolean [] customerServed = new boolean [noOfCustomers+1];
        Map<Integer, List<Integer>> cockTailCustomerMap = new HashMap<>();
        
        Map<Integer, List<Integer>> customerCockTailMap = new HashMap<>();
        
        for(int i=1; i <= noOfCustomers; i++){
        	int noOfCustomerLikedDrink = s.nextInt();
        	
        	List<Integer> customerCockTailLikeList = new ArrayList<Integer>();
        	for(int j=1; j <= noOfCustomerLikedDrink; j++){
        		int like = s.nextInt();
        		customerCockTailLikeList.add(like);
        		if(cockTailCountMap.get(like) != null){
        			cockTailCountMap.put(like, cockTailCountMap.get(like)+1);
        		}else{
        			cockTailCountMap.put(like,1);
        		}
        		List<Integer> list = cockTailCustomerMap.get(like);
        		if(list != null){
        			list.add(i);
            		cockTailCustomerMap.put(like, list);
        		}else{
        			List<Integer> list1 = new ArrayList<Integer>();
        			list1.add(i);
        			cockTailCustomerMap.put(like, list1);
        		}
        		
        		
        	}
        	customerCockTailMap.put(i, customerCockTailLikeList);
        }

        cockTailCountMap = sortByValues(cockTailCountMap);
        
        int drinksPrepared = 0;
        for(Map.Entry<Integer, Integer> entry : cockTailCountMap.entrySet()){
        	System.out.println(entry.getKey() + " " + entry.getValue());
        	int drinkNo = entry.getKey();
        	if(countTrue(customerServed) == noOfCustomers){
        		System.out.println("Final Answer : " + drinksPrepared);
        		System.exit(1);
        	}
        	
        	List<Integer> customerList = cockTailCustomerMap.get(drinkNo);
        	boolean flag = true;
        	for(int customerNo: customerList){
        		if(!customerServed[customerNo]){
        			flag = false;
        		}
        	}
			if (flag) {
				for (int i : customerList) {
					customerServed[i] = true;
				}
				drinksPrepared++;

			}
        }
        
        
       /* for(Map.Entry<Integer, Integer> entry : cockTailCountMap.entrySet()){
        	System.out.println(entry.getKey() + " " + entry.getValue());
        	
        }*/
        
       /* System.out.println("----- Cock Tail Number Customer ------");
        for(Map.Entry<Integer, List<Integer>> entry : cockTailCustomerMap.entrySet()){
        	System.out.print(entry.getKey() + " -> ");
        	for(int i: (List<Integer>) entry.getValue()){
        		System.out.print(i + " ");
        	}
        	System.out.println();
        }*/
        
	}

	 private static HashMap<Integer, Integer> sortByValues(Map<Integer, Integer> map) { 
	       List list = new LinkedList(map.entrySet());
	       // Defined Custom Comparator here
	       Collections.sort(list, new Comparator() {
	            public int compare(Object o1, Object o2) {
	               return ((Comparable) ((Map.Entry) (o2)).getValue())
	                  .compareTo(((Map.Entry) (o1)).getValue());
	            }
	       });

	       // Here I am copying the sorted list in HashMap
	       // using LinkedHashMap to preserve the insertion order
	       HashMap sortedHashMap = new LinkedHashMap();
	       for (Iterator it = list.iterator(); it.hasNext();) {
	              Map.Entry entry = (Map.Entry) it.next();
	              sortedHashMap.put(entry.getKey(), entry.getValue());
	       } 
	       return sortedHashMap;
	  }
	
	 public static int countTrue(boolean [] arr){
		 int count = 0;
		 for(int i=1; i < arr.length; i++){
			 if(arr[i]){
				 count++;
			 }
		 }
		 return count;
	 }
	 
	 
	 
}
