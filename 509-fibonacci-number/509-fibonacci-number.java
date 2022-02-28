class Solution {
    static int[] memo;
    
    public int fib(int n) {
        memo = new int[31];
        return solve(n);
    }
    
    public int solve(int n){
        if(n==0) return 0;
        if(n==1||n==2) return 1;
        
        if(memo[n]!=0)
            return memo[n];
        return memo[n] = solve(n-1)+solve(n-2);
    }
    
    
}