package com.example.random;

import java.io.*;
import java.util.*;

public class TokenCount {



public static void main(String[] args) {
	
	StringBuffer sb = new StringBuffer();
	sb.append("abc");
	sb.append(true);
	System.out.println(sb.toString());
			
	        Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	        // Write your code here.
	        //!,?._'@
	       // List<Character> listChar = new ArrayList<Character>();
	       // listChar.add('!');
	       // listChar.add(',');
	       // listChar.add('?');
	       // listChar.add('.');
	       // listChar.add('_');
	       // listChar.add(''');
	       // listChar.add('@');

//	        StringBuffer sb = new StringBuffer(s);
	        /*s=s.replace('!', ' ');
	        s=s.replace(',', ' ');
	        s=s.replace('?', ' ');
	        s=s.replace('.', ' ');
	        s=s.replace('_', ' ');
	        s=s.replace('\'', ' ');
	        s=s.replace('@', ' ');*/
	        //sb.replace('!', " ");
//	        s = sb.toString();
	        s = s.trim();
//	        String[] tokens = s.split(" ");
	        String[] tokens = s.split("[^a-zA-Z]+");
	        int count = tokens.length;
	        System.out.println(count);
	        for(int i=0; i<tokens.length; i++){
	            System.out.println(tokens[i]);                
	        }



	        scan.close();
	    }

	    //public static 
	}
