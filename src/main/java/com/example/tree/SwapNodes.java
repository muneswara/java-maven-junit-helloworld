package com.example.tree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SwapNodes {


	    /*
	     * Complete the swapNodes function below.
	     */
	    static int[][] swapNodes(int[][] indexes, int[] queries) {
	        /*
	         * Write your code here.
	         */
	        int numOfNodes = indexes[0][0];
	        Node[] nodes = new Node[numOfNodes];
	        Node root = new Node(1);
	        nodes[0] = root;
	        
	        for (int i = 1; i < numOfNodes; i++) {
	            nodes[i] = new Node(i);
	        }
	        
	        for(int i =1; i< numOfNodes; i++){
	            int leftData = indexes[i][0];
	            int rightData = indexes[i][1];
	            if(leftData!=-1){
	                //Node leftNode = new Node(leftData);
	                nodes[i-1].left =nodes[leftData-1];
	               // nodes[leftData-1] = leftNode;
	            }
	            
	            if(rightData!=-1){
	               // Node rightNode = new Node(rightData);
	                nodes[i-1].right =nodes[rightData-1];
	                //nodes[rightData-1] = rightNode;
	            }
	        }
	        
	        int queriesCount = queries[0];
	        int[][] finalArray = new int[queriesCount-1][numOfNodes]; 
	        
	        for (int i=1; i<queriesCount; i++){
	            swap(root, queries[i], 1);
	            int[] afterSwap = new int[numOfNodes]; 
	            Node.inOrderTraverse(root, afterSwap);
	            finalArray[i-1] = afterSwap;
	        }
	        return finalArray;
	    }
	    
	    static void swap(Node node, int depth, int level){
	        if(node == null){
	            return;
	        }
	        
	        if(level%depth==0){
	            Node temp = node.left;
	            node.left = node.right;
	            node.right = temp;
	        }
	        
	        swap(node.left, depth, level+1);
	        swap(node.right, depth, level+1);
	    }
	    
	    static class Node{
	        private int data;
	        private Node left;
	        private Node right;
	        static int count =0;
	        
	        Node(int data){
	            this.data = data;
	            left = null;
	            right = null;
	        }
	        
	       static void inOrderTraverse(Node node, int[] nodesArray){
	            if(node==null){
	                return;
	            }
	           inOrderTraverse(node.left, nodesArray);
	           System.out.print(node.data+" ");
	           nodesArray[count++] = node.data;
	           inOrderTraverse(node.right, nodesArray);
	        }
	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	    	int[][] indexes = new int[4][2];
	    	int[] queries = new int[2];
	    	
	    	indexes[0][0] =3;
	    	indexes[1][0] =2;
	    	indexes[1][1] =3;
	    	indexes[2][0] =-1;
	    	indexes[2][1] =-1;
	    	indexes[3][0] =-1;
	    	indexes[3][1] =-1;
	    	
	    	queries[0] =2;
	    	queries[1] =1;
	    	
	    	int[][] afterSwap =swapNodes(indexes, queries);
	    	System.out.println(afterSwap[0][0]);
	    	
	    	/*
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//	    	Scanner scanner = new Scanner(System.in);
	        int n = Integer.parseInt(scanner.nextLine().trim());

	        int[][] indexes = new int[n][2];

	        for (int indexesRowItr = 0; indexesRowItr < n; indexesRowItr++) {
	            String[] indexesRowItems = scanner.nextLine().split(" ");

	            for (int indexesColumnItr = 0; indexesColumnItr < 2; indexesColumnItr++) {
	                int indexesItem = Integer.parseInt(indexesRowItems[indexesColumnItr].trim());
	                indexes[indexesRowItr][indexesColumnItr] = indexesItem;
	            }
	        }

	        int queriesCount = Integer.parseInt(scanner.nextLine().trim());

	        int[] queries = new int[queriesCount];

	        for (int queriesItr = 0; queriesItr < queriesCount; queriesItr++) {
	            int queriesItem = Integer.parseInt(scanner.nextLine().trim());
	            queries[queriesItr] = queriesItem;
	        }

	        int[][] result = swapNodes(indexes, queries);

	        for (int resultRowItr = 0; resultRowItr < result.length; resultRowItr++) {
	            for (int resultColumnItr = 0; resultColumnItr < result[resultRowItr].length; resultColumnItr++) {
	                bufferedWriter.write(String.valueOf(result[resultRowItr][resultColumnItr]));

	                if (resultColumnItr != result[resultRowItr].length - 1) {
	                    bufferedWriter.write(" ");
	                }
	            }

	            if (resultRowItr != result.length - 1) {
	                bufferedWriter.write("\n");
	            }
	        }

	        bufferedWriter.newLine();

	        bufferedWriter.close();
*/	    }
	}
