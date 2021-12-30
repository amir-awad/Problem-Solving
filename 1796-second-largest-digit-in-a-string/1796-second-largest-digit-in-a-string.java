class Solution {
    public int secondHighest(String s) {
        HashSet<Integer> hs = new HashSet<Integer>();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0'&&s.charAt(i)<='9')
                hs.add(Integer.parseInt(""+s.charAt(i)));
        }
        
        if(hs.size()<2) return -1;
        
        ArrayList<Integer> al = new ArrayList<Integer>();
        
        for(Integer elem:hs)
            al.add(elem);
        
        Collections.sort(al);
        return al.get(al.size()-2);
        
    }


}

