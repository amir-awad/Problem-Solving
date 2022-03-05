class Solution {
    public int minOperations(int[] arr) {
        int ans=0;
        
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                ans += arr[i]-arr[i+1]+1;
                arr[i+1] = arr[i]+1;
            }
        
            if(arr[i]==arr[i+1]){
                ans++;
                arr[i+1]+=1;
            }
        }
        
        return ans;
    }
}