class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        
        int size=0;
        int tmp=x;
        
        while(tmp>0){
            tmp /=10;
            size++;
        }
        
        int[] arr = new int[size];
        int i=0;
        int tmp2=x;
        while(size-->0){
            arr[i++] = tmp2%10;
            tmp2= tmp2/10;
        }
        
        for(int j=arr.length-1; j >=0;j--){
            if(arr[j] != x%10)
                return false;
            x=x/10;
        }
        
        
        return true;
            
        
    }
}