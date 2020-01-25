package com.example.stacks;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;

public class StackIntegerLinkedList {

	public static void main(String[] args) {
		Deque stack = new ArrayDeque();
		
		stack.add(2);

		 java.util.Stack<Integer> lifo = new java.util.Stack<>();
	        lifo.push(new Integer(4));
	        lifo.push(new Integer(1));
	        lifo.push(new Integer(150));
	        lifo.push(new Integer(40));
	        lifo.push(new Integer(0));
	        lifo.push(new Integer(60));
	        lifo.push(new Integer(47));
	        lifo.push(new Integer(104));

	        if(!lifo.isEmpty()){
	            Object max = Collections.max(lifo);
	            System.out.println("max=" + max.toString());
	        }
	}

}
