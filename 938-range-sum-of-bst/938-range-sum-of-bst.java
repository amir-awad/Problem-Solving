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
    static int low;
    static int high;
    
    public int rangeSumBST(TreeNode root, int low, int high) {
        this.low = low;
        this.high = high;
        return getSum(root);
    }
    
    
    public int getSum(TreeNode root){
        if(root==null)
            return 0;
        //if in range, add to the sum.
        return (root.val>=low&&root.val<=high?root.val+getSum(root.left)+getSum(root.right):getSum(root.left)+getSum(root.right));
    }
}