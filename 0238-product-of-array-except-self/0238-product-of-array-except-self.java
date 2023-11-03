class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zeros = 0;
        for(int x : nums) {
            if(x == 0) {
                zeros++;
            }
            else  {
                product *= x;   
            }
        }
        int len = nums.length;
        for(int i = 0; i < len; i++) {
            if(zeros == 1) {
                if(nums[i] == 0) {
                    nums[i] = product;
                } else {
                    nums[i] = 0;
                }
            } else if(zeros > 1) {
                nums[i] = 0;
            } else {
                nums[i] = product / nums[i];
            }
        }
        
        return nums;
    }
}