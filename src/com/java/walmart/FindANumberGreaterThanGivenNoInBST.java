package com.java.walmart;

import com.java.test.tree.BinaryTree;
import com.java.test.tree.Node;


public class FindANumberGreaterThanGivenNoInBST {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();
        tree.root = new Node(15);
        tree.root.left = new Node(10);
        tree.root.right = new Node(20);
        tree.root.left.left = new Node(6);
        tree.root.left.right = new Node(12);
        tree.root.right.left = new Node(17);
        
        System.out.println(findNextGreater(tree.root, 5, Integer.MIN_VALUE));
        

		
	}
	
	static int findNextGreater(Node root, int value, int max){
		if(root == null){
			return max;
		}
		if(root.key > value){
			max = root.key;
			 return findNextGreater(root.left, value, max);
		}else if(root.key <= value){
			 return findNextGreater(root.right, value, max);
		}
		return max;
	}

}
