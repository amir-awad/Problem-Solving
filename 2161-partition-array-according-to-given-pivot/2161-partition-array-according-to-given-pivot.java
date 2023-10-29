class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        LinkedList<Integer> before = new LinkedList<>();
        LinkedList<Integer> after = new LinkedList<>();
        
        int pivotCount = 0;
        for(int x : nums) {
            if(x < pivot) {
                before.addLast(x);
            } else if(x == pivot) {
                pivotCount++;
            } else {
                after.addLast(x);
            }
        }
        
        int n = nums.length;
        int[] rearrangedArr = new int[n];
        
        int i = 0;
        while(!before.isEmpty()) {
            rearrangedArr[i++] = before.removeFirst();
        }
        
        while(pivotCount-- > 0) {
            rearrangedArr[i++] = pivot;
        }
        
        while(!after.isEmpty()) {
            rearrangedArr[i++] = after.removeFirst();
        }
        
        return rearrangedArr;
    }
}