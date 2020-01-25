package com.example.queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i=0; i<6; i++) {
			queue.add(i);
		}
		System.out.println("Size of the Queue : "+queue.size());
		System.out.println("Elements of Queue : "+queue);
		
		Integer removedElement = queue.remove();
		System.out.println("Removed element : "+removedElement);
		
		Integer peekedElement = queue.peek();
		System.out.println("Peeked element : "+peekedElement);
		
		Integer polledElement = queue.poll();
		System.out.println("Polled element : "+polledElement);
		
		Integer element = queue.element();
		System.out.println("element : "+element);
		
		System.out.println("Is Queue Empty : "+queue.isEmpty());
		System.out.println("Size of the Queue : "+queue.size());
		System.out.println("Elements of Queue : "+queue);
	}

}
