class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        int len = s.length();
        char[] chars = s.toCharArray();
        int i = 0, j = len - 1;
        while (i < j) {
            while(!vowels.contains(s.charAt(i)) && i < j) {
                i++;
            }
            
            while(!vowels.contains(s.charAt(j)) && j > i) {
                j--;
            }
            
            if (i < j) {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            }
            
        }
        
        return new String(chars);
    }
}