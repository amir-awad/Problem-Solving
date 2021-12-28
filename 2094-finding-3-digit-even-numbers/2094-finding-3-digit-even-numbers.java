class Solution {

    public int[] findEvenNumbers(int[] digits) {
        
        int n = digits.length;
        Arrays.sort(digits);
        
        
        ArrayList<Integer> al = new ArrayList<Integer>();
        
        //it's clear that all the numbers are between 100 and 998 inclusive
        for(int i=100;i<=998;){
            
            boolean flag = exists(i,digits);
            if(flag)
                al.add(i);
            i+=2;
                
        }
        
        int[] res= new int[al.size()];
        for(int i=0;i<al.size();i++)
            res[i] = (int)al.get(i);
        
        
        return res;
    
    }
    
    
    public boolean exists(int num, int[] arr){
        int d1= num%10;
        int d2 = (num/10)%10;
        int d3 = (num/100)%10;
        
        //check if num's digits are in arr;          
        boolean f = binarySearch(d1,arr)&&binarySearch(d2,arr)&&binarySearch(d3,arr);
        if(!f) return false;
        
        //we found out that the digits are in arr ,but what about their occurances? Let's check:
       if(d1!=d2&&d2!=d3&&d1!=d3) return true;
		if(d1==d2&&d1==d3)
		{
			if(countDups(d1,arr)>=3)
				return true;
			return false;
		} 
		if(d1==d2) {
			if(countDups(d1,arr) >= 2)
				return true;
			return false;
		}
		if(d1==d3) {
			if(countDups(d1,arr) >= 2)
				return true;
			return false;
		}
		if(d2==d3) {
			if(countDups(d2,arr) >= 2)
				return true;
			return false;
		}
        
        return false;
        
        
    }
        
    // check if some digit is in arr
    public boolean binarySearch(int d,int[] arr){
        int lo=0;
        int hi = arr.length-1;
        
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]==d)
                return true;
            else if(arr[mid]>d)
                hi=mid-1;
            else if(arr[mid] <d)
                lo = mid+1;
        }
        
        return false;
    }
    
    // count number of duplicates of an element in arr
    public static int countDups(int d,int[]arr){
        int count=0;
        
        for(int i=0; i < arr.length;i++){
            if(arr[i]==d)
                count++;
        }
        
        return count;
        
    }
        
        
}
