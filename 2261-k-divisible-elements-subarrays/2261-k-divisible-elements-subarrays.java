class Solution {
    public int countDistinct(int[] nums, int k, int p) {
        HashSet<String> set = new HashSet<>();
        for(int i=0; i<nums.length; i++) {
            for(int j=i; j<nums.length; j++) {
                int count=0;
                StringBuilder sb = new StringBuilder();
                for(int r=i; r<=j; r++) {
                    sb.append(nums[r]).append("-");
                    if(nums[r]%p == 0) count++;
                    if (count>k) break;
                }
                if (count<=k) set.add(sb.toString());
            }
        }
        return set.size();
    }
}