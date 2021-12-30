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
    public int minDepth(TreeNode root) {
        return minDepthRec(root);
    }
    
    public int minDepthRec(TreeNode root){
        if(root==null)
            return 0;
        
        if(root.right==null&&root.left!=null) return 1 + minDepthRec(root.left); 
        if(root.left==null&&root.right!=null) return 1 + minDepthRec(root.right);
        
        return Math.min(minDepthRec(root.left),minDepthRec(root.right))+1;
    }
}