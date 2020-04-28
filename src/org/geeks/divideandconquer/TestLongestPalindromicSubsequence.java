package org.geeks.divideandconquer;

/**
 * 
 * @author amir.ansari
 *Every single character is a palindrome of length 1
  L(i, i) = 1 for all indexes i in given sequence

   // IF first and last characters are not same
    If (X[i] != X[j])  L(i, j) =  max{L(i + 1, j),L(i, j - 1)} 

    // If there are only 2 characters and both are same
    Else if (j == i + 1) L(i, j) = 2  

    // If there are more than two characters, and first and last 
    // characters are same
    Else L(i, j) =  L(i + 1, j - 1) + 2 
 */
public class TestLongestPalindromicSubsequence {
	 
	static int lps(char seq[], int i, int j) {
		
		//base case 1: if there is only one character
		if(i == j)
			return 1;
		
		//base case 2: if there are only 2 characters and both are same  
		if(seq[i] == seq[j] && i +1 == j) {
			return 2;
		}
		
		// If the first and last characters match
		 if(seq[i] == seq[j])
			 return lps(seq, i +1 , j -1) + 2;
		 
		// If the first and last characters do not match  
			return Math.max(lps(seq, i,j -1),lps(seq, i +1, j));
	}
	
	
	
	
	  /* Driver program to test above function */
    public static void main(String[] args) { 
        String seq = "GEEKSFORGEEKS"; 
        int n = seq.length(); 
        System.out.printf("The length of the LPS is %d", lps(seq.toCharArray(), 0, n - 1)); 
  
    } 
	
	

}
