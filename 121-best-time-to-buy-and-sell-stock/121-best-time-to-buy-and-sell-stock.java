class Solution {
    
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] max = new int[prices.length];
        max[n-1] = prices[n-1];
        for(int i = n-2;i>=0;i--){
            max[i] = Math.max(max[i+1], prices[i]);
        }
        
        int profit =0;
        for(int j=0;j<prices.length;j++){
            profit = Math.max(profit, max[j]-prices[j]);
        }
        return profit;
    }
}