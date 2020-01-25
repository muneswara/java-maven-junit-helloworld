package com.example.random;

public class StringConversionToNumber {

	public static void main(String[] args) {

		String strNumber = new String("345640");
		int numConverted = 0; 
		for(int i=0; i<strNumber.length(); i++) {
			char numChar = strNumber.charAt(i);
			System.out.println(numChar);
			int num = numChar-'0';
			numConverted = numConverted*10 +num;
		}
		
		System.out.println(numConverted);
		System.out.println(String.valueOf('0'));
		System.out.println(Character.valueOf('0'));
		
		int kk='A';
		System.out.println(kk);
	}

}
