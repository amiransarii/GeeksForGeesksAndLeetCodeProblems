package org.geeks.bruteforce;

/**
 * 
 * @author amir.ansari
 *Ugly numbers are numbers whose only prime factors are 2, 3 or 5. 
 *The sequence 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, … shows the first 11 ugly numbers.
 * By convention, 1 is included
 */
/**
 * Method 1 (Simple)
Loop for all positive integers until ugly number count is smaller than n, 
if an integer is ugly than increment ugly number count.
 */

public class TestUglyNumbersUsingBruteForce {

	 /*This function divides a by greatest 
    divisible power of b*/
	
	static int maxDivide(int a , int b) {
		while (a % b == 0)
			a = a/b;
		
		return a;
		
	}
	
	 /* Function to check if a number  
    is ugly or not */
	
	static int isUgly(int no) {
		
		no = maxDivide(no, 2);
		no = maxDivide(no, 3);
		no = maxDivide(no, 5);
		
		return (no == 1) ? 1:0;
		
	}
	
	
	  /* Function to get the nth ugly  
    number*/
	private static int getNthUglyNo(int n) {
		
		 int i = 1;
		 
		 // ugly number count  
		 int count = 1;
		 
		  // check for all integers  
	       // until count becomes n  
		
		while(n > count) {
			i++;
			if(isUgly(i) ==1)
				count++;
		}
		return i;
	}
	
	   /* Driver program to test above 
    functions */
    public static void main(String args[]) 
    { 
        int no = getNthUglyNo(150); 
        System.out.println("150th ugly "
                       + "no. is "+ no); 
    } 
	
}
