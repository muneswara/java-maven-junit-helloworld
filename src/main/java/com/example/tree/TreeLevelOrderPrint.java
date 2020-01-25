package com.example.tree;

public class TreeLevelOrderPrint {

	public static void main(String[] args) {
		Node root =null;
		root= insertNode(root, 5);
		root= insertNode(root, 7);
		root= insertNode(root, 8);
		root= insertNode(root, 3);
		root= insertNode(root, 2);
		root= insertNode(root, 9);
		
		levelOrder(root);

	}
	
	private static class Node{
		int data;
		Node left;
		Node right;
		
		private Node(int data) {
			this.data = data;
			left=null;
			right=null;
		}
	}
	
	private static Node insertNode(Node node, int data) {
		if(node==null) {
			return new Node(data);
		}
		 
		Node currentNode;
		if(node.data> data) {
			currentNode = insertNode(node.left, data);
			node.left=currentNode;
		}else {
			currentNode = insertNode(node.right, data);
			node.right=currentNode;
		}
		
		return node;
	}
	
	public static void levelOrder(Node root) {
	      
        if(root==null){
            return;
        }
        int height = heightOfTheTree(root, 0);
        for(int i=0; i<=height; i++){
            printTreeLevelOrder(root, i+1);
        }
        
    }

    private static void printTreeLevelOrder(Node root, int level){
        
        if(root==null){
            return;
        }
        if(level==1){
            System.out.print(root.data+" ");
        }
        if(level>1){
            printTreeLevelOrder(root.left, level-1);
            printTreeLevelOrder(root.right, level-1);
        }
    }

    private static int heightOfTheTree(Node root, int height){
        if(root==null){
            return 0;
        }
        
        if(root.left==null && root.right==null){
            return height;
        }
        
        int leftHeight=height;
        int rightHeight=height;
        
        if(root.left!=null){
            leftHeight = heightOfTheTree(root.left, ++leftHeight);
        }
        
        if(root.right!=null){
            rightHeight = heightOfTheTree(root.right, ++rightHeight);
        }
        
        return leftHeight>rightHeight?leftHeight:rightHeight;
    }

}
