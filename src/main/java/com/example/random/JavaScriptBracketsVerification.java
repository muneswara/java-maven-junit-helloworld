package com.example.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class JavaScriptBracketsVerification {

	public static void main(String[] args) {
		System.out.println("---- : "+isValid("{[(])}"));
		
		int[] iA= {3,4};
		System.out.println(Arrays.toString(iA));
		
		int[] sortScores = sortScores(new int[] {30, 60}, 100);
		System.out.println("---- : "+ Arrays.toString(sortScores));
		
//		Comparator<Object> reverseOrder = Collections.reverseOrder();
		
		Set set = new TreeSet();
		set.add("2");
		set.add(3);
		set.add("1");
		Iterator it = set.iterator();
		while (it.hasNext())
		System.out.print(it.next() + " ");

	}
	
	public static boolean isValid(String code) {

        // determine if the input code is valid
        List<Character> listChar = new ArrayList<Character>();
        
        for(int i=0; i<code.length(); i++){
            char charCode = code.charAt(i);
            if(charCode == '{' || charCode == '[' || charCode == '(' ){
                listChar.add(charCode);
                continue;
            }
            
            if(charCode == '}'){
                if(listChar.size()<1 || listChar.get(listChar.size()-1)!='{'){
                    return false;
                }
                listChar.remove(listChar.size()-1);
            }
            
            if(charCode == ']'){
                if(listChar.size()<1 || listChar.get(listChar.size()-1)!='['){
                    return false;
                }
                listChar.remove(listChar.size()-1);
            }
            
            if(charCode == ')'){
                if(listChar.size()<1 || listChar.get(listChar.size()-1)!='('){
                    return false;
                }
                listChar.remove(listChar.size()-1);
            }
        }

        if(listChar.size()==0){
            return true;
        }
        return false;
    }
	
	public static int[] sortScores(int[] unorderedScores, int highestPossibleScore) {

        if(unorderedScores.length<=1){
            return unorderedScores;
        }
        // sort the scores in O(n) time
        int[] tempScores = new int[highestPossibleScore+1];
       // int[] sortedScores = new int[unorderedScores.length];
        
        for(int i=0; i<unorderedScores.length; i++){
            tempScores[unorderedScores[i]]+=1; 
        }
        
        System.out.println("---"+Arrays.toString(tempScores));
        int counter =0;
        for(int i=highestPossibleScore; i>0; i--){
            System.out.println("-1--"+i);
            if(tempScores[i]>0){
                System.out.println("---"+tempScores[i]);
                for(int j=0; j<tempScores[i]; j++){
                    unorderedScores[counter++]=i;
                }
            }
            System.out.println("-2--"+i);
        }

        return unorderedScores;
    }

}
