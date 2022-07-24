class Solution {
    public List<List<Integer>> generate(int n) {
        
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        for(int i=0;i<n;i++){
            List<Integer> row = new ArrayList<>();
            if(i==0){
                row.add(1);
            } else if(i==1){
                row.add(1);
                row.add(1);
            } else{
              row.add(1);
              for(int j=0;j<i-1;j++)
                row.add(res.get(i-1).get(j) + res.get(i-1).get(j+1));
              row.add(1);  
            }
            
            res.add(row);
        }
        
        return res;
    }
    
    
}