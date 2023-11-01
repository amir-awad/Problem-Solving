class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int countZeros = 0;
        for(int i = 0; i < n;i++) {
            if(nums[i] == 0) {
                countZeros++;
            }
        }
        for(int i = 0, j = 0; i < n; i++) {
            if(nums[i] != 0 ){
                nums[j] = nums[i];
                j++;
            }
        }
        
        for(int i = n - countZeros; i < n; i++) {
            nums[i] = 0;
        }
    }
}