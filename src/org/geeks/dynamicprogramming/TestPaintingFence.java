package org.geeks.dynamicprogramming;

import java.util.Arrays;

/**https://www.geeksforgeeks.org/painting-fence-algorithm/
 * 
 * @author amir.ansari
 * Given a fence with n posts and k colors, find out the number of ways of painting the fence such
 *  that at most 2 adjacent posts have the same color.
 *  Since answer can be large return it modulo 10^9 + 7
 *  
 *  Input : n = 2 k = 4
 *  Output : 16
 *  We have 4 colors and 2 posts.
 *  Ways when both posts have same color : 4 
 *  Ways when both posts have diff color :
 *  4*(choices for 1st post) * 3(choices for 
 *  2nd post) = 12
 *  Input : n = 3 k = 2
 *  Output : 6
 */
public class TestPaintingFence {
	
	
	 // Returns count of ways to color k posts 
    // using k colors 
	static long countWays(int n, int k) {
		
		
		// To store results for subproblems 
		long [] dp = new long[n +1];
		Arrays.fill(dp, 0);
		int mod = 1000000007; 
		
		 // There are k ways to color first post 
		dp[1] = k;
		
		 // There are 0 ways for single post to 
        // violate (same color_ and k ways to 
        // not violate (different color) 
		int same = 0;
		int diff = k;
		
		// Fill for 2 posts onwards 
		for(int i = 2; i <= n ; i++) {
			
			// Current same is same as previous diff 
			same = diff;
			
			// We always have k-1 choices for next post 
			diff = (int)(dp[ i -1])*(k -1);
			diff = diff % mod;
			
			 // Total choices till i. 
			dp[i] = (same +diff) % mod;
		}
		
		return dp[n];
		
		
		
		
	}
	
	  // Driver code 
    public static void main(String[] args) 
    { 
        int n = 3, k = 2; 
        System.out.println(countWays(n, k)); 
    } 
	
	
	
	

}
