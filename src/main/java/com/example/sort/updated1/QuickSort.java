package com.example.sort.updated1;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] unSortedArray = {8,6,4,7,2};
		System.out.println("Before Sort : "+ Arrays.toString(unSortedArray));
		quickSort(unSortedArray, 0, unSortedArray.length-1);
		System.out.println("After Sort : "+ Arrays.toString(unSortedArray));
	}
	
	private static void quickSort(int[] a, int floorIndex, int ceilIndex) {
		
		if(floorIndex < ceilIndex) {
			int pivotIndex = findPivotalIndex(a, floorIndex, ceilIndex);
			quickSort(a, floorIndex, pivotIndex-1);
			quickSort(a, pivotIndex+1, ceilIndex);
		}
	}

	private static int findPivotalIndex(int[] a, int s, int t) {
		int pivotalElement = a[s];
		
		int i=s+1;
		for(int j=s+1; j<=t; j++) {
			
			if(pivotalElement > a[j]) {
				//Swap i, j
				swap(a, i, j);
				i++;
			}
			
		}
		swap(a, s, i-1);
		return i-1;
	}

	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		
	}

}
