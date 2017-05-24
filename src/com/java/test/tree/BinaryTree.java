package com.java.test.tree;


/**
 * The Binary Tree class that holds the node and leaves
 * @author abhishekanand
 *
 */
public class BinaryTree {
	//Root of the Binary Tree
	public Node root;
	
	public BinaryTree(){
		root = null;
	}
	
	public static int height(Node node) {
		if (node == null) {
			return 0;
		}
		return 1 + Math.max(height(node.left), height(node.right));
	}
	
}
