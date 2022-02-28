class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] length = new int[nums.length];
        
        for(int k=0;k< nums.length;k++){
            length[k]=1;
            
            for(int i=0;i<k;i++){
                if(nums[i]<nums[k])
                    length[k] = Math.max(length[k], length[i]+1);
            }
        }
        Arrays.sort(length);
        return length[nums.length-1];
    }
}