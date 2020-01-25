package com.example.sort;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] unSortedArray = new int[] {8,5, 7,2,3,4,5,6};
		System.out.println("Array Before Sorting : "+ Arrays.toString(mergeSort(unSortedArray)));

	}
	
	private static int[]  mergeSort(int[] arrayToBeSorted) {
		
		if(arrayToBeSorted.length<2) {
			return arrayToBeSorted;
		}
		
		int left = 0;
		int right = arrayToBeSorted.length;
		
		int mid = (right-left)/2;
		
		int[] leftArray = mergeSort(Arrays.copyOfRange(arrayToBeSorted, left, mid));
		int[] rightArray =mergeSort(Arrays.copyOfRange(arrayToBeSorted, mid, right));
		
		int[] sortedArray = new int[arrayToBeSorted.length];
		
		int currentLeftIndex=0;
		int currentRightIndex=0;
		
		for(int currentSortedIndex=0; currentSortedIndex<arrayToBeSorted.length; currentSortedIndex++) {
			
			if(currentLeftIndex < leftArray.length && 
					(currentRightIndex >= rightArray.length || 
					leftArray[currentLeftIndex] < rightArray[currentRightIndex])) {
				sortedArray[currentSortedIndex] = leftArray[currentLeftIndex];
				currentLeftIndex++;
			}else {
				sortedArray[currentSortedIndex] = rightArray[currentRightIndex];
				currentRightIndex++;
			}
		}
		
		return sortedArray;
		
	}

}
