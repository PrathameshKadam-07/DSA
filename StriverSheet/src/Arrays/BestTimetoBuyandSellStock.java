package Arrays;

public class BestTimetoBuyandSellStock {
	   public int maxProfit(int[] prices) {
	        int minPrice = Integer.MAX_VALUE;
	        int maxProfit = 0;

	        for (int price : prices) {
	            // Step 1: update minimum price (best buying point)
	            if (price < minPrice) {
	                minPrice = price;
	            }

	            // Step 2: calculate profit if sold today
	            int profit = price - minPrice;

	            // Step 3: update max profit
	            if (profit > maxProfit) {
	                maxProfit = profit;
	            }
	        }

	        return maxProfit;
	    }
}
