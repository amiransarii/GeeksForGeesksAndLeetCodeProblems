package org.geeks.divideandconquer;

import java.util.Random;

/**
 * 
 * @author amir.ansari
 * sorted array A[] of n elements. We need to find if x is present in A or not.In binary
 *  search we always used middle element,
 *  here we will randomly pick one element in given range
 *
 */
public class TestRandomizedBinarySearch {
	
	   static int randomBinarySearch(int [] arr, int low, int high, int key) {
		   
		   while(low <= high) {
			   
			   int mid = getRandomNumber(low, high);
			   
			    if(arr[mid] == key)
			    	return mid;
			     
			    if(key < arr[mid]) 
			    	return randomBinarySearch(arr, low, mid - 1, key);
			    
			    return randomBinarySearch(arr, mid +1, high, key);		   
		   }
		   
		   return -1;
		   
		   
	   }

	   /**
	    * 
	    while (l <= r) 
    { 
        // Here we have defined middle as 
        // random index between l and r ie.. [l, r] 
        int m = getRandom(l, r); 
  
        // Check if x is present at mid 
        if (arr[m] == x) 
            return m; 
  
        // If x greater, ignore left half 
        if (arr[m] < x) 
            l = m + 1; 
  
        // If x is smaller, ignore right half 
        else
            r = m - 1; 
    } 
  
    // if we reach here, then element was 
    // not present 
    return -1; 
} 
	    */
	
	
	
	
	static int getRandomNumber(int low, int high) {
	
		  Random  r = new Random();	
		  int range = low + r.nextInt(high - low +1);
		  return range;
	}
	
	
	// Driver code 
    public static void main(String[] args)  
    { 
        int arr[] = {2, 3, 4, 10, 40}; 
        int n = arr.length; 
        int key = 10; 
        int result = randomBinarySearch(arr, 0, n-1, key); 
        System.out.println((result == -1)?"Element is not present in array": 
                "Element is present at index " + result); 
    } 
	
	
}
