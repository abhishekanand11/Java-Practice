package com.java.test.list;

public class LinkedListToBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.push(1);
		dll.push(2);
		dll.push(3);
		dll.push(4);
		dll.push(5);
		dll.push(6);
		dll.push(7);
		dll.push(8);
		dll.push(9);

		System.out.println("DLL is : ");
		dll.printDLL();
		
		Node root = dll.dLLtoBST();
		System.out.println("Inorder traversal of contructed BST");
		dll.inOrder(root);
	}

}
