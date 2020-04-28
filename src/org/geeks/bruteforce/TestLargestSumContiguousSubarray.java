package org.geeks.bruteforce;

/**
 * 
 * @author amir.ansari
 * Simple idea of the Kadane’s algorithm is to look for all positive contiguous 
 * segments of the array (max_ending_here is used for this). And keep track of maximum sum contiguous
 * segment among all positive segments (max_so_far is used for this). Each time we get a positive sum compare it
 * with max_so_far and update max_so_far if it is greater than max_so_far
 */
public class TestLargestSumContiguousSubarray {
	
	static int maxSubArraySum(int[] arr) {
		
		int size = arr.length;
		int max_so_far = Integer.MIN_VALUE;
		int max_ending_here = 0; 
		
		
		for(int i = 0 ; i < size ; i++) {
			max_ending_here = max_ending_here + arr[i];
			
			if(max_so_far < max_ending_here)
				max_so_far = max_ending_here;
			
			if(max_ending_here < 0)
				max_ending_here = 0;
			
			/***
			 * another solution
			 */
			
		/*	max_ending_here = max_ending_here + a[i]; 
	        if (max_ending_here < 0)  
	            max_ending_here = 0;  
	          
	        /* Do not compare for all 
	           elements. Compare only  
	           when max_ending_here > 0 */
	        /*else if (max_so_far < max_ending_here)  
	            max_so_far = max_ending_here;  */
		}
		
		
		return max_so_far; 	
		
		
	}

	 public static void main (String[] args) 
	    { 
	        int [] a = {-2, -3, 4, -1, -2, 1, 5, -3}; 
	        System.out.println("Maximum contiguous sum is " + 
	                                       maxSubArraySum(a)); 
	    } 
	  
}
