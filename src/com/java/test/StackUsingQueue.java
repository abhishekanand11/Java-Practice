package com.java.test;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(1);
		q.add(2);
		System.out.println(pop(q));
		q.add(3);
		q.add(4);
		
		System.out.println(pop(q));
		System.out.println(pop(q));
		System.out.println(pop(q));
		

	}

	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	static int pop(Queue queue){
		if(queue.isEmpty()){
			return 0;
		}
		int queuLen = queue.size();
		if(queuLen > 0){
			for(int i = 1; i < queuLen; i++){
				queue.add((int) queue.remove());
			}
		}
		return (int)queue.remove();
	}
	
	/**
	static void push(Queue queue, int input){
		queue.add(input);
	}
	*/
}

