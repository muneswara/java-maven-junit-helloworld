package com.example.random;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class ContactSearch {

	private static int ALPHABETS_SIZE = 26;
	private static Node rootNode;

	private static class Node{
        private Node[] childNodes = new Node[ALPHABETS_SIZE];
        private boolean isWord;
        private int count;
        
        private Node(){
            isWord = false;
            count=0;
            for(int i=0; i<ALPHABETS_SIZE; i++){
                childNodes[i]=null;
            }
        }
    }
    
    private static void add(String name){
        int length = name.length();
        Node navigationNode = rootNode;
        int index;
        for(int i=0; i<length; i++){
            index = name.charAt(i)-'a';
            if(navigationNode.childNodes[index]==null){
                navigationNode.childNodes[index]= new Node();
            }
            navigationNode.count++;
            navigationNode = navigationNode.childNodes[index];
        }
        navigationNode.isWord = true;
        navigationNode.count++;
    }
    
    private static int find(String name){
        int length = name.length();
        Node navigationNode = rootNode;
        int index;
        for(int i=0; i<length; i++){
            index = name.charAt(i)-'a';
            if(navigationNode.childNodes[index]==null){
                return 0;
            }
            navigationNode = navigationNode.childNodes[index];
        }
        return navigationNode.count;
        //return findCount(navigationNode, navigationNode.isWord?1:0);
    }

	private static int findCount(Node node, int currentCount) {
		int count = currentCount;

		for (int i = 0; i < ALPHABETS_SIZE; i++) {
			if (node.childNodes[i] != null) {
				if (node.childNodes[i].isWord) {
					count++;
				}
				count += findCount(node.childNodes[i], 0);
			}
		}
		return count;
	}

	/*
	 * Complete the contacts function below.
	 */
	static int[] contacts(String[][] queries) {
		List<Integer> list = new ArrayList();

		for (int i = 0; i < queries.length; i++) {
			String[] tuple = queries[i];
			if (tuple[0].equals("add")) {
				add(tuple[1]);
			}

			if (tuple[0].equals("find")) {
				list.add(find(tuple[1]));
			}
		}
		int[] array = new int[list.size()];
		int index = 0;
		for (Integer i : list) {
			array[index++] = i;
		}
		return array;
	}

	public static void main(String[] args) {
		// Input keys (use only 'a' through 'z' and lower case) 
        String keys[] = {"the", "a", "there", "answer", "any", 
                         "by", "bye", "their","hack","hacker","star"}; 
       
        String output[] = {"Not present in trie", "Present in trie"}; 
       
       
        rootNode = new Node(); 
       
        // Construct trie 
        int i; 
        for (i = 0; i < keys.length ; i++) 
            add(keys[i]); 
       
        // Search for different keys 
            System.out.println("the --- " + find("the")); 
            System.out.println("these --- " + find("these")); 
            System.out.println("their --- " + find("their")); 
            System.out.println("hac --- " + find("hac")); 
        

	}
}
