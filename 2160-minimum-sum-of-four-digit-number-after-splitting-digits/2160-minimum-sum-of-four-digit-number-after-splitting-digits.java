class Solution {
    
    public int minimumSum(int num) {
        String str = "" + num;
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return Integer.parseInt("" + arr[0] + arr[2]) + Integer.parseInt("" + arr[1] + arr[3]);
    }
}