package org.geeks.array;

public class TestLargestSumContiguousSubarray {
	
	 
	 
	  static int getSum(int[] arr , int size) {
		  int max = Integer.MIN_VALUE;
		  
		  for(int i = 0 ; i < size ; i++) {
			  
			  for(int j = 0 ; j < size ; j++) {
				  int sum = 0;
				  
				  for(int k = i;k <= j ; k++ )
					  sum += arr[k];
				  
				  if(sum > max)
						max = sum;
			  }
			  
		  }
		 	  
		  return max; 
	  }

	  public static void main(String args[]) {
			 
		  int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
		 int result = getSum(arr, arr.length);
		 System.out.println(result);
		 
		 
		 
	 }
}
