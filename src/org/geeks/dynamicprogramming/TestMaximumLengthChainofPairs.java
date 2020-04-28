package org.geeks.dynamicprogramming;

/**
 * 
 * @author amir.ansari
 *You are given n pairs of numbers. In every pair, the first number is always smaller 
 *than the second number. A pair (c, d) can follow another pair (a, b) if b < c. 
 *Chain of pairs can be formed in this fashion. 
 *Find the longest chain which can be formed from a given set of pairs.
 */
public class TestMaximumLengthChainofPairs {
	/**
	 * Following is a simple two step process.
     1) Sort given pairs in increasing order of first (or smaller) element. 
      Why do not need sorting? Consider the example {{6, 8}, {3, 4}} to understand the need of sorting. 
      If we proceed to second step without sorting, we get output as 1. But the correct output is 2.
     2) Now run a modified LIS process where we compare the second element of 
     already finalized LIS with the first element of new LIS being constructed.
	 */
	 
	int a;
	int b;
	
	public TestMaximumLengthChainofPairs(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	// This function assumes that arr[] is sorted in increasing order 
    // according the first (or smaller) values in pairs. 
	 
	static int maxChainLength(TestMaximumLengthChainofPairs arr[],int n) {
		
		int i, j, max = 0;
		int mcl[] = new int[n];
		
		/* Initialize MCL (max chain length) values for all indexes */
		for(i = 0 ; i < n; i++)
			mcl[i] = 1; //for a single character
		
		 /* Compute optimized chain length values in bottom up manner */
		for(i = 1; i < n ; i++)
			for(j = 0; j < i ; j++)
				
				if(arr[i].a > arr[j].b && mcl[i] < mcl[j] + 1)
					mcl[i] = mcl[j] +1;
		
		
		// mcl[i] now stores the maximum chain length ending with pair i 
		/* Pick maximum of all MCL values */
		for(i = 0; i < n ; i++)
			if ( max < mcl[i] ) 
	             max = mcl[i]; 
		return max;
		
		
	}
	
	
	/* Driver program to test above function */
    public static void main(String[] args)  
    { 
    	TestMaximumLengthChainofPairs arr[] = new TestMaximumLengthChainofPairs[]
    			{new TestMaximumLengthChainofPairs(5,24), new TestMaximumLengthChainofPairs(15, 25), 
                                  new TestMaximumLengthChainofPairs (27, 40), new TestMaximumLengthChainofPairs(50, 60)}; 
        System.out.println("Length of maximum size chain is " +  
                                  maxChainLength(arr, arr.length)); 
    } 
	
	

}
