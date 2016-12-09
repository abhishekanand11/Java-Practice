package com.java.test.list;

public class RemoveDuplicatesInAList {
	/**
	 * remove duplicates from a list
	 * There are many ways to do this :
	 * 	Either cast it to a set OR 
	 * 	initialize  empty sets and lists and start traversing the given list 
	 * 	and check if its there in
	 * 	the set if there then move to next if not then add it to the set and return the set finally.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				LinkedList llist = new LinkedList();
				 
		        /* Use push() to construct below list
		        1->4->1->12->1->13  */
		        llist.push(1);
		        llist.push(4);
		        llist.push(1);
		        llist.push(12);
		        llist.push(1);
		        llist.push(13);
		 
		        System.out.println("Before removing duplicates");
		        llist.printList();
		        
		        llist.removeDuplicates();
		        System.out.println("\nLinked List after removing duplicates");
		        llist.printList();
		        
		        
		

	}

}
