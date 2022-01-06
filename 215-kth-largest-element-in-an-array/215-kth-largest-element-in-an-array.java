class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        for(int i=0; i < k;i++){
            for(int j = 0; j < nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int tmp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = tmp;
                }   
            }
        }
        
        return nums[nums.length-k];
    }
}