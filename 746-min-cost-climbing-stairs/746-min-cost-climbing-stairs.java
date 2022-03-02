class Solution {
    static int[] cost;
    static int[] memo;
    
    public int minCostClimbingStairs(int[] cost) {
        this.cost = cost;
        memo = new int[cost.length];
        Arrays.fill(memo, -1);
        
        return Math.min(solve(0), solve(1));
    }
    
    public int solve(int index){
        if(index >= cost.length)
            return 0;
        if(memo[index] != -1)
            return memo[index];
        
        return memo[index] = cost[index] + Math.min(solve(index+1),solve(index+2));
    
    }
}