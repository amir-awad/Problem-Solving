class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        
        for(int i=0; i <= n; i++){
            if(i!=0&&Math.log(i)%2==0)
                arr[i] = 1;
            else{
                String s = Integer.toBinaryString(i);
                arr[i] = count1s(s);
            }
        }
        return arr;
    }
    
    public static int count1s(String s){
        int ans=0;
        for(int i=0;i < s.length(); i++)
            if(s.charAt(i)=='1')
                ans++;
        return ans;
    }
}