package com.example.test;

import java.util.Arrays;
import java.util.Comparator;

public class InnerClass {

	public static void main(String[] args) {
		String[] sa = {"nickel", "button", "lint", "key"};
		for (String string : sa) {
			System.out.print(string+"\t");
		}
		System.out.println();
		Compare compare = new Compare();
		Arrays.sort(sa, compare);
		for (String string : sa) {
			System.out.print(string+"\t");
		}
		
	}
	
	static class Compare implements Comparator<String>{
		
		public int compare(String a, String b) {
			return b.compareTo(a);
		}
	}

}

class Compare1 implements Comparator<String>{
	
	public int compare(String a, String b) {
		return b.compareTo(a);
	}
}
