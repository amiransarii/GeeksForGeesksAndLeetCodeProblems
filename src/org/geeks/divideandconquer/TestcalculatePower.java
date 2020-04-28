package org.geeks.divideandconquer;

public class TestcalculatePower {
	
	static float power(float x, int y) {
		
		float temp;
		
		if(y == 0)
			return 1;
		
		temp = power(x, y/2);
		
		if(y % 2 == 0) //even power
			return temp*temp;
		
		else {
			
			if(y > 0 ) {
				return x*temp*temp;
			}
			else
                return (temp * temp) / x; 
			
		}
		
	}
	/* Program to test function power */
    public static void main(String[] args) 
    { 
        float x = 2; 
        int y = 4; 
        System.out.printf("%f", power(x, y)); 
    } 
}
