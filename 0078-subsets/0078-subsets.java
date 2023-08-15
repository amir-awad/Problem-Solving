class Solution {
    static List<List<Integer>> output;
    public List<List<Integer>> subsets(int[] nums) {
        output = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        generateAllSubsets(0, nums, temp);
        return output;
    }

    public static void generateAllSubsets(int idx, int[] nums, List<Integer> temp) {
        output.add(new ArrayList<>(temp));
        if(idx >= nums.length)
            return;

        for(int i = idx; i < nums.length; i++) {
            if(i > idx && nums[i] == nums[i - 1])
                continue;
            temp.add(nums[i]);
            generateAllSubsets(i + 1, nums, temp);
            temp.remove((Integer) nums[i]);
        }

    }
}