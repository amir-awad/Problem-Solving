class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans = new StringBuilder();
        
        for(int i=0, j=0; i < word1.length() && j < word2.length();i++, j++) {
            ans.append(word1.charAt(i));
            ans.append(word2.charAt(j));
        }
        
        if (word1.length() > word2.length()) {
            ans.append(word1.substring(word2.length(), word1.length()));
        } else if (word2.length() > word1.length()) {
            ans.append(word2.substring(word1.length(), word2.length()));
        }
        
        
        return ans.toString();
    }
}