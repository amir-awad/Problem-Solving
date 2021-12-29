class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        String str = "";
        
        for(int i=0;i < s.length();i++){
            if(vowels.contains(s.charAt(i)+""))
                str+=s.charAt(i);
        }
        
        String res="";
        int j=str.length()-1;
        
        for(int i=0;i<s.length();i++){
            if(vowels.contains(s.charAt(i)+"")&&j>=0){
                res += str.charAt(j);
                j--;
            }
            else res+= s.charAt(i);
            
        }
        
        return res;
        
    }
}