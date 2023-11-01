class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        int len = s.length();
        int i = 0, j = len - 1;
        while (i < j) {
            while(!vowels.contains(s.charAt(i)) && i < j) {
                i++;
            }
            
            while(!vowels.contains(s.charAt(j)) && j > i) {
                j--;
            }
            
            if(i == j)
                break;
            
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            
            s = s.substring(0, i) + c2 + s.substring(i + 1, j) + c1 + s.substring(j + 1, len);
            
            i++;
            j--;
        }
        
        return s;
    }
}