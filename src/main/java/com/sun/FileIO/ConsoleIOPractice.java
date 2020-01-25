package com.sun.FileIO;

import java.io.Console;

public class ConsoleIOPractice {

	public static void main(String[] args) {
		Console  console = System.console();
		char[] pw ;
		pw = console.readPassword("%s", "pw: ");

		for(char p: pw) {
			System.out.println(p);
		}
	}

}
