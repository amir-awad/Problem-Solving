class Solution {
    // using the idea of memoization
    static int[] memo;
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        memo = new int[n+1];
        for(int i=0;i<=n;i++){
            arr[i] = solve(i);
        }
        return arr;
    }
    
    public static int solve(int n){
        if(n==0) return 0;
        if(n==1||n==2)
            return 1;
        if(n==3)
            return 2;
        if(memo[n]!=0)
            return memo[n];
        if(n%2==0)
            return memo[n] = solve(n/2);
        
        return memo[n] = 1 + solve(n/2);
    }
}