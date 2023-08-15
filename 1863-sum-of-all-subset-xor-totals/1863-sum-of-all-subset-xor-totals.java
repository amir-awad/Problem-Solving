class Solution {
    
    public int subsetXORSum(int[] nums) {
        return sumOfXORsOfAllSubsets(0, nums, 0);
    }

    public static int sumOfXORsOfAllSubsets(int idx, int[] nums, int currentXOR) {
        if(idx == nums.length)
            return currentXOR;
        
        int take = sumOfXORsOfAllSubsets(idx+1, nums, currentXOR ^ nums[idx]);
        int leave = sumOfXORsOfAllSubsets(idx+1, nums, currentXOR);

        return take + leave;
    }
}