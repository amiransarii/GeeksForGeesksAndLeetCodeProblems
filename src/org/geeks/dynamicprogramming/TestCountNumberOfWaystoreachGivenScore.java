package org.geeks.dynamicprogramming;

import java.util.Arrays;

//https://www.geeksforgeeks.org/count-number-ways-reach-given-score-game/
public class TestCountNumberOfWaystoreachGivenScore {

	/**
	 * Consider a game where a player can score 3 or 5 or 10 points in a move. 
	 * Given a total score n, find number of ways to reach the given score.
	 * 
	 * The idea is to create a table of size n+1 to store counts of all scores from 0 to n. For every possible 
	 * move (3, 5 and 10), increment values in table
	 */
	
	 //return the ways
	  static int count(int n) {
		  
		  // table[i] will store count of solutions for 
	       // value i. 
		  
		  int [] table = new int[n + 1];
		  int i;
		  
		  // Initialize all table values as 0 
		  Arrays.fill(table, 0);
		  
		  //base case if given value is 0
		  table[0] = 1;
		  
		  
		    // One by one consider given 3  
	        // moves and update the table[] 
	        // values after the index greater  
	        // than or equal to the value of  
	        // the picked move 
		  
		  for(i = 3 ; i <= n; i++)
			  table[i] += table[i -3 ];
		  
		  for(i = 5; i <= n ; i++)
			  table[i] += table[i - 5 ];
		  
		  for(i = 10 ; i <= n; i++)
			  table[i] += table[i - 10];
		  
		  return table[n];
	  }
	
	  // Driver code 
	    public static void main (String[] args)  
	    { 
	        int n = 20; 
	        System.out.println("Count for "+n+" is "+count(n)); 
	      
	        n = 13; 
	        System.out.println("Count for "+n+" is "+count(n)); 
	    } 
}
