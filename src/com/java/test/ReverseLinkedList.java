package com.java.test;

/**
 * This class is used to reverse a linked list
 * 
 * @author abhishek anand
 *
 */
public class ReverseLinkedList {
	class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;
		}
	}

	// This function should reverse linked list and return
	// head of the modified linked list.
	Node reverse(Node head) {
		// add code here
		Node prev = null;
		Node curr = head;
		Node next = null;

		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
		return head;
	}

}
