package com.example.stacks;

public class StackUsingArrays {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(400);
		stack.push(500);
		stack.push(600);
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		stack.pop();
		

	}

}

class Stack{
	
	int MAX_SIZE =5;
	int top=-1;
	int[] arrayStack = new int[MAX_SIZE];
	
	public boolean push(int element) {
		if(top>=MAX_SIZE-1) {
			System.out.println("Stack Overflows");
			return false;
		}
		
		arrayStack[++top] = element;
		return true;
	}
	
	public int pop() {
		if(top<0) {
			System.out.print("Stack Underflows");
			return -1;
		}
		
		return arrayStack[top--];
	}
	
	public boolean isEmpty() {
		return top<0;
	}
	
}
