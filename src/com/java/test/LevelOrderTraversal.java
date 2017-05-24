package com.java.test;

import com.java.test.tree.BinaryTree;
import com.java.test.tree.Node;

public class LevelOrderTraversal {
	
	/* A Binary Tree node */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();
	       tree.root= new Node(1);
	       tree.root.left= new Node(3);
	       tree.root.right= new Node(2);
	       tree.root.left.left= new Node(4);
	       tree.root.left.right= new Node(5);
	        
	       System.out.println("Level order traversal of binary tree is ");
	       printLevelOrderTraversal(tree);;
		
		
		

	}

	
	static void printGivenLevel(Node root, int level){
		if(root == null){
			return;
		}
		if(level == 1){
			System.out.println(root.key+ " ");
		}else if(level > 1){
			printGivenLevel(root.left, level-1);
			printGivenLevel(root.right, level-1);
		}
		
	}
	
	static void printLevelOrderTraversal(BinaryTree tree){
		int h = BinaryTree.height(tree.root);
		for(int i =1; i <= h; i++){
			printGivenLevel(tree.root, i);
		}
	}
}
