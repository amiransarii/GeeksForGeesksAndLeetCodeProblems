package org.geeks.bruteforce;

//https://www.geeksforgeeks.org/counting-inversions/
public class TestCountInversions {
	/**
	 * Inversion Count for an array indicates – how far (or close) the array is from being sorted. 
	 * If array is already sorted then inversion count is 0. If array is sorted in reverse order 
	 * that inversion count is the maximum.
      Formally speaking, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j
	 */
	
        static int getInversionCountlength(int[] arr,int size) {
        	
        	int count = 0;
        	
        	for(int i = 0 ; i < size; i++) {
        	    
        		for(int j = i +1 ; j < size; j++) {
        			 if(arr[i] > arr[j]) {
        				 count++;
        				 System.out.println("{" + arr[i] +"," + arr[j] +"} ,");
        			 }
        		}
        	}
        	
        	return count;
        	
        }

        public static void main(String args[]) {
        	
        	int arr[] = new int[] { 1, 20, 6, 4, 5 }; 
        	int result = getInversionCountlength(arr, arr.length);
        	System.out.println(result);
        }
        
}
