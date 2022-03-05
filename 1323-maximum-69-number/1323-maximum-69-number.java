class Solution {
    public int maximum69Number (int num) {
        String str = "" + num;
        char[] arr = str.toCharArray();
        for(int i=0;i<arr.length;i++)
            if(arr[i]=='6'){
                arr[i] = '9';
                break;
            }
        String res = "";
        for(int j=0;j<arr.length;j++)
            res += arr[j];
        return Integer.parseInt(res);
    }  
}