class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==1)
            return 1;
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int odd=0;
        int ans=0;
        int i;
        for(i=0;i < arr.length-1;){
            if(arr[i]==arr[i+1]){
                ans+=2;
                i+=2;
            }
            else{
                odd++;
                i++;
            }
        }
        if(i==arr.length-1) odd++;
        if(odd>0)
            ans++;
        return ans;
        }
}