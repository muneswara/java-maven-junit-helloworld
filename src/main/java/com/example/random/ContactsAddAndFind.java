package com.example.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class ContactsAddAndFind {

	public static void main(String[] args) {
		
		
	       
		String[][] queries = {{"add","hack"},{"add","hackerrank"},{"find","hac"},{"find","hak"}};
//		contacts(queries);
	}
	
	static void contacts(String[][] queries) {
		HashMap<Integer, String> hmFinds = new HashMap<>();
		HashMap<String, Integer> hmCounts = new HashMap<>();
	       for(int i=0; i<queries.length; i++){
	           String[] tuple = queries[i];
	           if(tuple[0].equals("find")){
	        	   hmFinds.put(i, tuple[1]); 
	           }
	       }
	       
	       int[] searchCount=new int[hmFinds.size()];
	       int index=0;
	       Set<Integer> keySet = hmFinds.keySet();
	       for(int i=0; i<queries.length; i++){
	    	   String[] tuple = queries[i];
	           if(tuple[0].equals("add")){
	        	   
	        	   for (Integer integer : keySet) {
					
	        		   String key = hmFinds.get(integer);
					if (tuple[1].startsWith(key)) {
						if (hmCounts.containsKey(key)) {
							Integer count = hmCounts.get(key);
							hmCounts.put(key, ++count);
						} else {
							hmCounts.put(key, 1);
						}
					}
				}
	           }else {
	        	   String key = hmFinds.get(i);
        		   if(hmCounts.containsKey(key)) {
        			   searchCount[index++] = hmCounts.get(key);
        		   }else {
        			   searchCount[index++] = 0;
        		   }
	           }
	       }
	       
	       System.out.println(Arrays.toString(searchCount));

	    }

}
