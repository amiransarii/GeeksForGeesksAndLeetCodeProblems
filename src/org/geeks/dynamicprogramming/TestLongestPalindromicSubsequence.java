package org.geeks.dynamicprogramming;

public class TestLongestPalindromicSubsequence {
	
	static int lps(String seq) {
		
		int n = seq.length();
		int i,j, c1;
		
		//create a table to store results of subproblem
		int L[][] = new int[n][n];
		
		//strings of length 1 are palindrome of length 1
		
		for(i = 0; i < n ; i++)
			L[i][i] = 1;
		
		 // Build the table. Note that the lower  
        // diagonal values of table are 
        // useless and not filled in the process.  
        // The values are filled in a manner similar 
        //  to Matrix Chain Multiplication DP solution (See 
        // https://www.geeksforgeeks.org/matrix-chain-multiplication-dp-8/).  
        // cl is length of substring 
		
		
		for(c1 = 2; c1 <= n ; c1++) {
			
			for(i = 0; i < n -c1 +1;i++) {
				
				j = i + c1 - 1;
				 if (seq.charAt(i) == seq.charAt(j) && c1 == 2) 
		                L[i][j] = 2; 
		                else if (seq.charAt(i) == seq.charAt(j)) 
		                L[i][j] = L[i+1][j-1] + 2; 
		                else
		                L[i][j] = Math.max(L[i][j-1], L[i+1][j]); 		
			}
			
			
			
		}
		
		return L[0][n-1]; 
	}
	 /* Driver program to test above functions */
    public static void main(String args[]) 
    { 
        String seq = "GEEKSFORGEEKS"; 
        int n = seq.length(); 
        System.out.println("The lnegth of the lps is "+ lps(seq)); 
    } 
}
