class Solution {
    public String customSortString(String order, String s) {
        int[] cnt = new int[26];
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            cnt[c - 'a']++;
        }
        
        StringBuilder ans = new StringBuilder();
        for(char c : order.toCharArray()) {
            while(cnt[c - 'a']-- > 0) {
                ans.append(c);
            }
        }
        
        for(char c : s.toCharArray()) {
            while(cnt[c - 'a']-- > 0) {
                ans.append(c);
            }
        }
        
        return ans.toString();
    }
}