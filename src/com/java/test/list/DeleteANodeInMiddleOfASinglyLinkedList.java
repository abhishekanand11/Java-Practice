package com.java.test.list;

/**
 * @author fcaa17922
 * Given a singly linked list delete the middle element of the linked list
 *
 */
public class DeleteANodeInMiddleOfASinglyLinkedList {
	
	/**
	 * 
	 * The idea is that since it is a singly lined list hence we can only proceed in one direction
	 * So we can take two approaches : 
	 * 	1. Traverse the whole list and find the length of the list and then traverse to length/2 and 
	 * 		copy the contents of the node next to the middle node in the middle node. Then delete the
	 * 		next node. In this process we will store the next node in a temp node and copy the contents
	 * 		of the temp node to the middle node after that update the next pointer to next of temp node.
	 * 
	 *  2. The second method is use two pointers. Move one pointer by one and the other by two. This way 
	 *  	when fast pointer has reached end the slow pointer would have reached middle element. Then follow 
	 *  	the same process of copying and deleting as in first process.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList llist = new LinkedList();
		 
        /* Use push() to construct below list
        1->12->1->4->1  */
        llist.push(1);
        llist.push(4);
        llist.push(1);
        llist.push(12);
        llist.push(1);
        llist.push(13);
 
        System.out.println("Before deleting");
        llist.printList();
 
        /* First we need to find the middle node. 
         * In case the linked list is even in size the second node of the two nodes is returned 
         * as the middle node. Can change the logic accordingly.
         * then pass it to the delete node method 
         * */
        Node middleNode = llist.findMiddle();
        llist.deleteNode(middleNode);
 
        System.out.println("\nAfter Deleting");
        llist.printList();

	}
	
	

}
