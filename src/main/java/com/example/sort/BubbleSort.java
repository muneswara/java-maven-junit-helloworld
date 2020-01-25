package com.example.sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
//		int[] unSortedArray = new int[] {6,5,8,4,2,3};
		
		/*System.out.println("Array Before Sorting : "+ Arrays.toString(unSortedArray));
		int[] sortedArray =bs.bubbleSort(unSortedArray);
		System.out.println("Array After Sorting : "+ Arrays.toString(sortedArray));
*/
		
		int[] unSortedArray = new int[] {1,2,3,4,5,6};
		System.out.println("Array Before Sorting : "+ Arrays.toString(unSortedArray));
		int[] sortedArray =bs.bubbleSortForBestCase(unSortedArray);
		System.out.println("Array After Sorting : "+ Arrays.toString(sortedArray));

	}
	
	public int[] bubbleSort(int[] unSortedArray) {
		
		/*for(int i=0; i<unSortedArray.length; i++) {
			for(int j=i+1; j<unSortedArray.length; j++) {
				int temp=0;
				if(unSortedArray[i] > unSortedArray[j]) {
					temp = unSortedArray[i];
					unSortedArray[i] = unSortedArray[j];
					unSortedArray[j] = temp;
				}
			}
		}*/
		
		for(int i=0; i<unSortedArray.length-1; i++) {
			for(int j=0; j<unSortedArray.length-i-1; j++) {
				int temp=0;
				if(unSortedArray[j] > unSortedArray[j+1]) {
					temp = unSortedArray[j];
					unSortedArray[j] = unSortedArray[j+1];
					unSortedArray[j+1] = temp;
				}
			}
			
			System.out.println(i+" - Sorting Inprogress : "+ Arrays.toString(unSortedArray));
		}
		
		return unSortedArray;
	}
	
	public int[] bubbleSortForBestCase(int[] unSortedArray) {
		
		int count = 0;
		outer: while(true) {
			boolean swapStatus = false;
			
			for(int i=0; i<unSortedArray.length-1; i++) {
				if(unSortedArray[i] > unSortedArray[i+1]) {
					int temp = unSortedArray[i+1];
					unSortedArray[i+1] = unSortedArray[i];
					unSortedArray[i] = temp;
					swapStatus = true;
					
				}
				System.out.println(count+ " : "+i+" : " +swapStatus);
			}
			
			if(!swapStatus) {
				break outer;
			}
			count++;
		}
		
		return unSortedArray;
	}
	

}
