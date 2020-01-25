/**
 * 
 */
package com.example.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author Muneswararao
 *
 */
public class BalancedBinaryTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final BinaryTree root = new BinaryTree(5);
        final BinaryTree a = root.insertLeftNode(8);
        final BinaryTree b = root.insertRightNode(6);
        a.insertLeftNode(1);
        a.insertRightNode(2);
        b.insertLeftNode(3);
        b.insertLeftNode(4);
        final boolean result = isBalancedTree(root);
        
        System.out.println("Result :: "+result);
//        assertTrue(result);

	}
	
	
	public static class BinaryTree{
		public BinaryTree leftNode;
		public BinaryTree rightNode;
		public int value;
		
		public BinaryTree(int value) {
			this.value = value;
		}
		
		public BinaryTree insertLeftNode(int leftValue) {
			this.leftNode = new BinaryTree(leftValue);
			return this.leftNode;
		}
		
		public BinaryTree insertRightNode(int leftValue) {
			this.rightNode = new BinaryTree(leftValue);
			return this.rightNode;
		}
	}
	
	public static class NodeDepthPair {
		public int depth;
		public BinaryTree binaryTree;
		
		public NodeDepthPair(int depth, BinaryTree binaryTree) {
			this.binaryTree = binaryTree;
			this.depth = depth;
		}
	}
	
	public static boolean isBalancedTree(BinaryTree rootNode) {
		
		if(rootNode==null) {
			return true;
		}
		
		Deque<NodeDepthPair> que = new ArrayDeque<NodeDepthPair>();
		List<Integer> listDepths = new ArrayList<Integer>();
		
		que.push(new NodeDepthPair(0, rootNode));
		
		if(!que.isEmpty()) {
			
			NodeDepthPair pair = que.pop();
			BinaryTree treeNode = pair.binaryTree;
			int depth = pair.depth;
			
			if(treeNode.leftNode==null || treeNode.rightNode == null) {
				if(!listDepths.contains(depth)) {
					listDepths.add(depth);
					
					if(listDepths.size()>2 || (listDepths.size()==2 && (Math.abs(listDepths.get(0)-listDepths.get(1))>1))) {
						return false;
					}
				}
			}else {
				
				if(treeNode.leftNode!=null) {
					que.push(new NodeDepthPair(depth+1, treeNode.leftNode));
				}
				
				if(treeNode.rightNode!=null) {
					que.push(new NodeDepthPair(depth+1, treeNode.rightNode));
				}
			}
			
		}
		
		return true;
	}

}
