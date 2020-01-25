package com.example.sort;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		InsertionSort bs = new InsertionSort();
		int[] unSortedArray = new int[] {6,5,8,4,2,3};
		System.out.println("Array Before Sorting : "+ Arrays.toString(unSortedArray));
		int[] sortedArray =bs.insertionSort(unSortedArray);
		System.out.println("Array After Sorting : "+ Arrays.toString(sortedArray));

	}
	
	public int[] insertionSort(int[] unSortedArray) {
		
		for(int i=1; i<unSortedArray.length; i++) {
			int elementToBeInserted = unSortedArray[i];
			int j=i-1;
			
			while(j>=0 && elementToBeInserted < unSortedArray[j]) {
				unSortedArray[j+1]=unSortedArray[j];
				j=j-1;				
			}
			
			unSortedArray[j+1]= elementToBeInserted;
			System.out.println("Array After Sorting : "+ Arrays.toString(unSortedArray));
		}
				
		return unSortedArray;
	}
}
