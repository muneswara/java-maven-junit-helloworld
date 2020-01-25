package com.example.tree;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidBinarySearchTreeChecker {

	public static void main(String[] args) {
		final BinaryTreeNode root = new BinaryTreeNode(50);
        final BinaryTreeNode a = root.insertLeft(30);
        a.insertLeft(10);
        a.insertRight(40);
        final BinaryTreeNode b = root.insertRight(70);
        b.insertLeft(60);
        b.insertRight(80);
        final boolean result = isBinarySearchTree(root);
        System.out.println(result);

	}
	
	 public static class BinaryTreeNode {

	        public int value;
	        public BinaryTreeNode left;
	        public BinaryTreeNode right;

	        public BinaryTreeNode(int value) {
	            this.value = value;
	        }

	        public BinaryTreeNode insertLeft(int leftValue) {
	            this.left = new BinaryTreeNode(leftValue);
	            return this.left;
	        }

	        public BinaryTreeNode insertRight(int rightValue) {
	            this.right = new BinaryTreeNode(rightValue);
	            return this.right;
	        }
	    }
	 
	 
	 /*private static class NodeBounds {

		    BinaryTreeNode node;
		    int lowerBound;
		    int upperBound;

		    NodeBounds(BinaryTreeNode node, int lowerBound, int upperBound) {
		        this.node = node;
		        this.lowerBound = lowerBound;
		        this.upperBound = upperBound;
		    }
		}*/

		/*public static boolean isBinarySearchTree(BinaryTreeNode root) {

		    // start at the root, with an arbitrarily low lower bound
		    // and an arbitrarily high upper bound
		    Deque<NodeBounds> nodeAndBoundsStack = new ArrayDeque<>();
		    nodeAndBoundsStack.push(new NodeBounds(root, Integer.MIN_VALUE, Integer.MAX_VALUE));

		    // depth-first traversal
		    while (!nodeAndBoundsStack.isEmpty()) {
		        NodeBounds nb = nodeAndBoundsStack.pop();
		        BinaryTreeNode node = nb.node;
		        int lowerBound = nb.lowerBound;
		        int upperBound = nb.upperBound;

		        // if this node is invalid, we return false right away
		        if (node.value <= lowerBound || node.value >= upperBound) {
		            return false;
		        }

		        if (node.left != null) {
		            // this node must be less than the current node
		            nodeAndBoundsStack.push(new NodeBounds(node.left, lowerBound, node.value));
		        }
		        if (node.right != null) {
		            // this node must be greater than the current node
		            nodeAndBoundsStack.push(new NodeBounds(node.right, node.value, upperBound));
		        }
		    }

		    // if none of the nodes were invalid, return true
		    // (at this point we have checked all nodes)
		    return true;
		}*/
	    
	    private static class NodeBounds{
	        BinaryTreeNode node;
	        int lowerBound;
	        int upperBound;
	        
	        private NodeBounds( BinaryTreeNode node, int lowerBound, int upperBound){
	            this.node = node;
	            this.lowerBound = lowerBound;
	            this.upperBound = upperBound;
	        }
	    }

	      public static boolean isBinarySearchTree(BinaryTreeNode root) {

	        // determine if the tree is a valid binary search tree
	        
	        Deque<NodeBounds> nodeAndBoundsStack = new ArrayDeque<>();
	        nodeAndBoundsStack.push(new NodeBounds(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
	        
	        while(!nodeAndBoundsStack.isEmpty()) {
	        	
	        	NodeBounds nodeBounds = nodeAndBoundsStack.pop();
	        	BinaryTreeNode node = nodeBounds.node;
	        	
	        	if(node.value <= nodeBounds.lowerBound || node.value >= nodeBounds.upperBound) {
	        		return false;
	        	}
	        	
	        	if(node.left!=null) {
	        		nodeAndBoundsStack.push(new NodeBounds(node.left, nodeBounds.lowerBound, node.value));
	        	}
	        	
	        	if(node.right!=null) {
	        		nodeAndBoundsStack.push(new NodeBounds(node.right, node.value, nodeBounds.upperBound));
	        	}
	        }
	        

	        return true;
	    }

}
