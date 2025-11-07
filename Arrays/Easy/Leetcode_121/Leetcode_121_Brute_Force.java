class Solution {
    public int maxProfit(int[] prices) {
        // Brute Force
        int n = prices.length;
        int maxProfit = Integer.MIN_VALUE;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                int profit = prices[j] - prices[i];
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        if(maxProfit<=0){
            return 0;
        }
        return maxProfit;
    }
}
