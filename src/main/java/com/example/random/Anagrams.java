package com.example.random;

import java.util.Scanner;

public class Anagrams {


    static boolean isAnagram(String a, String b) {
        // Complete the function
    	a = a.toUpperCase();
        java.util.List<Character> listA = new java.util.ArrayList<Character>();
        for(int i=0;i<a.length(); i++){
            listA.add(a.charAt(i));
        }

        b =b.toUpperCase();
        for(int i=0; i<b.length(); i++){
            if(listA.contains(b.charAt(i))){
                listA.remove((Character)b.charAt(i));
            }else{
                return false;
            }
        }

        if(listA.isEmpty()){
            return true;
        }else{
            return false;
        } 
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}