package org.geeks.dynamicprogramming;
/**
 * 
 * @author amir.ansari
 *
 */
/*1 Declare an array for ugly numbers:  ugly[n]
2 Initialize first ugly no:  ugly[0] = 1
3 Initialize three array index variables i2, i3, i5 to point to 
   1st element of the ugly array: 
        i2 = i3 = i5 =0; 
4 Initialize 3 choices for the next ugly no:
         next_mulitple_of_2 = ugly[i2]*2;
         next_mulitple_of_3 = ugly[i3]*3
         next_mulitple_of_5 = ugly[i5]*5;
5 Now go in a loop to fill all ugly numbers till 150:
For (i = 1; i < 150; i++ ) 
{
    next_ugly_no  = Min(next_mulitple_of_2,
                        next_mulitple_of_3,
                        next_mulitple_of_5); 

    ugly[i] =  next_ugly_no       

    if (next_ugly_no  == next_mulitple_of_2) 
    {             
        i2 = i2 + 1;        
        next_mulitple_of_2 = ugly[i2]*2;
    } 
    if (next_ugly_no  == next_mulitple_of_3) 
    {             
        i3 = i3 + 1;        
        next_mulitple_of_3 = ugly[i3]*3;
     }            
     if (next_ugly_no  == next_mulitple_of_5)
     {    
        i5 = i5 + 1;        
        next_mulitple_of_5 = ugly[i5]*5;
     } 
     
}*/
public class TestUglyNumbersUsingDynamic {
	
	 static int getNthUglyNumber(int n) {
		 
		 int ugly[] = new int[n];// To store ugly numbers 
		 int i2 = 0 , i3 = 0, i5 = 0;

			int next_multiple_of_2 = 2;
			int next_multiple_of_3 = 3;
			int next_multiple_of_5 = 5;
			int next_ugly_no = 1;
		   
			ugly[0] = 1;
			
			for(int i = 1; i < n ; i++)
			{
				
				next_ugly_no = Math.min(next_multiple_of_2, 
                                  Math.min(next_multiple_of_3, 
                                        next_multiple_of_5));
				
				ugly[i] = next_ugly_no;
				 if (next_ugly_no == next_multiple_of_2) 
		            { 
		               i2 = i2+1; 
		               next_multiple_of_2 = ugly[i2]*2; 
		            } 
		            if (next_ugly_no == next_multiple_of_3) 
		            { 
		               i3 = i3+1; 
		               next_multiple_of_3 = ugly[i3]*3; 
		            } 
		            if (next_ugly_no == next_multiple_of_5) 
		            { 
		               i5 = i5+1; 
		               next_multiple_of_5 = ugly[i5]*5; 
		            } 
				
				
				
				
			}
		 
			return next_ugly_no;
		 
		 
	 }
	
	
	  /* Driver program to test above functions */
	    public static void main(String args[]) 
	    { 
	        int n = 150; 
	       // UglyNumber obj = new UglyNumber(); 
	        System.out.println(getNthUglyNumber(n)); 
	    } 
	
	
	

}
