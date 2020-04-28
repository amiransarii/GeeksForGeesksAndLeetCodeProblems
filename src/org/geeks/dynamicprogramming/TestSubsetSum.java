package org.geeks.dynamicprogramming;

/**
 * 
 * @author amir.ansari
 * * Given an array of non negative numbers and a total, is there subset of numbers in this array 
 * which adds up
 * to given total. Another variation is given an array is it possible to split it up into 2 equal
 * sum partitions. Partition need not be equal sized. Just equal sum.
 */
public class TestSubsetSum {
	
	public boolean subsetSum(int [] inputs, int total) {
		
		boolean T[][] = new boolean[inputs.length +1][total + 1];
		
		for(int i = 0; i <= inputs.length; i++) {
			T[i][0] = true ;   //0 total 0;
		}
		
		for (int i = 1 ; i <= inputs.length ; i++) {
			
			for(int j = 1; j <= total; j++) {
				  if (j - inputs[i - 1] >= 0) {
	                    T[i][j] = T[i - 1][j] || T[i - 1][j - inputs[i - 1]];
	                } else {
	                    T[i][j] = T[i-1][j];
	                }
			}
			
		}
		 return T[inputs.length][total];
	}
	 public static void main(String args[]) {
		 TestSubsetSum  ss = new TestSubsetSum ();
	      
	        int arr1[] = {2, 3, 7, 8};
	        System.out.print(ss.subsetSum(arr1, 11));

	    }
}
