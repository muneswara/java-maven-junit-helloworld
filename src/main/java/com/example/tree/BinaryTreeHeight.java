package com.example.tree;

import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class BinaryTreeHeight {
	
	public static int height(Node root) {
      	// Write your code here.
        
        int max_count =0;
        if(root==null || (root.left==null && root.right==null)){
            return max_count;
        }
        return recursiveHeight(root, 0);
    }
    public static int recursiveHeight(Node node, int height){
        
        int leftHeight = height;
        int rightHeight = height;
        
        if(node.left!=null){
            leftHeight = recursiveHeight(node.left, ++leftHeight);
        }
        
        if(node.right!=null){
            rightHeight = recursiveHeight(node.right, ++rightHeight);
        }
        
        return leftHeight>rightHeight?leftHeight:rightHeight;
    }
	
    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = 5;
        Node root = null;
        int[] data = {3,1,7,5,4};
        while(t-- > 0) {
            root = insert(root, data[t]);
        }
        scan.close();
        int height = height(root);
        System.out.println(height);
    }

}

