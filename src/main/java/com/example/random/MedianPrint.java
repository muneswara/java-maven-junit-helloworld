package com.example.random;

import java.util.Arrays;

public class MedianPrint {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(printMedian(new int[] {12,4,5,3,8,7})));

	}
	
	private static double[] printMedian(int[] a) {
		double[] medianArray = new double[a.length];
		
		medianArray[0]=a[0];
		
		for(int i=0; i<a.length-1; i++) {
			int j=i+1;
			int elementToBInserted=a[i+1];
			while(j>0 && elementToBInserted < a[j-1]) {
				a[j]=a[j-1];
				j--;
			}
			a[j]=elementToBInserted;
			System.out.println(Arrays.toString(a));
			if((i+2)%2==0) {
				int index =(i+2)/2;
				medianArray[i+1]=(a[index]+a[index-1])/2.0;
			}else {
				int index =(i+2)/2;
				medianArray[i+1]= a[index];
			}
		}
		
		return medianArray;
	}

	private static void swap(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		
	}

}
