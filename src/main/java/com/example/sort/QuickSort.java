package com.example.sort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] unSortedArray = new int[] {7, 11,2, 13,4, 15,6};
		System.out.println("Array Before Sorting : "+ Arrays.toString(unSortedArray));
		quick_sort(unSortedArray, 0, 7);
		System.out.println("Array After Sorting : "+ Arrays.toString(unSortedArray));

	}
	
	static int partition ( int A[],int start ,int end) {
	    int i = start+1;
	    int piv = A[start] ;            //make the first element as pivot element.
	    for(int j =start + 1; j < end ; j++ )  {
	    /*rearrange the array by putting elements which are less than pivot
	       on one side and which are greater that on other. */

	          if ( A[ j ] < piv) {
	                 swap (A,  i ,  j );
	            i += 1;
	        }
	   }
	   swap (A, start , i-1 ) ;  //put the pivot element in its proper place.
	   return i-1;                      //return the position of the pivot
	}
	
	private static void swap(int[] a, int i, int j) {
		int temp=a[i];
		a[i] =temp;
		a[i] = a[j];
		a[j] = temp;
		
	}

	static void quick_sort ( int A[] ,int start , int end ) {
		   if( start < end ) {
		        //stores the position of pivot element
		         int piv_pos = partition (A,start , end ) ;     
		         quick_sort (A,start , piv_pos -1);    //sorts the left side of pivot.
		         quick_sort ( A,piv_pos +1 , end) ; //sorts the right side of pivot.
		   }
		}

}
