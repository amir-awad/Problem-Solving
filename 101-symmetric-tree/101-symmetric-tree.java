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
    public boolean isSymmetric(TreeNode root){
		
		return isSymmetricRec(root.left, root.right);
	}

	public boolean isSymmetricRec(TreeNode right,TreeNode left){
		if(right==null || left==null)
			return right==null&&left==null;
		if(left!=null&& right!=null&&left.val==right.val) return                                      true&&isSymmetricRec(right.left,left.right)&&isSymmetricRec(right.right, left.left);
		return false;
	}
}