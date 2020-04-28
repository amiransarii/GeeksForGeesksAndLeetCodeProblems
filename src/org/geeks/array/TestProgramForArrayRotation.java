package org.geeks.array;

import java.util.Arrays;

public class TestProgramForArrayRotation {
	
	/**
	 * METHOD 1 (Using temp array)
	 * Input arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2, n =7
	 * 1) Store the first d elements in a temp array
	 * temp[] = [1, 2]
	 * 2) Shift rest of the arr[]
	 * arr[] = [3, 4, 5, 6, 7, 6, 7]
	 * 3) Store back the d elements
	 * arr[] = [3, 4, 5, 6, 7, 1, 2]
	 * 
	 */

	
	 static void getRotateArr(int[] arr, int d,int n) {
		 
		 int [] temp = new int[d];
		 int [] rotate = new int[n];
		 int index = 0;
		 
				 
		 //store elements upto d in array
		
		 for(int i = 0 ; i < d; i++) {
			 temp[i] = arr[i];
		 }
		 
		 for(int i = d; i <n ; i++) {

			 rotate[index ++] = arr[i];
			// index++;
		 }
		 
		 for(int i = 0; i < d; i++) {
			 rotate[index ++] = arr[i];
			 //index++;
		 }
		 
		 System.out.print(Arrays.toString(rotate));
		 
		 
		
	 }
	 
	 public static void main(String args[]) {
		 
		 int arr[] = {1, 2, 3, 4, 5, 6, 7};
		 int d = 2;
		 int n =7;
		 
		 getRotateArr(arr, d, n);
		 
	 }
}
