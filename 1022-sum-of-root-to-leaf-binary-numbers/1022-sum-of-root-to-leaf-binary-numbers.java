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
    public int sumRootToLeaf(TreeNode root) {
		String str="";
		return helperr(root,str,0);
	
	}	
	    
	    public int helperr(TreeNode root,String str,int sum){
		if(root==null)
			return 0;
		str+= root.val;//Store each path in a String

		if(root.left==null&&root.right==null){
			sum += Integer.parseInt(str,2);//Get the decimal representation of path and add it to the sum
			str = "";
			return sum;
		}

		return helperr(root.left, str, sum)+helperr(root.right, str, sum);


	}
}