package org.geeks.dynamicprogramming;

public class TestLargestSumContiguousSubarray2 {

	 public static int maxSubArray(int[] nums) {
	        
	        int n = nums.length;
	        //dp[i] means the maximum subarray ending with nums[i]
	        int[] dp = new int[n];
	        dp[0] = nums[0];
	        int max = dp[0];
	        
	        for(int i = 1; i < n ; i++){
	            
	            dp[i] = nums[i] +(dp[i -1] >0 ? dp[i -1]:0);
	            max = Math.max(max,dp[i]);
	            
	            
	        }
	        return max;
	    }
	 
	 /* Driver program to test maxSubArraySum */
	    public static void main(String[] args) 
	    { 
	    int a[] = {-2, -3, 4, -1, -2, 1, 5, -3}; 
	    int n = a.length;    
	    int max_sum = maxSubArray(a); 
	    System.out.println("Maximum contiguous sum is " 
	                       + max_sum); 
	    } 
}
