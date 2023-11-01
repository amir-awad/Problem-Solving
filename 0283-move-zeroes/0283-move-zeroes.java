class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int zeros = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i] == 0) {
                zeros++;
            } else if(zeros > 0) {
                nums[i - zeros] = nums[i];
                nums[i] = 0;
            }
        }
    }
}