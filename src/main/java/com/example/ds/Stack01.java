package com.example.ds;

import java.util.Stack;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Stack01 {

	/*public static void main(String[] args) {
		Stack<Character> stackChar;

	}*/




    // Complete the isBalanced function below.
	static String isBalanced(String s) {
		if (s == null || s.isEmpty()) {
			return "YES";
		}
		// s=s.trim();
		Stack<Character> stackChar = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char charAt = s.charAt(i);
			if (charAt == '(' || charAt == '[' || charAt == '{') {
				stackChar.push(charAt);
				continue;
			}

			if (charAt == ')') {
				if (stackChar.isEmpty() || stackChar.pop() != '(') {
					return "NO";
				}
			}

			if (charAt == '}') {
				if (stackChar.isEmpty() || stackChar.pop() != '{') {
					return "NO";
				}
			}

			if (charAt == ']') {
				if (stackChar.isEmpty() || stackChar.pop() != '[') {
					return "NO";
				}
			}
		}

		return stackChar.isEmpty() ? "YES" : "NO";
	}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

