package org.geeks.bruteforce;

public class TestBestTimeToBuyStock {
	
	
	static int getProfit(int [] prices, int n) {
	   
		int maxProfit = Integer.MIN_VALUE;
		
		for(int i = 0; i < n; i++) {
			
			for(int j = i +1 ; j < n; j++) {
				
				int profit = prices[j] - prices[i];
				
				if(profit > maxProfit)
					maxProfit = profit;
				
			}
			
		}
		return maxProfit;
	 }
	

}
