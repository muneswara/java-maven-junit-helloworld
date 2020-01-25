package com.example.sort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		SelectionSort bs = new SelectionSort();
		int[] unSortedArray = new int[] {6,5,8,4,2,3};
		System.out.println("Array Before Sorting : "+ Arrays.toString(unSortedArray));
		int[] sortedArray =bs.selectionSort(unSortedArray);
		System.out.println("Array After Sorting : "+ Arrays.toString(sortedArray));

	}
	
	public int[] selectionSort(int[] unSortedArray) {
		
		for(int i=0; i<unSortedArray.length; i++) {
			
			int min_index=i;
			for(int j=i+1; j<unSortedArray.length; j++) {
				if(unSortedArray[j] < unSortedArray[min_index]) {
					min_index=j;
				}
			}
			int temp = unSortedArray[i];
			unSortedArray[i] = unSortedArray[min_index];
			unSortedArray[min_index] = temp;
			System.out.println("Array After Sorting : "+ Arrays.toString(unSortedArray));
		}
				
		return unSortedArray;
	}

}
