class Solution {
    static int[] prices;
    static int[] memo;
    
    public int maxProfit(int[] prices) {
        this.prices = prices.clone();
        memo = new int[prices.length];
        int profit=0;
        if(prices.length>10000){
            for(int i=0;i<prices.length;i+=1000){
                solve(i);
            }
        }
        else{    
            for(int i=0;i<prices.length;i++){
                solve(i);
            }
        }
        
        for(int i=0;i < prices.length;i++)
            profit = Math.max(profit, memo[i]-prices[i]);
        
        return profit;
        
    }
    
    
    public int solve(int index){
        if(index == prices.length-1)
            return prices[prices.length-1];
        if(index == prices.length)
            return 0;
        if(memo[index]!=0)
            return memo[index];
        
        return memo[index] = Math.max(solve(index+1), prices[index]);
    }
    
}