package org.geeks.dynamicprogramming;

public class TestBestTimeToBuyStock {
	
	/**
	 * We can maintain two variables - minprice and maxprofit corresponding to 
	 * the smallest valley and maximum profit (maximum difference between selling 
	 * price and minprice)  obtained so far respectively
	 * 
	 * 
	 */
	
	static int maxProfit(int [] prices) {
		
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		
		for(int i = 0 ; i < prices.length ; i++) {
			
			if(prices[i] < minPrice) 
				minPrice = prices[i];
			
			else if(prices[i] - minPrice > maxProfit)
				maxProfit = prices[i] - minPrice;		
		}
		return maxProfit;
	}
	
	

}
