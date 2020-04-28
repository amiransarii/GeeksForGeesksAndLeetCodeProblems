package org.geeks.divideandconquer;

public class TestBinarySearch {
	
	
	private static int binarySearch(int [] arr, int low, int high, int key) {
		
		if(low <= high) {
			int mid = low + (high - low) /2;
			 
			 if(arr[mid] == key)
				 return mid;
			 
			 if( key <arr[mid] ) {
				 return binarySearch(arr, low, mid -1, key);
			 }
			 return binarySearch(arr, mid +1, high, key);	
		}
		return -1; 
	}
	
	//another method using while loop
	int binarySearch(int arr[], int x) 
    { 
        int l = 0, r = arr.length - 1; 
        while (l <= r) { 
            int m = l + (r - l) / 2; 
  
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
	
	
	
public static void main(String args[]) {
		
		int [] arr = {2,3,4,5,6,7};
		
		int key = 5;
		
		int result = binarySearch(arr,0, arr.length - 1, key);
		
		System.out.println("Result Found "+result);
		
	}

}
