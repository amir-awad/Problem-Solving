class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder s1 = new StringBuilder(s);
        while(s1.toString().contains("#")){
            for(int i=0;i<s1.length();){
                if(s1.charAt(i)=='#') {
                    if(i!=0)
                        s1 = new StringBuilder(s1.toString().substring(0,i-1)+s1.toString().substring(i+1,s1.length()));
                    else
                        s1 = new StringBuilder(s1.toString().substring(1,s1.length()));
                    i=0;
                }
                else i++;
            }
        }
        
        
        StringBuilder t1 = new StringBuilder(t);
        while(t1.toString().contains("#")){
            for(int i=0;i<t1.length();){
                if(t1.charAt(i)=='#') {
                    if(i!=0)
                        t1 = new StringBuilder(t1.toString().substring(0,i-1)+t1.toString().substring(i+1,t1.length()));
                    else
                        t1 = new StringBuilder(t1.toString().substring(1,t1.length()));
                    i=0;
                        
                }
                else i++;
            }
        }
        
         System.out.println(s1 + " " + t1);
        
        return s1.toString().equals(t1.toString());
    }
    
}