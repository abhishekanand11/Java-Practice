package com.java.test;

import java.util.Stack;

//Used to test the min no from a stack;
public class MinNumberFromStack
{
    int minEle;
    Stack<Integer> s;
    public MinNumberFromStack(){
        s = new Stack<Integer>();
    }
    /*returns min element from stack*/
    int getMin()
    {
	// Your code here
    	if(s.isEmpty()){
    		return -1;
    	} else{
    		return minEle;
    	}
    	
    }
    
    /*returns poped element from stack*/
    int pop()
    {
	// Your code here
    	if(s.isEmpty()){
    		return -1;
    	}
    	Integer i = s.pop();
    	Integer j = i;
    	if(i < minEle){
    	    j = minEle;
    		minEle = 2*minEle - i;
    	}
    	return j;
    }

    /*push element x into the stack*/
    void push(int x)
    {
	// Your code here
    	if(s.isEmpty()){
    		minEle = x;
    		s.push(x);
    		return;
    	}
    	if(x < minEle){
    		s.push(2*x-minEle);
    		minEle = x;
    	}
    	else{
    		s.push(x);
    	}
    }	
}