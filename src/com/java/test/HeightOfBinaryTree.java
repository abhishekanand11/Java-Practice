package com.java.test;



public class HeightOfBinaryTree {

	/* A Binary Tree node*/
	class Node
	{
	    int data;
	    Node left, right;

	    Node(int item)
	    {
	        data = item;
	        left = right = null;
	    }
	} 

	    int height(Node node) 
	    {
	         // Your code here
	         if(node == null){
	             return 0;
	         }
	         return 1 + Math.max(height(node.left), 
	         height(node.right));
	    }   
}
