package com.java.test.tree;

/**
 * Class containing the left and right child of a node and the node value
 * @author abhishekanand
 *
 */
public class Node {
	    int key;
	    Node left, right;
	 
	    public Node(int item)
	    {
	        key = item;
	        left = right = null;
	    }
}
