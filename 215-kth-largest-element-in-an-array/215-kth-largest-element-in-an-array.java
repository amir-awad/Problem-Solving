class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        
        for(int i=0; i < nums.length;i++){
            pq.add(nums[i]*-1);
        }
        
        while(k-->1)
            pq.poll();
        return pq.poll()*-1;
    }
    
}