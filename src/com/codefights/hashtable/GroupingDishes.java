package com.codefights.hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class GroupingDishes {

	public static void main(String[] args) {

		String [][] dishes = {{"Salad", "Tomato", "Cucumber", "Salad", "Sauce"},
	            {"Pizza", "Tomato", "Sausage", "Sauce", "Dough"},
	            {"Quesadilla", "Chicken", "Cheese", "Sauce"},
	            {"Sandwich", "Salad", "Bread", "Tomato", "Cheese"}};
		
		String [][] retArr = groupingDishes(dishes);
		for(String [] arr: retArr){
			for(String s : arr){
				System.out.print(s+" ");
			}
			System.out.println();
		}
		
		
	}

	static String[][] groupingDishes(String[][] dishes) {
		Map<String, List<String>> ingDishListMap = new HashMap<String, List<String>>();

		for (int i = 0; i < dishes.length; i++) {
			String[] dishIngList = dishes[i];
			String dish = dishIngList[0];
			for (int j = 1; j < dishIngList.length; j++) {
				String ingredient = dishIngList[j].toLowerCase();
				if (ingDishListMap.get(ingredient) != null) {
					List<String> returnedDishList = ingDishListMap.get(ingredient);
					returnedDishList.add(dish);
					Collections.sort(returnedDishList);
					ingDishListMap.put(ingredient, returnedDishList);
				} else {
					List<String> addList = new ArrayList<String>();
					addList.add(dish);
					ingDishListMap.put(ingredient, addList);
				}
			}
		}

		SortedSet<String> keys = new TreeSet<String>(ingDishListMap.keySet());
		String[][] returnArray = new String[ingDishListMap.size()][dishes.length];
		int i = 0;
		for (String key : keys) {
			if (ingDishListMap.get(key).size() >= 2) {
				List<String> dishList = ingDishListMap.get(key);
				dishList.add(0, key);
				int j = 0;
				for (String dish : dishList) {
					returnArray[i][j] = dish;
					j++;
				}
				i++;
			}
		}
		return returnArray;
	}

}
