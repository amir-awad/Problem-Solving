class Solution {
    static int[] nums;
    static int[] memo;
    
    public int rob(int[] nums) {
        this.nums = nums;
        memo = new int[nums.length];  
        Arrays.fill(memo, -1);
            
        return Math.max(solve(0), solve(1));
        
    }
    
    public static int solve(int i){
        if(i>=nums.length){
            return 0;
        }
        
        if(memo[i] !=-1)
            return memo[i];
        
        return memo[i] = nums[i] + Math.max(solve(i+2), solve(i+3));
        
    }
    
    
   
}