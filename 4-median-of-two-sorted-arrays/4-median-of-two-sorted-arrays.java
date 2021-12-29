class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int m = nums1.length; int n = nums2.length;
        
        int[] arr = new int[m+n];
        
        int index1 = 0;
        int index2 = 0;
        int i=0;
        for(; i < arr.length && index1<m && index2<n;i++){
          
            if(nums1[index1] <= nums2[index2]){
                arr[i] = nums1[index1];
                index1++;
            }
            
            else{
                arr[i] = nums2[index2];           
                index2++;
            }
        }
        
        while(index1<m){
            arr[i] = nums1[index1];
            index1++;
            i++;
        }
        
        while(index2<n){
            arr[i] = nums2[index2];
            index2++;
            i++;
        }
        
        double median=0;
        if(arr.length%2==0){
            median = (arr[arr.length/2 -1] + arr[arr.length/2])/2.0;
        }
        
        else median = arr[arr.length/2];
        return median;
    }
    
}