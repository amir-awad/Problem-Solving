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
        int maxLen=length[0];
        for(int i=1;i<length.length;i++){
                if(length[i]>maxLen)
                    maxLen=length[i];
        }
        
        return maxLen;
    }
}