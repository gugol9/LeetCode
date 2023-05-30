package com.company.Top100.Easy;

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int max = 0;

        for (int i = 0; i < prices.length; i++){
            for (int j = i+1; j < prices.length; j++){
                if (prices[j] - prices[i] > max) max = prices[j]-prices[i];
            }
        }
        return max;
    }
}

/* duzo lepiej dziala
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++){
            if (prices[i] < min)min = prices[i];

            if (maxProfit < prices[i]-min){
                maxProfit = prices[i] - min;
            }

        }
return maxProfit;


    }
}
 */