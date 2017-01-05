package com.java.test.list;

/**
 * @author fcaa17922
 * Node class that holds the node values as well as the pointer to the next node
 *
 */
public class Node {
    int data;
    Node next;
    Node prev;
    
    public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	Node(int d) 
    {
    	data = d; 
    	next = null; 
    }
    
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
    
    
 
}
