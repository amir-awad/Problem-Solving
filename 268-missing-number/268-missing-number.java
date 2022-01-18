class Solution {
    public int missingNumber(int[] nums) {
        boolean[] arr =  new boolean[nums.length+1];
        
        for(int i=0;i<nums.length;i++){
            arr[nums[i]] = true;
        }
        int res=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]==false){
                res = j;
                break;
            }
        }
        
        return res;
    }
}