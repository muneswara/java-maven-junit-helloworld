package com.example.random;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		System.out.println(isPrime(2));
		System.out.println(isPrime(3));
		System.out.println(isPrime(4));
		System.out.println(isPrime(5));

	}

	private static boolean isPrimeBruteForce(int n) {
int i = 2%5;
int j=5%2;

	    int highestPossibleFactor = (int) Math.sqrt(n);

	    for (int potentialFactor = 2;
	            potentialFactor <= highestPossibleFactor;
	            potentialFactor++) {

	        if (n % potentialFactor == 0) {
	            return false;
	        }
	    }
	    return true;
	}

	public static boolean isPrime(int n) {
	    return isPrimeBruteForce(n);
	}
}


