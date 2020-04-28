package org.geeks.divideandconquer;

import java.util.Arrays;

//speaking, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j
public class TestCountInversions {
	/**
	 * Approach:
       Suppose the number of inversions in the left half and right half of the array 
      (let be inv1 and inv2), what kinds of inversions are not accounted for in Inv1 + Inv2? 
       The answer is – the inversions that need to be counted during the merge step.
       Therefore, to get a number of inversions, that needs to be added a number of inversions 
       in the left subarray, right subarray and merge().
      
        How to get number of inversions in merge()?
        In merge process, let i is used for indexing left sub-array and j for right sub-array. 
        At any step in merge(), if a[i] is greater than a[j], then there are (mid – i) inversions.
        because left and right subarrays are sorted, so all the remaining elements in 
        left-subarray (a[i+1], a[i+2] … a[mid]) will be greater than a[j]    
	 */
	
	  // Function to count the number of inversions 
    // during the merge process 
    private static int mergeAndCount(int[] arr, int l, int m, int r) 
    { 
  
        // Left subarray 
        int[] left = Arrays.copyOfRange(arr, l, m + 1); 
  
        // Right subarray 
        int[] right = Arrays.copyOfRange(arr, m + 1, r + 1); 
  
        int i = 0, j = 0, k = l, swaps = 0; 
  
        while (i < left.length && j < right.length) { 
            if (left[i] <= right[j]) 
                arr[k++] = left[i++]; 
            else { 
                arr[k++] = right[j++]; 
                swaps += (m + 1) - (l + i); 
            } 
        } 
  
        // Fill from the rest of the left subarray 
        while (i < left.length) 
            arr[k++] = left[i++]; 
  
        // Fill from the rest of the right subarray 
        while (j < right.length) 
            arr[k++] = right[j++]; 
  
        return swaps; 
    } 
  
    // Merge sort function 
    private static int mergeSortAndCount(int[] arr, int l, int r) 
    { 
  
        // Keeps track of the inversion count at a 
        // particular node of the recursion tree 
        int count = 0; 
  
        if (l < r) { 
            int m = (l + r) / 2; 
  
            // Total inversion count = left subarray count 
            // + right subarray count + merge count 
  
            // Left subarray count 
            count += mergeSortAndCount(arr, l, m); 
  
            // Right subarray count 
            count += mergeSortAndCount(arr, m + 1, r); 
  
            // Merge count 
            count += mergeAndCount(arr, l, m, r); 
        } 
  
        return count; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int[] arr = { 1, 20, 6, 4, 5 }; 
  
        System.out.println(mergeSortAndCount(arr, 0, arr.length - 1)); 
    } 
	} 


