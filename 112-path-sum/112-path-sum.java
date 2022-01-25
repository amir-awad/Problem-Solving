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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        TreeNode curr = root;
        if(root==null) return false;
        return hasPathSum(curr,0,targetSum);
    }
    
    public boolean hasPathSum(TreeNode curr,int sum,int targetSum){
        if(curr==null)
            return false;
        sum+=curr.val;
        if(curr.left==null&&curr.right==null){
            if(sum==targetSum)
                return true;
        }
        
        return hasPathSum(curr.left, sum,targetSum)||hasPathSum(curr.right,sum,targetSum);
        
    
    }
}