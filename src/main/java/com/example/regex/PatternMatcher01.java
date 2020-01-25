package com.example.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher01 {

	public static void main(String[] args) {

		negateCharMatch();
		multiCharMatch();
		simpleMatch();
		literalMatch();
		groupCharMatch();
	}
	
	private static void negateCharMatch() {
		Pattern p = Pattern.compile("proj1([^,])*");
		Matcher matcher = p.matcher("proj3.txt,proj1sched.pdf,proj1,proj2,proj1.java");
		while(matcher.find()) {
			System.out.println(matcher.start()+"  "+matcher.group());
		}
		System.out.println();
	}
	
	private static void multiCharMatch() {
		Pattern p = Pattern.compile("\\d");
		Matcher matcher = p.matcher("1 ab88 456c");
		while(matcher.find()) {
			System.out.println(matcher.start()+"  "+matcher.group());
		}
		System.out.println();
		
		 p = Pattern.compile("\\w");
		 matcher = p.matcher("ab456_7ab");
		while(matcher.find()) {
			System.out.println(matcher.start()+"  "+matcher.group());
		}
		System.out.println();	
		System.out.println();	
		p = Pattern.compile("\\d*");
		Matcher m = p.matcher("ab34ef");
		boolean b = false;
		while(b = m.find()) {
		System.out.println(" ------- ::: "+m.start() + m.group());
		}System.out.println();	
		System.out.println();	
		
		String s = "-";
		Integer x = 343;
		long L343 = 343L;
		if(x.equals(L343)) s += ".e1 ";
		if(x.equals(343)) s += ".e2 ";
		Short s1 = (short)((new Short((short)343)) / (new Short((short)49)));
		if(s1 == 7) s += "=s ";
		if(s1 < new Integer(7+1)) s += "fly ";
		System.out.println(s);
	}

	private static void simpleMatch() {
		Pattern p = Pattern.compile("aba");
		Matcher matcher = p.matcher("bbbaabababbbababa");
		while(matcher.find()) {
			System.out.println(matcher.start());
		}
		System.out.println();
	}
	
	private static void literalMatch() {
		Pattern p = Pattern.compile("\\d");
		Matcher matcher = p.matcher("b5bbaabab4abbba3ba333a");
		while(matcher.find()) {
			System.out.println(matcher.start());
		}
		System.out.println();
	}
	
	private static void groupCharMatch() {
		Pattern p = Pattern.compile("[abd]");
		Matcher matcher = p.matcher("iiiaeerebllllldewwwww");
		while(matcher.find()) {
			System.out.println(matcher.start());
		}
		System.out.println();
	}

}
