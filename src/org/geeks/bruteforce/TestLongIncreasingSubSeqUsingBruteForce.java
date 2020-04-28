package org.geeks.bruteforce;

public class TestLongIncreasingSubSeqUsingBruteForce {
	
	
	
	private static int maxLength(int[] arr, int n) {
		
		int max = Integer.MIN_VALUE;
		for(int i = 1 ; i < n; i++) {
			int count = 0;
			
			for(int j = 0  ; j < i; j++) {
				
				if(arr[i]  > arr[j ]) {
					count++;
				}
			}
			
			if(count > max) {
				max = count ;
			}
		}
		
		return max;
	}
	
	public static void main(String args[]) {
		
		int[] arr = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
		int result = maxLength(arr, arr.length);
		
		System.out.println(result);
		
		
	}

}
