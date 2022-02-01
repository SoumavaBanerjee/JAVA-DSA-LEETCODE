class Solution {
    
    
    public int maxProfit(int[] prices) {
        
        int maxProfitTillNow = 0;
        int minimumToLeft = Integer.MAX_VALUE;
        
        
        for(int i=0; i<prices.length; i++) {
            
            if(prices[i] < minimumToLeft)
                minimumToLeft = prices[i];
            
            int profit = prices[i] - minimumToLeft;
            
            if(profit > maxProfitTillNow)
                maxProfitTillNow = profit;
        }
        
        return maxProfitTillNow;
    }
}