package com.example.stacks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public  class ParenthesisPositionChecker {
	
	public static void main(String[] args) {
		
		Test test = new Test();
		test.test();
		Test1 test1 = new Test1();
		test1.test();
		//String parenthesisString = "Sometimes (when I nest them (my parentheticals) too much (like this (and this))) they get confusing.";
		String parenthesisString = "((((()))))";
		
//		String parenthesisString = "()()((()()))";
//		String parenthesisString ="()(()";
		int i = 2;
		
		//List<String> listOpenTagPositions = new ArrayList();
		//listOpenTagPositions.add("(");
		int position = 1;
		
		while(true) {
			int openTagPosition =parenthesisString.indexOf('(', i+1);
			int closeTagPosition =parenthesisString.indexOf(')', i+1);
			
			if(openTagPosition == closeTagPosition){
				System.out.println(-1);
				throw new IllegalArgumentException("No closing tag existed");
//				break;
			}else if(openTagPosition==-1 || openTagPosition > closeTagPosition) {
				position--;
				//listOpenTagPositions.remove("(");
				//if(listOpenTagPositions.isEmpty()) {
				if(position==0) {
					System.out.println(closeTagPosition);
					break;
				}else {
					i = closeTagPosition;
				}
			}else if(openTagPosition < closeTagPosition) {
//				listOpenTagPositions.add("(");
				position++;
				i = openTagPosition;
			}
			
			
		}

	}

}
