package com.example.random;

import java.util.ArrayList;
import java.util.List;

public class Java1 {

	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList();
		list.add(1);
		list.add(4);
        System.out.println("List : "+list);
        
		//System.out.println(gcd(8,4));
		//System.out.println(gcd(2,4));
		System.out.println(gcd(7,4));
		//System.out.println(gcd(2,3));
		//System.out.println(gcd(3,7));

	}
	
	public static int gcd(int a, int b) {
		
		if(a==0) {
			return b;
		}else {
			int a2 = b%a;
			return gcd(a2, a);
		}
		
	}

}
