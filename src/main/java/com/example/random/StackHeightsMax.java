package com.example.random;


import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class StackHeightsMax {

    /*
     * Complete the equalStacks function below.
     */
    static int equalStacks(int[] h1, int[] h2, int[] h3) {
       
        if(h1.length<1 || h2.length<1 || h3.length<1){
            return 0;
        }
        /*
         * Write your code here.
         */
        int max_height =0;
        
        for(int i=0; i<h1.length; i++){
            max_height+=h1[i];
        }
        
        List<Integer> stack2= new ArrayList();
        int sumStack2 =0;
        for(int i=h2.length-1; i>=0; i--){
             sumStack2 += h2[i];
            stack2.add(sumStack2);
        }
        
        List<Integer> stack3= new ArrayList();
        int sumStack3 =0;
        for(int i=h3.length-1; i>=0; i--){
             sumStack3 += h3[i];
            stack3.add(sumStack3);
        }
        
        for(int i=0; i<h1.length; i++){
            if(stack2.contains(max_height) && stack3.contains(max_height)){
                return max_height;
            }
             max_height = max_height-h1[i];
        }
        return max_height;
    }

    public static void main(String[] args) throws IOException {
       

        int[] h1 = {5,3,2};
        int[] h2 = {4,1,1,2,1};
        int[] h3 = {2,3,2};

      

        int result = equalStacks(h1, h2, h3);
        
        System.out.println(result);

    }
}