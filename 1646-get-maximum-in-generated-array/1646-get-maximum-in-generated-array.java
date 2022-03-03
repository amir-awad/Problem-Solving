class Solution {
    static int[] dp;
    
    public int getMaximumGenerated(int n) {
        dp = new int[n+1];
        Arrays.fill(dp, -1);
        int max = 0;
        for(int i=0; i <= n;i++){
            dp[i] = solve(i);
            max = Math.max(max ,dp[i]);
        }
        
        return max;
       
    }
    
    
    public int solve(int i){
        if(i==0)
            return dp[i] = 0;
        if(i==1)
            return dp[i] = 1;
        if(dp[i]!=-1)
            return dp[i];
        if(i%2==0)
            return dp[i] = solve(i/2);
        return dp[i] = solve(i/2) + solve(i/2 + 1);
    }
}