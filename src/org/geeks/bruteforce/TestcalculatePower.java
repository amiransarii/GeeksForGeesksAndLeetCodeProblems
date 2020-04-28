package org.geeks.bruteforce;

public class TestcalculatePower {
	
	 static int getPower(int x, int n) {
		
		 //base case
		  if(n == 0) {
			  return 1;
		  }
		  
		  else if(n == 1) {
			  return x;
		  }
		  	  
		  return x*getPower(x, n -1);
	
	}
	 
	  public static void main(String args[]) {
		  
		  int x = 123456;
		  int n = 3;
		  
		  System.out.println(getReverseNumber(x));
		  
		   if(getPower(x, n) > Integer.MAX_VALUE) {
			   int result = getPower(x, n) % 1000000007;
			   System.out.println(result);
		   }
		   else {
			   int result = getPower(x, n) % 1000000007;
			   System.out.println(result);   
		   }
		  
		  //int result = getPower(x, n);
		  
		  
		  //System.out.println(result);
		    
	  }
	  
	  
	  
	  private static int getReverseNumber(int number) {
		  
		  int rev = 0;
		  while(number != 0) {
			  
			  int rem = number % 10;
			  rev = rev*10 + rem;
			  number /= 10;
			  
		  }
		  
		  return rev;
		  	  
	  }
	  
	  

}
