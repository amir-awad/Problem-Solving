class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        Stack<String> words = new Stack<>();
        
        String word = "";
        for(int i = 0; i < n;) {
            if(s.charAt(i) == ' ' && !word.equals("")) {
                words.push(word);
                word = "";
            }
            while(i < n && s.charAt(i) == ' ') {
                i++;
            }
            
            if(i >= n)
                break;
            word += s.charAt(i);
            i++;
        }
        
        if(!word.equals("")) {
            words.push(word);
        }
        
        String ans = "";
        while(!words.isEmpty()) {
            ans += words.pop() + " ";
        }
        
        return ans.substring(0, ans.length() - 1);
    }
}