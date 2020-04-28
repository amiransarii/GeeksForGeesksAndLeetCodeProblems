package org.geeks.divideandconquer;
/**
 * Following are common definition of Binomial Coefficients.
 * A binomial coefficient C(n, k) can be defined as the coefficient of X^k in the expansion of (1 + X)^n.
 * A binomial coefficient C(n, k) also gives the number of ways, disregarding order, 
 * that k objects can be chosen from among n objects; more formally, the number of k-element 
 * subsets (or k-combinations) of an n-element set.
 *  C(n, k) = C(n-1, k-1) + C(n-1, k)
   C(n, 0) = C(n, n) = 1
 */
public class TestBinomialCoefficient {
	
	// Returns value of Binomial  
    // Coefficient C(n, k) 
	
	static int binomialCoeff(int n, int k) {
		
		 // Base Cases 
		if( k == 0 || k == n)
			return 1;
	 
		//receu
		return binomialCoeff(n - 1, k -1) + binomialCoeff(n -1, k);
	
	}
	
	
	
	 /* Driver program to test above function */
    public static void main(String[] args)  
   { 
        int n = 5, k = 2; 
        System.out.printf("Value of C(%d, %d) is %d ", 
                        n, k, binomialCoeff(n, k)); 
    } 
	
	
	
	

}
