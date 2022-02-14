class Solution {
    public int numTrees(int n) {
        int [] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            int ans = 0;
            for(int j = i - 1, k = 0; j >= 0; j--, k++){
                int prod = dp[j] * dp[k];
                ans += prod;
            }
            dp[i] = ans;
        }
        return dp[n];
    }
}