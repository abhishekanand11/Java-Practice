package com.java.test;



/**
 * @author abhishek anand
 * This class is used to calculate the Height of a Binary tree using recursive method
 *
 */
public class HeightOfBinaryTree {

	/* A Binary Tree node */
	class Node {
		int data;
		Node left, right;

		Node(int item) {
			data = item;
			left = right = null;
		}
	}

	int height(Node node) {
		if (node == null) {
			return 0;
		}
		return 1 + Math.max(height(node.left), height(node.right));
	}
}
