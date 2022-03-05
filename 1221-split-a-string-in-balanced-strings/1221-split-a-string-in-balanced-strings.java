class Solution {
    public int balancedStringSplit(String s) {
        if(s.length()==1)
            return 0;
        int ans=0;
        int countR=0;
        int countL = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R')
                countR++;
            else if(s.charAt(i)=='L')
                countL++;
            if(countR==countL){
                ans++;
                countR=0;
                countL =0;
            }
            
        }
        
        return ans;
    }
}