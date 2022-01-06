class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        
        for(int i=0; i < nums.length;i++){
			//we add each element*-1
            pq.add(nums[i]*-1);
        }
		// Applying the first test case, pq would be  -1,-2,-3,-4,-5,-6(peek)

        while(k-->1)
			// delete k-1 elements 
            pq.poll();
			
        return pq.poll()*-1; // return the Kth largest element
    }
    
}