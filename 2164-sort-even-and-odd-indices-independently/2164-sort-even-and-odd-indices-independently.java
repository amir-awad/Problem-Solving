class Solution {
    public int[] sortEvenOdd(int[] nums) {
        if(nums.length<=2)
            return nums;
        PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>();
    
        for(int i=0; i<nums.length;i++){
            if(i%2==0){
                pq1.add(nums[i]);
            }
            else{
                pq2.add(-1*nums[i]);
            }
        }
        
        for(int i=0;i < nums.length;i++){
            if(i%2==0)
                nums[i] = pq1.poll();
            else
                nums[i] = -1*pq2.poll();
        }
        
        return nums;
        
    }
}