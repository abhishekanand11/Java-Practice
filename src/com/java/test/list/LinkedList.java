package com.java.test.list;

/**
 * @author fcaa17922 
 * Linked list class that holds all the custom definitions for
 * linked list
 *
 */
public class LinkedList {

	Node head; // head of the list

	/*
	 * Given a reference to the head of a list and an int, inserts a new Node on
	 * the front of the list.
	 */
	public void push(int new_data) {
		/* 1. alloc the Node and put the data */
		Node new_Node = new Node(new_data);
		
		if(head == null){
			head = new_Node;
		} else {
			Node temp = head;
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = new_Node;
		}
		/* 2. Make next of new Node as head */
		//new_Node.next = head;

		/* 3. Move the head to point to new Node */
		//head = new_Node;

	}

	/**
	 * This function prints contents of linked list starting from the given Node
	 */
	public void printList() {
		Node tNode = head;
		while (tNode != null) {
			System.out.print(tNode.data + " ");
			tNode = tNode.next;
		}
	}

	/**
	 * The logic of deleting a given node Valid for singly linked list
	 * 
	 * @param Node_ptr
	 */
	public void deleteNode(Node Node_ptr) {
		Node temp = Node_ptr.next;
		Node_ptr.data = temp.data;
		Node_ptr.next = temp.next;
		temp = null;
	}

	/**
	 * Used to find the middle element of a singly linked list
	 * @return Node - slow_ptr
	 */
	public Node findMiddle() {
		Node slow_ptr = head;
		Node fast_ptr = head;
		if (head != null) {
			while (fast_ptr != null && fast_ptr.next != null) {
				fast_ptr = fast_ptr.next.next;
				slow_ptr = slow_ptr.next;
			}
		}
		return slow_ptr;
	}
	
	 /* Function to remove duplicates from a unsorted linked list */
    public Node remove_duplicates() {
        Node ptr1 = null, ptr2 = null, dup = null;
        ptr1 = head;
 
        /* Pick elements one by one */
        while (ptr1 != null && ptr1.next != null) {
            ptr2 = ptr1;
 
            /* Compare the picked element with rest of the elements */
            while (ptr2.next != null) {
 
                /* If duplicate then delete it */
                if (ptr1.data == ptr2.next.data) {
 
                    /* sequence of steps is important here */
                    dup = ptr2.next;
                    ptr2.next = ptr2.next.next;
                    System.gc();
                } else /* This is tricky */ {
                    ptr2 = ptr2.next;
                }
            }
            ptr1 = ptr1.next;
        }
        return ptr1;
    }

}
