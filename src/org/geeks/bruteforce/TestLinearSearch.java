package org.geeks.bruteforce;

public class TestLinearSearch {
	
	
	private static int linearSearch(int [] arr, int n, int key) {
		
		if(arr == null || n == -1)
			return -1;
		
		  if(n < 0)
			  return -1;
		  
		 if(arr[n] == key) {
			 return n;
		 }
		
		 return linearSearch(arr, n -1, key);	
	}
	
	public static void main(String args[]) {
		
		int [] arr = {2,3,4,5,6,7};
		
		int key = 4;
		
		int result = linearSearch(arr, arr.length - 1, key);
		
		System.out.println("Result Found "+result);
		
	}
	
	
	
	

}
