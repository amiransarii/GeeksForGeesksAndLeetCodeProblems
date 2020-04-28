package org.geeks.dynamicprogramming;

public class TestFibonacciNumbers {
	
	  public static void main (String args[]) 
	    { 
	    int n = 9; 
	    System.out.println(fib(n)); 
	    } 
	
	
	   private static int fib(int n) {
		   int[] dp = new int[n +1];
		   
		   return getFibonacciNumber(dp, n);
	   }
	
  private static int getFibonacciNumber(int[]dp, int n) {
	         
	     if(n  < 1)
	    	 return 0;
	     
	     //base case
	      if( n  == 1 || n == 2) {
	    	  return n - 1;
	      }
	  
	      
	      if(dp[n] == 0) {
	    	  dp[n] = getFibonacciNumber(dp, n -1) + getFibonacciNumber(dp, n -2);
	      }
	    return dp[n];
	  
  }
}
