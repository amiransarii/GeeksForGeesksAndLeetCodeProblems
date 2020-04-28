package org.geeks.dynamicprogramming;

public class TestBinomialCoefficient {
	/**
	 * Following are common definition of Binomial Coefficients.
	 * A binomial coefficient C(n, k) can be defined as the coefficient of X^k in the expansion of (1 + X)^n.
	 * A binomial coefficient C(n, k) also gives the number of ways, disregarding order, 
	 * that k objects can be chosen from among n objects; more formally, the number of k-element 
	 * subsets (or k-combinations) of an n-element set.
	 *  C(n, k) = C(n-1, k-1) + C(n-1, k)
       C(n, 0) = C(n, n) = 1
	 */
	  
	static int binomialCoeff(int n, int k) {
		
		int c[][] = new int[n +1] [k +1];
		int i,j;
		
		 // Calculate  value of Binomial Coefficient in bottom up manner 
		
		for( i = 0 ; i <= n ; i++) {
			
			for(j = 0 ; j <= Math.min(i, k); j++) {
				
				//base cases
				if(j == 0 || j == i) 
					c[i][j] = 1;
				
				  // Calculate value using previously stored values 
				else
					c[i][j] = c[i -1][j -1] + c[i -1][j];
			}			
			
		}
		
		return c[n][k];
		
		
	}

}
