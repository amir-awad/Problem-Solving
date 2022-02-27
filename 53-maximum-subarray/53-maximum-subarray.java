class Solution {
    public int maxSubArray(int[] nums) {
        int sum1 = nums[0];
        int sum2= sum1;
        for(int i=1; i < nums.length;i++){
            sum1 = Math.max(sum1+nums[i] , nums[i]);
            sum2 = Math.max(sum2, sum1);
        }
        return sum2;
    }

    
}