package com.example.random;

import java.util.HashMap;

public class NumberOfSubsets {

	public static void main(String[] args) {
		int[] a = {2,4,6,10};
		int total =16;
		System.out.println(count(a, total));

	}

	private static int count(int[] a, int total) {
//		return recursiveCount(a, total, a.length-1);
		return recursiveMemoizeCount(a,total, a.length-1, new HashMap<String, Integer>());
		
	}

	private static int recursiveCount(int[] a, int total, int i) {
		if(total==0) {return 1;}
		if(total<0) {return 0;}
		if(i<0) {return 0;}
		
		if(total<a[i]) {
			return recursiveCount(a, total, i-1);
		}else {
			return recursiveCount(a, total-a[i], i-1) + 
					recursiveCount(a, total, i-1);
		}
		
	}
	
	private static int recursiveMemoizeCount(int[] a, int total, int i, HashMap<String, Integer> hm) {
		
		String key = total+"-"+i;
		if(hm.containsKey(key)) {
			return hm.get(key);
		}
		
		if(total==0) {return 1;}
		if(total<0) {return 0;}
		if(i<0) {return 0;}
		
		int result=0;
		if(total<a[i]) {
			result = recursiveMemoizeCount(a, total, i-1, hm);
		}else {
			result = recursiveMemoizeCount(a, total-a[i], i-1, hm) + 
					recursiveMemoizeCount(a, total, i-1, hm);
		}
		
		hm.put(key, result);
		return result;
	}
	
	

}
