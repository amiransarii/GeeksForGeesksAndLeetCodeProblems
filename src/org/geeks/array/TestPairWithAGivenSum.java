package org.geeks.array;

public class TestPairWithAGivenSum {
	
	private static boolean isGivenSum(int [] arr, int target) {
		
		for(int i = 0 ; i < arr.length; i++) {
			
			for(int j = i +1 ; j < arr.length ; j++) {
				
                 if(arr[i] + arr[j] == target) {
                	 System.out.println("(" + i +"," +j +")");
                	 return true;
                 }
				
			}
		}
		
		return false;
	}
	
	public static void main(String args[]) {
		
		int arr[] = {11, 15, 26, 38, 9, 10};
		int x = 35;
		
		boolean result = isGivenSum(arr, x);
		System.out.println(result);	
	}

}
