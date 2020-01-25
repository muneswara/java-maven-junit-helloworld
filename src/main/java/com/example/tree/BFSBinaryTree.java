package com.example.tree;



public class BFSBinaryTree {

	public static void main(String[] args) {
		Node root = null;
		
		root= insertNode(root, 7);
		root= insertNode(root, 8);
		root= insertNode(root, 3);
		root= insertNode(root, 2);
		root= insertNode(root, 9);
		
		traverseTree(root);

	}
	
	private static class Node{
		int data;
		Node left;
		Node right;
		
		private Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
		
	}

	private static Node insertNode(Node node, int data) {
		if(node==null) {
			return new Node(data);
		}
		
		Node currentNode;
		if(node.data >= data) {
			currentNode = insertNode(node.left, data);
			node.left = currentNode;
		}else if(node.data < data) {
			currentNode = insertNode(node.right, data);
			node.right = currentNode;
		}
		
		return node;
	}
 
	private static int findHeightOfTree(Node root, int height) {
		if(root.left==null && root.right==null) {
			return height;
		}
		
		int leftTreeHeight = height;
		int rightTreeHeight = height;
		
		if(root.left!=null) {
			leftTreeHeight = findHeightOfTree(root.left, ++leftTreeHeight);
		}
		
		if(root.right!=null) {
			rightTreeHeight = findHeightOfTree(root.right, ++rightTreeHeight);
		}
		
		return leftTreeHeight > rightTreeHeight ? leftTreeHeight : rightTreeHeight;
	}

	private static void traverseTree(Node root) {
		int height = findHeightOfTree(root, 1);
		
		for(int index=0; index<height; index++) {
			traverseNodesAtleve(root, index+1);
		}
		
	}

	private static void traverseNodesAtleve(Node root, int index) {
		
		if(root==null) {
			return;
		}
		
		if(index==1) {
			System.out.println(root.data);
		}
		
				
		if(index>1) {
			traverseNodesAtleve(root.left, index-1);
			traverseNodesAtleve(root.right, index-1);
		}
	}
}
