class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n < 1) return 0;
        
        int[] minPrices = new int[n];
        int[] maxProfit = new int[n];
        minPrices[0] = prices[0];
        maxProfit[0] = 0;
        
        for (int i = 1; i < n; i++) {
            minPrices[i] = Math.min(minPrices[i-1], prices[i]);
            maxProfit[i] = Math.max(maxProfit[i-1], prices[i] - minPrices[i-1]);
        }
        
        return maxProfit[n-1];
    }
}