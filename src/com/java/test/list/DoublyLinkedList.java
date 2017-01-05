package com.java.test.list;

/**
 * This is a doubly linked list class used to create a linked list and hold all the values
 * @author fcaa17922
 *
 */
public class DoublyLinkedList {
	Node head;
	//Node tail;
	Node root;
	static int size = 0;
	
	
	public void push(int data){
		Node new_Node = new Node(data);
		if(head == null){
			head = new_Node;
			head.prev = null;
		} else{
			Node temp = head;
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = new_Node;
			new_Node.prev = temp;
		}
		size++;
	}
	
	public Node dLLtoBST(){
		return dLLtoBST(size);
	}
	
	public Node dLLtoBST(int size) {
		if (size <= 0) {
			return null;
		}
		Node left = dLLtoBST(size / 2);
		Node root = head;
		root.prev = left;
		head = head.next;
		root.next = dLLtoBST(size-(size / 2)-1);
		return root;
	}
	
	public void inOrder(Node root) {
		if (root != null) {
			inOrder(root.prev);
			System.out.print(" " + root.data);
			inOrder(root.next);
		}
	}
	
	public void printDLL() {
		Node curr = head;
		while (curr != null) {
			System.out.print(" " + curr.data);
			curr = curr.next;
		}
		System.out.println();
	}

}
