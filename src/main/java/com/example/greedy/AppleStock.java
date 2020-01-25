package com.example.greedy;

public class AppleStock {

	public static void main(String[] args) {
		int[] stockPrices = new int[] {10, 7, 5, 8, 11, 9};

		int profit = getMaxProfit(stockPrices);
		System.out.println(profit);

	}

	private static int getMaxProfit(int[] stockPrices) {
		
		int minPrice=stockPrices[0];
		int maxProfit=0;
		int currentProfit=0;
		
		for(int i=1; i<stockPrices.length; i++) {
			minPrice =Math.min(minPrice, stockPrices[i]);
			currentProfit = stockPrices[i]-minPrice;
			maxProfit = Math.max(currentProfit, maxProfit);
		}
		
		return maxProfit;
	}

}
