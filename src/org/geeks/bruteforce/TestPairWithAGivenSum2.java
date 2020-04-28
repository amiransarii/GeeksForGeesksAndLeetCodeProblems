package org.geeks.bruteforce;

import java.util.HashMap;
import java.util.Map;

public class TestPairWithAGivenSum2 {
	
	 
	private static boolean isFound(int[] arr, int target) {
		Map<Integer, Integer> map =  new HashMap<Integer, Integer>();
		
		for(int i = 0 ; i < arr.length ;i++) {
		
			if(map.get(arr[i]) != null) {
				return true;
			}
			map.put(target - arr[i], i);
			
		}
		
			
		return false;
	}
	
	public static void main(String args[]) {
		
		int arr[] = {11, 15, 6, 8, 9, 10};
		int x = 16;
		
		boolean result =  isFound(arr, x);
		System.out.println(result);
		
		
		
		
	}

}
