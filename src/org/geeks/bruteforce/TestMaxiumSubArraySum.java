package org.geeks.bruteforce;

public class TestMaxiumSubArraySum {
	
	//calculate maximum subarray sum
	
	static int maxSubArraySum(int[] arr, int n) {
		
		int max = Integer.MIN_VALUE;
		//int sum = 0;
		
		for(int i = 0; i < n ; i++) {
			for(int j = i; j < n ; j++) {
				int sum = 0;
				
				for(int k = i; k<= j; k++)
					sum+= arr[k];
				
				if(sum > max)
					max = sum;
			}
		}
		
		return max;
	}

	 public static void main(String args[]) {
		 
		  int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
		 int result = maxSubArraySum(arr, arr.length);
		 System.out.println(result);
		 
		 
		 
	 }
}
