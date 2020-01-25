package com.example.random;

public class NumeberFindInSortedArray {

	public static void main(String[] args) {
		/*System.out.println(contains(new int[] {4,6,7,8}, 7));
		System.out.println(contains(new int[] {}, 7));
		
		System.out.println(contains(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10));
		*/
		
		/*System.out.println(contains(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 1));
		
		System.out.println(contains(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 0));
*/		
		System.out.println(contains(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 8));
		
		
		System.out.println(contains(new int[] {2, 4, 6}, 5));
		
		System.out.println(contains(new int[] {2, 4, 6}, 4));
		
		System.out.println(contains(new int[] {1}, 2));

	}
	
	public static boolean contains(int[] a, int n) {
		
		if(a==null || a.length<1){
            return false;
        }
		
		int floorIndex=0;
		int ceilIndex = a.length;
		
		while(floorIndex < ceilIndex) {
			
			int distance = ceilIndex - floorIndex;
			int guessIndex = distance/2;
			
			if(a[guessIndex]<n) {
				floorIndex = guessIndex;
			} else if(a[guessIndex]>n) {
				ceilIndex= guessIndex;
			}else {
				return true;
			}
		}
		
		return false;
	}

	public static boolean contains1(int[] a, int n) {

        // check if an integer is present in the array
        if(a==null || a.length<1){
            return false;
        }
        
        /*if(a.length==1 && a[0]==n) {
        	return true;
        }else if(a.length==1 && a[0]!=n){
        	return false;
        }
        
        if(a.length==1 && a[0]==n) {
        	return true;
        }else if(a.length==1 && a[0]!=n){
        	return false;
        }*/
        
        
        
        int low = 0;
        int high = a.length;
        
        if(a.length<=3) {
        	for(int i=0; i<a.length; i++) {
        		if(a[i]==n) {
        			return true;
        		}
        	}
        	return false;
        }
        
        while(low<high){
            
            int mid = (low + high)/2;
            
            /*if(mid==0 && a[0]==n) {
            	return true;
            }
            
            if(mid==1 && (a[0]==n || a[1]==n)) {
            	return true;
            }
            */
            if(n==a[mid]){
                return true;
            } else if(n > a[mid]){
                low=mid;
            } else{
                high = mid;
            }
        }
        

        return false;
    } 
}
