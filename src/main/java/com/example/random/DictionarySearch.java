package com.example.random;

import java.util.Arrays;

public class DictionarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


    static int indexPosition=0;
    public static int findRotationPoint(String[] words) {

        if(words.length==1){
            return indexPosition;
        }
        
        if(words.length==2){
            if(words[0].compareTo(words[1])>0){
                return indexPosition+1;
            }else{
                return indexPosition;
            }
        }
        
        
        // find the rotation point in the array
        int left= 0;
        int right=words.length;
        int target= (left+right)/2;
        
        if(words[left].compareTo(words[target])>0){
            findRotationPoint(Arrays.copyOfRange(words, 0, target, String[].class));
        } else if(words[target].compareTo(words[right])>0){
            indexPosition+=target;
            findRotationPoint(Arrays.copyOfRange(words, target, words.length, String[].class));
        }
        return 0;
    }
    
}
