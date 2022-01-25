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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        TreeNode curr = root;
        List<List<Integer>> l = new LinkedList<List<Integer>>();
        if(curr==null) return l;
        List<Integer> tmp = new LinkedList<Integer>();
        
        pathSum(curr,0,targetSum,tmp,l);
        return l;
    }
    
    public void pathSum(TreeNode curr, int sum,int targetSum,List<Integer> tmp ,List<List<Integer>> l){
        if(curr==null){
            return;
        }
        tmp.add(curr.val);
        sum+=curr.val;
        if(curr.left==null&&curr.right==null){
            if(sum==targetSum)
                l.add(new LinkedList<>(tmp));
        }
        else{
            pathSum(curr.left,sum,targetSum,tmp,l);
            pathSum(curr.right,sum,targetSum,tmp,l);
        }
        
        tmp.remove(tmp.size()-1);
    }
    
    
}