package com.java.test;

public class SumOfTreeAtALevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tree = "(0(5(6()())(14()(9()())))(7(1()())(23()())))";
		System.out.println(treeLevelSum(tree, 2));

	}
	
	static int treeLevelSum(String tree, int k) {
	    int sum = 0;
	    int level=-1;
	    char [] charArray = tree.toCharArray();

	    for(int i=0; i< charArray.length; i++){
	    	if(level == k){
	    		int countTemp = 0;
	    		StringBuffer sb = new StringBuffer(0);
	    		boolean flag = true;
				try {
					while (flag) {
						if (charArray[i + countTemp] == '(') {
							level++;
							break;
						} else if (charArray[i + countTemp] == ')') {
							level--;
							break;
						} else {
							int a = Integer.parseInt(String.valueOf(charArray[i + countTemp]));
							sb.append(String.valueOf(a));
							countTemp++;
						}
					}
				} catch(Exception e){
	    			flag = false;
	    		}
				sum = sum + Integer.valueOf(sb.toString().equals("") ? "0" : sb.toString());
				i = i + countTemp;
	    	}
	    	else if(charArray[i] == '('){
	    		level++;
	    	}else if(charArray[i] == ')'){
	    		level--;
	    	}
	    }
	    
		return sum;
	}

}
