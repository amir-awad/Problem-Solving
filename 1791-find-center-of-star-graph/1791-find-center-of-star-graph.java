class Solution {
    public int findCenter(int[][] edges) {
        
        Arrays.sort(edges[0]);
        Arrays.sort(edges[1]);
        
        return edges[0][0]==edges[1][0]?edges[0][0]:edges[0][1];
        
    }
}