class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] rearrangedArr = new int[n];
        int left = 0;
        int right = n - 1;
        for(int i = 0, j = n - 1; i < n; i++, j--) {
            if(nums[i] < pivot) {
                rearrangedArr[left++] = nums[i];
            } if(nums[j] > pivot) {
                rearrangedArr[right--] = nums[j];
            }
        }
        
        while(left <= right) {
            rearrangedArr[left++] = pivot;
            rearrangedArr[right--] = pivot;
        }
        
        return rearrangedArr;
    }
}