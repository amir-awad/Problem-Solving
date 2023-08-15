class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;

        List<List<Integer>> ans = new ArrayList<>();
        int minDifference = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            if(i > 0 && nums[i] == nums[i-1])
                continue;
            for(int j = i + 1; j < n; j++) {
                if(j > i + 1 && nums[j] == nums[j-1])
                    continue;
                for(int k = j + 1; k < n; k++) {
                    if(k > j + 1 && nums[k] == nums[k-1])
                        continue;
                    for(int l = k + 1; l < n; l++) {
                        if(l > k + 1 && nums[l] == nums[l-1])
                            continue;
                        long currSum = 1l * nums[i] + nums[j] + nums[k] + nums[l];
                        if(currSum == target) {
                            ans.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        }
                    }
                }
            }
        }

        return ans;
    }
}