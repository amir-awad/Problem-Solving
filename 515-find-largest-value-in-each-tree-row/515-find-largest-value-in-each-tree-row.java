/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
   public List<Integer> largestValues(TreeNode root) {
        
        List<List<Integer>> arr = new ArrayList<List<Integer>>();
        
        List<List<Integer>> ll = levelOrder(root,arr);
        List<Integer> l = new ArrayList<Integer>();
        
        for(int i=0; i < ll.size();i++){
            List<Integer> tmp = ll.get(i);
            Collections.sort(tmp);
            l.add(tmp.get(tmp.size()-1));
        }
        
        return l;
    }
    
    
     public List<List<Integer>> levelOrder(TreeNode root, List<List<Integer>> arr){
        // if(root==null)
        //     return;
        for(int i=0;i <= height(root);i++){
            List<Integer> al = new ArrayList<Integer>();
            arr.add(getLevelElems(root,al,0,i));
        }
        
        return arr;
    }
    
    public List<Integer> getLevelElems(TreeNode root,List<Integer> al,int currLev ,int level){
        if(root==null)
            return al;
        if(currLev == level){
            al.add(root.val);
        }
        
        getLevelElems(root.left,al,currLev+1,level);
        getLevelElems(root.right,al,currLev+1,level);
        
        return al;
    }
    
    public int height(TreeNode root){
        if(root==null)
            return -1;
        int left_Height = height(root.left);
        int right_Height = height(root.right);
        
        return Math.max(left_Height,right_Height) + 1;
    }
}