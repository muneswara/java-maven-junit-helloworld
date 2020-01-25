package com.example.stacks;

public class StackImplWithLinkedList {

	public static void main(String[] args) {
		LinkListStack  stack = new LinkListStack();
		stack.push(100);
		stack.push(200);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		next = null;
	}
}

class LinkList{
	Node first =null;
	
	void insertFirst(int data){
		Node node = new Node(data);
		node.next = first;
		first = node;
	}
	
	int removeFirst() {
		int temp = first.data;
		first = first.next;
		return temp;
	}
	
	boolean isEmpty() {
		return first==null;
	}
	
	void display(){
		Node current = first;
		
		while(current!=null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
}

class LinkListStack {
	LinkList stack = new LinkList();
	
	void push(int data){
		stack.insertFirst(data);
	}
	
	int pop() {
		if(!stack.isEmpty()) {
			return stack.removeFirst();
		}
		return -1;
	}
	
	void display() {
		stack.display();
	}
}
