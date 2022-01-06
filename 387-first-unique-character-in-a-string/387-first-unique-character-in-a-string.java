class Solution {
    public int firstUniqChar(String s) {
        String str1 ="";
        String str2 = "";
        
        for(int i=0;i < s.length();i++){
            char c = s.charAt(i);
            str1 = s.substring(i+1,s.length());
            str2 = s.substring(0,i);
            if(!str1.contains(c+"")&&!str2.contains(c+""))
                return i;
        }
        return -1;
    }
}