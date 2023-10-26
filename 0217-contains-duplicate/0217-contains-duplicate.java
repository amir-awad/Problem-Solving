class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> values = new HashSet<>();
        
        for(int x : nums) {
            if(values.contains(x))
                return true;
            values.add(x);
        }
        
        return false;
    }
}