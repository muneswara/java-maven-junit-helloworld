package com.example.random;

public class HanoiProblem {

	public static void main(String[] args) {
		System.out.println("Hanoi Problem - Solution directions : ");
		
		/*String sol = hanoi(5, 1, 3);
		
		String[] instructions = sol.split(";");
		System.out.println("Number of Moves : "+instructions.length);
		for(String solIns: instructions) {
			System.out.println(solIns);
		}*/
		
		hanoiRecursion(2, "A", "B", "C");
		System.out.println("Moves Count : "+movesCount);
	}
	
	private static String hanoi(int noOfDisks, int sourcePole, int targetPole) {
		
		if(noOfDisks==1) {
			return sourcePole+"   -->  "+ targetPole +";";
		}
		
		String sol1, sol2, sol3;
		int helpPole = 6 - sourcePole - targetPole;
		
		sol1 = hanoi(noOfDisks-1, sourcePole, helpPole);
		sol2 = sourcePole+"   -->  "+targetPole +";";
		sol3 = hanoi(noOfDisks-1, helpPole, targetPole);
		
		return sol1+sol2+sol3;
	}
	
	private static int movesCount=0;
	private static void hanoiRecursion(int n, String a, String b, String c) {
		if(n==1) {
			System.out.println(a +" --> "+c);
			movesCount++;
			return;
		}
		
		hanoiRecursion(n-1, a, c, b);
		System.out.println(a +" --> "+c);
		movesCount++;
		hanoiRecursion(n-1, b, a, c);
	}

}
