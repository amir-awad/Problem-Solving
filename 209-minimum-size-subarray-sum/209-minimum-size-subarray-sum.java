class Solution {
   public static int minSubArrayLen(int target, int[] nums) {
		int min=(int)1e5;
		int sum=0;
		int lo=0;
		boolean f = false;
		for(int i=0; i < nums.length;){
			if(sum < target){
				sum+=nums[i];
			}

			else if(sum >= target){
				min = Math.min(min, (i-lo)+1);
				sum-=nums[lo];
				lo++;
				f=true;
			}

			if(sum<target) i++;
		}
		if(!f&&sum<target)
			return 0;
		
		return min;
	}
}