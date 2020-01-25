package com.example.test;

public class RandomNumberGenerator {

	public static void main(String[] args) {

		for(int i=0; i<5; i++) {
		int luckyNumber = (int) (Math.random()*3+1);
		System.out.println(luckyNumber);
		}

	}

}
