package org.geeks.divideandconquer;

/**
 * 
 * @author amir.ansari
 * Given a value V, if we want to make change for V cents, and we have infinite supply 
 * of each of C = { C1, C2, .. , Cm} valued coins, what is the minimum number of coins to make the change?
 *If V == 0, then 0 coins required.
  If V > 0
   minCoins(coins[0..m-1], V) = min {1 + minCoins(V-coin[i])} 
                               where i varies from 0 to m-1 
                               and coin[i] <= V 
 */
public class TestNumberOfCoins {
	
	
	// m is size of coins array (number of different coins)
	static int minCoins(int[] coins, int m, int V) {
		
		//base case
		if(V == 0)
			return 0;
		
		//initialize result
		int res = Integer.MAX_VALUE;
		
		 // Try every coin that has smaller value than V 
	       for (int i=0; i<m; i++) 
	       { 
	         if (coins[i] <= V) 
	         { 
	             int sub_res = minCoins(coins, m, V-coins[i]); 
	       
	             // Check for INT_MAX to avoid overflow and see if 
	             // result can minimized 
	             if (sub_res != Integer.MAX_VALUE && sub_res + 1 < res) 
	                res = sub_res + 1; 
	         } 
	       } 
	       return res; 
	}
	
	 public static void main(String args[]) 
	    { 
	       int coins[] =  {9, 6, 5, 1}; 
	       int m = coins.length; 
	       int V = 11; 
	       System.out.println("Minimum coins required is "+ minCoins(coins, m, V) ); 
	    } 

}
